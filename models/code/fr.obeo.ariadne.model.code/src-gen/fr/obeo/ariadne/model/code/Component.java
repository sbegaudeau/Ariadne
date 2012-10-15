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
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getClasspathEntries <em>Classpath Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getResourcesContainers <em>Resources Containers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getReferencedServices <em>Referenced Services</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getProvidedServices <em>Provided Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Component#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Classpath Entries</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ClasspathEntry}.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classpath Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classpath Entries</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ClasspathEntries()
   * @see fr.obeo.ariadne.model.code.ClasspathEntry#getComponent
   * @model opposite="component" containment="true"
   * @generated
   */
  EList<ClasspathEntry> getClasspathEntries();

  /**
   * Returns the value of the '<em><b>Resources Containers</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ResourcesContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources Containers</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ResourcesContainers()
   * @model containment="true"
   * @generated
   */
  EList<ResourcesContainer> getResourcesContainers();

  /**
   * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subcomponents</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_Subcomponents()
   * @model containment="true"
   * @generated
   */
  EList<Component> getSubcomponents();

  /**
   * Returns the value of the '<em><b>Referenced Services</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ReferencedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Services</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ReferencedServices()
   * @model containment="true"
   * @generated
   */
  EList<ReferencedService> getReferencedServices();

  /**
   * Returns the value of the '<em><b>Provided Services</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ProvidedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Services</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ProvidedServices()
   * @model containment="true"
   * @generated
   */
  EList<ProvidedService> getProvidedServices();

} // Component
