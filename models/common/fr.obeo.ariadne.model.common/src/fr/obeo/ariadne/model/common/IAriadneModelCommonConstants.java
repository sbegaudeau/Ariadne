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
package fr.obeo.ariadne.model.common;

/**
 * Utility class holding a set of constants for the common model.
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public interface IAriadneModelCommonConstants {
	/**
	 * The path of the properties model.
	 */
	String PROPERTIES_MODEL_PATH = "platform:/plugin/fr.obeo.ariadne.model.common/model/properties.ariadnecore"; //$NON-NLS-1$

	/**
	 * The path of the Ariadne Code model of the Java standard library.
	 */
	String JAVA_STANDARD_LIBRARY = "platform:/plugin/fr.obeo.ariadne.model.common/model/java.ariadnecode"; //$NON-NLS-1$

	/**
	 * Derived.
	 */
	String DERIVED_PROPERTY = "Derived"; //$NON-NLS-1$

	/**
	 * Generated.
	 */
	String GENERATED_PROPERTY = "Generated"; //$NON-NLS-1$

	/**
	 * Deprecated.
	 */
	String DEPRECATED_PROPERTY = "Deprecated"; //$NON-NLS-1$

	/**
	 * Model.
	 */
	String MODEL_PROPERTY = "Model"; //$NON-NLS-1$

	/**
	 * Internal.
	 */
	String INTERNAL_PROPERTY = "Internal"; //$NON-NLS-1$

	/**
	 * Internal API.
	 */
	String INTERNAL_API_PROPERTY = "Internal API"; //$NON-NLS-1$

	/**
	 * API.
	 */
	String API_PROPERTY = "API"; //$NON-NLS-1$

	/**
	 * The import reference kind.
	 */
	String IMPORT_REFERENCE_KIND = "import"; //$NON-NLS-1$
}
