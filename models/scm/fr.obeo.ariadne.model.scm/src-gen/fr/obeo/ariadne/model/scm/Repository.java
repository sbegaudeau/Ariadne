/**
 */
package fr.obeo.ariadne.model.scm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getBranches <em>Branches</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getCommits <em>Commits</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.Repository#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject
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
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.Repository#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Branch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Branches()
   * @model containment="true"
   * @generated
   */
  EList<Branch> getBranches();

  /**
   * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Commit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commits</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Commits()
   * @model containment="true"
   * @generated
   */
  EList<Commit> getCommits();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.scm.Tag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getRepository_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

} // Repository
