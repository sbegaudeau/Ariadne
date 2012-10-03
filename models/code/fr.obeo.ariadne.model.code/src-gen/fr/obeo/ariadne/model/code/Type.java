/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getTypingDependencies <em>Typing Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getInheritanceDependencies <em>Inheritance Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Type#getAnnotationDependencies <em>Annotation Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends VersionedElement
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_QualifiedName()
   * @model unique="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Type#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.code.VisibilityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #setVisibility(VisibilityKind)
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_Visibility()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Type#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see fr.obeo.ariadne.model.code.VisibilityKind
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Typing Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.TypingDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typing Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typing Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_TypingDependencies()
   * @model containment="true"
   * @generated
   */
  EList<TypingDependency> getTypingDependencies();

  /**
   * Returns the value of the '<em><b>Inheritance Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.InheritanceDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_InheritanceDependencies()
   * @model containment="true"
   * @generated
   */
  EList<InheritanceDependency> getInheritanceDependencies();

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_ReferenceDependencies()
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
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_ContainmentDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ContainmentDependency> getContainmentDependencies();

  /**
   * Returns the value of the '<em><b>Annotation Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.AnnotationDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getType_AnnotationDependencies()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationDependency> getAnnotationDependencies();

} // Type
