/**
 */
package fr.obeo.ariadne.model.environment.impl;

import fr.obeo.ariadne.model.core.CorePackage;

import fr.obeo.ariadne.model.environment.DevelopmentEnvironment;
import fr.obeo.ariadne.model.environment.DevelopmentTool;
import fr.obeo.ariadne.model.environment.Environment;
import fr.obeo.ariadne.model.environment.EnvironmentComponent;
import fr.obeo.ariadne.model.environment.EnvironmentFactory;
import fr.obeo.ariadne.model.environment.EnvironmentPackage;
import fr.obeo.ariadne.model.environment.RuntimeEnvironment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class EnvironmentPackageImpl extends EPackageImpl implements EnvironmentPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass developmentEnvironmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass developmentToolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runtimeEnvironmentEClass = null;

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
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EnvironmentPackageImpl()
  {
    super(eNS_URI, EnvironmentFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EnvironmentPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EnvironmentPackage init()
  {
    if (isInited) return (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);

    // Obtain or create and register package
    EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnvironmentPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEnvironmentPackage.createPackageContents();

    // Initialize created meta-data
    theEnvironmentPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEnvironmentPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EnvironmentPackage.eNS_URI, theEnvironmentPackage);
    return theEnvironmentPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironment()
  {
    return environmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironment_OperatingSystem()
  {
    return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironment_WindowingSystem()
  {
    return (EAttribute)environmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironment_Architecture()
  {
    return (EAttribute)environmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironment_Locale()
  {
    return (EAttribute)environmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_EnvironmentComponents()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentComponent()
  {
    return environmentComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentComponent_Identifier()
  {
    return (EAttribute)environmentComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevelopmentEnvironment()
  {
    return developmentEnvironmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevelopmentEnvironment_DevelopmentTools()
  {
    return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevelopmentTool()
  {
    return developmentToolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuntimeEnvironment()
  {
    return runtimeEnvironmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentFactory getEnvironmentFactory()
  {
    return (EnvironmentFactory)getEFactoryInstance();
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
    environmentEClass = createEClass(ENVIRONMENT);
    createEAttribute(environmentEClass, ENVIRONMENT__OPERATING_SYSTEM);
    createEAttribute(environmentEClass, ENVIRONMENT__WINDOWING_SYSTEM);
    createEAttribute(environmentEClass, ENVIRONMENT__ARCHITECTURE);
    createEAttribute(environmentEClass, ENVIRONMENT__LOCALE);
    createEReference(environmentEClass, ENVIRONMENT__ENVIRONMENT_COMPONENTS);

    environmentComponentEClass = createEClass(ENVIRONMENT_COMPONENT);
    createEAttribute(environmentComponentEClass, ENVIRONMENT_COMPONENT__IDENTIFIER);

    developmentEnvironmentEClass = createEClass(DEVELOPMENT_ENVIRONMENT);
    createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS);

    developmentToolEClass = createEClass(DEVELOPMENT_TOOL);

    runtimeEnvironmentEClass = createEClass(RUNTIME_ENVIRONMENT);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    environmentEClass.getESuperTypes().add(theCorePackage.getElement());
    environmentComponentEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    developmentEnvironmentEClass.getESuperTypes().add(this.getEnvironment());
    developmentToolEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    runtimeEnvironmentEClass.getESuperTypes().add(this.getEnvironment());

    // Initialize classes, features, and operations; add parameters
    initEClass(environmentEClass, Environment.class, "Environment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnvironment_OperatingSystem(), theEcorePackage.getEString(), "operatingSystem", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironment_WindowingSystem(), theEcorePackage.getEString(), "windowingSystem", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironment_Architecture(), theEcorePackage.getEString(), "architecture", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironment_Locale(), theEcorePackage.getEString(), "locale", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironment_EnvironmentComponents(), this.getEnvironmentComponent(), null, "environmentComponents", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentComponentEClass, EnvironmentComponent.class, "EnvironmentComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnvironmentComponent_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, EnvironmentComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(developmentEnvironmentEClass, DevelopmentEnvironment.class, "DevelopmentEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDevelopmentEnvironment_DevelopmentTools(), this.getDevelopmentTool(), null, "developmentTools", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(developmentToolEClass, DevelopmentTool.class, "DevelopmentTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(runtimeEnvironmentEClass, RuntimeEnvironment.class, "RuntimeEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EnvironmentPackageImpl
