/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.AnnotationField#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotationField()
 * @model
 * @generated
 */
public interface AnnotationField extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see #setQualifiedName(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotationField_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.AnnotationField#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

} // AnnotationField
