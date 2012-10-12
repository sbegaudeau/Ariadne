/**
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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.core.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.core.editor/src-gen' fileExtensions='ariadnecore'"
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
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.ElementImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__AUTHORS = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.VersionedElementImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getVersionedElement()
   * @generated
   */
  int VERSIONED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__AUTHORS = ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__PROPERTIES = ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT__VERSION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Versioned Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Versioned Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSIONED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

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
   * The meta object id for the '{@link fr.obeo.ariadne.model.core.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.core.impl.PropertyImpl
   * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

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
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.core.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see fr.obeo.ariadne.model.core.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.core.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.core.Element#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.obeo.ariadne.model.core.Element#getDescription()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Description();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.core.Element#getAuthors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Authors</em>'.
   * @see fr.obeo.ariadne.model.core.Element#getAuthors()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Authors();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.core.Element#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Properties</em>'.
   * @see fr.obeo.ariadne.model.core.Element#getProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Properties();

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
     * The meta object literal for the '{@link fr.obeo.ariadne.model.core.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.core.impl.ElementImpl
     * @see fr.obeo.ariadne.model.core.impl.CorePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

    /**
     * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__AUTHORS = eINSTANCE.getElement_Authors();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

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
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSIONED_ELEMENT__VERSION = eINSTANCE.getVersionedElement_Version();

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

  }

} //CorePackage
