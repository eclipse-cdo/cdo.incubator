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
 * $Id: CodeRepositoryImpl.java,v 1.1 2008-07-31 12:33:20 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.CodeRepository;
import org.eclipse.net4j.pop.project.CodeRoot;
import org.eclipse.net4j.pop.project.Committer;
import org.eclipse.net4j.pop.project.MainBranch;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Release;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Code Repository</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getTeamProvider <em>Team Provider</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getRepositoryUrl <em>Repository Url</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getCodeRoots <em>Code Roots</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getCommitters <em>Committers</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getMainBranch <em>Main Branch</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CodeRepositoryImpl#getPopProject <em>Pop Project</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeRepositoryImpl extends EObjectImpl implements CodeRepository
{
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
   * The cached value of the '{@link #getCodeRoots() <em>Code Roots</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCodeRoots()
   * @generated
   * @ordered
   */
  protected EList<CodeRoot> codeRoots;

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
   * The cached value of the '{@link #getPopProject() <em>Pop Project</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPopProject()
   * @generated
   * @ordered
   */
  protected PopProject popProject;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CodeRepositoryImpl()
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
    return ProjectPackage.Literals.CODE_REPOSITORY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_REPOSITORY__TEAM_PROVIDER,
          oldTeamProvider, teamProvider));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_REPOSITORY__REPOSITORY_URL,
          oldRepositoryUrl, repositoryUrl));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<CodeRoot> getCodeRoots()
  {
    if (codeRoots == null)
    {
      codeRoots = new EObjectContainmentWithInverseEList<CodeRoot>(CodeRoot.class, this,
          ProjectPackage.CODE_REPOSITORY__CODE_ROOTS, ProjectPackage.CODE_ROOT__CODE_REPOSITORY);
    }
    return codeRoots;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Committer> getCommitters()
  {
    if (committers == null)
    {
      committers = new EObjectContainmentWithInverseEList<Committer>(Committer.class, this,
          ProjectPackage.CODE_REPOSITORY__COMMITTERS, ProjectPackage.COMMITTER__CODE_REPOSITORY);
    }
    return committers;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MainBranch getMainBranch()
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
          ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH, oldMainBranch, newMainBranch);
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
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY,
            MainBranch.class, msgs);
      if (newMainBranch != null)
        msgs = ((InternalEObject)newMainBranch).eInverseAdd(this, ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY,
            MainBranch.class, msgs);
      msgs = basicSetMainBranch(newMainBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH, newMainBranch,
          newMainBranch));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.CODE_REPOSITORY__POP_PROJECT,
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
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    PopProject oldPopProject = popProject;
    popProject = newPopProject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.CODE_REPOSITORY__POP_PROJECT, oldPopProject, newPopProject);
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
  public void setPopProject(PopProject newPopProject)
  {
    if (newPopProject != popProject)
    {
      NotificationChain msgs = null;
      if (popProject != null)
        msgs = ((InternalEObject)popProject).eInverseRemove(this, ProjectPackage.POP_PROJECT__CODE_REPOSITORY,
            PopProject.class, msgs);
      if (newPopProject != null)
        msgs = ((InternalEObject)newPopProject).eInverseAdd(this, ProjectPackage.POP_PROJECT__CODE_REPOSITORY,
            PopProject.class, msgs);
      msgs = basicSetPopProject(newPopProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_REPOSITORY__POP_PROJECT, newPopProject,
          newPopProject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Release addCommitter(String id, String name, String email, Date entry)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
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
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getCodeRoots()).basicAdd(otherEnd, msgs);
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommitters()).basicAdd(otherEnd, msgs);
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      if (mainBranch != null)
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH, null, msgs);
      return basicSetMainBranch((MainBranch)otherEnd, msgs);
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      if (popProject != null)
        msgs = ((InternalEObject)popProject).eInverseRemove(this, ProjectPackage.POP_PROJECT__CODE_REPOSITORY,
            PopProject.class, msgs);
      return basicSetPopProject((PopProject)otherEnd, msgs);
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
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      return ((InternalEList<?>)getCodeRoots()).basicRemove(otherEnd, msgs);
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      return ((InternalEList<?>)getCommitters()).basicRemove(otherEnd, msgs);
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      return basicSetMainBranch(null, msgs);
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      return basicSetPopProject(null, msgs);
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
    case ProjectPackage.CODE_REPOSITORY__TEAM_PROVIDER:
      return getTeamProvider();
    case ProjectPackage.CODE_REPOSITORY__REPOSITORY_URL:
      return getRepositoryUrl();
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      return getCodeRoots();
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      return getCommitters();
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      return getMainBranch();
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      if (resolve) return getPopProject();
      return basicGetPopProject();
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
    case ProjectPackage.CODE_REPOSITORY__TEAM_PROVIDER:
      setTeamProvider((String)newValue);
      return;
    case ProjectPackage.CODE_REPOSITORY__REPOSITORY_URL:
      setRepositoryUrl((String)newValue);
      return;
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      getCodeRoots().clear();
      getCodeRoots().addAll((Collection<? extends CodeRoot>)newValue);
      return;
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      getCommitters().clear();
      getCommitters().addAll((Collection<? extends Committer>)newValue);
      return;
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)newValue);
      return;
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      setPopProject((PopProject)newValue);
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
    case ProjectPackage.CODE_REPOSITORY__TEAM_PROVIDER:
      setTeamProvider(TEAM_PROVIDER_EDEFAULT);
      return;
    case ProjectPackage.CODE_REPOSITORY__REPOSITORY_URL:
      setRepositoryUrl(REPOSITORY_URL_EDEFAULT);
      return;
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      getCodeRoots().clear();
      return;
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      getCommitters().clear();
      return;
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)null);
      return;
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      setPopProject((PopProject)null);
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
    case ProjectPackage.CODE_REPOSITORY__TEAM_PROVIDER:
      return TEAM_PROVIDER_EDEFAULT == null ? teamProvider != null : !TEAM_PROVIDER_EDEFAULT.equals(teamProvider);
    case ProjectPackage.CODE_REPOSITORY__REPOSITORY_URL:
      return REPOSITORY_URL_EDEFAULT == null ? repositoryUrl != null : !REPOSITORY_URL_EDEFAULT.equals(repositoryUrl);
    case ProjectPackage.CODE_REPOSITORY__CODE_ROOTS:
      return codeRoots != null && !codeRoots.isEmpty();
    case ProjectPackage.CODE_REPOSITORY__COMMITTERS:
      return committers != null && !committers.isEmpty();
    case ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH:
      return mainBranch != null;
    case ProjectPackage.CODE_REPOSITORY__POP_PROJECT:
      return popProject != null;
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
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (teamProvider: "); //$NON-NLS-1$
    result.append(teamProvider);
    result.append(", repositoryUrl: "); //$NON-NLS-1$
    result.append(repositoryUrl);
    result.append(')');
    return result.toString();
  }

} // CodeRepositoryImpl
