/**
 */
package fr.obeo.ariadne.model.environment.impl;

import fr.obeo.ariadne.model.environment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentFactoryImpl extends EFactoryImpl implements EnvironmentFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnvironmentFactory init()
  {
    try
    {
      EnvironmentFactory theEnvironmentFactory = (EnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/Ariadne/Environment"); 
      if (theEnvironmentFactory != null)
      {
        return theEnvironmentFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EnvironmentFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EnvironmentPackage.ENVIRONMENT_COMPONENT: return createEnvironmentComponent();
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT: return createDevelopmentEnvironment();
      case EnvironmentPackage.DEVELOPMENT_TOOL: return createDevelopmentTool();
      case EnvironmentPackage.RUNTIME_ENVIRONMENT: return createRuntimeEnvironment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentComponent createEnvironmentComponent()
  {
    EnvironmentComponentImpl environmentComponent = new EnvironmentComponentImpl();
    return environmentComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentEnvironment createDevelopmentEnvironment()
  {
    DevelopmentEnvironmentImpl developmentEnvironment = new DevelopmentEnvironmentImpl();
    return developmentEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentTool createDevelopmentTool()
  {
    DevelopmentToolImpl developmentTool = new DevelopmentToolImpl();
    return developmentTool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuntimeEnvironment createRuntimeEnvironment()
  {
    RuntimeEnvironmentImpl runtimeEnvironment = new RuntimeEnvironmentImpl();
    return runtimeEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentPackage getEnvironmentPackage()
  {
    return (EnvironmentPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EnvironmentPackage getPackage()
  {
    return EnvironmentPackage.eINSTANCE;
  }

} //EnvironmentFactoryImpl
