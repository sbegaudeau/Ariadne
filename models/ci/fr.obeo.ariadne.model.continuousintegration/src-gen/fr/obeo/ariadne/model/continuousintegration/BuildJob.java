/**
 */
package fr.obeo.ariadne.model.continuousintegration;

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.core.Element;

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
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getPromotionLocations <em>Promotion Locations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getBuildDependencies <em>Build Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildJob#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob()
 * @model
 * @generated
 */
public interface BuildJob extends Element
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
   * Returns the value of the '<em><b>Build Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_BuildDependencies()
   * @model containment="true"
   * @generated
   */
  EList<BuildDependency> getBuildDependencies();

  /**
   * Returns the value of the '<em><b>Components</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildJob_Components()
   * @model
   * @generated
   */
  EList<Component> getComponents();

} // BuildJob
