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
package fr.obeo.ariadne.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.Version#getPatch <em>Patch</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.core.CorePackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Major</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Major</em>' attribute.
   * @see #setMajor(int)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersion_Major()
   * @model unique="false"
   * @generated
   */
  int getMajor();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.Version#getMajor <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Major</em>' attribute.
   * @see #getMajor()
   * @generated
   */
  void setMajor(int value);

  /**
   * Returns the value of the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minor</em>' attribute.
   * @see #setMinor(int)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersion_Minor()
   * @model unique="false"
   * @generated
   */
  int getMinor();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.Version#getMinor <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minor</em>' attribute.
   * @see #getMinor()
   * @generated
   */
  void setMinor(int value);

  /**
   * Returns the value of the '<em><b>Patch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patch</em>' attribute.
   * @see #setPatch(int)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersion_Patch()
   * @model unique="false"
   * @generated
   */
  int getPatch();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.Version#getPatch <em>Patch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patch</em>' attribute.
   * @see #getPatch()
   * @generated
   */
  void setPatch(int value);

} // Version
