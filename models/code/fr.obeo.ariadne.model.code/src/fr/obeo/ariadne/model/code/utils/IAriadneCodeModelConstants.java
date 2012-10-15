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
package fr.obeo.ariadne.model.code.utils;

/**
 * Utility class holding a set of constants used for by the Ariadne Code Model plugin.
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public interface IAriadneCodeModelConstants {
	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model element.
	 */
	String CODE_URI_PREFIX = "ariadne:/code/"; //$NON-NLS-1$

	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model component.
	 */
	String COMPONENT_URI_PREFIX = CODE_URI_PREFIX + "component"; //$NON-NLS-1$

	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model type.
	 */
	String TYPE_URI_PREFIX = CODE_URI_PREFIX + "type/"; //$NON-NLS-1$

	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model classifier.
	 */
	String CLASSIFIER_URI_PREFIX = CODE_URI_PREFIX + "classifier/"; //$NON-NLS-1$

	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model annotation.
	 */
	String ANNOTATION_URI_PREFIX = CODE_URI_PREFIX + "annotation/"; //$NON-NLS-1$

	/**
	 * The prefix used to indicate that an EObject is a proxy of an Ariadne Code Model required service.
	 */
	String REQUIRED_SERVICE_URI_PREFIX = CODE_URI_PREFIX + "service/required/"; //$NON-NLS-1$
}
