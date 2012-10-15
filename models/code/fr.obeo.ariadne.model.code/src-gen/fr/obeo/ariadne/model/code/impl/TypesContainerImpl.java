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

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Type;
import fr.obeo.ariadne.model.code.TypesContainer;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypesContainerImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypesContainerImpl#getTypesContainers <em>Types Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesContainerImpl extends VersionedElementImpl implements TypesContainer
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getTypesContainers() <em>Types Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesContainers()
   * @generated
   * @ordered
   */
  protected EList<TypesContainer> typesContainers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesContainerImpl()
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
    return CodePackage.Literals.TYPES_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, CodePackage.TYPES_CONTAINER__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypesContainer> getTypesContainers()
  {
    if (typesContainers == null)
    {
      typesContainers = new EObjectContainmentEList<TypesContainer>(TypesContainer.class, this, CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS);
    }
    return typesContainers;
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
      case CodePackage.TYPES_CONTAINER__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS:
        return ((InternalEList<?>)getTypesContainers()).basicRemove(otherEnd, msgs);
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
      case CodePackage.TYPES_CONTAINER__TYPES:
        return getTypes();
      case CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS:
        return getTypesContainers();
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
      case CodePackage.TYPES_CONTAINER__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS:
        getTypesContainers().clear();
        getTypesContainers().addAll((Collection<? extends TypesContainer>)newValue);
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
      case CodePackage.TYPES_CONTAINER__TYPES:
        getTypes().clear();
        return;
      case CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS:
        getTypesContainers().clear();
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
      case CodePackage.TYPES_CONTAINER__TYPES:
        return types != null && !types.isEmpty();
      case CodePackage.TYPES_CONTAINER__TYPES_CONTAINERS:
        return typesContainers != null && !typesContainers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypesContainerImpl
