/**
 */
package fr.obeo.ariadne.model.environment;

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.obeo.ariadne.model.environment.EnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.environment.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.environment.editor/src-gen' fileExtensions='ariadneenvironment'"
 * @generated
 */
public interface EnvironmentPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "environment";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/Environment";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-environment";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EnvironmentPackage eINSTANCE = fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentImpl
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__NAME = CorePackage.ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__DESCRIPTION = CorePackage.ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__AUTHORS = CorePackage.ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__PROPERTIES = CorePackage.ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Operating System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__OPERATING_SYSTEM = CorePackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Windowing System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__WINDOWING_SYSTEM = CorePackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Architecture</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__ARCHITECTURE = CorePackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__LOCALE = CorePackage.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Environment Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__ENVIRONMENT_COMPONENTS = CorePackage.ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_OPERATION_COUNT = CorePackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.environment.impl.EnvironmentComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentComponentImpl
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getEnvironmentComponent()
   * @generated
   */
  int ENVIRONMENT_COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPONENT_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.environment.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.environment.impl.DevelopmentEnvironmentImpl
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getDevelopmentEnvironment()
   * @generated
   */
  int DEVELOPMENT_ENVIRONMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__NAME = ENVIRONMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__DESCRIPTION = ENVIRONMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__AUTHORS = ENVIRONMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__PROPERTIES = ENVIRONMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Operating System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__OPERATING_SYSTEM = ENVIRONMENT__OPERATING_SYSTEM;

  /**
   * The feature id for the '<em><b>Windowing System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__WINDOWING_SYSTEM = ENVIRONMENT__WINDOWING_SYSTEM;

  /**
   * The feature id for the '<em><b>Architecture</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__ARCHITECTURE = ENVIRONMENT__ARCHITECTURE;

  /**
   * The feature id for the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__LOCALE = ENVIRONMENT__LOCALE;

  /**
   * The feature id for the '<em><b>Environment Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__ENVIRONMENT_COMPONENTS = ENVIRONMENT__ENVIRONMENT_COMPONENTS;

  /**
   * The feature id for the '<em><b>Development Tools</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Development Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Development Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_ENVIRONMENT_OPERATION_COUNT = ENVIRONMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.environment.impl.DevelopmentToolImpl <em>Development Tool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.environment.impl.DevelopmentToolImpl
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getDevelopmentTool()
   * @generated
   */
  int DEVELOPMENT_TOOL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The number of structural features of the '<em>Development Tool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Development Tool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_TOOL_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.environment.impl.RuntimeEnvironmentImpl <em>Runtime Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.environment.impl.RuntimeEnvironmentImpl
   * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getRuntimeEnvironment()
   * @generated
   */
  int RUNTIME_ENVIRONMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__NAME = ENVIRONMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__DESCRIPTION = ENVIRONMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__AUTHORS = ENVIRONMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__PROPERTIES = ENVIRONMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Operating System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__OPERATING_SYSTEM = ENVIRONMENT__OPERATING_SYSTEM;

  /**
   * The feature id for the '<em><b>Windowing System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__WINDOWING_SYSTEM = ENVIRONMENT__WINDOWING_SYSTEM;

  /**
   * The feature id for the '<em><b>Architecture</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__ARCHITECTURE = ENVIRONMENT__ARCHITECTURE;

  /**
   * The feature id for the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__LOCALE = ENVIRONMENT__LOCALE;

  /**
   * The feature id for the '<em><b>Environment Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT__ENVIRONMENT_COMPONENTS = ENVIRONMENT__ENVIRONMENT_COMPONENTS;

  /**
   * The number of structural features of the '<em>Runtime Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Runtime Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNTIME_ENVIRONMENT_OPERATION_COUNT = ENVIRONMENT_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.environment.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.environment.Environment#getOperatingSystem <em>Operating System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operating System</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment#getOperatingSystem()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_OperatingSystem();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.environment.Environment#getWindowingSystem <em>Windowing System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Windowing System</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment#getWindowingSystem()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_WindowingSystem();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.environment.Environment#getArchitecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Architecture</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment#getArchitecture()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_Architecture();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.environment.Environment#getLocale <em>Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Locale</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment#getLocale()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_Locale();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.environment.Environment#getEnvironmentComponents <em>Environment Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Environment Components</em>'.
   * @see fr.obeo.ariadne.model.environment.Environment#getEnvironmentComponents()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_EnvironmentComponents();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.environment.EnvironmentComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see fr.obeo.ariadne.model.environment.EnvironmentComponent
   * @generated
   */
  EClass getEnvironmentComponent();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.environment.EnvironmentComponent#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.environment.EnvironmentComponent#getIdentifier()
   * @see #getEnvironmentComponent()
   * @generated
   */
  EAttribute getEnvironmentComponent_Identifier();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.environment.DevelopmentEnvironment <em>Development Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Development Environment</em>'.
   * @see fr.obeo.ariadne.model.environment.DevelopmentEnvironment
   * @generated
   */
  EClass getDevelopmentEnvironment();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.environment.DevelopmentEnvironment#getDevelopmentTools <em>Development Tools</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Development Tools</em>'.
   * @see fr.obeo.ariadne.model.environment.DevelopmentEnvironment#getDevelopmentTools()
   * @see #getDevelopmentEnvironment()
   * @generated
   */
  EReference getDevelopmentEnvironment_DevelopmentTools();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.environment.DevelopmentTool <em>Development Tool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Development Tool</em>'.
   * @see fr.obeo.ariadne.model.environment.DevelopmentTool
   * @generated
   */
  EClass getDevelopmentTool();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.environment.RuntimeEnvironment <em>Runtime Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runtime Environment</em>'.
   * @see fr.obeo.ariadne.model.environment.RuntimeEnvironment
   * @generated
   */
  EClass getRuntimeEnvironment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EnvironmentFactory getEnvironmentFactory();

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
     * The meta object literal for the '{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentImpl
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__OPERATING_SYSTEM = eINSTANCE.getEnvironment_OperatingSystem();

    /**
     * The meta object literal for the '<em><b>Windowing System</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__WINDOWING_SYSTEM = eINSTANCE.getEnvironment_WindowingSystem();

    /**
     * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__ARCHITECTURE = eINSTANCE.getEnvironment_Architecture();

    /**
     * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__LOCALE = eINSTANCE.getEnvironment_Locale();

    /**
     * The meta object literal for the '<em><b>Environment Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__ENVIRONMENT_COMPONENTS = eINSTANCE.getEnvironment_EnvironmentComponents();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.environment.impl.EnvironmentComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentComponentImpl
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getEnvironmentComponent()
     * @generated
     */
    EClass ENVIRONMENT_COMPONENT = eINSTANCE.getEnvironmentComponent();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_COMPONENT__IDENTIFIER = eINSTANCE.getEnvironmentComponent_Identifier();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.environment.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.environment.impl.DevelopmentEnvironmentImpl
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getDevelopmentEnvironment()
     * @generated
     */
    EClass DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironment();

    /**
     * The meta object literal for the '<em><b>Development Tools</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS = eINSTANCE.getDevelopmentEnvironment_DevelopmentTools();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.environment.impl.DevelopmentToolImpl <em>Development Tool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.environment.impl.DevelopmentToolImpl
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getDevelopmentTool()
     * @generated
     */
    EClass DEVELOPMENT_TOOL = eINSTANCE.getDevelopmentTool();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.environment.impl.RuntimeEnvironmentImpl <em>Runtime Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.environment.impl.RuntimeEnvironmentImpl
     * @see fr.obeo.ariadne.model.environment.impl.EnvironmentPackageImpl#getRuntimeEnvironment()
     * @generated
     */
    EClass RUNTIME_ENVIRONMENT = eINSTANCE.getRuntimeEnvironment();

  }

} //EnvironmentPackage
