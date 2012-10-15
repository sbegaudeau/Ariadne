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
package fr.obeo.ariadne.model.scm.impl;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import fr.obeo.ariadne.model.scm.Branch;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.Repository;
import fr.obeo.ariadne.model.scm.ScmPackage;
import fr.obeo.ariadne.model.scm.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.RepositoryImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.RepositoryImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.RepositoryImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends VersionedElementImpl implements Repository
{
  /**
   * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranches()
   * @generated
   * @ordered
   */
  protected EList<Branch> branches;

  /**
   * The cached value of the '{@link #getCommits() <em>Commits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommits()
   * @generated
   * @ordered
   */
  protected EList<Commit> commits;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryImpl()
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
    return ScmPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Branch> getBranches()
  {
    if (branches == null)
    {
      branches = new EObjectContainmentEList<Branch>(Branch.class, this, ScmPackage.REPOSITORY__BRANCHES);
    }
    return branches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Commit> getCommits()
  {
    if (commits == null)
    {
      commits = new EObjectContainmentEList<Commit>(Commit.class, this, ScmPackage.REPOSITORY__COMMITS);
    }
    return commits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, ScmPackage.REPOSITORY__TAGS);
    }
    return tags;
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
      case ScmPackage.REPOSITORY__BRANCHES:
        return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
      case ScmPackage.REPOSITORY__COMMITS:
        return ((InternalEList<?>)getCommits()).basicRemove(otherEnd, msgs);
      case ScmPackage.REPOSITORY__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
      case ScmPackage.REPOSITORY__BRANCHES:
        return getBranches();
      case ScmPackage.REPOSITORY__COMMITS:
        return getCommits();
      case ScmPackage.REPOSITORY__TAGS:
        return getTags();
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
      case ScmPackage.REPOSITORY__BRANCHES:
        getBranches().clear();
        getBranches().addAll((Collection<? extends Branch>)newValue);
        return;
      case ScmPackage.REPOSITORY__COMMITS:
        getCommits().clear();
        getCommits().addAll((Collection<? extends Commit>)newValue);
        return;
      case ScmPackage.REPOSITORY__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
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
      case ScmPackage.REPOSITORY__BRANCHES:
        getBranches().clear();
        return;
      case ScmPackage.REPOSITORY__COMMITS:
        getCommits().clear();
        return;
      case ScmPackage.REPOSITORY__TAGS:
        getTags().clear();
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
      case ScmPackage.REPOSITORY__BRANCHES:
        return branches != null && !branches.isEmpty();
      case ScmPackage.REPOSITORY__COMMITS:
        return commits != null && !commits.isEmpty();
      case ScmPackage.REPOSITORY__TAGS:
        return tags != null && !tags.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RepositoryImpl
