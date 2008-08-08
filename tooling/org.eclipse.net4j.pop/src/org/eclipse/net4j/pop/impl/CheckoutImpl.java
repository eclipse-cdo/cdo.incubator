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
 * $Id: CheckoutImpl.java,v 1.2 2008-08-08 09:24:33 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutDiscriminator;
import org.eclipse.net4j.pop.CheckoutManager;
import org.eclipse.net4j.pop.CheckoutState;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.WorkspaceSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#isTransitioning <em>Transitioning</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutImpl#getWorkspaceSpecification <em>Workspace Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckoutImpl extends PopElementImpl implements Checkout
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final IPath LOCATION_EDEFAULT = null;

  /**
   * The default value of the '{@link #isTransitioning() <em>Transitioning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTransitioning()
   * @generated
   * @ordered
   */
  protected static final boolean TRANSITIONING_EDEFAULT = false;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final CheckoutState STATE_EDEFAULT = CheckoutState.INITIAL;

  /**
   * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActive()
   * @generated
   * @ordered
   */
  protected static final boolean ACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #getWorkspaceSpecification() <em>Workspace Specification</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspaceSpecification()
   * @generated
   * @ordered
   */
  protected WorkspaceSpecification workspaceSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckoutImpl()
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
    return PopPackage.Literals.CHECKOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutManager getManager()
  {
    if (eContainerFeatureID != PopPackage.CHECKOUT__MANAGER)
      return null;
    return (CheckoutManager)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManager(CheckoutManager newManager, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newManager, PopPackage.CHECKOUT__MANAGER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManager(CheckoutManager newManager)
  {
    if (newManager != eInternalContainer()
        || (eContainerFeatureID != PopPackage.CHECKOUT__MANAGER && newManager != null))
    {
      if (EcoreUtil.isAncestor(this, newManager))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newManager != null)
        msgs = ((InternalEObject)newManager).eInverseAdd(this, PopPackage.CHECKOUT_MANAGER__CHECKOUTS,
            CheckoutManager.class, msgs);
      msgs = basicSetManager(newManager, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.CHECKOUT__MANAGER, newManager, newManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutDiscriminator getDiscriminator()
  {
    // TODO: implement this method to return the 'Discriminator' reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminator(CheckoutDiscriminator newDiscriminator)
  {
    // TODO: implement this method to set the 'Discriminator' reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPath getLocation()
  {
    // TODO: implement this method to return the 'Location' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTransitioning()
  {
    // TODO: implement this method to return the 'Transitioning' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutState getState()
  {
    // TODO: implement this method to return the 'State' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isActive()
  {
    // TODO: implement this method to return the 'Active' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceSpecification getWorkspaceSpecification()
  {
    if (workspaceSpecification != null && workspaceSpecification.eIsProxy())
    {
      InternalEObject oldWorkspaceSpecification = (InternalEObject)workspaceSpecification;
      workspaceSpecification = (WorkspaceSpecification)eResolveProxy(oldWorkspaceSpecification);
      if (workspaceSpecification != oldWorkspaceSpecification)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION,
              oldWorkspaceSpecification, workspaceSpecification));
      }
    }
    return workspaceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceSpecification basicGetWorkspaceSpecification()
  {
    return workspaceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkspaceSpecification(WorkspaceSpecification newWorkspaceSpecification,
      NotificationChain msgs)
  {
    WorkspaceSpecification oldWorkspaceSpecification = workspaceSpecification;
    workspaceSpecification = newWorkspaceSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION, oldWorkspaceSpecification, newWorkspaceSpecification);
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
  public void setWorkspaceSpecification(WorkspaceSpecification newWorkspaceSpecification)
  {
    if (newWorkspaceSpecification != workspaceSpecification)
    {
      NotificationChain msgs = null;
      if (workspaceSpecification != null)
        msgs = ((InternalEObject)workspaceSpecification).eInverseRemove(this,
            PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT, WorkspaceSpecification.class, msgs);
      if (newWorkspaceSpecification != null)
        msgs = ((InternalEObject)newWorkspaceSpecification).eInverseAdd(this,
            PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT, WorkspaceSpecification.class, msgs);
      msgs = basicSetWorkspaceSpecification(newWorkspaceSpecification, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION,
          newWorkspaceSpecification, newWorkspaceSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.CHECKOUT__MANAGER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetManager((CheckoutManager)otherEnd, msgs);
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      if (workspaceSpecification != null)
        msgs = ((InternalEObject)workspaceSpecification).eInverseRemove(this,
            PopPackage.WORKSPACE_SPECIFICATION__CHECKOUT, WorkspaceSpecification.class, msgs);
      return basicSetWorkspaceSpecification((WorkspaceSpecification)otherEnd, msgs);
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
    case PopPackage.CHECKOUT__MANAGER:
      return basicSetManager(null, msgs);
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      return basicSetWorkspaceSpecification(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PopPackage.CHECKOUT__MANAGER:
      return eInternalContainer().eInverseRemove(this, PopPackage.CHECKOUT_MANAGER__CHECKOUTS, CheckoutManager.class,
          msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case PopPackage.CHECKOUT__MANAGER:
      return getManager();
    case PopPackage.CHECKOUT__DISCRIMINATOR:
      return getDiscriminator();
    case PopPackage.CHECKOUT__LOCATION:
      return getLocation();
    case PopPackage.CHECKOUT__TRANSITIONING:
      return isTransitioning() ? Boolean.TRUE : Boolean.FALSE;
    case PopPackage.CHECKOUT__STATE:
      return getState();
    case PopPackage.CHECKOUT__ACTIVE:
      return isActive() ? Boolean.TRUE : Boolean.FALSE;
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      if (resolve)
        return getWorkspaceSpecification();
      return basicGetWorkspaceSpecification();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.CHECKOUT__MANAGER:
      setManager((CheckoutManager)newValue);
      return;
    case PopPackage.CHECKOUT__DISCRIMINATOR:
      setDiscriminator((CheckoutDiscriminator)newValue);
      return;
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      setWorkspaceSpecification((WorkspaceSpecification)newValue);
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
    case PopPackage.CHECKOUT__MANAGER:
      setManager((CheckoutManager)null);
      return;
    case PopPackage.CHECKOUT__DISCRIMINATOR:
      setDiscriminator((CheckoutDiscriminator)null);
      return;
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      setWorkspaceSpecification((WorkspaceSpecification)null);
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
    case PopPackage.CHECKOUT__MANAGER:
      return getManager() != null;
    case PopPackage.CHECKOUT__DISCRIMINATOR:
      return getDiscriminator() != null;
    case PopPackage.CHECKOUT__LOCATION:
      return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
    case PopPackage.CHECKOUT__TRANSITIONING:
      return isTransitioning() != TRANSITIONING_EDEFAULT;
    case PopPackage.CHECKOUT__STATE:
      return getState() != STATE_EDEFAULT;
    case PopPackage.CHECKOUT__ACTIVE:
      return isActive() != ACTIVE_EDEFAULT;
    case PopPackage.CHECKOUT__WORKSPACE_SPECIFICATION:
      return workspaceSpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //CheckoutImpl
