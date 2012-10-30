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
package fr.obeo.ariadne.model.continuousintegration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage
 * @generated
 */
public interface ContinuousintegrationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContinuousintegrationFactory eINSTANCE = fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Build Server</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Server</em>'.
   * @generated
   */
  BuildServer createBuildServer();

  /**
   * Returns a new object of class '<em>Build Job</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Job</em>'.
   * @generated
   */
  BuildJob createBuildJob();

  /**
   * Returns a new object of class '<em>Build Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Artifact</em>'.
   * @generated
   */
  BuildArtifact createBuildArtifact();

  /**
   * Returns a new object of class '<em>Promotion Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Promotion Location</em>'.
   * @generated
   */
  PromotionLocation createPromotionLocation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ContinuousintegrationPackage getContinuousintegrationPackage();

} //ContinuousintegrationFactory
