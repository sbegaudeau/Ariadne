/**
 */
package fr.obeo.ariadne.model.organization;

import fr.obeo.ariadne.model.code.Component;

import fr.obeo.ariadne.model.core.VersionedElement;

import fr.obeo.ariadne.model.environment.DevelopmentEnvironment;
import fr.obeo.ariadne.model.environment.RuntimeEnvironment;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getRuntimeEnvironments <em>Runtime Environments</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getDependentProjects <em>Dependent Projects</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.organization.Project#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Development Environments</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.environment.DevelopmentEnvironment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Development Environments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Development Environments</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_DevelopmentEnvironments()
   * @model containment="true"
   * @generated
   */
  EList<DevelopmentEnvironment> getDevelopmentEnvironments();

  /**
   * Returns the value of the '<em><b>Runtime Environments</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.environment.RuntimeEnvironment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runtime Environments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runtime Environments</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_RuntimeEnvironments()
   * @model containment="true"
   * @generated
   */
  EList<RuntimeEnvironment> getRuntimeEnvironments();

  /**
   * Returns the value of the '<em><b>Sub Projects</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Projects</em>' containment reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_SubProjects()
   * @model containment="true"
   * @generated
   */
  EList<Project> getSubProjects();

  /**
   * Returns the value of the '<em><b>Dependent Projects</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent Projects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependent Projects</em>' reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_DependentProjects()
   * @model
   * @generated
   */
  EList<Project> getDependentProjects();

  /**
   * Returns the value of the '<em><b>Specifications</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.organization.Specification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifications</em>' reference list.
   * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getProject_Specifications()
   * @model
   * @generated
   */
  EList<Specification> getSpecifications();

} // Project
