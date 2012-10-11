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
import fr.obeo.ariadne.ide.connector.core.internal.AriadneCorePlugin;
import fr.obeo.ariadne.ide.connector.ui.internal.AriadneUIPlugin;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.AriadneUIMessages;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.IAriadneUIConstants;
import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.Project;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

/**
 * This wizard page will use the organization wizard page in order to find the available Ariadne projects,
 * load them and display them for the user to select the one to use.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneExploreProjectsWizardProjectPage extends WizardPage {

	/**
	 * The organization wizard page.
	 */
	private AriadneExploreProjectsWizardOrganizationPage organizationWizardPage;

	/**
	 * The project where the information will be contributed.
	 */
	private Project project;

	/**
	 * The list of the Ariadne explorers to use.
	 */
	private List<AbstractAriadneExplorer> explorers = new ArrayList<>();

	/**
	 * The checkbox indicating if we should save all the data in the resource of the project.
	 */
	private Button button;

	/**
	 * The constructor.
	 * 
	 * @param wizardPage
	 *            The wizard page for the selection of the organization page. This wizard page will be used in
	 *            order to find the available projects in order to load and display them in the wizard
	 */
	public AriadneExploreProjectsWizardProjectPage(AriadneExploreProjectsWizardOrganizationPage wizardPage) {
		super(AriadneUIMessages.getString("AriadneExploreProjectsWizardProjectPage.Name")); //$NON-NLS-1$
		this.setDescription(AriadneUIMessages
				.getString("AriadneExploreProjectsWizardProjectPage.Description")); //$NON-NLS-1$
		this.setTitle(AriadneUIMessages.getString("AriadneExploreProjectsWizardProjectPage.Title")); //$NON-NLS-1$
		this.organizationWizardPage = wizardPage;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout());

		// Compute the project available
		List<IFile> selectedOrganizations = organizationWizardPage.getSelectedOrganizations();

		final List<Project> projects = new ArrayList<>();

		ResourceSet resourceSet = new ResourceSetImpl();
		for (IFile iFile : selectedOrganizations) {
			Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(iFile.getFullPath()
					.toString(), true), true);
			EList<EObject> contents = resource.getContents();
			for (EObject eObject : contents) {
				if (eObject instanceof Organization) {
					Organization organization = (Organization)eObject;
					EList<Category> categories = organization.getCategories();
					for (Category category : categories) {
						projects.addAll(category.getProjects());
					}
				}
			}
		}

		// Create the group for the selection of the projects
		Group projectSelectionGroup = new Group(container, SWT.NONE);
		projectSelectionGroup.setLayout(new GridLayout(1, false));
		projectSelectionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectSelectionGroup.setText(AriadneUIMessages
				.getString("AriadneExploreProjectsWizardProjectPage.Project")); //$NON-NLS-1$

		Label label = new Label(projectSelectionGroup, SWT.NONE);
		label.setText(AriadneUIMessages.getString("AriadneExploreProjectsWizardProjectPage.SelectProject")); //$NON-NLS-1$

		final org.eclipse.swt.widgets.List projectCombo = new org.eclipse.swt.widgets.List(
				projectSelectionGroup, SWT.READ_ONLY | SWT.SINGLE | SWT.BORDER);
		projectCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		for (Project aProject : projects) {
			projectCombo.add(EcoreUtil.getURI(aProject).toString());
		}

		projectCombo.addSelectionListener(new SelectionAdapter() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Update the project selected
				String[] selection = projectCombo.getSelection();
				if (selection.length == 1) {
					for (Project aProject : projects) {
						if (EcoreUtil.getURI(aProject).toString().equals(selection[0])) {
							project = aProject;
						}
					}
				}
				getWizard().getContainer().updateButtons();
			}
		});

		// Add a checkbox to indicate if we should save all the data in the model of the project.
		button = new Button(projectSelectionGroup, SWT.CHECK);
		button.setText(AriadneUIMessages
				.getString("AriadneExploreProjectsWizardProjectPage.SaveInProjectModel")); //$NON-NLS-1$

		// Create the group for the selection of the connector to use
		Group connectorSelectionGroup = new Group(container, SWT.NONE);
		connectorSelectionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectorSelectionGroup.setLayout(new GridLayout(2, true));
		connectorSelectionGroup.setText(AriadneUIMessages
				.getString("AriadneExploreProjectsWizardProjectPage.Connectors")); //$NON-NLS-1$

		label = new Label(connectorSelectionGroup, SWT.NONE);
		label.setText(AriadneUIMessages.getString("AriadneExploreProjectsWizardProjectPage.SelectConnectors")); //$NON-NLS-1$
		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		label.setLayoutData(gridData);

		final org.eclipse.swt.widgets.List connectorsCombo = new org.eclipse.swt.widgets.List(
				connectorSelectionGroup, SWT.READ_ONLY | SWT.MULTI | SWT.BORDER);
		connectorsCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		final List<AbstractAriadneExplorer> ariadneExplorers = AriadneCorePlugin.getDefault()
				.getServiceTrackerCustomizer().getAllAriadneExplorers();
		for (AbstractAriadneExplorer abstractAriadneExplorer : ariadneExplorers) {
			connectorsCombo.add(abstractAriadneExplorer.getName());
		}

		connectorsCombo.addSelectionListener(new SelectionAdapter() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				explorers.clear();
				// Update the explorers selected
				String[] selection = connectorsCombo.getSelection();
				for (String string : selection) {
					for (AbstractAriadneExplorer abstractAriadneExplorer : ariadneExplorers) {
						if (abstractAriadneExplorer.getName().equals(string)) {
							explorers.add(abstractAriadneExplorer);
						}
					}
				}
				getWizard().getContainer().updateButtons();
			}
		});

		this.setControl(container);
	}

	/**
	 * Returns the project where the information will be contributed.
	 * 
	 * @return the project where the information will be contributed.
	 */
	public Project getSelectedProject() {
		return this.project;
	}

	/**
	 * Returns the list of the Ariadne explorers to use.
	 * 
	 * @return The list of the Ariadne explorers to use.
	 */
	public List<AbstractAriadneExplorer> getSelectedAriadneExplorers() {
		return this.explorers;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#getImage()
	 */
	@Override
	public Image getImage() {
		return AriadneUIPlugin.getDefault().getImage(IAriadneUIConstants.ICONS.ARIADNE_EXPLORE_WIZARD);
	}

	/**
	 * Returns the selected Ariadne project for which the exploration will be realized, <code>null</code> if
	 * none has been selected.
	 * 
	 * @return the selected Ariadne project for which the exploration will be realized, <code>null</code> if
	 *         none has been selected.
	 */
	public Project getAriadneProject() {
		return this.project;
	}

	/**
	 * Returns the Ariadne explorers selected.
	 * 
	 * @return the Ariadne explorers selected.
	 */
	public List<AbstractAriadneExplorer> getAriadneExplorers() {
		return this.explorers;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		return this.getAriadneProject() != null && this.getAriadneExplorers().size() > 0;
	}

	/**
	 * Indicates if the data from the exploration should be saved in the same resource that contains the
	 * Ariadne project.
	 * 
	 * @return <code>true</code> if the data should be saved in the same resource, <code>false</code>
	 *         otherwise.
	 */
	public boolean shouldSaveInProjectResource() {
		return button.getSelection();
	}
}
