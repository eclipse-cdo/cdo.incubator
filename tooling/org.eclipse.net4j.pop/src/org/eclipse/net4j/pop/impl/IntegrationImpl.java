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
 * $Id: IntegrationImpl.java,v 1.1 2008-08-07 17:42:13 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Delivery;
import org.eclipse.net4j.pop.Integration;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.IntegrationImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.IntegrationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.IntegrationImpl#getDelivery <em>Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationImpl extends TaggedElementImpl implements Integration
{
  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final Date DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date = DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelivery()
   * @generated
   * @ordered
   */
  protected Delivery delivery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegrationImpl()
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
    return PopPackage.Literals.INTEGRATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream getStream()
  {
    if (eContainerFeatureID != PopPackage.INTEGRATION__STREAM)
      return null;
    return (Stream)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream basicGetStream()
  {
    if (eContainerFeatureID != PopPackage.INTEGRATION__STREAM)
      return null;
    return (Stream)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStream(Stream newStream, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newStream, PopPackage.INTEGRATION__STREAM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream(Stream newStream)
  {
    if (newStream != eInternalContainer()
        || (eContainerFeatureID != PopPackage.INTEGRATION__STREAM && newStream != null))
    {
      if (EcoreUtil.isAncestor(this, newStream))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, PopPackage.STREAM__INTEGRATIONS, Stream.class, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.INTEGRATION__STREAM, newStream, newStream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Date newDate)
  {
    Date oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.INTEGRATION__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delivery getDelivery()
  {
    if (delivery != null && delivery.eIsProxy())
    {
      InternalEObject oldDelivery = (InternalEObject)delivery;
      delivery = (Delivery)eResolveProxy(oldDelivery);
      if (delivery != oldDelivery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.INTEGRATION__DELIVERY, oldDelivery,
              delivery));
      }
    }
    return delivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delivery basicGetDelivery()
  {
    return delivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelivery(Delivery newDelivery, NotificationChain msgs)
  {
    Delivery oldDelivery = delivery;
    delivery = newDelivery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.INTEGRATION__DELIVERY,
          oldDelivery, newDelivery);
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
  public void setDelivery(Delivery newDelivery)
  {
    if (newDelivery != delivery)
    {
      NotificationChain msgs = null;
      if (delivery != null)
        msgs = ((InternalEObject)delivery).eInverseRemove(this, PopPackage.DELIVERY__MERGES, Delivery.class, msgs);
      if (newDelivery != null)
        msgs = ((InternalEObject)newDelivery).eInverseAdd(this, PopPackage.DELIVERY__MERGES, Delivery.class, msgs);
      msgs = basicSetDelivery(newDelivery, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.INTEGRATION__DELIVERY, newDelivery, newDelivery));
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
    case PopPackage.INTEGRATION__STREAM:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetStream((Stream)otherEnd, msgs);
    case PopPackage.INTEGRATION__DELIVERY:
      if (delivery != null)
        msgs = ((InternalEObject)delivery).eInverseRemove(this, PopPackage.DELIVERY__MERGES, Delivery.class, msgs);
      return basicSetDelivery((Delivery)otherEnd, msgs);
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
    case PopPackage.INTEGRATION__STREAM:
      return basicSetStream(null, msgs);
    case PopPackage.INTEGRATION__DELIVERY:
      return basicSetDelivery(null, msgs);
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
    case PopPackage.INTEGRATION__STREAM:
      return eInternalContainer().eInverseRemove(this, PopPackage.STREAM__INTEGRATIONS, Stream.class, msgs);
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
    case PopPackage.INTEGRATION__STREAM:
      if (resolve)
        return getStream();
      return basicGetStream();
    case PopPackage.INTEGRATION__DATE:
      return getDate();
    case PopPackage.INTEGRATION__DELIVERY:
      if (resolve)
        return getDelivery();
      return basicGetDelivery();
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
    case PopPackage.INTEGRATION__STREAM:
      setStream((Stream)newValue);
      return;
    case PopPackage.INTEGRATION__DATE:
      setDate((Date)newValue);
      return;
    case PopPackage.INTEGRATION__DELIVERY:
      setDelivery((Delivery)newValue);
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
    case PopPackage.INTEGRATION__STREAM:
      setStream((Stream)null);
      return;
    case PopPackage.INTEGRATION__DATE:
      setDate(DATE_EDEFAULT);
      return;
    case PopPackage.INTEGRATION__DELIVERY:
      setDelivery((Delivery)null);
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
    case PopPackage.INTEGRATION__STREAM:
      return basicGetStream() != null;
    case PopPackage.INTEGRATION__DATE:
      return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
    case PopPackage.INTEGRATION__DELIVERY:
      return delivery != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (date: "); //$NON-NLS-1$
    result.append(date);
    result.append(')');
    return result.toString();
  }

} //IntegrationImpl
