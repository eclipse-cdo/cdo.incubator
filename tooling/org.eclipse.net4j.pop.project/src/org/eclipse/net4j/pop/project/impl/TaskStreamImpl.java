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
 * $Id: TaskStreamImpl.java,v 1.2 2008-07-31 13:35:41 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.Delivery;
import org.eclipse.net4j.pop.project.IntegrationStream;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Target;
import org.eclipse.net4j.pop.project.TaskStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task Stream</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl#getBaseline <em>Baseline</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl#getTargets <em>Targets</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl#getDeliveries <em>Deliveries</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TaskStreamImpl extends StreamImpl implements TaskStream
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected IntegrationStream parent;

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
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<Target> targets;

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
  protected TaskStreamImpl()
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
    return ProjectPackage.Literals.TASK_STREAM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IntegrationStream getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (IntegrationStream)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.TASK_STREAM__PARENT, oldParent,
              parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IntegrationStream basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetParent(IntegrationStream newParent, NotificationChain msgs)
  {
    IntegrationStream oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.TASK_STREAM__PARENT, oldParent, newParent);
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
  public void setParent(IntegrationStream newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, ProjectPackage.INTEGRATION_STREAM__TASK_STREAMS,
            IntegrationStream.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, ProjectPackage.INTEGRATION_STREAM__TASK_STREAMS,
            IntegrationStream.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_STREAM__PARENT, newParent, newParent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_STREAM__BASELINE, oldBaseline, baseline));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Target> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectWithInverseResolvingEList.ManyInverse<Target>(Target.class, this,
          ProjectPackage.TASK_STREAM__TARGETS, ProjectPackage.TARGET__STREAMS);
    }
    return targets;
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
      deliveries = new EObjectContainmentWithInverseEList<Delivery>(Delivery.class, this,
          ProjectPackage.TASK_STREAM__DELIVERIES, ProjectPackage.DELIVERY__STREAM);
    }
    return deliveries;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Delivery deliver(String id, Date date)
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
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.TASK_STREAM__PARENT:
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, ProjectPackage.INTEGRATION_STREAM__TASK_STREAMS,
            IntegrationStream.class, msgs);
      return basicSetParent((IntegrationStream)otherEnd, msgs);
    case ProjectPackage.TASK_STREAM__TARGETS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
    case ProjectPackage.TASK_STREAM__PARENT:
      return basicSetParent(null, msgs);
    case ProjectPackage.TASK_STREAM__TARGETS:
      return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ProjectPackage.TASK_STREAM__PARENT:
      if (resolve) return getParent();
      return basicGetParent();
    case ProjectPackage.TASK_STREAM__BASELINE:
      return getBaseline();
    case ProjectPackage.TASK_STREAM__TARGETS:
      return getTargets();
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
    case ProjectPackage.TASK_STREAM__PARENT:
      setParent((IntegrationStream)newValue);
      return;
    case ProjectPackage.TASK_STREAM__BASELINE:
      setBaseline((Date)newValue);
      return;
    case ProjectPackage.TASK_STREAM__TARGETS:
      getTargets().clear();
      getTargets().addAll((Collection<? extends Target>)newValue);
      return;
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
    case ProjectPackage.TASK_STREAM__PARENT:
      setParent((IntegrationStream)null);
      return;
    case ProjectPackage.TASK_STREAM__BASELINE:
      setBaseline(BASELINE_EDEFAULT);
      return;
    case ProjectPackage.TASK_STREAM__TARGETS:
      getTargets().clear();
      return;
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
    case ProjectPackage.TASK_STREAM__PARENT:
      return parent != null;
    case ProjectPackage.TASK_STREAM__BASELINE:
      return BASELINE_EDEFAULT == null ? baseline != null : !BASELINE_EDEFAULT.equals(baseline);
    case ProjectPackage.TASK_STREAM__TARGETS:
      return targets != null && !targets.isEmpty();
    case ProjectPackage.TASK_STREAM__DELIVERIES:
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
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (baseline: "); //$NON-NLS-1$
    result.append(baseline);
    result.append(')');
    return result.toString();
  }

} // TaskStreamImpl
