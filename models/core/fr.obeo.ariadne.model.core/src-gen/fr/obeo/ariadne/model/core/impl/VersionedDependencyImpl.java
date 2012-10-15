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
package fr.obeo.ariadne.model.core.impl;

import fr.obeo.ariadne.model.core.CorePackage;
import fr.obeo.ariadne.model.core.Version;
import fr.obeo.ariadne.model.core.VersionedDependency;
import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl#isIncludesLowerBound <em>Includes Lower Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl#isIncludesUpperBound <em>Includes Upper Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedDependencyImpl#getVersionedElement <em>Versioned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionedDependencyImpl extends MinimalEObjectImpl.Container implements VersionedDependency
{
  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected Version lowerBound;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected Version upperBound;

  /**
   * The default value of the '{@link #isIncludesLowerBound() <em>Includes Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludesLowerBound()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDES_LOWER_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludesLowerBound() <em>Includes Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludesLowerBound()
   * @generated
   * @ordered
   */
  protected boolean includesLowerBound = INCLUDES_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isIncludesUpperBound() <em>Includes Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludesUpperBound()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDES_UPPER_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludesUpperBound() <em>Includes Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludesUpperBound()
   * @generated
   * @ordered
   */
  protected boolean includesUpperBound = INCLUDES_UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getVersionedElement() <em>Versioned Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionedElement()
   * @generated
   * @ordered
   */
  protected VersionedElement versionedElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionedDependencyImpl()
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
    return CorePackage.Literals.VERSIONED_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(Version newLowerBound, NotificationChain msgs)
  {
    Version oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(Version newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBound(Version newUpperBound, NotificationChain msgs)
  {
    Version oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND, oldUpperBound, newUpperBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(Version newUpperBound)
  {
    if (newUpperBound != upperBound)
    {
      NotificationChain msgs = null;
      if (upperBound != null)
        msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND, null, msgs);
      if (newUpperBound != null)
        msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND, null, msgs);
      msgs = basicSetUpperBound(newUpperBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND, newUpperBound, newUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludesLowerBound()
  {
    return includesLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludesLowerBound(boolean newIncludesLowerBound)
  {
    boolean oldIncludesLowerBound = includesLowerBound;
    includesLowerBound = newIncludesLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND, oldIncludesLowerBound, includesLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludesUpperBound()
  {
    return includesUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludesUpperBound(boolean newIncludesUpperBound)
  {
    boolean oldIncludesUpperBound = includesUpperBound;
    includesUpperBound = newIncludesUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND, oldIncludesUpperBound, includesUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionedElement getVersionedElement()
  {
    if (versionedElement != null && versionedElement.eIsProxy())
    {
      InternalEObject oldVersionedElement = (InternalEObject)versionedElement;
      versionedElement = (VersionedElement)eResolveProxy(oldVersionedElement);
      if (versionedElement != oldVersionedElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT, oldVersionedElement, versionedElement));
      }
    }
    return versionedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionedElement basicGetVersionedElement()
  {
    return versionedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionedElement(VersionedElement newVersionedElement)
  {
    VersionedElement oldVersionedElement = versionedElement;
    versionedElement = newVersionedElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT, oldVersionedElement, versionedElement));
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
      case CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND:
        return basicSetUpperBound(null, msgs);
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
      case CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND:
        return getLowerBound();
      case CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND:
        return getUpperBound();
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND:
        return isIncludesLowerBound();
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND:
        return isIncludesUpperBound();
      case CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT:
        if (resolve) return getVersionedElement();
        return basicGetVersionedElement();
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
      case CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND:
        setLowerBound((Version)newValue);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND:
        setUpperBound((Version)newValue);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND:
        setIncludesLowerBound((Boolean)newValue);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND:
        setIncludesUpperBound((Boolean)newValue);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT:
        setVersionedElement((VersionedElement)newValue);
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
      case CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND:
        setLowerBound((Version)null);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND:
        setUpperBound((Version)null);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND:
        setIncludesLowerBound(INCLUDES_LOWER_BOUND_EDEFAULT);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND:
        setIncludesUpperBound(INCLUDES_UPPER_BOUND_EDEFAULT);
        return;
      case CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT:
        setVersionedElement((VersionedElement)null);
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
      case CorePackage.VERSIONED_DEPENDENCY__LOWER_BOUND:
        return lowerBound != null;
      case CorePackage.VERSIONED_DEPENDENCY__UPPER_BOUND:
        return upperBound != null;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_LOWER_BOUND:
        return includesLowerBound != INCLUDES_LOWER_BOUND_EDEFAULT;
      case CorePackage.VERSIONED_DEPENDENCY__INCLUDES_UPPER_BOUND:
        return includesUpperBound != INCLUDES_UPPER_BOUND_EDEFAULT;
      case CorePackage.VERSIONED_DEPENDENCY__VERSIONED_ELEMENT:
        return versionedElement != null;
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
    result.append(" (includesLowerBound: ");
    result.append(includesLowerBound);
    result.append(", includesUpperBound: ");
    result.append(includesUpperBound);
    result.append(')');
    return result.toString();
  }

} //VersionedDependencyImpl
