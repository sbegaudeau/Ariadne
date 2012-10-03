/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.AnnotationDependency#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotationDependency()
 * @model
 * @generated
 */
public interface AnnotationDependency extends Dependency
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotationDependency_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // AnnotationDependency
