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
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.code.CodePackage;

import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage;

import fr.obeo.ariadne.model.core.CorePackage;

import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.OrganizationDependency;
import fr.obeo.ariadne.model.organization.OrganizationDependencyKind;
import fr.obeo.ariadne.model.organization.OrganizationFactory;
import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Project;
import fr.obeo.ariadne.model.organization.Release;

import fr.obeo.ariadne.model.scm.ScmPackage;

import fr.obeo.ariadne.model.tasks.TasksPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationPackageImpl extends EPackageImpl implements OrganizationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass releaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum organizationDependencyKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrganizationPackageImpl()
  {
    super(eNS_URI, OrganizationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OrganizationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrganizationPackage init()
  {
    if (isInited) return (OrganizationPackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationPackage.eNS_URI);

    // Obtain or create and register package
    OrganizationPackageImpl theOrganizationPackage = (OrganizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrganizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrganizationPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TasksPackage.eINSTANCE.eClass();
    ScmPackage.eINSTANCE.eClass();
    ContinuousintegrationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOrganizationPackage.createPackageContents();

    // Initialize created meta-data
    theOrganizationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrganizationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrganizationPackage.eNS_URI, theOrganizationPackage);
    return theOrganizationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganization()
  {
    return organizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganization_Name()
  {
    return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganization_Description()
  {
    return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Categories()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Persons()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Repositories()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_BuildServers()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_TasksRepositories()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Properties()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_OrganizationDependencies()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory()
  {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Projects()
  {
    return (EReference)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Organization()
  {
    return (EReference)categoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Components()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_DevelopmentEnvironments()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_RuntimeEnvironments()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_SubProjects()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Releases()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_DependentProjects()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Repositories()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Category()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganizationDependency()
  {
    return organizationDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizationDependency_OrganizationDependencyKinds()
  {
    return (EAttribute)organizationDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganizationDependency_Organization()
  {
    return (EReference)organizationDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelease()
  {
    return releaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelease_Kind()
  {
    return (EAttribute)releaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Components()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_BuildJobs()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Branchs()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Tasks()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOrganizationDependencyKind()
  {
    return organizationDependencyKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrganizationFactory getOrganizationFactory()
  {
    return (OrganizationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    organizationEClass = createEClass(ORGANIZATION);
    createEAttribute(organizationEClass, ORGANIZATION__NAME);
    createEAttribute(organizationEClass, ORGANIZATION__DESCRIPTION);
    createEReference(organizationEClass, ORGANIZATION__CATEGORIES);
    createEReference(organizationEClass, ORGANIZATION__PERSONS);
    createEReference(organizationEClass, ORGANIZATION__REPOSITORIES);
    createEReference(organizationEClass, ORGANIZATION__BUILD_SERVERS);
    createEReference(organizationEClass, ORGANIZATION__TASKS_REPOSITORIES);
    createEReference(organizationEClass, ORGANIZATION__PROPERTIES);
    createEReference(organizationEClass, ORGANIZATION__ORGANIZATION_DEPENDENCIES);

    categoryEClass = createEClass(CATEGORY);
    createEReference(categoryEClass, CATEGORY__PROJECTS);
    createEReference(categoryEClass, CATEGORY__ORGANIZATION);

    projectEClass = createEClass(PROJECT);
    createEReference(projectEClass, PROJECT__COMPONENTS);
    createEReference(projectEClass, PROJECT__DEVELOPMENT_ENVIRONMENTS);
    createEReference(projectEClass, PROJECT__RUNTIME_ENVIRONMENTS);
    createEReference(projectEClass, PROJECT__SUB_PROJECTS);
    createEReference(projectEClass, PROJECT__RELEASES);
    createEReference(projectEClass, PROJECT__DEPENDENT_PROJECTS);
    createEReference(projectEClass, PROJECT__REPOSITORIES);
    createEReference(projectEClass, PROJECT__CATEGORY);

    organizationDependencyEClass = createEClass(ORGANIZATION_DEPENDENCY);
    createEAttribute(organizationDependencyEClass, ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS);
    createEReference(organizationDependencyEClass, ORGANIZATION_DEPENDENCY__ORGANIZATION);

    releaseEClass = createEClass(RELEASE);
    createEAttribute(releaseEClass, RELEASE__KIND);
    createEReference(releaseEClass, RELEASE__COMPONENTS);
    createEReference(releaseEClass, RELEASE__BUILD_JOBS);
    createEReference(releaseEClass, RELEASE__BRANCHS);
    createEReference(releaseEClass, RELEASE__TASKS);

    // Create enums
    organizationDependencyKindEEnum = createEEnum(ORGANIZATION_DEPENDENCY_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage(ScmPackage.eNS_URI);
    ContinuousintegrationPackage theContinuousintegrationPackage = (ContinuousintegrationPackage)EPackage.Registry.INSTANCE.getEPackage(ContinuousintegrationPackage.eNS_URI);
    TasksPackage theTasksPackage = (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);
    CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    categoryEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    projectEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    organizationDependencyEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    releaseEClass.getESuperTypes().add(theCorePackage.getVersionedElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganization_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrganization_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_Categories(), this.getCategory(), this.getCategory_Organization(), "categories", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_Persons(), theCorePackage.getPerson(), null, "persons", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_Repositories(), theScmPackage.getRepository(), null, "repositories", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_BuildServers(), theContinuousintegrationPackage.getBuildServer(), null, "buildServers", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_TasksRepositories(), theTasksPackage.getTasksRepository(), null, "tasksRepositories", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_Properties(), theCorePackage.getProperty(), null, "properties", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_OrganizationDependencies(), this.getOrganizationDependency(), null, "organizationDependencies", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategory_Projects(), this.getProject(), this.getProject_Category(), "projects", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategory_Organization(), this.getOrganization(), this.getOrganization_Categories(), "organization", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProject_Components(), theCodePackage.getComponent(), null, "components", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_DevelopmentEnvironments(), theCodePackage.getEnvironment(), null, "developmentEnvironments", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_RuntimeEnvironments(), theCodePackage.getEnvironment(), null, "runtimeEnvironments", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_SubProjects(), this.getProject(), null, "subProjects", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Releases(), this.getRelease(), null, "releases", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_DependentProjects(), this.getProject(), null, "dependentProjects", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Repositories(), theScmPackage.getRepository(), null, "repositories", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Category(), this.getCategory(), this.getCategory_Projects(), "category", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizationDependencyEClass, OrganizationDependency.class, "OrganizationDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganizationDependency_OrganizationDependencyKinds(), this.getOrganizationDependencyKind(), "organizationDependencyKinds", null, 0, -1, OrganizationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganizationDependency_Organization(), this.getOrganization(), null, "organization", null, 0, 1, OrganizationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelease_Kind(), theContinuousintegrationPackage.getBuildKind(), "kind", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelease_Components(), theCodePackage.getComponent(), null, "components", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelease_BuildJobs(), theContinuousintegrationPackage.getBuildJob(), null, "buildJobs", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelease_Branchs(), theScmPackage.getBranch(), null, "branchs", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelease_Tasks(), theTasksPackage.getTask(), null, "tasks", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(organizationDependencyKindEEnum, OrganizationDependencyKind.class, "OrganizationDependencyKind");
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.PARTNER);
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.COMPETITOR);
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.CUSTOMER);
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.SUPPLIER);
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.SUBSIDIARY);
    addEEnumLiteral(organizationDependencyKindEEnum, OrganizationDependencyKind.PARENT);

    // Create resource
    createResource(eNS_URI);
  }

} //OrganizationPackageImpl
