/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typing Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.TypingDependency#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getTypingDependency()
 * @model
 * @generated
 */
public interface TypingDependency extends Dependency
{
  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' attribute list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getTypingDependency_TypeParameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypeParameters();

} // TypingDependency
