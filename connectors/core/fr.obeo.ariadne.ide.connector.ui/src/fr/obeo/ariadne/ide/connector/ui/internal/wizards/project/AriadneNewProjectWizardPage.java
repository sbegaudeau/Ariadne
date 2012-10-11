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

import fr.obeo.ariadne.ide.connector.ui.internal.AriadneUIPlugin;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.AriadneUIMessages;
import fr.obeo.ariadne.ide.connector.ui.internal.utils.IAriadneUIConstants;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * The wizard page for the properties of the Ariadne project to create.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneNewProjectWizardPage extends WizardNewProjectCreationPage {
	/**
	 * The "Resource working set" ID.
	 */
	private static final String RESOURCE_WORKING_SET_ID = "org.eclipse.ui.resourceWorkingSetPage"; //$NON-NLS-1$

	/**
	 * The "Java working set" ID.
	 */
	private static final String JAVA_WORKING_SET_ID = "org.eclipse.jdt.ui.JavaWorkingSetPage"; //$NON-NLS-1$

	/**
	 * The selection when the new Ariadne project wizard was opened.
	 */
	private IStructuredSelection selection;

	/**
	 * The constructor.
	 * 
	 * @param iStructuredSelection
	 *            The current selection.
	 */
	public AriadneNewProjectWizardPage(IStructuredSelection iStructuredSelection) {
		super(AriadneUIMessages.getString("AriadneNewProjectWizardPage.PageName")); //$NON-NLS-1$
		this.setTitle(AriadneUIMessages.getString("AriadneNewProjectWizardPage.Title")); //$NON-NLS-1$
		this.setDescription(AriadneUIMessages.getString("AriadneNewProjectWizardPage.Description")); //$NON-NLS-1$
		this.selection = iStructuredSelection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(org.eclipse.swt.widgets.Composite parent) {
		super.createControl(parent);
		this.createWorkingSetGroup((Composite)getControl(), selection, new String[] {
				AriadneNewProjectWizardPage.RESOURCE_WORKING_SET_ID,
				AriadneNewProjectWizardPage.JAVA_WORKING_SET_ID, });
		Dialog.applyDialogFont(getControl());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#getImage()
	 */
	@Override
	public Image getImage() {
		return AriadneUIPlugin.getDefault().getImage(IAriadneUIConstants.ICONS.ARIADNE_PROJECT_WIZARD);
	}
}
