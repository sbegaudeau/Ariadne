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

import fr.obeo.ariadne.ide.connector.ui.internal.AriadneUIPlugin;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.AriadneUIMessages;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.IAriadneUIConstants;
import fr.obeo.ariadne.model.organization.presentation.OrganizationModelWizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * This wizard page will let the user select the organization files to use for the exploration.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneExploreProjectsWizardOrganizationPage extends WizardPage {

	/**
	 * This treeviewer will display the content of the workspace.
	 */
	private TreeViewer treeViewer;

	/**
	 * The current selection of the tree viewer. This selection should only contains IFile with the
	 * "ariadneorganization" extension.
	 */
	private IStructuredSelection structuredSelection;

	/**
	 * The constructor.
	 */
	public AriadneExploreProjectsWizardOrganizationPage() {
		super(AriadneUIMessages.getString("AriadneExploreProjectsWizardOrganizationPage.Name")); //$NON-NLS-1$
		this.setDescription(AriadneUIMessages
				.getString("AriadneExploreProjectsWizardOrganizationPage.Description")); //$NON-NLS-1$
		this.setTitle(AriadneUIMessages.getString("AriadneExploreProjectsWizardOrganizationPage.Title")); //$NON-NLS-1$
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
		Label label = new Label(container, SWT.NONE);
		label.setText(AriadneUIMessages.getString("AriadneExploreProjectsWizardOrganizationPage.Text")); //$NON-NLS-1$

		treeViewer = new TreeViewer(container);
		treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setContentProvider(new WorkbenchContentProvider());
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		treeViewer.addFilter(new AriadneOrganizationFileViewerFilter());
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = treeViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					structuredSelection = (IStructuredSelection)selection;
				}
				getWizard().getContainer().updateButtons();
			}
		});
		treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
		treeViewer.expandAll();
		setControl(container);
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
	 * Returns the list of the organizations to use during the exploration.
	 * 
	 * @return The list of the organizations to use during the exploration.
	 */
	public List<IFile> getSelectedOrganizations() {
		List<IFile> organizations = new ArrayList<>();
		if (this.structuredSelection != null) {
			List<?> selectedElements = this.structuredSelection.toList();
			for (Object selectedElement : selectedElements) {
				if (selectedElement instanceof IFile
						&& OrganizationModelWizard.FILE_EXTENSIONS.contains(((IFile)selectedElement)
								.getFileExtension())) {
					organizations.add((IFile)selectedElement);
				}
			}
		}
		return organizations;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		return this.getSelectedOrganizations().size() > 0;
	}
}
