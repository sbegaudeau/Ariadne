/**
 */
package fr.obeo.ariadne.model.tasks.impl;

import fr.obeo.ariadne.model.tasks.TaskEntry;
import fr.obeo.ariadne.model.tasks.TasksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl#getValues <em>Values</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskEntryImpl extends MinimalEObjectImpl.Container implements TaskEntry
{
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
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<String> options;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskEntryImpl()
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
    return TasksPackage.Literals.TASK_ENTRY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK_ENTRY__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, TasksPackage.TASK_ENTRY__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOptions()
  {
    if (options == null)
    {
      options = new EDataTypeEList<String>(String.class, this, TasksPackage.TASK_ENTRY__OPTIONS);
    }
    return options;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.TASK_ENTRY__KIND, oldKind, kind));
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
      case TasksPackage.TASK_ENTRY__IDENTIFIER:
        return getIdentifier();
      case TasksPackage.TASK_ENTRY__VALUES:
        return getValues();
      case TasksPackage.TASK_ENTRY__OPTIONS:
        return getOptions();
      case TasksPackage.TASK_ENTRY__KIND:
        return getKind();
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
      case TasksPackage.TASK_ENTRY__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case TasksPackage.TASK_ENTRY__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case TasksPackage.TASK_ENTRY__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends String>)newValue);
        return;
      case TasksPackage.TASK_ENTRY__KIND:
        setKind((String)newValue);
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
      case TasksPackage.TASK_ENTRY__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case TasksPackage.TASK_ENTRY__VALUES:
        getValues().clear();
        return;
      case TasksPackage.TASK_ENTRY__OPTIONS:
        getOptions().clear();
        return;
      case TasksPackage.TASK_ENTRY__KIND:
        setKind(KIND_EDEFAULT);
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
      case TasksPackage.TASK_ENTRY__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case TasksPackage.TASK_ENTRY__VALUES:
        return values != null && !values.isEmpty();
      case TasksPackage.TASK_ENTRY__OPTIONS:
        return options != null && !options.isEmpty();
      case TasksPackage.TASK_ENTRY__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", values: ");
    result.append(values);
    result.append(", options: ");
    result.append(options);
    result.append(", kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //TaskEntryImpl
