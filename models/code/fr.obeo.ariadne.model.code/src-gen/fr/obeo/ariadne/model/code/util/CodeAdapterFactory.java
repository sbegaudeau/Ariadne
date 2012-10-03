/**
 */
package fr.obeo.ariadne.model.code.util;

import fr.obeo.ariadne.model.code.*;

import fr.obeo.ariadne.model.core.Element;
import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.code.CodePackage
 * @generated
 */
public class CodeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CodePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CodePackage.eINSTANCE;
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
  protected CodeSwitch<Adapter> modelSwitch =
    new CodeSwitch<Adapter>()
    {
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseResourcesContainer(ResourcesContainer object)
      {
        return createResourcesContainerAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseGenericResource(GenericResource object)
      {
        return createGenericResourceAdapter();
      }
      @Override
      public Adapter caseClasspathEntry(ClasspathEntry object)
      {
        return createClasspathEntryAdapter();
      }
      @Override
      public Adapter caseTypesContainer(TypesContainer object)
      {
        return createTypesContainerAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseClassifier(Classifier object)
      {
        return createClassifierAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationField(AnnotationField object)
      {
        return createAnnotationFieldAdapter();
      }
      @Override
      public Adapter caseRequiredService(RequiredService object)
      {
        return createRequiredServiceAdapter();
      }
      @Override
      public Adapter caseProvidedService(ProvidedService object)
      {
        return createProvidedServiceAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseVersionRangeConstraint(VersionRangeConstraint object)
      {
        return createVersionRangeConstraintAdapter();
      }
      @Override
      public Adapter caseExpressionConstraint(ExpressionConstraint object)
      {
        return createExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseTypingDependency(TypingDependency object)
      {
        return createTypingDependencyAdapter();
      }
      @Override
      public Adapter caseInheritanceDependency(InheritanceDependency object)
      {
        return createInheritanceDependencyAdapter();
      }
      @Override
      public Adapter caseReferenceDependency(ReferenceDependency object)
      {
        return createReferenceDependencyAdapter();
      }
      @Override
      public Adapter caseContainmentDependency(ContainmentDependency object)
      {
        return createContainmentDependencyAdapter();
      }
      @Override
      public Adapter caseAnnotationDependency(AnnotationDependency object)
      {
        return createAnnotationDependencyAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ResourcesContainer <em>Resources Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ResourcesContainer
   * @generated
   */
  public Adapter createResourcesContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.GenericResource <em>Generic Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.GenericResource
   * @generated
   */
  public Adapter createGenericResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ClasspathEntry <em>Classpath Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ClasspathEntry
   * @generated
   */
  public Adapter createClasspathEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.TypesContainer <em>Types Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.TypesContainer
   * @generated
   */
  public Adapter createTypesContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Classifier
   * @generated
   */
  public Adapter createClassifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.AnnotationField <em>Annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.AnnotationField
   * @generated
   */
  public Adapter createAnnotationFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.RequiredService
   * @generated
   */
  public Adapter createRequiredServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ProvidedService <em>Provided Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ProvidedService
   * @generated
   */
  public Adapter createProvidedServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint <em>Version Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.VersionRangeConstraint
   * @generated
   */
  public Adapter createVersionRangeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ExpressionConstraint <em>Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ExpressionConstraint
   * @generated
   */
  public Adapter createExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.TypingDependency <em>Typing Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.TypingDependency
   * @generated
   */
  public Adapter createTypingDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.InheritanceDependency <em>Inheritance Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.InheritanceDependency
   * @generated
   */
  public Adapter createInheritanceDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ReferenceDependency <em>Reference Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ReferenceDependency
   * @generated
   */
  public Adapter createReferenceDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.ContainmentDependency <em>Containment Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.ContainmentDependency
   * @generated
   */
  public Adapter createContainmentDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.ariadne.model.code.AnnotationDependency <em>Annotation Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.ariadne.model.code.AnnotationDependency
   * @generated
   */
  public Adapter createAnnotationDependencyAdapter()
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

} //CodeAdapterFactory
