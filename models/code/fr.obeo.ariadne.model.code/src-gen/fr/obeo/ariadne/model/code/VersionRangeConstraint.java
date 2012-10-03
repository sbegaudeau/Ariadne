/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.Version;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeLowerVersionBound <em>Include Lower Version Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeUpperVersionBound <em>Include Upper Version Bound</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getLowerVersion <em>Lower Version</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getUpperVersion <em>Upper Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getVersionRangeConstraint()
 * @model
 * @generated
 */
public interface VersionRangeConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Include Lower Version Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Lower Version Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Lower Version Bound</em>' attribute.
   * @see #setIncludeLowerVersionBound(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getVersionRangeConstraint_IncludeLowerVersionBound()
   * @model unique="false"
   * @generated
   */
  boolean isIncludeLowerVersionBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeLowerVersionBound <em>Include Lower Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Lower Version Bound</em>' attribute.
   * @see #isIncludeLowerVersionBound()
   * @generated
   */
  void setIncludeLowerVersionBound(boolean value);

  /**
   * Returns the value of the '<em><b>Include Upper Version Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Upper Version Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Upper Version Bound</em>' attribute.
   * @see #setIncludeUpperVersionBound(boolean)
   * @see fr.obeo.ariadne.model.code.CodePackage#getVersionRangeConstraint_IncludeUpperVersionBound()
   * @model unique="false"
   * @generated
   */
  boolean isIncludeUpperVersionBound();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#isIncludeUpperVersionBound <em>Include Upper Version Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Upper Version Bound</em>' attribute.
   * @see #isIncludeUpperVersionBound()
   * @generated
   */
  void setIncludeUpperVersionBound(boolean value);

  /**
   * Returns the value of the '<em><b>Lower Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Version</em>' containment reference.
   * @see #setLowerVersion(Version)
   * @see fr.obeo.ariadne.model.code.CodePackage#getVersionRangeConstraint_LowerVersion()
   * @model containment="true"
   * @generated
   */
  Version getLowerVersion();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getLowerVersion <em>Lower Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Version</em>' containment reference.
   * @see #getLowerVersion()
   * @generated
   */
  void setLowerVersion(Version value);

  /**
   * Returns the value of the '<em><b>Upper Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Version</em>' containment reference.
   * @see #setUpperVersion(Version)
   * @see fr.obeo.ariadne.model.code.CodePackage#getVersionRangeConstraint_UpperVersion()
   * @model containment="true"
   * @generated
   */
  Version getUpperVersion();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.VersionRangeConstraint#getUpperVersion <em>Upper Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Version</em>' containment reference.
   * @see #getUpperVersion()
   * @generated
   */
  void setUpperVersion(Version value);

} // VersionRangeConstraint
