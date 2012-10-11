/**
 */
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.BuildKind;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Release;

import fr.obeo.ariadne.model.scm.Branch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl#getBuildJobs <em>Build Jobs</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ReleaseImpl#getBranchs <em>Branchs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReleaseImpl extends VersionedElementImpl implements Release
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final BuildKind KIND_EDEFAULT = BuildKind.RELEASE;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected BuildKind kind = KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getBuildJobs() <em>Build Jobs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildJobs()
   * @generated
   * @ordered
   */
  protected EList<BuildJob> buildJobs;

  /**
   * The cached value of the '{@link #getBranchs() <em>Branchs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranchs()
   * @generated
   * @ordered
   */
  protected EList<Branch> branchs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReleaseImpl()
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
    return OrganizationPackage.Literals.RELEASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(BuildKind newKind)
  {
    BuildKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.RELEASE__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectResolvingEList<Component>(Component.class, this, OrganizationPackage.RELEASE__COMPONENTS);
    }
    return components;
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
      buildJobs = new EObjectResolvingEList<BuildJob>(BuildJob.class, this, OrganizationPackage.RELEASE__BUILD_JOBS);
    }
    return buildJobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Branch> getBranchs()
  {
    if (branchs == null)
    {
      branchs = new EObjectResolvingEList<Branch>(Branch.class, this, OrganizationPackage.RELEASE__BRANCHS);
    }
    return branchs;
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
      case OrganizationPackage.RELEASE__KIND:
        return getKind();
      case OrganizationPackage.RELEASE__COMPONENTS:
        return getComponents();
      case OrganizationPackage.RELEASE__BUILD_JOBS:
        return getBuildJobs();
      case OrganizationPackage.RELEASE__BRANCHS:
        return getBranchs();
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
      case OrganizationPackage.RELEASE__KIND:
        setKind((BuildKind)newValue);
        return;
      case OrganizationPackage.RELEASE__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case OrganizationPackage.RELEASE__BUILD_JOBS:
        getBuildJobs().clear();
        getBuildJobs().addAll((Collection<? extends BuildJob>)newValue);
        return;
      case OrganizationPackage.RELEASE__BRANCHS:
        getBranchs().clear();
        getBranchs().addAll((Collection<? extends Branch>)newValue);
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
      case OrganizationPackage.RELEASE__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case OrganizationPackage.RELEASE__COMPONENTS:
        getComponents().clear();
        return;
      case OrganizationPackage.RELEASE__BUILD_JOBS:
        getBuildJobs().clear();
        return;
      case OrganizationPackage.RELEASE__BRANCHS:
        getBranchs().clear();
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
      case OrganizationPackage.RELEASE__KIND:
        return kind != KIND_EDEFAULT;
      case OrganizationPackage.RELEASE__COMPONENTS:
        return components != null && !components.isEmpty();
      case OrganizationPackage.RELEASE__BUILD_JOBS:
        return buildJobs != null && !buildJobs.isEmpty();
      case OrganizationPackage.RELEASE__BRANCHS:
        return branchs != null && !branchs.isEmpty();
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //ReleaseImpl
