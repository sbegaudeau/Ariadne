/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Stephane Begaudeau (Obeo) - initial API and implementation
 */
package fr.obeo.ariadne.model.tasks.impl;

import fr.obeo.ariadne.model.core.CorePackage;

import fr.obeo.ariadne.model.tasks.Task;
import fr.obeo.ariadne.model.tasks.TasksFactory;
import fr.obeo.ariadne.model.tasks.TasksPackage;
import fr.obeo.ariadne.model.tasks.TasksRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasksPackageImpl extends EPackageImpl implements TasksPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tasksRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.obeo.ariadne.model.tasks.TasksPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TasksPackageImpl()
  {
    super(eNS_URI, TasksFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TasksPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TasksPackage init()
  {
    if (isInited) return (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);

    // Obtain or create and register package
    TasksPackageImpl theTasksPackage = (TasksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TasksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TasksPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTasksPackage.createPackageContents();

    // Initialize created meta-data
    theTasksPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTasksPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TasksPackage.eNS_URI, theTasksPackage);
    return theTasksPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTasksRepository()
  {
    return tasksRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTasksRepository_Url()
  {
    return (EAttribute)tasksRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTasksRepository_ConnectorKind()
  {
    return (EAttribute)tasksRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTasksRepository_Tasks()
  {
    return (EReference)tasksRepositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Url()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Identifier()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Kind()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_CreationDate()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Priority()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Status()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Entries()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksFactory getTasksFactory()
  {
    return (TasksFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tasksRepositoryEClass = createEClass(TASKS_REPOSITORY);
    createEAttribute(tasksRepositoryEClass, TASKS_REPOSITORY__URL);
    createEAttribute(tasksRepositoryEClass, TASKS_REPOSITORY__CONNECTOR_KIND);
    createEReference(tasksRepositoryEClass, TASKS_REPOSITORY__TASKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__URL);
    createEAttribute(taskEClass, TASK__IDENTIFIER);
    createEAttribute(taskEClass, TASK__KIND);
    createEAttribute(taskEClass, TASK__CREATION_DATE);
    createEAttribute(taskEClass, TASK__PRIORITY);
    createEAttribute(taskEClass, TASK__STATUS);
    createEReference(taskEClass, TASK__ENTRIES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tasksRepositoryEClass.getESuperTypes().add(theCorePackage.getVersionedElement());
    taskEClass.getESuperTypes().add(theCorePackage.getVersionedElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(tasksRepositoryEClass, TasksRepository.class, "TasksRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTasksRepository_Url(), theEcorePackage.getEString(), "url", null, 0, 1, TasksRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTasksRepository_ConnectorKind(), theEcorePackage.getEString(), "connectorKind", null, 0, 1, TasksRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTasksRepository_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TasksRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Url(), theEcorePackage.getEString(), "url", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Kind(), theEcorePackage.getEString(), "kind", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_CreationDate(), theEcorePackage.getEString(), "creationDate", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Priority(), theEcorePackage.getEString(), "priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Entries(), theCorePackage.getEntry(), null, "entries", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TasksPackageImpl
