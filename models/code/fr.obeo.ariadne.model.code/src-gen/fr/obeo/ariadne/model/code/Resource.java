/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Resource#getInheritanceDependency <em>Inheritance Dependency</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Resource#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Resource#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Inheritance Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance Dependency</em>' containment reference.
   * @see #setInheritanceDependency(InheritanceDependency)
   * @see fr.obeo.ariadne.model.code.CodePackage#getResource_InheritanceDependency()
   * @model containment="true"
   * @generated
   */
  InheritanceDependency getInheritanceDependency();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Resource#getInheritanceDependency <em>Inheritance Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritance Dependency</em>' containment reference.
   * @see #getInheritanceDependency()
   * @generated
   */
  void setInheritanceDependency(InheritanceDependency value);

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getResource_ReferenceDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceDependency> getReferenceDependencies();

  /**
   * Returns the value of the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ContainmentDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containment Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containment Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getResource_ContainmentDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ContainmentDependency> getContainmentDependencies();

} // Resource
