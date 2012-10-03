/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CodeFactory init()
  {
    try
    {
      CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/Ariadne/Code"); 
      if (theCodeFactory != null)
      {
        return theCodeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CodeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeFactoryImpl()
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
      case CodePackage.COMPONENT: return createComponent();
      case CodePackage.RESOURCES_CONTAINER: return createResourcesContainer();
      case CodePackage.GENERIC_RESOURCE: return createGenericResource();
      case CodePackage.CLASSPATH_ENTRY: return createClasspathEntry();
      case CodePackage.TYPES_CONTAINER: return createTypesContainer();
      case CodePackage.CLASSIFIER: return createClassifier();
      case CodePackage.FIELD: return createField();
      case CodePackage.CONSTRUCTOR: return createConstructor();
      case CodePackage.OPERATION: return createOperation();
      case CodePackage.PARAMETER: return createParameter();
      case CodePackage.ANNOTATION: return createAnnotation();
      case CodePackage.ANNOTATION_FIELD: return createAnnotationField();
      case CodePackage.REQUIRED_SERVICE: return createRequiredService();
      case CodePackage.PROVIDED_SERVICE: return createProvidedService();
      case CodePackage.DEPENDENCY: return createDependency();
      case CodePackage.VERSION_RANGE_CONSTRAINT: return createVersionRangeConstraint();
      case CodePackage.EXPRESSION_CONSTRAINT: return createExpressionConstraint();
      case CodePackage.TYPING_DEPENDENCY: return createTypingDependency();
      case CodePackage.INHERITANCE_DEPENDENCY: return createInheritanceDependency();
      case CodePackage.REFERENCE_DEPENDENCY: return createReferenceDependency();
      case CodePackage.CONTAINMENT_DEPENDENCY: return createContainmentDependency();
      case CodePackage.ANNOTATION_DEPENDENCY: return createAnnotationDependency();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CodePackage.RESOURCE_KIND:
        return createResourceKindFromString(eDataType, initialValue);
      case CodePackage.CLASSPATH_ENTRY_KIND:
        return createClasspathEntryKindFromString(eDataType, initialValue);
      case CodePackage.CLASSIFIER_KIND:
        return createClassifierKindFromString(eDataType, initialValue);
      case CodePackage.VISIBILITY_KIND:
        return createVisibilityKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CodePackage.RESOURCE_KIND:
        return convertResourceKindToString(eDataType, instanceValue);
      case CodePackage.CLASSPATH_ENTRY_KIND:
        return convertClasspathEntryKindToString(eDataType, instanceValue);
      case CodePackage.CLASSIFIER_KIND:
        return convertClassifierKindToString(eDataType, instanceValue);
      case CodePackage.VISIBILITY_KIND:
        return convertVisibilityKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourcesContainer createResourcesContainer()
  {
    ResourcesContainerImpl resourcesContainer = new ResourcesContainerImpl();
    return resourcesContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericResource createGenericResource()
  {
    GenericResourceImpl genericResource = new GenericResourceImpl();
    return genericResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasspathEntry createClasspathEntry()
  {
    ClasspathEntryImpl classpathEntry = new ClasspathEntryImpl();
    return classpathEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesContainer createTypesContainer()
  {
    TypesContainerImpl typesContainer = new TypesContainerImpl();
    return typesContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier createClassifier()
  {
    ClassifierImpl classifier = new ClassifierImpl();
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationField createAnnotationField()
  {
    AnnotationFieldImpl annotationField = new AnnotationFieldImpl();
    return annotationField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredService createRequiredService()
  {
    RequiredServiceImpl requiredService = new RequiredServiceImpl();
    return requiredService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedService createProvidedService()
  {
    ProvidedServiceImpl providedService = new ProvidedServiceImpl();
    return providedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionRangeConstraint createVersionRangeConstraint()
  {
    VersionRangeConstraintImpl versionRangeConstraint = new VersionRangeConstraintImpl();
    return versionRangeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionConstraint createExpressionConstraint()
  {
    ExpressionConstraintImpl expressionConstraint = new ExpressionConstraintImpl();
    return expressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingDependency createTypingDependency()
  {
    TypingDependencyImpl typingDependency = new TypingDependencyImpl();
    return typingDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceDependency createInheritanceDependency()
  {
    InheritanceDependencyImpl inheritanceDependency = new InheritanceDependencyImpl();
    return inheritanceDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceDependency createReferenceDependency()
  {
    ReferenceDependencyImpl referenceDependency = new ReferenceDependencyImpl();
    return referenceDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainmentDependency createContainmentDependency()
  {
    ContainmentDependencyImpl containmentDependency = new ContainmentDependencyImpl();
    return containmentDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDependency createAnnotationDependency()
  {
    AnnotationDependencyImpl annotationDependency = new AnnotationDependencyImpl();
    return annotationDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceKind createResourceKindFromString(EDataType eDataType, String initialValue)
  {
    ResourceKind result = ResourceKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertResourceKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasspathEntryKind createClasspathEntryKindFromString(EDataType eDataType, String initialValue)
  {
    ClasspathEntryKind result = ClasspathEntryKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertClasspathEntryKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierKind createClassifierKindFromString(EDataType eDataType, String initialValue)
  {
    ClassifierKind result = ClassifierKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertClassifierKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue)
  {
    VisibilityKind result = VisibilityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodePackage getCodePackage()
  {
    return (CodePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CodePackage getPackage()
  {
    return CodePackage.eINSTANCE;
  }

} //CodeFactoryImpl
