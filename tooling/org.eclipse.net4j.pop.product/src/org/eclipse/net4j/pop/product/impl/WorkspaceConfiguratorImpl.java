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
 * $Id: WorkspaceConfiguratorImpl.java,v 1.1 2008-07-31 12:33:20 estepper Exp $
 */
package org.eclipse.net4j.pop.product.impl;

import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.product.ProductPackage;
import org.eclipse.net4j.pop.product.WorkspaceConfigurator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workspace Configurator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl#getWorkspaceSpec <em>Workspace Spec</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class WorkspaceConfiguratorImpl extends EObjectImpl implements WorkspaceConfigurator
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected WorkspaceConfiguratorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProductPackage.Literals.WORKSPACE_CONFIGURATOR;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PopProduct getWorkspaceSpec()
  {
    if (eContainerFeatureID != ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC) return null;
    return (PopProduct)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetWorkspaceSpec(PopProduct newWorkspaceSpec, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newWorkspaceSpec, ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC,
        msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setWorkspaceSpec(PopProduct newWorkspaceSpec)
  {
    if (newWorkspaceSpec != eInternalContainer()
        || (eContainerFeatureID != ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC && newWorkspaceSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newWorkspaceSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newWorkspaceSpec != null)
        msgs = ((InternalEObject)newWorkspaceSpec).eInverseAdd(this, ProductPackage.POP_PRODUCT__CONFIGURATORS,
            PopProduct.class, msgs);
      msgs = basicSetWorkspaceSpec(newWorkspaceSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC,
          newWorkspaceSpec, newWorkspaceSpec));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void configureWorkspace()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return basicSetWorkspaceSpec((PopProduct)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      return basicSetWorkspaceSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      return eInternalContainer().eInverseRemove(this, ProductPackage.POP_PRODUCT__CONFIGURATORS, PopProduct.class,
          msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      return getWorkspaceSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      setWorkspaceSpec((PopProduct)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      setWorkspaceSpec((PopProduct)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC:
      return getWorkspaceSpec() != null;
    }
    return super.eIsSet(featureID);
  }

} // WorkspaceConfiguratorImpl
