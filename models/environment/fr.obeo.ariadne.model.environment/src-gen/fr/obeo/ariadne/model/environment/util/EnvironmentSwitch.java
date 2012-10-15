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
package fr.obeo.ariadne.model.environment.util;

import fr.obeo.ariadne.model.core.VersionedElement;

import fr.obeo.ariadne.model.environment.*;

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
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage
 * @generated
 */
public class EnvironmentSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EnvironmentPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EnvironmentPackage.eINSTANCE;
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
      case EnvironmentPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = caseVersionedElement(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EnvironmentPackage.ENVIRONMENT_COMPONENT:
      {
        EnvironmentComponent environmentComponent = (EnvironmentComponent)theEObject;
        T result = caseEnvironmentComponent(environmentComponent);
        if (result == null) result = caseVersionedElement(environmentComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT:
      {
        DevelopmentEnvironment developmentEnvironment = (DevelopmentEnvironment)theEObject;
        T result = caseDevelopmentEnvironment(developmentEnvironment);
        if (result == null) result = caseEnvironment(developmentEnvironment);
        if (result == null) result = caseVersionedElement(developmentEnvironment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EnvironmentPackage.DEVELOPMENT_TOOL:
      {
        DevelopmentTool developmentTool = (DevelopmentTool)theEObject;
        T result = caseDevelopmentTool(developmentTool);
        if (result == null) result = caseVersionedElement(developmentTool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EnvironmentPackage.RUNTIME_ENVIRONMENT:
      {
        RuntimeEnvironment runtimeEnvironment = (RuntimeEnvironment)theEObject;
        T result = caseRuntimeEnvironment(runtimeEnvironment);
        if (result == null) result = caseEnvironment(runtimeEnvironment);
        if (result == null) result = caseVersionedElement(runtimeEnvironment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T caseEnvironmentComponent(EnvironmentComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Development Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Development Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevelopmentEnvironment(DevelopmentEnvironment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Development Tool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Development Tool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevelopmentTool(DevelopmentTool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Runtime Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Runtime Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuntimeEnvironment(RuntimeEnvironment object)
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

} //EnvironmentSwitch
