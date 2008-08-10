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
 * $Id: SubBranchImpl.java,v 1.4 2008-08-10 06:39:59 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Branch;
import org.eclipse.net4j.pop.MainBranch;
import org.eclipse.net4j.pop.PopFactory;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.SubBranch;
import org.eclipse.net4j.pop.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sub Branch</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.SubBranchImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.SubBranchImpl#getRootTagName <em>Root Tag Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.SubBranchImpl#getRootTag <em>Root Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubBranchImpl extends BranchImpl implements SubBranch
{
  /**
   * The default value of the '{@link #getRootTagName() <em>Root Tag Name</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRootTagName()
   * @generated
   * @ordered
   */
  protected static final String ROOT_TAG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootTagName() <em>Root Tag Name</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRootTagName()
   * @generated
   * @ordered
   */
  protected String rootTagName = ROOT_TAG_NAME_EDEFAULT;

  /**
   * @ADDED
   */
  private Tag rootTag;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SubBranchImpl()
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
    return PopPackage.Literals.SUB_BRANCH;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Branch getParent()
  {
    if (eContainerFeatureID != PopPackage.SUB_BRANCH__PARENT)
      return null;
    return (Branch)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Branch basicGetParent()
  {
    if (eContainerFeatureID != PopPackage.SUB_BRANCH__PARENT)
      return null;
    return (Branch)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Branch newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, PopPackage.SUB_BRANCH__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Branch newParent)
  {
    if (newParent != eInternalContainer()
        || (eContainerFeatureID != PopPackage.SUB_BRANCH__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, PopPackage.BRANCH__BRANCHES, Branch.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.SUB_BRANCH__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getRootTagName()
  {
    return rootTagName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRootTagName(String newRootTagName)
  {
    String oldRootTagName = rootTagName;
    rootTagName = newRootTagName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.SUB_BRANCH__ROOT_TAG_NAME, oldRootTagName,
          rootTagName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag getRootTag()
  {
    if (rootTag == null)
    {
      rootTag = PopFactory.eINSTANCE.createTag();
      rootTag.setBranch(this);
      rootTag.setName(getRootTagName());
    }

    return rootTag;
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
    case PopPackage.SUB_BRANCH__PARENT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetParent((Branch)otherEnd, msgs);
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
    case PopPackage.SUB_BRANCH__PARENT:
      return basicSetParent(null, msgs);
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
    case PopPackage.SUB_BRANCH__PARENT:
      return eInternalContainer().eInverseRemove(this, PopPackage.BRANCH__BRANCHES, Branch.class, msgs);
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
    case PopPackage.SUB_BRANCH__PARENT:
      if (resolve)
        return getParent();
      return basicGetParent();
    case PopPackage.SUB_BRANCH__ROOT_TAG_NAME:
      return getRootTagName();
    case PopPackage.SUB_BRANCH__ROOT_TAG:
      return getRootTag();
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
    case PopPackage.SUB_BRANCH__PARENT:
      setParent((Branch)newValue);
      return;
    case PopPackage.SUB_BRANCH__ROOT_TAG_NAME:
      setRootTagName((String)newValue);
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
    case PopPackage.SUB_BRANCH__PARENT:
      setParent((Branch)null);
      return;
    case PopPackage.SUB_BRANCH__ROOT_TAG_NAME:
      setRootTagName(ROOT_TAG_NAME_EDEFAULT);
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
    case PopPackage.SUB_BRANCH__PARENT:
      return basicGetParent() != null;
    case PopPackage.SUB_BRANCH__ROOT_TAG_NAME:
      return ROOT_TAG_NAME_EDEFAULT == null ? rootTagName != null : !ROOT_TAG_NAME_EDEFAULT.equals(rootTagName);
    case PopPackage.SUB_BRANCH__ROOT_TAG:
      return getRootTag() != null;
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
    result.append(" (rootTagName: "); //$NON-NLS-1$
    result.append(rootTagName);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public Repository getRepository()
  {
    return getMainBranch().getRepository();
  }

  /**
   * @ADDED
   */
  @Override
  public MainBranch getMainBranch()
  {
    return getParent().getMainBranch();
  }

} // SubBranchImpl
