/**
 */
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.core.impl.ElementImpl;

import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.OrganizationDependency;
import fr.obeo.ariadne.model.organization.OrganizationDependencyKind;
import fr.obeo.ariadne.model.organization.OrganizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl#getOrganizationDependencyKinds <em>Organization Dependency Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationDependencyImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationDependencyImpl extends ElementImpl implements OrganizationDependency
{
  /**
   * The cached value of the '{@link #getOrganizationDependencyKinds() <em>Organization Dependency Kinds</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationDependencyKinds()
   * @generated
   * @ordered
   */
  protected EList<OrganizationDependencyKind> organizationDependencyKinds;

  /**
   * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganization()
   * @generated
   * @ordered
   */
  protected Organization organization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationDependencyImpl()
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
    return OrganizationPackage.Literals.ORGANIZATION_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrganizationDependencyKind> getOrganizationDependencyKinds()
  {
    if (organizationDependencyKinds == null)
    {
      organizationDependencyKinds = new EDataTypeEList<OrganizationDependencyKind>(OrganizationDependencyKind.class, this, OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS);
    }
    return organizationDependencyKinds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organization getOrganization()
  {
    if (organization != null && organization.eIsProxy())
    {
      InternalEObject oldOrganization = (InternalEObject)organization;
      organization = (Organization)eResolveProxy(oldOrganization);
      if (organization != oldOrganization)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION, oldOrganization, organization));
      }
    }
    return organization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organization basicGetOrganization()
  {
    return organization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganization(Organization newOrganization)
  {
    Organization oldOrganization = organization;
    organization = newOrganization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION, oldOrganization, organization));
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
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS:
        return getOrganizationDependencyKinds();
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION:
        if (resolve) return getOrganization();
        return basicGetOrganization();
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
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS:
        getOrganizationDependencyKinds().clear();
        getOrganizationDependencyKinds().addAll((Collection<? extends OrganizationDependencyKind>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION:
        setOrganization((Organization)newValue);
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
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS:
        getOrganizationDependencyKinds().clear();
        return;
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION:
        setOrganization((Organization)null);
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
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION_DEPENDENCY_KINDS:
        return organizationDependencyKinds != null && !organizationDependencyKinds.isEmpty();
      case OrganizationPackage.ORGANIZATION_DEPENDENCY__ORGANIZATION:
        return organization != null;
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
    result.append(" (organizationDependencyKinds: ");
    result.append(organizationDependencyKinds);
    result.append(')');
    return result.toString();
  }

} //OrganizationDependencyImpl
