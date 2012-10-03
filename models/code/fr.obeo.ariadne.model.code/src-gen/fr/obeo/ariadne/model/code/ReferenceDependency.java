/**
 */
package fr.obeo.ariadne.model.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ReferenceDependency#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getReferenceDependency()
 * @model
 * @generated
 */
public interface ReferenceDependency extends Dependency
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getReferenceDependency_Kind()
   * @model unique="false"
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ReferenceDependency#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

} // ReferenceDependency
