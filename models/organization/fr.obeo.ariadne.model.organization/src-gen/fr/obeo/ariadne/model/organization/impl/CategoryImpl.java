/**
 */
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.core.impl.ElementImpl;

import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Project;
import fr.obeo.ariadne.model.organization.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.CategoryImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.CategoryImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.CategoryImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends ElementImpl implements Category
{
  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> projects;

  /**
   * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifications()
   * @generated
   * @ordered
   */
  protected EList<Specification> specifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CategoryImpl()
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
    return OrganizationPackage.Literals.CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentWithInverseEList<Project>(Project.class, this, OrganizationPackage.CATEGORY__PROJECTS, OrganizationPackage.PROJECT__CATEGORY);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Specification> getSpecifications()
  {
    if (specifications == null)
    {
      specifications = new EObjectContainmentEList<Specification>(Specification.class, this, OrganizationPackage.CATEGORY__SPECIFICATIONS);
    }
    return specifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organization getOrganization()
  {
    if (eContainerFeatureID() != OrganizationPackage.CATEGORY__ORGANIZATION) return null;
    return (Organization)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOrganization, OrganizationPackage.CATEGORY__ORGANIZATION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganization(Organization newOrganization)
  {
    if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.CATEGORY__ORGANIZATION && newOrganization != null))
    {
      if (EcoreUtil.isAncestor(this, newOrganization))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOrganization != null)
        msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OrganizationPackage.ORGANIZATION__CATEGORIES, Organization.class, msgs);
      msgs = basicSetOrganization(newOrganization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.CATEGORY__ORGANIZATION, newOrganization, newOrganization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrganizationPackage.CATEGORY__PROJECTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
      case OrganizationPackage.CATEGORY__ORGANIZATION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOrganization((Organization)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case OrganizationPackage.CATEGORY__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.CATEGORY__SPECIFICATIONS:
        return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.CATEGORY__ORGANIZATION:
        return basicSetOrganization(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case OrganizationPackage.CATEGORY__ORGANIZATION:
        return eInternalContainer().eInverseRemove(this, OrganizationPackage.ORGANIZATION__CATEGORIES, Organization.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case OrganizationPackage.CATEGORY__PROJECTS:
        return getProjects();
      case OrganizationPackage.CATEGORY__SPECIFICATIONS:
        return getSpecifications();
      case OrganizationPackage.CATEGORY__ORGANIZATION:
        return getOrganization();
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
      case OrganizationPackage.CATEGORY__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case OrganizationPackage.CATEGORY__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends Specification>)newValue);
        return;
      case OrganizationPackage.CATEGORY__ORGANIZATION:
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
      case OrganizationPackage.CATEGORY__PROJECTS:
        getProjects().clear();
        return;
      case OrganizationPackage.CATEGORY__SPECIFICATIONS:
        getSpecifications().clear();
        return;
      case OrganizationPackage.CATEGORY__ORGANIZATION:
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
      case OrganizationPackage.CATEGORY__PROJECTS:
        return projects != null && !projects.isEmpty();
      case OrganizationPackage.CATEGORY__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
      case OrganizationPackage.CATEGORY__ORGANIZATION:
        return getOrganization() != null;
    }
    return super.eIsSet(featureID);
  }

} //CategoryImpl
