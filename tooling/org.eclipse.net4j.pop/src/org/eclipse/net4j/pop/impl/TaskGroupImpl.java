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
 * $Id: TaskGroupImpl.java,v 1.1 2008-08-07 17:42:13 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Developer;
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
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskGroupImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskGroupImpl extends PopElementImpl implements TaskGroup
{
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
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<TaskGroup> children;

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
  public Developer getDeveloper()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__DEVELOPER)
      return null;
    return (Developer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Developer basicGetDeveloper()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__DEVELOPER)
      return null;
    return (Developer)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeveloper(Developer newDeveloper, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newDeveloper, PopPackage.TASK_GROUP__DEVELOPER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeveloper(Developer newDeveloper)
  {
    if (newDeveloper != eInternalContainer()
        || (eContainerFeatureID != PopPackage.TASK_GROUP__DEVELOPER && newDeveloper != null))
    {
      if (EcoreUtil.isAncestor(this, newDeveloper))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newDeveloper != null)
        msgs = ((InternalEObject)newDeveloper).eInverseAdd(this, PopPackage.DEVELOPER__TASK_GROUPS, Developer.class,
            msgs);
      msgs = basicSetDeveloper(newDeveloper, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK_GROUP__DEVELOPER, newDeveloper,
          newDeveloper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskGroup getParent()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__PARENT)
      return null;
    return (TaskGroup)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskGroup basicGetParent()
  {
    if (eContainerFeatureID != PopPackage.TASK_GROUP__PARENT)
      return null;
    return (TaskGroup)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(TaskGroup newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, PopPackage.TASK_GROUP__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(TaskGroup newParent)
  {
    if (newParent != eInternalContainer()
        || (eContainerFeatureID != PopPackage.TASK_GROUP__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, PopPackage.TASK_GROUP__CHILDREN, TaskGroup.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK_GROUP__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskGroup> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentWithInverseEList.Resolving<TaskGroup>(TaskGroup.class, this,
          PopPackage.TASK_GROUP__CHILDREN, PopPackage.TASK_GROUP__PARENT);
    }
    return children;
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
          PopPackage.TASK__TASK_GROUP);
    }
    return tasks;
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
    case PopPackage.TASK_GROUP__DEVELOPER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetDeveloper((Developer)otherEnd, msgs);
    case PopPackage.TASK_GROUP__PARENT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetParent((TaskGroup)otherEnd, msgs);
    case PopPackage.TASK_GROUP__CHILDREN:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
    case PopPackage.TASK_GROUP__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
    case PopPackage.TASK_GROUP__DEVELOPER:
      return basicSetDeveloper(null, msgs);
    case PopPackage.TASK_GROUP__PARENT:
      return basicSetParent(null, msgs);
    case PopPackage.TASK_GROUP__CHILDREN:
      return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
    case PopPackage.TASK_GROUP__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
    case PopPackage.TASK_GROUP__DEVELOPER:
      return eInternalContainer().eInverseRemove(this, PopPackage.DEVELOPER__TASK_GROUPS, Developer.class, msgs);
    case PopPackage.TASK_GROUP__PARENT:
      return eInternalContainer().eInverseRemove(this, PopPackage.TASK_GROUP__CHILDREN, TaskGroup.class, msgs);
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
    case PopPackage.TASK_GROUP__NAME:
      return getName();
    case PopPackage.TASK_GROUP__DEVELOPER:
      if (resolve)
        return getDeveloper();
      return basicGetDeveloper();
    case PopPackage.TASK_GROUP__PARENT:
      if (resolve)
        return getParent();
      return basicGetParent();
    case PopPackage.TASK_GROUP__CHILDREN:
      return getChildren();
    case PopPackage.TASK_GROUP__TASKS:
      return getTasks();
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
    case PopPackage.TASK_GROUP__NAME:
      setName((String)newValue);
      return;
    case PopPackage.TASK_GROUP__DEVELOPER:
      setDeveloper((Developer)newValue);
      return;
    case PopPackage.TASK_GROUP__PARENT:
      setParent((TaskGroup)newValue);
      return;
    case PopPackage.TASK_GROUP__CHILDREN:
      getChildren().clear();
      getChildren().addAll((Collection<? extends TaskGroup>)newValue);
      return;
    case PopPackage.TASK_GROUP__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
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
    case PopPackage.TASK_GROUP__NAME:
      setName(NAME_EDEFAULT);
      return;
    case PopPackage.TASK_GROUP__DEVELOPER:
      setDeveloper((Developer)null);
      return;
    case PopPackage.TASK_GROUP__PARENT:
      setParent((TaskGroup)null);
      return;
    case PopPackage.TASK_GROUP__CHILDREN:
      getChildren().clear();
      return;
    case PopPackage.TASK_GROUP__TASKS:
      getTasks().clear();
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
    case PopPackage.TASK_GROUP__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case PopPackage.TASK_GROUP__DEVELOPER:
      return basicGetDeveloper() != null;
    case PopPackage.TASK_GROUP__PARENT:
      return basicGetParent() != null;
    case PopPackage.TASK_GROUP__CHILDREN:
      return children != null && !children.isEmpty();
    case PopPackage.TASK_GROUP__TASKS:
      return tasks != null && !tasks.isEmpty();
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
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TaskGroupImpl
