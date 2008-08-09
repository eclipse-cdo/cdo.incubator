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
 * $Id: CheckoutManagerImpl.java,v 1.3 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutManager;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.runtime.IPath;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Checkout Manager</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl#getPop <em>Pop</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl#getCheckouts <em>Checkouts</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl#getActiveCheckout <em>Active Checkout</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CheckoutManagerImpl extends PopElementImpl implements CheckoutManager
{
  /**
   * The cached value of the '{@link #getPop() <em>Pop</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPop()
   * @generated
   * @ordered
   */
  protected Pop pop;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final IPath LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCheckouts() <em>Checkouts</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCheckouts()
   * @generated
   * @ordered
   */
  protected EList<Checkout> checkouts;

  /**
   * The cached value of the '{@link #getActiveCheckout() <em>Active Checkout</em>}' reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getActiveCheckout()
   * @generated
   * @ordered
   */
  protected Checkout activeCheckout;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected CheckoutManagerImpl()
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
    return PopPackage.Literals.CHECKOUT_MANAGER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop getPop()
  {
    if (pop != null && pop.eIsProxy())
    {
      InternalEObject oldPop = (InternalEObject)pop;
      pop = (Pop)eResolveProxy(oldPop);
      if (pop != oldPop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.CHECKOUT_MANAGER__POP, oldPop, pop));
      }
    }
    return pop;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop basicGetPop()
  {
    return pop;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPop(Pop newPop, NotificationChain msgs)
  {
    Pop oldPop = pop;
    pop = newPop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.CHECKOUT_MANAGER__POP,
          oldPop, newPop);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPop(Pop newPop)
  {
    if (newPop != pop)
    {
      NotificationChain msgs = null;
      if (pop != null)
        msgs = ((InternalEObject)pop).eInverseRemove(this, PopPackage.POP__CHECKOUT_MANAGER, Pop.class, msgs);
      if (newPop != null)
        msgs = ((InternalEObject)newPop).eInverseAdd(this, PopPackage.POP__CHECKOUT_MANAGER, Pop.class, msgs);
      msgs = basicSetPop(newPop, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.CHECKOUT_MANAGER__POP, newPop, newPop));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IPath getLocation()
  {
    // TODO: implement this method to return the 'Location' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Checkout> getCheckouts()
  {
    if (checkouts == null)
    {
      checkouts = new EObjectContainmentWithInverseEList<Checkout>(Checkout.class, this,
          PopPackage.CHECKOUT_MANAGER__CHECKOUTS, PopPackage.CHECKOUT__MANAGER);
    }
    return checkouts;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Checkout getActiveCheckout()
  {
    return activeCheckout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setActiveCheckout(Checkout newActiveCheckout)
  {
    Checkout oldActiveCheckout = activeCheckout;
    activeCheckout = newActiveCheckout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.CHECKOUT_MANAGER__ACTIVE_CHECKOUT,
          oldActiveCheckout, activeCheckout));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.CHECKOUT_MANAGER__POP:
      if (pop != null)
        msgs = ((InternalEObject)pop).eInverseRemove(this, PopPackage.POP__CHECKOUT_MANAGER, Pop.class, msgs);
      return basicSetPop((Pop)otherEnd, msgs);
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getCheckouts()).basicAdd(otherEnd, msgs);
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
    case PopPackage.CHECKOUT_MANAGER__POP:
      return basicSetPop(null, msgs);
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      return ((InternalEList<?>)getCheckouts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case PopPackage.CHECKOUT_MANAGER__POP:
      if (resolve)
        return getPop();
      return basicGetPop();
    case PopPackage.CHECKOUT_MANAGER__LOCATION:
      return getLocation();
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      return getCheckouts();
    case PopPackage.CHECKOUT_MANAGER__ACTIVE_CHECKOUT:
      return getActiveCheckout();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.CHECKOUT_MANAGER__POP:
      setPop((Pop)newValue);
      return;
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      getCheckouts().clear();
      getCheckouts().addAll((Collection<? extends Checkout>)newValue);
      return;
    case PopPackage.CHECKOUT_MANAGER__ACTIVE_CHECKOUT:
      setActiveCheckout((Checkout)newValue);
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
    case PopPackage.CHECKOUT_MANAGER__POP:
      setPop((Pop)null);
      return;
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      getCheckouts().clear();
      return;
    case PopPackage.CHECKOUT_MANAGER__ACTIVE_CHECKOUT:
      setActiveCheckout((Checkout)null);
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
    case PopPackage.CHECKOUT_MANAGER__POP:
      return pop != null;
    case PopPackage.CHECKOUT_MANAGER__LOCATION:
      return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
    case PopPackage.CHECKOUT_MANAGER__CHECKOUTS:
      return checkouts != null && !checkouts.isEmpty();
    case PopPackage.CHECKOUT_MANAGER__ACTIVE_CHECKOUT:
      return activeCheckout != null;
    }
    return super.eIsSet(featureID);
  }

} // CheckoutManagerImpl
