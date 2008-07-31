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
 * $Id: RootStreamImpl.java,v 1.2 2008-07-31 13:35:41 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.RootStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Root Stream</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RootStreamImpl#getPopProject <em>Pop Project</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RootStreamImpl extends DevelopmentStreamImpl implements RootStream
{
  /**
   * The cached value of the '{@link #getPopProject() <em>Pop Project</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getPopProject()
   * @generated
   * @ordered
   */
  protected PopProject popProject;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RootStreamImpl()
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
    return ProjectPackage.Literals.ROOT_STREAM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.ROOT_STREAM__POP_PROJECT,
              oldPopProject, popProject));
      }
    }
    return popProject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    return popProject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    PopProject oldPopProject = popProject;
    popProject = newPopProject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.ROOT_STREAM__POP_PROJECT, oldPopProject, newPopProject);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPopProject(PopProject newPopProject)
  {
    if (newPopProject != popProject)
    {
      NotificationChain msgs = null;
      if (popProject != null)
        msgs = ((InternalEObject)popProject).eInverseRemove(this, ProjectPackage.POP_PROJECT__ROOT_STREAM,
            PopProject.class, msgs);
      if (newPopProject != null)
        msgs = ((InternalEObject)newPopProject).eInverseAdd(this, ProjectPackage.POP_PROJECT__ROOT_STREAM,
            PopProject.class, msgs);
      msgs = basicSetPopProject(newPopProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.ROOT_STREAM__POP_PROJECT, newPopProject,
          newPopProject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      if (popProject != null)
        msgs = ((InternalEObject)popProject).eInverseRemove(this, ProjectPackage.POP_PROJECT__ROOT_STREAM,
            PopProject.class, msgs);
      return basicSetPopProject((PopProject)otherEnd, msgs);
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
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      return basicSetPopProject(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      if (resolve) return getPopProject();
      return basicGetPopProject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      setPopProject((PopProject)newValue);
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
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      setPopProject((PopProject)null);
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
    case ProjectPackage.ROOT_STREAM__POP_PROJECT:
      return popProject != null;
    }
    return super.eIsSet(featureID);
  }

} // RootStreamImpl
