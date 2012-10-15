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

import fr.obeo.ariadne.model.continuousintegration.BuildServer;

import fr.obeo.ariadne.model.core.Person;
import fr.obeo.ariadne.model.core.Property;

import fr.obeo.ariadne.model.scm.Repository;

import fr.obeo.ariadne.model.tasks.TasksRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getCategories <em>Categories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getPersons <em>Persons</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getBuildServers <em>Build Servers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getTasksRepositories <em>Tasks Repositories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Organization#getOrganizationDependencies <em>Organization Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.organization.Organization#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.organization.Organization#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.Category}.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.organization.Category#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Categories()
   * @see fr.obeo.ariadne.model.organization.Category#getOrganization
   * @model opposite="organization" containment="true"
   * @generated
   */
  EList<Category> getCategories();

  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

  /**
   * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Repository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repositories</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Repositories()
   * @model containment="true"
   * @generated
   */
  EList<Repository> getRepositories();

  /**
   * Returns the value of the '<em><b>Build Servers</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildServer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Servers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Servers</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_BuildServers()
   * @model containment="true"
   * @generated
   */
  EList<BuildServer> getBuildServers();

  /**
   * Returns the value of the '<em><b>Tasks Repositories</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.tasks.TasksRepository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks Repositories</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_TasksRepositories()
   * @model containment="true"
   * @generated
   */
  EList<TasksRepository> getTasksRepositories();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Organization Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.OrganizationDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganization_OrganizationDependencies()
   * @model containment="true"
   * @generated
   */
  EList<OrganizationDependency> getOrganizationDependencies();

} // Organization
