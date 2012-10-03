/**
 */
package fr.obeo.ariadne.model.organization.provider;


import fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationFactory;

import fr.obeo.ariadne.model.core.CoreFactory;

import fr.obeo.ariadne.model.organization.Organization;
import fr.obeo.ariadne.model.organization.OrganizationFactory;
import fr.obeo.ariadne.model.organization.OrganizationPackage;

import fr.obeo.ariadne.model.scm.ScmFactory;

import fr.obeo.ariadne.model.tasks.TasksFactory;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.ariadne.model.organization.Organization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationItemProvider
  extends ItemProviderAdapter
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
  public OrganizationItemProvider(AdapterFactory adapterFactory)
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

      addNamePropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Organization_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Organization_name_feature", "_UI_Organization_type"),
         OrganizationPackage.Literals.ORGANIZATION__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDescriptionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Organization_description_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Organization_description_feature", "_UI_Organization_type"),
         OrganizationPackage.Literals.ORGANIZATION__DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__CATEGORIES);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__PERSONS);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__REPOSITORIES);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__BUILD_SERVERS);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__TASKS_REPOSITORIES);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__PROPERTIES);
      childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__ORGANIZATION_DEPENDENCIES);
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
   * This returns Organization.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Organization"));
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
    String label = ((Organization)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Organization_type") :
      getString("_UI_Organization_type") + " " + label;
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

    switch (notification.getFeatureID(Organization.class))
    {
      case OrganizationPackage.ORGANIZATION__NAME:
      case OrganizationPackage.ORGANIZATION__DESCRIPTION:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case OrganizationPackage.ORGANIZATION__CATEGORIES:
      case OrganizationPackage.ORGANIZATION__PERSONS:
      case OrganizationPackage.ORGANIZATION__REPOSITORIES:
      case OrganizationPackage.ORGANIZATION__BUILD_SERVERS:
      case OrganizationPackage.ORGANIZATION__TASKS_REPOSITORIES:
      case OrganizationPackage.ORGANIZATION__PROPERTIES:
      case OrganizationPackage.ORGANIZATION__ORGANIZATION_DEPENDENCIES:
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
        (OrganizationPackage.Literals.ORGANIZATION__CATEGORIES,
         OrganizationFactory.eINSTANCE.createCategory()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__PERSONS,
         CoreFactory.eINSTANCE.createPerson()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__REPOSITORIES,
         ScmFactory.eINSTANCE.createRepository()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__BUILD_SERVERS,
         ContinuousintegrationFactory.eINSTANCE.createBuildServer()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__TASKS_REPOSITORIES,
         TasksFactory.eINSTANCE.createTasksRepository()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__PROPERTIES,
         CoreFactory.eINSTANCE.createProperty()));

    newChildDescriptors.add
      (createChildParameter
        (OrganizationPackage.Literals.ORGANIZATION__ORGANIZATION_DEPENDENCIES,
         OrganizationFactory.eINSTANCE.createOrganizationDependency()));
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
