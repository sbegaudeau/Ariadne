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

import fr.obeo.ariadne.model.core.Entry;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.tasks.Task;
import fr.obeo.ariadne.model.tasks.TasksPackage;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends VersionedElementImpl implements Task
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
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final String KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected String kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreationDate()
   * @generated
   * @ordered
   */
  protected static final String CREATION_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreationDate()
   * @generated
   * @ordered
   */
  protected String creationDate = CREATION_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final String PRIORITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected String priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected EList<Entry> entries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return TasksPackage.Literals.TASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(String newKind)
  {
    String oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreationDate()
  {
    return creationDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreationDate(String newCreationDate)
  {
    String oldCreationDate = creationDate;
    creationDate = newCreationDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__CREATION_DATE, oldCreationDate, creationDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(String newPriority)
  {
    String oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entry> getEntries()
  {
    if (entries == null)
    {
      entries = new EObjectContainmentEList<Entry>(Entry.class, this, TasksPackage.TASK__ENTRIES);
    }
    return entries;
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
      case TasksPackage.TASK__ENTRIES:
        return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
      case TasksPackage.TASK__URL:
        return getUrl();
      case TasksPackage.TASK__IDENTIFIER:
        return getIdentifier();
      case TasksPackage.TASK__KIND:
        return getKind();
      case TasksPackage.TASK__CREATION_DATE:
        return getCreationDate();
      case TasksPackage.TASK__PRIORITY:
        return getPriority();
      case TasksPackage.TASK__STATUS:
        return getStatus();
      case TasksPackage.TASK__ENTRIES:
        return getEntries();
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
      case TasksPackage.TASK__URL:
        setUrl((String)newValue);
        return;
      case TasksPackage.TASK__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case TasksPackage.TASK__KIND:
        setKind((String)newValue);
        return;
      case TasksPackage.TASK__CREATION_DATE:
        setCreationDate((String)newValue);
        return;
      case TasksPackage.TASK__PRIORITY:
        setPriority((String)newValue);
        return;
      case TasksPackage.TASK__STATUS:
        setStatus((String)newValue);
        return;
      case TasksPackage.TASK__ENTRIES:
        getEntries().clear();
        getEntries().addAll((Collection<? extends Entry>)newValue);
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
      case TasksPackage.TASK__URL:
        setUrl(URL_EDEFAULT);
        return;
      case TasksPackage.TASK__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case TasksPackage.TASK__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case TasksPackage.TASK__CREATION_DATE:
        setCreationDate(CREATION_DATE_EDEFAULT);
        return;
      case TasksPackage.TASK__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case TasksPackage.TASK__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case TasksPackage.TASK__ENTRIES:
        getEntries().clear();
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
      case TasksPackage.TASK__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case TasksPackage.TASK__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case TasksPackage.TASK__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
      case TasksPackage.TASK__CREATION_DATE:
        return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
      case TasksPackage.TASK__PRIORITY:
        return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
      case TasksPackage.TASK__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case TasksPackage.TASK__ENTRIES:
        return entries != null && !entries.isEmpty();
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
    result.append(", identifier: ");
    result.append(identifier);
    result.append(", kind: ");
    result.append(kind);
    result.append(", creationDate: ");
    result.append(creationDate);
    result.append(", priority: ");
    result.append(priority);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
