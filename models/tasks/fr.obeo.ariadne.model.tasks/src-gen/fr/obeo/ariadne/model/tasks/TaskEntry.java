/**
 */
package fr.obeo.ariadne.model.tasks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TaskEntry#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TaskEntry#getValues <em>Values</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TaskEntry#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TaskEntry#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTaskEntry()
 * @model
 * @generated
 */
public interface TaskEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTaskEntry_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.TaskEntry#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

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
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTaskEntry_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

  /**
   * Returns the value of the '<em><b>Options</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' attribute list.
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTaskEntry_Options()
   * @model unique="false"
   * @generated
   */
  EList<String> getOptions();

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTaskEntry_Kind()
   * @model unique="false"
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.TaskEntry#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

} // TaskEntry
