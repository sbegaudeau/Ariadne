/**
 */
package fr.obeo.ariadne.model.environment;

import fr.obeo.ariadne.model.core.VersionedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.environment.EnvironmentComponent#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironmentComponent()
 * @model
 * @generated
 */
public interface EnvironmentComponent extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getEnvironmentComponent_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.environment.EnvironmentComponent#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

} // EnvironmentComponent
