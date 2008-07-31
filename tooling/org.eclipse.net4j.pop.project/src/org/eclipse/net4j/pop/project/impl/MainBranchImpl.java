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
 * $Id: MainBranchImpl.java,v 1.1 2008-07-31 12:33:20 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.CodeRepository;
import org.eclipse.net4j.pop.project.MainBranch;
import org.eclipse.net4j.pop.project.ProjectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Main Branch</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.MainBranchImpl#getCodeRepository <em>Code Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainBranchImpl extends BranchImpl implements MainBranch
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MainBranchImpl()
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
    return ProjectPackage.Literals.MAIN_BRANCH;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CodeRepository getCodeRepository()
  {
    if (eContainerFeatureID != ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY) return null;
    return (CodeRepository)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeRepository(CodeRepository newCodeRepository, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newCodeRepository, ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCodeRepository(CodeRepository newCodeRepository)
  {
    if (newCodeRepository != eInternalContainer()
        || (eContainerFeatureID != ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY && newCodeRepository != null))
    {
      if (EcoreUtil.isAncestor(this, newCodeRepository))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newCodeRepository != null)
        msgs = ((InternalEObject)newCodeRepository).eInverseAdd(this, ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH,
            CodeRepository.class, msgs);
      msgs = basicSetCodeRepository(newCodeRepository, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY,
          newCodeRepository, newCodeRepository));
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return basicSetCodeRepository((CodeRepository)otherEnd, msgs);
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      return basicSetCodeRepository(null, msgs);
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      return eInternalContainer().eInverseRemove(this, ProjectPackage.CODE_REPOSITORY__MAIN_BRANCH,
          CodeRepository.class, msgs);
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      return getCodeRepository();
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      setCodeRepository((CodeRepository)newValue);
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      setCodeRepository((CodeRepository)null);
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
    case ProjectPackage.MAIN_BRANCH__CODE_REPOSITORY:
      return getCodeRepository() != null;
    }
    return super.eIsSet(featureID);
  }

} // MainBranchImpl
