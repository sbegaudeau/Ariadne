/**
 */
package fr.obeo.ariadne.model.organization;

import fr.obeo.ariadne.model.core.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganizationDependencyKinds <em>Organization Dependency Kinds</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganizationDependency()
 * @model
 * @generated
 */
public interface OrganizationDependency extends Element
{
  /**
   * Returns the value of the '<em><b>Organization Dependency Kinds</b></em>' attribute list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.OrganizationDependencyKind}.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.organization.OrganizationDependencyKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization Dependency Kinds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization Dependency Kinds</em>' attribute list.
   * @see fr.obeo.ariadne.model.organization.OrganizationDependencyKind
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganizationDependency_OrganizationDependencyKinds()
   * @model unique="false"
   * @generated
   */
  EList<OrganizationDependencyKind> getOrganizationDependencyKinds();

  /**
   * Returns the value of the '<em><b>Organization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization</em>' reference.
   * @see #setOrganization(Organization)
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganizationDependency_Organization()
   * @model
   * @generated
   */
  Organization getOrganization();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.organization.OrganizationDependency#getOrganization <em>Organization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organization</em>' reference.
   * @see #getOrganization()
   * @generated
   */
  void setOrganization(Organization value);

} // OrganizationDependency
