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
 * $Id: TaskGroupImpl.java,v 1.2 2008-08-08 09:24:33 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getAssignee <em>Assignee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskGroupImpl extends PopElementImpl implements TaskGroup
{
  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskGroups()
   * @generated
   * @ordered
   */
  protected EList<TaskGroup> taskGroups;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskGroupImpl()
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
    return PopPackage.Literals.TASK_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignee getAssignee()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__ASSIGNEE)
      return null;
    return (Assignee)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignee basicGetAssignee()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__ASSIGNEE)
      return null;
    return (Assignee)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignee(Assignee newAssignee, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newAssignee, PopPackage.TASK_GROUP__ASSIGNEE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignee(Assignee newAssignee)
  {
    if (newAssignee != eInternalContainer()
        || (eContainerFeatureID != PopPackage.TASK_GROUP__ASSIGNEE && newAssignee != null))
    {
      if (EcoreUtil.isAncestor(this, newAssignee))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAssignee != null)
        msgs = ((InternalEObject)newAssignee).eInverseAdd(this, PopPackage.ASSIGNEE__TASK_GROUPS, Assignee.class, msgs);
      msgs = basicSetAssignee(newAssignee, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK_GROUP__ASSIGNEE, newAssignee, newAssignee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentWithInverseEList.Resolving<Task>(Task.class, this, PopPackage.TASK_GROUP__TASKS,
          PopPackage.TASK__ASSIGNEE);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskGroup> getTaskGroups()
  {
    if (taskGroups == null)
    {
      taskGroups = new EObjectContainmentWithInverseEList.Resolving<TaskGroup>(TaskGroup.class, this,
          PopPackage.TASK_GROUP__TASK_GROUPS, PopPackage.TASK_GROUP__ASSIGNEE);
    }
    return taskGroups;
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
    case PopPackage.TASK_GROUP__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskGroups()).basicAdd(otherEnd, msgs);
    case PopPackage.TASK_GROUP__ASSIGNEE:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetAssignee((Assignee)otherEnd, msgs);
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
    case PopPackage.TASK_GROUP__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      return ((InternalEList<?>)getTaskGroups()).basicRemove(otherEnd, msgs);
    case PopPackage.TASK_GROUP__ASSIGNEE:
      return basicSetAssignee(null, msgs);
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
    case PopPackage.TASK_GROUP__ASSIGNEE:
      return eInternalContainer().eInverseRemove(this, PopPackage.ASSIGNEE__TASK_GROUPS, Assignee.class, msgs);
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
    case PopPackage.TASK_GROUP__TASKS:
      return getTasks();
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      return getTaskGroups();
    case PopPackage.TASK_GROUP__NAME:
      return getName();
    case PopPackage.TASK_GROUP__ASSIGNEE:
      if (resolve)
        return getAssignee();
      return basicGetAssignee();
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
    case PopPackage.TASK_GROUP__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
      return;
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      getTaskGroups().clear();
      getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
      return;
    case PopPackage.TASK_GROUP__NAME:
      setName((String)newValue);
      return;
    case PopPackage.TASK_GROUP__ASSIGNEE:
      setAssignee((Assignee)newValue);
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
    case PopPackage.TASK_GROUP__TASKS:
      getTasks().clear();
      return;
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      getTaskGroups().clear();
      return;
    case PopPackage.TASK_GROUP__NAME:
      setName(NAME_EDEFAULT);
      return;
    case PopPackage.TASK_GROUP__ASSIGNEE:
      setAssignee((Assignee)null);
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
    case PopPackage.TASK_GROUP__TASKS:
      return tasks != null && !tasks.isEmpty();
    case PopPackage.TASK_GROUP__TASK_GROUPS:
      return taskGroups != null && !taskGroups.isEmpty();
    case PopPackage.TASK_GROUP__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case PopPackage.TASK_GROUP__ASSIGNEE:
      return basicGetAssignee() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Assignee.class)
    {
      switch (derivedFeatureID)
      {
      case PopPackage.TASK_GROUP__TASKS:
        return PopPackage.ASSIGNEE__TASKS;
      case PopPackage.TASK_GROUP__TASK_GROUPS:
        return PopPackage.ASSIGNEE__TASK_GROUPS;
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Assignee.class)
    {
      switch (baseFeatureID)
      {
      case PopPackage.ASSIGNEE__TASKS:
        return PopPackage.TASK_GROUP__TASKS;
      case PopPackage.ASSIGNEE__TASK_GROUPS:
        return PopPackage.TASK_GROUP__TASK_GROUPS;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TaskGroupImpl
