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
package fr.obeo.ariadne.ide.connector.java.internal.utils;

/**
 * Utility class holding a set of constants for the Java connector.
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public interface IAriadneJavaConnectorConstants {
	/**
	 * "@since".
	 */
	String AT_SINCE = "@since"; //$NON-NLS-1$

	/**
	 * Static.
	 */
	String STATIC = "static"; //$NON-NLS-1$

	/**
	 * Final.
	 */
	String FINAL = "final"; //$NON-NLS-1$

	/**
	 * The qualified name of the deprecated annotation.
	 */
	String DEPRECATED_ANNOTATION = "java.lang.Deprecated"; //$NON-NLS-1$
}
