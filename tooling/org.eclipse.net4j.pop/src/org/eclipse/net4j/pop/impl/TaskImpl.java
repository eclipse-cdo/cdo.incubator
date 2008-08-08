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
 * $Id: TaskImpl.java,v 1.2 2008-08-08 09:24:33 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
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
 *   <li>{@link org.eclipse.net4j.pop.impl.TaskImpl#getAssignee <em>Assignee</em>}</li>
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
  public Assignee getAssignee()
  {
    if (eContainerFeatureID != PopPackage.TASK__ASSIGNEE)
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
    if (eContainerFeatureID != PopPackage.TASK__ASSIGNEE)
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
    msgs = eBasicSetContainer((InternalEObject)newAssignee, PopPackage.TASK__ASSIGNEE, msgs);
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
        || (eContainerFeatureID != PopPackage.TASK__ASSIGNEE && newAssignee != null))
    {
      if (EcoreUtil.isAncestor(this, newAssignee))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAssignee != null)
        msgs = ((InternalEObject)newAssignee).eInverseAdd(this, PopPackage.ASSIGNEE__TASKS, Assignee.class, msgs);
      msgs = basicSetAssignee(newAssignee, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.TASK__ASSIGNEE, newAssignee, newAssignee));
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
    case PopPackage.TASK__ASSIGNEE:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetAssignee((Assignee)otherEnd, msgs);
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
    case PopPackage.TASK__ASSIGNEE:
      return basicSetAssignee(null, msgs);
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
    case PopPackage.TASK__ASSIGNEE:
      return eInternalContainer().eInverseRemove(this, PopPackage.ASSIGNEE__TASKS, Assignee.class, msgs);
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
    case PopPackage.TASK__ASSIGNEE:
      if (resolve)
        return getAssignee();
      return basicGetAssignee();
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
    case PopPackage.TASK__ASSIGNEE:
      setAssignee((Assignee)newValue);
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
    case PopPackage.TASK__ASSIGNEE:
      setAssignee((Assignee)null);
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
    case PopPackage.TASK__ASSIGNEE:
      return basicGetAssignee() != null;
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
