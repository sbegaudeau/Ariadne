/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getExpressionConstraint()
 * @model
 * @generated
 */
public interface ExpressionConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getExpressionConstraint_Expression()
   * @model unique="false"
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getExpressionConstraint_Language()
   * @model unique="false"
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ExpressionConstraint#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

} // ExpressionConstraint
