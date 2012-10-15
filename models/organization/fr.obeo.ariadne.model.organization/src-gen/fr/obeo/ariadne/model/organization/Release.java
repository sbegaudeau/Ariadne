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

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.BuildKind;

import fr.obeo.ariadne.model.core.VersionedElement;

import fr.obeo.ariadne.model.scm.Branch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.Release#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Release#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Release#getBuildJobs <em>Build Jobs</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Release#getBranchs <em>Branchs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.continuousintegration.BuildKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
   * @see #setKind(BuildKind)
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getRelease_Kind()
   * @model unique="false"
   * @generated
   */
  BuildKind getKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.organization.Release#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
   * @see #getKind()
   * @generated
   */
  void setKind(BuildKind value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getRelease_Components()
   * @model
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Build Jobs</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildJob}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Jobs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Jobs</em>' reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getRelease_BuildJobs()
   * @model
   * @generated
   */
  EList<BuildJob> getBuildJobs();

  /**
   * Returns the value of the '<em><b>Branchs</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Branch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branchs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branchs</em>' reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getRelease_Branchs()
   * @model
   * @generated
   */
  EList<Branch> getBranchs();

} // Release
