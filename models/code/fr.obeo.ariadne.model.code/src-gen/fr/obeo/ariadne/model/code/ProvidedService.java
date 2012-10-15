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

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ProvidedService#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ProvidedService#getReferencedService <em>Referenced Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getProvidedService()
 * @model
 * @generated
 */
public interface ProvidedService extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getProvidedService_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ProvidedService#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Referenced Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Service</em>' reference.
   * @see #setReferencedService(ReferencedService)
   * @see fr.obeo.ariadne.model.code.CodePackage#getProvidedService_ReferencedService()
   * @model
   * @generated
   */
  ReferencedService getReferencedService();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ProvidedService#getReferencedService <em>Referenced Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Service</em>' reference.
   * @see #getReferencedService()
   * @generated
   */
  void setReferencedService(ReferencedService value);

} // ProvidedService
