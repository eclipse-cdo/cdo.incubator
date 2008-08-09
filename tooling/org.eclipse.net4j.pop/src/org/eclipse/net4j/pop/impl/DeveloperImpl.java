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
 * $Id: DeveloperImpl.java,v 1.4 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.Developer;
import org.eclipse.net4j.pop.Pop;
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
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Developer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getTasks <em>Tasks</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getTaskGroups <em>Task Groups</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getPop <em>Pop</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getRepositoryUser <em>Repository User</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getEmail <em>Email</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getEntry <em>Entry</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#getExit <em>Exit</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.DeveloperImpl#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DeveloperImpl extends PopElementImpl implements Developer
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
   * The default value of the '{@link #getRepositoryUser() <em>Repository User</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getRepositoryUser()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryUser() <em>Repository User</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getRepositoryUser()
   * @generated
   * @ordered
   */
  protected String repositoryUser = REPOSITORY_USER_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected String email = EMAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getEntry() <em>Entry</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected static final Date ENTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntry() <em>Entry</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected Date entry = ENTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getExit() <em>Exit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected static final Date EXIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected Date exit = EXIT_EDEFAULT;

  /**
   * The default value of the '{@link #isActive() <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isActive()
   * @generated
   * @ordered
   */
  protected static final boolean ACTIVE_EDEFAULT = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DeveloperImpl()
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
    return PopPackage.Literals.DEVELOPER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop getPop()
  {
    if (eContainerFeatureID != PopPackage.DEVELOPER__POP)
    {
      return null;
    }
    return (Pop)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop basicGetPop()
  {
    if (eContainerFeatureID != PopPackage.DEVELOPER__POP)
    {
      return null;
    }
    return (Pop)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPop(Pop newPop, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPop, PopPackage.DEVELOPER__POP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPop(Pop newPop)
  {
    if (newPop != eInternalContainer() || eContainerFeatureID != PopPackage.DEVELOPER__POP && newPop != null)
    {
      if (EcoreUtil.isAncestor(this, newPop))
      {
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      }
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      if (newPop != null)
      {
        msgs = ((InternalEObject)newPop).eInverseAdd(this, PopPackage.POP__DEVELOPERS, Pop.class, msgs);
      }
      msgs = basicSetPop(newPop, msgs);
      if (msgs != null)
      {
        msgs.dispatch();
      }
    }
    else if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__POP, newPop, newPop));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getRepositoryUser()
  {
    return repositoryUser;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setRepositoryUser(String newRepositoryUser)
  {
    String oldRepositoryUser = repositoryUser;
    repositoryUser = newRepositoryUser;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__REPOSITORY_USER, oldRepositoryUser,
          repositoryUser));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__NAME, oldName, name));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getEmail()
  {
    return email;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setEmail(String newEmail)
  {
    String oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__EMAIL, oldEmail, email));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Date getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setEntry(Date newEntry)
  {
    Date oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__ENTRY, oldEntry, entry));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Date getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setExit(Date newExit)
  {
    Date oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPER__EXIT, oldExit, exit));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public boolean isActive()
  {
    return getExit() != null;
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
          PopPackage.DEVELOPER__TASK_GROUPS, PopPackage.TASK_GROUP__ASSIGNEE);
    }
    return taskGroups;
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
      tasks = new EObjectContainmentWithInverseEList.Resolving<Task>(Task.class, this, PopPackage.DEVELOPER__TASKS,
          PopPackage.TASK__ASSIGNEE);
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
    case PopPackage.DEVELOPER__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
    case PopPackage.DEVELOPER__TASK_GROUPS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskGroups()).basicAdd(otherEnd, msgs);
    case PopPackage.DEVELOPER__POP:
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      return basicSetPop((Pop)otherEnd, msgs);
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
    case PopPackage.DEVELOPER__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
    case PopPackage.DEVELOPER__TASK_GROUPS:
      return ((InternalEList<?>)getTaskGroups()).basicRemove(otherEnd, msgs);
    case PopPackage.DEVELOPER__POP:
      return basicSetPop(null, msgs);
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
    case PopPackage.DEVELOPER__POP:
      return eInternalContainer().eInverseRemove(this, PopPackage.POP__DEVELOPERS, Pop.class, msgs);
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
    case PopPackage.DEVELOPER__TASKS:
      return getTasks();
    case PopPackage.DEVELOPER__TASK_GROUPS:
      return getTaskGroups();
    case PopPackage.DEVELOPER__POP:
      if (resolve)
      {
        return getPop();
      }
      return basicGetPop();
    case PopPackage.DEVELOPER__REPOSITORY_USER:
      return getRepositoryUser();
    case PopPackage.DEVELOPER__NAME:
      return getName();
    case PopPackage.DEVELOPER__EMAIL:
      return getEmail();
    case PopPackage.DEVELOPER__ENTRY:
      return getEntry();
    case PopPackage.DEVELOPER__EXIT:
      return getExit();
    case PopPackage.DEVELOPER__ACTIVE:
      return isActive() ? Boolean.TRUE : Boolean.FALSE;
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
    case PopPackage.DEVELOPER__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
      return;
    case PopPackage.DEVELOPER__TASK_GROUPS:
      getTaskGroups().clear();
      getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
      return;
    case PopPackage.DEVELOPER__POP:
      setPop((Pop)newValue);
      return;
    case PopPackage.DEVELOPER__REPOSITORY_USER:
      setRepositoryUser((String)newValue);
      return;
    case PopPackage.DEVELOPER__NAME:
      setName((String)newValue);
      return;
    case PopPackage.DEVELOPER__EMAIL:
      setEmail((String)newValue);
      return;
    case PopPackage.DEVELOPER__ENTRY:
      setEntry((Date)newValue);
      return;
    case PopPackage.DEVELOPER__EXIT:
      setExit((Date)newValue);
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
    case PopPackage.DEVELOPER__TASKS:
      getTasks().clear();
      return;
    case PopPackage.DEVELOPER__TASK_GROUPS:
      getTaskGroups().clear();
      return;
    case PopPackage.DEVELOPER__POP:
      setPop((Pop)null);
      return;
    case PopPackage.DEVELOPER__REPOSITORY_USER:
      setRepositoryUser(REPOSITORY_USER_EDEFAULT);
      return;
    case PopPackage.DEVELOPER__NAME:
      setName(NAME_EDEFAULT);
      return;
    case PopPackage.DEVELOPER__EMAIL:
      setEmail(EMAIL_EDEFAULT);
      return;
    case PopPackage.DEVELOPER__ENTRY:
      setEntry(ENTRY_EDEFAULT);
      return;
    case PopPackage.DEVELOPER__EXIT:
      setExit(EXIT_EDEFAULT);
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
    case PopPackage.DEVELOPER__TASKS:
      return tasks != null && !tasks.isEmpty();
    case PopPackage.DEVELOPER__TASK_GROUPS:
      return taskGroups != null && !taskGroups.isEmpty();
    case PopPackage.DEVELOPER__POP:
      return basicGetPop() != null;
    case PopPackage.DEVELOPER__REPOSITORY_USER:
      return REPOSITORY_USER_EDEFAULT == null ? repositoryUser != null : !REPOSITORY_USER_EDEFAULT
          .equals(repositoryUser);
    case PopPackage.DEVELOPER__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case PopPackage.DEVELOPER__EMAIL:
      return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
    case PopPackage.DEVELOPER__ENTRY:
      return ENTRY_EDEFAULT == null ? entry != null : !ENTRY_EDEFAULT.equals(entry);
    case PopPackage.DEVELOPER__EXIT:
      return EXIT_EDEFAULT == null ? exit != null : !EXIT_EDEFAULT.equals(exit);
    case PopPackage.DEVELOPER__ACTIVE:
      return isActive() != ACTIVE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Assignee.class)
    {
      switch (derivedFeatureID)
      {
      case PopPackage.DEVELOPER__TASKS:
        return PopPackage.ASSIGNEE__TASKS;
      case PopPackage.DEVELOPER__TASK_GROUPS:
        return PopPackage.ASSIGNEE__TASK_GROUPS;
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
        return PopPackage.DEVELOPER__TASKS;
      case PopPackage.ASSIGNEE__TASK_GROUPS:
        return PopPackage.DEVELOPER__TASK_GROUPS;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (repositoryUser: "); //$NON-NLS-1$
    result.append(repositoryUser);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", email: "); //$NON-NLS-1$
    result.append(email);
    result.append(", entry: "); //$NON-NLS-1$
    result.append(entry);
    result.append(", exit: "); //$NON-NLS-1$
    result.append(exit);
    result.append(')');
    return result.toString();
  }

} // DeveloperImpl
