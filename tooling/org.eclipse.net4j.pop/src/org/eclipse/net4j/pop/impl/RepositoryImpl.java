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
 * $Id: RepositoryImpl.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.MainBranch;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.RepositoryImpl#getPop <em>Pop</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.RepositoryImpl#getAdapter <em>Adapter</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.RepositoryImpl#getAdapterType <em>Adapter Type</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.RepositoryImpl#getDescriptor <em>Descriptor</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.impl.RepositoryImpl#getMainBranch <em>Main Branch</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryImpl extends PopElementImpl implements Repository
{
  /**
   * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAdapter()
   * @generated
   * @ordered
   */
  protected static final IRepositoryAdapter ADAPTER_EDEFAULT = null;

  /**
   * The default value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected String adapterType = ADAPTER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getDescriptor()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getDescriptor()
   * @generated
   * @ordered
   */
  protected String descriptor = DESCRIPTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getMainBranch() <em>Main Branch</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getMainBranch()
   * @generated
   * @ordered
   */
  protected MainBranch mainBranch;

  /**
   * @ADDED
   */
  private IRepositoryAdapter adapter;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RepositoryImpl()
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
    return PopPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop getPop()
  {
    if (eContainerFeatureID != PopPackage.REPOSITORY__POP)
    {
      return null;
    }
    return (Pop)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Pop basicGetPop()
  {
    if (eContainerFeatureID != PopPackage.REPOSITORY__POP)
    {
      return null;
    }
    return (Pop)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPop(Pop newPop, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPop, PopPackage.REPOSITORY__POP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPop(Pop newPop)
  {
    if (newPop != eInternalContainer() || eContainerFeatureID != PopPackage.REPOSITORY__POP && newPop != null)
    {
      if (EcoreUtil.isAncestor(this, newPop))
      {
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      }
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      if (newPop != null)
      {
        msgs = ((InternalEObject)newPop).eInverseAdd(this, PopPackage.POP__REPOSITORY, Pop.class, msgs);
      }
      msgs = basicSetPop(newPop, msgs);
      if (msgs != null)
      {
        msgs.dispatch();
      }
    }
    else if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.REPOSITORY__POP, newPop, newPop));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public synchronized IRepositoryAdapter getAdapter()
  {
    if (adapter == null)
    {
      adapter = IRepositoryAdapter.Registry.INSTANCE.get(adapterType);
      if (adapter == null)
      {
        throw new IllegalStateException("Unrecognized repository adapter type: " + adapterType);
      }
    }

    return adapter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getAdapterType()
  {
    return adapterType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void setAdapterType(String newAdapterType)
  {
    String oldAdapterType = null;
    synchronized (this)
    {
      oldAdapterType = adapterType;
      adapterType = newAdapterType;
      adapter = null;
    }

    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.REPOSITORY__ADAPTER_TYPE, oldAdapterType,
          adapterType));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getDescriptor()
  {
    return descriptor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDescriptor(String newDescriptor)
  {
    String oldDescriptor = descriptor;
    descriptor = newDescriptor;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.REPOSITORY__DESCRIPTOR, oldDescriptor,
          descriptor));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public MainBranch getMainBranch()
  {
    if (mainBranch != null && mainBranch.eIsProxy())
    {
      InternalEObject oldMainBranch = (InternalEObject)mainBranch;
      mainBranch = (MainBranch)eResolveProxy(oldMainBranch);
      if (mainBranch != oldMainBranch)
      {
        InternalEObject newMainBranch = (InternalEObject)mainBranch;
        NotificationChain msgs = oldMainBranch.eInverseRemove(this, PopPackage.MAIN_BRANCH__REPOSITORY,
            MainBranch.class, null);
        if (newMainBranch.eInternalContainer() == null)
        {
          msgs = newMainBranch.eInverseAdd(this, PopPackage.MAIN_BRANCH__REPOSITORY, MainBranch.class, msgs);
        }
        if (msgs != null)
        {
          msgs.dispatch();
        }
        if (eNotificationRequired())
        {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PopPackage.REPOSITORY__MAIN_BRANCH, oldMainBranch,
              mainBranch));
        }
      }
    }
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public MainBranch basicGetMainBranch()
  {
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetMainBranch(MainBranch newMainBranch, NotificationChain msgs)
  {
    MainBranch oldMainBranch = mainBranch;
    mainBranch = newMainBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          PopPackage.REPOSITORY__MAIN_BRANCH, oldMainBranch, newMainBranch);
      if (msgs == null)
      {
        msgs = notification;
      }
      else
      {
        msgs.add(notification);
      }
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setMainBranch(MainBranch newMainBranch)
  {
    if (newMainBranch != mainBranch)
    {
      NotificationChain msgs = null;
      if (mainBranch != null)
      {
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, PopPackage.MAIN_BRANCH__REPOSITORY, MainBranch.class,
            msgs);
      }
      if (newMainBranch != null)
      {
        msgs = ((InternalEObject)newMainBranch).eInverseAdd(this, PopPackage.MAIN_BRANCH__REPOSITORY, MainBranch.class,
            msgs);
      }
      msgs = basicSetMainBranch(newMainBranch, msgs);
      if (msgs != null)
      {
        msgs.dispatch();
      }
    }
    else if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.REPOSITORY__MAIN_BRANCH, newMainBranch,
          newMainBranch));
    }
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
    case PopPackage.REPOSITORY__POP:
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      return basicSetPop((Pop)otherEnd, msgs);
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      if (mainBranch != null)
      {
        msgs = ((InternalEObject)mainBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - PopPackage.REPOSITORY__MAIN_BRANCH, null, msgs);
      }
      return basicSetMainBranch((MainBranch)otherEnd, msgs);
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
    case PopPackage.REPOSITORY__POP:
      return basicSetPop(null, msgs);
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      return basicSetMainBranch(null, msgs);
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
    case PopPackage.REPOSITORY__POP:
      return eInternalContainer().eInverseRemove(this, PopPackage.POP__REPOSITORY, Pop.class, msgs);
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
    case PopPackage.REPOSITORY__POP:
      if (resolve)
      {
        return getPop();
      }
      return basicGetPop();
    case PopPackage.REPOSITORY__ADAPTER:
      return getAdapter();
    case PopPackage.REPOSITORY__ADAPTER_TYPE:
      return getAdapterType();
    case PopPackage.REPOSITORY__DESCRIPTOR:
      return getDescriptor();
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      if (resolve)
      {
        return getMainBranch();
      }
      return basicGetMainBranch();
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
    case PopPackage.REPOSITORY__POP:
      setPop((Pop)newValue);
      return;
    case PopPackage.REPOSITORY__ADAPTER_TYPE:
      setAdapterType((String)newValue);
      return;
    case PopPackage.REPOSITORY__DESCRIPTOR:
      setDescriptor((String)newValue);
      return;
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)newValue);
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
    case PopPackage.REPOSITORY__POP:
      setPop((Pop)null);
      return;
    case PopPackage.REPOSITORY__ADAPTER_TYPE:
      setAdapterType(ADAPTER_TYPE_EDEFAULT);
      return;
    case PopPackage.REPOSITORY__DESCRIPTOR:
      setDescriptor(DESCRIPTOR_EDEFAULT);
      return;
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      setMainBranch((MainBranch)null);
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
    case PopPackage.REPOSITORY__POP:
      return basicGetPop() != null;
    case PopPackage.REPOSITORY__ADAPTER:
      return ADAPTER_EDEFAULT == null ? getAdapter() != null : !ADAPTER_EDEFAULT.equals(getAdapter());
    case PopPackage.REPOSITORY__ADAPTER_TYPE:
      return ADAPTER_TYPE_EDEFAULT == null ? adapterType != null : !ADAPTER_TYPE_EDEFAULT.equals(adapterType);
    case PopPackage.REPOSITORY__DESCRIPTOR:
      return DESCRIPTOR_EDEFAULT == null ? descriptor != null : !DESCRIPTOR_EDEFAULT.equals(descriptor);
    case PopPackage.REPOSITORY__MAIN_BRANCH:
      return mainBranch != null;
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
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (adapterType: "); //$NON-NLS-1$
    result.append(adapterType);
    result.append(", descriptor: "); //$NON-NLS-1$
    result.append(descriptor);
    result.append(')');
    return result.toString();
  }

} // RepositoryImpl
