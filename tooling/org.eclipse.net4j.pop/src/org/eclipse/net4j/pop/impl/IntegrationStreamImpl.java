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
 * $Id: IntegrationStreamImpl.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.DeliveryStream;
import org.eclipse.net4j.pop.IntegrationStream;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Release;
import org.eclipse.net4j.pop.Stream;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Integration Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.IntegrationStreamImpl#getDeliveryStreams <em>Delivery Streams</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.IntegrationStreamImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class IntegrationStreamImpl extends StreamImpl implements IntegrationStream
{
  /**
   * The cached value of the '{@link #getDeliveryStreams() <em>Delivery Streams</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDeliveryStreams()
   * @generated
   * @ordered
   */
  protected EList<DeliveryStream> deliveryStreams;

  /**
   * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getReleases()
   * @generated
   * @ordered
   */
  protected EList<Release> releases;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected IntegrationStreamImpl()
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
    return PopPackage.Literals.INTEGRATION_STREAM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<DeliveryStream> getDeliveryStreams()
  {
    if (deliveryStreams == null)
    {
      deliveryStreams = new EObjectContainmentWithInverseEList.Resolving<DeliveryStream>(DeliveryStream.class, this,
          PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS, PopPackage.DELIVERY_STREAM__PARENT);
    }
    return deliveryStreams;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Release> getReleases()
  {
    if (releases == null)
    {
      releases = new EObjectContainmentWithInverseEList.Resolving<Release>(Release.class, this,
          PopPackage.INTEGRATION_STREAM__RELEASES, PopPackage.RELEASE__STREAM);
    }
    return releases;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeliveryStreams()).basicAdd(otherEnd, msgs);
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleases()).basicAdd(otherEnd, msgs);
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
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      return ((InternalEList<?>)getDeliveryStreams()).basicRemove(otherEnd, msgs);
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      return getDeliveryStreams();
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      return getReleases();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      getDeliveryStreams().clear();
      getDeliveryStreams().addAll((Collection<? extends DeliveryStream>)newValue);
      return;
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      getReleases().clear();
      getReleases().addAll((Collection<? extends Release>)newValue);
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
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      getDeliveryStreams().clear();
      return;
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      getReleases().clear();
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
    case PopPackage.INTEGRATION_STREAM__DELIVERY_STREAMS:
      return deliveryStreams != null && !deliveryStreams.isEmpty();
    case PopPackage.INTEGRATION_STREAM__RELEASES:
      return releases != null && !releases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public void collectStreams(EList<Stream> streams)
  {
    streams.addAll(getDeliveryStreams());
  }
} // IntegrationStreamImpl
