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
 * $Id: CodeRootImpl.java,v 1.7 2008-08-01 11:01:45 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.CodeRoot;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Code Root</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CodeRootImpl#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CodeRootImpl#getRootPath <em>Root Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeRootImpl extends EObjectImpl implements CodeRoot
{
  /**
   * The default value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPath()
   * @generated
   * @ordered
   */
  protected static final String ROOT_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPath()
   * @generated
   * @ordered
   */
  protected String rootPath = ROOT_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CodeRootImpl()
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
    return ProjectPackage.Literals.CODE_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopProject getPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.CODE_ROOT__POP_PROJECT) return null;
    return (PopProject)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.CODE_ROOT__POP_PROJECT) return null;
    return (PopProject)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPopProject, ProjectPackage.CODE_ROOT__POP_PROJECT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopProject(PopProject newPopProject)
  {
    if (newPopProject != eInternalContainer()
        || (eContainerFeatureID != ProjectPackage.CODE_ROOT__POP_PROJECT && newPopProject != null))
    {
      if (EcoreUtil.isAncestor(this, newPopProject))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newPopProject != null)
        msgs = ((InternalEObject)newPopProject).eInverseAdd(this, ProjectPackage.POP_PROJECT__CODE_ROOTS,
            PopProject.class, msgs);
      msgs = basicSetPopProject(newPopProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_ROOT__POP_PROJECT, newPopProject,
          newPopProject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRootPath()
  {
    return rootPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootPath(String newRootPath)
  {
    String oldRootPath = rootPath;
    rootPath = newRootPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CODE_ROOT__ROOT_PATH, oldRootPath, rootPath));
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      return eInternalContainer().eInverseRemove(this, ProjectPackage.POP_PROJECT__CODE_ROOTS, PopProject.class, msgs);
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      if (resolve) return getPopProject();
      return basicGetPopProject();
    case ProjectPackage.CODE_ROOT__ROOT_PATH:
      return getRootPath();
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      setPopProject((PopProject)newValue);
      return;
    case ProjectPackage.CODE_ROOT__ROOT_PATH:
      setRootPath((String)newValue);
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      setPopProject((PopProject)null);
      return;
    case ProjectPackage.CODE_ROOT__ROOT_PATH:
      setRootPath(ROOT_PATH_EDEFAULT);
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
    case ProjectPackage.CODE_ROOT__POP_PROJECT:
      return basicGetPopProject() != null;
    case ProjectPackage.CODE_ROOT__ROOT_PATH:
      return ROOT_PATH_EDEFAULT == null ? rootPath != null : !ROOT_PATH_EDEFAULT.equals(rootPath);
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
    result.append(" (rootPath: "); //$NON-NLS-1$
    result.append(rootPath);
    result.append(')');
    return result.toString();
  }

} // CodeRootImpl
