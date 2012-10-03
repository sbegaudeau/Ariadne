/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.RequiredService#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.RequiredService#getTypingDependencies <em>Typing Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.RequiredService#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getRequiredService()
 * @model
 * @generated
 */
public interface RequiredService extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getRequiredService_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.RequiredService#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.TypingDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typing Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typing Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getRequiredService_TypingDependencies()
   * @model containment="true"
   * @generated
   */
  EList<TypingDependency> getTypingDependencies();

  /**
   * Returns the value of the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ReferenceDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getRequiredService_ReferenceDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceDependency> getReferenceDependencies();

} // RequiredService
