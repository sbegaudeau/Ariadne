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
package fr.obeo.ariadne.ide.connector.mylyn.build.internal.explorer;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.mylyn.build.internal.utils.AriadneMylynBuildConnectorMessage;
import fr.obeo.ariadne.model.continuousintegration.BuildArtifact;
import fr.obeo.ariadne.model.continuousintegration.BuildJob;
import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationFactory;
import fr.obeo.ariadne.model.core.CoreFactory;
import fr.obeo.ariadne.model.core.Entry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.builds.core.IArtifact;
import org.eclipse.mylyn.builds.core.IBuild;
import org.eclipse.mylyn.builds.core.IBuildPlan;
import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.core.IParameterDefinition;
import org.eclipse.mylyn.builds.internal.core.BuildModel;
import org.eclipse.mylyn.builds.internal.core.StringParameterDefinition;
import org.eclipse.mylyn.internal.builds.ui.BuildsUiInternal;

/**
 * The Mylyn Build explorer.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class MylynBuildExplorer extends AbstractAriadneExplorer {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getName()
	 */
	@Override
	public String getName() {
		return AriadneMylynBuildConnectorMessage.getString("MylynBuildExplorer.Name"); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#getExplorerKind()
	 */
	@Override
	public String getExplorerKind() {
		return AbstractAriadneExplorer.CONTINUOUS_INTEGRATION_EXPLORER_KIND;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer#explore(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IStatus explore(IProgressMonitor monitor) {
		this.ariadneProject.getCategory().getOrganization().getBuildServers().addAll(this.doExplore(monitor));

		// Save the data computed
		Resource resource = this.ariadneProject.eResource();
		try {
			HashMap<String, String> options = new HashMap<String, String>();
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}

	/**
	 * Explores the Mylyn Build Servers available and return the list of Ariadne Build Servers representing
	 * them.
	 * 
	 * @param monitor
	 *            The progress monitor
	 * @return The list of Ariadne Build Servers representing the Mylyn Build Servers available.
	 */
	public List<fr.obeo.ariadne.model.continuousintegration.BuildServer> doExplore(IProgressMonitor monitor) {
		List<fr.obeo.ariadne.model.continuousintegration.BuildServer> ariadneBuildServers = new ArrayList<>();
		BuildModel model = BuildsUiInternal.getModel();
		List<IBuildServer> mylynBuildServers = model.getServers();
		for (IBuildServer iBuildServer : mylynBuildServers) {
			ariadneBuildServers.add(exploreBuildServer(model, iBuildServer, monitor));
		}

		return ariadneBuildServers;

	}

	/**
	 * Explore the given Mylyn Build Server and returns its matching Ariadne Build Server.
	 * 
	 * @param model
	 *            The Mylyn Build model
	 * @param iBuildServer
	 *            The Mylyn Build Server currently analyzed
	 * @param monitor
	 *            The progress monitor
	 * @return The matching Ariadne Build Server
	 */
	private fr.obeo.ariadne.model.continuousintegration.BuildServer exploreBuildServer(BuildModel model,
			IBuildServer iBuildServer, IProgressMonitor monitor) {
		String connectorKind = iBuildServer.getConnectorKind();
		String label = iBuildServer.getLabel();
		String name = iBuildServer.getName();
		String url = iBuildServer.getUrl();

		fr.obeo.ariadne.model.continuousintegration.BuildServer ariadneBuildServer = ContinuousintegrationFactory.eINSTANCE
				.createBuildServer();
		ariadneBuildServer.setName(name);
		ariadneBuildServer.setUrl(url);
		ariadneBuildServer.setBuildServerKind(connectorKind);

		List<IBuildPlan> plans = model.getPlans(iBuildServer);
		for (IBuildPlan iBuildPlan : plans) {
			BuildJob ariadneBuildJob = exploreBuildPlan(iBuildPlan, monitor);
			ariadneBuildServer.getBuildJobs().add(ariadneBuildJob);
		}

		return ariadneBuildServer;
	}

	/**
	 * Explores the given Mylyn Build Plan and returns its matching Ariadne Build Job.
	 * 
	 * @param iBuildPlan
	 *            The Mylyn Build Plan currently analyzed
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne Build Job matching the given Mylyn Build Plan.
	 */
	private fr.obeo.ariadne.model.continuousintegration.BuildJob exploreBuildPlan(IBuildPlan iBuildPlan,
			IProgressMonitor monitor) {
		String buildPlanName = iBuildPlan.getName();
		String summary = iBuildPlan.getSummary();
		String buildPlanUrl = iBuildPlan.getUrl();

		BuildJob ariadneBuildJob = ContinuousintegrationFactory.eINSTANCE.createBuildJob();
		ariadneBuildJob.setUrl(buildPlanUrl);
		ariadneBuildJob.setName(buildPlanName);
		ariadneBuildJob.setDescription(summary);

		List<IParameterDefinition> parameterDefinitions = iBuildPlan.getParameterDefinitions();
		for (IParameterDefinition iParameterDefinition : parameterDefinitions) {
			exploreParameterDefinition(ariadneBuildJob, iParameterDefinition, monitor);
		}

		IBuild lastBuild = iBuildPlan.getLastBuild();
		List<IArtifact> artifacts = lastBuild.getArtifacts();
		for (IArtifact iArtifact : artifacts) {
			BuildArtifact ariadneBuildArtifact = exploreArtifact(iArtifact, monitor);
			ariadneBuildJob.getBuildArtifacts().add(ariadneBuildArtifact);
		}

		return ariadneBuildJob;
	}

	/**
	 * Explores the given parameter definition and sets the matching property in the given Ariadne Build Job.
	 * 
	 * @param buildJob
	 *            The Ariadne Build Job
	 * @param iParameterDefinition
	 *            The Mylyn Build Property Definition
	 * @param monitor
	 *            The progress monitor
	 */
	private void exploreParameterDefinition(fr.obeo.ariadne.model.continuousintegration.BuildJob buildJob,
			IParameterDefinition iParameterDefinition, IProgressMonitor monitor) {
		String parameterDefinitionName = iParameterDefinition.getName();
		String parameterDefinitionDescription = iParameterDefinition.getDescription();
		if (iParameterDefinition instanceof StringParameterDefinition) {
			StringParameterDefinition stringParameterDefinition = (StringParameterDefinition)iParameterDefinition;
			String defaultValue = stringParameterDefinition.getDefaultValue();

			boolean found = false;
			List<Entry> entries = buildJob.getEntries();
			for (Entry entry : entries) {
				if (parameterDefinitionName.equals(entry.getKey())) {
					found = true;
				}
			}

			if (!found) {
				Entry ariadneEntry = CoreFactory.eINSTANCE.createEntry();
				ariadneEntry.setKey(parameterDefinitionName);
				ariadneEntry.getValues().add(defaultValue);
				buildJob.getEntries().add(ariadneEntry);
			}
		}
	}

	/**
	 * Explores the given artifact and creates the matching Ariadne Build Artifact.
	 * 
	 * @param iArtifact
	 *            The Mylyn Build Artifact
	 * @param monitor
	 *            The progress monitor
	 * @return The Ariadne Build Artifact
	 */
	private fr.obeo.ariadne.model.continuousintegration.BuildArtifact exploreArtifact(IArtifact iArtifact,
			IProgressMonitor monitor) {
		BuildArtifact ariadneBuildArtifact = ContinuousintegrationFactory.eINSTANCE.createBuildArtifact();
		String artifactName = iArtifact.getName();
		ariadneBuildArtifact.setName(artifactName);
		return ariadneBuildArtifact;
	}

}
