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
package fr.obeo.ariadne.ide.connector.ui.internal.actions.explore;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.AriadneUIMessages;
import fr.obeo.ariadne.model.organization.Project;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;

/**
 * This wizard will be used to launch the exploration of the projects by the Ariadne connectors.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneExploreProjectsWizard extends Wizard {

	/**
	 * The first page of the wizard will be used to select the projects to explore.
	 */
	private AriadneExploreProjectsWizardSelectionPage selectionWizardPage;

	/**
	 * The second page of the wizard will be used to select the organizations to use for the exploration.
	 */
	private AriadneExploreProjectsWizardOrganizationPage organizationWizardPage;

	/**
	 * The third page of the wizard will be used to select the project in which the data will be added.
	 */
	private AriadneExploreProjectsWizardProjectPage projectWizardPage;

	/**
	 * The constructor.
	 */
	public AriadneExploreProjectsWizard() {
		this.setWindowTitle(AriadneUIMessages.getString("AriadneExploreProjectsWizard.Title")); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.selectionWizardPage = new AriadneExploreProjectsWizardSelectionPage();
		this.organizationWizardPage = new AriadneExploreProjectsWizardOrganizationPage();
		this.projectWizardPage = new AriadneExploreProjectsWizardProjectPage(this.organizationWizardPage);

		this.addPage(selectionWizardPage);
		this.addPage(organizationWizardPage);
		this.addPage(projectWizardPage);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
			 */
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				List<IProject> projectsToExplore = selectionWizardPage.getProjectsToExplore();
				List<IFile> organizations = organizationWizardPage.getSelectedOrganizations();
				Project ariadneProject = projectWizardPage.getAriadneProject();
				boolean shouldSaveInProjectResource = projectWizardPage.shouldSaveInProjectResource();

				List<AbstractAriadneExplorer> ariadneExplorers = projectWizardPage.getAriadneExplorers();
				for (AbstractAriadneExplorer abstractAriadneExplorer : ariadneExplorers) {
					abstractAriadneExplorer.setProjects(projectsToExplore);
					abstractAriadneExplorer.setOrganizations(organizations);
					abstractAriadneExplorer.setAriadneProject(EcoreUtil.getURI(ariadneProject));
					abstractAriadneExplorer.saveInProjectResource(shouldSaveInProjectResource);
					abstractAriadneExplorer.explore(monitor);
				}
			}
		};

		try {
			this.getContainer().run(false, true, runnable);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#needsProgressMonitor()
	 */
	@Override
	public boolean needsProgressMonitor() {
		return true;
	}
}
