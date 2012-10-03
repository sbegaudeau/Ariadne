/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.ContainmentDependency;
import fr.obeo.ariadne.model.code.InheritanceDependency;
import fr.obeo.ariadne.model.code.ReferenceDependency;
import fr.obeo.ariadne.model.code.Resource;

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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourceImpl#getInheritanceDependency <em>Inheritance Dependency</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourceImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ResourceImpl#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl extends VersionedElementImpl implements Resource
{
  /**
   * The cached value of the '{@link #getInheritanceDependency() <em>Inheritance Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritanceDependency()
   * @generated
   * @ordered
   */
  protected InheritanceDependency inheritanceDependency;

  /**
   * The cached value of the '{@link #getReferenceDependencies() <em>Reference Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceDependencies()
   * @generated
   * @ordered
   */
  protected EList<ReferenceDependency> referenceDependencies;

  /**
   * The cached value of the '{@link #getContainmentDependencies() <em>Containment Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainmentDependencies()
   * @generated
   * @ordered
   */
  protected EList<ContainmentDependency> containmentDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceImpl()
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
    return CodePackage.Literals.RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceDependency getInheritanceDependency()
  {
    return inheritanceDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInheritanceDependency(InheritanceDependency newInheritanceDependency, NotificationChain msgs)
  {
    InheritanceDependency oldInheritanceDependency = inheritanceDependency;
    inheritanceDependency = newInheritanceDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.RESOURCE__INHERITANCE_DEPENDENCY, oldInheritanceDependency, newInheritanceDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInheritanceDependency(InheritanceDependency newInheritanceDependency)
  {
    if (newInheritanceDependency != inheritanceDependency)
    {
      NotificationChain msgs = null;
      if (inheritanceDependency != null)
        msgs = ((InternalEObject)inheritanceDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.RESOURCE__INHERITANCE_DEPENDENCY, null, msgs);
      if (newInheritanceDependency != null)
        msgs = ((InternalEObject)newInheritanceDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.RESOURCE__INHERITANCE_DEPENDENCY, null, msgs);
      msgs = basicSetInheritanceDependency(newInheritanceDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.RESOURCE__INHERITANCE_DEPENDENCY, newInheritanceDependency, newInheritanceDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceDependency> getReferenceDependencies()
  {
    if (referenceDependencies == null)
    {
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.RESOURCE__REFERENCE_DEPENDENCIES);
    }
    return referenceDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContainmentDependency> getContainmentDependencies()
  {
    if (containmentDependencies == null)
    {
      containmentDependencies = new EObjectContainmentEList<ContainmentDependency>(ContainmentDependency.class, this, CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES);
    }
    return containmentDependencies;
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
      case CodePackage.RESOURCE__INHERITANCE_DEPENDENCY:
        return basicSetInheritanceDependency(null, msgs);
      case CodePackage.RESOURCE__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES:
        return ((InternalEList<?>)getContainmentDependencies()).basicRemove(otherEnd, msgs);
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
      case CodePackage.RESOURCE__INHERITANCE_DEPENDENCY:
        return getInheritanceDependency();
      case CodePackage.RESOURCE__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
      case CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES:
        return getContainmentDependencies();
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
      case CodePackage.RESOURCE__INHERITANCE_DEPENDENCY:
        setInheritanceDependency((InheritanceDependency)newValue);
        return;
      case CodePackage.RESOURCE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
        return;
      case CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
        getContainmentDependencies().addAll((Collection<? extends ContainmentDependency>)newValue);
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
      case CodePackage.RESOURCE__INHERITANCE_DEPENDENCY:
        setInheritanceDependency((InheritanceDependency)null);
        return;
      case CodePackage.RESOURCE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        return;
      case CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
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
      case CodePackage.RESOURCE__INHERITANCE_DEPENDENCY:
        return inheritanceDependency != null;
      case CodePackage.RESOURCE__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
      case CodePackage.RESOURCE__CONTAINMENT_DEPENDENCIES:
        return containmentDependencies != null && !containmentDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ResourceImpl
