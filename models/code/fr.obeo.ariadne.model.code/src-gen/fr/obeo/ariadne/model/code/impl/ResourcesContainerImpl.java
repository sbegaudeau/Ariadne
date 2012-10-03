/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Resource;
import fr.obeo.ariadne.model.code.ResourcesContainer;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

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
 * An implementation of the model object '<em><b>Resources Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourcesContainerImpl#getSubResourcesContainers <em>Sub Resources Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcesContainerImpl extends VersionedElementImpl implements ResourcesContainer
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
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getSubResourcesContainers() <em>Sub Resources Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubResourcesContainers()
   * @generated
   * @ordered
   */
  protected EList<ResourcesContainer> subResourcesContainers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourcesContainerImpl()
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
    return CodePackage.Literals.RESOURCES_CONTAINER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.RESOURCES_CONTAINER__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, CodePackage.RESOURCES_CONTAINER__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourcesContainer> getSubResourcesContainers()
  {
    if (subResourcesContainers == null)
    {
      subResourcesContainers = new EObjectContainmentEList<ResourcesContainer>(ResourcesContainer.class, this, CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS);
    }
    return subResourcesContainers;
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
      case CodePackage.RESOURCES_CONTAINER__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS:
        return ((InternalEList<?>)getSubResourcesContainers()).basicRemove(otherEnd, msgs);
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
      case CodePackage.RESOURCES_CONTAINER__PATH:
        return getPath();
      case CodePackage.RESOURCES_CONTAINER__RESOURCES:
        return getResources();
      case CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS:
        return getSubResourcesContainers();
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
      case CodePackage.RESOURCES_CONTAINER__PATH:
        setPath((String)newValue);
        return;
      case CodePackage.RESOURCES_CONTAINER__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS:
        getSubResourcesContainers().clear();
        getSubResourcesContainers().addAll((Collection<? extends ResourcesContainer>)newValue);
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
      case CodePackage.RESOURCES_CONTAINER__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case CodePackage.RESOURCES_CONTAINER__RESOURCES:
        getResources().clear();
        return;
      case CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS:
        getSubResourcesContainers().clear();
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
      case CodePackage.RESOURCES_CONTAINER__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case CodePackage.RESOURCES_CONTAINER__RESOURCES:
        return resources != null && !resources.isEmpty();
      case CodePackage.RESOURCES_CONTAINER__SUB_RESOURCES_CONTAINERS:
        return subResourcesContainers != null && !subResourcesContainers.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ResourcesContainerImpl
