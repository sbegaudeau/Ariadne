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
 * A representation of the model object '<em><b>Resources Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ResourcesContainer#getPath <em>Path</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ResourcesContainer#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ResourcesContainer#getSubResourcesContainers <em>Sub Resources Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getResourcesContainer()
 * @model
 * @generated
 */
public interface ResourcesContainer extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getResourcesContainer_Path()
   * @model unique="false"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ResourcesContainer#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getResourcesContainer_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Sub Resources Containers</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ResourcesContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Resources Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Resources Containers</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getResourcesContainer_SubResourcesContainers()
   * @model containment="true"
   * @generated
   */
  EList<ResourcesContainer> getSubResourcesContainers();

} // ResourcesContainer
