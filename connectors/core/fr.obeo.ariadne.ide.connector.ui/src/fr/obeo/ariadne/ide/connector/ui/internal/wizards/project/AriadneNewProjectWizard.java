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
package fr.obeo.ariadne.ide.connector.ui.internal.wizards.project;

import fr.obeo.ariadne.ide.connector.core.internal.utils.IAriadneConstants;
import fr.obeo.ariadne.ide.connector.ui.internal.AriadneUIPlugin;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.AriadneUIMessages;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * Ths wizard responsible for the creation of a new Ariadne project.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	/**
	 * The new project page.
	 */
	private AriadneNewProjectWizardPage newProjectPage;

	/**
	 * The configuration element used to determine the default perspective to open.
	 */
	private IConfigurationElement configurationElement;

	/**
	 * The current selection before the opening of the wizard.
	 */
	private IStructuredSelection selection;

	/**
	 * The currently used workbench.
	 */
	private IWorkbench workbench;

	/**
	 * The constructor.
	 */
	public AriadneNewProjectWizard() {
		super();
		this.setWindowTitle(AriadneUIMessages.getString("AriadneNewProjectWizard.Title")); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench iWorkbench, IStructuredSelection iStructuredSelection) {
		this.selection = iStructuredSelection;
		this.workbench = iWorkbench;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.newProjectPage = new AriadneNewProjectWizardPage(this.selection);
		this.addPage(this.newProjectPage);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
	 *      java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		this.configurationElement = config;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			IWizardContainer iWizardContainer = this.getContainer();

			IRunnableWithProgress projectCreation = new IRunnableWithProgress() {
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
				 */
				@Override
				public void run(IProgressMonitor monitor) {
					createProject(monitor);
				}
			};
			iWizardContainer.run(false, false, projectCreation);

			// Update the perspective.
			BasicNewProjectResourceWizard.updatePerspective(this.configurationElement);
			return true;
		} catch (InvocationTargetException e) {
			AriadneUIPlugin.log(e, true);
		} catch (InterruptedException e) {
			AriadneUIPlugin.log(e, true);
		}
		return false;
	}

	/**
	 * Creates the project from the new ariadne project wizard page.
	 * 
	 * @param monitor
	 *            The progress monitor
	 */
	private void createProject(IProgressMonitor monitor) {
		String projectName = this.newProjectPage.getProjectName();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()) {
			try {
				// Create the project
				project.create(monitor);
				project.open(monitor);

				// Set up the nature of the project
				IProjectDescription description = project.getDescription();
				String[] natureIds = description.getNatureIds();
				String[] newNatureIds = new String[natureIds.length + 1];
				System.arraycopy(natureIds, 0, newNatureIds, 0, natureIds.length);
				newNatureIds[natureIds.length] = IAriadneConstants.NATURE_ID;
				description.setNatureIds(newNatureIds);
				project.setDescription(description, monitor);

				// Set up the working set of the project
				IWorkingSet[] workingSets = newProjectPage.getSelectedWorkingSets();
				this.workbench.getWorkingSetManager().addToWorkingSets(project, workingSets);

				// Refresh the project
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				AriadneUIPlugin.log(e, true);
			}
		}
	}

}
