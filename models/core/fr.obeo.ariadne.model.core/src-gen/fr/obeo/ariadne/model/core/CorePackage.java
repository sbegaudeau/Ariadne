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
package fr.obeo.ariadne.model.core;

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
 * @see fr.obeo.ariadne.model.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.core.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.core.editor/src-gen' fileExtensions='ariadnecore' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
 * @generated
 */
public interface CorePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "core";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/Core";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-core";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CorePackage eINSTANCE = fr.obeo.ariadne.model.core.impl.CorePackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.VersionedElementImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersionedElement()
   * @generated
   */
  int VERSIONED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__AUTHORS = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__VERSION = 4;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES = 5;

  /**
   * The number of structural features of the '<em>Versioned Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Versioned Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl <em>Versioned Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersionedDependency()
   * @generated
   */
  int VERSIONED_DEPENDENCY = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__URL = 0;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__LOWER_BOUND = 1;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__UPPER_BOUND = 2;

  /**
   * The feature id for the '<em><b>Includes Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND = 3;

  /**
   * The feature id for the '<em><b>Includes Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND = 4;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__OPTIONAL = 5;

  /**
   * The feature id for the '<em><b>Versioned Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY__VERSIONED_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Versioned Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Versioned Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_DEPENDENCY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.VersionImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersion()
   * @generated
   */
  int VERSION = 2;

  /**
   * The feature id for the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MAJOR = 0;

  /**
   * The feature id for the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MINOR = 1;

  /**
   * The feature id for the '<em><b>Patch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__PATCH = 2;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.PersonImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getPerson()
   * @generated
   */
  int PERSON = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__EMAIL = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.PropertyImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Extended Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__EXTENDED_PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.EntryImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 5;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__VALUES = 1;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.VersionedElement <em>Versioned Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Versioned Element</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement
   * @generated
   */
  EClass getVersionedElement();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getName()
   * @see #getVersionedElement()
   * @generated
   */
  EAttribute getVersionedElement_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getDescription()
   * @see #getVersionedElement()
   * @generated
   */
  EAttribute getVersionedElement_Description();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.core.VersionedElement#getAuthors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Authors</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getAuthors()
   * @see #getVersionedElement()
   * @generated
   */
  EReference getVersionedElement_Authors();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.core.VersionedElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Properties</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getProperties()
   * @see #getVersionedElement()
   * @generated
   */
  EReference getVersionedElement_Properties();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.core.VersionedElement#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getVersion()
   * @see #getVersionedElement()
   * @generated
   */
  EReference getVersionedElement_Version();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.core.VersionedElement#getVersionedDependencies <em>Versioned Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Versioned Dependencies</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedElement#getVersionedDependencies()
   * @see #getVersionedElement()
   * @generated
   */
  EReference getVersionedElement_VersionedDependencies();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.VersionedDependency <em>Versioned Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Versioned Dependency</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency
   * @generated
   */
  EClass getVersionedDependency();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedDependency#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#getUrl()
   * @see #getVersionedDependency()
   * @generated
   */
  EAttribute getVersionedDependency_Url();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.core.VersionedDependency#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#getLowerBound()
   * @see #getVersionedDependency()
   * @generated
   */
  EReference getVersionedDependency_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.ariadne.model.core.VersionedDependency#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#getUpperBound()
   * @see #getVersionedDependency()
   * @generated
   */
  EReference getVersionedDependency_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesLowerBound <em>Includes Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Includes Lower Bound</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#isIncludesLowerBound()
   * @see #getVersionedDependency()
   * @generated
   */
  EAttribute getVersionedDependency_IncludesLowerBound();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesUpperBound <em>Includes Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Includes Upper Bound</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#isIncludesUpperBound()
   * @see #getVersionedDependency()
   * @generated
   */
  EAttribute getVersionedDependency_IncludesUpperBound();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.VersionedDependency#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#isOptional()
   * @see #getVersionedDependency()
   * @generated
   */
  EAttribute getVersionedDependency_Optional();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.core.VersionedDependency#getVersionedElement <em>Versioned Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Versioned Element</em>'.
   * @see fr.obeo.ariadne.model.core.VersionedDependency#getVersionedElement()
   * @see #getVersionedDependency()
   * @generated
   */
  EReference getVersionedDependency_VersionedElement();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see fr.obeo.ariadne.model.core.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Version#getMajor <em>Major</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Major</em>'.
   * @see fr.obeo.ariadne.model.core.Version#getMajor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Major();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Version#getMinor <em>Minor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minor</em>'.
   * @see fr.obeo.ariadne.model.core.Version#getMinor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Minor();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Version#getPatch <em>Patch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Patch</em>'.
   * @see fr.obeo.ariadne.model.core.Version#getPatch()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Patch();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see fr.obeo.ariadne.model.core.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.core.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Person#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see fr.obeo.ariadne.model.core.Person#getEmail()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Email();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see fr.obeo.ariadne.model.core.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.core.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.obeo.ariadne.model.core.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Property#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.core.Property#getIdentifier()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Identifier();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.core.Property#getExtendedProperties <em>Extended Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extended Properties</em>'.
   * @see fr.obeo.ariadne.model.core.Property#getExtendedProperties()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ExtendedProperties();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see fr.obeo.ariadne.model.core.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Entry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see fr.obeo.ariadne.model.core.Entry#getKey()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Key();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.core.Entry#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see fr.obeo.ariadne.model.core.Entry#getValues()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoreFactory getCoreFactory();

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
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.VersionedElementImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersionedElement()
     * @generated
     */
    EClass VERSIONED_ELEMENT = eINSTANCE.getVersionedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_ELEMENT__NAME = eINSTANCE.getVersionedElement_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_ELEMENT__DESCRIPTION = eINSTANCE.getVersionedElement_Description();

    /**
     * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_ELEMENT__AUTHORS = eINSTANCE.getVersionedElement_Authors();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_ELEMENT__PROPERTIES = eINSTANCE.getVersionedElement_Properties();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_ELEMENT__VERSION = eINSTANCE.getVersionedElement_Version();

    /**
     * The meta object literal for the '<em><b>Versioned Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES = eINSTANCE.getVersionedElement_VersionedDependencies();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl <em>Versioned Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersionedDependency()
     * @generated
     */
    EClass VERSIONED_DEPENDENCY = eINSTANCE.getVersionedDependency();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_DEPENDENCY__URL = eINSTANCE.getVersionedDependency_Url();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_DEPENDENCY__LOWER_BOUND = eINSTANCE.getVersionedDependency_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_DEPENDENCY__UPPER_BOUND = eINSTANCE.getVersionedDependency_UpperBound();

    /**
     * The meta object literal for the '<em><b>Includes Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND = eINSTANCE.getVersionedDependency_IncludesLowerBound();

    /**
     * The meta object literal for the '<em><b>Includes Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND = eINSTANCE.getVersionedDependency_IncludesUpperBound();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSIONED_DEPENDENCY__OPTIONAL = eINSTANCE.getVersionedDependency_Optional();

    /**
     * The meta object literal for the '<em><b>Versioned Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_DEPENDENCY__VERSIONED_ELEMENT = eINSTANCE.getVersionedDependency_VersionedElement();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.VersionImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

    /**
     * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

    /**
     * The meta object literal for the '<em><b>Patch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__PATCH = eINSTANCE.getVersion_Patch();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.PersonImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.PropertyImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IDENTIFIER = eINSTANCE.getProperty_Identifier();

    /**
     * The meta object literal for the '<em><b>Extended Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__EXTENDED_PROPERTIES = eINSTANCE.getProperty_ExtendedProperties();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.EntryImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__VALUES = eINSTANCE.getEntry_Values();

  }

} //CorePackage
