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
 * $Id: DeliveryStreamImpl.java,v 1.2 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Delivery;
import org.eclipse.net4j.pop.DeliveryStream;
import org.eclipse.net4j.pop.IntegrationStream;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Delivery Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl#getBaseline <em>Baseline</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl#getTask <em>Task</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl#getDeliveries <em>Deliveries</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DeliveryStreamImpl extends StreamImpl implements DeliveryStream
{
  /**
   * The default value of the '{@link #getBaseline() <em>Baseline</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getBaseline()
   * @generated
   * @ordered
   */
  protected static final Date BASELINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getBaseline()
   * @generated
   * @ordered
   */
  protected Date baseline = BASELINE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

  /**
   * The cached value of the '{@link #getDeliveries() <em>Deliveries</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDeliveries()
   * @generated
   * @ordered
   */
  protected EList<Delivery> deliveries;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DeliveryStreamImpl()
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
    return PopPackage.Literals.DELIVERY_STREAM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IntegrationStream getParent()
  {
    if (eContainerFeatureID != PopPackage.DELIVERY_STREAM__PARENT)
      return null;
    return (IntegrationStream)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IntegrationStream basicGetParent()
  {
    if (eContainerFeatureID != PopPackage.DELIVERY_STREAM__PARENT)
      return null;
    return (IntegrationStream)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetParent(IntegrationStream newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, PopPackage.DELIVERY_STREAM__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setParent(IntegrationStream newParent)
  {
    if (newParent != eInternalContainer()
        || (eContainerFeatureID != PopPackage.DELIVERY_STREAM__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS,
            IntegrationStream.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DELIVERY_STREAM__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Date getBaseline()
  {
    return baseline;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setBaseline(Date newBaseline)
  {
    Date oldBaseline = baseline;
    baseline = newBaseline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DELIVERY_STREAM__BASELINE, oldBaseline, baseline));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.DELIVERY_STREAM__TASK, oldTask, task));
      }
    }
    return task;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTask(Task newTask)
  {
    Task oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DELIVERY_STREAM__TASK, oldTask, task));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Delivery> getDeliveries()
  {
    if (deliveries == null)
    {
      deliveries = new EObjectContainmentWithInverseEList.Resolving<Delivery>(Delivery.class, this,
          PopPackage.DELIVERY_STREAM__DELIVERIES, PopPackage.DELIVERY__STREAM);
    }
    return deliveries;
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetParent((IntegrationStream)otherEnd, msgs);
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeliveries()).basicAdd(otherEnd, msgs);
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      return basicSetParent(null, msgs);
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      return ((InternalEList<?>)getDeliveries()).basicRemove(otherEnd, msgs);
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      return eInternalContainer().eInverseRemove(this, PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS,
          IntegrationStream.class, msgs);
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      if (resolve)
        return getParent();
      return basicGetParent();
    case PopPackage.DELIVERY_STREAM__BASELINE:
      return getBaseline();
    case PopPackage.DELIVERY_STREAM__TASK:
      if (resolve)
        return getTask();
      return basicGetTask();
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      return getDeliveries();
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      setParent((IntegrationStream)newValue);
      return;
    case PopPackage.DELIVERY_STREAM__BASELINE:
      setBaseline((Date)newValue);
      return;
    case PopPackage.DELIVERY_STREAM__TASK:
      setTask((Task)newValue);
      return;
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      getDeliveries().clear();
      getDeliveries().addAll((Collection<? extends Delivery>)newValue);
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      setParent((IntegrationStream)null);
      return;
    case PopPackage.DELIVERY_STREAM__BASELINE:
      setBaseline(BASELINE_EDEFAULT);
      return;
    case PopPackage.DELIVERY_STREAM__TASK:
      setTask((Task)null);
      return;
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      getDeliveries().clear();
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
    case PopPackage.DELIVERY_STREAM__PARENT:
      return basicGetParent() != null;
    case PopPackage.DELIVERY_STREAM__BASELINE:
      return BASELINE_EDEFAULT == null ? baseline != null : !BASELINE_EDEFAULT.equals(baseline);
    case PopPackage.DELIVERY_STREAM__TASK:
      return task != null;
    case PopPackage.DELIVERY_STREAM__DELIVERIES:
      return deliveries != null && !deliveries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (baseline: "); //$NON-NLS-1$
    result.append(baseline);
    result.append(')');
    return result.toString();
  }

} // DeliveryStreamImpl
