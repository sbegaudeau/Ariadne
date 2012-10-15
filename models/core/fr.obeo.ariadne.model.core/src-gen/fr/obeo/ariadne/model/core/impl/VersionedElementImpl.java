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
import fr.obeo.ariadne.model.core.Person;
import fr.obeo.ariadne.model.core.Property;
import fr.obeo.ariadne.model.core.Version;
import fr.obeo.ariadne.model.core.VersionedDependency;
import fr.obeo.ariadne.model.core.VersionedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.core.impl.VersionedElementImpl#getVersionedDependencies <em>Versioned Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VersionedElementImpl extends MinimalEObjectImpl.Container implements VersionedElement
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
   * The cached value of the '{@link #getAuthors() <em>Authors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthors()
   * @generated
   * @ordered
   */
  protected EList<Person> authors;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;

  /**
   * The cached value of the '{@link #getVersionedDependencies() <em>Versioned Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionedDependencies()
   * @generated
   * @ordered
   */
  protected EList<VersionedDependency> versionedDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionedElementImpl()
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
    return CorePackage.Literals.VERSIONED_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_ELEMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getAuthors()
  {
    if (authors == null)
    {
      authors = new EObjectResolvingEList<Person>(Person.class, this, CorePackage.VERSIONED_ELEMENT__AUTHORS);
    }
    return authors;
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
      properties = new EObjectResolvingEList<Property>(Property.class, this, CorePackage.VERSIONED_ELEMENT__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs)
  {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_ELEMENT__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(Version newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_ELEMENT__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERSIONED_ELEMENT__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERSIONED_ELEMENT__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VersionedDependency> getVersionedDependencies()
  {
    if (versionedDependencies == null)
    {
      versionedDependencies = new EObjectContainmentEList<VersionedDependency>(VersionedDependency.class, this, CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES);
    }
    return versionedDependencies;
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
      case CorePackage.VERSIONED_ELEMENT__VERSION:
        return basicSetVersion(null, msgs);
      case CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES:
        return ((InternalEList<?>)getVersionedDependencies()).basicRemove(otherEnd, msgs);
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
      case CorePackage.VERSIONED_ELEMENT__NAME:
        return getName();
      case CorePackage.VERSIONED_ELEMENT__DESCRIPTION:
        return getDescription();
      case CorePackage.VERSIONED_ELEMENT__AUTHORS:
        return getAuthors();
      case CorePackage.VERSIONED_ELEMENT__PROPERTIES:
        return getProperties();
      case CorePackage.VERSIONED_ELEMENT__VERSION:
        return getVersion();
      case CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES:
        return getVersionedDependencies();
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
      case CorePackage.VERSIONED_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case CorePackage.VERSIONED_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case CorePackage.VERSIONED_ELEMENT__AUTHORS:
        getAuthors().clear();
        getAuthors().addAll((Collection<? extends Person>)newValue);
        return;
      case CorePackage.VERSIONED_ELEMENT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case CorePackage.VERSIONED_ELEMENT__VERSION:
        setVersion((Version)newValue);
        return;
      case CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES:
        getVersionedDependencies().clear();
        getVersionedDependencies().addAll((Collection<? extends VersionedDependency>)newValue);
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
      case CorePackage.VERSIONED_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CorePackage.VERSIONED_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case CorePackage.VERSIONED_ELEMENT__AUTHORS:
        getAuthors().clear();
        return;
      case CorePackage.VERSIONED_ELEMENT__PROPERTIES:
        getProperties().clear();
        return;
      case CorePackage.VERSIONED_ELEMENT__VERSION:
        setVersion((Version)null);
        return;
      case CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES:
        getVersionedDependencies().clear();
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
      case CorePackage.VERSIONED_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CorePackage.VERSIONED_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case CorePackage.VERSIONED_ELEMENT__AUTHORS:
        return authors != null && !authors.isEmpty();
      case CorePackage.VERSIONED_ELEMENT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case CorePackage.VERSIONED_ELEMENT__VERSION:
        return version != null;
      case CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES:
        return versionedDependencies != null && !versionedDependencies.isEmpty();
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

} //VersionedElementImpl
