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
package fr.obeo.ariadne.model.scm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.scm.ScmPackage
 * @generated
 */
public interface ScmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScmFactory eINSTANCE = fr.obeo.ariadne.model.scm.impl.ScmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branch</em>'.
   * @generated
   */
  Branch createBranch();

  /**
   * Returns a new object of class '<em>Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag</em>'.
   * @generated
   */
  Tag createTag();

  /**
   * Returns a new object of class '<em>Commit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commit</em>'.
   * @generated
   */
  Commit createCommit();

  /**
   * Returns a new object of class '<em>Resource Change</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Change</em>'.
   * @generated
   */
  ResourceChange createResourceChange();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScmPackage getScmPackage();

} //ScmFactory
