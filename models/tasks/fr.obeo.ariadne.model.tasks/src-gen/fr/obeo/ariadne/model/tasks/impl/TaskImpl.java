/**
 */
package fr.obeo.ariadne.model.tasks.impl;

import fr.obeo.ariadne.model.core.Element;

import fr.obeo.ariadne.model.core.impl.ElementImpl;

import fr.obeo.ariadne.model.tasks.Task;
import fr.obeo.ariadne.model.tasks.TaskEntry;
import fr.obeo.ariadne.model.tasks.TasksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getTaskEntries <em>Task Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends ElementImpl implements Task
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
   * The cached value of the '{@link #getTaskEntries() <em>Task Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskEntries()
   * @generated
   * @ordered
   */
  protected EList<TaskEntry> taskEntries;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

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
  public EList<TaskEntry> getTaskEntries()
  {
    if (taskEntries == null)
    {
      taskEntries = new EObjectContainmentEList<TaskEntry>(TaskEntry.class, this, TasksPackage.TASK__TASK_ENTRIES);
    }
    return taskEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectResolvingEList<Element>(Element.class, this, TasksPackage.TASK__ELEMENTS);
    }
    return elements;
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
      case TasksPackage.TASK__TASK_ENTRIES:
        return ((InternalEList<?>)getTaskEntries()).basicRemove(otherEnd, msgs);
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
      case TasksPackage.TASK__TASK_ENTRIES:
        return getTaskEntries();
      case TasksPackage.TASK__ELEMENTS:
        return getElements();
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
      case TasksPackage.TASK__TASK_ENTRIES:
        getTaskEntries().clear();
        getTaskEntries().addAll((Collection<? extends TaskEntry>)newValue);
        return;
      case TasksPackage.TASK__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case TasksPackage.TASK__TASK_ENTRIES:
        getTaskEntries().clear();
        return;
      case TasksPackage.TASK__ELEMENTS:
        getElements().clear();
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
      case TasksPackage.TASK__TASK_ENTRIES:
        return taskEntries != null && !taskEntries.isEmpty();
      case TasksPackage.TASK__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //TaskImpl
