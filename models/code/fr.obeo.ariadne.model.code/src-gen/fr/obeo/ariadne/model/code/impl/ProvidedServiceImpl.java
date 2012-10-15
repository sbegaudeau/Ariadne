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
import fr.obeo.ariadne.model.code.ProvidedService;
import fr.obeo.ariadne.model.code.ReferencedService;
import fr.obeo.ariadne.model.code.Type;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl#getReferencedService <em>Referenced Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedServiceImpl extends VersionedElementImpl implements ProvidedService
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
   * The cached value of the '{@link #getReferencedService() <em>Referenced Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedService()
   * @generated
   * @ordered
   */
  protected ReferencedService referencedService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedServiceImpl()
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
    return CodePackage.Literals.PROVIDED_SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROVIDED_SERVICE__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedService getReferencedService()
  {
    if (referencedService != null && referencedService.eIsProxy())
    {
      InternalEObject oldReferencedService = (InternalEObject)referencedService;
      referencedService = (ReferencedService)eResolveProxy(oldReferencedService);
      if (referencedService != oldReferencedService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE, oldReferencedService, referencedService));
      }
    }
    return referencedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedService basicGetReferencedService()
  {
    return referencedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedService(ReferencedService newReferencedService)
  {
    ReferencedService oldReferencedService = referencedService;
    referencedService = newReferencedService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE, oldReferencedService, referencedService));
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        return getIdentifier();
      case CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE:
        if (resolve) return getReferencedService();
        return basicGetReferencedService();
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE:
        setReferencedService((ReferencedService)newValue);
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE:
        setReferencedService((ReferencedService)null);
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case CodePackage.PROVIDED_SERVICE__REFERENCED_SERVICE:
        return referencedService != null;
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
    result.append(')');
    return result.toString();
  }

} //ProvidedServiceImpl
