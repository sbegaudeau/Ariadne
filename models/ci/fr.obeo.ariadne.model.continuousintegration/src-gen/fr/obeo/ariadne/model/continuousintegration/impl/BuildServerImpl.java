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

import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.BuildServer;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage;

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
 * An implementation of the model object '<em><b>Build Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl#getBuildServerKind <em>Build Server Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl#getBuildJobs <em>Build Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildServerImpl extends VersionedElementImpl implements BuildServer
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
   * The default value of the '{@link #getBuildServerKind() <em>Build Server Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildServerKind()
   * @generated
   * @ordered
   */
  protected static final String BUILD_SERVER_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuildServerKind() <em>Build Server Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildServerKind()
   * @generated
   * @ordered
   */
  protected String buildServerKind = BUILD_SERVER_KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getBuildJobs() <em>Build Jobs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildJobs()
   * @generated
   * @ordered
   */
  protected EList<BuildJob> buildJobs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildServerImpl()
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
    return ContinuousintegrationPackage.Literals.BUILD_SERVER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ContinuousintegrationPackage.BUILD_SERVER__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuildServerKind()
  {
    return buildServerKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuildServerKind(String newBuildServerKind)
  {
    String oldBuildServerKind = buildServerKind;
    buildServerKind = newBuildServerKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContinuousintegrationPackage.BUILD_SERVER__BUILD_SERVER_KIND, oldBuildServerKind, buildServerKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildJob> getBuildJobs()
  {
    if (buildJobs == null)
    {
      buildJobs = new EObjectContainmentEList<BuildJob>(BuildJob.class, this, ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS);
    }
    return buildJobs;
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
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS:
        return ((InternalEList<?>)getBuildJobs()).basicRemove(otherEnd, msgs);
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
      case ContinuousintegrationPackage.BUILD_SERVER__URL:
        return getUrl();
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_SERVER_KIND:
        return getBuildServerKind();
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS:
        return getBuildJobs();
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
      case ContinuousintegrationPackage.BUILD_SERVER__URL:
        setUrl((String)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_SERVER_KIND:
        setBuildServerKind((String)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS:
        getBuildJobs().clear();
        getBuildJobs().addAll((Collection<? extends BuildJob>)newValue);
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
      case ContinuousintegrationPackage.BUILD_SERVER__URL:
        setUrl(URL_EDEFAULT);
        return;
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_SERVER_KIND:
        setBuildServerKind(BUILD_SERVER_KIND_EDEFAULT);
        return;
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS:
        getBuildJobs().clear();
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
      case ContinuousintegrationPackage.BUILD_SERVER__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_SERVER_KIND:
        return BUILD_SERVER_KIND_EDEFAULT == null ? buildServerKind != null : !BUILD_SERVER_KIND_EDEFAULT.equals(buildServerKind);
      case ContinuousintegrationPackage.BUILD_SERVER__BUILD_JOBS:
        return buildJobs != null && !buildJobs.isEmpty();
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
    result.append(", buildServerKind: ");
    result.append(buildServerKind);
    result.append(')');
    return result.toString();
  }

} //BuildServerImpl
