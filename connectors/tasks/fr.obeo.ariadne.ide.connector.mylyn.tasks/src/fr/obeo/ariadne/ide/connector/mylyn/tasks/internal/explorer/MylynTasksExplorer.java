/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.ariadne.ide.connector.mylyn.tasks.internal.explorer;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.mylyn.tasks.internal.utils.AriadneMylynTasksConnectorMessage;
import fr.obeo.ariadne.model.core.CoreFactory;
import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.tasks.Task;
import fr.obeo.ariadne.model.tasks.TasksFactory;
import fr.obeo.ariadne.model.tasks.TasksRepository;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.internal.tasks.core.TaskList;
import org.eclipse.mylyn.internal.tasks.ui.TasksUiPlugin;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskData;

/**
 * This class will explore the Mylyn tasks repository linked to an Eclipse project.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class MylynTasksExplorer extends AbstractAriadneExplorer {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getName()
	 */
	@Override
	public String getName() {
		return AriadneMylynTasksConnectorMessage.getString("MylynTasksExplorer.Name"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getExplorerKind()
	 */
	@Override
	public String getExplorerKind() {
		return AbstractAriadneExplorer.TASKS_EXPLORER_KIND;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		for (IProject project : this.projects) {
			TaskRepository mylynTaskRepository = TasksUiPlugin.getDefault().getRepositoryForResource(project);
			if (mylynTaskRepository != null) {
				TasksRepository ariadneTasksRepository = this.doExplore(mylynTaskRepository, monitor);

				// Save the data computed
				Resource resource = ariadneTasksRepository.eResource();
				try {
					HashMap<String, String> options = new HashMap<String, String>();
					resource.save(options);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * Launches the exploration of the given Mylyn task repository to create the Ariadne tasks repository.
	 * 
	 * @param mylynTaskRepository
	 *            The Mylyn task repository
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne tasks repository.
	 */
	public TasksRepository doExplore(TaskRepository mylynTaskRepository, IProgressMonitor monitor) {
		TasksRepository ariadneTasksRepository = this.getOrCreateAriadneTasksRepository(mylynTaskRepository,
				monitor);

		TaskList taskList = TasksUiPlugin.getTaskList();
		Collection<ITask> repositoryTasks = taskList.getTasks(mylynTaskRepository.getRepositoryUrl());
		for (ITask iMylynTask : repositoryTasks) {
			this.exploreMylynTask(iMylynTask, ariadneTasksRepository, monitor);
		}

		return ariadneTasksRepository;
	}

	/**
	 * Gets or creates the Ariadne tasks repository matching the given Mylyn task repository.
	 * 
	 * @param mylynTaskRepository
	 *            The Mylyn task repository
	 * @param monitor
	 *            the progress monitor
	 * @return The Ariadne tasks repository
	 */
	private TasksRepository getOrCreateAriadneTasksRepository(TaskRepository mylynTaskRepository,
			IProgressMonitor monitor) {
		TasksRepository ariadneTasksRepository = null;

		Organization organization = this.ariadneProject.getCategory().getOrganization();
		List<TasksRepository> tasksRepositories = organization.getTasksRepositories();
		for (TasksRepository anAriadneTasksRepository : tasksRepositories) {
			if (anAriadneTasksRepository.getUrl().equals(mylynTaskRepository.getRepositoryUrl())) {
				ariadneTasksRepository = anAriadneTasksRepository;
			}
		}

		if (ariadneTasksRepository == null) {
			ariadneTasksRepository = TasksFactory.eINSTANCE.createTasksRepository();
			ariadneTasksRepository.setUrl(mylynTaskRepository.getRepositoryUrl());
			ariadneTasksRepository.setName(mylynTaskRepository.getRepositoryLabel());
			ariadneTasksRepository.setConnectorKind(mylynTaskRepository.getConnectorKind());
			organization.getTasksRepositories().add(ariadneTasksRepository);
		}

		return ariadneTasksRepository;
	}

	/**
	 * Explores the given Mylyn task and creates the matching Ariadne Task in the given Ariadne tasks
	 * repository.
	 * 
	 * @param iMylynTask
	 *            The Mylyn task
	 * @param ariadneTasksRepository
	 *            The Ariadne tasks repository
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreMylynTask(ITask iMylynTask, TasksRepository ariadneTasksRepository,
			IProgressMonitor monitor) {
		Task ariadneTask = TasksFactory.eINSTANCE.createTask();
		try {
			TaskData taskData = TasksUiPlugin.getTaskDataManager().getTaskData(iMylynTask);
			TaskAttribute root = taskData.getRoot();

			// Sets the default attributes
			String taskId = iMylynTask.getTaskId();
			ariadneTask.setIdentifier(taskId);

			String taskKind = iMylynTask.getTaskKind();
			ariadneTask.setKind(taskKind);

			Date creationDate = iMylynTask.getCreationDate();
			ariadneTask.setCreationDate(DateFormat.getInstance().format(creationDate));

			String priority = iMylynTask.getPriority();
			ariadneTask.setPriority(priority);

			String summary = iMylynTask.getSummary();
			ariadneTask.setName(summary);

			String status = root.getAttribute(TaskAttribute.STATUS).getValue();
			ariadneTask.setStatus(status);

			// Computes the general attributes
			Map<String, TaskAttribute> attributes = root.getAttributes();
			Set<Entry<String, TaskAttribute>> entrySet = attributes.entrySet();
			for (Entry<String, TaskAttribute> entry : entrySet) {
				fr.obeo.ariadne.model.core.Entry taskEntry = CoreFactory.eINSTANCE.createEntry();
				taskEntry.setKey(entry.getKey());

				TaskAttribute taskAttribute = entry.getValue();
				List<String> values = taskAttribute.getValues();
				taskEntry.getValues().addAll(values);

				ariadneTask.getEntries().add(taskEntry);
			}

			ariadneTasksRepository.getTasks().add(ariadneTask);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
