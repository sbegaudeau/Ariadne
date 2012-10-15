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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.GenericResource#getResourceKind <em>Resource Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getGenericResource()
 * @model
 * @generated
 */
public interface GenericResource extends Resource
{
  /**
   * Returns the value of the '<em><b>Resource Kind</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.code.ResourceKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.code.ResourceKind
   * @see #setResourceKind(ResourceKind)
   * @see fr.obeo.ariadne.model.code.CodePackage#getGenericResource_ResourceKind()
   * @model unique="false"
   * @generated
   */
  ResourceKind getResourceKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.GenericResource#getResourceKind <em>Resource Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.code.ResourceKind
   * @see #getResourceKind()
   * @generated
   */
  void setResourceKind(ResourceKind value);

} // GenericResource
