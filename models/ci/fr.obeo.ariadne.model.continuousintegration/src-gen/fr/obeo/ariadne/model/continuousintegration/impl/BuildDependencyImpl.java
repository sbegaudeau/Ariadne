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
package fr.obeo.ariadne.model.continuousintegration.impl;

import fr.obeo.ariadne.model.continuousintegration.BuildDependency;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl#getUrls <em>Urls</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl#getLicenses <em>Licenses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildDependencyImpl extends VersionedElementImpl implements BuildDependency
{
  /**
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUrls() <em>Urls</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrls()
   * @generated
   * @ordered
   */
  protected EList<String> urls;

  /**
   * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLicenses()
   * @generated
   * @ordered
   */
  protected EList<String> licenses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildDependencyImpl()
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
    return ContinuousintegrationPackage.Literals.BUILD_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(String newQualifiedName)
  {
    String oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContinuousintegrationPackage.BUILD_DEPENDENCY__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUrls()
  {
    if (urls == null)
    {
      urls = new EDataTypeEList<String>(String.class, this, ContinuousintegrationPackage.BUILD_DEPENDENCY__URLS);
    }
    return urls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLicenses()
  {
    if (licenses == null)
    {
      licenses = new EDataTypeEList<String>(String.class, this, ContinuousintegrationPackage.BUILD_DEPENDENCY__LICENSES);
    }
    return licenses;
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
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__QUALIFIED_NAME:
        return getQualifiedName();
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__URLS:
        return getUrls();
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__LICENSES:
        return getLicenses();
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
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__URLS:
        getUrls().clear();
        getUrls().addAll((Collection<? extends String>)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__LICENSES:
        getLicenses().clear();
        getLicenses().addAll((Collection<? extends String>)newValue);
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
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__URLS:
        getUrls().clear();
        return;
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__LICENSES:
        getLicenses().clear();
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
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__URLS:
        return urls != null && !urls.isEmpty();
      case ContinuousintegrationPackage.BUILD_DEPENDENCY__LICENSES:
        return licenses != null && !licenses.isEmpty();
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
    result.append(" (qualifiedName: ");
    result.append(qualifiedName);
    result.append(", urls: ");
    result.append(urls);
    result.append(", licenses: ");
    result.append(licenses);
    result.append(')');
    return result.toString();
  }

} //BuildDependencyImpl
