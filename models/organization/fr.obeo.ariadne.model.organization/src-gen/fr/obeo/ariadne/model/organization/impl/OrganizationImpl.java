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
package fr.obeo.ariadne.model.organization.impl;

import fr.obeo.ariadne.model.continuousintegration.BuildServer;

import fr.obeo.ariadne.model.core.Person;
import fr.obeo.ariadne.model.core.Property;

import fr.obeo.ariadne.model.organization.Category;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.OrganizationDependency;
import fr.obeo.ariadne.model.organization.OrganizationPackage;

import fr.obeo.ariadne.model.scm.Repository;

import fr.obeo.ariadne.model.tasks.TasksRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getBuildServers <em>Build Servers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getTasksRepositories <em>Tasks Repositories</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.impl.OrganizationImpl#getOrganizationDependencies <em>Organization Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends MinimalEObjectImpl.Container implements Organization
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategories()
   * @generated
   * @ordered
   */
  protected EList<Category> categories;

  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositories()
   * @generated
   * @ordered
   */
  protected EList<Repository> repositories;

  /**
   * The cached value of the '{@link #getBuildServers() <em>Build Servers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildServers()
   * @generated
   * @ordered
   */
  protected EList<BuildServer> buildServers;

  /**
   * The cached value of the '{@link #getTasksRepositories() <em>Tasks Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasksRepositories()
   * @generated
   * @ordered
   */
  protected EList<TasksRepository> tasksRepositories;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getOrganizationDependencies() <em>Organization Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationDependencies()
   * @generated
   * @ordered
   */
  protected EList<OrganizationDependency> organizationDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationImpl()
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
    return OrganizationPackage.Literals.ORGANIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORGANIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORGANIZATION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Category> getCategories()
  {
    if (categories == null)
    {
      categories = new EObjectContainmentWithInverseEList<Category>(Category.class, this, OrganizationPackage.ORGANIZATION__CATEGORIES, OrganizationPackage.CATEGORY__ORGANIZATION);
    }
    return categories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectContainmentEList<Person>(Person.class, this, OrganizationPackage.ORGANIZATION__PERSONS);
    }
    return persons;
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
      repositories = new EObjectContainmentEList<Repository>(Repository.class, this, OrganizationPackage.ORGANIZATION__REPOSITORIES);
    }
    return repositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildServer> getBuildServers()
  {
    if (buildServers == null)
    {
      buildServers = new EObjectContainmentEList<BuildServer>(BuildServer.class, this, OrganizationPackage.ORGANIZATION__BUILD_SERVERS);
    }
    return buildServers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TasksRepository> getTasksRepositories()
  {
    if (tasksRepositories == null)
    {
      tasksRepositories = new EObjectContainmentEList<TasksRepository>(TasksRepository.class, this, OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES);
    }
    return tasksRepositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, OrganizationPackage.ORGANIZATION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrganizationDependency> getOrganizationDependencies()
  {
    if (organizationDependencies == null)
    {
      organizationDependencies = new EObjectContainmentEList<OrganizationDependency>(OrganizationDependency.class, this, OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES);
    }
    return organizationDependencies;
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
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
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
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__PERSONS:
        return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
        return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
        return ((InternalEList<?>)getBuildServers()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
        return ((InternalEList<?>)getTasksRepositories()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
        return ((InternalEList<?>)getOrganizationDependencies()).basicRemove(otherEnd, msgs);
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
      case OrganizationPackage.ORGANIZATION__NAME:
        return getName();
      case OrganizationPackage.ORGANIZATION__DESCRIPTION:
        return getDescription();
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        return getCategories();
      case OrganizationPackage.ORGANIZATION__PERSONS:
        return getPersons();
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
        return getRepositories();
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
        return getBuildServers();
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
        return getTasksRepositories();
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
        return getProperties();
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
        return getOrganizationDependencies();
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
      case OrganizationPackage.ORGANIZATION__NAME:
        setName((String)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        getCategories().clear();
        getCategories().addAll((Collection<? extends Category>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends Repository>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
        getBuildServers().clear();
        getBuildServers().addAll((Collection<? extends BuildServer>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
        getTasksRepositories().clear();
        getTasksRepositories().addAll((Collection<? extends TasksRepository>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
        getOrganizationDependencies().clear();
        getOrganizationDependencies().addAll((Collection<? extends OrganizationDependency>)newValue);
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
      case OrganizationPackage.ORGANIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrganizationPackage.ORGANIZATION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        getCategories().clear();
        return;
      case OrganizationPackage.ORGANIZATION__PERSONS:
        getPersons().clear();
        return;
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
        getRepositories().clear();
        return;
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
        getBuildServers().clear();
        return;
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
        getTasksRepositories().clear();
        return;
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
        getProperties().clear();
        return;
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
        getOrganizationDependencies().clear();
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
      case OrganizationPackage.ORGANIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrganizationPackage.ORGANIZATION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
        return categories != null && !categories.isEmpty();
      case OrganizationPackage.ORGANIZATION__PERSONS:
        return persons != null && !persons.isEmpty();
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
        return buildServers != null && !buildServers.isEmpty();
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
        return tasksRepositories != null && !tasksRepositories.isEmpty();
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
        return organizationDependencies != null && !organizationDependencies.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //OrganizationImpl
