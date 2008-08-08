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
 * $Id: DevelopmentStreamImpl.java,v 1.3 2008-08-08 09:25:49 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.DevelopmentStream;
import org.eclipse.net4j.pop.MaintenanceStream;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.DevelopmentStreamImpl#getMaintenanceStreams <em>Maintenance Streams</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.DevelopmentStreamImpl#getPop <em>Pop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentStreamImpl extends IntegrationStreamImpl implements DevelopmentStream
{
  /**
   * The cached value of the '{@link #getMaintenanceStreams() <em>Maintenance Streams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaintenanceStreams()
   * @generated
   * @ordered
   */
  protected EList<MaintenanceStream> maintenanceStreams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DevelopmentStreamImpl()
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
    return PopPackage.Literals.DEVELOPMENT_STREAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MaintenanceStream> getMaintenanceStreams()
  {
    if (maintenanceStreams == null)
    {
      maintenanceStreams = new EObjectContainmentWithInverseEList.Resolving<MaintenanceStream>(MaintenanceStream.class,
          this, PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS, PopPackage.MAINTENANCE_STREAM__PARENT);
    }
    return maintenanceStreams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pop getPop()
  {
    if (eContainerFeatureID != PopPackage.DEVELOPMENT_STREAM__POP)
      return null;
    return (Pop)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pop basicGetPop()
  {
    if (eContainerFeatureID != PopPackage.DEVELOPMENT_STREAM__POP)
      return null;
    return (Pop)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPop(Pop newPop, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPop, PopPackage.DEVELOPMENT_STREAM__POP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPop(Pop newPop)
  {
    if (newPop != eInternalContainer() || (eContainerFeatureID != PopPackage.DEVELOPMENT_STREAM__POP && newPop != null))
    {
      if (EcoreUtil.isAncestor(this, newPop))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPop != null)
        msgs = ((InternalEObject)newPop).eInverseAdd(this, PopPackage.POP__ROOT_STREAM, Pop.class, msgs);
      msgs = basicSetPop(newPop, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.DEVELOPMENT_STREAM__POP, newPop, newPop));
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaintenanceStreams()).basicAdd(otherEnd, msgs);
    case PopPackage.DEVELOPMENT_STREAM__POP:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetPop((Pop)otherEnd, msgs);
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      return ((InternalEList<?>)getMaintenanceStreams()).basicRemove(otherEnd, msgs);
    case PopPackage.DEVELOPMENT_STREAM__POP:
      return basicSetPop(null, msgs);
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
    case PopPackage.DEVELOPMENT_STREAM__POP:
      return eInternalContainer().eInverseRemove(this, PopPackage.POP__ROOT_STREAM, Pop.class, msgs);
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      return getMaintenanceStreams();
    case PopPackage.DEVELOPMENT_STREAM__POP:
      if (resolve)
        return getPop();
      return basicGetPop();
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      getMaintenanceStreams().clear();
      getMaintenanceStreams().addAll((Collection<? extends MaintenanceStream>)newValue);
      return;
    case PopPackage.DEVELOPMENT_STREAM__POP:
      setPop((Pop)newValue);
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      getMaintenanceStreams().clear();
      return;
    case PopPackage.DEVELOPMENT_STREAM__POP:
      setPop((Pop)null);
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
    case PopPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS:
      return maintenanceStreams != null && !maintenanceStreams.isEmpty();
    case PopPackage.DEVELOPMENT_STREAM__POP:
      return basicGetPop() != null;
    }
    return super.eIsSet(featureID);
  }

} //DevelopmentStreamImpl
