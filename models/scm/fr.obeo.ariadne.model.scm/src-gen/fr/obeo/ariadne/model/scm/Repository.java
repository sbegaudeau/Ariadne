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

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getBranches <em>Branches</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getCommits <em>Commits</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Branch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Branches()
   * @model containment="true"
   * @generated
   */
  EList<Branch> getBranches();

  /**
   * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Commit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commits</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Commits()
   * @model containment="true"
   * @generated
   */
  EList<Commit> getCommits();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Tag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

} // Repository
