/**
 */
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.environment.DevelopmentEnvironment;
import fr.obeo.ariadne.model.environment.RuntimeEnvironment;
import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Project;
import fr.obeo.ariadne.model.organization.Release;
import fr.obeo.ariadne.model.organization.Specification;

import fr.obeo.ariadne.model.scm.Repository;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getDependentProjects <em>Dependent Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.ProjectImpl#getCategory <em>Category</em>}</li>
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
   * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReleases()
   * @generated
   * @ordered
   */
  protected EList<Release> releases;

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
   * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositories()
   * @generated
   * @ordered
   */
  protected EList<Repository> repositories;

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
  public EList<Release> getReleases()
  {
    if (releases == null)
    {
      releases = new EObjectContainmentEList<Release>(Release.class, this, OrganizationPackage.PROJECT__RELEASES);
    }
    return releases;
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
  public EList<Repository> getRepositories()
  {
    if (repositories == null)
    {
      repositories = new EObjectResolvingEList<Repository>(Repository.class, this, OrganizationPackage.PROJECT__REPOSITORIES);
    }
    return repositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category getCategory()
  {
    if (eContainerFeatureID() != OrganizationPackage.PROJECT__CATEGORY) return null;
    return (Category)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newCategory, OrganizationPackage.PROJECT__CATEGORY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(Category newCategory)
  {
    if (newCategory != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.PROJECT__CATEGORY && newCategory != null))
    {
      if (EcoreUtil.isAncestor(this, newCategory))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCategory != null)
        msgs = ((InternalEObject)newCategory).eInverseAdd(this, OrganizationPackage.CATEGORY__PROJECTS, Category.class, msgs);
      msgs = basicSetCategory(newCategory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.PROJECT__CATEGORY, newCategory, newCategory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrganizationPackage.PROJECT__CATEGORY:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCategory((Category)otherEnd, msgs);
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        return ((InternalEList<?>)getDevelopmentEnvironments()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        return ((InternalEList<?>)getRuntimeEnvironments()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        return ((InternalEList<?>)getSubProjects()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__RELEASES:
        return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.PROJECT__CATEGORY:
        return basicSetCategory(null, msgs);
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
      case OrganizationPackage.PROJECT__CATEGORY:
        return eInternalContainer().eInverseRemove(this, OrganizationPackage.CATEGORY__PROJECTS, Category.class, msgs);
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
      case OrganizationPackage.PROJECT__COMPONENTS:
        return getComponents();
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
        return getDevelopmentEnvironments();
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
        return getRuntimeEnvironments();
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
        return getSubProjects();
      case OrganizationPackage.PROJECT__RELEASES:
        return getReleases();
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        return getDependentProjects();
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        return getSpecifications();
      case OrganizationPackage.PROJECT__REPOSITORIES:
        return getRepositories();
      case OrganizationPackage.PROJECT__CATEGORY:
        return getCategory();
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
      case OrganizationPackage.PROJECT__RELEASES:
        getReleases().clear();
        getReleases().addAll((Collection<? extends Release>)newValue);
        return;
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        getDependentProjects().clear();
        getDependentProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends Specification>)newValue);
        return;
      case OrganizationPackage.PROJECT__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends Repository>)newValue);
        return;
      case OrganizationPackage.PROJECT__CATEGORY:
        setCategory((Category)newValue);
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
      case OrganizationPackage.PROJECT__RELEASES:
        getReleases().clear();
        return;
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        getDependentProjects().clear();
        return;
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        getSpecifications().clear();
        return;
      case OrganizationPackage.PROJECT__REPOSITORIES:
        getRepositories().clear();
        return;
      case OrganizationPackage.PROJECT__CATEGORY:
        setCategory((Category)null);
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
      case OrganizationPackage.PROJECT__RELEASES:
        return releases != null && !releases.isEmpty();
      case OrganizationPackage.PROJECT__DEPENDENT_PROJECTS:
        return dependentProjects != null && !dependentProjects.isEmpty();
      case OrganizationPackage.PROJECT__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
      case OrganizationPackage.PROJECT__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case OrganizationPackage.PROJECT__CATEGORY:
        return getCategory() != null;
    }
    return super.eIsSet(featureID);
  }

} //ProjectImpl
