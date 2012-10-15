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
package fr.obeo.ariadne.model.continuousintegration.impl;

import fr.obeo.ariadne.model.code.CodePackage;

import fr.obeo.ariadne.model.continuousintegration.BuildDependency;
import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.BuildKind;
import fr.obeo.ariadne.model.continuousintegration.BuildServer;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationFactory;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage;
import fr.obeo.ariadne.model.continuousintegration.PromotionLocation;

import fr.obeo.ariadne.model.core.CorePackage;

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
public class ContinuousintegrationPackageImpl extends EPackageImpl implements ContinuousintegrationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildServerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildJobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass promotionLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum buildKindEEnum = null;

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
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ContinuousintegrationPackageImpl()
  {
    super(eNS_URI, ContinuousintegrationFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ContinuousintegrationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ContinuousintegrationPackage init()
  {
    if (isInited) return (ContinuousintegrationPackage)EPackage.Registry.INSTANCE.getEPackage(ContinuousintegrationPackage.eNS_URI);

    // Obtain or create and register package
    ContinuousintegrationPackageImpl theContinuousintegrationPackage = (ContinuousintegrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContinuousintegrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContinuousintegrationPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CodePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theContinuousintegrationPackage.createPackageContents();

    // Initialize created meta-data
    theContinuousintegrationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theContinuousintegrationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ContinuousintegrationPackage.eNS_URI, theContinuousintegrationPackage);
    return theContinuousintegrationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildServer()
  {
    return buildServerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildServer_Url()
  {
    return (EAttribute)buildServerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildServer_BuildServerKind()
  {
    return (EAttribute)buildServerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildServer_BuildJobs()
  {
    return (EReference)buildServerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildJob()
  {
    return buildJobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildJob_Url()
  {
    return (EAttribute)buildJobEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildJob_BuildTechnologyKinds()
  {
    return (EAttribute)buildJobEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildJob_BuildKinds()
  {
    return (EAttribute)buildJobEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildJob_PromotionLocations()
  {
    return (EReference)buildJobEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildJob_BuildDependencies()
  {
    return (EReference)buildJobEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildJob_Components()
  {
    return (EReference)buildJobEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildDependency()
  {
    return buildDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildDependency_QualifiedName()
  {
    return (EAttribute)buildDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildDependency_Urls()
  {
    return (EAttribute)buildDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildDependency_Licenses()
  {
    return (EAttribute)buildDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPromotionLocation()
  {
    return promotionLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPromotionLocation_Url()
  {
    return (EAttribute)promotionLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuildKind()
  {
    return buildKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinuousintegrationFactory getContinuousintegrationFactory()
  {
    return (ContinuousintegrationFactory)getEFactoryInstance();
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
    buildServerEClass = createEClass(BUILD_SERVER);
    createEAttribute(buildServerEClass, BUILD_SERVER__URL);
    createEAttribute(buildServerEClass, BUILD_SERVER__BUILD_SERVER_KIND);
    createEReference(buildServerEClass, BUILD_SERVER__BUILD_JOBS);

    buildJobEClass = createEClass(BUILD_JOB);
    createEAttribute(buildJobEClass, BUILD_JOB__URL);
    createEAttribute(buildJobEClass, BUILD_JOB__BUILD_TECHNOLOGY_KINDS);
    createEAttribute(buildJobEClass, BUILD_JOB__BUILD_KINDS);
    createEReference(buildJobEClass, BUILD_JOB__PROMOTION_LOCATIONS);
    createEReference(buildJobEClass, BUILD_JOB__BUILD_DEPENDENCIES);
    createEReference(buildJobEClass, BUILD_JOB__COMPONENTS);

    buildDependencyEClass = createEClass(BUILD_DEPENDENCY);
    createEAttribute(buildDependencyEClass, BUILD_DEPENDENCY__QUALIFIED_NAME);
    createEAttribute(buildDependencyEClass, BUILD_DEPENDENCY__URLS);
    createEAttribute(buildDependencyEClass, BUILD_DEPENDENCY__LICENSES);

    promotionLocationEClass = createEClass(PROMOTION_LOCATION);
    createEAttribute(promotionLocationEClass, PROMOTION_LOCATION__URL);

    // Create enums
    buildKindEEnum = createEEnum(BUILD_KIND);
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
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    buildServerEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    buildJobEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    buildDependencyEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    promotionLocationEClass.getESuperTypes().add(theCorePackage.getVersionedElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(buildServerEClass, BuildServer.class, "BuildServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildServer_Url(), theEcorePackage.getEString(), "url", null, 0, 1, BuildServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildServer_BuildServerKind(), theEcorePackage.getEString(), "buildServerKind", null, 0, 1, BuildServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildServer_BuildJobs(), this.getBuildJob(), null, "buildJobs", null, 0, -1, BuildServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildJobEClass, BuildJob.class, "BuildJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildJob_Url(), theEcorePackage.getEString(), "url", null, 0, 1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildJob_BuildTechnologyKinds(), theEcorePackage.getEString(), "buildTechnologyKinds", null, 0, -1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildJob_BuildKinds(), this.getBuildKind(), "buildKinds", null, 0, -1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildJob_PromotionLocations(), this.getPromotionLocation(), null, "promotionLocations", null, 0, -1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildJob_BuildDependencies(), this.getBuildDependency(), null, "buildDependencies", null, 0, -1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildJob_Components(), theCodePackage.getComponent(), null, "components", null, 0, -1, BuildJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildDependencyEClass, BuildDependency.class, "BuildDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildDependency_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, BuildDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildDependency_Urls(), theEcorePackage.getEString(), "urls", null, 0, -1, BuildDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildDependency_Licenses(), theEcorePackage.getEString(), "licenses", null, 0, -1, BuildDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(promotionLocationEClass, PromotionLocation.class, "PromotionLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPromotionLocation_Url(), theEcorePackage.getEString(), "url", null, 0, 1, PromotionLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(buildKindEEnum, BuildKind.class, "BuildKind");
    addEEnumLiteral(buildKindEEnum, BuildKind.RELEASE);
    addEEnumLiteral(buildKindEEnum, BuildKind.RELEASE_CANDIDATE);
    addEEnumLiteral(buildKindEEnum, BuildKind.MILESTONE);
    addEEnumLiteral(buildKindEEnum, BuildKind.NIGHTLY);
    addEEnumLiteral(buildKindEEnum, BuildKind.BETA);
    addEEnumLiteral(buildKindEEnum, BuildKind.ALPHA);
    addEEnumLiteral(buildKindEEnum, BuildKind.PROOF_OF_CONCEPT);

    // Create resource
    createResource(eNS_URI);
  }

} //ContinuousintegrationPackageImpl
