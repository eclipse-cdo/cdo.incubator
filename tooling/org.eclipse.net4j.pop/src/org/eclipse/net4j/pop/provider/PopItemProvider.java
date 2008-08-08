/**
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *
 * $Id: PopItemProvider.java,v 1.3 2008-08-08 09:25:49 estepper Exp $
 */
package org.eclipse.net4j.pop.provider;

import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopFactory;
import org.eclipse.net4j.pop.PopPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link org.eclipse.net4j.pop.Pop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PopItemProvider extends PopElementItemProvider implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
    ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopItemProvider(AdapterFactory adapterFactory)
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

      addManagerPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addActivePropertyDescriptor(object);
      addCheckoutManagerPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Manager feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addManagerPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Pop_manager_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_Pop_manager_feature", "_UI_Pop_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PopPackage.Literals.POP__MANAGER, false, false, false, null, null, null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Pop_name_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_Pop_name_feature", "_UI_Pop_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PopPackage.Literals.POP__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Active feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addActivePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Pop_active_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_Pop_active_feature", "_UI_Pop_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PopPackage.Literals.POP__ACTIVE, false, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Checkout Manager feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCheckoutManagerPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Pop_checkoutManager_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_Pop_checkoutManager_feature", "_UI_Pop_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PopPackage.Literals.POP__CHECKOUT_MANAGER, true, false, true, null, null, null));
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
      childrenFeatures.add(PopPackage.Literals.ASSIGNEE__TASKS);
      childrenFeatures.add(PopPackage.Literals.ASSIGNEE__TASK_GROUPS);
      childrenFeatures.add(PopPackage.Literals.POP__DEVELOPERS);
      childrenFeatures.add(PopPackage.Literals.POP__REPOSITORY);
      childrenFeatures.add(PopPackage.Literals.POP__ROOT_STREAM);
      childrenFeatures.add(PopPackage.Literals.POP__PRIMARY_MODULE);
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
   * This returns Pop.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Pop")); //$NON-NLS-1$
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
    String label = ((Pop)object).getName();
    return label == null || label.length() == 0 ? getString("_UI_Pop_type") : //$NON-NLS-1$
        getString("_UI_Pop_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(Pop.class))
    {
    case PopPackage.POP__NAME:
    case PopPackage.POP__ACTIVE:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case PopPackage.POP__TASKS:
    case PopPackage.POP__TASK_GROUPS:
    case PopPackage.POP__DEVELOPERS:
    case PopPackage.POP__REPOSITORY:
    case PopPackage.POP__ROOT_STREAM:
    case PopPackage.POP__PRIMARY_MODULE:
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

    newChildDescriptors
        .add(createChildParameter(PopPackage.Literals.ASSIGNEE__TASKS, PopFactory.eINSTANCE.createTask()));

    newChildDescriptors.add(createChildParameter(PopPackage.Literals.ASSIGNEE__TASK_GROUPS, PopFactory.eINSTANCE
        .createTaskGroup()));

    newChildDescriptors.add(createChildParameter(PopPackage.Literals.POP__DEVELOPERS, PopFactory.eINSTANCE
        .createDeveloper()));

    newChildDescriptors.add(createChildParameter(PopPackage.Literals.POP__REPOSITORY, PopFactory.eINSTANCE
        .createRepository()));

    newChildDescriptors.add(createChildParameter(PopPackage.Literals.POP__ROOT_STREAM, PopFactory.eINSTANCE
        .createDevelopmentStream()));

    newChildDescriptors.add(createChildParameter(PopPackage.Literals.POP__PRIMARY_MODULE, PopFactory.eINSTANCE
        .createPrimaryModule()));
  }

}
