/**
 */
package fr.obeo.ariadne.model.environment.util;

import fr.obeo.ariadne.model.core.Element;
import fr.obeo.ariadne.model.core.VersionedElement;

import fr.obeo.ariadne.model.environment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage
 * @generated
 */
public class EnvironmentAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EnvironmentPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EnvironmentPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentSwitch<Adapter> modelSwitch =
    new EnvironmentSwitch<Adapter>()
    {
      @Override
      public Adapter caseEnvironment(Environment object)
      {
        return createEnvironmentAdapter();
      }
      @Override
      public Adapter caseEnvironmentComponent(EnvironmentComponent object)
      {
        return createEnvironmentComponentAdapter();
      }
      @Override
      public Adapter caseDevelopmentEnvironment(DevelopmentEnvironment object)
      {
        return createDevelopmentEnvironmentAdapter();
      }
      @Override
      public Adapter caseDevelopmentTool(DevelopmentTool object)
      {
        return createDevelopmentToolAdapter();
      }
      @Override
      public Adapter caseRuntimeEnvironment(RuntimeEnvironment object)
      {
        return createRuntimeEnvironmentAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseVersionedElement(VersionedElement object)
      {
        return createVersionedElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.environment.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.environment.Environment
   * @generated
   */
  public Adapter createEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.environment.EnvironmentComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.environment.EnvironmentComponent
   * @generated
   */
  public Adapter createEnvironmentComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.environment.DevelopmentEnvironment <em>Development Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.environment.DevelopmentEnvironment
   * @generated
   */
  public Adapter createDevelopmentEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.environment.DevelopmentTool <em>Development Tool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.environment.DevelopmentTool
   * @generated
   */
  public Adapter createDevelopmentToolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.environment.RuntimeEnvironment <em>Runtime Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.environment.RuntimeEnvironment
   * @generated
   */
  public Adapter createRuntimeEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.core.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.core.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.core.VersionedElement <em>Versioned Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.core.VersionedElement
   * @generated
   */
  public Adapter createVersionedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EnvironmentAdapterFactory
