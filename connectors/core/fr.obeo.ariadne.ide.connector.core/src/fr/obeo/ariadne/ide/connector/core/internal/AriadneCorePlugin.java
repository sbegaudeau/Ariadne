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
package fr.obeo.ariadne.ide.connector.core.internal;

import fr.obeo.ariadne.ide.connector.core.explorer.AbstractAriadneExplorer;
import fr.obeo.ariadne.ide.connector.core.internal.explorer.AriadneExplorerServiceTrackerCustomizer;
import fr.obeo.ariadne.ide.connector.core.internal.utils.AriadneCoreMessages;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator of the plugin.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 1.0
 */
public class AriadneCorePlugin extends Plugin {

	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "fr.obeo.ariadne.ide.connector.core"; //$NON-NLS-1$

	/**
	 * The shared instance.
	 */
	private static AriadneCorePlugin plugin;

	/**
	 * The OSGI service tracker.
	 */
	private ServiceTracker<Object, AbstractAriadneExplorer> serviceTracker;

	/**
	 * The service tracker customizer which will hold all the registered Ariadne explorers.
	 */
	private AriadneExplorerServiceTrackerCustomizer customizer;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		customizer = new AriadneExplorerServiceTrackerCustomizer(context);
		this.serviceTracker = new ServiceTracker<>(context, AbstractAriadneExplorer.class.getName(),
				customizer);
		this.serviceTracker.open();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		this.serviceTracker.close();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the service tracker customizer.
	 * 
	 * @return The service tracker customizer.
	 */
	public AriadneExplorerServiceTrackerCustomizer getServiceTrackerCustomizer() {
		return this.customizer;
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static AriadneCorePlugin getDefault() {
		return plugin;
	}

	/**
	 * Logs the given exception as error or warning.
	 * 
	 * @param exception
	 *            The exception to log.
	 * @param blocker
	 *            <code>True</code> if the message must be logged as error, <code>False</code> to log it as a
	 *            warning.
	 */
	public static void log(Exception exception, boolean blocker) {
		int severity = IStatus.WARNING;
		if (blocker) {
			severity = IStatus.ERROR;
		}
		ILog log = getDefault().getLog();
		log.log(new Status(severity, PLUGIN_ID, exception.getMessage(), exception));
	}

	/**
	 * Puts the given status in the error log view.
	 * 
	 * @param status
	 *            Error Status.
	 */
	public static void log(IStatus status) {
		// Eclipse platform displays NullPointer on standard error instead of throwing it.
		// We'll handle this by throwing it ourselves.
		if (status == null) {
			throw new NullPointerException(AriadneCoreMessages.getString("AriadneCorePlugin.LogNullStatus")); //$NON-NLS-1$
		}

		if (getDefault() != null) {
			getDefault().getLog().log(status);
		} else {
			// We are out of eclipse. Prints the message on standard error.
			// CHECKSTYLE:OFF
			System.err.println(status.getMessage());
			status.getException().printStackTrace();
			// CHECKSTYLE:ON
		}
	}

	/**
	 * Puts the given message in the error log view, as error or warning.
	 * 
	 * @param message
	 *            The message to put in the error log view.
	 * @param blocker
	 *            <code>True</code> if the message must be logged as error, <code>False</code> to log it as a
	 *            warning.
	 */
	public static void log(String message, boolean blocker) {
		if (getDefault() == null) {
			// We are out of eclipse. Prints the message on standard error.
			// CHECKSTYLE:OFF
			System.err.println(message);
			// CHECKSTYLE:ON
		} else {
			int severity = IStatus.WARNING;
			if (blocker) {
				severity = IStatus.ERROR;
			}
			String errorMessage = message;
			if (errorMessage == null || "".equals(errorMessage)) { //$NON-NLS-1$
				errorMessage = AriadneCoreMessages.getString("AriadneCorePlugin.UnexpectedException"); //$NON-NLS-1$
			}
			log(new Status(severity, PLUGIN_ID, errorMessage));
		}
	}
}
