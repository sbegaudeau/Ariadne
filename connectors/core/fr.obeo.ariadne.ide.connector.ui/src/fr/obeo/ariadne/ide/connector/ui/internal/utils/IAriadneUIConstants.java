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
package fr.obeo.ariadne.ide.connector.ui.internal.utils;

/**
 * This interface holds some constants for this plugin.
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public interface IAriadneUIConstants {
	/**
	 * This interface contains constants representing the path of all the icons available in this plugin.
	 * 
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
	 * @since 1.0
	 */
	public interface ICONS {
		/**
		 * The path of the 16x16 icon of Ariadne.
		 */
		String ARIADNE_16 = "icons/ariadne_16.png"; //$NON-NLS-1$

		/**
		 * The path of the 32x32 icon of Ariadne.
		 */
		String ARIADNE_32 = "icons/ariadne_32.png"; //$NON-NLS-1$

		/**
		 * The path of the 64x64 icon of Ariadne.
		 */
		String ARIADNE_64 = "icons/ariadne_64.png"; //$NON-NLS-1$

		/**
		 * The path of the icon of the description of the new Ariadne project.
		 */
		String ARIADNE_PROJECT_WIZARD = "icons/ariadne_project_wizard.png"; //$NON-NLS-1$

		/**
		 * The path of the icon of the description of the exploration wizard.
		 */
		String ARIADNE_EXPLORE_WIZARD = "icons/ariadne_explore_wizard.png"; //$NON-NLS-1$
	}
}
