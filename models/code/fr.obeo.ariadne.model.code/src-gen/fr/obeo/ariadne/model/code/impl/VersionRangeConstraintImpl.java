/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.VersionRangeConstraint;

import fr.obeo.ariadne.model.core.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl#isIncludeLowerVersionBound <em>Include Lower Version Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl#isIncludeUpperVersionBound <em>Include Upper Version Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl#getLowerVersion <em>Lower Version</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.VersionRangeConstraintImpl#getUpperVersion <em>Upper Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionRangeConstraintImpl extends MinimalEObjectImpl.Container implements VersionRangeConstraint
{
  /**
   * The default value of the '{@link #isIncludeLowerVersionBound() <em>Include Lower Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeLowerVersionBound()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDE_LOWER_VERSION_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludeLowerVersionBound() <em>Include Lower Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeLowerVersionBound()
   * @generated
   * @ordered
   */
  protected boolean includeLowerVersionBound = INCLUDE_LOWER_VERSION_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isIncludeUpperVersionBound() <em>Include Upper Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeUpperVersionBound()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDE_UPPER_VERSION_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludeUpperVersionBound() <em>Include Upper Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeUpperVersionBound()
   * @generated
   * @ordered
   */
  protected boolean includeUpperVersionBound = INCLUDE_UPPER_VERSION_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getLowerVersion() <em>Lower Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerVersion()
   * @generated
   * @ordered
   */
  protected Version lowerVersion;

  /**
   * The cached value of the '{@link #getUpperVersion() <em>Upper Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperVersion()
   * @generated
   * @ordered
   */
  protected Version upperVersion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionRangeConstraintImpl()
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
    return CodePackage.Literals.VERSION_RANGE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludeLowerVersionBound()
  {
    return includeLowerVersionBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeLowerVersionBound(boolean newIncludeLowerVersionBound)
  {
    boolean oldIncludeLowerVersionBound = includeLowerVersionBound;
    includeLowerVersionBound = newIncludeLowerVersionBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND, oldIncludeLowerVersionBound, includeLowerVersionBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludeUpperVersionBound()
  {
    return includeUpperVersionBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeUpperVersionBound(boolean newIncludeUpperVersionBound)
  {
    boolean oldIncludeUpperVersionBound = includeUpperVersionBound;
    includeUpperVersionBound = newIncludeUpperVersionBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND, oldIncludeUpperVersionBound, includeUpperVersionBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getLowerVersion()
  {
    return lowerVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerVersion(Version newLowerVersion, NotificationChain msgs)
  {
    Version oldLowerVersion = lowerVersion;
    lowerVersion = newLowerVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION, oldLowerVersion, newLowerVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerVersion(Version newLowerVersion)
  {
    if (newLowerVersion != lowerVersion)
    {
      NotificationChain msgs = null;
      if (lowerVersion != null)
        msgs = ((InternalEObject)lowerVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION, null, msgs);
      if (newLowerVersion != null)
        msgs = ((InternalEObject)newLowerVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION, null, msgs);
      msgs = basicSetLowerVersion(newLowerVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION, newLowerVersion, newLowerVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getUpperVersion()
  {
    return upperVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperVersion(Version newUpperVersion, NotificationChain msgs)
  {
    Version oldUpperVersion = upperVersion;
    upperVersion = newUpperVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION, oldUpperVersion, newUpperVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperVersion(Version newUpperVersion)
  {
    if (newUpperVersion != upperVersion)
    {
      NotificationChain msgs = null;
      if (upperVersion != null)
        msgs = ((InternalEObject)upperVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION, null, msgs);
      if (newUpperVersion != null)
        msgs = ((InternalEObject)newUpperVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION, null, msgs);
      msgs = basicSetUpperVersion(newUpperVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION, newUpperVersion, newUpperVersion));
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
      case CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION:
        return basicSetLowerVersion(null, msgs);
      case CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION:
        return basicSetUpperVersion(null, msgs);
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
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND:
        return isIncludeLowerVersionBound();
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND:
        return isIncludeUpperVersionBound();
      case CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION:
        return getLowerVersion();
      case CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION:
        return getUpperVersion();
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
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND:
        setIncludeLowerVersionBound((Boolean)newValue);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND:
        setIncludeUpperVersionBound((Boolean)newValue);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION:
        setLowerVersion((Version)newValue);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION:
        setUpperVersion((Version)newValue);
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
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND:
        setIncludeLowerVersionBound(INCLUDE_LOWER_VERSION_BOUND_EDEFAULT);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND:
        setIncludeUpperVersionBound(INCLUDE_UPPER_VERSION_BOUND_EDEFAULT);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION:
        setLowerVersion((Version)null);
        return;
      case CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION:
        setUpperVersion((Version)null);
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
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_LOWER_VERSION_BOUND:
        return includeLowerVersionBound != INCLUDE_LOWER_VERSION_BOUND_EDEFAULT;
      case CodePackage.VERSION_RANGE_CONSTRAINT__INCLUDE_UPPER_VERSION_BOUND:
        return includeUpperVersionBound != INCLUDE_UPPER_VERSION_BOUND_EDEFAULT;
      case CodePackage.VERSION_RANGE_CONSTRAINT__LOWER_VERSION:
        return lowerVersion != null;
      case CodePackage.VERSION_RANGE_CONSTRAINT__UPPER_VERSION:
        return upperVersion != null;
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
    result.append(" (includeLowerVersionBound: ");
    result.append(includeLowerVersionBound);
    result.append(", includeUpperVersionBound: ");
    result.append(includeUpperVersionBound);
    result.append(')');
    return result.toString();
  }

} //VersionRangeConstraintImpl
