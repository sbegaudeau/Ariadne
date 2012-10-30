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

import fr.obeo.ariadne.model.core.Entry;
import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildTechnologyKinds <em>Build Technology Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildKinds <em>Build Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getEntries <em>Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getPromotionLocations <em>Promotion Locations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildArtifacts <em>Build Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob()
 * @model
 * @generated
 */
public interface BuildJob extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Build Technology Kinds</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Technology Kinds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Technology Kinds</em>' attribute list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_BuildTechnologyKinds()
   * @model unique="false"
   * @generated
   */
  EList<String> getBuildTechnologyKinds();

  /**
   * Returns the value of the '<em><b>Build Kinds</b></em>' attribute list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildKind}.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.continuousintegration.BuildKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Kinds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Kinds</em>' attribute list.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_BuildKinds()
   * @model unique="false"
   * @generated
   */
  EList<BuildKind> getBuildKinds();

  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_Entries()
   * @model containment="true"
   * @generated
   */
  EList<Entry> getEntries();

  /**
   * Returns the value of the '<em><b>Promotion Locations</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.PromotionLocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promotion Locations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promotion Locations</em>' containment reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_PromotionLocations()
   * @model containment="true"
   * @generated
   */
  EList<PromotionLocation> getPromotionLocations();

  /**
   * Returns the value of the '<em><b>Build Artifacts</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildArtifact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Artifacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Artifacts</em>' containment reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_BuildArtifacts()
   * @model containment="true"
   * @generated
   */
  EList<BuildArtifact> getBuildArtifacts();

} // BuildJob
