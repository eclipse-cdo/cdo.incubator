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
 * $Id: AssigneeImpl.java,v 1.2 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Assignee</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.AssigneeImpl#getTasks <em>Tasks</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.AssigneeImpl#getTaskGroups <em>Task Groups</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssigneeImpl extends EObjectImpl implements Assignee
{
  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTaskGroups()
   * @generated
   * @ordered
   */
  protected EList<TaskGroup> taskGroups;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected AssigneeImpl()
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
    return PopPackage.Literals.ASSIGNEE;
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
      tasks = new EObjectContainmentWithInverseEList.Resolving<Task>(Task.class, this, PopPackage.ASSIGNEE__TASKS,
          PopPackage.TASK__ASSIGNEE);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<TaskGroup> getTaskGroups()
  {
    if (taskGroups == null)
    {
      taskGroups = new EObjectContainmentWithInverseEList.Resolving<TaskGroup>(TaskGroup.class, this,
          PopPackage.ASSIGNEE__TASK_GROUPS, PopPackage.TASK_GROUP__ASSIGNEE);
    }
    return taskGroups;
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
    case PopPackage.ASSIGNEE__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskGroups()).basicAdd(otherEnd, msgs);
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
    case PopPackage.ASSIGNEE__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      return ((InternalEList<?>)getTaskGroups()).basicRemove(otherEnd, msgs);
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
    case PopPackage.ASSIGNEE__TASKS:
      return getTasks();
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      return getTaskGroups();
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
    case PopPackage.ASSIGNEE__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
      return;
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      getTaskGroups().clear();
      getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
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
    case PopPackage.ASSIGNEE__TASKS:
      getTasks().clear();
      return;
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      getTaskGroups().clear();
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
    case PopPackage.ASSIGNEE__TASKS:
      return tasks != null && !tasks.isEmpty();
    case PopPackage.ASSIGNEE__TASK_GROUPS:
      return taskGroups != null && !taskGroups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // AssigneeImpl
