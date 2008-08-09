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
 * $Id: MilestoneImpl.java,v 1.2 2008-08-09 09:58:11 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Milestone;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Release;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Milestone</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.MilestoneImpl#getRelease <em>Release</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.MilestoneImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MilestoneImpl extends TargetImpl implements Milestone
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected MilestoneImpl()
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
    return PopPackage.Literals.MILESTONE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Release getRelease()
  {
    if (eContainerFeatureID != PopPackage.MILESTONE__RELEASE)
      return null;
    return (Release)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Release basicGetRelease()
  {
    if (eContainerFeatureID != PopPackage.MILESTONE__RELEASE)
      return null;
    return (Release)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetRelease(Release newRelease, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newRelease, PopPackage.MILESTONE__RELEASE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setRelease(Release newRelease)
  {
    if (newRelease != eInternalContainer()
        || (eContainerFeatureID != PopPackage.MILESTONE__RELEASE && newRelease != null))
    {
      if (EcoreUtil.isAncestor(this, newRelease))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRelease != null)
        msgs = ((InternalEObject)newRelease).eInverseAdd(this, PopPackage.RELEASE__MILESTONES, Release.class, msgs);
      msgs = basicSetRelease(newRelease, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.MILESTONE__RELEASE, newRelease, newRelease));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.MILESTONE__NAME, oldName, name));
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
    case PopPackage.MILESTONE__RELEASE:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetRelease((Release)otherEnd, msgs);
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
    case PopPackage.MILESTONE__RELEASE:
      return basicSetRelease(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PopPackage.MILESTONE__RELEASE:
      return eInternalContainer().eInverseRemove(this, PopPackage.RELEASE__MILESTONES, Release.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case PopPackage.MILESTONE__RELEASE:
      if (resolve)
        return getRelease();
      return basicGetRelease();
    case PopPackage.MILESTONE__NAME:
      return getName();
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
    case PopPackage.MILESTONE__RELEASE:
      setRelease((Release)newValue);
      return;
    case PopPackage.MILESTONE__NAME:
      setName((String)newValue);
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
    case PopPackage.MILESTONE__RELEASE:
      setRelease((Release)null);
      return;
    case PopPackage.MILESTONE__NAME:
      setName(NAME_EDEFAULT);
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
    case PopPackage.MILESTONE__RELEASE:
      return basicGetRelease() != null;
    case PopPackage.MILESTONE__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // MilestoneImpl
