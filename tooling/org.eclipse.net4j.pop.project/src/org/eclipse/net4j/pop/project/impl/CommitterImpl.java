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
 * $Id: CommitterImpl.java,v 1.10 2008-08-01 20:05:23 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.Committer;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Committer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getRepositoryLogin <em>Repository Login</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CommitterImpl#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommitterImpl extends PopElementImpl implements Committer
{
  /**
   * The default value of the '{@link #getRepositoryLogin() <em>Repository Login</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRepositoryLogin()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_LOGIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryLogin() <em>Repository Login</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRepositoryLogin()
   * @generated
   * @ordered
   */
  protected String repositoryLogin = REPOSITORY_LOGIN_EDEFAULT;

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
   * The cached value of the '{@link #getExit() <em>Exit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * @generated
   */
  protected CommitterImpl()
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
    return ProjectPackage.Literals.COMMITTER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopProject getPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.COMMITTER__POP_PROJECT)
      return null;
    return (PopProject)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.COMMITTER__POP_PROJECT)
      return null;
    return (PopProject)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPopProject, ProjectPackage.COMMITTER__POP_PROJECT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPopProject(PopProject newPopProject)
  {
    if (newPopProject != eInternalContainer()
        || (eContainerFeatureID != ProjectPackage.COMMITTER__POP_PROJECT && newPopProject != null))
    {
      if (EcoreUtil.isAncestor(this, newPopProject))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPopProject != null)
        msgs = ((InternalEObject)newPopProject).eInverseAdd(this, ProjectPackage.POP_PROJECT__COMMITTERS,
            PopProject.class, msgs);
      msgs = basicSetPopProject(newPopProject, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__POP_PROJECT, newPopProject,
          newPopProject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getRepositoryLogin()
  {
    return repositoryLogin;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepositoryLogin(String newRepositoryLogin)
  {
    String oldRepositoryLogin = repositoryLogin;
    repositoryLogin = newRepositoryLogin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__REPOSITORY_LOGIN,
          oldRepositoryLogin, repositoryLogin));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getEmail()
  {
    return email;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEmail(String newEmail)
  {
    String oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__EMAIL, oldEmail, email));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Date getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEntry(Date newEntry)
  {
    Date oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__ENTRY, oldEntry, entry));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Date getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExit(Date newExit)
  {
    Date oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.COMMITTER__EXIT, oldExit, exit));
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
   * @generated NOT
   */
  public void deactivate(Date exit)
  {
    // TODO: implement CommitterImpl.deactivate(exit)
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.COMMITTER__POP_PROJECT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
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
    case ProjectPackage.COMMITTER__POP_PROJECT:
      return basicSetPopProject(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case ProjectPackage.COMMITTER__POP_PROJECT:
      return eInternalContainer().eInverseRemove(this, ProjectPackage.POP_PROJECT__COMMITTERS, PopProject.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case ProjectPackage.COMMITTER__POP_PROJECT:
      if (resolve)
        return getPopProject();
      return basicGetPopProject();
    case ProjectPackage.COMMITTER__REPOSITORY_LOGIN:
      return getRepositoryLogin();
    case ProjectPackage.COMMITTER__NAME:
      return getName();
    case ProjectPackage.COMMITTER__EMAIL:
      return getEmail();
    case ProjectPackage.COMMITTER__ENTRY:
      return getEntry();
    case ProjectPackage.COMMITTER__EXIT:
      return getExit();
    case ProjectPackage.COMMITTER__ACTIVE:
      return isActive() ? Boolean.TRUE : Boolean.FALSE;
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProjectPackage.COMMITTER__POP_PROJECT:
      setPopProject((PopProject)newValue);
      return;
    case ProjectPackage.COMMITTER__REPOSITORY_LOGIN:
      setRepositoryLogin((String)newValue);
      return;
    case ProjectPackage.COMMITTER__NAME:
      setName((String)newValue);
      return;
    case ProjectPackage.COMMITTER__EMAIL:
      setEmail((String)newValue);
      return;
    case ProjectPackage.COMMITTER__ENTRY:
      setEntry((Date)newValue);
      return;
    case ProjectPackage.COMMITTER__EXIT:
      setExit((Date)newValue);
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
    case ProjectPackage.COMMITTER__POP_PROJECT:
      setPopProject((PopProject)null);
      return;
    case ProjectPackage.COMMITTER__REPOSITORY_LOGIN:
      setRepositoryLogin(REPOSITORY_LOGIN_EDEFAULT);
      return;
    case ProjectPackage.COMMITTER__NAME:
      setName(NAME_EDEFAULT);
      return;
    case ProjectPackage.COMMITTER__EMAIL:
      setEmail(EMAIL_EDEFAULT);
      return;
    case ProjectPackage.COMMITTER__ENTRY:
      setEntry(ENTRY_EDEFAULT);
      return;
    case ProjectPackage.COMMITTER__EXIT:
      setExit(EXIT_EDEFAULT);
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
    case ProjectPackage.COMMITTER__POP_PROJECT:
      return basicGetPopProject() != null;
    case ProjectPackage.COMMITTER__REPOSITORY_LOGIN:
      return REPOSITORY_LOGIN_EDEFAULT == null ? repositoryLogin != null : !REPOSITORY_LOGIN_EDEFAULT
          .equals(repositoryLogin);
    case ProjectPackage.COMMITTER__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case ProjectPackage.COMMITTER__EMAIL:
      return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
    case ProjectPackage.COMMITTER__ENTRY:
      return ENTRY_EDEFAULT == null ? entry != null : !ENTRY_EDEFAULT.equals(entry);
    case ProjectPackage.COMMITTER__EXIT:
      return EXIT_EDEFAULT == null ? exit != null : !EXIT_EDEFAULT.equals(exit);
    case ProjectPackage.COMMITTER__ACTIVE:
      return isActive() != ACTIVE_EDEFAULT;
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
    result.append(" (repositoryLogin: "); //$NON-NLS-1$
    result.append(repositoryLogin);
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

  /**
   * @ADDED
   */
  @Override
  public String getIdType()
  {
    return "committer";
  }

  /**
   * @ADDED
   */
  @Override
  public String getIdValue()
  {
    return getRepositoryLogin();
  }
} // CommitterImpl
