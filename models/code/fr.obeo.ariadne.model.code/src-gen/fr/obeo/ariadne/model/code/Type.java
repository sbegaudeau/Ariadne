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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getInternalTypes <em>Internal Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getRelatedElements <em>Related Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see #setQualifiedName(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Type#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.code.VisibilityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #setVisibility(VisibilityKind)
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_Visibility()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Type#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Internal Types</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal Types</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_InternalTypes()
   * @model containment="true"
   * @generated
   */
  EList<Type> getInternalTypes();

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_Annotations()
   * @model
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Related Elements</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.VersionedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Related Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Related Elements</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_RelatedElements()
   * @model
   * @generated
   */
  EList<VersionedElement> getRelatedElements();

} // Type
