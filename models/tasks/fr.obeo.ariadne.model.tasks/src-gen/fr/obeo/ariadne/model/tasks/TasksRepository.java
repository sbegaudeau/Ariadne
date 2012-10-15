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
package fr.obeo.ariadne.model.tasks;

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
 *   <li>{@link fr.obeo.ariadne.model.tasks.TasksRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TasksRepository#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TasksRepository#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository()
 * @model
 * @generated
 */
public interface TasksRepository extends VersionedElement
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
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Connector Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connector Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connector Kind</em>' attribute.
   * @see #setConnectorKind(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository_ConnectorKind()
   * @model unique="false"
   * @generated
   */
  String getConnectorKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getConnectorKind <em>Connector Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connector Kind</em>' attribute.
   * @see #getConnectorKind()
   * @generated
   */
  void setConnectorKind(String value);

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.tasks.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

} // TasksRepository
