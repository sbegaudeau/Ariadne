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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getReturnTypes <em>Return Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Operation#getOverriddenOperations <em>Overridden Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#getQualifiedName <em>Qualified Name</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Visibility()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#getVisibility <em>Visibility</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Static()
   * @model unique="false"
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#isStatic <em>Static</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Abstract()
   * @model unique="false"
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#isAbstract <em>Abstract</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#isFinal <em>Final</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Immutable()
   * @model unique="false"
   * @generated
   */
  boolean isImmutable();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#isImmutable <em>Immutable</em>}' attribute.
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Transient()
   * @model unique="false"
   * @generated
   */
  boolean isTransient();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#isTransient <em>Transient</em>}' attribute.
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
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.code.Parameter#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Parameters()
   * @see fr.obeo.ariadne.model.code.Parameter#getOperation
   * @model opposite="operation" containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Classifier</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link fr.obeo.ariadne.model.code.Classifier#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifier</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifier</em>' container reference.
   * @see #setClassifier(Classifier)
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Classifier()
   * @see fr.obeo.ariadne.model.code.Classifier#getOperations
   * @model opposite="operations" transient="false"
   * @generated
   */
  Classifier getClassifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Operation#getClassifier <em>Classifier</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classifier</em>' container reference.
   * @see #getClassifier()
   * @generated
   */
  void setClassifier(Classifier value);

  /**
   * Returns the value of the '<em><b>Return Types</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Types</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_ReturnTypes()
   * @model
   * @generated
   */
  EList<Type> getReturnTypes();

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Types()
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_Annotations()
   * @model
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Overridden Operations</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overridden Operations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overridden Operations</em>' reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getOperation_OverriddenOperations()
   * @model derived="true"
   * @generated
   */
  EList<Operation> getOverriddenOperations();

} // Operation
