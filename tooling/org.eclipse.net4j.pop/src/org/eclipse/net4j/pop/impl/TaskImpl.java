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
 * $Id: TaskImpl.java,v 1.1 2008-08-07 17:42:13 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Developer;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Target;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskImpl#getMylynId <em>Mylyn Id</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskImpl#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskImpl#getTaskGroup <em>Task Group</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends PopElementImpl implements Task
{
  /**
   * The default value of the '{@link #getMylynId() <em>Mylyn Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMylynId()
   * @generated
   * @ordered
   */
  protected static final String MYLYN_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMylynId() <em>Mylyn Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMylynId()
   * @generated
   * @ordered
   */
  protected String mylynId = MYLYN_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<Target> targets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return PopPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMylynId()
  {
    return mylynId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMylynId(String newMylynId)
  {
    String oldMylynId = mylynId;
    mylynId = newMylynId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK__MYLYN_ID, oldMylynId, mylynId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Developer getDeveloper()
  {
    if (eContainerFeatureID != PopPackage.TASK__DEVELOPER)
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
    if (eContainerFeatureID != PopPackage.TASK__DEVELOPER)
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
    msgs = eBasicSetContainer((InternalEObject)newDeveloper, PopPackage.TASK__DEVELOPER, msgs);
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
        || (eContainerFeatureID != PopPackage.TASK__DEVELOPER && newDeveloper != null))
    {
      if (EcoreUtil.isAncestor(this, newDeveloper))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newDeveloper != null)
        msgs = ((InternalEObject)newDeveloper).eInverseAdd(this, PopPackage.DEVELOPER__TASKS, Developer.class, msgs);
      msgs = basicSetDeveloper(newDeveloper, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK__DEVELOPER, newDeveloper, newDeveloper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskGroup getTaskGroup()
  {
    if (eContainerFeatureID != PopPackage.TASK__TASK_GROUP)
      return null;
    return (TaskGroup)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskGroup basicGetTaskGroup()
  {
    if (eContainerFeatureID != PopPackage.TASK__TASK_GROUP)
      return null;
    return (TaskGroup)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskGroup(TaskGroup newTaskGroup, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTaskGroup, PopPackage.TASK__TASK_GROUP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskGroup(TaskGroup newTaskGroup)
  {
    if (newTaskGroup != eInternalContainer()
        || (eContainerFeatureID != PopPackage.TASK__TASK_GROUP && newTaskGroup != null))
    {
      if (EcoreUtil.isAncestor(this, newTaskGroup))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTaskGroup != null)
        msgs = ((InternalEObject)newTaskGroup).eInverseAdd(this, PopPackage.TASK_GROUP__TASKS, TaskGroup.class, msgs);
      msgs = basicSetTaskGroup(newTaskGroup, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK__TASK_GROUP, newTaskGroup, newTaskGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Target> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectWithInverseResolvingEList.ManyInverse<Target>(Target.class, this, PopPackage.TASK__TARGETS,
          PopPackage.TARGET__TASKS);
    }
    return targets;
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
    case PopPackage.TASK__DEVELOPER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetDeveloper((Developer)otherEnd, msgs);
    case PopPackage.TASK__TASK_GROUP:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetTaskGroup((TaskGroup)otherEnd, msgs);
    case PopPackage.TASK__TARGETS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
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
    case PopPackage.TASK__DEVELOPER:
      return basicSetDeveloper(null, msgs);
    case PopPackage.TASK__TASK_GROUP:
      return basicSetTaskGroup(null, msgs);
    case PopPackage.TASK__TARGETS:
      return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
    case PopPackage.TASK__DEVELOPER:
      return eInternalContainer().eInverseRemove(this, PopPackage.DEVELOPER__TASKS, Developer.class, msgs);
    case PopPackage.TASK__TASK_GROUP:
      return eInternalContainer().eInverseRemove(this, PopPackage.TASK_GROUP__TASKS, TaskGroup.class, msgs);
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
    case PopPackage.TASK__MYLYN_ID:
      return getMylynId();
    case PopPackage.TASK__DEVELOPER:
      if (resolve)
        return getDeveloper();
      return basicGetDeveloper();
    case PopPackage.TASK__TASK_GROUP:
      if (resolve)
        return getTaskGroup();
      return basicGetTaskGroup();
    case PopPackage.TASK__TARGETS:
      return getTargets();
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
    case PopPackage.TASK__MYLYN_ID:
      setMylynId((String)newValue);
      return;
    case PopPackage.TASK__DEVELOPER:
      setDeveloper((Developer)newValue);
      return;
    case PopPackage.TASK__TASK_GROUP:
      setTaskGroup((TaskGroup)newValue);
      return;
    case PopPackage.TASK__TARGETS:
      getTargets().clear();
      getTargets().addAll((Collection<? extends Target>)newValue);
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
    case PopPackage.TASK__MYLYN_ID:
      setMylynId(MYLYN_ID_EDEFAULT);
      return;
    case PopPackage.TASK__DEVELOPER:
      setDeveloper((Developer)null);
      return;
    case PopPackage.TASK__TASK_GROUP:
      setTaskGroup((TaskGroup)null);
      return;
    case PopPackage.TASK__TARGETS:
      getTargets().clear();
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
    case PopPackage.TASK__MYLYN_ID:
      return MYLYN_ID_EDEFAULT == null ? mylynId != null : !MYLYN_ID_EDEFAULT.equals(mylynId);
    case PopPackage.TASK__DEVELOPER:
      return basicGetDeveloper() != null;
    case PopPackage.TASK__TASK_GROUP:
      return basicGetTaskGroup() != null;
    case PopPackage.TASK__TARGETS:
      return targets != null && !targets.isEmpty();
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
    result.append(" (mylynId: "); //$NON-NLS-1$
    result.append(mylynId);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
