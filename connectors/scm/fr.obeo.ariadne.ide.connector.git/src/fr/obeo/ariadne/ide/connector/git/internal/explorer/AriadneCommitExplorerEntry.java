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

import fr.obeo.ariadne.model.scm.Commit;

import org.eclipse.jgit.revwalk.RevCommit;

/**
 * This entry is used to populate the cache after the analysis of each commit by the Git explorer.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneCommitExplorerEntry {
	/**
	 * The EGit commit.
	 */
	private RevCommit gitCommit;

	/**
	 * The Ariadne commit.
	 */
	private Commit ariadneCommit;

	/**
	 * The constructor.
	 * 
	 * @param gCommit
	 *            The EGit commit
	 * @param aCommit
	 *            The Ariadne commit representing the EGit commit
	 */
	public AriadneCommitExplorerEntry(RevCommit gCommit, Commit aCommit) {
		this.gitCommit = gCommit;
		this.ariadneCommit = aCommit;
	}

	/**
	 * Returns the Ariadne commit.
	 * 
	 * @return The Ariadne commit.
	 */
	public Commit getAriadneCommit() {
		return ariadneCommit;
	}

	/**
	 * Returns the EGit commit.
	 * 
	 * @return The EGit commit.
	 */
	public RevCommit getGitCommit() {
		return gitCommit;
	}

}
