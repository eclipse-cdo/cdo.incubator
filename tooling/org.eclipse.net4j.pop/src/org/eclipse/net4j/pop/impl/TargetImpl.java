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
 * $Id: TargetImpl.java,v 1.2 2008-08-09 09:58:11 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Target;
import org.eclipse.net4j.pop.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Target</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.TargetImpl#getDate <em>Date</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.TargetImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class TargetImpl extends TaggedElementImpl implements Target
{
  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final Date DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date = DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected TargetImpl()
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
    return PopPackage.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDate(Date newDate)
  {
    Date oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TARGET__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, PopPackage.TARGET__TASKS,
          PopPackage.TASK__TARGETS);
    }
    return tasks;
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
    case PopPackage.TARGET__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
    case PopPackage.TARGET__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
    case PopPackage.TARGET__DATE:
      return getDate();
    case PopPackage.TARGET__TASKS:
      return getTasks();
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
    case PopPackage.TARGET__DATE:
      setDate((Date)newValue);
      return;
    case PopPackage.TARGET__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
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
    case PopPackage.TARGET__DATE:
      setDate(DATE_EDEFAULT);
      return;
    case PopPackage.TARGET__TASKS:
      getTasks().clear();
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
    case PopPackage.TARGET__DATE:
      return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
    case PopPackage.TARGET__TASKS:
      return tasks != null && !tasks.isEmpty();
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
    result.append(" (date: "); //$NON-NLS-1$
    result.append(date);
    result.append(')');
    return result.toString();
  }

} // TargetImpl
