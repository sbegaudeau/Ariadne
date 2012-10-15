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
 * A representation of the model object '<em><b>Referenced Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ReferencedService#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ReferencedService#getProvidedServices <em>Provided Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getReferencedService()
 * @model
 * @generated
 */
public interface ReferencedService extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getReferencedService_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ReferencedService#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Provided Services</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ProvidedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Services</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getReferencedService_ProvidedServices()
   * @model
   * @generated
   */
  EList<ProvidedService> getProvidedServices();

} // ReferencedService
