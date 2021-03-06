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
package fr.obeo.ariadne.model.organization;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.Category#getProjects <em>Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Category#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.Project}.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.organization.Project#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getCategory_Projects()
   * @see fr.obeo.ariadne.model.organization.Project#getCategory
   * @model opposite="category" containment="true"
   * @generated
   */
  EList<Project> getProjects();

  /**
   * Returns the value of the '<em><b>Organization</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.organization.Organization#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization</em>' container reference.
   * @see #setOrganization(Organization)
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getCategory_Organization()
   * @see fr.obeo.ariadne.model.organization.Organization#getCategories
   * @model opposite="categories" transient="false"
   * @generated
   */
  Organization getOrganization();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.organization.Category#getOrganization <em>Organization</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organization</em>' container reference.
   * @see #getOrganization()
   * @generated
   */
  void setOrganization(Organization value);

} // Category
