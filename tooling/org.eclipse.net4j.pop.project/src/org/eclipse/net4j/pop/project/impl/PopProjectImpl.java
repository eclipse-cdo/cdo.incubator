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
 * $Id: PopProjectImpl.java,v 1.16 2008-08-05 14:48:09 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.Checkout;
import org.eclipse.net4j.pop.project.Committer;
import org.eclipse.net4j.pop.project.MainBranch;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Release;
import org.eclipse.net4j.pop.project.RepositoryModule;
import org.eclipse.net4j.pop.project.RootStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pop Project</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getTeamProvider <em>Team Provider</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getRepositoryUrl <em>Repository Url</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getCommitters <em>Committers</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getPrimaryModule <em>Primary Module</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getMainBranch <em>Main Branch</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getRootStream <em>Root Stream</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getCheckouts <em>Checkouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopProjectImpl extends PopElementImpl implements PopProject
{
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
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTeamProvider() <em>Team Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeamProvider()
   * @generated
   * @ordered
   */
  protected static final String TEAM_PROVIDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTeamProvider() <em>Team Provider</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTeamProvider()
   * @generated
   * @ordered
   */
  protected String teamProvider = TEAM_PROVIDER_EDEFAULT;

  /**
   * The default value of the '{@link #getRepositoryUrl() <em>Repository Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryUrl()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryUrl() <em>Repository Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryUrl()
   * @generated
   * @ordered
   */
  protected String repositoryUrl = REPOSITORY_URL_EDEFAULT;

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
   * The cached value of the '{@link #getPrimaryModule() <em>Primary Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryModule()
   * @generated
   * @ordered
   */
  protected RepositoryModule primaryModule;

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
   * The cached value of the '{@link #getRootStream() <em>Root Stream</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRootStream()
   * @generated
   * @ordered
   */
  protected RootStream rootStream;

  /**
   * @ADDED
   */
  private ICheckoutManager checkoutManager;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PopProjectImpl()
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
    return ProjectPackage.Literals.POP_PROJECT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTeamProvider()
  {
    return teamProvider;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTeamProvider(String newTeamProvider)
  {
    String oldTeamProvider = teamProvider;
    teamProvider = newTeamProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__TEAM_PROVIDER, oldTeamProvider,
          teamProvider));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getRepositoryUrl()
  {
    return repositoryUrl;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepositoryUrl(String newRepositoryUrl)
  {
    String oldRepositoryUrl = repositoryUrl;
    repositoryUrl = newRepositoryUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__REPOSITORY_URL,
          oldRepositoryUrl, repositoryUrl));
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
          ProjectPackage.POP_PROJECT__COMMITTERS, ProjectPackage.COMMITTER__POP_PROJECT);
    }
    return committers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryModule getPrimaryModule()
  {
    if (primaryModule != null && primaryModule.eIsProxy())
    {
      InternalEObject oldPrimaryModule = (InternalEObject)primaryModule;
      primaryModule = (RepositoryModule)eResolveProxy(oldPrimaryModule);
      if (primaryModule != oldPrimaryModule)
      {
        InternalEObject newPrimaryModule = (InternalEObject)primaryModule;
        NotificationChain msgs = oldPrimaryModule.eInverseRemove(this, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT,
            RepositoryModule.class, null);
        if (newPrimaryModule.eInternalContainer() == null)
        {
          msgs = newPrimaryModule.eInverseAdd(this, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT,
              RepositoryModule.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.POP_PROJECT__PRIMARY_MODULE,
              oldPrimaryModule, primaryModule));
      }
    }
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryModule basicGetPrimaryModule()
  {
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryModule(RepositoryModule newPrimaryModule, NotificationChain msgs)
  {
    RepositoryModule oldPrimaryModule = primaryModule;
    primaryModule = newPrimaryModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.POP_PROJECT__PRIMARY_MODULE, oldPrimaryModule, newPrimaryModule);
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
  public void setPrimaryModule(RepositoryModule newPrimaryModule)
  {
    if (newPrimaryModule != primaryModule)
    {
      NotificationChain msgs = null;
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT,
            RepositoryModule.class, msgs);
      if (newPrimaryModule != null)
        msgs = ((InternalEObject)newPrimaryModule).eInverseAdd(this, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT,
            RepositoryModule.class, msgs);
      msgs = basicSetPrimaryModule(newPrimaryModule, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__PRIMARY_MODULE,
          newPrimaryModule, newPrimaryModule));
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
        NotificationChain msgs = oldMainBranch.eInverseRemove(this, ProjectPackage.MAIN_BRANCH__POP_PROJECT,
            MainBranch.class, null);
        if (newMainBranch.eInternalContainer() == null)
        {
          msgs = newMainBranch.eInverseAdd(this, ProjectPackage.MAIN_BRANCH__POP_PROJECT, MainBranch.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.POP_PROJECT__MAIN_BRANCH,
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
          ProjectPackage.POP_PROJECT__MAIN_BRANCH, oldMainBranch, newMainBranch);
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
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, ProjectPackage.MAIN_BRANCH__POP_PROJECT,
            MainBranch.class, msgs);
      if (newMainBranch != null)
        msgs = ((InternalEObject)newMainBranch).eInverseAdd(this, ProjectPackage.MAIN_BRANCH__POP_PROJECT,
            MainBranch.class, msgs);
      msgs = basicSetMainBranch(newMainBranch, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__MAIN_BRANCH, newMainBranch,
          newMainBranch));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RootStream getRootStream()
  {
    if (rootStream != null && rootStream.eIsProxy())
    {
      InternalEObject oldRootStream = (InternalEObject)rootStream;
      rootStream = (RootStream)eResolveProxy(oldRootStream);
      if (rootStream != oldRootStream)
      {
        InternalEObject newRootStream = (InternalEObject)rootStream;
        NotificationChain msgs = oldRootStream.eInverseRemove(this, ProjectPackage.ROOT_STREAM__POP_PROJECT,
            RootStream.class, null);
        if (newRootStream.eInternalContainer() == null)
        {
          msgs = newRootStream.eInverseAdd(this, ProjectPackage.ROOT_STREAM__POP_PROJECT, RootStream.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.POP_PROJECT__ROOT_STREAM,
              oldRootStream, rootStream));
      }
    }
    return rootStream;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RootStream basicGetRootStream()
  {
    return rootStream;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootStream(RootStream newRootStream, NotificationChain msgs)
  {
    RootStream oldRootStream = rootStream;
    rootStream = newRootStream;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.POP_PROJECT__ROOT_STREAM, oldRootStream, newRootStream);
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
  public void setRootStream(RootStream newRootStream)
  {
    if (newRootStream != rootStream)
    {
      NotificationChain msgs = null;
      if (rootStream != null)
        msgs = ((InternalEObject)rootStream).eInverseRemove(this, ProjectPackage.ROOT_STREAM__POP_PROJECT,
            RootStream.class, msgs);
      if (newRootStream != null)
        msgs = ((InternalEObject)newRootStream).eInverseAdd(this, ProjectPackage.ROOT_STREAM__POP_PROJECT,
            RootStream.class, msgs);
      msgs = basicSetRootStream(newRootStream, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__ROOT_STREAM, newRootStream,
          newRootStream));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public EList<Checkout> getCheckouts()
  {
    Checkout[] checkouts = checkoutManager.getCheckouts();
    return new BasicEList.UnmodifiableEList<Checkout>(checkouts.length, checkouts);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Release addCommitter(String id, String name, String email, Date entry)
  {
    // TODO: implement PopProjectImpl.addCommitter(id, name, email, entry)
    throw new UnsupportedOperationException();
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
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommitters()).basicAdd(otherEnd, msgs);
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      if (primaryModule != null)
        msgs = ((InternalEObject)primaryModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.POP_PROJECT__PRIMARY_MODULE, null, msgs);
      return basicSetPrimaryModule((RepositoryModule)otherEnd, msgs);
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      if (mainBranch != null)
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.POP_PROJECT__MAIN_BRANCH, null, msgs);
      return basicSetMainBranch((MainBranch)otherEnd, msgs);
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      if (rootStream != null)
        msgs = ((InternalEObject)rootStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.POP_PROJECT__ROOT_STREAM, null, msgs);
      return basicSetRootStream((RootStream)otherEnd, msgs);
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
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      return ((InternalEList<?>)getCommitters()).basicRemove(otherEnd, msgs);
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      return basicSetPrimaryModule(null, msgs);
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      return basicSetMainBranch(null, msgs);
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      return basicSetRootStream(null, msgs);
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
    case ProjectPackage.POP_PROJECT__NAME:
      return getName();
    case ProjectPackage.POP_PROJECT__TEAM_PROVIDER:
      return getTeamProvider();
    case ProjectPackage.POP_PROJECT__REPOSITORY_URL:
      return getRepositoryUrl();
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      return getCommitters();
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      if (resolve)
        return getPrimaryModule();
      return basicGetPrimaryModule();
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      if (resolve)
        return getMainBranch();
      return basicGetMainBranch();
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      if (resolve)
        return getRootStream();
      return basicGetRootStream();
    case ProjectPackage.POP_PROJECT__CHECKOUTS:
      return getCheckouts();
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
    case ProjectPackage.POP_PROJECT__NAME:
      setName((String)newValue);
      return;
    case ProjectPackage.POP_PROJECT__TEAM_PROVIDER:
      setTeamProvider((String)newValue);
      return;
    case ProjectPackage.POP_PROJECT__REPOSITORY_URL:
      setRepositoryUrl((String)newValue);
      return;
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      getCommitters().clear();
      getCommitters().addAll((Collection<? extends Committer>)newValue);
      return;
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      setPrimaryModule((RepositoryModule)newValue);
      return;
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      setMainBranch((MainBranch)newValue);
      return;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      setRootStream((RootStream)newValue);
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
    case ProjectPackage.POP_PROJECT__NAME:
      setName(NAME_EDEFAULT);
      return;
    case ProjectPackage.POP_PROJECT__TEAM_PROVIDER:
      setTeamProvider(TEAM_PROVIDER_EDEFAULT);
      return;
    case ProjectPackage.POP_PROJECT__REPOSITORY_URL:
      setRepositoryUrl(REPOSITORY_URL_EDEFAULT);
      return;
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      getCommitters().clear();
      return;
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      setPrimaryModule((RepositoryModule)null);
      return;
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      setMainBranch((MainBranch)null);
      return;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      setRootStream((RootStream)null);
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
    case ProjectPackage.POP_PROJECT__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case ProjectPackage.POP_PROJECT__TEAM_PROVIDER:
      return TEAM_PROVIDER_EDEFAULT == null ? teamProvider != null : !TEAM_PROVIDER_EDEFAULT.equals(teamProvider);
    case ProjectPackage.POP_PROJECT__REPOSITORY_URL:
      return REPOSITORY_URL_EDEFAULT == null ? repositoryUrl != null : !REPOSITORY_URL_EDEFAULT.equals(repositoryUrl);
    case ProjectPackage.POP_PROJECT__COMMITTERS:
      return committers != null && !committers.isEmpty();
    case ProjectPackage.POP_PROJECT__PRIMARY_MODULE:
      return primaryModule != null;
    case ProjectPackage.POP_PROJECT__MAIN_BRANCH:
      return mainBranch != null;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      return rootStream != null;
    case ProjectPackage.POP_PROJECT__CHECKOUTS:
      return !getCheckouts().isEmpty();
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
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", teamProvider: "); //$NON-NLS-1$
    result.append(teamProvider);
    result.append(", repositoryUrl: "); //$NON-NLS-1$
    result.append(repositoryUrl);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public String getIdType()
  {
    return "pop";
  }

  /**
   * @ADDED
   */
  @Override
  public String getIdValue()
  {
    return getName();
  }

  /**
   * @ADDED
   */
  public ICheckoutManager getCheckoutManager()
  {
    return checkoutManager;
  }

  /**
   * @ADDED
   */
  public void setCheckoutManager(ICheckoutManager checkoutManager)
  {
    this.checkoutManager = checkoutManager;
  }
} // PopProjectImpl
