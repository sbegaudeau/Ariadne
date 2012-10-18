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
package fr.obeo.ariadne.ide.connector.pde.internal.explorer;

import com.google.common.collect.Lists;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.pde.internal.utils.AriadnePDEConnectorMessage;
import fr.obeo.ariadne.model.code.CodeFactory;
import fr.obeo.ariadne.model.code.Component;
import fr.obeo.ariadne.model.code.Environment;
import fr.obeo.ariadne.model.code.utils.IAriadneCodeModelConstants;
import fr.obeo.ariadne.model.core.CoreFactory;
import fr.obeo.ariadne.model.core.Entry;
import fr.obeo.ariadne.model.core.VersionedDependency;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IBundleGroup;
import org.eclipse.core.runtime.IBundleGroupProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.frameworkadmin.BundleInfo;
import org.eclipse.pde.core.target.ITargetDefinition;
import org.eclipse.pde.core.target.ITargetHandle;
import org.eclipse.pde.core.target.TargetBundle;
import org.eclipse.pde.core.target.TargetFeature;
import org.eclipse.pde.internal.core.FeatureModelManager;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ifeature.IFeature;
import org.eclipse.pde.internal.core.ifeature.IFeatureModel;
import org.eclipse.pde.internal.core.target.TargetPlatformService;
import org.osgi.framework.Bundle;

/**
 * This class will explore the development environment of the project analyzed.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class PDEExplorer extends AbstractAriadneExplorer {
	/**
	 * The nature id of the PDE projects.
	 */
	private static final String PDE_NATURE = "org.eclipse.pde.PluginNature"; //$NON-NLS-1$

	/**
	 * The nature id of the pde feature projects.
	 */
	private static final String PDE_FEATURE_NATURE = "org.eclipse.pde.FeatureNature"; //$NON-NLS-1$

	/**
	 * The nature id of the pde repository projects.
	 */
	private static final String PDE_REPOSITORY_NATURE = "org.eclipse.pde.UpdateSiteNature"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getName()
	 */
	@Override
	public String getName() {
		return AriadnePDEConnectorMessage.getString("PDEExplorer.Name"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getExplorerKind()
	 */
	@Override
	public String getExplorerKind() {
		return AbstractAriadneExplorer.CODE_EXPLORER_KIND;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		for (IProject project : this.projects) {
			try {
				Component ariadneComponent = null;
				if (project.isAccessible() && project.hasNature(PDE_NATURE)) {
					ariadneComponent = this.doExploreBundle(project, monitor);
				} else if (project.isAccessible() && project.hasNature(PDE_FEATURE_NATURE)) {
					ariadneComponent = this.doExploreFeature(project, monitor);
				} else if (project.isAccessible() && project.hasNature(PDE_REPOSITORY_NATURE)) {
					ariadneComponent = this.doExploreRepository(project, monitor);
				}
				if (ariadneComponent != null) {
					// Save the data computed
					Resource resource = ariadneComponent.eResource();
					try {
						HashMap<String, String> options = new HashMap<String, String>();
						resource.save(options);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		this.doExploreRuntimeEnvironments(monitor);
		this.doExploreDevelopmentEnvironments(monitor);

		return Status.OK_STATUS;
	}

	/**
	 * Gets the Ariadne component matching the given Java project.
	 * 
	 * @param project
	 *            The Java project
	 * @return The Ariadne component representing the Java project
	 */
	private Component getComponent(IProject project) {
		Component component = null;

		List<Component> components = this.ariadneProject.getComponents();
		for (Component aComponent : components) {
			if (project.getName().equals(aComponent.getIdentifier())) {
				component = aComponent;
			}
		}
		return component;
	}

	/**
	 * Launches the exploration of the given PDE project.
	 * 
	 * @param project
	 *            The PDE project
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne component matching the given PDE project
	 */
	private Component doExploreBundle(IProject project, IProgressMonitor monitor) {
		Component ariadneComponent = this.getComponent(project);

		if (ariadneComponent == null) {
			ariadneComponent = CodeFactory.eINSTANCE.createComponent();
			ariadneComponent.setIdentifier(project.getName());
		}

		return ariadneComponent;
	}

	/**
	 * Launches the exploration of the given PDE feature project.
	 * 
	 * @param project
	 *            The PDE feature project
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne component matching the given PDE feature project
	 */
	private Component doExploreFeature(IProject project, IProgressMonitor monitor) {
		Component ariadneComponent = this.getComponent(project);

		if (ariadneComponent == null) {
			ariadneComponent = CodeFactory.eINSTANCE.createComponent();
			ariadneComponent.setIdentifier(project.getName());
		}

		FeatureModelManager manager = PDECore.getDefault().getFeatureModelManager();
		IFeatureModel featureModel = manager.getFeatureModel(project);
		IFeature feature = featureModel.getFeature();

		return ariadneComponent;
	}

	/**
	 * Launches the exploration of the given PDE repository project.
	 * 
	 * @param project
	 *            The PDE repository project
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne component matching the given PDE repository project
	 */
	private Component doExploreRepository(IProject project, IProgressMonitor monitor) {
		Component ariadneComponent = this.getComponent(project);

		if (ariadneComponent == null) {
			ariadneComponent = CodeFactory.eINSTANCE.createComponent();
			ariadneComponent.setIdentifier(project.getName());
		}

		return ariadneComponent;
	}

	/**
	 * Launches the exploration of the runtime environments of the current Eclipse instance.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @return The different runtime environment available on the current Eclipse instance
	 */
	private List<Environment> doExploreRuntimeEnvironments(IProgressMonitor monitor) {
		List<Environment> runtimeEnvironments = new ArrayList<>();

		ITargetHandle[] targets = TargetPlatformService.getDefault().getTargets(
				new SubProgressMonitor(monitor, 5));
		for (ITargetHandle iTargetHandle : targets) {
			try {
				ITargetDefinition targetDefinition = iTargetHandle.getTargetDefinition();

				Environment runtimeEnvironment = CodeFactory.eINSTANCE.createEnvironment();
				runtimeEnvironment.setName(targetDefinition.getName());

				this.addEntry(runtimeEnvironment, IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_OS, Lists
						.newArrayList(targetDefinition.getOS()));
				this.addEntry(runtimeEnvironment, IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_ARCHITECTURE,
						Lists.newArrayList(targetDefinition.getArch()));
				this.addEntry(runtimeEnvironment,
						IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_WINDOWING_SYSTEM, Lists
								.newArrayList(targetDefinition.getWS()));
				this.addEntry(runtimeEnvironment, IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_JRE_CONTAINER,
						Lists.newArrayList(targetDefinition.getJREContainer().toString()));
				this.addEntry(runtimeEnvironment,
						IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_NATIONALIZATION, Lists
								.newArrayList(targetDefinition.getNL()));
				this.addEntry(runtimeEnvironment,
						IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_PROGRAM_ARGUMENTS, Lists
								.newArrayList(targetDefinition.getProgramArguments()));
				this.addEntry(runtimeEnvironment, IAriadneCodeModelConstants.ENVIRONMENT_ENTRY_VM_ARGUMENTS,
						Lists.newArrayList(targetDefinition.getVMArguments()));

				runtimeEnvironments.add(runtimeEnvironment);

				if (!targetDefinition.isResolved()) {
					continue;
				}

				TargetBundle[] targetBundles = targetDefinition.getBundles();
				for (TargetBundle targetBundle : targetBundles) {
					VersionedDependency versionedDependency = CoreFactory.eINSTANCE
							.createVersionedDependency();
					BundleInfo bundleInfo = targetBundle.getBundleInfo();
					String symbolicName = bundleInfo.getSymbolicName();

					Component component = CodeFactory.eINSTANCE.createComponent();
					if (component instanceof InternalEObject) {
						InternalEObject internalEObject = (InternalEObject)component;
						internalEObject.eSetProxyURI(URI
								.createURI(IAriadneCodeModelConstants.COMPONENT_URI_PREFIX + symbolicName));
					}
					versionedDependency.setVersionedElement(component);
					runtimeEnvironment.getVersionedDependencies().add(versionedDependency);
				}

				TargetFeature[] targetFeatures = targetDefinition.getAllFeatures();
				for (TargetFeature targetFeature : targetFeatures) {
					VersionedDependency versionedDependency = CoreFactory.eINSTANCE
							.createVersionedDependency();
					String symbolicName = targetFeature.getId();

					Component component = CodeFactory.eINSTANCE.createComponent();
					if (component instanceof InternalEObject) {
						InternalEObject internalEObject = (InternalEObject)component;
						internalEObject.eSetProxyURI(URI
								.createURI(IAriadneCodeModelConstants.COMPONENT_URI_PREFIX + symbolicName));
					}
					versionedDependency.setVersionedElement(component);
					runtimeEnvironment.getVersionedDependencies().add(versionedDependency);
				}

			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return runtimeEnvironments;
	}

	/**
	 * Creates and adds a new entry to the given environment.
	 * 
	 * @param environment
	 *            the environment
	 * @param key
	 *            The key of the new entry
	 * @param values
	 *            The values of the new entry
	 */
	private void addEntry(Environment environment, String key, List<String> values) {
		if (values != null && values.size() > 0) {
			Entry entry = CoreFactory.eINSTANCE.createEntry();
			entry.setKey(key);
			entry.getValues().addAll(values);
			environment.getEntries().add(entry);
		}
	}

	/**
	 * Launches the exploration of the development environments of the current Eclipse instance.
	 * 
	 * @param monitor
	 *            The progress monitor
	 * @return The development environments of the current Eclipse instance
	 */
	private List<Environment> doExploreDevelopmentEnvironments(IProgressMonitor monitor) {
		List<Environment> environments = new ArrayList<>();

		Environment environment = CodeFactory.eINSTANCE.createEnvironment();

		IBundleGroupProvider[] bundleGroupProviders = Platform.getBundleGroupProviders();
		for (IBundleGroupProvider iBundleGroupProvider : bundleGroupProviders) {
			IBundleGroup[] bundleGroups = iBundleGroupProvider.getBundleGroups();
			for (IBundleGroup iBundleGroup : bundleGroups) {
				Bundle[] bundles = iBundleGroup.getBundles();
				for (Bundle bundle : bundles) {
					String symbolicName = bundle.getSymbolicName();
					VersionedDependency versionedDependency = CoreFactory.eINSTANCE
							.createVersionedDependency();
					Component component = CodeFactory.eINSTANCE.createComponent();
					if (component instanceof InternalEObject) {
						InternalEObject internalEObject = (InternalEObject)component;
						internalEObject.eSetProxyURI(URI
								.createURI(IAriadneCodeModelConstants.COMPONENT_URI_PREFIX + symbolicName));
					}
					versionedDependency.setVersionedElement(component);
					environment.getVersionedDependencies().add(versionedDependency);
				}
			}
		}

		environments.add(environment);

		return environments;
	}
}
