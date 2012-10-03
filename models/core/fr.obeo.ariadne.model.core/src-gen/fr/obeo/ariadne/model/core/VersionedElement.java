/**
 */
package fr.obeo.ariadne.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.core.VersionedElement#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement()
 * @model abstract="true"
 * @generated
 */
public interface VersionedElement extends Element
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see fr.obeo.ariadne.model.core.CorePackage#getVersionedElement_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.core.VersionedElement#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

} // VersionedElement
