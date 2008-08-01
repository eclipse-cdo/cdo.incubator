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
 * $Id: TargetPlatformImpl.java,v 1.2 2008-08-01 08:15:04 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.pde.PDEDistribution;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.TargetPlatform;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Target Platform</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.TargetPlatformImpl#getDistributions <em>Distributions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TargetPlatformImpl extends PDEConfiguratorImpl implements TargetPlatform
{
  /**
   * The cached value of the '{@link #getDistributions() <em>Distributions</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDistributions()
   * @generated
   * @ordered
   */
  protected EList<PDEDistribution> distributions;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected TargetPlatformImpl()
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
    return PDEPackage.Literals.TARGET_PLATFORM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<PDEDistribution> getDistributions()
  {
    if (distributions == null)
    {
      distributions = new EObjectContainmentWithInverseEList<PDEDistribution>(PDEDistribution.class, this,
          PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS, PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM);
    }
    return distributions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getDistributions()).basicAdd(otherEnd, msgs);
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
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      return ((InternalEList<?>)getDistributions()).basicRemove(otherEnd, msgs);
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
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      return getDistributions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      getDistributions().clear();
      getDistributions().addAll((Collection<? extends PDEDistribution>)newValue);
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
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      getDistributions().clear();
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
    case PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS:
      return distributions != null && !distributions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // TargetPlatformImpl
