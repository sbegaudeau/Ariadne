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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesLowerBound <em>Includes Lower Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesUpperBound <em>Includes Upper Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#isOptional <em>Optional</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedDependency#getVersionedElement <em>Versioned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency()
 * @model
 * @generated
 */
public interface VersionedDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(Version)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_LowerBound()
   * @model containment="true"
   * @generated
   */
  Version getLowerBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(Version value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' containment reference.
   * @see #setUpperBound(Version)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_UpperBound()
   * @model containment="true"
   * @generated
   */
  Version getUpperBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#getUpperBound <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' containment reference.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(Version value);

  /**
   * Returns the value of the '<em><b>Includes Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes Lower Bound</em>' attribute.
   * @see #setIncludesLowerBound(boolean)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_IncludesLowerBound()
   * @model unique="false"
   * @generated
   */
  boolean isIncludesLowerBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesLowerBound <em>Includes Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includes Lower Bound</em>' attribute.
   * @see #isIncludesLowerBound()
   * @generated
   */
  void setIncludesLowerBound(boolean value);

  /**
   * Returns the value of the '<em><b>Includes Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes Upper Bound</em>' attribute.
   * @see #setIncludesUpperBound(boolean)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_IncludesUpperBound()
   * @model unique="false"
   * @generated
   */
  boolean isIncludesUpperBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#isIncludesUpperBound <em>Includes Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includes Upper Bound</em>' attribute.
   * @see #isIncludesUpperBound()
   * @generated
   */
  void setIncludesUpperBound(boolean value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_Optional()
   * @model unique="false"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Versioned Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Versioned Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Versioned Element</em>' reference.
   * @see #setVersionedElement(VersionedElement)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedDependency_VersionedElement()
   * @model
   * @generated
   */
  VersionedElement getVersionedElement();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedDependency#getVersionedElement <em>Versioned Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Versioned Element</em>' reference.
   * @see #getVersionedElement()
   * @generated
   */
  void setVersionedElement(VersionedElement value);

} // VersionedDependency
