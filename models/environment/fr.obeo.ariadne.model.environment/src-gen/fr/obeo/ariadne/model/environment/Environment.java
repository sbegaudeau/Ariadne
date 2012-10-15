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
package fr.obeo.ariadne.model.environment;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.environment.Environment#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.Environment#getWindowingSystem <em>Windowing System</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.Environment#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.Environment#getLocale <em>Locale</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.Environment#getEnvironmentComponents <em>Environment Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment()
 * @model abstract="true"
 * @generated
 */
public interface Environment extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Operating System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operating System</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operating System</em>' attribute.
   * @see #setOperatingSystem(String)
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment_OperatingSystem()
   * @model unique="false"
   * @generated
   */
  String getOperatingSystem();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.environment.Environment#getOperatingSystem <em>Operating System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operating System</em>' attribute.
   * @see #getOperatingSystem()
   * @generated
   */
  void setOperatingSystem(String value);

  /**
   * Returns the value of the '<em><b>Windowing System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Windowing System</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Windowing System</em>' attribute.
   * @see #setWindowingSystem(String)
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment_WindowingSystem()
   * @model unique="false"
   * @generated
   */
  String getWindowingSystem();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.environment.Environment#getWindowingSystem <em>Windowing System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Windowing System</em>' attribute.
   * @see #getWindowingSystem()
   * @generated
   */
  void setWindowingSystem(String value);

  /**
   * Returns the value of the '<em><b>Architecture</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture</em>' attribute.
   * @see #setArchitecture(String)
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment_Architecture()
   * @model unique="false"
   * @generated
   */
  String getArchitecture();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.environment.Environment#getArchitecture <em>Architecture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture</em>' attribute.
   * @see #getArchitecture()
   * @generated
   */
  void setArchitecture(String value);

  /**
   * Returns the value of the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locale</em>' attribute.
   * @see #setLocale(String)
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment_Locale()
   * @model unique="false"
   * @generated
   */
  String getLocale();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.environment.Environment#getLocale <em>Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locale</em>' attribute.
   * @see #getLocale()
   * @generated
   */
  void setLocale(String value);

  /**
   * Returns the value of the '<em><b>Environment Components</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.environment.EnvironmentComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment Components</em>' containment reference list.
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironment_EnvironmentComponents()
   * @model containment="true"
   * @generated
   */
  EList<EnvironmentComponent> getEnvironmentComponents();

} // Environment
