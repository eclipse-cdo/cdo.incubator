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
 * $Id: PopImpl.java,v 1.3 2008-08-09 09:26:22 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.CheckoutManager;
import org.eclipse.net4j.pop.Developer;
import org.eclipse.net4j.pop.DevelopmentStream;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.PrimaryModule;
import org.eclipse.net4j.pop.Repository;
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
 * An implementation of the model object '<em><b>Pop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getPopManager <em>Pop Manager</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getRootStream <em>Root Stream</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getPrimaryModule <em>Primary Module</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopImpl#getCheckoutManager <em>Checkout Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopImpl extends PopElementImpl implements Pop
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
   * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActive()
   * @generated
   * @ordered
   */
  protected static final boolean ACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #getDevelopers() <em>Developers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevelopers()
   * @generated
   * @ordered
   */
  protected EList<Developer> developers;

  /**
   * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
  protected Repository repository;

  /**
   * The cached value of the '{@link #getRootStream() <em>Root Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootStream()
   * @generated
   * @ordered
   */
  protected DevelopmentStream rootStream;

  /**
   * The cached value of the '{@link #getPrimaryModule() <em>Primary Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryModule()
   * @generated
   * @ordered
   */
  protected PrimaryModule primaryModule;

  /**
   * The cached value of the '{@link #getCheckoutManager() <em>Checkout Manager</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckoutManager()
   * @generated
   * @ordered
   */
  protected CheckoutManager checkoutManager;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PopImpl()
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
    return PopPackage.Literals.POP;
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
      tasks = new EObjectContainmentWithInverseEList.Resolving<Task>(Task.class, this, PopPackage.POP__TASKS,
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
          PopPackage.POP__TASK_GROUPS, PopPackage.TASK_GROUP__ASSIGNEE);
    }
    return taskGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopManager getPopManager()
  {
    if (eContainerFeatureID != PopPackage.POP__POP_MANAGER)
      return null;
    return (PopManager)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopManager basicGetPopManager()
  {
    if (eContainerFeatureID != PopPackage.POP__POP_MANAGER)
      return null;
    return (PopManager)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopManager(PopManager newPopManager, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPopManager, PopPackage.POP__POP_MANAGER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopManager(PopManager newPopManager)
  {
    if (newPopManager != eInternalContainer()
        || (eContainerFeatureID != PopPackage.POP__POP_MANAGER && newPopManager != null))
    {
      if (EcoreUtil.isAncestor(this, newPopManager))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPopManager != null)
        msgs = ((InternalEObject)newPopManager).eInverseAdd(this, PopPackage.POP_MANAGER__POPS, PopManager.class, msgs);
      msgs = basicSetPopManager(newPopManager, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__POP_MANAGER, newPopManager, newPopManager));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isActive()
  {
    // TODO: implement this method to return the 'Active' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Developer> getDevelopers()
  {
    if (developers == null)
    {
      developers = new EObjectContainmentWithInverseEList.Resolving<Developer>(Developer.class, this,
          PopPackage.POP__DEVELOPERS, PopPackage.DEVELOPER__POP);
    }
    return developers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository getRepository()
  {
    if (repository != null && repository.eIsProxy())
    {
      InternalEObject oldRepository = (InternalEObject)repository;
      repository = (Repository)eResolveProxy(oldRepository);
      if (repository != oldRepository)
      {
        InternalEObject newRepository = (InternalEObject)repository;
        NotificationChain msgs = oldRepository.eInverseRemove(this, PopPackage.REPOSITORY__POP, Repository.class, null);
        if (newRepository.eInternalContainer() == null)
        {
          msgs = newRepository.eInverseAdd(this, PopPackage.REPOSITORY__POP, Repository.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.POP__REPOSITORY, oldRepository,
              repository));
      }
    }
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository basicGetRepository()
  {
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs)
  {
    Repository oldRepository = repository;
    repository = newRepository;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.POP__REPOSITORY,
          oldRepository, newRepository);
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
  public void setRepository(Repository newRepository)
  {
    if (newRepository != repository)
    {
      NotificationChain msgs = null;
      if (repository != null)
        msgs = ((InternalEObject)repository).eInverseRemove(this, PopPackage.REPOSITORY__POP, Repository.class, msgs);
      if (newRepository != null)
        msgs = ((InternalEObject)newRepository).eInverseAdd(this, PopPackage.REPOSITORY__POP, Repository.class, msgs);
      msgs = basicSetRepository(newRepository, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__REPOSITORY, newRepository, newRepository));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentStream getRootStream()
  {
    if (rootStream != null && rootStream.eIsProxy())
    {
      InternalEObject oldRootStream = (InternalEObject)rootStream;
      rootStream = (DevelopmentStream)eResolveProxy(oldRootStream);
      if (rootStream != oldRootStream)
      {
        InternalEObject newRootStream = (InternalEObject)rootStream;
        NotificationChain msgs = oldRootStream.eInverseRemove(this, PopPackage.DEVELOPMENT_STREAM__POP,
            DevelopmentStream.class, null);
        if (newRootStream.eInternalContainer() == null)
        {
          msgs = newRootStream.eInverseAdd(this, PopPackage.DEVELOPMENT_STREAM__POP, DevelopmentStream.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.POP__ROOT_STREAM, oldRootStream,
              rootStream));
      }
    }
    return rootStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentStream basicGetRootStream()
  {
    return rootStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootStream(DevelopmentStream newRootStream, NotificationChain msgs)
  {
    DevelopmentStream oldRootStream = rootStream;
    rootStream = newRootStream;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.POP__ROOT_STREAM,
          oldRootStream, newRootStream);
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
  public void setRootStream(DevelopmentStream newRootStream)
  {
    if (newRootStream != rootStream)
    {
      NotificationChain msgs = null;
      if (rootStream != null)
        msgs = ((InternalEObject)rootStream).eInverseRemove(this, PopPackage.DEVELOPMENT_STREAM__POP,
            DevelopmentStream.class, msgs);
      if (newRootStream != null)
        msgs = ((InternalEObject)newRootStream).eInverseAdd(this, PopPackage.DEVELOPMENT_STREAM__POP,
            DevelopmentStream.class, msgs);
      msgs = basicSetRootStream(newRootStream, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__ROOT_STREAM, newRootStream, newRootStream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryModule getPrimaryModule()
  {
    if (primaryModule != null && primaryModule.eIsProxy())
    {
      InternalEObject oldPrimaryModule = (InternalEObject)primaryModule;
      primaryModule = (PrimaryModule)eResolveProxy(oldPrimaryModule);
      if (primaryModule != oldPrimaryModule)
      {
        InternalEObject newPrimaryModule = (InternalEObject)primaryModule;
        NotificationChain msgs = oldPrimaryModule.eInverseRemove(this, PopPackage.PRIMARY_MODULE__POP,
            PrimaryModule.class, null);
        if (newPrimaryModule.eInternalContainer() == null)
        {
          msgs = newPrimaryModule.eInverseAdd(this, PopPackage.PRIMARY_MODULE__POP, PrimaryModule.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.POP__PRIMARY_MODULE, oldPrimaryModule,
              primaryModule));
      }
    }
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryModule basicGetPrimaryModule()
  {
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryModule(PrimaryModule newPrimaryModule, NotificationChain msgs)
  {
    PrimaryModule oldPrimaryModule = primaryModule;
    primaryModule = newPrimaryModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.POP__PRIMARY_MODULE,
          oldPrimaryModule, newPrimaryModule);
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
  public void setPrimaryModule(PrimaryModule newPrimaryModule)
  {
    if (newPrimaryModule != primaryModule)
    {
      NotificationChain msgs = null;
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, PopPackage.PRIMARY_MODULE__POP,
            PrimaryModule.class, msgs);
      if (newPrimaryModule != null)
        msgs = ((InternalEObject)newPrimaryModule).eInverseAdd(this, PopPackage.PRIMARY_MODULE__POP,
            PrimaryModule.class, msgs);
      msgs = basicSetPrimaryModule(newPrimaryModule, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__PRIMARY_MODULE, newPrimaryModule,
          newPrimaryModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutManager getCheckoutManager()
  {
    if (checkoutManager != null && checkoutManager.eIsProxy())
    {
      InternalEObject oldCheckoutManager = (InternalEObject)checkoutManager;
      checkoutManager = (CheckoutManager)eResolveProxy(oldCheckoutManager);
      if (checkoutManager != oldCheckoutManager)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.POP__CHECKOUT_MANAGER,
              oldCheckoutManager, checkoutManager));
      }
    }
    return checkoutManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutManager basicGetCheckoutManager()
  {
    return checkoutManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckoutManager(CheckoutManager newCheckoutManager, NotificationChain msgs)
  {
    CheckoutManager oldCheckoutManager = checkoutManager;
    checkoutManager = newCheckoutManager;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PopPackage.POP__CHECKOUT_MANAGER,
          oldCheckoutManager, newCheckoutManager);
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
  public void setCheckoutManager(CheckoutManager newCheckoutManager)
  {
    if (newCheckoutManager != checkoutManager)
    {
      NotificationChain msgs = null;
      if (checkoutManager != null)
        msgs = ((InternalEObject)checkoutManager).eInverseRemove(this, PopPackage.CHECKOUT_MANAGER__POP,
            CheckoutManager.class, msgs);
      if (newCheckoutManager != null)
        msgs = ((InternalEObject)newCheckoutManager).eInverseAdd(this, PopPackage.CHECKOUT_MANAGER__POP,
            CheckoutManager.class, msgs);
      msgs = basicSetCheckoutManager(newCheckoutManager, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.POP__CHECKOUT_MANAGER, newCheckoutManager,
          newCheckoutManager));
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
    case PopPackage.POP__TASKS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
    case PopPackage.POP__TASK_GROUPS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskGroups()).basicAdd(otherEnd, msgs);
    case PopPackage.POP__POP_MANAGER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetPopManager((PopManager)otherEnd, msgs);
    case PopPackage.POP__DEVELOPERS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevelopers()).basicAdd(otherEnd, msgs);
    case PopPackage.POP__REPOSITORY:
      if (repository != null)
        msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PopPackage.POP__REPOSITORY,
            null, msgs);
      return basicSetRepository((Repository)otherEnd, msgs);
    case PopPackage.POP__ROOT_STREAM:
      if (rootStream != null)
        msgs = ((InternalEObject)rootStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PopPackage.POP__ROOT_STREAM,
            null, msgs);
      return basicSetRootStream((DevelopmentStream)otherEnd, msgs);
    case PopPackage.POP__PRIMARY_MODULE:
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - PopPackage.POP__PRIMARY_MODULE, null, msgs);
      return basicSetPrimaryModule((PrimaryModule)otherEnd, msgs);
    case PopPackage.POP__CHECKOUT_MANAGER:
      if (checkoutManager != null)
        msgs = ((InternalEObject)checkoutManager).eInverseRemove(this, PopPackage.CHECKOUT_MANAGER__POP,
            CheckoutManager.class, msgs);
      return basicSetCheckoutManager((CheckoutManager)otherEnd, msgs);
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
    case PopPackage.POP__TASKS:
      return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
    case PopPackage.POP__TASK_GROUPS:
      return ((InternalEList<?>)getTaskGroups()).basicRemove(otherEnd, msgs);
    case PopPackage.POP__POP_MANAGER:
      return basicSetPopManager(null, msgs);
    case PopPackage.POP__DEVELOPERS:
      return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
    case PopPackage.POP__REPOSITORY:
      return basicSetRepository(null, msgs);
    case PopPackage.POP__ROOT_STREAM:
      return basicSetRootStream(null, msgs);
    case PopPackage.POP__PRIMARY_MODULE:
      return basicSetPrimaryModule(null, msgs);
    case PopPackage.POP__CHECKOUT_MANAGER:
      return basicSetCheckoutManager(null, msgs);
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
    case PopPackage.POP__POP_MANAGER:
      return eInternalContainer().eInverseRemove(this, PopPackage.POP_MANAGER__POPS, PopManager.class, msgs);
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
    case PopPackage.POP__TASKS:
      return getTasks();
    case PopPackage.POP__TASK_GROUPS:
      return getTaskGroups();
    case PopPackage.POP__POP_MANAGER:
      if (resolve)
        return getPopManager();
      return basicGetPopManager();
    case PopPackage.POP__NAME:
      return getName();
    case PopPackage.POP__ACTIVE:
      return isActive() ? Boolean.TRUE : Boolean.FALSE;
    case PopPackage.POP__DEVELOPERS:
      return getDevelopers();
    case PopPackage.POP__REPOSITORY:
      if (resolve)
        return getRepository();
      return basicGetRepository();
    case PopPackage.POP__ROOT_STREAM:
      if (resolve)
        return getRootStream();
      return basicGetRootStream();
    case PopPackage.POP__PRIMARY_MODULE:
      if (resolve)
        return getPrimaryModule();
      return basicGetPrimaryModule();
    case PopPackage.POP__CHECKOUT_MANAGER:
      if (resolve)
        return getCheckoutManager();
      return basicGetCheckoutManager();
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
    case PopPackage.POP__TASKS:
      getTasks().clear();
      getTasks().addAll((Collection<? extends Task>)newValue);
      return;
    case PopPackage.POP__TASK_GROUPS:
      getTaskGroups().clear();
      getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
      return;
    case PopPackage.POP__POP_MANAGER:
      setPopManager((PopManager)newValue);
      return;
    case PopPackage.POP__NAME:
      setName((String)newValue);
      return;
    case PopPackage.POP__DEVELOPERS:
      getDevelopers().clear();
      getDevelopers().addAll((Collection<? extends Developer>)newValue);
      return;
    case PopPackage.POP__REPOSITORY:
      setRepository((Repository)newValue);
      return;
    case PopPackage.POP__ROOT_STREAM:
      setRootStream((DevelopmentStream)newValue);
      return;
    case PopPackage.POP__PRIMARY_MODULE:
      setPrimaryModule((PrimaryModule)newValue);
      return;
    case PopPackage.POP__CHECKOUT_MANAGER:
      setCheckoutManager((CheckoutManager)newValue);
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
    case PopPackage.POP__TASKS:
      getTasks().clear();
      return;
    case PopPackage.POP__TASK_GROUPS:
      getTaskGroups().clear();
      return;
    case PopPackage.POP__POP_MANAGER:
      setPopManager((PopManager)null);
      return;
    case PopPackage.POP__NAME:
      setName(NAME_EDEFAULT);
      return;
    case PopPackage.POP__DEVELOPERS:
      getDevelopers().clear();
      return;
    case PopPackage.POP__REPOSITORY:
      setRepository((Repository)null);
      return;
    case PopPackage.POP__ROOT_STREAM:
      setRootStream((DevelopmentStream)null);
      return;
    case PopPackage.POP__PRIMARY_MODULE:
      setPrimaryModule((PrimaryModule)null);
      return;
    case PopPackage.POP__CHECKOUT_MANAGER:
      setCheckoutManager((CheckoutManager)null);
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
    case PopPackage.POP__TASKS:
      return tasks != null && !tasks.isEmpty();
    case PopPackage.POP__TASK_GROUPS:
      return taskGroups != null && !taskGroups.isEmpty();
    case PopPackage.POP__POP_MANAGER:
      return basicGetPopManager() != null;
    case PopPackage.POP__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case PopPackage.POP__ACTIVE:
      return isActive() != ACTIVE_EDEFAULT;
    case PopPackage.POP__DEVELOPERS:
      return developers != null && !developers.isEmpty();
    case PopPackage.POP__REPOSITORY:
      return repository != null;
    case PopPackage.POP__ROOT_STREAM:
      return rootStream != null;
    case PopPackage.POP__PRIMARY_MODULE:
      return primaryModule != null;
    case PopPackage.POP__CHECKOUT_MANAGER:
      return checkoutManager != null;
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
      case PopPackage.POP__TASKS:
        return PopPackage.ASSIGNEE__TASKS;
      case PopPackage.POP__TASK_GROUPS:
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
        return PopPackage.POP__TASKS;
      case PopPackage.ASSIGNEE__TASK_GROUPS:
        return PopPackage.POP__TASK_GROUPS;
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

} //PopImpl
