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

import fr.obeo.ariadne.model.continuousintegration.BuildArtifact;
import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.BuildKind;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage;
import fr.obeo.ariadne.model.continuousintegration.PromotionLocation;

import fr.obeo.ariadne.model.core.Entry;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getBuildTechnologyKinds <em>Build Technology Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getBuildKinds <em>Build Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getPromotionLocations <em>Promotion Locations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl#getBuildArtifacts <em>Build Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildJobImpl extends VersionedElementImpl implements BuildJob
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
   * The cached value of the '{@link #getBuildTechnologyKinds() <em>Build Technology Kinds</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildTechnologyKinds()
   * @generated
   * @ordered
   */
  protected EList<String> buildTechnologyKinds;

  /**
   * The cached value of the '{@link #getBuildKinds() <em>Build Kinds</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildKinds()
   * @generated
   * @ordered
   */
  protected EList<BuildKind> buildKinds;

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
   * The cached value of the '{@link #getPromotionLocations() <em>Promotion Locations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromotionLocations()
   * @generated
   * @ordered
   */
  protected EList<PromotionLocation> promotionLocations;

  /**
   * The cached value of the '{@link #getBuildArtifacts() <em>Build Artifacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildArtifacts()
   * @generated
   * @ordered
   */
  protected EList<BuildArtifact> buildArtifacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildJobImpl()
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
    return ContinuousintegrationPackage.Literals.BUILD_JOB;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ContinuousintegrationPackage.BUILD_JOB__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBuildTechnologyKinds()
  {
    if (buildTechnologyKinds == null)
    {
      buildTechnologyKinds = new EDataTypeEList<String>(String.class, this, ContinuousintegrationPackage.BUILD_JOB__BUILD_TECHNOLOGY_KINDS);
    }
    return buildTechnologyKinds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildKind> getBuildKinds()
  {
    if (buildKinds == null)
    {
      buildKinds = new EDataTypeEList<BuildKind>(BuildKind.class, this, ContinuousintegrationPackage.BUILD_JOB__BUILD_KINDS);
    }
    return buildKinds;
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
      entries = new EObjectContainmentEList<Entry>(Entry.class, this, ContinuousintegrationPackage.BUILD_JOB__ENTRIES);
    }
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PromotionLocation> getPromotionLocations()
  {
    if (promotionLocations == null)
    {
      promotionLocations = new EObjectContainmentEList<PromotionLocation>(PromotionLocation.class, this, ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS);
    }
    return promotionLocations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildArtifact> getBuildArtifacts()
  {
    if (buildArtifacts == null)
    {
      buildArtifacts = new EObjectContainmentEList<BuildArtifact>(BuildArtifact.class, this, ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS);
    }
    return buildArtifacts;
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
      case ContinuousintegrationPackage.BUILD_JOB__ENTRIES:
        return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
      case ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS:
        return ((InternalEList<?>)getPromotionLocations()).basicRemove(otherEnd, msgs);
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS:
        return ((InternalEList<?>)getBuildArtifacts()).basicRemove(otherEnd, msgs);
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
      case ContinuousintegrationPackage.BUILD_JOB__URL:
        return getUrl();
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_TECHNOLOGY_KINDS:
        return getBuildTechnologyKinds();
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_KINDS:
        return getBuildKinds();
      case ContinuousintegrationPackage.BUILD_JOB__ENTRIES:
        return getEntries();
      case ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS:
        return getPromotionLocations();
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS:
        return getBuildArtifacts();
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
      case ContinuousintegrationPackage.BUILD_JOB__URL:
        setUrl((String)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_TECHNOLOGY_KINDS:
        getBuildTechnologyKinds().clear();
        getBuildTechnologyKinds().addAll((Collection<? extends String>)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_KINDS:
        getBuildKinds().clear();
        getBuildKinds().addAll((Collection<? extends BuildKind>)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__ENTRIES:
        getEntries().clear();
        getEntries().addAll((Collection<? extends Entry>)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS:
        getPromotionLocations().clear();
        getPromotionLocations().addAll((Collection<? extends PromotionLocation>)newValue);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS:
        getBuildArtifacts().clear();
        getBuildArtifacts().addAll((Collection<? extends BuildArtifact>)newValue);
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
      case ContinuousintegrationPackage.BUILD_JOB__URL:
        setUrl(URL_EDEFAULT);
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_TECHNOLOGY_KINDS:
        getBuildTechnologyKinds().clear();
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_KINDS:
        getBuildKinds().clear();
        return;
      case ContinuousintegrationPackage.BUILD_JOB__ENTRIES:
        getEntries().clear();
        return;
      case ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS:
        getPromotionLocations().clear();
        return;
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS:
        getBuildArtifacts().clear();
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
      case ContinuousintegrationPackage.BUILD_JOB__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_TECHNOLOGY_KINDS:
        return buildTechnologyKinds != null && !buildTechnologyKinds.isEmpty();
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_KINDS:
        return buildKinds != null && !buildKinds.isEmpty();
      case ContinuousintegrationPackage.BUILD_JOB__ENTRIES:
        return entries != null && !entries.isEmpty();
      case ContinuousintegrationPackage.BUILD_JOB__PROMOTION_LOCATIONS:
        return promotionLocations != null && !promotionLocations.isEmpty();
      case ContinuousintegrationPackage.BUILD_JOB__BUILD_ARTIFACTS:
        return buildArtifacts != null && !buildArtifacts.isEmpty();
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
    result.append(", buildTechnologyKinds: ");
    result.append(buildTechnologyKinds);
    result.append(", buildKinds: ");
    result.append(buildKinds);
    result.append(')');
    return result.toString();
  }

} //BuildJobImpl
