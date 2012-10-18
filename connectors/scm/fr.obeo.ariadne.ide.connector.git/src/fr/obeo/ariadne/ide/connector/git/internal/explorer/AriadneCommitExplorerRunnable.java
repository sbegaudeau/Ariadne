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

import fr.obeo.ariadne.model.core.Person;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.ResourceChange;
import fr.obeo.ariadne.model.scm.ResourceChangeKind;
import fr.obeo.ariadne.model.scm.ScmFactory;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

import org.eclipse.egit.ui.internal.history.FileDiff;
import org.eclipse.jgit.diff.DiffEntry.ChangeType;
import org.eclipse.jgit.errors.CorruptObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.TreeFilter;

/**
 * This class will take a JGit commit and transform it into an Ariadne commit.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneCommitExplorerRunnable implements Callable<AriadneCommitExplorerEntry> {

	/**
	 * The EGit commit.
	 */
	private RevCommit gitCommit;

	/**
	 * The committer.
	 */
	private Person committer;

	/**
	 * The author.
	 */
	private Person author;

	/**
	 * The Git repository.
	 */
	private Repository gitRepository;

	/**
	 * The constructor.
	 * 
	 * @param repository
	 *            the EGit repository.
	 * @param revCommit
	 *            The EGit commit currently analyzed
	 * @param ariadneCommitter
	 *            The committer of the commit
	 * @param ariadneAuthor
	 *            The author of the commit
	 */
	public AriadneCommitExplorerRunnable(Repository repository, RevCommit revCommit, Person ariadneCommitter,
			Person ariadneAuthor) {
		this.gitRepository = repository;
		this.gitCommit = revCommit;
		this.committer = ariadneCommitter;
		this.author = ariadneAuthor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public AriadneCommitExplorerEntry call() {
		// commit's settings
		Commit ariadneCommit = ScmFactory.eINSTANCE.createCommit();
		ariadneCommit.setId(this.gitCommit.getId().getName());
		ariadneCommit.setCommitTime(this.gitCommit.getCommitTime());
		ariadneCommit.setName(CharMatcher.JAVA_ISO_CONTROL.removeFrom(this.gitCommit.getName()));
		ariadneCommit.setShortMessage(CharMatcher.JAVA_ISO_CONTROL.removeFrom(this.gitCommit
				.getShortMessage()));
		ariadneCommit
				.setFullMessage(CharMatcher.JAVA_ISO_CONTROL.removeFrom(this.gitCommit.getFullMessage()));
		ariadneCommit.setAuthor(this.author);
		ariadneCommit.setCommitter(this.committer);

		// compute file diffs
		Set<ResourceChange> filesChanged = this.computeFilesChanged(gitRepository, this.gitCommit);
		ariadneCommit.getResourceChanges().addAll(filesChanged);

		return new AriadneCommitExplorerEntry(gitCommit, ariadneCommit);
	}

	/**
	 * Computes the changes that have occurred during the given commit on the given Git repository.
	 * 
	 * @param repository
	 *            The Git repository
	 * @param eGitCommit
	 *            The Git commit
	 * @return The set of changes that has occurred during the commit
	 */
	private Set<ResourceChange> computeFilesChanged(Repository repository, RevCommit eGitCommit) {
		Set<ResourceChange> filesChanged = new LinkedHashSet<ResourceChange>();
		RevWalk revWalk = new RevWalk(repository);
		TreeWalk treewalk = new TreeWalk(revWalk.getObjectReader());
		treewalk.setRecursive(true);
		treewalk.setFilter(TreeFilter.ANY_DIFF);

		FileDiff[] diffs = new FileDiff[0];
		try {
			for (RevCommit parent : eGitCommit.getParents()) {
				revWalk.parseBody(parent);
			}
			diffs = FileDiff.compute(treewalk, eGitCommit);
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
}
