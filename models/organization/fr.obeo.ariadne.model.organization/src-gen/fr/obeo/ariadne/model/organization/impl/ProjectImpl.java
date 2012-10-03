/**
 */
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.environment.DevelopmentEnvironment;
import fr.obeo.ariadne.model.environment.RuntimeEnvironment;
import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Project;
import fr.obeo.ariadne.model.organization.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getRuntimeEnvironments <em>Runtime Environments</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getDependentProjects <em>Dependent Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends VersionedElementImpl implements Project
{
  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getDevelopmentEnvironments() <em>Development Environments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevelopmentEnvironments()
   * @generated
   * @ordered
   */
  protected EList<DevelopmentEnvironment> developmentEnvironments;

  /**
   * The cached value of the '{@link #getRuntimeEnvironments() <em>Runtime Environments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuntimeEnvironments()
   * @generated
   * @ordered
   */
  protected EList<RuntimeEnvironment> runtimeEnvironments;

  /**
   * The cached value of the '{@link #getSubProjects() <em>Sub Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> subProjects;

  /**
   * The cached value of the '{@link #getDependentProjects() <em>Dependent Projects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependentProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> dependentProjects;

  /**
   * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
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
  protected ProjectImpl()
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
    return OrganizationPackage.Literals.PROJECT;
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
      components = new EObjectContainmentEList<Component>(Component.class, this, OrganizationPackage.PROJECT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DevelopmentEnvironment> getDevelopmentEnvironments()
  {
    if (developmentEnvironments == null)
    {
      developmentEnvironments = new EObjectContainmentEList<DevelopmentEnvironment>(DevelopmentEnvironment.class, this, OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS);
    }
    return developmentEnvironments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RuntimeEnvironment> getRuntimeEnvironments()
  {
    if (runtimeEnvironments == null)
    {
      runtimeEnvironments = new EObjectContainmentEList<RuntimeEnvironment>(RuntimeEnvironment.class, this, OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS);
    }
    return runtimeEnvironments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getSubProjects()
  {
    if (subProjects == null)
    {
      subProjects = new EObjectContainmentEList<Project>(Project.class, this, OrganizationPackage.PROJECT__SUB_PROJECTS);
    }
    return subProjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getDependentProjects()
  {
    if (dependentProjects == null)
    {
      dependentProjects = new EObjectResolvingEList<Project>(Project.class, this, OrganizationPackage.PROJECT__DEPENDENT_PROJECTS);
    }
    return dependentProjects;
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
      specifications = new EObjectResolvingEList<Specification>(Specification.class, this, OrganizationPackage.PROJECT__SPECIFICATIONS);
    }
    return specifications;
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        return ((InternalEList<?>)getDevelopmentEnvironments()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        return ((InternalEList<?>)getRuntimeEnvironments()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        return ((InternalEList<?>)getSubProjects()).basicRemove(otherEnd, msgs);
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        return getComponents();
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        return getDevelopmentEnvironments();
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        return getRuntimeEnvironments();
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        return getSubProjects();
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        return getDependentProjects();
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        return getSpecifications();
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        getDevelopmentEnvironments().clear();
        getDevelopmentEnvironments().addAll((Collection<? extends DevelopmentEnvironment>)newValue);
        return;
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        getRuntimeEnvironments().clear();
        getRuntimeEnvironments().addAll((Collection<? extends RuntimeEnvironment>)newValue);
        return;
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        getSubProjects().clear();
        getSubProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        getDependentProjects().clear();
        getDependentProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends Specification>)newValue);
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        getComponents().clear();
        return;
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        getDevelopmentEnvironments().clear();
        return;
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        getRuntimeEnvironments().clear();
        return;
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        getSubProjects().clear();
        return;
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        getDependentProjects().clear();
        return;
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        getSpecifications().clear();
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        return components != null && !components.isEmpty();
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        return developmentEnvironments != null && !developmentEnvironments.isEmpty();
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        return runtimeEnvironments != null && !runtimeEnvironments.isEmpty();
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        return subProjects != null && !subProjects.isEmpty();
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        return dependentProjects != null && !dependentProjects.isEmpty();
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProjectImpl
