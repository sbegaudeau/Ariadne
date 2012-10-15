/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Stephane Begaudeau (Obeo) - initial API and implementation
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.Entry;
import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Environment#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getEnvironment_Entries()
   * @model containment="true"
   * @generated
   */
  EList<Entry> getEntries();

} // Environment
