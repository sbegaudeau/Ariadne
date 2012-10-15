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
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.GenericResource;
import fr.obeo.ariadne.model.code.ResourceKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.GenericResourceImpl#getResourceKind <em>Resource Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericResourceImpl extends ResourceImpl implements GenericResource
{
  /**
   * The default value of the '{@link #getResourceKind() <em>Resource Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceKind()
   * @generated
   * @ordered
   */
  protected static final ResourceKind RESOURCE_KIND_EDEFAULT = ResourceKind.MANIFEST;

  /**
   * The cached value of the '{@link #getResourceKind() <em>Resource Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceKind()
   * @generated
   * @ordered
   */
  protected ResourceKind resourceKind = RESOURCE_KIND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericResourceImpl()
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
    return CodePackage.Literals.GENERIC_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceKind getResourceKind()
  {
    return resourceKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceKind(ResourceKind newResourceKind)
  {
    ResourceKind oldResourceKind = resourceKind;
    resourceKind = newResourceKind == null ? RESOURCE_KIND_EDEFAULT : newResourceKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.GENERIC_RESOURCE__RESOURCE_KIND, oldResourceKind, resourceKind));
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
      case CodePackage.GENERIC_RESOURCE__RESOURCE_KIND:
        return getResourceKind();
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
      case CodePackage.GENERIC_RESOURCE__RESOURCE_KIND:
        setResourceKind((ResourceKind)newValue);
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
      case CodePackage.GENERIC_RESOURCE__RESOURCE_KIND:
        setResourceKind(RESOURCE_KIND_EDEFAULT);
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
      case CodePackage.GENERIC_RESOURCE__RESOURCE_KIND:
        return resourceKind != RESOURCE_KIND_EDEFAULT;
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
    result.append(" (resourceKind: ");
    result.append(resourceKind);
    result.append(')');
    return result.toString();
  }

} //GenericResourceImpl
