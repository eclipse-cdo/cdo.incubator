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
 * $Id: PrimaryModuleImpl.java,v 1.3 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.PrimaryModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Primary Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.PrimaryModuleImpl#getPop <em>Pop</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.PrimaryModuleImpl#getSpecificationPath <em>Specification Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PrimaryModuleImpl extends ModuleImpl implements PrimaryModule
{
  /**
   * The default value of the '{@link #getSpecificationPath() <em>Specification Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSpecificationPath()
   * @generated
   * @ordered
   */
  protected static final String SPECIFICATION_PATH_EDEFAULT = "product.xml"; //$NON-NLS-1$

  /**
   * The cached value of the '{@link #getSpecificationPath() <em>Specification Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSpecificationPath()
   * @generated
   * @ordered
   */
  protected String specificationPath = SPECIFICATION_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PrimaryModuleImpl()
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
    return PopPackage.Literals.PRIMARY_MODULE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop getPop()
  {
    if (eContainerFeatureID != PopPackage.PRIMARY_MODULE__POP)
      return null;
    return (Pop)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop basicGetPop()
  {
    if (eContainerFeatureID != PopPackage.PRIMARY_MODULE__POP)
      return null;
    return (Pop)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPop(Pop newPop, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPop, PopPackage.PRIMARY_MODULE__POP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPop(Pop newPop)
  {
    if (newPop != eInternalContainer() || (eContainerFeatureID != PopPackage.PRIMARY_MODULE__POP && newPop != null))
    {
      if (EcoreUtil.isAncestor(this, newPop))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPop != null)
        msgs = ((InternalEObject)newPop).eInverseAdd(this, PopPackage.POP__PRIMARY_MODULE, Pop.class, msgs);
      msgs = basicSetPop(newPop, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.PRIMARY_MODULE__POP, newPop, newPop));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getSpecificationPath()
  {
    return specificationPath;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setSpecificationPath(String newSpecificationPath)
  {
    String oldSpecificationPath = specificationPath;
    specificationPath = newSpecificationPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.PRIMARY_MODULE__SPECIFICATION_PATH,
          oldSpecificationPath, specificationPath));
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
    case PopPackage.PRIMARY_MODULE__POP:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetPop((Pop)otherEnd, msgs);
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
    case PopPackage.PRIMARY_MODULE__POP:
      return basicSetPop(null, msgs);
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
    case PopPackage.PRIMARY_MODULE__POP:
      return eInternalContainer().eInverseRemove(this, PopPackage.POP__PRIMARY_MODULE, Pop.class, msgs);
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
    case PopPackage.PRIMARY_MODULE__POP:
      if (resolve)
        return getPop();
      return basicGetPop();
    case PopPackage.PRIMARY_MODULE__SPECIFICATION_PATH:
      return getSpecificationPath();
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
    case PopPackage.PRIMARY_MODULE__POP:
      setPop((Pop)newValue);
      return;
    case PopPackage.PRIMARY_MODULE__SPECIFICATION_PATH:
      setSpecificationPath((String)newValue);
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
    case PopPackage.PRIMARY_MODULE__POP:
      setPop((Pop)null);
      return;
    case PopPackage.PRIMARY_MODULE__SPECIFICATION_PATH:
      setSpecificationPath(SPECIFICATION_PATH_EDEFAULT);
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
    case PopPackage.PRIMARY_MODULE__POP:
      return basicGetPop() != null;
    case PopPackage.PRIMARY_MODULE__SPECIFICATION_PATH:
      return SPECIFICATION_PATH_EDEFAULT == null ? specificationPath != null : !SPECIFICATION_PATH_EDEFAULT
          .equals(specificationPath);
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
    result.append(" (specificationPath: "); //$NON-NLS-1$
    result.append(specificationPath);
    result.append(')');
    return result.toString();
  }

} // PrimaryModuleImpl
