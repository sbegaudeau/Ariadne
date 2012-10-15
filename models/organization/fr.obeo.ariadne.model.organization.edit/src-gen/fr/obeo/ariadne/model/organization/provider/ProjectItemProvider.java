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
package fr.obeo.ariadne.model.organization.provider;


import fr.obeo.ariadne.model.code.CodeFactory;

import fr.obeo.ariadne.model.core.provider.VersionedElementItemProvider;

import fr.obeo.ariadne.model.environment.EnvironmentFactory;

import fr.obeo.ariadne.model.organization.OrganizationFactory;
import fr.obeo.ariadne.model.organization.OrganizationPackage;
import fr.obeo.ariadne.model.organization.Project;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.ariadne.model.organization.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider
  extends VersionedElementItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addDependentProjectsPropertyDescriptor(object);
      addSpecificationsPropertyDescriptor(object);
      addRepositoriesPropertyDescriptor(object);
      addCategoryPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Dependent Projects feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDependentProjectsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Project_dependentProjects_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Project_dependentProjects_feature", "_UI_Project_type"),
         OrganizationPackage.Literals.PROJECT__DEPENDENT_PROJECTS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Specifications feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSpecificationsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Project_specifications_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Project_specifications_feature", "_UI_Project_type"),
         OrganizationPackage.Literals.PROJECT__SPECIFICATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Repositories feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRepositoriesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Project_repositories_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Project_repositories_feature", "_UI_Project_type"),
         OrganizationPackage.Literals.PROJECT__REPOSITORIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Category feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCategoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Project_category_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Project_category_feature", "_UI_Project_type"),
         OrganizationPackage.Literals.PROJECT__CATEGORY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(OrganizationPackage.Literals.PROJECT__COMPONENTS);
      childrenFeatures.add(OrganizationPackage.Literals.PROJECT__DEVELOPMENT_ENVIRONMENTS);
      childrenFeatures.add(OrganizationPackage.Literals.PROJECT__RUNTIME_ENVIRONMENTS);
      childrenFeatures.add(OrganizationPackage.Literals.PROJECT__SUB_PROJECTS);
      childrenFeatures.add(OrganizationPackage.Literals.PROJECT__RELEASES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Project.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Project)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Project_type") :
      getString("_UI_Project_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Project.class))
    {
      case OrganizationPackage.PROJECT__COMPONENTS:
      case OrganizationPackage.PROJECT__DEVELOPMENT_ENVIRONMENTS:
      case OrganizationPackage.PROJECT__RUNTIME_ENVIRONMENTS:
      case OrganizationPackage.PROJECT__SUB_PROJECTS:
      case OrganizationPackage.PROJECT__RELEASES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.PROJECT__COMPONENTS,
         CodeFactory.eINSTANCE.createComponent()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.PROJECT__DEVELOPMENT_ENVIRONMENTS,
         EnvironmentFactory.eINSTANCE.createDevelopmentEnvironment()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.PROJECT__RUNTIME_ENVIRONMENTS,
         EnvironmentFactory.eINSTANCE.createRuntimeEnvironment()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.PROJECT__SUB_PROJECTS,
         OrganizationFactory.eINSTANCE.createProject()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.PROJECT__RELEASES,
         OrganizationFactory.eINSTANCE.createRelease()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return OrganizationEditPlugin.INSTANCE;
  }

}
