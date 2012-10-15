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

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.continuousintegration.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.continuousintegration.editor/src-gen' fileExtensions='ariadnecontinuousintegration' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
 * @generated
 */
public interface ContinuousintegrationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "continuousintegration";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/ContinuousIntegration";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-continuousintegration";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContinuousintegrationPackage eINSTANCE = fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl <em>Build Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl
   * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildServer()
   * @generated
   */
  int BUILD_SERVER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__URL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Build Server Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__BUILD_SERVER_KIND = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Build Jobs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER__BUILD_JOBS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Build Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Build Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_SERVER_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl <em>Build Job</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl
   * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildJob()
   * @generated
   */
  int BUILD_JOB = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__URL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Build Technology Kinds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__BUILD_TECHNOLOGY_KINDS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Build Kinds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__BUILD_KINDS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Promotion Locations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__PROMOTION_LOCATIONS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Build Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__BUILD_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB__COMPONENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Build Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Build Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_JOB_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl <em>Build Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl
   * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildDependency()
   * @generated
   */
  int BUILD_DEPENDENCY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__QUALIFIED_NAME = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Urls</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__URLS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Licenses</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY__LICENSES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Build Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Build Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_DEPENDENCY_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.PromotionLocationImpl <em>Promotion Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.continuousintegration.impl.PromotionLocationImpl
   * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getPromotionLocation()
   * @generated
   */
  int PROMOTION_LOCATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION__URL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Promotion Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Promotion Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTION_LOCATION_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.continuousintegration.BuildKind <em>Build Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
   * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildKind()
   * @generated
   */
  int BUILD_KIND = 4;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer <em>Build Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Server</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildServer
   * @generated
   */
  EClass getBuildServer();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildServer#getUrl()
   * @see #getBuildServer()
   * @generated
   */
  EAttribute getBuildServer_Url();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildServerKind <em>Build Server Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Build Server Kind</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildServerKind()
   * @see #getBuildServer()
   * @generated
   */
  EAttribute getBuildServer_BuildServerKind();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildJobs <em>Build Jobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Build Jobs</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildJobs()
   * @see #getBuildServer()
   * @generated
   */
  EReference getBuildServer_BuildJobs();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob <em>Build Job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Job</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob
   * @generated
   */
  EClass getBuildJob();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getUrl()
   * @see #getBuildJob()
   * @generated
   */
  EAttribute getBuildJob_Url();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildTechnologyKinds <em>Build Technology Kinds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Build Technology Kinds</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildTechnologyKinds()
   * @see #getBuildJob()
   * @generated
   */
  EAttribute getBuildJob_BuildTechnologyKinds();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildKinds <em>Build Kinds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Build Kinds</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildKinds()
   * @see #getBuildJob()
   * @generated
   */
  EAttribute getBuildJob_BuildKinds();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getPromotionLocations <em>Promotion Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promotion Locations</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getPromotionLocations()
   * @see #getBuildJob()
   * @generated
   */
  EReference getBuildJob_PromotionLocations();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildDependencies <em>Build Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Build Dependencies</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildDependencies()
   * @see #getBuildJob()
   * @generated
   */
  EReference getBuildJob_BuildDependencies();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildJob#getComponents()
   * @see #getBuildJob()
   * @generated
   */
  EReference getBuildJob_Components();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.continuousintegration.BuildDependency <em>Build Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Dependency</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildDependency
   * @generated
   */
  EClass getBuildDependency();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.continuousintegration.BuildDependency#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildDependency#getQualifiedName()
   * @see #getBuildDependency()
   * @generated
   */
  EAttribute getBuildDependency_QualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.continuousintegration.BuildDependency#getUrls <em>Urls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Urls</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildDependency#getUrls()
   * @see #getBuildDependency()
   * @generated
   */
  EAttribute getBuildDependency_Urls();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.continuousintegration.BuildDependency#getLicenses <em>Licenses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Licenses</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildDependency#getLicenses()
   * @see #getBuildDependency()
   * @generated
   */
  EAttribute getBuildDependency_Licenses();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.continuousintegration.PromotionLocation <em>Promotion Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Promotion Location</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.PromotionLocation
   * @generated
   */
  EClass getPromotionLocation();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.continuousintegration.PromotionLocation#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.PromotionLocation#getUrl()
   * @see #getPromotionLocation()
   * @generated
   */
  EAttribute getPromotionLocation_Url();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.continuousintegration.BuildKind <em>Build Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Build Kind</em>'.
   * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
   * @generated
   */
  EEnum getBuildKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ContinuousintegrationFactory getContinuousintegrationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl <em>Build Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildServerImpl
     * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildServer()
     * @generated
     */
    EClass BUILD_SERVER = eINSTANCE.getBuildServer();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_SERVER__URL = eINSTANCE.getBuildServer_Url();

    /**
     * The meta object literal for the '<em><b>Build Server Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_SERVER__BUILD_SERVER_KIND = eINSTANCE.getBuildServer_BuildServerKind();

    /**
     * The meta object literal for the '<em><b>Build Jobs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_SERVER__BUILD_JOBS = eINSTANCE.getBuildServer_BuildJobs();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl <em>Build Job</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildJobImpl
     * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildJob()
     * @generated
     */
    EClass BUILD_JOB = eINSTANCE.getBuildJob();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_JOB__URL = eINSTANCE.getBuildJob_Url();

    /**
     * The meta object literal for the '<em><b>Build Technology Kinds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_JOB__BUILD_TECHNOLOGY_KINDS = eINSTANCE.getBuildJob_BuildTechnologyKinds();

    /**
     * The meta object literal for the '<em><b>Build Kinds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_JOB__BUILD_KINDS = eINSTANCE.getBuildJob_BuildKinds();

    /**
     * The meta object literal for the '<em><b>Promotion Locations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_JOB__PROMOTION_LOCATIONS = eINSTANCE.getBuildJob_PromotionLocations();

    /**
     * The meta object literal for the '<em><b>Build Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_JOB__BUILD_DEPENDENCIES = eINSTANCE.getBuildJob_BuildDependencies();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_JOB__COMPONENTS = eINSTANCE.getBuildJob_Components();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl <em>Build Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.continuousintegration.impl.BuildDependencyImpl
     * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildDependency()
     * @generated
     */
    EClass BUILD_DEPENDENCY = eINSTANCE.getBuildDependency();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_DEPENDENCY__QUALIFIED_NAME = eINSTANCE.getBuildDependency_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Urls</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_DEPENDENCY__URLS = eINSTANCE.getBuildDependency_Urls();

    /**
     * The meta object literal for the '<em><b>Licenses</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_DEPENDENCY__LICENSES = eINSTANCE.getBuildDependency_Licenses();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.continuousintegration.impl.PromotionLocationImpl <em>Promotion Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.continuousintegration.impl.PromotionLocationImpl
     * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getPromotionLocation()
     * @generated
     */
    EClass PROMOTION_LOCATION = eINSTANCE.getPromotionLocation();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROMOTION_LOCATION__URL = eINSTANCE.getPromotionLocation_Url();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.continuousintegration.BuildKind <em>Build Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.continuousintegration.BuildKind
     * @see fr.obeo.ariadne.model.continuousintegration.impl.ContinuousintegrationPackageImpl#getBuildKind()
     * @generated
     */
    EEnum BUILD_KIND = eINSTANCE.getBuildKind();

  }

} //ContinuousintegrationPackage
