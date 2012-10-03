/**
 */
package fr.obeo.ariadne.model.code;

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
 * @see fr.obeo.ariadne.model.code.CodeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.code.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.code.editor/src-gen' fileExtensions='ariadnecode'"
 * @generated
 */
public interface CodePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "code";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/Code";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-code";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CodePackage eINSTANCE = fr.obeo.ariadne.model.code.impl.CodePackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ComponentImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classpath Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CLASSPATH_ENTRIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resources Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__RESOURCES_CONTAINERS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONTAINMENT_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl <em>Resources Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResourcesContainer()
   * @generated
   */
  int RESOURCES_CONTAINER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__PATH = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__RESOURCES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Resources Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resources Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Resources Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ResourceImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__INHERITANCE_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CONTAINMENT_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.GenericResourceImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getGenericResource()
   * @generated
   */
  int GENERIC_RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__NAME = RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__DESCRIPTION = RESOURCE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__AUTHORS = RESOURCE__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__PROPERTIES = RESOURCE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__VERSION = RESOURCE__VERSION;

  /**
   * The feature id for the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__INHERITANCE_DEPENDENCY = RESOURCE__INHERITANCE_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__REFERENCE_DEPENDENCIES = RESOURCE__REFERENCE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__CONTAINMENT_DEPENDENCIES = RESOURCE__CONTAINMENT_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Resource Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__RESOURCE_KIND = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Generic Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl <em>Classpath Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClasspathEntry()
   * @generated
   */
  int CLASSPATH_ENTRY = 4;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY__KIND = 0;

  /**
   * The feature id for the '<em><b>Input Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY__INPUT_FOLDER = 1;

  /**
   * The feature id for the '<em><b>Output Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY__OUTPUT_FOLDER = 2;

  /**
   * The feature id for the '<em><b>Types Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY__TYPES_CONTAINERS = 3;

  /**
   * The number of structural features of the '<em>Classpath Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Classpath Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.TypesContainerImpl <em>Types Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.TypesContainerImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getTypesContainer()
   * @generated
   */
  int TYPES_CONTAINER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__TYPES_CONTAINERS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Types Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Types Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.TypeImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getType()
   * @generated
   */
  int TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VISIBILITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPING_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Inheritance Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INHERITANCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CONTAINMENT_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ANNOTATION_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ClassifierImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__DESCRIPTION = TYPE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__AUTHORS = TYPE__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__PROPERTIES = TYPE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__VERSION = TYPE__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__QUALIFIED_NAME = TYPE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__VISIBILITY = TYPE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TYPES = TYPE__TYPES;

  /**
   * The feature id for the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TYPING_DEPENDENCIES = TYPE__TYPING_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Inheritance Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INHERITANCE_DEPENDENCIES = TYPE__INHERITANCE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__REFERENCE_DEPENDENCIES = TYPE__REFERENCE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__CONTAINMENT_DEPENDENCIES = TYPE__CONTAINMENT_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ANNOTATION_DEPENDENCIES = TYPE__ANNOTATION_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__KIND = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__STATIC = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FINAL = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__IMMUTABLE = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ABSTRACT = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FIELDS = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__OPERATIONS = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.FieldImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getField()
   * @generated
   */
  int FIELD = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VISIBILITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__STATIC = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ABSTRACT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FINAL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__IMMUTABLE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TRANSIENT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Typing Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPING_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__INHERITANCE_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATION_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of operations of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ConstructorImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__VISIBILITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__STATIC = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ABSTRACT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__FINAL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__IMMUTABLE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__TRANSIENT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Typing Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__TYPING_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__INHERITANCE_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ANNOTATION_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The number of operations of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.OperationImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VISIBILITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__STATIC = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ABSTRACT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FINAL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IMMUTABLE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TRANSIENT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Typing Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPING_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__INHERITANCE_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ANNOTATION_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The number of operations of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ParameterImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VISIBILITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__FINAL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__IMMUTABLE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Typing Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPING_DEPENDENCY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATION_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.AnnotationImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DESCRIPTION = TYPE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__AUTHORS = TYPE__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__PROPERTIES = TYPE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VERSION = TYPE__VERSION;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__QUALIFIED_NAME = TYPE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VISIBILITY = TYPE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPES = TYPE__TYPES;

  /**
   * The feature id for the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPING_DEPENDENCIES = TYPE__TYPING_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Inheritance Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__INHERITANCE_DEPENDENCIES = TYPE__INHERITANCE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__REFERENCE_DEPENDENCIES = TYPE__REFERENCE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__CONTAINMENT_DEPENDENCIES = TYPE__CONTAINMENT_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_DEPENDENCIES = TYPE__ANNOTATION_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Annotation Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.AnnotationFieldImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotationField()
   * @generated
   */
  int ANNOTATION_FIELD = 13;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__QUALIFIED_NAME = 0;

  /**
   * The number of structural features of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.RequiredServiceImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__TYPING_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getProvidedService()
   * @generated
   */
  int PROVIDED_SERVICE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__TYPING_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__REFERENCE_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.DependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 16;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__CONSTRAINTS = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ConstraintImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 17;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl <em>Version Range Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getVersionRangeConstraint()
   * @generated
   */
  int VERSION_RANGE_CONSTRAINT = 18;

  /**
   * The feature id for the '<em><b>Include Lower Version Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND = 0;

  /**
   * The feature id for the '<em><b>Include Upper Version Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND = 1;

  /**
   * The feature id for the '<em><b>Lower Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT__LOWER_VERSION = 2;

  /**
   * The feature id for the '<em><b>Upper Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT__UPPER_VERSION = 3;

  /**
   * The number of structural features of the '<em>Version Range Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Version Range Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_CONSTRAINT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ExpressionConstraintImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getExpressionConstraint()
   * @generated
   */
  int EXPRESSION_CONSTRAINT = 19;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT__LANGUAGE = 1;

  /**
   * The number of structural features of the '<em>Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.TypingDependencyImpl <em>Typing Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.TypingDependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getTypingDependency()
   * @generated
   */
  int TYPING_DEPENDENCY = 20;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY__IDENTIFIER = DEPENDENCY__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY__CONSTRAINTS = DEPENDENCY__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY__PROPERTIES = DEPENDENCY__PROPERTIES;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY__TYPE_PARAMETERS = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typing Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Typing Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.InheritanceDependencyImpl <em>Inheritance Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.InheritanceDependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getInheritanceDependency()
   * @generated
   */
  int INHERITANCE_DEPENDENCY = 21;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY__IDENTIFIER = DEPENDENCY__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY__CONSTRAINTS = DEPENDENCY__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY__PROPERTIES = DEPENDENCY__PROPERTIES;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY__TYPE_PARAMETERS = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inheritance Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Inheritance Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ReferenceDependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getReferenceDependency()
   * @generated
   */
  int REFERENCE_DEPENDENCY = 22;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY__IDENTIFIER = DEPENDENCY__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY__CONSTRAINTS = DEPENDENCY__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY__PROPERTIES = DEPENDENCY__PROPERTIES;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY__KIND = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Reference Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ContainmentDependencyImpl <em>Containment Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ContainmentDependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getContainmentDependency()
   * @generated
   */
  int CONTAINMENT_DEPENDENCY = 23;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_DEPENDENCY__IDENTIFIER = DEPENDENCY__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_DEPENDENCY__CONSTRAINTS = DEPENDENCY__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_DEPENDENCY__PROPERTIES = DEPENDENCY__PROPERTIES;

  /**
   * The number of structural features of the '<em>Containment Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Containment Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationDependencyImpl <em>Annotation Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.AnnotationDependencyImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotationDependency()
   * @generated
   */
  int ANNOTATION_DEPENDENCY = 24;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY__IDENTIFIER = DEPENDENCY__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY__CONSTRAINTS = DEPENDENCY__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY__PROPERTIES = DEPENDENCY__PROPERTIES;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY__VALUES = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Annotation Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ResourceKind <em>Resource Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ResourceKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResourceKind()
   * @generated
   */
  int RESOURCE_KIND = 25;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ClasspathEntryKind <em>Classpath Entry Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClasspathEntryKind()
   * @generated
   */
  int CLASSPATH_ENTRY_KIND = 26;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ClassifierKind <em>Classifier Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ClassifierKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClassifierKind()
   * @generated
   */
  int CLASSIFIER_KIND = 27;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.VisibilityKind <em>Visibility Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getVisibilityKind()
   * @generated
   */
  int VISIBILITY_KIND = 28;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see fr.obeo.ariadne.model.code.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Component#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getIdentifier()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getClasspathEntries <em>Classpath Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classpath Entries</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getClasspathEntries()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ClasspathEntries();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getResourcesContainers <em>Resources Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources Containers</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getResourcesContainers()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ResourcesContainers();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getReferenceDependencies()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getContainmentDependencies <em>Containment Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containment Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getContainmentDependencies()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ContainmentDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ResourcesContainer <em>Resources Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resources Container</em>'.
   * @see fr.obeo.ariadne.model.code.ResourcesContainer
   * @generated
   */
  EClass getResourcesContainer();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ResourcesContainer#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see fr.obeo.ariadne.model.code.ResourcesContainer#getPath()
   * @see #getResourcesContainer()
   * @generated
   */
  EAttribute getResourcesContainer_Path();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.ResourcesContainer#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see fr.obeo.ariadne.model.code.ResourcesContainer#getResources()
   * @see #getResourcesContainer()
   * @generated
   */
  EReference getResourcesContainer_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.ResourcesContainer#getSubResourcesContainers <em>Sub Resources Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Resources Containers</em>'.
   * @see fr.obeo.ariadne.model.code.ResourcesContainer#getSubResourcesContainers()
   * @see #getResourcesContainer()
   * @generated
   */
  EReference getResourcesContainer_SubResourcesContainers();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see fr.obeo.ariadne.model.code.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Resource#getInheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inheritance Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Resource#getInheritanceDependency()
   * @see #getResource()
   * @generated
   */
  EReference getResource_InheritanceDependency();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Resource#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Resource#getReferenceDependencies()
   * @see #getResource()
   * @generated
   */
  EReference getResource_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Resource#getContainmentDependencies <em>Containment Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containment Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Resource#getContainmentDependencies()
   * @see #getResource()
   * @generated
   */
  EReference getResource_ContainmentDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.GenericResource <em>Generic Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Resource</em>'.
   * @see fr.obeo.ariadne.model.code.GenericResource
   * @generated
   */
  EClass getGenericResource();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.GenericResource#getResourceKind <em>Resource Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource Kind</em>'.
   * @see fr.obeo.ariadne.model.code.GenericResource#getResourceKind()
   * @see #getGenericResource()
   * @generated
   */
  EAttribute getGenericResource_ResourceKind();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ClasspathEntry <em>Classpath Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classpath Entry</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry
   * @generated
   */
  EClass getClasspathEntry();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getKind()
   * @see #getClasspathEntry()
   * @generated
   */
  EAttribute getClasspathEntry_Kind();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getInputFolder <em>Input Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Folder</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getInputFolder()
   * @see #getClasspathEntry()
   * @generated
   */
  EAttribute getClasspathEntry_InputFolder();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getOutputFolder <em>Output Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Folder</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getOutputFolder()
   * @see #getClasspathEntry()
   * @generated
   */
  EAttribute getClasspathEntry_OutputFolder();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getTypesContainers <em>Types Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types Containers</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getTypesContainers()
   * @see #getClasspathEntry()
   * @generated
   */
  EReference getClasspathEntry_TypesContainers();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.TypesContainer <em>Types Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types Container</em>'.
   * @see fr.obeo.ariadne.model.code.TypesContainer
   * @generated
   */
  EClass getTypesContainer();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.TypesContainer#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.TypesContainer#getTypes()
   * @see #getTypesContainer()
   * @generated
   */
  EReference getTypesContainer_Types();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.TypesContainer#getTypesContainers <em>Types Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types Containers</em>'.
   * @see fr.obeo.ariadne.model.code.TypesContainer#getTypesContainers()
   * @see #getTypesContainer()
   * @generated
   */
  EReference getTypesContainer_TypesContainers();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.obeo.ariadne.model.code.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Type#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getQualifiedName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Type#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getVisibility()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Visibility();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getTypes()
   * @see #getType()
   * @generated
   */
  EReference getType_Types();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getTypingDependencies <em>Typing Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typing Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getTypingDependencies()
   * @see #getType()
   * @generated
   */
  EReference getType_TypingDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getInheritanceDependencies <em>Inheritance Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritance Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getInheritanceDependencies()
   * @see #getType()
   * @generated
   */
  EReference getType_InheritanceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getReferenceDependencies()
   * @see #getType()
   * @generated
   */
  EReference getType_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getContainmentDependencies <em>Containment Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containment Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getContainmentDependencies()
   * @see #getType()
   * @generated
   */
  EReference getType_ContainmentDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getAnnotationDependencies <em>Annotation Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getAnnotationDependencies()
   * @see #getType()
   * @generated
   */
  EReference getType_AnnotationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Classifier#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#getKind()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Kind();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Classifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#isStatic()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Static();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Classifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#isFinal()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Final();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Classifier#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#isImmutable()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Immutable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Classifier#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#isAbstract()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Classifier#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#getFields()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Classifier#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#getOperations()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Operations();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see fr.obeo.ariadne.model.code.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getQualifiedName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getVisibility()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Visibility();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see fr.obeo.ariadne.model.code.Field#isStatic()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Static();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see fr.obeo.ariadne.model.code.Field#isAbstract()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Abstract();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see fr.obeo.ariadne.model.code.Field#isFinal()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Final();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see fr.obeo.ariadne.model.code.Field#isImmutable()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Immutable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Field#isTransient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transient</em>'.
   * @see fr.obeo.ariadne.model.code.Field#isTransient()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Transient();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Field#getTypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typing Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getTypingDependency()
   * @see #getField()
   * @generated
   */
  EReference getField_TypingDependency();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Field#getInheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inheritance Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getInheritanceDependency()
   * @see #getField()
   * @generated
   */
  EReference getField_InheritanceDependency();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Field#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getReferenceDependencies()
   * @see #getField()
   * @generated
   */
  EReference getField_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Field#getAnnotationDependencies <em>Annotation Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getAnnotationDependencies()
   * @see #getField()
   * @generated
   */
  EReference getField_AnnotationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getQualifiedName()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getVisibility()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Visibility();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#isStatic()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Static();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#isAbstract()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Abstract();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#isFinal()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Final();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#isImmutable()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Immutable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Constructor#isTransient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transient</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#isTransient()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Transient();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Constructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getParameters()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Constructor#getTypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typing Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getTypingDependency()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_TypingDependency();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Constructor#getInheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inheritance Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getInheritanceDependency()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_InheritanceDependency();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Constructor#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getReferenceDependencies()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Constructor#getAnnotationDependencies <em>Annotation Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getAnnotationDependencies()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_AnnotationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see fr.obeo.ariadne.model.code.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getQualifiedName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getVisibility()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Visibility();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#isStatic()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Static();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#isAbstract()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Abstract();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#isFinal()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Final();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#isImmutable()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Immutable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Operation#isTransient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transient</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#isTransient()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Transient();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Operation#getTypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typing Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getTypingDependency()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_TypingDependency();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Operation#getInheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inheritance Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getInheritanceDependency()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_InheritanceDependency();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Operation#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getReferenceDependencies()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Operation#getAnnotationDependencies <em>Annotation Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getAnnotationDependencies()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_AnnotationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Parameter#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getQualifiedName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Parameter#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getVisibility()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Visibility();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Parameter#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#isFinal()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Final();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Parameter#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#isImmutable()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Immutable();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.Parameter#getTypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typing Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getTypingDependency()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_TypingDependency();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Parameter#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getReferenceDependencies()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ReferenceDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Parameter#getAnnotationDependencies <em>Annotation Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getAnnotationDependencies()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_AnnotationDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see fr.obeo.ariadne.model.code.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Annotation#getAnnotationFields <em>Annotation Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Fields</em>'.
   * @see fr.obeo.ariadne.model.code.Annotation#getAnnotationFields()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationFields();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.AnnotationField <em>Annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Field</em>'.
   * @see fr.obeo.ariadne.model.code.AnnotationField
   * @generated
   */
  EClass getAnnotationField();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.AnnotationField#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.code.AnnotationField#getQualifiedName()
   * @see #getAnnotationField()
   * @generated
   */
  EAttribute getAnnotationField_QualifiedName();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Service</em>'.
   * @see fr.obeo.ariadne.model.code.RequiredService
   * @generated
   */
  EClass getRequiredService();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.RequiredService#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.code.RequiredService#getIdentifier()
   * @see #getRequiredService()
   * @generated
   */
  EAttribute getRequiredService_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.RequiredService#getTypingDependencies <em>Typing Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typing Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.RequiredService#getTypingDependencies()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_TypingDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.RequiredService#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.RequiredService#getReferenceDependencies()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_ReferenceDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ProvidedService <em>Provided Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Service</em>'.
   * @see fr.obeo.ariadne.model.code.ProvidedService
   * @generated
   */
  EClass getProvidedService();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ProvidedService#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.code.ProvidedService#getIdentifier()
   * @see #getProvidedService()
   * @generated
   */
  EAttribute getProvidedService_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.ProvidedService#getTypingDependencies <em>Typing Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typing Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.ProvidedService#getTypingDependencies()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_TypingDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.ProvidedService#getReferenceDependencies <em>Reference Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Dependencies</em>'.
   * @see fr.obeo.ariadne.model.code.ProvidedService#getReferenceDependencies()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_ReferenceDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.Dependency#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.code.Dependency#getIdentifier()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Dependency#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see fr.obeo.ariadne.model.code.Dependency#getConstraints()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Constraints();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Dependency#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Properties</em>'.
   * @see fr.obeo.ariadne.model.code.Dependency#getProperties()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Properties();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see fr.obeo.ariadne.model.code.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint <em>Version Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Range Constraint</em>'.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint
   * @generated
   */
  EClass getVersionRangeConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeLowerVersionBound <em>Include Lower Version Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Lower Version Bound</em>'.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeLowerVersionBound()
   * @see #getVersionRangeConstraint()
   * @generated
   */
  EAttribute getVersionRangeConstraint_IncludeLowerVersionBound();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeUpperVersionBound <em>Include Upper Version Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Upper Version Bound</em>'.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeUpperVersionBound()
   * @see #getVersionRangeConstraint()
   * @generated
   */
  EAttribute getVersionRangeConstraint_IncludeUpperVersionBound();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getLowerVersion <em>Lower Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Version</em>'.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint#getLowerVersion()
   * @see #getVersionRangeConstraint()
   * @generated
   */
  EReference getVersionRangeConstraint_LowerVersion();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getUpperVersion <em>Upper Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Version</em>'.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint#getUpperVersion()
   * @see #getVersionRangeConstraint()
   * @generated
   */
  EReference getVersionRangeConstraint_UpperVersion();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ExpressionConstraint <em>Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Constraint</em>'.
   * @see fr.obeo.ariadne.model.code.ExpressionConstraint
   * @generated
   */
  EClass getExpressionConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see fr.obeo.ariadne.model.code.ExpressionConstraint#getExpression()
   * @see #getExpressionConstraint()
   * @generated
   */
  EAttribute getExpressionConstraint_Expression();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see fr.obeo.ariadne.model.code.ExpressionConstraint#getLanguage()
   * @see #getExpressionConstraint()
   * @generated
   */
  EAttribute getExpressionConstraint_Language();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.TypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typing Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.TypingDependency
   * @generated
   */
  EClass getTypingDependency();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.code.TypingDependency#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Parameters</em>'.
   * @see fr.obeo.ariadne.model.code.TypingDependency#getTypeParameters()
   * @see #getTypingDependency()
   * @generated
   */
  EAttribute getTypingDependency_TypeParameters();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.InheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.InheritanceDependency
   * @generated
   */
  EClass getInheritanceDependency();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.code.InheritanceDependency#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Parameters</em>'.
   * @see fr.obeo.ariadne.model.code.InheritanceDependency#getTypeParameters()
   * @see #getInheritanceDependency()
   * @generated
   */
  EAttribute getInheritanceDependency_TypeParameters();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ReferenceDependency <em>Reference Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.ReferenceDependency
   * @generated
   */
  EClass getReferenceDependency();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ReferenceDependency#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.obeo.ariadne.model.code.ReferenceDependency#getKind()
   * @see #getReferenceDependency()
   * @generated
   */
  EAttribute getReferenceDependency_Kind();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ContainmentDependency <em>Containment Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Containment Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.ContainmentDependency
   * @generated
   */
  EClass getContainmentDependency();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.AnnotationDependency <em>Annotation Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Dependency</em>'.
   * @see fr.obeo.ariadne.model.code.AnnotationDependency
   * @generated
   */
  EClass getAnnotationDependency();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.code.AnnotationDependency#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see fr.obeo.ariadne.model.code.AnnotationDependency#getValues()
   * @see #getAnnotationDependency()
   * @generated
   */
  EAttribute getAnnotationDependency_Values();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.code.ResourceKind <em>Resource Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Resource Kind</em>'.
   * @see fr.obeo.ariadne.model.code.ResourceKind
   * @generated
   */
  EEnum getResourceKind();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.code.ClasspathEntryKind <em>Classpath Entry Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Classpath Entry Kind</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
   * @generated
   */
  EEnum getClasspathEntryKind();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.code.ClassifierKind <em>Classifier Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Classifier Kind</em>'.
   * @see fr.obeo.ariadne.model.code.ClassifierKind
   * @generated
   */
  EEnum getClassifierKind();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.code.VisibilityKind <em>Visibility Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility Kind</em>'.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @generated
   */
  EEnum getVisibilityKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CodeFactory getCodeFactory();

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
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ComponentImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__IDENTIFIER = eINSTANCE.getComponent_Identifier();

    /**
     * The meta object literal for the '<em><b>Classpath Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CLASSPATH_ENTRIES = eINSTANCE.getComponent_ClasspathEntries();

    /**
     * The meta object literal for the '<em><b>Resources Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__RESOURCES_CONTAINERS = eINSTANCE.getComponent_ResourcesContainers();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REFERENCE_DEPENDENCIES = eINSTANCE.getComponent_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Containment Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CONTAINMENT_DEPENDENCIES = eINSTANCE.getComponent_ContainmentDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl <em>Resources Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResourcesContainer()
     * @generated
     */
    EClass RESOURCES_CONTAINER = eINSTANCE.getResourcesContainer();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCES_CONTAINER__PATH = eINSTANCE.getResourcesContainer_Path();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCES_CONTAINER__RESOURCES = eINSTANCE.getResourcesContainer_Resources();

    /**
     * The meta object literal for the '<em><b>Sub Resources Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS = eINSTANCE.getResourcesContainer_SubResourcesContainers();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ResourceImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Inheritance Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__INHERITANCE_DEPENDENCY = eINSTANCE.getResource_InheritanceDependency();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__REFERENCE_DEPENDENCIES = eINSTANCE.getResource_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Containment Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CONTAINMENT_DEPENDENCIES = eINSTANCE.getResource_ContainmentDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.GenericResourceImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getGenericResource()
     * @generated
     */
    EClass GENERIC_RESOURCE = eINSTANCE.getGenericResource();

    /**
     * The meta object literal for the '<em><b>Resource Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_RESOURCE__RESOURCE_KIND = eINSTANCE.getGenericResource_ResourceKind();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl <em>Classpath Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClasspathEntry()
     * @generated
     */
    EClass CLASSPATH_ENTRY = eINSTANCE.getClasspathEntry();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSPATH_ENTRY__KIND = eINSTANCE.getClasspathEntry_Kind();

    /**
     * The meta object literal for the '<em><b>Input Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSPATH_ENTRY__INPUT_FOLDER = eINSTANCE.getClasspathEntry_InputFolder();

    /**
     * The meta object literal for the '<em><b>Output Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSPATH_ENTRY__OUTPUT_FOLDER = eINSTANCE.getClasspathEntry_OutputFolder();

    /**
     * The meta object literal for the '<em><b>Types Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSPATH_ENTRY__TYPES_CONTAINERS = eINSTANCE.getClasspathEntry_TypesContainers();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.TypesContainerImpl <em>Types Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.TypesContainerImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getTypesContainer()
     * @generated
     */
    EClass TYPES_CONTAINER = eINSTANCE.getTypesContainer();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES_CONTAINER__TYPES = eINSTANCE.getTypesContainer_Types();

    /**
     * The meta object literal for the '<em><b>Types Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES_CONTAINER__TYPES_CONTAINERS = eINSTANCE.getTypesContainer_TypesContainers();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.TypeImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__QUALIFIED_NAME = eINSTANCE.getType_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VISIBILITY = eINSTANCE.getType_Visibility();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPES = eINSTANCE.getType_Types();

    /**
     * The meta object literal for the '<em><b>Typing Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPING_DEPENDENCIES = eINSTANCE.getType_TypingDependencies();

    /**
     * The meta object literal for the '<em><b>Inheritance Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__INHERITANCE_DEPENDENCIES = eINSTANCE.getType_InheritanceDependencies();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__REFERENCE_DEPENDENCIES = eINSTANCE.getType_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Containment Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__CONTAINMENT_DEPENDENCIES = eINSTANCE.getType_ContainmentDependencies();

    /**
     * The meta object literal for the '<em><b>Annotation Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ANNOTATION_DEPENDENCIES = eINSTANCE.getType_AnnotationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ClassifierImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__KIND = eINSTANCE.getClassifier_Kind();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__STATIC = eINSTANCE.getClassifier_Static();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__FINAL = eINSTANCE.getClassifier_Final();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__IMMUTABLE = eINSTANCE.getClassifier_Immutable();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__ABSTRACT = eINSTANCE.getClassifier_Abstract();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__FIELDS = eINSTANCE.getClassifier_Fields();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__OPERATIONS = eINSTANCE.getClassifier_Operations();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.FieldImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__QUALIFIED_NAME = eINSTANCE.getField_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__VISIBILITY = eINSTANCE.getField_Visibility();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__STATIC = eINSTANCE.getField_Static();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__ABSTRACT = eINSTANCE.getField_Abstract();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__FINAL = eINSTANCE.getField_Final();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__IMMUTABLE = eINSTANCE.getField_Immutable();

    /**
     * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__TRANSIENT = eINSTANCE.getField_Transient();

    /**
     * The meta object literal for the '<em><b>Typing Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPING_DEPENDENCY = eINSTANCE.getField_TypingDependency();

    /**
     * The meta object literal for the '<em><b>Inheritance Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__INHERITANCE_DEPENDENCY = eINSTANCE.getField_InheritanceDependency();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__REFERENCE_DEPENDENCIES = eINSTANCE.getField_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Annotation Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ANNOTATION_DEPENDENCIES = eINSTANCE.getField_AnnotationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ConstructorImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__QUALIFIED_NAME = eINSTANCE.getConstructor_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__VISIBILITY = eINSTANCE.getConstructor_Visibility();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__STATIC = eINSTANCE.getConstructor_Static();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__ABSTRACT = eINSTANCE.getConstructor_Abstract();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__FINAL = eINSTANCE.getConstructor_Final();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__IMMUTABLE = eINSTANCE.getConstructor_Immutable();

    /**
     * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__TRANSIENT = eINSTANCE.getConstructor_Transient();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Typing Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__TYPING_DEPENDENCY = eINSTANCE.getConstructor_TypingDependency();

    /**
     * The meta object literal for the '<em><b>Inheritance Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__INHERITANCE_DEPENDENCY = eINSTANCE.getConstructor_InheritanceDependency();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__REFERENCE_DEPENDENCIES = eINSTANCE.getConstructor_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Annotation Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__ANNOTATION_DEPENDENCIES = eINSTANCE.getConstructor_AnnotationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.OperationImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__QUALIFIED_NAME = eINSTANCE.getOperation_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__STATIC = eINSTANCE.getOperation_Static();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__ABSTRACT = eINSTANCE.getOperation_Abstract();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__FINAL = eINSTANCE.getOperation_Final();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IMMUTABLE = eINSTANCE.getOperation_Immutable();

    /**
     * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__TRANSIENT = eINSTANCE.getOperation_Transient();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Typing Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TYPING_DEPENDENCY = eINSTANCE.getOperation_TypingDependency();

    /**
     * The meta object literal for the '<em><b>Inheritance Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__INHERITANCE_DEPENDENCY = eINSTANCE.getOperation_InheritanceDependency();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__REFERENCE_DEPENDENCIES = eINSTANCE.getOperation_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Annotation Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__ANNOTATION_DEPENDENCIES = eINSTANCE.getOperation_AnnotationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ParameterImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__QUALIFIED_NAME = eINSTANCE.getParameter_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VISIBILITY = eINSTANCE.getParameter_Visibility();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__FINAL = eINSTANCE.getParameter_Final();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__IMMUTABLE = eINSTANCE.getParameter_Immutable();

    /**
     * The meta object literal for the '<em><b>Typing Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPING_DEPENDENCY = eINSTANCE.getParameter_TypingDependency();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__REFERENCE_DEPENDENCIES = eINSTANCE.getParameter_ReferenceDependencies();

    /**
     * The meta object literal for the '<em><b>Annotation Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATION_DEPENDENCIES = eINSTANCE.getParameter_AnnotationDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.AnnotationImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotation Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_FIELDS = eINSTANCE.getAnnotation_AnnotationFields();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.AnnotationFieldImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotationField()
     * @generated
     */
    EClass ANNOTATION_FIELD = eINSTANCE.getAnnotationField();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__QUALIFIED_NAME = eINSTANCE.getAnnotationField_QualifiedName();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.RequiredServiceImpl <em>Required Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.RequiredServiceImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getRequiredService()
     * @generated
     */
    EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_SERVICE__IDENTIFIER = eINSTANCE.getRequiredService_Identifier();

    /**
     * The meta object literal for the '<em><b>Typing Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__TYPING_DEPENDENCIES = eINSTANCE.getRequiredService_TypingDependencies();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__REFERENCE_DEPENDENCIES = eINSTANCE.getRequiredService_ReferenceDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getProvidedService()
     * @generated
     */
    EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_SERVICE__IDENTIFIER = eINSTANCE.getProvidedService_Identifier();

    /**
     * The meta object literal for the '<em><b>Typing Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__TYPING_DEPENDENCIES = eINSTANCE.getProvidedService_TypingDependencies();

    /**
     * The meta object literal for the '<em><b>Reference Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__REFERENCE_DEPENDENCIES = eINSTANCE.getProvidedService_ReferenceDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.DependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__IDENTIFIER = eINSTANCE.getDependency_Identifier();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__CONSTRAINTS = eINSTANCE.getDependency_Constraints();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__PROPERTIES = eINSTANCE.getDependency_Properties();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ConstraintImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl <em>Version Range Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getVersionRangeConstraint()
     * @generated
     */
    EClass VERSION_RANGE_CONSTRAINT = eINSTANCE.getVersionRangeConstraint();

    /**
     * The meta object literal for the '<em><b>Include Lower Version Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND = eINSTANCE.getVersionRangeConstraint_IncludeLowerVersionBound();

    /**
     * The meta object literal for the '<em><b>Include Upper Version Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND = eINSTANCE.getVersionRangeConstraint_IncludeUpperVersionBound();

    /**
     * The meta object literal for the '<em><b>Lower Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSION_RANGE_CONSTRAINT__LOWER_VERSION = eINSTANCE.getVersionRangeConstraint_LowerVersion();

    /**
     * The meta object literal for the '<em><b>Upper Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSION_RANGE_CONSTRAINT__UPPER_VERSION = eINSTANCE.getVersionRangeConstraint_UpperVersion();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ExpressionConstraintImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getExpressionConstraint()
     * @generated
     */
    EClass EXPRESSION_CONSTRAINT = eINSTANCE.getExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_CONSTRAINT__EXPRESSION = eINSTANCE.getExpressionConstraint_Expression();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_CONSTRAINT__LANGUAGE = eINSTANCE.getExpressionConstraint_Language();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.TypingDependencyImpl <em>Typing Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.TypingDependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getTypingDependency()
     * @generated
     */
    EClass TYPING_DEPENDENCY = eINSTANCE.getTypingDependency();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPING_DEPENDENCY__TYPE_PARAMETERS = eINSTANCE.getTypingDependency_TypeParameters();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.InheritanceDependencyImpl <em>Inheritance Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.InheritanceDependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getInheritanceDependency()
     * @generated
     */
    EClass INHERITANCE_DEPENDENCY = eINSTANCE.getInheritanceDependency();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_DEPENDENCY__TYPE_PARAMETERS = eINSTANCE.getInheritanceDependency_TypeParameters();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ReferenceDependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getReferenceDependency()
     * @generated
     */
    EClass REFERENCE_DEPENDENCY = eINSTANCE.getReferenceDependency();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_DEPENDENCY__KIND = eINSTANCE.getReferenceDependency_Kind();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ContainmentDependencyImpl <em>Containment Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ContainmentDependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getContainmentDependency()
     * @generated
     */
    EClass CONTAINMENT_DEPENDENCY = eINSTANCE.getContainmentDependency();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.AnnotationDependencyImpl <em>Annotation Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.AnnotationDependencyImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getAnnotationDependency()
     * @generated
     */
    EClass ANNOTATION_DEPENDENCY = eINSTANCE.getAnnotationDependency();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_DEPENDENCY__VALUES = eINSTANCE.getAnnotationDependency_Values();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.ResourceKind <em>Resource Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.ResourceKind
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResourceKind()
     * @generated
     */
    EEnum RESOURCE_KIND = eINSTANCE.getResourceKind();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.ClasspathEntryKind <em>Classpath Entry Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClasspathEntryKind()
     * @generated
     */
    EEnum CLASSPATH_ENTRY_KIND = eINSTANCE.getClasspathEntryKind();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.ClassifierKind <em>Classifier Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.ClassifierKind
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClassifierKind()
     * @generated
     */
    EEnum CLASSIFIER_KIND = eINSTANCE.getClassifierKind();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.VisibilityKind <em>Visibility Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.VisibilityKind
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getVisibilityKind()
     * @generated
     */
    EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

  }

} //CodePackage
