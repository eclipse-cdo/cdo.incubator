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
 * $Id: WorkspaceSpecificationImpl.java,v 1.2 2008-08-08 09:24:33 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.SecondaryModule;
import org.eclipse.net4j.pop.WorkspaceConfigurator;
import org.eclipse.net4j.pop.WorkspaceSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl#getCheckout <em>Checkout</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl#getSecondaryModules <em>Secondary Modules</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl#getWorkspaceConfigurators <em>Workspace Configurators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceSpecificationImpl extends PopElementImpl implements WorkspaceSpecification
{
  /**
   * The cached value of the '{@link #getCheckout() <em>Checkout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckout()
   * @generated
   * @ordered
   */
  protected Checkout checkout;

  /**
   * The cached value of the '{@link #getSecondaryModules() <em>Secondary Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondaryModules()
   * @generated
   * @ordered
   */
  protected EList<SecondaryModule> secondaryModules;

  /**
   * The cached value of the '{@link #getWorkspaceConfigurators() <em>Workspace Configurators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspaceConfigurators()
   * @generated
   * @ordered
   */
  protected EList<WorkspaceConfigurator> workspaceConfigurators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceSpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PopPackage.Literals.WORKSPACE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkout getCheckout()
  {
    if (checkout != null && checkout.eIsProxy())
    {
      InternalEObject oldCheckout = (InternalEObject)checkout;
      checkout = (Checkout)eResolveProxy(oldCheckout);
      if (checkout != oldCheckout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT,
              oldCheckout, checkout));
      }
    }
    return checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkout basicGetCheckout()
  {
    return checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckout(Checkout newCheckout, NotificationChain msgs)
  {
    Checkout oldCheckout = checkout;
    checkout = newCheckout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT, oldCheckout, newCheckout);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckout(Checkout newCheckout)
  {
    if (newCheckout != checkout)
    {
      NotificationChain msgs = null;
      if (checkout != null)
        msgs = ((InternalEObject)checkout).eInverseRemove(this, PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION,
            Checkout.class, msgs);
      if (newCheckout != null)
        msgs = ((InternalEObject)newCheckout).eInverseAdd(this, PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION,
            Checkout.class, msgs);
      msgs = basicSetCheckout(newCheckout, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT, newCheckout,
          newCheckout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SecondaryModule> getSecondaryModules()
  {
    if (secondaryModules == null)
    {
      secondaryModules = new EObjectContainmentWithInverseEList.Resolving<SecondaryModule>(SecondaryModule.class, this,
          PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES, PopPackage.SECONDARY_MODULE__WORKSPACE_SPECIFICATION);
    }
    return secondaryModules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkspaceConfigurator> getWorkspaceConfigurators()
  {
    if (workspaceConfigurators == null)
    {
      workspaceConfigurators = new EObjectContainmentWithInverseEList.Resolving<WorkspaceConfigurator>(
          WorkspaceConfigurator.class, this, PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS,
          PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION);
    }
    return workspaceConfigurators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      if (checkout != null)
        msgs = ((InternalEObject)checkout).eInverseRemove(this, PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION,
            Checkout.class, msgs);
      return basicSetCheckout((Checkout)otherEnd, msgs);
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecondaryModules()).basicAdd(otherEnd, msgs);
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkspaceConfigurators()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      return basicSetCheckout(null, msgs);
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      return ((InternalEList<?>)getSecondaryModules()).basicRemove(otherEnd, msgs);
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      return ((InternalEList<?>)getWorkspaceConfigurators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      if (resolve)
        return getCheckout();
      return basicGetCheckout();
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      return getSecondaryModules();
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      return getWorkspaceConfigurators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      setCheckout((Checkout)newValue);
      return;
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      getSecondaryModules().clear();
      getSecondaryModules().addAll((Collection<? extends SecondaryModule>)newValue);
      return;
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      getWorkspaceConfigurators().clear();
      getWorkspaceConfigurators().addAll((Collection<? extends WorkspaceConfigurator>)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      setCheckout((Checkout)null);
      return;
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      getSecondaryModules().clear();
      return;
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      getWorkspaceConfigurators().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT:
      return checkout != null;
    case PopPackage.WORKSPACE_SPECIFICATION__SECONDARY_MODULES:
      return secondaryModules != null && !secondaryModules.isEmpty();
    case PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS:
      return workspaceConfigurators != null && !workspaceConfigurators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WorkspaceSpecificationImpl
