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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.code.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.code.editor/src-gen' fileExtensions='ariadnecode' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Subcomponents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SUBCOMPONENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Referenced Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REFERENCED_SERVICES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROVIDED_SERVICES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_CONTAINER__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__VERSIONED_DEPENDENCIES = RESOURCE__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Component</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY__COMPONENT = 4;

  /**
   * The number of structural features of the '<em>Classpath Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSPATH_ENTRY_FEATURE_COUNT = 5;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_CONTAINER__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Internal Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INTERNAL_TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ANNOTATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__VERSIONED_DEPENDENCIES = TYPE__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Internal Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INTERNAL_TYPES = TYPE__INTERNAL_TYPES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ANNOTATIONS = TYPE__ANNOTATIONS;

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
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__SUPER_TYPES = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FIELDS = TYPE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__OPERATIONS = TYPE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 9;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Overridden Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OVERRIDDEN_FIELDS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ANNOTATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Overridden Constructors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 11;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Classifier</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CLASSIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Return Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RETURN_TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ANNOTATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Overridden Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OVERRIDDEN_OPERATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 13;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OPERATION = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VERSIONED_DEPENDENCIES = TYPE__VERSIONED_DEPENDENCIES;

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
   * The feature id for the '<em><b>Internal Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__INTERNAL_TYPES = TYPE__INTERNAL_TYPES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATIONS = TYPE__ANNOTATIONS;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__DEFAULT_VALUE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.ReferencedServiceImpl <em>Referenced Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.ReferencedServiceImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getReferencedService()
   * @generated
   */
  int REFERENCED_SERVICE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Provided Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE__PROVIDED_SERVICES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Referenced Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Referenced Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_SERVICE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

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
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Referenced Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__REFERENCED_SERVICE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.impl.EnvironmentImpl
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__ENTRIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ResourceKind <em>Resource Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ResourceKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getResourceKind()
   * @generated
   */
  int RESOURCE_KIND = 17;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ClasspathEntryKind <em>Classpath Entry Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClasspathEntryKind()
   * @generated
   */
  int CLASSPATH_ENTRY_KIND = 18;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.ClassifierKind <em>Classifier Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.ClassifierKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getClassifierKind()
   * @generated
   */
  int CLASSIFIER_KIND = 19;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.code.VisibilityKind <em>Visibility Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getVisibilityKind()
   * @generated
   */
  int VISIBILITY_KIND = 20;


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
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getSubcomponents <em>Subcomponents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getSubcomponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Subcomponents();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getReferencedServices <em>Referenced Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Services</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getReferencedServices()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ReferencedServices();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Component#getProvidedServices <em>Provided Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Services</em>'.
   * @see fr.obeo.ariadne.model.code.Component#getProvidedServices()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ProvidedServices();

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
   * Returns the meta object for the container reference '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Component</em>'.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getComponent()
   * @see #getClasspathEntry()
   * @generated
   */
  EReference getClasspathEntry_Component();

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
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Type#getInternalTypes <em>Internal Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Internal Types</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getInternalTypes()
   * @see #getType()
   * @generated
   */
  EReference getType_InternalTypes();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Type#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotations</em>'.
   * @see fr.obeo.ariadne.model.code.Type#getAnnotations()
   * @see #getType()
   * @generated
   */
  EReference getType_Annotations();

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
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Classifier#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Types</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#getSuperTypes()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_SuperTypes();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Classifier#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type Parameters</em>'.
   * @see fr.obeo.ariadne.model.code.Classifier#getTypeParameters()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_TypeParameters();

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
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Field#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getTypes()
   * @see #getField()
   * @generated
   */
  EReference getField_Types();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Field#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotations</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getAnnotations()
   * @see #getField()
   * @generated
   */
  EReference getField_Annotations();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Field#getOverriddenFields <em>Overridden Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Overridden Fields</em>'.
   * @see fr.obeo.ariadne.model.code.Field#getOverriddenFields()
   * @see #getField()
   * @generated
   */
  EReference getField_OverriddenFields();

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
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Constructor#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getTypes()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Types();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Constructor#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotations</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getAnnotations()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Annotations();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Constructor#getOverriddenConstructors <em>Overridden Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Overridden Constructors</em>'.
   * @see fr.obeo.ariadne.model.code.Constructor#getOverriddenConstructors()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_OverriddenConstructors();

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
   * Returns the meta object for the container reference '{@link fr.obeo.ariadne.model.code.Operation#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Classifier</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getClassifier()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Classifier();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Operation#getReturnTypes <em>Return Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Return Types</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getReturnTypes()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ReturnTypes();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Operation#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getTypes()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Types();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Operation#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotations</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getAnnotations()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Annotations();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Operation#getOverriddenOperations <em>Overridden Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Overridden Operations</em>'.
   * @see fr.obeo.ariadne.model.code.Operation#getOverriddenOperations()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_OverriddenOperations();

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
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Parameter#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getTypes()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Types();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.Parameter#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotations</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getAnnotations()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Annotations();

  /**
   * Returns the meta object for the container reference '{@link fr.obeo.ariadne.model.code.Parameter#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Operation</em>'.
   * @see fr.obeo.ariadne.model.code.Parameter#getOperation()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Operation();

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
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.AnnotationField#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.obeo.ariadne.model.code.AnnotationField#getDefaultValue()
   * @see #getAnnotationField()
   * @generated
   */
  EAttribute getAnnotationField_DefaultValue();

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
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.ReferencedService <em>Referenced Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Service</em>'.
   * @see fr.obeo.ariadne.model.code.ReferencedService
   * @generated
   */
  EClass getReferencedService();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.code.ReferencedService#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.code.ReferencedService#getIdentifier()
   * @see #getReferencedService()
   * @generated
   */
  EAttribute getReferencedService_Identifier();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.code.ReferencedService#getProvidedServices <em>Provided Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Provided Services</em>'.
   * @see fr.obeo.ariadne.model.code.ReferencedService#getProvidedServices()
   * @see #getReferencedService()
   * @generated
   */
  EReference getReferencedService_ProvidedServices();

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
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.code.ProvidedService#getReferencedService <em>Referenced Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Service</em>'.
   * @see fr.obeo.ariadne.model.code.ProvidedService#getReferencedService()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_ReferencedService();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.code.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see fr.obeo.ariadne.model.code.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.code.Environment#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see fr.obeo.ariadne.model.code.Environment#getEntries()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Entries();

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
     * The meta object literal for the '<em><b>Subcomponents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__SUBCOMPONENTS = eINSTANCE.getComponent_Subcomponents();

    /**
     * The meta object literal for the '<em><b>Referenced Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REFERENCED_SERVICES = eINSTANCE.getComponent_ReferencedServices();

    /**
     * The meta object literal for the '<em><b>Provided Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROVIDED_SERVICES = eINSTANCE.getComponent_ProvidedServices();

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
     * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSPATH_ENTRY__COMPONENT = eINSTANCE.getClasspathEntry_Component();

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
     * The meta object literal for the '<em><b>Internal Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__INTERNAL_TYPES = eINSTANCE.getType_InternalTypes();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ANNOTATIONS = eINSTANCE.getType_Annotations();

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
     * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__SUPER_TYPES = eINSTANCE.getClassifier_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__TYPE_PARAMETERS = eINSTANCE.getClassifier_TypeParameters();

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
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPES = eINSTANCE.getField_Types();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ANNOTATIONS = eINSTANCE.getField_Annotations();

    /**
     * The meta object literal for the '<em><b>Overridden Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__OVERRIDDEN_FIELDS = eINSTANCE.getField_OverriddenFields();

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
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__TYPES = eINSTANCE.getConstructor_Types();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__ANNOTATIONS = eINSTANCE.getConstructor_Annotations();

    /**
     * The meta object literal for the '<em><b>Overridden Constructors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS = eINSTANCE.getConstructor_OverriddenConstructors();

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
     * The meta object literal for the '<em><b>Classifier</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CLASSIFIER = eINSTANCE.getOperation_Classifier();

    /**
     * The meta object literal for the '<em><b>Return Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RETURN_TYPES = eINSTANCE.getOperation_ReturnTypes();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TYPES = eINSTANCE.getOperation_Types();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__ANNOTATIONS = eINSTANCE.getOperation_Annotations();

    /**
     * The meta object literal for the '<em><b>Overridden Operations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__OVERRIDDEN_OPERATIONS = eINSTANCE.getOperation_OverriddenOperations();

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
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPES = eINSTANCE.getParameter_Types();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATIONS = eINSTANCE.getParameter_Annotations();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

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
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__DEFAULT_VALUE = eINSTANCE.getAnnotationField_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__QUALIFIED_NAME = eINSTANCE.getAnnotationField_QualifiedName();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.ReferencedServiceImpl <em>Referenced Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.ReferencedServiceImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getReferencedService()
     * @generated
     */
    EClass REFERENCED_SERVICE = eINSTANCE.getReferencedService();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCED_SERVICE__IDENTIFIER = eINSTANCE.getReferencedService_Identifier();

    /**
     * The meta object literal for the '<em><b>Provided Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_SERVICE__PROVIDED_SERVICES = eINSTANCE.getReferencedService_ProvidedServices();

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
     * The meta object literal for the '<em><b>Referenced Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__REFERENCED_SERVICE = eINSTANCE.getProvidedService_ReferencedService();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.code.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.code.impl.EnvironmentImpl
     * @see fr.obeo.ariadne.model.code.impl.CodePackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__ENTRIES = eINSTANCE.getEnvironment_Entries();

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
