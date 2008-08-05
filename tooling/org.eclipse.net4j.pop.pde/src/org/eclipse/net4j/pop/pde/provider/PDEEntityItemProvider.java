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
 * $Id: PDEEntityItemProvider.java,v 1.3 2008-08-05 14:47:45 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.provider;

import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link org.eclipse.net4j.pop.pde.PDEEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PDEEntityItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
    IItemColorProvider, IItemFontProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEEntityItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addIdPropertyDescriptor(object);
      addVersionPropertyDescriptor(object);
      addLocationPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_PDEEntity_id_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_PDEEntity_id_feature", "_UI_PDEEntity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            PDEPackage.Literals.PDE_ENTITY__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
            null));
  }

  /**
   * This adds a property descriptor for the Version feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addVersionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_PDEEntity_version_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_PDEEntity_version_feature", "_UI_PDEEntity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PDEPackage.Literals.PDE_ENTITY__VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        null));
  }

  /**
   * This adds a property descriptor for the Location feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addLocationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
        .getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_PDEEntity_location_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_PDEEntity_location_feature", "_UI_PDEEntity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        PDEPackage.Literals.PDE_ENTITY__LOCATION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        null));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean hasChildren(Object object)
  {
    return hasChildren(object, true);
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((PDEEntity)object).getId();
    return label == null || label.length() == 0 ? getString("_UI_PDEEntity_type") : //$NON-NLS-1$
        getString("_UI_PDEEntity_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(PDEEntity.class))
    {
    case PDEPackage.PDE_ENTITY__ID:
    case PDEPackage.PDE_ENTITY__VERSION:
    case PDEPackage.PDE_ENTITY__LOCATION:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return ((IChildCreationExtender)adapterFactory).getResourceLocator();
  }

}
