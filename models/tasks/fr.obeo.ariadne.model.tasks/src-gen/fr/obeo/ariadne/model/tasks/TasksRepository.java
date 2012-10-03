/**
 */
package fr.obeo.ariadne.model.tasks;

import fr.obeo.ariadne.model.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.TasksRepository#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository()
 * @model
 * @generated
 */
public interface TasksRepository extends Element
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTasksRepository_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // TasksRepository
