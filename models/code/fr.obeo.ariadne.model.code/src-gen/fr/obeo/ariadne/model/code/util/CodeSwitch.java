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
package fr.obeo.ariadne.model.code.util;

import fr.obeo.ariadne.model.code.*;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.code.CodePackage
 * @generated
 */
public class CodeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CodePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CodePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CodePackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseVersionedElement(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.RESOURCES_CONTAINER:
      {
        ResourcesContainer resourcesContainer = (ResourcesContainer)theEObject;
        T result = caseResourcesContainer(resourcesContainer);
        if (result == null) result = caseVersionedElement(resourcesContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = caseVersionedElement(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.GENERIC_RESOURCE:
      {
        GenericResource genericResource = (GenericResource)theEObject;
        T result = caseGenericResource(genericResource);
        if (result == null) result = caseResource(genericResource);
        if (result == null) result = caseVersionedElement(genericResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.CLASSPATH_ENTRY:
      {
        ClasspathEntry classpathEntry = (ClasspathEntry)theEObject;
        T result = caseClasspathEntry(classpathEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.TYPES_CONTAINER:
      {
        TypesContainer typesContainer = (TypesContainer)theEObject;
        T result = caseTypesContainer(typesContainer);
        if (result == null) result = caseVersionedElement(typesContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseVersionedElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.CLASSIFIER:
      {
        Classifier classifier = (Classifier)theEObject;
        T result = caseClassifier(classifier);
        if (result == null) result = caseType(classifier);
        if (result == null) result = caseVersionedElement(classifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = caseVersionedElement(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.CONSTRUCTOR:
      {
        Constructor constructor = (Constructor)theEObject;
        T result = caseConstructor(constructor);
        if (result == null) result = caseVersionedElement(constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseVersionedElement(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseVersionedElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = caseType(annotation);
        if (result == null) result = caseVersionedElement(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.ANNOTATION_FIELD:
      {
        AnnotationField annotationField = (AnnotationField)theEObject;
        T result = caseAnnotationField(annotationField);
        if (result == null) result = caseVersionedElement(annotationField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.REFERENCED_SERVICE:
      {
        ReferencedService referencedService = (ReferencedService)theEObject;
        T result = caseReferencedService(referencedService);
        if (result == null) result = caseVersionedElement(referencedService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.PROVIDED_SERVICE:
      {
        ProvidedService providedService = (ProvidedService)theEObject;
        T result = caseProvidedService(providedService);
        if (result == null) result = caseVersionedElement(providedService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CodePackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = caseVersionedElement(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resources Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resources Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourcesContainer(ResourcesContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericResource(GenericResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classpath Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classpath Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClasspathEntry(ClasspathEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypesContainer(TypesContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor(Constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationField(AnnotationField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedService(ReferencedService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedService(ProvidedService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersionedElement(VersionedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CodeSwitch
