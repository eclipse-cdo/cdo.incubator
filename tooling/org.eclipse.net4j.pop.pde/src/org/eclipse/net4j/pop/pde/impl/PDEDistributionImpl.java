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
 * $Id: PDEDistributionImpl.java,v 1.1 2008-08-01 07:53:35 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.net4j.pop.pde.PDEDistribution;
import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.TargetPlatform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl#getTargetPlatform <em>Target Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PDEDistributionImpl extends EObjectImpl implements PDEDistribution
{
  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<PDEEntity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDEDistributionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDEPackage.Literals.PDE_DISTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PDEEntity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentWithInverseEList<PDEEntity>(PDEEntity.class, this,
          PDEPackage.PDE_DISTRIBUTION__ENTITIES, PDEPackage.PDE_ENTITY__DISTRIBUTION);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetPlatform getTargetPlatform()
  {
    if (eContainerFeatureID != PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM) return null;
    return (TargetPlatform)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetPlatform(TargetPlatform newTargetPlatform, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTargetPlatform, PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetPlatform(TargetPlatform newTargetPlatform)
  {
    if (newTargetPlatform != eInternalContainer()
        || (eContainerFeatureID != PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM && newTargetPlatform != null))
    {
      if (EcoreUtil.isAncestor(this, newTargetPlatform))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTargetPlatform != null)
        msgs = ((InternalEObject)newTargetPlatform).eInverseAdd(this, PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS,
            TargetPlatform.class, msgs);
      msgs = basicSetTargetPlatform(newTargetPlatform, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM,
          newTargetPlatform, newTargetPlatform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return basicSetTargetPlatform((TargetPlatform)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      return basicSetTargetPlatform(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      return eInternalContainer().eInverseRemove(this, PDEPackage.TARGET_PLATFORM__DISTRIBUTIONS, TargetPlatform.class,
          msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      return getEntities();
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      return getTargetPlatform();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      getEntities().clear();
      getEntities().addAll((Collection<? extends PDEEntity>)newValue);
      return;
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      setTargetPlatform((TargetPlatform)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      getEntities().clear();
      return;
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      setTargetPlatform((TargetPlatform)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case PDEPackage.PDE_DISTRIBUTION__ENTITIES:
      return entities != null && !entities.isEmpty();
    case PDEPackage.PDE_DISTRIBUTION__TARGET_PLATFORM:
      return getTargetPlatform() != null;
    }
    return super.eIsSet(featureID);
  }

} //PDEDistributionImpl
