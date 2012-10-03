/**
 */
package fr.obeo.ariadne.model.tasks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.tasks.TasksPackage
 * @generated
 */
public interface TasksFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TasksFactory eINSTANCE = fr.obeo.ariadne.model.tasks.impl.TasksFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  TasksRepository createTasksRepository();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Task Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Entry</em>'.
   * @generated
   */
  TaskEntry createTaskEntry();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TasksPackage getTasksPackage();

} //TasksFactory
