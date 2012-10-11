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
package fr.obeo.ariadne.ide.connector.core.internal.explorer;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * This class will be in charger of the management of the registered Ariadne explorers.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneExplorerServiceTrackerCustomizer implements ServiceTrackerCustomizer<Object, AbstractAriadneExplorer> {

	/**
	 * The Ariadne explorers registered.
	 */
	private List<AbstractAriadneExplorer> explorers = new ArrayList<>();

	/**
	 * The context of the bundle.
	 */
	private final BundleContext context;

	/**
	 * The constructor.
	 * 
	 * @param bundleContext
	 *            The bundle context
	 */
	public AriadneExplorerServiceTrackerCustomizer(BundleContext bundleContext) {
		this.context = bundleContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public AbstractAriadneExplorer addingService(ServiceReference<Object> reference) {
		Object service = this.context.getService(reference);
		if (service instanceof AbstractAriadneExplorer) {
			this.explorers.add((AbstractAriadneExplorer)service);
			return (AbstractAriadneExplorer)service;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#modifiedService(org.osgi.framework.ServiceReference,
	 *      java.lang.Object)
	 */
	@Override
	public void modifiedService(ServiceReference<Object> reference, AbstractAriadneExplorer service) {
		// remove the old one
		this.explorers.remove(service);

		// add the new one
		Object newService = this.context.getService(reference);
		if (newService instanceof AbstractAriadneExplorer) {
			this.explorers.add((AbstractAriadneExplorer)newService);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#removedService(org.osgi.framework.ServiceReference,
	 *      java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<Object> reference, AbstractAriadneExplorer service) {
		// Remove the old one
		this.explorers.remove(service);
	}

	/**
	 * Returns the list of all registered explorers.
	 * 
	 * @return The list of all registered explorers.
	 */
	public List<AbstractAriadneExplorer> getAllAriadneExplorers() {
		return Collections.unmodifiableList(this.explorers);
	}
}
