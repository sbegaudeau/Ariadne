/**
 */
package fr.obeo.ariadne.model.environment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage
 * @generated
 */
public interface EnvironmentFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EnvironmentFactory eINSTANCE = fr.obeo.ariadne.model.environment.impl.EnvironmentFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  EnvironmentComponent createEnvironmentComponent();

  /**
   * Returns a new object of class '<em>Development Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Development Environment</em>'.
   * @generated
   */
  DevelopmentEnvironment createDevelopmentEnvironment();

  /**
   * Returns a new object of class '<em>Development Tool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Development Tool</em>'.
   * @generated
   */
  DevelopmentTool createDevelopmentTool();

  /**
   * Returns a new object of class '<em>Runtime Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runtime Environment</em>'.
   * @generated
   */
  RuntimeEnvironment createRuntimeEnvironment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EnvironmentPackage getEnvironmentPackage();

} //EnvironmentFactory
