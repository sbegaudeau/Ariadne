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

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.organization.OrganizationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.organization.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.organization.editor/src-gen' fileExtensions='ariadneorganization' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
 * @generated
 */
public interface OrganizationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "organization";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/Organization";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-organization";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrganizationPackage eINSTANCE = fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl <em>Organization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationImpl
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganization()
   * @generated
   */
  int ORGANIZATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__CATEGORIES = 2;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__PERSONS = 3;

  /**
   * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__REPOSITORIES = 4;

  /**
   * The feature id for the '<em><b>Build Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__BUILD_SERVERS = 5;

  /**
   * The feature id for the '<em><b>Tasks Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__TASKS_REPOSITORIES = 6;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__PROPERTIES = 7;

  /**
   * The feature id for the '<em><b>Organization Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__ORGANIZATION_DEPENDENCIES = 8;

  /**
   * The number of structural features of the '<em>Organization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Organization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.impl.CategoryImpl
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__PROJECTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Organization</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__ORGANIZATION = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.impl.ProjectImpl
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__COMPONENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Development Environments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DEVELOPMENT_ENVIRONMENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Runtime Environments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__RUNTIME_ENVIRONMENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sub Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__SUB_PROJECTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__RELEASES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dependent Projects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DEPENDENT_PROJECTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Repositories</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__REPOSITORIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Category</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__CATEGORY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganizationDependency()
   * @generated
   */
  int ORGANIZATION_DEPENDENCY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Organization Dependency Kinds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Organization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY__ORGANIZATION = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_DEPENDENCY_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl <em>Release</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.impl.ReleaseImpl
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getRelease()
   * @generated
   */
  int RELEASE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__KIND = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__COMPONENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Build Jobs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__BUILD_JOBS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Branchs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__BRANCHS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__TASKS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Release</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Release</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.organization.OrganizationDependencyKind <em>Dependency Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.organization.OrganizationDependencyKind
   * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganizationDependencyKind()
   * @generated
   */
  int ORGANIZATION_DEPENDENCY_KIND = 5;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.organization.Organization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organization</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization
   * @generated
   */
  EClass getOrganization();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.organization.Organization#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getName()
   * @see #getOrganization()
   * @generated
   */
  EAttribute getOrganization_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.organization.Organization#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getDescription()
   * @see #getOrganization()
   * @generated
   */
  EAttribute getOrganization_Description();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Categories</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getCategories()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_Categories();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getPersons()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_Persons();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repositories</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getRepositories()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_Repositories();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getBuildServers <em>Build Servers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Build Servers</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getBuildServers()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_BuildServers();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getTasksRepositories <em>Tasks Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks Repositories</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getTasksRepositories()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_TasksRepositories();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getProperties()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Organization#getOrganizationDependencies <em>Organization Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Organization Dependencies</em>'.
   * @see fr.obeo.ariadne.model.organization.Organization#getOrganizationDependencies()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_OrganizationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.organization.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see fr.obeo.ariadne.model.organization.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Category#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see fr.obeo.ariadne.model.organization.Category#getProjects()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Projects();

  /**
   * Returns the meta object for the container reference '{@link fr.obeo.ariadne.model.organization.Category#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Organization</em>'.
   * @see fr.obeo.ariadne.model.organization.Category#getOrganization()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Organization();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.organization.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see fr.obeo.ariadne.model.organization.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Project#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getComponents()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Components();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Project#getDevelopmentEnvironments <em>Development Environments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Development Environments</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getDevelopmentEnvironments()
   * @see #getProject()
   * @generated
   */
  EReference getProject_DevelopmentEnvironments();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Project#getRuntimeEnvironments <em>Runtime Environments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Runtime Environments</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getRuntimeEnvironments()
   * @see #getProject()
   * @generated
   */
  EReference getProject_RuntimeEnvironments();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Project#getSubProjects <em>Sub Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Projects</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getSubProjects()
   * @see #getProject()
   * @generated
   */
  EReference getProject_SubProjects();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.organization.Project#getReleases <em>Releases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Releases</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getReleases()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Releases();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Project#getDependentProjects <em>Dependent Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependent Projects</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getDependentProjects()
   * @see #getProject()
   * @generated
   */
  EReference getProject_DependentProjects();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Project#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Repositories</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getRepositories()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Repositories();

  /**
   * Returns the meta object for the container reference '{@link fr.obeo.ariadne.model.organization.Project#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Category</em>'.
   * @see fr.obeo.ariadne.model.organization.Project#getCategory()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Category();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.organization.OrganizationDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see fr.obeo.ariadne.model.organization.OrganizationDependency
   * @generated
   */
  EClass getOrganizationDependency();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganizationDependencyKinds <em>Organization Dependency Kinds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Organization Dependency Kinds</em>'.
   * @see fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganizationDependencyKinds()
   * @see #getOrganizationDependency()
   * @generated
   */
  EAttribute getOrganizationDependency_OrganizationDependencyKinds();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Organization</em>'.
   * @see fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganization()
   * @see #getOrganizationDependency()
   * @generated
   */
  EReference getOrganizationDependency_Organization();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.organization.Release <em>Release</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Release</em>'.
   * @see fr.obeo.ariadne.model.organization.Release
   * @generated
   */
  EClass getRelease();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.organization.Release#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.obeo.ariadne.model.organization.Release#getKind()
   * @see #getRelease()
   * @generated
   */
  EAttribute getRelease_Kind();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Release#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see fr.obeo.ariadne.model.organization.Release#getComponents()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Components();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Release#getBuildJobs <em>Build Jobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Build Jobs</em>'.
   * @see fr.obeo.ariadne.model.organization.Release#getBuildJobs()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_BuildJobs();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Release#getBranchs <em>Branchs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Branchs</em>'.
   * @see fr.obeo.ariadne.model.organization.Release#getBranchs()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Branchs();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.organization.Release#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tasks</em>'.
   * @see fr.obeo.ariadne.model.organization.Release#getTasks()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Tasks();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.organization.OrganizationDependencyKind <em>Dependency Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dependency Kind</em>'.
   * @see fr.obeo.ariadne.model.organization.OrganizationDependencyKind
   * @generated
   */
  EEnum getOrganizationDependencyKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OrganizationFactory getOrganizationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl <em>Organization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationImpl
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganization()
     * @generated
     */
    EClass ORGANIZATION = eINSTANCE.getOrganization();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATION__DESCRIPTION = eINSTANCE.getOrganization_Description();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__CATEGORIES = eINSTANCE.getOrganization_Categories();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__PERSONS = eINSTANCE.getOrganization_Persons();

    /**
     * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__REPOSITORIES = eINSTANCE.getOrganization_Repositories();

    /**
     * The meta object literal for the '<em><b>Build Servers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__BUILD_SERVERS = eINSTANCE.getOrganization_BuildServers();

    /**
     * The meta object literal for the '<em><b>Tasks Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__TASKS_REPOSITORIES = eINSTANCE.getOrganization_TasksRepositories();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__PROPERTIES = eINSTANCE.getOrganization_Properties();

    /**
     * The meta object literal for the '<em><b>Organization Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__ORGANIZATION_DEPENDENCIES = eINSTANCE.getOrganization_OrganizationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.impl.CategoryImpl
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__PROJECTS = eINSTANCE.getCategory_Projects();

    /**
     * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__ORGANIZATION = eINSTANCE.getCategory_Organization();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.impl.ProjectImpl
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__COMPONENTS = eINSTANCE.getProject_Components();

    /**
     * The meta object literal for the '<em><b>Development Environments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getProject_DevelopmentEnvironments();

    /**
     * The meta object literal for the '<em><b>Runtime Environments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__RUNTIME_ENVIRONMENTS = eINSTANCE.getProject_RuntimeEnvironments();

    /**
     * The meta object literal for the '<em><b>Sub Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__SUB_PROJECTS = eINSTANCE.getProject_SubProjects();

    /**
     * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__RELEASES = eINSTANCE.getProject_Releases();

    /**
     * The meta object literal for the '<em><b>Dependent Projects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__DEPENDENT_PROJECTS = eINSTANCE.getProject_DependentProjects();

    /**
     * The meta object literal for the '<em><b>Repositories</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__REPOSITORIES = eINSTANCE.getProject_Repositories();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__CATEGORY = eINSTANCE.getProject_Category();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganizationDependency()
     * @generated
     */
    EClass ORGANIZATION_DEPENDENCY = eINSTANCE.getOrganizationDependency();

    /**
     * The meta object literal for the '<em><b>Organization Dependency Kinds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS = eINSTANCE.getOrganizationDependency_OrganizationDependencyKinds();

    /**
     * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION_DEPENDENCY__ORGANIZATION = eINSTANCE.getOrganizationDependency_Organization();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl <em>Release</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.impl.ReleaseImpl
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getRelease()
     * @generated
     */
    EClass RELEASE = eINSTANCE.getRelease();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELEASE__KIND = eINSTANCE.getRelease_Kind();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__COMPONENTS = eINSTANCE.getRelease_Components();

    /**
     * The meta object literal for the '<em><b>Build Jobs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__BUILD_JOBS = eINSTANCE.getRelease_BuildJobs();

    /**
     * The meta object literal for the '<em><b>Branchs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__BRANCHS = eINSTANCE.getRelease_Branchs();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__TASKS = eINSTANCE.getRelease_Tasks();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.organization.OrganizationDependencyKind <em>Dependency Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.organization.OrganizationDependencyKind
     * @see fr.obeo.ariadne.model.organization.impl.OrganizationPackageImpl#getOrganizationDependencyKind()
     * @generated
     */
    EEnum ORGANIZATION_DEPENDENCY_KIND = eINSTANCE.getOrganizationDependencyKind();

  }

} //OrganizationPackage
