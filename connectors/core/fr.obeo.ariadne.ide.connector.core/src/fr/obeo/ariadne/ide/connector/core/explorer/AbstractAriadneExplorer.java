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

import fr.obeo.ariadne.model.organization.Project;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

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
	 * The projects that should be explored.
	 */
	protected List<IProject> projects;

	/**
	 * The files containing the Ariadne organizations that should be used for the exploration.
	 */
	protected List<IFile> organizations;

	/**
	 * The URI of the Ariadne project.
	 */
	protected URI ariadneProjectURI;

	/**
	 * Indicates if we should save the data computed in the resource of the project.
	 */
	protected boolean shouldSaveInProjectResource;

	/**
	 * The resource set where all the data will be manipulated.
	 */
	protected ResourceSet resourceSet = new ResourceSetImpl();

	/**
	 * The Ariadne project that will be analyzed.
	 */
	protected Project ariadneProject;

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
	 * @param projectsToExplore
	 *            The list of the IProjects to analyze
	 */
	public void setProjects(List<IProject> projectsToExplore) {
		this.projects = projectsToExplore;
	}

	/**
	 * Sets the list of the IFile containing the organization data that should be used for the resolution of
	 * the links.
	 * 
	 * @param ariadneOrganizations
	 *            The organizations to use
	 */
	public void setOrganizations(List<IFile> ariadneOrganizations) {
		this.organizations = ariadneOrganizations;
	}

	/**
	 * Sets the URI of the Ariadne project that will receive the data.
	 * 
	 * @param uri
	 *            The Ariadne project for which we will computed the data
	 */
	public void setAriadneProject(URI uri) {
		this.ariadneProjectURI = uri;
	}

	/**
	 * Indicates if we should save the result of the analysis in the resource containing the Ariadne project.
	 * 
	 * @param shouldSave
	 *            <code>true</code> if we should save the data in the resource of the Ariadne project,
	 *            <code>false</code> otherwise.
	 */
	public void saveInProjectResource(boolean shouldSave) {
		this.shouldSaveInProjectResource = shouldSave;
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
	 * Launch the exploration of the IProjects. This operation is called after initialize.
	 * 
	 * @param monitor
	 *            The progress monitor
	 * @return A status indicating how the exploration went
	 */
	public abstract IStatus explore(IProgressMonitor monitor);
}
