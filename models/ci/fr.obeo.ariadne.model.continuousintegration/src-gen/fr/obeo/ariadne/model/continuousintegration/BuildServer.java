/**
 */
package fr.obeo.ariadne.model.continuousintegration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildServerKind <em>Build Server Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildJobs <em>Build Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildServer()
 * @model
 * @generated
 */
public interface BuildServer extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildServer_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildServer_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Build Server Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Server Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Server Kind</em>' attribute.
   * @see #setBuildServerKind(String)
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildServer_BuildServerKind()
   * @model unique="false"
   * @generated
   */
  String getBuildServerKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.continuousintegration.BuildServer#getBuildServerKind <em>Build Server Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Build Server Kind</em>' attribute.
   * @see #getBuildServerKind()
   * @generated
   */
  void setBuildServerKind(String value);

  /**
   * Returns the value of the '<em><b>Build Jobs</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.continuousintegration.BuildJob}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Jobs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Jobs</em>' containment reference list.
   * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildServer_BuildJobs()
   * @model containment="true"
   * @generated
   */
  EList<BuildJob> getBuildJobs();

} // BuildServer
