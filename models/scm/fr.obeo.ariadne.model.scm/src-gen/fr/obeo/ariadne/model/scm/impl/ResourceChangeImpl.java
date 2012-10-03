/**
 */
package fr.obeo.ariadne.model.scm.impl;

import fr.obeo.ariadne.model.scm.ResourceChange;
import fr.obeo.ariadne.model.scm.ResourceChangeKind;
import fr.obeo.ariadne.model.scm.ScmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl#getResourceChangeKind <em>Resource Change Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceChangeImpl extends MinimalEObjectImpl.Container implements ResourceChange
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getResourceChangeKind() <em>Resource Change Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceChangeKind()
   * @generated
   * @ordered
   */
  protected static final ResourceChangeKind RESOURCE_CHANGE_KIND_EDEFAULT = ResourceChangeKind.ADDED;

  /**
   * The cached value of the '{@link #getResourceChangeKind() <em>Resource Change Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceChangeKind()
   * @generated
   * @ordered
   */
  protected ResourceChangeKind resourceChangeKind = RESOURCE_CHANGE_KIND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceChangeImpl()
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
    return ScmPackage.Literals.RESOURCE_CHANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.RESOURCE_CHANGE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceChangeKind getResourceChangeKind()
  {
    return resourceChangeKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceChangeKind(ResourceChangeKind newResourceChangeKind)
  {
    ResourceChangeKind oldResourceChangeKind = resourceChangeKind;
    resourceChangeKind = newResourceChangeKind == null ? RESOURCE_CHANGE_KIND_EDEFAULT : newResourceChangeKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.RESOURCE_CHANGE__RESOURCE_CHANGE_KIND, oldResourceChangeKind, resourceChangeKind));
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
      case ScmPackage.RESOURCE_CHANGE__PATH:
        return getPath();
      case ScmPackage.RESOURCE_CHANGE__RESOURCE_CHANGE_KIND:
        return getResourceChangeKind();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScmPackage.RESOURCE_CHANGE__PATH:
        setPath((String)newValue);
        return;
      case ScmPackage.RESOURCE_CHANGE__RESOURCE_CHANGE_KIND:
        setResourceChangeKind((ResourceChangeKind)newValue);
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
      case ScmPackage.RESOURCE_CHANGE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case ScmPackage.RESOURCE_CHANGE__RESOURCE_CHANGE_KIND:
        setResourceChangeKind(RESOURCE_CHANGE_KIND_EDEFAULT);
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
      case ScmPackage.RESOURCE_CHANGE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case ScmPackage.RESOURCE_CHANGE__RESOURCE_CHANGE_KIND:
        return resourceChangeKind != RESOURCE_CHANGE_KIND_EDEFAULT;
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
    result.append(" (path: ");
    result.append(path);
    result.append(", resourceChangeKind: ");
    result.append(resourceChangeKind);
    result.append(')');
    return result.toString();
  }

} //ResourceChangeImpl
