/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.code.CodePackage
 * @generated
 */
public interface CodeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CodeFactory eINSTANCE = fr.obeo.ariadne.model.code.impl.CodeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Resources Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resources Container</em>'.
   * @generated
   */
  ResourcesContainer createResourcesContainer();

  /**
   * Returns a new object of class '<em>Generic Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Resource</em>'.
   * @generated
   */
  GenericResource createGenericResource();

  /**
   * Returns a new object of class '<em>Classpath Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classpath Entry</em>'.
   * @generated
   */
  ClasspathEntry createClasspathEntry();

  /**
   * Returns a new object of class '<em>Types Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types Container</em>'.
   * @generated
   */
  TypesContainer createTypesContainer();

  /**
   * Returns a new object of class '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier</em>'.
   * @generated
   */
  Classifier createClassifier();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor</em>'.
   * @generated
   */
  Constructor createConstructor();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Annotation Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Field</em>'.
   * @generated
   */
  AnnotationField createAnnotationField();

  /**
   * Returns a new object of class '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Service</em>'.
   * @generated
   */
  RequiredService createRequiredService();

  /**
   * Returns a new object of class '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Service</em>'.
   * @generated
   */
  ProvidedService createProvidedService();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Version Range Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version Range Constraint</em>'.
   * @generated
   */
  VersionRangeConstraint createVersionRangeConstraint();

  /**
   * Returns a new object of class '<em>Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Constraint</em>'.
   * @generated
   */
  ExpressionConstraint createExpressionConstraint();

  /**
   * Returns a new object of class '<em>Typing Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typing Dependency</em>'.
   * @generated
   */
  TypingDependency createTypingDependency();

  /**
   * Returns a new object of class '<em>Inheritance Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Dependency</em>'.
   * @generated
   */
  InheritanceDependency createInheritanceDependency();

  /**
   * Returns a new object of class '<em>Reference Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Dependency</em>'.
   * @generated
   */
  ReferenceDependency createReferenceDependency();

  /**
   * Returns a new object of class '<em>Containment Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Containment Dependency</em>'.
   * @generated
   */
  ContainmentDependency createContainmentDependency();

  /**
   * Returns a new object of class '<em>Annotation Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Dependency</em>'.
   * @generated
   */
  AnnotationDependency createAnnotationDependency();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CodePackage getCodePackage();

} //CodeFactory
