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
 * $Id: RepositoryImpl.java,v 1.1 2008-08-06 07:07:26 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.Committer;
import org.eclipse.net4j.pop.project.MainBranch;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.PrimaryModule;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Repository;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getPrimaryModule <em>Primary Module</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getCommitters <em>Committers</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryImpl#getMainBranch <em>Main Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends PopElementImpl implements Repository
{
  /**
   * The cached value of the '{@link #getPopProject() <em>Pop Project</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPopProject()
   * @generated
   * @ordered
   */
  protected PopProject popProject;

  /**
   * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAdapter()
   * @generated
   * @ordered
   */
  protected static final IRepositoryAdapter ADAPTER_EDEFAULT = null;

  /**
   * The default value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected String adapterType = ADAPTER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrimaryModule() <em>Primary Module</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPrimaryModule()
   * @generated
   * @ordered
   */
  protected PrimaryModule primaryModule;

  /**
   * The cached value of the '{@link #getCommitters() <em>Committers</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCommitters()
   * @generated
   * @ordered
   */
  protected EList<Committer> committers;

  /**
   * The cached value of the '{@link #getMainBranch() <em>Main Branch</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMainBranch()
   * @generated
   * @ordered
   */
  protected MainBranch mainBranch;

  /**
   * @ADDED
   */
  private IRepositoryAdapter adapter;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProjectPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopProject getPopProject()
  {
    if (popProject != null && popProject.eIsProxy())
    {
      InternalEObject oldPopProject = (InternalEObject)popProject;
      popProject = (PopProject)eResolveProxy(oldPopProject);
      if (popProject != oldPopProject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.REPOSITORY__POP_PROJECT,
              oldPopProject, popProject));
      }
    }
    return popProject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    return popProject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPopProject(PopProject newPopProject)
  {
    PopProject oldPopProject = popProject;
    popProject = newPopProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY__POP_PROJECT, oldPopProject,
          popProject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public synchronized IRepositoryAdapter getAdapter()
  {
    if (adapter == null)
    {
      adapter = IRepositoryAdapter.Registry.INSTANCE.get(adapterType);
      if (adapter == null)
      {
        throw new IllegalStateException("Unrecognized repository adapter type");
      }
    }

    return adapter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getAdapterType()
  {
    return adapterType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void setAdapterType(String newAdapterType)
  {
    String oldAdapterType = null;
    synchronized (this)
    {
      oldAdapterType = adapterType;
      adapterType = newAdapterType;
      adapter = null;
    }

    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY__ADAPTER_TYPE, oldAdapterType,
          adapterType));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY__DESCRIPTION, oldDescription,
          description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        NotificationChain msgs = oldPrimaryModule.eInverseRemove(this, ProjectPackage.PRIMARY_MODULE__REPOSITORY,
            PrimaryModule.class, null);
        if (newPrimaryModule.eInternalContainer() == null)
        {
          msgs = newPrimaryModule.eInverseAdd(this, ProjectPackage.PRIMARY_MODULE__REPOSITORY, PrimaryModule.class,
              msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.REPOSITORY__PRIMARY_MODULE,
              oldPrimaryModule, primaryModule));
      }
    }
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrimaryModule basicGetPrimaryModule()
  {
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryModule(PrimaryModule newPrimaryModule, NotificationChain msgs)
  {
    PrimaryModule oldPrimaryModule = primaryModule;
    primaryModule = newPrimaryModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.REPOSITORY__PRIMARY_MODULE, oldPrimaryModule, newPrimaryModule);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryModule(PrimaryModule newPrimaryModule)
  {
    if (newPrimaryModule != primaryModule)
    {
      NotificationChain msgs = null;
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, ProjectPackage.PRIMARY_MODULE__REPOSITORY,
            PrimaryModule.class, msgs);
      if (newPrimaryModule != null)
        msgs = ((InternalEObject)newPrimaryModule).eInverseAdd(this, ProjectPackage.PRIMARY_MODULE__REPOSITORY,
            PrimaryModule.class, msgs);
      msgs = basicSetPrimaryModule(newPrimaryModule, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY__PRIMARY_MODULE,
          newPrimaryModule, newPrimaryModule));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Committer> getCommitters()
  {
    if (committers == null)
    {
      committers = new EObjectContainmentWithInverseEList.Resolving<Committer>(Committer.class, this,
          ProjectPackage.REPOSITORY__COMMITTERS, ProjectPackage.COMMITTER__REPOSITORY);
    }
    return committers;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MainBranch getMainBranch()
  {
    if (mainBranch != null && mainBranch.eIsProxy())
    {
      InternalEObject oldMainBranch = (InternalEObject)mainBranch;
      mainBranch = (MainBranch)eResolveProxy(oldMainBranch);
      if (mainBranch != oldMainBranch)
      {
        InternalEObject newMainBranch = (InternalEObject)mainBranch;
        NotificationChain msgs = oldMainBranch.eInverseRemove(this, ProjectPackage.MAIN_BRANCH__REPOSITORY,
            MainBranch.class, null);
        if (newMainBranch.eInternalContainer() == null)
        {
          msgs = newMainBranch.eInverseAdd(this, ProjectPackage.MAIN_BRANCH__REPOSITORY, MainBranch.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.REPOSITORY__MAIN_BRANCH,
              oldMainBranch, mainBranch));
      }
    }
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MainBranch basicGetMainBranch()
  {
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainBranch(MainBranch newMainBranch, NotificationChain msgs)
  {
    MainBranch oldMainBranch = mainBranch;
    mainBranch = newMainBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.REPOSITORY__MAIN_BRANCH, oldMainBranch, newMainBranch);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMainBranch(MainBranch newMainBranch)
  {
    if (newMainBranch != mainBranch)
    {
      NotificationChain msgs = null;
      if (mainBranch != null)
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, ProjectPackage.MAIN_BRANCH__REPOSITORY,
            MainBranch.class, msgs);
      if (newMainBranch != null)
        msgs = ((InternalEObject)newMainBranch).eInverseAdd(this, ProjectPackage.MAIN_BRANCH__REPOSITORY,
            MainBranch.class, msgs);
      msgs = basicSetMainBranch(newMainBranch, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY__MAIN_BRANCH, newMainBranch,
          newMainBranch));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.REPOSITORY__PRIMARY_MODULE, null, msgs);
      return basicSetPrimaryModule((PrimaryModule)otherEnd, msgs);
    case ProjectPackage.REPOSITORY__COMMITTERS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommitters()).basicAdd(otherEnd, msgs);
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      if (mainBranch != null)
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.REPOSITORY__MAIN_BRANCH, null, msgs);
      return basicSetMainBranch((MainBranch)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      return basicSetPrimaryModule(null, msgs);
    case ProjectPackage.REPOSITORY__COMMITTERS:
      return ((InternalEList<?>)getCommitters()).basicRemove(otherEnd, msgs);
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      return basicSetMainBranch(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__POP_PROJECT:
      if (resolve)
        return getPopProject();
      return basicGetPopProject();
    case ProjectPackage.REPOSITORY__ADAPTER:
      return getAdapter();
    case ProjectPackage.REPOSITORY__ADAPTER_TYPE:
      return getAdapterType();
    case ProjectPackage.REPOSITORY__DESCRIPTION:
      return getDescription();
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      if (resolve)
        return getPrimaryModule();
      return basicGetPrimaryModule();
    case ProjectPackage.REPOSITORY__COMMITTERS:
      return getCommitters();
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      if (resolve)
        return getMainBranch();
      return basicGetMainBranch();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__POP_PROJECT:
      setPopProject((PopProject)newValue);
      return;
    case ProjectPackage.REPOSITORY__ADAPTER_TYPE:
      setAdapterType((String)newValue);
      return;
    case ProjectPackage.REPOSITORY__DESCRIPTION:
      setDescription((String)newValue);
      return;
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      setPrimaryModule((PrimaryModule)newValue);
      return;
    case ProjectPackage.REPOSITORY__COMMITTERS:
      getCommitters().clear();
      getCommitters().addAll((Collection<? extends Committer>)newValue);
      return;
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__POP_PROJECT:
      setPopProject((PopProject)null);
      return;
    case ProjectPackage.REPOSITORY__ADAPTER_TYPE:
      setAdapterType(ADAPTER_TYPE_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY__DESCRIPTION:
      setDescription(DESCRIPTION_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      setPrimaryModule((PrimaryModule)null);
      return;
    case ProjectPackage.REPOSITORY__COMMITTERS:
      getCommitters().clear();
      return;
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY__POP_PROJECT:
      return popProject != null;
    case ProjectPackage.REPOSITORY__ADAPTER:
      return ADAPTER_EDEFAULT == null ? getAdapter() != null : !ADAPTER_EDEFAULT.equals(getAdapter());
    case ProjectPackage.REPOSITORY__ADAPTER_TYPE:
      return ADAPTER_TYPE_EDEFAULT == null ? adapterType != null : !ADAPTER_TYPE_EDEFAULT.equals(adapterType);
    case ProjectPackage.REPOSITORY__DESCRIPTION:
      return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    case ProjectPackage.REPOSITORY__PRIMARY_MODULE:
      return primaryModule != null;
    case ProjectPackage.REPOSITORY__COMMITTERS:
      return committers != null && !committers.isEmpty();
    case ProjectPackage.REPOSITORY__MAIN_BRANCH:
      return mainBranch != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (adapterType: "); //$NON-NLS-1$
    result.append(adapterType);
    result.append(", description: "); //$NON-NLS-1$
    result.append(description);
    result.append(')');
    return result.toString();
  }

} // RepositoryImpl
