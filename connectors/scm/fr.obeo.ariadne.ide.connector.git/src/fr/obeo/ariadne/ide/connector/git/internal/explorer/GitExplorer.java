/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.ariadne.ide.connector.git.internal.explorer;

import com.google.common.base.CharMatcher;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.git.internal.utils.AriadneGitConnectorMessage;
import fr.obeo.ariadne.model.core.CoreFactory;
import fr.obeo.ariadne.model.core.Person;
import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.Project;
import fr.obeo.ariadne.model.scm.Branch;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.ResourceChange;
import fr.obeo.ariadne.model.scm.ResourceChangeKind;
import fr.obeo.ariadne.model.scm.ScmFactory;
import fr.obeo.ariadne.model.scm.Tag;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egit.core.GitProvider;
import org.eclipse.egit.core.project.GitProjectData;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.egit.ui.internal.history.FileDiff;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.diff.DiffEntry.ChangeType;
import org.eclipse.jgit.errors.CorruptObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.TreeFilter;
import org.eclipse.team.core.RepositoryProvider;

/**
 * The Ariadne explorer for Git repositories.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class GitExplorer extends AbstractAriadneExplorer {
	/**
	 * Cache used to retrieve the Ariadne commit mapping a JGit commit.
	 */
	private Map<RevCommit, Commit> commit2ariadneCommit = new HashMap<RevCommit, Commit>();

	/**
	 * The projects that should be explored.
	 */
	private List<IProject> projects;

	/**
	 * The files containing the Ariadne organizations that should be used for the exploration.
	 */
	private List<IFile> organizations;

	/**
	 * The URI of the Ariadne project.
	 */
	private URI ariadneProjectURI;

	/**
	 * Indicates if we should save the data computed in the resource of the project.
	 */
	private boolean shouldSaveInProjectResource;

	/**
	 * The resource set where all the data will be manipulated.
	 */
	private ResourceSet resourceSet = new ResourceSetImpl();

	/**
	 * The Ariadne project that will be analyzed.
	 */
	private Project ariadneProject;

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getName()
	 */
	@Override
	public String getName() {
		return AriadneGitConnectorMessage.getString("GitExplorer.Name"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getExplorerKind()
	 */
	@Override
	public String getExplorerKind() {
		return AbstractAriadneExplorer.SCM_EXPLORER_KIND;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#setProjects(java.util.List)
	 */
	@Override
	public void setProjects(List<IProject> projectsToExplore) {
		this.projects = projectsToExplore;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#setOrganizations(java.util.List)
	 */
	@Override
	public void setOrganizations(List<IFile> ariadneOrganizations) {
		this.organizations = ariadneOrganizations;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#setAriadneProject(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public void setAriadneProject(URI uri) {
		this.ariadneProjectURI = uri;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#saveInProjectResource(boolean)
	 */
	@Override
	public void saveInProjectResource(boolean shouldSave) {
		this.shouldSaveInProjectResource = shouldSave;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		this.initialize(monitor);
		for (IProject project : this.projects) {
			// Only analyze if the project is shared on Git
			if (RepositoryProvider.isShared(project)) {
				RepositoryProvider provider = RepositoryProvider.getProvider(project);
				if (GitProvider.ID.equals(provider.getID()) && provider instanceof GitProvider) {
					// If the project is not mapped to a component, create it
					this.doExplore(project, (GitProvider)provider, monitor);
				}
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * Initialize the exploration by loading all the data that will be manipulated in the resource set.
	 * 
	 * @param monitor
	 *            The progress monitor
	 * @return A status indicating any problem that could have occurred during the initialization
	 */
	public IStatus initialize(IProgressMonitor monitor) {
		// Load the organization
		for (IFile organizationFile : this.organizations) {
			URI organizationFileURI = URI.createPlatformResourceURI(
					organizationFile.getFullPath().toString(), true);
			this.resourceSet.getResource(organizationFileURI, true);
		}

		// Find the project to which the data will be contributed
		EObject eObject = this.resourceSet.getEObject(ariadneProjectURI, true);
		if (eObject instanceof Project) {
			this.ariadneProject = (Project)eObject;
		}

		return Status.OK_STATUS;
	}

	/**
	 * Launches the exploration of the JGit/EGit data from the given project and its Git repository provider.
	 * 
	 * @param project
	 *            The project to explore
	 * @param provider
	 *            The Git repository provider of the project
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne repository representing the Git repository used on the given project,
	 *         <code>null</code> otherwise.
	 */
	public fr.obeo.ariadne.model.scm.Repository doExplore(IProject project, GitProvider provider,
			IProgressMonitor monitor) {
		GitProjectData gitProjectData = provider.getData();
		RepositoryMapping repositoryMapping = gitProjectData.getRepositoryMapping(project);
		if (repositoryMapping != null) {
			Repository repository = repositoryMapping.getRepository();
			if (repository != null) {
				// Create or recreate the Ariadne SCM repository matching this Git repository
				fr.obeo.ariadne.model.scm.Repository ariadneRepository = this
						.getOrCreateRepository(repository);

				this.computeCommits(repository, ariadneRepository);
				this.computeParents(repository, ariadneRepository);
				this.computeReferences(repository, ariadneRepository);

				// Save the data computed
				Resource resource = ariadneRepository.eResource();
				try {
					HashMap<String, String> options = new HashMap<String, String>();
					resource.save(options);
				} catch (IOException e) {
					e.printStackTrace();
				}

				return ariadneRepository;
			}
		}
		return null;
	}

	/**
	 * Returns the Ariadne repository that we will use to map the Git repository analyzed.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @return The Ariadne repository that we will use to map the Git repository analyzed.
	 */
	private fr.obeo.ariadne.model.scm.Repository getOrCreateRepository(Repository gitRepository) {
		fr.obeo.ariadne.model.scm.Repository ariadneRepository = null;
		String repositoryName = gitRepository.getDirectory().getParentFile().getName();

		Category category = this.ariadneProject.getCategory();
		Organization organization = category.getOrganization();

		if (organization != null) {
			List<fr.obeo.ariadne.model.scm.Repository> repositories = organization.getRepositories();
			for (fr.obeo.ariadne.model.scm.Repository aRepository : repositories) {
				if (repositoryName.equals(aRepository.getName())) {
					ariadneRepository = aRepository;
				}
			}
		}

		if (ariadneRepository == null) {
			ariadneRepository = ScmFactory.eINSTANCE.createRepository();
			ariadneRepository.setName(repositoryName);
			if (organization != null) {
				if (!this.shouldSaveInProjectResource) {
					final String fileExtension = "ariadnescm"; //$NON-NLS-1$
					URI uri = EcoreUtil.getURI(this.ariadneProject).trimFragment().trimFileExtension()
							.appendFileExtension(fileExtension);
					Resource resource = this.resourceSet.createResource(uri);
					resource.getContents().add(ariadneRepository);
				}

				organization.getRepositories().add(ariadneRepository);
				this.ariadneProject.getRepositories().add(ariadneRepository);
			}
		}
		return ariadneRepository;
	}

	/**
	 * Computes all the commits that exists in the given Git repository and map them as Ariadne concepts in
	 * the given Ariadne repository.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @param ariadneRepository
	 *            The Ariadne repository
	 */
	private void computeCommits(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository) {
		Git git = new Git(gitRepository);
		LogCommand log = git.log();
		try {
			Iterable<RevCommit> logs = log.call();
			Iterator<RevCommit> logIterator = logs.iterator();
			while (logIterator.hasNext()) {
				RevCommit revCommit = logIterator.next();

				// commit's settings
				Commit ariadneCommit = ScmFactory.eINSTANCE.createCommit();
				ariadneCommit.setId(revCommit.getId().getName());
				ariadneCommit.setCommitTime(revCommit.getCommitTime());
				ariadneCommit.setName(CharMatcher.JAVA_ISO_CONTROL.removeFrom(revCommit.getName()));
				ariadneCommit.setShortMessage(CharMatcher.JAVA_ISO_CONTROL.removeFrom(revCommit
						.getShortMessage()));
				ariadneCommit.setFullMessage(CharMatcher.JAVA_ISO_CONTROL.removeFrom(revCommit
						.getFullMessage()));

				// person's settings
				Person committer = this.getOrCreatePerson(ariadneRepository, revCommit.getCommitterIdent());
				if (committer != null) {
					ariadneCommit.setCommitter(committer);
				}

				Person author = this.getOrCreatePerson(ariadneRepository, revCommit.getAuthorIdent());
				if (author != null) {
					ariadneCommit.setAuthor(author);
				}

				// compute file diffs
				Set<ResourceChange> filesChanged = this.computeFilesChanged(gitRepository, revCommit);
				ariadneCommit.getResourceChanges().addAll(filesChanged);

				// adding the commit to the repository
				ariadneRepository.getCommits().add(ariadneCommit);

				// keep in the cache
				this.commit2ariadneCommit.put(revCommit, ariadneCommit);
			}
		} catch (NoHeadException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Computes the changes that have occurred during the given commit on the given Git repository.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @param revCommit
	 *            The Git commit
	 * @return The set of changes that has occurred during the commit
	 */
	private Set<ResourceChange> computeFilesChanged(Repository gitRepository, RevCommit revCommit) {
		Set<ResourceChange> filesChanged = new LinkedHashSet<ResourceChange>();
		RevWalk revWalk = new RevWalk(gitRepository);
		TreeWalk treewalk = new TreeWalk(revWalk.getObjectReader());
		treewalk.setRecursive(true);
		treewalk.setFilter(TreeFilter.ANY_DIFF);

		FileDiff[] diffs = new FileDiff[0];
		try {
			for (RevCommit parent : revCommit.getParents()) {
				revWalk.parseBody(parent);
			}
			diffs = FileDiff.compute(treewalk, revCommit);
		} catch (MissingObjectException e) {
			e.printStackTrace();
		} catch (IncorrectObjectTypeException e) {
			e.printStackTrace();
		} catch (CorruptObjectException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			revWalk.release();
			treewalk.release();
		}

		for (FileDiff fileDiff : diffs) {
			ResourceChange resourceChange = ScmFactory.eINSTANCE.createResourceChange();
			resourceChange.setPath(fileDiff.getLabel(fileDiff));

			ChangeType changeType = fileDiff.getChange();
			switch (changeType) {
				case ADD:
					resourceChange.setResourceChangeKind(ResourceChangeKind.ADDED);
					break;
				case COPY:
					resourceChange.setResourceChangeKind(ResourceChangeKind.COPIED);
					break;
				case DELETE:
					resourceChange.setResourceChangeKind(ResourceChangeKind.DELETED);
					break;
				case MODIFY:
					resourceChange.setResourceChangeKind(ResourceChangeKind.MODIFIED);
					break;
				case RENAME:
					resourceChange.setResourceChangeKind(ResourceChangeKind.RENAMED);
					break;
				default:
					resourceChange.setResourceChangeKind(ResourceChangeKind.ADDED);
					break;
			}

			filesChanged.add(resourceChange);
		}

		return filesChanged;
	}

	/**
	 * Gets or creates the Ariadne Person matching the given Git PersonIdent obtained from the Git repository.
	 * 
	 * @param ariadneRepository
	 *            The Ariadne repository.
	 * @param committerIdent
	 *            The identity of the committer
	 * @return The Ariadne person created or null if none could be created
	 */
	private Person getOrCreatePerson(fr.obeo.ariadne.model.scm.Repository ariadneRepository,
			PersonIdent committerIdent) {
		// Look for an existing person in the whole resource set
		List<Resource> resources = this.resourceSet.getResources();
		for (Resource resource : resources) {
			TreeIterator<EObject> allContents = resource.getAllContents();
			while (allContents.hasNext()) {
				EObject eObject = allContents.next();
				if (eObject instanceof Person) {
					Person aPerson = (Person)eObject;
					if (aPerson.getEmail().equals(committerIdent.getEmailAddress())
							&& aPerson.getName().equals(committerIdent.getName())) {
						return aPerson;
					}
				}
			}
		}

		// If we haven't find anyone matching the name and email of our choice, create it in the organization
		// of the repository
		Person person = null;
		EObject eContainer = ariadneRepository.eContainer();
		if (eContainer instanceof Project) {
			Project project = (Project)eContainer;
			Category category = project.getCategory();
			if (category != null) {
				Organization organization = category.getOrganization();
				if (organization != null) {
					person = CoreFactory.eINSTANCE.createPerson();
					person.setName(CharMatcher.JAVA_ISO_CONTROL.removeFrom(committerIdent.getName()));
					person.setEmail(CharMatcher.JAVA_ISO_CONTROL.removeFrom(committerIdent.getEmailAddress()));
					organization.getPersons().add(person);
				}
			}
		}
		return person;
	}

	/**
	 * Computes the structure of the repository by linking commits to their parents.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @param ariadneRepository
	 *            The Ariadne repository
	 */
	private void computeParents(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository) {
		Git git = new Git(gitRepository);
		LogCommand log = git.log();
		try {
			Iterable<RevCommit> logs = log.call();
			Iterator<RevCommit> logIterator = logs.iterator();
			while (logIterator.hasNext()) {
				RevCommit revCommit = logIterator.next();
				Commit ariadneCommit = this.commit2ariadneCommit.get(revCommit);

				RevCommit[] parents = revCommit.getParents();
				for (RevCommit parentCommit : parents) {
					Commit parentAriadneCommit = this.commit2ariadneCommit.get(parentCommit);
					ariadneCommit.getParents().add(parentAriadneCommit);
				}
			}
		} catch (NoHeadException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Computes the references, branches and tags of the Git repository and map them in the Ariadne
	 * repository.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @param ariadneRepository
	 *            The Ariadne repository
	 */
	private void computeReferences(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository) {
		Map<String, Ref> allRefs = gitRepository.getAllRefs();
		for (Entry<String, Ref> entry : allRefs.entrySet()) {
			String key = entry.getKey();
			Ref reference = entry.getValue();

			ObjectId linkedObject = null;
			if (reference.isPeeled()) {
				linkedObject = this.getLinkedObject(reference);
			} else {
				if (reference.isSymbolic()) {
					linkedObject = this.getLinkedObject(reference.getLeaf());
				} else {
					linkedObject = this.getLinkedObject(reference);
				}
			}

			RevCommit commit = null;

			Set<RevCommit> keySet = this.commit2ariadneCommit.keySet();
			for (RevCommit revCommit : keySet) {
				if (revCommit.getId().equals(linkedObject)) {
					commit = revCommit;
				}
			}

			if (commit != null) {
				if (gitRepository.getTags().containsKey(key)) {
					// tag
					Tag tag = ScmFactory.eINSTANCE.createTag();
					tag.setCommit(this.commit2ariadneCommit.get(commit));
					tag.setName(reference.getName());
					ariadneRepository.getTags().add(tag);
				} else {
					// branch
					Branch branch = ScmFactory.eINSTANCE.createBranch();
					branch.setCommit(this.commit2ariadneCommit.get(commit));
					branch.setName(reference.getName());
					ariadneRepository.getBranches().add(branch);
				}
			} else {
				// A branch linked to something else than a commit...
			}
		}
	}

	/**
	 * Returns the referenced object from the given reference.
	 * 
	 * @param reference
	 *            The reference.
	 * @return The referenced object
	 */
	private ObjectId getLinkedObject(Ref reference) {
		ObjectId linkedObject = null;
		ObjectId peeledObjectId = reference.getPeeledObjectId();
		if (peeledObjectId != null) {
			linkedObject = peeledObjectId;
		} else {
			ObjectId objectId = reference.getObjectId();
			if (objectId != null) {
				linkedObject = objectId;
			}
		}
		return linkedObject;
	}
}
