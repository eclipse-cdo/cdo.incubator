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
 * $Id: PopProjectImpl.java,v 1.4 2008-08-01 08:15:16 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.CodeRepository;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.RootStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pop Project</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getCodeRepository <em>Code Repository</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl#getRootStream <em>Root Stream</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PopProjectImpl extends EObjectImpl implements PopProject
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
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCodeRepository() <em>Code Repository</em>}' reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getCodeRepository()
   * @generated
   * @ordered
   */
  protected CodeRepository codeRepository;

  /**
   * The cached value of the '{@link #getRootStream() <em>Root Stream</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getRootStream()
   * @generated
   * @ordered
   */
  protected RootStream rootStream;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PopProjectImpl()
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
    return ProjectPackage.Literals.POP_PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CodeRepository getCodeRepository()
  {
    if (codeRepository != null && codeRepository.eIsProxy())
    {
      InternalEObject oldCodeRepository = (InternalEObject)codeRepository;
      codeRepository = (CodeRepository)eResolveProxy(oldCodeRepository);
      if (codeRepository != oldCodeRepository)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.POP_PROJECT__CODE_REPOSITORY,
              oldCodeRepository, codeRepository));
      }
    }
    return codeRepository;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CodeRepository basicGetCodeRepository()
  {
    return codeRepository;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCodeRepository(CodeRepository newCodeRepository, NotificationChain msgs)
  {
    CodeRepository oldCodeRepository = codeRepository;
    codeRepository = newCodeRepository;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.POP_PROJECT__CODE_REPOSITORY, oldCodeRepository, newCodeRepository);
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
  public void setCodeRepository(CodeRepository newCodeRepository)
  {
    if (newCodeRepository != codeRepository)
    {
      NotificationChain msgs = null;
      if (codeRepository != null)
        msgs = ((InternalEObject)codeRepository).eInverseRemove(this, ProjectPackage.CODE_REPOSITORY__POP_PROJECT,
            CodeRepository.class, msgs);
      if (newCodeRepository != null)
        msgs = ((InternalEObject)newCodeRepository).eInverseAdd(this, ProjectPackage.CODE_REPOSITORY__POP_PROJECT,
            CodeRepository.class, msgs);
      msgs = basicSetCodeRepository(newCodeRepository, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__CODE_REPOSITORY,
          newCodeRepository, newCodeRepository));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.POP_PROJECT__ROOT_STREAM,
              oldRootStream, rootStream));
      }
    }
    return rootStream;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public RootStream basicGetRootStream()
  {
    return rootStream;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
   * 
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
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.POP_PROJECT__ROOT_STREAM, newRootStream,
          newRootStream));
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
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      if (codeRepository != null)
        msgs = ((InternalEObject)codeRepository).eInverseRemove(this, ProjectPackage.CODE_REPOSITORY__POP_PROJECT,
            CodeRepository.class, msgs);
      return basicSetCodeRepository((CodeRepository)otherEnd, msgs);
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      if (rootStream != null)
        msgs = ((InternalEObject)rootStream).eInverseRemove(this, ProjectPackage.ROOT_STREAM__POP_PROJECT,
            RootStream.class, msgs);
      return basicSetRootStream((RootStream)otherEnd, msgs);
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
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      return basicSetCodeRepository(null, msgs);
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      return basicSetRootStream(null, msgs);
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
    case ProjectPackage.POP_PROJECT__NAME:
      return getName();
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      if (resolve) return getCodeRepository();
      return basicGetCodeRepository();
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      if (resolve) return getRootStream();
      return basicGetRootStream();
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
    case ProjectPackage.POP_PROJECT__NAME:
      setName((String)newValue);
      return;
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      setCodeRepository((CodeRepository)newValue);
      return;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      setRootStream((RootStream)newValue);
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
    case ProjectPackage.POP_PROJECT__NAME:
      setName(NAME_EDEFAULT);
      return;
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      setCodeRepository((CodeRepository)null);
      return;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      setRootStream((RootStream)null);
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
    case ProjectPackage.POP_PROJECT__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case ProjectPackage.POP_PROJECT__CODE_REPOSITORY:
      return codeRepository != null;
    case ProjectPackage.POP_PROJECT__ROOT_STREAM:
      return rootStream != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // PopProjectImpl
