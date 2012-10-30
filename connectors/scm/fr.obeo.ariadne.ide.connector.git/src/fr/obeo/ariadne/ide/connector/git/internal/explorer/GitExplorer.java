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
import fr.obeo.ariadne.model.scm.Branch;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.ScmFactory;
import fr.obeo.ariadne.model.scm.Tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egit.core.GitProvider;
import org.eclipse.egit.core.project.GitProjectData;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.team.core.RepositoryProvider;

/**
 * The Ariadne explorer for Git repositories.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class GitExplorer extends AbstractAriadneExplorer {
	/**
	 * The size of the cache of the commits.
	 */
	private static final int CACHE_SIZE = 5000;

	/**
	 * The list of the repositories previsouly explored during the analysis.
	 */
	private List<String> repositoryPreviouslyExplored = new ArrayList<>();

	/**
	 * Cache used to retrieve the Ariadne commit mapping a JGit commit. This cache is initialized with a size
	 * of 1000 since we know that we will use it a lot.
	 */
	private Map<RevCommit, Commit> commit2ariadneCommit = new HashMap<>(CACHE_SIZE);

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
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		// Clear the caches
		this.repositoryPreviouslyExplored.clear();
		this.commit2ariadneCommit.clear();

		for (IProject project : this.projects) {
			// Only analyze if the project is shared on Git
			if (RepositoryProvider.isShared(project)) {
				RepositoryProvider provider = RepositoryProvider.getProvider(project);
				if (GitProvider.ID.equals(provider.getID()) && provider instanceof GitProvider) {
					if (this.shouldExplore(project, (GitProvider)provider)) {
						// If the project is not mapped to a component, create it
						fr.obeo.ariadne.model.scm.Repository ariadneRepository = this.doExplore(project,
								(GitProvider)provider, monitor);

						// Save the data computed
						Resource resource = ariadneRepository.eResource();
						try {
							HashMap<String, String> options = new HashMap<String, String>();
							resource.save(options);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						// Log error ?
					}
				}
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * Indicates if we should analyze the Git repository of the given project.
	 * 
	 * @param project
	 *            The project to analyze
	 * @param provider
	 *            The Git repository provider
	 * @return <code>true</code> if we should explore the repository linked to the given project, false
	 *         otherwise.
	 */
	private boolean shouldExplore(IProject project, GitProvider provider) {
		String repositoryPath = null;

		GitProjectData gitProjectData = provider.getData();
		RepositoryMapping repositoryMapping = gitProjectData.getRepositoryMapping(project);
		if (repositoryMapping != null) {
			Repository repository = repositoryMapping.getRepository();
			if (repository != null) {
				repositoryPath = repository.getDirectory().getAbsolutePath();
			}
		}

		return repositoryPath != null && !this.repositoryPreviouslyExplored.contains(repositoryPath);
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
				fr.obeo.ariadne.model.scm.Repository ariadneRepository = this.getOrCreateRepository(
						repository, monitor);

				this.computeCommits(repository, ariadneRepository, monitor);
				this.computeParents(repository, ariadneRepository, monitor);
				this.computeReferences(repository, ariadneRepository, monitor);

				// Add the repository as explored
				this.repositoryPreviouslyExplored.add(repository.getDirectory().getAbsolutePath());

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
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne repository that we will use to map the Git repository analyzed.
	 */
	private fr.obeo.ariadne.model.scm.Repository getOrCreateRepository(Repository gitRepository,
			IProgressMonitor monitor) {
		monitor.subTask(AriadneGitConnectorMessage.getString("GitExplorer.InitializingRepository")); //$NON-NLS-1$
		monitor.worked(1);

		fr.obeo.ariadne.model.scm.Repository ariadneRepository = null;
		String repositoryName = gitRepository.getDirectory().getParentFile().getName();

		Category category = this.ariadneProject.getCategory();
		Organization organization = category.getOrganization();

		if (organization != null) {
			List<fr.obeo.ariadne.model.scm.Repository> repositories = organization.getRepositories();
			for (fr.obeo.ariadne.model.scm.Repository aRepository : repositories) {
				if (repositoryName.equals(aRepository.getName())) {
					ariadneRepository = aRepository;

					// Clear everything
					List<Branch> branches = aRepository.getBranches();
					for (Branch branch : branches) {
						EcoreUtil.remove(branch);
					}
					List<Commit> commits = aRepository.getCommits();
					for (Commit commit : commits) {
						EcoreUtil.remove(commit);
					}

					List<Tag> tags = aRepository.getTags();
					for (Tag tag : tags) {
						EcoreUtil.remove(tag);
					}
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
	 * @param monitor
	 *            The progress monitor
	 */
	private void computeCommits(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository, IProgressMonitor monitor) {
		int maxThreads = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(maxThreads);

		long start = System.currentTimeMillis();

		List<Callable<AriadneCommitExplorerEntry>> callables = new ArrayList<>();

		Git git = new Git(gitRepository);
		LogCommand log = git.log();
		try {
			Iterable<RevCommit> logs = log.call();
			Iterator<RevCommit> logIterator = logs.iterator();
			monitor.subTask(AriadneGitConnectorMessage.getString("GitExplorer.ExploringCommit")); //$NON-NLS-1$
			while (logIterator.hasNext()) {
				monitor.worked(1);

				RevCommit revCommit = logIterator.next();
				// person's settings
				Person committer = this.getOrCreatePerson(ariadneRepository, revCommit.getCommitterIdent());
				Person author = this.getOrCreatePerson(ariadneRepository, revCommit.getAuthorIdent());

				Callable<AriadneCommitExplorerEntry> callable = new AriadneCommitExplorerRunnable(
						gitRepository, revCommit, committer, author);
				callables.add(callable);
			}
		} catch (NoHeadException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}

		try {
			List<Future<AriadneCommitExplorerEntry>> results = executorService.invokeAll(callables);
			executorService.shutdown();

			for (Future<AriadneCommitExplorerEntry> commit : results) {
				try {
					AriadneCommitExplorerEntry ariadneCommitExplorerEntry = commit.get();
					this.commit2ariadneCommit.put(ariadneCommitExplorerEntry.getGitCommit(),
							ariadneCommitExplorerEntry.getAriadneCommit());
					ariadneRepository.getCommits().add(ariadneCommitExplorerEntry.getAriadneCommit());
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}

			long end = System.currentTimeMillis();

			System.out.println("Commits: " + ariadneRepository.getCommits().size() + " Time: "
					+ (end - start) + "ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		Person person = null;
		// Look for an existing person in the whole resource set
		List<Resource> resources = this.resourceSet.getResources();
		for (Resource resource : resources) {
			TreeIterator<EObject> allContents = resource.getAllContents();
			while (allContents.hasNext()) {
				EObject eObject = allContents.next();
				if (eObject instanceof Organization) {
					Organization organization = (Organization)eObject;
					List<Person> persons = organization.getPersons();
					for (Person aPerson : persons) {
						if (aPerson.getName().equals(committerIdent.getName())) {
							person = aPerson;
						}
					}
				} else if (eObject instanceof Person) {
					Person aPerson = (Person)eObject;
					if (aPerson.getName().equals(committerIdent.getName())) {
						person = aPerson;
					}
				}
				if (person != null) {
					return person;
				}
			}
		}

		// If we haven't find anyone matching the name and email of our choice, create it in the organization
		// of the repository
		EObject eContainer = ariadneRepository.eContainer();
		if (eContainer instanceof Organization) {
			Organization organization = (Organization)eContainer;
			person = CoreFactory.eINSTANCE.createPerson();
			person.setName(CharMatcher.JAVA_ISO_CONTROL.removeFrom(committerIdent.getName()));
			person.setEmail(CharMatcher.JAVA_ISO_CONTROL.removeFrom(committerIdent.getEmailAddress()));
			organization.getPersons().add(person);
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
	 * @param monitor
	 *            The progress monitor
	 */
	private void computeParents(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository, IProgressMonitor monitor) {
		Set<Entry<RevCommit, Commit>> entrySet = this.commit2ariadneCommit.entrySet();
		for (Entry<RevCommit, Commit> entry : entrySet) {
			RevCommit revCommit = entry.getKey();
			Commit ariadneCommit = entry.getValue();

			monitor.subTask(AriadneGitConnectorMessage.getString(
					"GitExplorer.ComputingCommitHierarchy", ariadneCommit.getShortMessage())); //$NON-NLS-1$
			monitor.worked(1);

			RevCommit[] parents = revCommit.getParents();
			for (RevCommit revCommitParent : parents) {
				Commit ariadneCommitParent = this.commit2ariadneCommit.get(revCommitParent);
				ariadneCommit.getParents().add(ariadneCommitParent);
			}
		}

		// Memory management
		this.commit2ariadneCommit.clear();
		this.commit2ariadneCommit = new HashMap<>();
	}

	/**
	 * Computes the references, branches and tags of the Git repository and map them in the Ariadne
	 * repository.
	 * 
	 * @param gitRepository
	 *            The Git repository
	 * @param ariadneRepository
	 *            The Ariadne repository
	 * @param monitor
	 *            The progress monitor
	 */
	private void computeReferences(Repository gitRepository,
			fr.obeo.ariadne.model.scm.Repository ariadneRepository, IProgressMonitor monitor) {
		monitor.subTask(AriadneGitConnectorMessage.getString("GitExplorer.ComputingReferences")); //$NON-NLS-1$

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
			monitor.worked(1);
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
