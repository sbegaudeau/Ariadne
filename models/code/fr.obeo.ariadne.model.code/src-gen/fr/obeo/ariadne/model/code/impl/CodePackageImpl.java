/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.Annotation;
import fr.obeo.ariadne.model.code.AnnotationDependency;
import fr.obeo.ariadne.model.code.AnnotationField;
import fr.obeo.ariadne.model.code.Classifier;
import fr.obeo.ariadne.model.code.ClassifierKind;
import fr.obeo.ariadne.model.code.ClasspathEntry;
import fr.obeo.ariadne.model.code.ClasspathEntryKind;
import fr.obeo.ariadne.model.code.CodeFactory;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Component;
import fr.obeo.ariadne.model.code.Constraint;
import fr.obeo.ariadne.model.code.Constructor;
import fr.obeo.ariadne.model.code.ContainmentDependency;
import fr.obeo.ariadne.model.code.Dependency;
import fr.obeo.ariadne.model.code.ExpressionConstraint;
import fr.obeo.ariadne.model.code.Field;
import fr.obeo.ariadne.model.code.GenericResource;
import fr.obeo.ariadne.model.code.InheritanceDependency;
import fr.obeo.ariadne.model.code.Operation;
import fr.obeo.ariadne.model.code.Parameter;
import fr.obeo.ariadne.model.code.ProvidedService;
import fr.obeo.ariadne.model.code.ReferenceDependency;
import fr.obeo.ariadne.model.code.RequiredService;
import fr.obeo.ariadne.model.code.Resource;
import fr.obeo.ariadne.model.code.ResourceKind;
import fr.obeo.ariadne.model.code.ResourcesContainer;
import fr.obeo.ariadne.model.code.Type;
import fr.obeo.ariadne.model.code.TypesContainer;
import fr.obeo.ariadne.model.code.TypingDependency;
import fr.obeo.ariadne.model.code.VersionRangeConstraint;
import fr.obeo.ariadne.model.code.VisibilityKind;

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodePackageImpl extends EPackageImpl implements CodePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourcesContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classpathEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providedServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionRangeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typingDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containmentDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum resourceKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum classpathEntryKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum classifierKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.obeo.ariadne.model.code.CodePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CodePackageImpl()
  {
    super(eNS_URI, CodeFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CodePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CodePackage init()
  {
    if (isInited) return (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

    // Obtain or create and register package
    CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCodePackage.createPackageContents();

    // Initialize created meta-data
    theCodePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCodePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CodePackage.eNS_URI, theCodePackage);
    return theCodePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Identifier()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_ClasspathEntries()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_ResourcesContainers()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_ReferenceDependencies()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_ContainmentDependencies()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourcesContainer()
  {
    return resourcesContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourcesContainer_Path()
  {
    return (EAttribute)resourcesContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourcesContainer_Resources()
  {
    return (EReference)resourcesContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourcesContainer_SubResourcesContainers()
  {
    return (EReference)resourcesContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_InheritanceDependency()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_ReferenceDependencies()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_ContainmentDependencies()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericResource()
  {
    return genericResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericResource_ResourceKind()
  {
    return (EAttribute)genericResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClasspathEntry()
  {
    return classpathEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClasspathEntry_Kind()
  {
    return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClasspathEntry_InputFolder()
  {
    return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClasspathEntry_OutputFolder()
  {
    return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClasspathEntry_TypesContainers()
  {
    return (EReference)classpathEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypesContainer()
  {
    return typesContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesContainer_Types()
  {
    return (EReference)typesContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesContainer_TypesContainers()
  {
    return (EReference)typesContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_QualifiedName()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Visibility()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Types()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_TypingDependencies()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_InheritanceDependencies()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_ReferenceDependencies()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_ContainmentDependencies()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_AnnotationDependencies()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifier()
  {
    return classifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_Kind()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_Static()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_Final()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_Immutable()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_Abstract()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_Fields()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_Operations()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_QualifiedName()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Visibility()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Static()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Abstract()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Final()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Immutable()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Transient()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_TypingDependency()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_InheritanceDependency()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_ReferenceDependencies()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_AnnotationDependencies()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor()
  {
    return constructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_QualifiedName()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Visibility()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Static()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Abstract()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Final()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Immutable()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Transient()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_Parameters()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_TypingDependency()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_InheritanceDependency()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_ReferenceDependencies()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_AnnotationDependencies()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_QualifiedName()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Visibility()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Static()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Abstract()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Final()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Immutable()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Transient()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Parameters()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_TypingDependency()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_InheritanceDependency()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_ReferenceDependencies()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_AnnotationDependencies()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_QualifiedName()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Visibility()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Final()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Immutable()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_TypingDependency()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_ReferenceDependencies()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_AnnotationDependencies()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationFields()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationField()
  {
    return annotationFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationField_QualifiedName()
  {
    return (EAttribute)annotationFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredService()
  {
    return requiredServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequiredService_Identifier()
  {
    return (EAttribute)requiredServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredService_TypingDependencies()
  {
    return (EReference)requiredServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredService_ReferenceDependencies()
  {
    return (EReference)requiredServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidedService()
  {
    return providedServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvidedService_Identifier()
  {
    return (EAttribute)providedServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedService_TypingDependencies()
  {
    return (EReference)providedServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedService_ReferenceDependencies()
  {
    return (EReference)providedServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_Identifier()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Constraints()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Properties()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionRangeConstraint()
  {
    return versionRangeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersionRangeConstraint_IncludeLowerVersionBound()
  {
    return (EAttribute)versionRangeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersionRangeConstraint_IncludeUpperVersionBound()
  {
    return (EAttribute)versionRangeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVersionRangeConstraint_LowerVersion()
  {
    return (EReference)versionRangeConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVersionRangeConstraint_UpperVersion()
  {
    return (EReference)versionRangeConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionConstraint()
  {
    return expressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionConstraint_Expression()
  {
    return (EAttribute)expressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionConstraint_Language()
  {
    return (EAttribute)expressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypingDependency()
  {
    return typingDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypingDependency_TypeParameters()
  {
    return (EAttribute)typingDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceDependency()
  {
    return inheritanceDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceDependency_TypeParameters()
  {
    return (EAttribute)inheritanceDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceDependency()
  {
    return referenceDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceDependency_Kind()
  {
    return (EAttribute)referenceDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainmentDependency()
  {
    return containmentDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationDependency()
  {
    return annotationDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationDependency_Values()
  {
    return (EAttribute)annotationDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResourceKind()
  {
    return resourceKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getClasspathEntryKind()
  {
    return classpathEntryKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getClassifierKind()
  {
    return classifierKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibilityKind()
  {
    return visibilityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeFactory getCodeFactory()
  {
    return (CodeFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__IDENTIFIER);
    createEReference(componentEClass, COMPONENT__CLASSPATH_ENTRIES);
    createEReference(componentEClass, COMPONENT__RESOURCES_CONTAINERS);
    createEReference(componentEClass, COMPONENT__REFERENCE_DEPENDENCIES);
    createEReference(componentEClass, COMPONENT__CONTAINMENT_DEPENDENCIES);

    resourcesContainerEClass = createEClass(RESOURCES_CONTAINER);
    createEAttribute(resourcesContainerEClass, RESOURCES_CONTAINER__PATH);
    createEReference(resourcesContainerEClass, RESOURCES_CONTAINER__RESOURCES);
    createEReference(resourcesContainerEClass, RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS);

    resourceEClass = createEClass(RESOURCE);
    createEReference(resourceEClass, RESOURCE__INHERITANCE_DEPENDENCY);
    createEReference(resourceEClass, RESOURCE__REFERENCE_DEPENDENCIES);
    createEReference(resourceEClass, RESOURCE__CONTAINMENT_DEPENDENCIES);

    genericResourceEClass = createEClass(GENERIC_RESOURCE);
    createEAttribute(genericResourceEClass, GENERIC_RESOURCE__RESOURCE_KIND);

    classpathEntryEClass = createEClass(CLASSPATH_ENTRY);
    createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__KIND);
    createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__INPUT_FOLDER);
    createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__OUTPUT_FOLDER);
    createEReference(classpathEntryEClass, CLASSPATH_ENTRY__TYPES_CONTAINERS);

    typesContainerEClass = createEClass(TYPES_CONTAINER);
    createEReference(typesContainerEClass, TYPES_CONTAINER__TYPES);
    createEReference(typesContainerEClass, TYPES_CONTAINER__TYPES_CONTAINERS);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__QUALIFIED_NAME);
    createEAttribute(typeEClass, TYPE__VISIBILITY);
    createEReference(typeEClass, TYPE__TYPES);
    createEReference(typeEClass, TYPE__TYPING_DEPENDENCIES);
    createEReference(typeEClass, TYPE__INHERITANCE_DEPENDENCIES);
    createEReference(typeEClass, TYPE__REFERENCE_DEPENDENCIES);
    createEReference(typeEClass, TYPE__CONTAINMENT_DEPENDENCIES);
    createEReference(typeEClass, TYPE__ANNOTATION_DEPENDENCIES);

    classifierEClass = createEClass(CLASSIFIER);
    createEAttribute(classifierEClass, CLASSIFIER__KIND);
    createEAttribute(classifierEClass, CLASSIFIER__STATIC);
    createEAttribute(classifierEClass, CLASSIFIER__FINAL);
    createEAttribute(classifierEClass, CLASSIFIER__IMMUTABLE);
    createEAttribute(classifierEClass, CLASSIFIER__ABSTRACT);
    createEReference(classifierEClass, CLASSIFIER__FIELDS);
    createEReference(classifierEClass, CLASSIFIER__OPERATIONS);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__QUALIFIED_NAME);
    createEAttribute(fieldEClass, FIELD__VISIBILITY);
    createEAttribute(fieldEClass, FIELD__STATIC);
    createEAttribute(fieldEClass, FIELD__ABSTRACT);
    createEAttribute(fieldEClass, FIELD__FINAL);
    createEAttribute(fieldEClass, FIELD__IMMUTABLE);
    createEAttribute(fieldEClass, FIELD__TRANSIENT);
    createEReference(fieldEClass, FIELD__TYPING_DEPENDENCY);
    createEReference(fieldEClass, FIELD__INHERITANCE_DEPENDENCY);
    createEReference(fieldEClass, FIELD__REFERENCE_DEPENDENCIES);
    createEReference(fieldEClass, FIELD__ANNOTATION_DEPENDENCIES);

    constructorEClass = createEClass(CONSTRUCTOR);
    createEAttribute(constructorEClass, CONSTRUCTOR__QUALIFIED_NAME);
    createEAttribute(constructorEClass, CONSTRUCTOR__VISIBILITY);
    createEAttribute(constructorEClass, CONSTRUCTOR__STATIC);
    createEAttribute(constructorEClass, CONSTRUCTOR__ABSTRACT);
    createEAttribute(constructorEClass, CONSTRUCTOR__FINAL);
    createEAttribute(constructorEClass, CONSTRUCTOR__IMMUTABLE);
    createEAttribute(constructorEClass, CONSTRUCTOR__TRANSIENT);
    createEReference(constructorEClass, CONSTRUCTOR__PARAMETERS);
    createEReference(constructorEClass, CONSTRUCTOR__TYPING_DEPENDENCY);
    createEReference(constructorEClass, CONSTRUCTOR__INHERITANCE_DEPENDENCY);
    createEReference(constructorEClass, CONSTRUCTOR__REFERENCE_DEPENDENCIES);
    createEReference(constructorEClass, CONSTRUCTOR__ANNOTATION_DEPENDENCIES);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__QUALIFIED_NAME);
    createEAttribute(operationEClass, OPERATION__VISIBILITY);
    createEAttribute(operationEClass, OPERATION__STATIC);
    createEAttribute(operationEClass, OPERATION__ABSTRACT);
    createEAttribute(operationEClass, OPERATION__FINAL);
    createEAttribute(operationEClass, OPERATION__IMMUTABLE);
    createEAttribute(operationEClass, OPERATION__TRANSIENT);
    createEReference(operationEClass, OPERATION__PARAMETERS);
    createEReference(operationEClass, OPERATION__TYPING_DEPENDENCY);
    createEReference(operationEClass, OPERATION__INHERITANCE_DEPENDENCY);
    createEReference(operationEClass, OPERATION__REFERENCE_DEPENDENCIES);
    createEReference(operationEClass, OPERATION__ANNOTATION_DEPENDENCIES);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__QUALIFIED_NAME);
    createEAttribute(parameterEClass, PARAMETER__VISIBILITY);
    createEAttribute(parameterEClass, PARAMETER__FINAL);
    createEAttribute(parameterEClass, PARAMETER__IMMUTABLE);
    createEReference(parameterEClass, PARAMETER__TYPING_DEPENDENCY);
    createEReference(parameterEClass, PARAMETER__REFERENCE_DEPENDENCIES);
    createEReference(parameterEClass, PARAMETER__ANNOTATION_DEPENDENCIES);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_FIELDS);

    annotationFieldEClass = createEClass(ANNOTATION_FIELD);
    createEAttribute(annotationFieldEClass, ANNOTATION_FIELD__QUALIFIED_NAME);

    requiredServiceEClass = createEClass(REQUIRED_SERVICE);
    createEAttribute(requiredServiceEClass, REQUIRED_SERVICE__IDENTIFIER);
    createEReference(requiredServiceEClass, REQUIRED_SERVICE__TYPING_DEPENDENCIES);
    createEReference(requiredServiceEClass, REQUIRED_SERVICE__REFERENCE_DEPENDENCIES);

    providedServiceEClass = createEClass(PROVIDED_SERVICE);
    createEAttribute(providedServiceEClass, PROVIDED_SERVICE__IDENTIFIER);
    createEReference(providedServiceEClass, PROVIDED_SERVICE__TYPING_DEPENDENCIES);
    createEReference(providedServiceEClass, PROVIDED_SERVICE__REFERENCE_DEPENDENCIES);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__IDENTIFIER);
    createEReference(dependencyEClass, DEPENDENCY__CONSTRAINTS);
    createEReference(dependencyEClass, DEPENDENCY__PROPERTIES);

    constraintEClass = createEClass(CONSTRAINT);

    versionRangeConstraintEClass = createEClass(VERSION_RANGE_CONSTRAINT);
    createEAttribute(versionRangeConstraintEClass, VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND);
    createEAttribute(versionRangeConstraintEClass, VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND);
    createEReference(versionRangeConstraintEClass, VERSION_RANGE_CONSTRAINT__LOWER_VERSION);
    createEReference(versionRangeConstraintEClass, VERSION_RANGE_CONSTRAINT__UPPER_VERSION);

    expressionConstraintEClass = createEClass(EXPRESSION_CONSTRAINT);
    createEAttribute(expressionConstraintEClass, EXPRESSION_CONSTRAINT__EXPRESSION);
    createEAttribute(expressionConstraintEClass, EXPRESSION_CONSTRAINT__LANGUAGE);

    typingDependencyEClass = createEClass(TYPING_DEPENDENCY);
    createEAttribute(typingDependencyEClass, TYPING_DEPENDENCY__TYPE_PARAMETERS);

    inheritanceDependencyEClass = createEClass(INHERITANCE_DEPENDENCY);
    createEAttribute(inheritanceDependencyEClass, INHERITANCE_DEPENDENCY__TYPE_PARAMETERS);

    referenceDependencyEClass = createEClass(REFERENCE_DEPENDENCY);
    createEAttribute(referenceDependencyEClass, REFERENCE_DEPENDENCY__KIND);

    containmentDependencyEClass = createEClass(CONTAINMENT_DEPENDENCY);

    annotationDependencyEClass = createEClass(ANNOTATION_DEPENDENCY);
    createEAttribute(annotationDependencyEClass, ANNOTATION_DEPENDENCY__VALUES);

    // Create enums
    resourceKindEEnum = createEEnum(RESOURCE_KIND);
    classpathEntryKindEEnum = createEEnum(CLASSPATH_ENTRY_KIND);
    classifierKindEEnum = createEEnum(CLASSIFIER_KIND);
    visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    componentEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    resourcesContainerEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    resourceEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    genericResourceEClass.getESuperTypes().add(this.getResource());
    typesContainerEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    typeEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    classifierEClass.getESuperTypes().add(this.getType());
    fieldEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    constructorEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    operationEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    parameterEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    annotationEClass.getESuperTypes().add(this.getType());
    requiredServiceEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    providedServiceEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    typingDependencyEClass.getESuperTypes().add(this.getDependency());
    inheritanceDependencyEClass.getESuperTypes().add(this.getDependency());
    referenceDependencyEClass.getESuperTypes().add(this.getDependency());
    containmentDependencyEClass.getESuperTypes().add(this.getDependency());
    annotationDependencyEClass.getESuperTypes().add(this.getDependency());

    // Initialize classes, features, and operations; add parameters
    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_ClasspathEntries(), this.getClasspathEntry(), null, "classpathEntries", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_ResourcesContainers(), this.getResourcesContainer(), null, "resourcesContainers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_ContainmentDependencies(), this.getContainmentDependency(), null, "containmentDependencies", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourcesContainerEClass, ResourcesContainer.class, "ResourcesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourcesContainer_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourcesContainer_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourcesContainer_SubResourcesContainers(), this.getResourcesContainer(), null, "subResourcesContainers", null, 0, -1, ResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResource_InheritanceDependency(), this.getInheritanceDependency(), null, "inheritanceDependency", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResource_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResource_ContainmentDependencies(), this.getContainmentDependency(), null, "containmentDependencies", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericResourceEClass, GenericResource.class, "GenericResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericResource_ResourceKind(), this.getResourceKind(), "resourceKind", null, 0, 1, GenericResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classpathEntryEClass, ClasspathEntry.class, "ClasspathEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClasspathEntry_Kind(), this.getClasspathEntryKind(), "kind", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClasspathEntry_InputFolder(), theEcorePackage.getEString(), "inputFolder", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClasspathEntry_OutputFolder(), theEcorePackage.getEString(), "outputFolder", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClasspathEntry_TypesContainers(), this.getTypesContainer(), null, "typesContainers", null, 0, -1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesContainerEClass, TypesContainer.class, "TypesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypesContainer_Types(), this.getType(), null, "types", null, 0, -1, TypesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypesContainer_TypesContainers(), this.getTypesContainer(), null, "typesContainers", null, 0, -1, TypesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Types(), this.getType(), null, "types", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_TypingDependencies(), this.getTypingDependency(), null, "typingDependencies", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_InheritanceDependencies(), this.getInheritanceDependency(), null, "inheritanceDependencies", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_ContainmentDependencies(), this.getContainmentDependency(), null, "containmentDependencies", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_AnnotationDependencies(), this.getAnnotationDependency(), null, "annotationDependencies", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassifier_Kind(), this.getClassifierKind(), "kind", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifier_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifier_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifier_Immutable(), theEcorePackage.getEBoolean(), "immutable", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifier_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifier_Fields(), this.getField(), null, "fields", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifier_Operations(), this.getOperation(), null, "operations", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Immutable(), theEcorePackage.getEBoolean(), "immutable", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Transient(), theEcorePackage.getEBoolean(), "transient", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_TypingDependency(), this.getTypingDependency(), null, "typingDependency", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_InheritanceDependency(), this.getInheritanceDependency(), null, "inheritanceDependency", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_AnnotationDependencies(), this.getAnnotationDependency(), null, "annotationDependencies", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructor_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Immutable(), theEcorePackage.getEBoolean(), "immutable", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Transient(), theEcorePackage.getEBoolean(), "transient", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_TypingDependency(), this.getTypingDependency(), null, "typingDependency", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_InheritanceDependency(), this.getInheritanceDependency(), null, "inheritanceDependency", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_AnnotationDependencies(), this.getAnnotationDependency(), null, "annotationDependencies", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Immutable(), theEcorePackage.getEBoolean(), "immutable", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Transient(), theEcorePackage.getEBoolean(), "transient", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_TypingDependency(), this.getTypingDependency(), null, "typingDependency", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_InheritanceDependency(), this.getInheritanceDependency(), null, "inheritanceDependency", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_AnnotationDependencies(), this.getAnnotationDependency(), null, "annotationDependencies", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Immutable(), theEcorePackage.getEBoolean(), "immutable", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_TypingDependency(), this.getTypingDependency(), null, "typingDependency", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_AnnotationDependencies(), this.getAnnotationDependency(), null, "annotationDependencies", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_AnnotationFields(), this.getAnnotationField(), null, "annotationFields", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationFieldEClass, AnnotationField.class, "AnnotationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationField_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, AnnotationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredServiceEClass, RequiredService.class, "RequiredService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequiredService_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, RequiredService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequiredService_TypingDependencies(), this.getTypingDependency(), null, "typingDependencies", null, 0, -1, RequiredService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequiredService_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, RequiredService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providedServiceEClass, ProvidedService.class, "ProvidedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvidedService_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedService_TypingDependencies(), this.getTypingDependency(), null, "typingDependencies", null, 0, -1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedService_ReferenceDependencies(), this.getReferenceDependency(), null, "referenceDependencies", null, 0, -1, ProvidedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependency_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependency_Properties(), theCorePackage.getProperty(), null, "properties", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(versionRangeConstraintEClass, VersionRangeConstraint.class, "VersionRangeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersionRangeConstraint_IncludeLowerVersionBound(), theEcorePackage.getEBoolean(), "includeLowerVersionBound", null, 0, 1, VersionRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersionRangeConstraint_IncludeUpperVersionBound(), theEcorePackage.getEBoolean(), "includeUpperVersionBound", null, 0, 1, VersionRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVersionRangeConstraint_LowerVersion(), theCorePackage.getVersion(), null, "lowerVersion", null, 0, 1, VersionRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVersionRangeConstraint_UpperVersion(), theCorePackage.getVersion(), null, "upperVersion", null, 0, 1, VersionRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionConstraintEClass, ExpressionConstraint.class, "ExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionConstraint_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, ExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionConstraint_Language(), theEcorePackage.getEString(), "language", null, 0, 1, ExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typingDependencyEClass, TypingDependency.class, "TypingDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypingDependency_TypeParameters(), theEcorePackage.getEString(), "typeParameters", null, 0, -1, TypingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceDependencyEClass, InheritanceDependency.class, "InheritanceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritanceDependency_TypeParameters(), theEcorePackage.getEString(), "typeParameters", null, 0, -1, InheritanceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceDependencyEClass, ReferenceDependency.class, "ReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceDependency_Kind(), theEcorePackage.getEString(), "kind", null, 0, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containmentDependencyEClass, ContainmentDependency.class, "ContainmentDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationDependencyEClass, AnnotationDependency.class, "AnnotationDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationDependency_Values(), theEcorePackage.getEString(), "values", null, 0, -1, AnnotationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(resourceKindEEnum, ResourceKind.class, "ResourceKind");
    addEEnumLiteral(resourceKindEEnum, ResourceKind.MANIFEST);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.LICENSE);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.COPYRIGHT);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.ICONS);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.VIDEO);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.MEDIA);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.DOCUMENTATION);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.INTERNATIONALIZATION);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.USER_INTERFACE);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.SERVICE);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.SETTINGS);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.CONFIGURATION);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.TEMPLATE);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.MODEL);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.BUILD);
    addEEnumLiteral(resourceKindEEnum, ResourceKind.LIBRARY);

    initEEnum(classpathEntryKindEEnum, ClasspathEntryKind.class, "ClasspathEntryKind");
    addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.SOURCE);
    addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.CONTAINER);
    addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.OUTPUT);

    initEEnum(classifierKindEEnum, ClassifierKind.class, "ClassifierKind");
    addEEnumLiteral(classifierKindEEnum, ClassifierKind.CLASS);
    addEEnumLiteral(classifierKindEEnum, ClassifierKind.INTERFACE);
    addEEnumLiteral(classifierKindEEnum, ClassifierKind.OBJECT);
    addEEnumLiteral(classifierKindEEnum, ClassifierKind.TRAIT);

    initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);

    // Create resource
    createResource(eNS_URI);
  }

} //CodePackageImpl
