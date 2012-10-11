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
package fr.obeo.ariadne.ide.connector.core.explorer;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

/**
 * Superclass of all Ariadne explorers.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public abstract class AbstractAriadneExplorer {
	/**
	 * The constant representing "core" explorers.
	 */
	public static final String CORE_EXPLORER_KIND = "core"; //$NON-NLS-1$

	/**
	 * The constant representing "core" explorers.
	 */
	public static final String CODE_EXPLORER_KIND = "code"; //$NON-NLS-1$

	/**
	 * The constant representing "scm" explorers.
	 */
	public static final String SCM_EXPLORER_KIND = "scm"; //$NON-NLS-1$

	/**
	 * The constants representing "continuous integration" explorers.
	 */
	public static final String CONTINUOUS_INTEGRATION_EXPLORER_KIND = "ci"; //$NON-NLS-1$

	/**
	 * The constant representing "tasks" explorers.
	 */
	public static final String TASKS_EXPLORER_KIND = "tasks"; //$NON-NLS-1$

	/**
	 * The constant representing "other" explorers.
	 */
	public static final String OTHER_EXPLORER_KIND = "other"; //$NON-NLS-1$

	/**
	 * Returns the name of the explorer.
	 * 
	 * @return The name of the explorer.
	 */
	public abstract String getName();

	/**
	 * Returns a string describing the kind of explorer. Preferably, one of the available constants defined in
	 * {@link AbstractAriadneExplorer}. The kind of the explorer will be used to define the order of execution
	 * of the explorers if multiple explorers have been selected by the user.
	 * <p>
	 * The order of execution is:
	 * <ul>
	 * <li>CORE</li>
	 * <li>CODE</li>
	 * <li>SCM</li>
	 * <li>TASKS</li>
	 * <li>CONTINUOUS INTEGRATION</li>
	 * <li>OTHER</li>
	 * </ul>
	 * </p>
	 * 
	 * @return The kind of explorer.
	 */
	public abstract String getExplorerKind();

	/**
	 * Sets the list of the IProjects that should be analyzed by the explorer.
	 * 
	 * @param projects
	 *            The list of the IProjects to analyze
	 */
	public abstract void setProjects(List<IProject> projects);

	/**
	 * Sets the list of the IFile containing the organization data that should be used for the resolution of
	 * the links.
	 * 
	 * @param organizations
	 *            The organizations to use
	 */
	public abstract void setOrganizations(List<IFile> organizations);

	/**
	 * Sets the URI of the Ariadne project that will receive the data.
	 * 
	 * @param uri
	 *            The Ariadne project for which we will computed the data
	 */
	public abstract void setAriadneProject(URI uri);

	/**
	 * Indicates if we should save the result of the analysis in the resource containing the Ariadne project.
	 * 
	 * @param shouldSave
	 *            <code>true</code> if we should save the data in the resource of the Ariadne project,
	 *            <code>false</code> otherwise.
	 */
	public abstract void saveInProjectResource(boolean shouldSave);

	/**
	 * Launch the exploration of the IProjects.
	 * 
	 * @param monitor
	 *            The progress monitor
	 * @return A status indicating how the exploration went
	 */
	public abstract IStatus explore(IProgressMonitor monitor);
}
