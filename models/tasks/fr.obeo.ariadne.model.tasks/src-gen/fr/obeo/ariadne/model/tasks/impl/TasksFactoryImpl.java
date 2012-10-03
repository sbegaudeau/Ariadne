/**
 */
package fr.obeo.ariadne.model.tasks.impl;

import fr.obeo.ariadne.model.tasks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasksFactoryImpl extends EFactoryImpl implements TasksFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TasksFactory init()
  {
    try
    {
      TasksFactory theTasksFactory = (TasksFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/Ariadne/Tasks"); 
      if (theTasksFactory != null)
      {
        return theTasksFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TasksFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TasksPackage.TASKS_REPOSITORY: return createTasksRepository();
      case TasksPackage.TASK: return createTask();
      case TasksPackage.TASK_ENTRY: return createTaskEntry();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksRepository createTasksRepository()
  {
    TasksRepositoryImpl tasksRepository = new TasksRepositoryImpl();
    return tasksRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskEntry createTaskEntry()
  {
    TaskEntryImpl taskEntry = new TaskEntryImpl();
    return taskEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksPackage getTasksPackage()
  {
    return (TasksPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TasksPackage getPackage()
  {
    return TasksPackage.eINSTANCE;
  }

} //TasksFactoryImpl
