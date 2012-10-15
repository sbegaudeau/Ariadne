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

import fr.obeo.ariadne.model.core.Person;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getId <em>Id</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getCommitTime <em>Commit Time</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getShortMessage <em>Short Message</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getFullMessage <em>Full Message</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getResourceChanges <em>Resource Changes</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getCommitter <em>Committer</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Commit#getParents <em>Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit()
 * @model
 * @generated
 */
public interface Commit extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_Id()
   * @model unique="false"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Commit Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commit Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commit Time</em>' attribute.
   * @see #setCommitTime(int)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_CommitTime()
   * @model unique="false"
   * @generated
   */
  int getCommitTime();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getCommitTime <em>Commit Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commit Time</em>' attribute.
   * @see #getCommitTime()
   * @generated
   */
  void setCommitTime(int value);

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
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Short Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Message</em>' attribute.
   * @see #setShortMessage(String)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_ShortMessage()
   * @model unique="false"
   * @generated
   */
  String getShortMessage();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getShortMessage <em>Short Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Message</em>' attribute.
   * @see #getShortMessage()
   * @generated
   */
  void setShortMessage(String value);

  /**
   * Returns the value of the '<em><b>Full Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Full Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Full Message</em>' attribute.
   * @see #setFullMessage(String)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_FullMessage()
   * @model unique="false"
   * @generated
   */
  String getFullMessage();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getFullMessage <em>Full Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Full Message</em>' attribute.
   * @see #getFullMessage()
   * @generated
   */
  void setFullMessage(String value);

  /**
   * Returns the value of the '<em><b>Resource Changes</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.ResourceChange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Changes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Changes</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_ResourceChanges()
   * @model containment="true"
   * @generated
   */
  EList<ResourceChange> getResourceChanges();

  /**
   * Returns the value of the '<em><b>Author</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' reference.
   * @see #setAuthor(Person)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_Author()
   * @model
   * @generated
   */
  Person getAuthor();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getAuthor <em>Author</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Person value);

  /**
   * Returns the value of the '<em><b>Committer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Committer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Committer</em>' reference.
   * @see #setCommitter(Person)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_Committer()
   * @model
   * @generated
   */
  Person getCommitter();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Commit#getCommitter <em>Committer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Committer</em>' reference.
   * @see #getCommitter()
   * @generated
   */
  void setCommitter(Person value);

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Commit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parents</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getCommit_Parents()
   * @model
   * @generated
   */
  EList<Commit> getParents();

} // Commit
