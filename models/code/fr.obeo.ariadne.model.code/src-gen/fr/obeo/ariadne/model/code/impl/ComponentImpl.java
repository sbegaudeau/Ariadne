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
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.ClasspathEntry;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Component;
import fr.obeo.ariadne.model.code.ProvidedService;
import fr.obeo.ariadne.model.code.ReferencedService;
import fr.obeo.ariadne.model.code.ResourcesContainer;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getClasspathEntries <em>Classpath Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getResourcesContainers <em>Resources Containers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getReferencedServices <em>Referenced Services</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getProvidedServices <em>Provided Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends VersionedElementImpl implements Component
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getClasspathEntries() <em>Classpath Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasspathEntries()
   * @generated
   * @ordered
   */
  protected EList<ClasspathEntry> classpathEntries;

  /**
   * The cached value of the '{@link #getResourcesContainers() <em>Resources Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcesContainers()
   * @generated
   * @ordered
   */
  protected EList<ResourcesContainer> resourcesContainers;

  /**
   * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubcomponents()
   * @generated
   * @ordered
   */
  protected EList<Component> subcomponents;

  /**
   * The cached value of the '{@link #getReferencedServices() <em>Referenced Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedServices()
   * @generated
   * @ordered
   */
  protected EList<ReferencedService> referencedServices;

  /**
   * The cached value of the '{@link #getProvidedServices() <em>Provided Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedServices()
   * @generated
   * @ordered
   */
  protected EList<ProvidedService> providedServices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return CodePackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.COMPONENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClasspathEntry> getClasspathEntries()
  {
    if (classpathEntries == null)
    {
      classpathEntries = new EObjectContainmentWithInverseEList<ClasspathEntry>(ClasspathEntry.class, this, CodePackage.COMPONENT__CLASSPATH_ENTRIES, CodePackage.CLASSPATH_ENTRY__COMPONENT);
    }
    return classpathEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourcesContainer> getResourcesContainers()
  {
    if (resourcesContainers == null)
    {
      resourcesContainers = new EObjectContainmentEList<ResourcesContainer>(ResourcesContainer.class, this, CodePackage.COMPONENT__RESOURCES_CONTAINERS);
    }
    return resourcesContainers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getSubcomponents()
  {
    if (subcomponents == null)
    {
      subcomponents = new EObjectContainmentEList<Component>(Component.class, this, CodePackage.COMPONENT__SUBCOMPONENTS);
    }
    return subcomponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferencedService> getReferencedServices()
  {
    if (referencedServices == null)
    {
      referencedServices = new EObjectContainmentEList<ReferencedService>(ReferencedService.class, this, CodePackage.COMPONENT__REFERENCED_SERVICES);
    }
    return referencedServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProvidedService> getProvidedServices()
  {
    if (providedServices == null)
    {
      providedServices = new EObjectContainmentEList<ProvidedService>(ProvidedService.class, this, CodePackage.COMPONENT__PROVIDED_SERVICES);
    }
    return providedServices;
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
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasspathEntries()).basicAdd(otherEnd, msgs);
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
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return ((InternalEList<?>)getClasspathEntries()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return ((InternalEList<?>)getResourcesContainers()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__SUBCOMPONENTS:
        return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__REFERENCED_SERVICES:
        return ((InternalEList<?>)getReferencedServices()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__PROVIDED_SERVICES:
        return ((InternalEList<?>)getProvidedServices()).basicRemove(otherEnd, msgs);
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
      case CodePackage.COMPONENT__IDENTIFIER:
        return getIdentifier();
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return getClasspathEntries();
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return getResourcesContainers();
      case CodePackage.COMPONENT__SUBCOMPONENTS:
        return getSubcomponents();
      case CodePackage.COMPONENT__REFERENCED_SERVICES:
        return getReferencedServices();
      case CodePackage.COMPONENT__PROVIDED_SERVICES:
        return getProvidedServices();
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
      case CodePackage.COMPONENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        getClasspathEntries().clear();
        getClasspathEntries().addAll((Collection<? extends ClasspathEntry>)newValue);
        return;
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        getResourcesContainers().clear();
        getResourcesContainers().addAll((Collection<? extends ResourcesContainer>)newValue);
        return;
      case CodePackage.COMPONENT__SUBCOMPONENTS:
        getSubcomponents().clear();
        getSubcomponents().addAll((Collection<? extends Component>)newValue);
        return;
      case CodePackage.COMPONENT__REFERENCED_SERVICES:
        getReferencedServices().clear();
        getReferencedServices().addAll((Collection<? extends ReferencedService>)newValue);
        return;
      case CodePackage.COMPONENT__PROVIDED_SERVICES:
        getProvidedServices().clear();
        getProvidedServices().addAll((Collection<? extends ProvidedService>)newValue);
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
      case CodePackage.COMPONENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        getClasspathEntries().clear();
        return;
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        getResourcesContainers().clear();
        return;
      case CodePackage.COMPONENT__SUBCOMPONENTS:
        getSubcomponents().clear();
        return;
      case CodePackage.COMPONENT__REFERENCED_SERVICES:
        getReferencedServices().clear();
        return;
      case CodePackage.COMPONENT__PROVIDED_SERVICES:
        getProvidedServices().clear();
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
      case CodePackage.COMPONENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return classpathEntries != null && !classpathEntries.isEmpty();
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return resourcesContainers != null && !resourcesContainers.isEmpty();
      case CodePackage.COMPONENT__SUBCOMPONENTS:
        return subcomponents != null && !subcomponents.isEmpty();
      case CodePackage.COMPONENT__REFERENCED_SERVICES:
        return referencedServices != null && !referencedServices.isEmpty();
      case CodePackage.COMPONENT__PROVIDED_SERVICES:
        return providedServices != null && !providedServices.isEmpty();
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
