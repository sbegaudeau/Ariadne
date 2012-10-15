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
package fr.obeo.ariadne.model.scm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.Tag#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Tag#getCommit <em>Commit</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject
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
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getTag_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Tag#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Commit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commit</em>' reference.
   * @see #setCommit(Commit)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getTag_Commit()
   * @model
   * @generated
   */
  Commit getCommit();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Tag#getCommit <em>Commit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commit</em>' reference.
   * @see #getCommit()
   * @generated
   */
  void setCommit(Commit value);

} // Tag
