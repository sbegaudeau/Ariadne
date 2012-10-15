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
package fr.obeo.ariadne.model.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getAuthors <em>Authors</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getVersionedDependencies <em>Versioned Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement()
 * @model abstract="true"
 * @generated
 */
public interface VersionedElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedElement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Authors</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authors</em>' reference list.
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Authors()
   * @model
   * @generated
   */
  EList<Person> getAuthors();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' reference list.
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Properties()
   * @model
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedElement#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.VersionedDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Versioned Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Versioned Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_VersionedDependencies()
   * @model containment="true"
   * @generated
   */
  EList<VersionedDependency> getVersionedDependencies();

} // VersionedElement
