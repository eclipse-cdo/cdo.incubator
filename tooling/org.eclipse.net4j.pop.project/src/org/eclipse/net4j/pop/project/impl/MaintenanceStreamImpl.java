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
 * $Id: MaintenanceStreamImpl.java,v 1.5 2008-08-01 09:36:24 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.project.DevelopmentStream;
import org.eclipse.net4j.pop.project.MaintenanceStream;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Release;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Maintenance Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MaintenanceStreamImpl extends IntegrationStreamImpl implements MaintenanceStream
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected DevelopmentStream parent;

  /**
   * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBaseline()
   * @generated
   * @ordered
   */
  protected Release baseline;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MaintenanceStreamImpl()
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
    return ProjectPackage.Literals.MAINTENANCE_STREAM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentStream getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (DevelopmentStream)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.MAINTENANCE_STREAM__PARENT,
              oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentStream basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DevelopmentStream newParent, NotificationChain msgs)
  {
    DevelopmentStream oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.MAINTENANCE_STREAM__PARENT, oldParent, newParent);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DevelopmentStream newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, ProjectPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS,
            DevelopmentStream.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, ProjectPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS,
            DevelopmentStream.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.MAINTENANCE_STREAM__PARENT, newParent,
          newParent));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Release getBaseline()
  {
    if (baseline != null && baseline.eIsProxy())
    {
      InternalEObject oldBaseline = (InternalEObject)baseline;
      baseline = (Release)eResolveProxy(oldBaseline);
      if (baseline != oldBaseline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.MAINTENANCE_STREAM__BASELINE,
              oldBaseline, baseline));
      }
    }
    return baseline;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Release basicGetBaseline()
  {
    return baseline;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseline(Release newBaseline, NotificationChain msgs)
  {
    Release oldBaseline = baseline;
    baseline = newBaseline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          ProjectPackage.MAINTENANCE_STREAM__BASELINE, oldBaseline, newBaseline);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setBaseline(Release newBaseline)
  {
    if (newBaseline != baseline)
    {
      NotificationChain msgs = null;
      if (baseline != null)
        msgs = ((InternalEObject)baseline).eInverseRemove(this, ProjectPackage.RELEASE__MAINTENANCE, Release.class,
            msgs);
      if (newBaseline != null)
        msgs = ((InternalEObject)newBaseline).eInverseAdd(this, ProjectPackage.RELEASE__MAINTENANCE, Release.class,
            msgs);
      msgs = basicSetBaseline(newBaseline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.MAINTENANCE_STREAM__BASELINE, newBaseline,
          newBaseline));
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, ProjectPackage.DEVELOPMENT_STREAM__MAINTENANCE_STREAMS,
            DevelopmentStream.class, msgs);
      return basicSetParent((DevelopmentStream)otherEnd, msgs);
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      if (baseline != null)
        msgs = ((InternalEObject)baseline).eInverseRemove(this, ProjectPackage.RELEASE__MAINTENANCE, Release.class,
            msgs);
      return basicSetBaseline((Release)otherEnd, msgs);
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      return basicSetParent(null, msgs);
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      return basicSetBaseline(null, msgs);
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      if (resolve) return getParent();
      return basicGetParent();
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      if (resolve) return getBaseline();
      return basicGetBaseline();
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      setParent((DevelopmentStream)newValue);
      return;
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      setBaseline((Release)newValue);
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      setParent((DevelopmentStream)null);
      return;
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      setBaseline((Release)null);
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
    case ProjectPackage.MAINTENANCE_STREAM__PARENT:
      return parent != null;
    case ProjectPackage.MAINTENANCE_STREAM__BASELINE:
      return baseline != null;
    }
    return super.eIsSet(featureID);
  }

} // MaintenanceStreamImpl
