/**
 */
package fr.obeo.ariadne.model.organization.presentation;

import fr.obeo.ariadne.model.code.provider.CodeEditPlugin;

import fr.obeo.ariadne.model.continuousintegration.provider.ContinuousintegrationEditPlugin;

import fr.obeo.ariadne.model.core.provider.CoreEditPlugin;

import fr.obeo.ariadne.model.environment.provider.EnvironmentEditPlugin;

import fr.obeo.ariadne.model.scm.provider.ScmEditPlugin;

import fr.obeo.ariadne.model.tasks.provider.TasksEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Organization editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class OrganizationEditorPlugin extends EMFPlugin
{
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final OrganizationEditorPlugin INSTANCE = new OrganizationEditorPlugin();
  
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
  public OrganizationEditorPlugin()
  {
    super
      (new ResourceLocator [] 
      {
        EnvironmentEditPlugin.INSTANCE,
        ContinuousintegrationEditPlugin.INSTANCE,
        CoreEditPlugin.INSTANCE,
        TasksEditPlugin.INSTANCE,
        ScmEditPlugin.INSTANCE,
        CodeEditPlugin.INSTANCE,
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
  public static class Implementation extends EclipseUIPlugin
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
