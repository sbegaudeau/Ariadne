/**
 */
package fr.obeo.ariadne.model.scm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.ResourceChange#getPath <em>Path</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.ResourceChange#getResourceChangeKind <em>Resource Change Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getResourceChange()
 * @model
 * @generated
 */
public interface ResourceChange extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getResourceChange_Path()
   * @model unique="false"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.ResourceChange#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Resource Change Kind</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.scm.ResourceChangeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Change Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Change Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.scm.ResourceChangeKind
   * @see #setResourceChangeKind(ResourceChangeKind)
   * @see fr.obeo.ariadne.model.scm.ScmPackage#getResourceChange_ResourceChangeKind()
   * @model unique="false"
   * @generated
   */
  ResourceChangeKind getResourceChangeKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.scm.ResourceChange#getResourceChangeKind <em>Resource Change Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Change Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.scm.ResourceChangeKind
   * @see #getResourceChangeKind()
   * @generated
   */
  void setResourceChangeKind(ResourceChangeKind value);

} // ResourceChange
