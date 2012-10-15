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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Parameter#getQualifiedName <em>Qualified Name</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Visibility()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Parameter#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Parameter#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Immutable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Immutable</em>' attribute.
   * @see #setImmutable(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Immutable()
   * @model unique="false"
   * @generated
   */
  boolean isImmutable();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Parameter#isImmutable <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Immutable</em>' attribute.
   * @see #isImmutable()
   * @generated
   */
  void setImmutable(boolean value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Types()
   * @model
   * @generated
   */
  EList<Type> getTypes();

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Annotations()
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_RelatedElements()
   * @model
   * @generated
   */
  EList<VersionedElement> getRelatedElements();

  /**
   * Returns the value of the '<em><b>Operation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.code.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' container reference.
   * @see #setOperation(Operation)
   * @see fr.obeo.ariadne.model.code.CodePackage#getParameter_Operation()
   * @see fr.obeo.ariadne.model.code.Operation#getParameters
   * @model opposite="parameters" transient="false"
   * @generated
   */
  Operation getOperation();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Parameter#getOperation <em>Operation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' container reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(Operation value);

} // Parameter
