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
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getOverriddenConstructors <em>Overridden Constructors</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Constructor#getRelatedElements <em>Related Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#getQualifiedName <em>Qualified Name</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Visibility()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Static()
   * @model unique="false"
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Abstract()
   * @model unique="false"
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#isFinal <em>Final</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Immutable()
   * @model unique="false"
   * @generated
   */
  boolean isImmutable();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#isImmutable <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Immutable</em>' attribute.
   * @see #isImmutable()
   * @generated
   */
  void setImmutable(boolean value);

  /**
   * Returns the value of the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transient</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transient</em>' attribute.
   * @see #setTransient(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Transient()
   * @model unique="false"
   * @generated
   */
  boolean isTransient();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Constructor#isTransient <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' attribute.
   * @see #isTransient()
   * @generated
   */
  void setTransient(boolean value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Types()
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_Annotations()
   * @model
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Overridden Constructors</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overridden Constructors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overridden Constructors</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_OverriddenConstructors()
   * @model derived="true"
   * @generated
   */
  EList<Constructor> getOverriddenConstructors();

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getConstructor_RelatedElements()
   * @model
   * @generated
   */
  EList<VersionedElement> getRelatedElements();

} // Constructor
