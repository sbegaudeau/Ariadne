/**
 */
package fr.obeo.ariadne.model.tasks;

import fr.obeo.ariadne.model.core.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getTaskEntries <em>Task Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.tasks.Task#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Element
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
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Url()
   * @model unique="false"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

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
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

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
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Kind()
   * @model unique="false"
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

  /**
   * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creation Date</em>' attribute.
   * @see #setCreationDate(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_CreationDate()
   * @model unique="false"
   * @generated
   */
  String getCreationDate();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getCreationDate <em>Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creation Date</em>' attribute.
   * @see #getCreationDate()
   * @generated
   */
  void setCreationDate(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Priority()
   * @model unique="false"
   * @generated
   */
  String getPriority();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Status()
   * @model unique="false"
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.tasks.Task#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Task Entries</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.tasks.TaskEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Entries</em>' containment reference list.
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_TaskEntries()
   * @model containment="true"
   * @generated
   */
  EList<TaskEntry> getTaskEntries();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.core.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#getTask_Elements()
   * @model
   * @generated
   */
  EList<Element> getElements();

} // Task
