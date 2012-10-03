/**
 */
package fr.obeo.ariadne.model.organization.provider;

import fr.obeo.ariadne.model.code.provider.CodeEditPlugin;

import fr.obeo.ariadne.model.continuousintegration.provider.ContinuousintegrationEditPlugin;

import fr.obeo.ariadne.model.core.provider.CoreEditPlugin;

import fr.obeo.ariadne.model.environment.provider.EnvironmentEditPlugin;

import fr.obeo.ariadne.model.scm.provider.ScmEditPlugin;

import fr.obeo.ariadne.model.tasks.provider.TasksEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Organization edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class OrganizationEditPlugin extends EMFPlugin
{
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final OrganizationEditPlugin INSTANCE = new OrganizationEditPlugin();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrganizationEditPlugin()
  {
    super
      (new ResourceLocator [] 
       {
         CodeEditPlugin.INSTANCE,
         TasksEditPlugin.INSTANCE,
         ScmEditPlugin.INSTANCE,
         EnvironmentEditPlugin.INSTANCE,
         CoreEditPlugin.INSTANCE,
         ContinuousintegrationEditPlugin.INSTANCE,
       });
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin
  {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation()
    {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
