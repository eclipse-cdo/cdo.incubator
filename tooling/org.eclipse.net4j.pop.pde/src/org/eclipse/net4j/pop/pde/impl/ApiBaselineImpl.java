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
 * $Id: ApiBaselineImpl.java,v 1.4 2008-08-05 18:38:56 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.pde.ApiBaseline;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.TargetPlatform;
import org.eclipse.net4j.pop.project.Release;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Api Baseline</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl#getTargetPlatform <em>Target Platform</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ApiBaselineImpl extends PDEConfiguratorImpl implements ApiBaseline
{
  /**
   * The cached value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getTargetPlatform()
   * @generated
   * @ordered
   */
  protected TargetPlatform targetPlatform;

  /**
   * The cached value of the '{@link #getRelease() <em>Release</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getRelease()
   * @generated
   * @ordered
   */
  protected Release release;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ApiBaselineImpl()
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
    return PDEPackage.Literals.API_BASELINE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TargetPlatform getTargetPlatform()
  {
    if (targetPlatform != null && targetPlatform.eIsProxy())
    {
      InternalEObject oldTargetPlatform = (InternalEObject)targetPlatform;
      targetPlatform = (TargetPlatform)eResolveProxy(oldTargetPlatform);
      if (targetPlatform != oldTargetPlatform)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDEPackage.API_BASELINE__TARGET_PLATFORM,
              oldTargetPlatform, targetPlatform));
      }
    }
    return targetPlatform;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TargetPlatform basicGetTargetPlatform()
  {
    return targetPlatform;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTargetPlatform(TargetPlatform newTargetPlatform)
  {
    TargetPlatform oldTargetPlatform = targetPlatform;
    targetPlatform = newTargetPlatform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.API_BASELINE__TARGET_PLATFORM,
          oldTargetPlatform, targetPlatform));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Release getRelease()
  {
    if (release != null && release.eIsProxy())
    {
      InternalEObject oldRelease = (InternalEObject)release;
      release = (Release)eResolveProxy(oldRelease);
      if (release != oldRelease)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDEPackage.API_BASELINE__RELEASE, oldRelease,
              release));
      }
    }
    return release;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Release basicGetRelease()
  {
    return release;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setRelease(Release newRelease)
  {
    Release oldRelease = release;
    release = newRelease;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.API_BASELINE__RELEASE, oldRelease, release));
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
    case PDEPackage.API_BASELINE__TARGET_PLATFORM:
      if (resolve)
        return getTargetPlatform();
      return basicGetTargetPlatform();
    case PDEPackage.API_BASELINE__RELEASE:
      if (resolve)
        return getRelease();
      return basicGetRelease();
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
    case PDEPackage.API_BASELINE__TARGET_PLATFORM:
      setTargetPlatform((TargetPlatform)newValue);
      return;
    case PDEPackage.API_BASELINE__RELEASE:
      setRelease((Release)newValue);
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
    case PDEPackage.API_BASELINE__TARGET_PLATFORM:
      setTargetPlatform((TargetPlatform)null);
      return;
    case PDEPackage.API_BASELINE__RELEASE:
      setRelease((Release)null);
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
    case PDEPackage.API_BASELINE__TARGET_PLATFORM:
      return targetPlatform != null;
    case PDEPackage.API_BASELINE__RELEASE:
      return release != null;
    }
    return super.eIsSet(featureID);
  }

} // ApiBaselineImpl
