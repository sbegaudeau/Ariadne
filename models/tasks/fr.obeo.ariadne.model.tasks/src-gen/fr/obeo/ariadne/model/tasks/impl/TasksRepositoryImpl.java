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
package fr.obeo.ariadne.model.tasks.impl;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.tasks.Task;
import fr.obeo.ariadne.model.tasks.TasksPackage;
import fr.obeo.ariadne.model.tasks.TasksRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TasksRepositoryImpl extends VersionedElementImpl implements TasksRepository
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectorKind()
   * @generated
   * @ordered
   */
  protected static final String CONNECTOR_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectorKind()
   * @generated
   * @ordered
   */
  protected String connectorKind = CONNECTOR_KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TasksRepositoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TasksPackage.Literals.TASKS_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASKS_REPOSITORY__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnectorKind()
  {
    return connectorKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectorKind(String newConnectorKind)
  {
    String oldConnectorKind = connectorKind;
    connectorKind = newConnectorKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASKS_REPOSITORY__CONNECTOR_KIND, oldConnectorKind, connectorKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<Task>(Task.class, this, TasksPackage.TASKS_REPOSITORY__TASKS);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TasksPackage.TASKS_REPOSITORY__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TasksPackage.TASKS_REPOSITORY__URL:
        return getUrl();
      case TasksPackage.TASKS_REPOSITORY__CONNECTOR_KIND:
        return getConnectorKind();
      case TasksPackage.TASKS_REPOSITORY__TASKS:
        return getTasks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TasksPackage.TASKS_REPOSITORY__URL:
        setUrl((String)newValue);
        return;
      case TasksPackage.TASKS_REPOSITORY__CONNECTOR_KIND:
        setConnectorKind((String)newValue);
        return;
      case TasksPackage.TASKS_REPOSITORY__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Task>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TasksPackage.TASKS_REPOSITORY__URL:
        setUrl(URL_EDEFAULT);
        return;
      case TasksPackage.TASKS_REPOSITORY__CONNECTOR_KIND:
        setConnectorKind(CONNECTOR_KIND_EDEFAULT);
        return;
      case TasksPackage.TASKS_REPOSITORY__TASKS:
        getTasks().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TasksPackage.TASKS_REPOSITORY__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case TasksPackage.TASKS_REPOSITORY__CONNECTOR_KIND:
        return CONNECTOR_KIND_EDEFAULT == null ? connectorKind != null : !CONNECTOR_KIND_EDEFAULT.equals(connectorKind);
      case TasksPackage.TASKS_REPOSITORY__TASKS:
        return tasks != null && !tasks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (url: ");
    result.append(url);
    result.append(", connectorKind: ");
    result.append(connectorKind);
    result.append(')');
    return result.toString();
  }

} //TasksRepositoryImpl
