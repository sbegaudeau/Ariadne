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
package fr.obeo.ariadne.model.tasks;

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.tasks.TasksFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.tasks.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.tasks.editor/src-gen' fileExtensions='ariadnetasks' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
 * @generated
 */
public interface TasksPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tasks";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/Tasks";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-tasks";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TasksPackage eINSTANCE = fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl
   * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTasksRepository()
   * @generated
   */
  int TASKS_REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__URL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Connector Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__CONNECTOR_KIND = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY__TASKS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_REPOSITORY_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.tasks.impl.TaskImpl
   * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTask()
   * @generated
   */
  int TASK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__URL = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IDENTIFIER = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__KIND = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Creation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__CREATION_DATE = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PRIORITY = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STATUS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Task Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_ENTRIES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Versioned Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VERSIONED_ELEMENTS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl <em>Task Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl
   * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTaskEntry()
   * @generated
   */
  int TASK_ENTRY = 2;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ENTRY__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ENTRY__VALUES = 1;

  /**
   * The number of structural features of the '<em>Task Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ENTRY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Task Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ENTRY_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.tasks.TasksRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see fr.obeo.ariadne.model.tasks.TasksRepository
   * @generated
   */
  EClass getTasksRepository();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.tasks.TasksRepository#getUrl()
   * @see #getTasksRepository()
   * @generated
   */
  EAttribute getTasksRepository_Url();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getConnectorKind <em>Connector Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connector Kind</em>'.
   * @see fr.obeo.ariadne.model.tasks.TasksRepository#getConnectorKind()
   * @see #getTasksRepository()
   * @generated
   */
  EAttribute getTasksRepository_ConnectorKind();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.tasks.TasksRepository#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see fr.obeo.ariadne.model.tasks.TasksRepository#getTasks()
   * @see #getTasksRepository()
   * @generated
   */
  EReference getTasksRepository_Tasks();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.tasks.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getUrl()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Url();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getIdentifier()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Identifier();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getKind()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Kind();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getCreationDate <em>Creation Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creation Date</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getCreationDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_CreationDate();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getPriority()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Priority();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.Task#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getStatus()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Status();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.tasks.Task#getTaskEntries <em>Task Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Entries</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getTaskEntries()
   * @see #getTask()
   * @generated
   */
  EReference getTask_TaskEntries();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.tasks.Task#getVersionedElements <em>Versioned Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Versioned Elements</em>'.
   * @see fr.obeo.ariadne.model.tasks.Task#getVersionedElements()
   * @see #getTask()
   * @generated
   */
  EReference getTask_VersionedElements();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.tasks.TaskEntry <em>Task Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Entry</em>'.
   * @see fr.obeo.ariadne.model.tasks.TaskEntry
   * @generated
   */
  EClass getTaskEntry();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.tasks.TaskEntry#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see fr.obeo.ariadne.model.tasks.TaskEntry#getIdentifier()
   * @see #getTaskEntry()
   * @generated
   */
  EAttribute getTaskEntry_Identifier();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.ariadne.model.tasks.TaskEntry#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see fr.obeo.ariadne.model.tasks.TaskEntry#getValues()
   * @see #getTaskEntry()
   * @generated
   */
  EAttribute getTaskEntry_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TasksFactory getTasksFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.tasks.impl.TasksRepositoryImpl
     * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTasksRepository()
     * @generated
     */
    EClass TASKS_REPOSITORY = eINSTANCE.getTasksRepository();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASKS_REPOSITORY__URL = eINSTANCE.getTasksRepository_Url();

    /**
     * The meta object literal for the '<em><b>Connector Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASKS_REPOSITORY__CONNECTOR_KIND = eINSTANCE.getTasksRepository_ConnectorKind();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS_REPOSITORY__TASKS = eINSTANCE.getTasksRepository_Tasks();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.tasks.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.tasks.impl.TaskImpl
     * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__URL = eINSTANCE.getTask_Url();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__IDENTIFIER = eINSTANCE.getTask_Identifier();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__KIND = eINSTANCE.getTask_Kind();

    /**
     * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__CREATION_DATE = eINSTANCE.getTask_CreationDate();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

    /**
     * The meta object literal for the '<em><b>Task Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__TASK_ENTRIES = eINSTANCE.getTask_TaskEntries();

    /**
     * The meta object literal for the '<em><b>Versioned Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__VERSIONED_ELEMENTS = eINSTANCE.getTask_VersionedElements();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl <em>Task Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.tasks.impl.TaskEntryImpl
     * @see fr.obeo.ariadne.model.tasks.impl.TasksPackageImpl#getTaskEntry()
     * @generated
     */
    EClass TASK_ENTRY = eINSTANCE.getTaskEntry();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_ENTRY__IDENTIFIER = eINSTANCE.getTaskEntry_Identifier();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_ENTRY__VALUES = eINSTANCE.getTaskEntry_Values();

  }

} //TasksPackage
