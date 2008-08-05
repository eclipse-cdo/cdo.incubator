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
 * $Id: RepositoryModuleImpl.java,v 1.1 2008-08-05 14:48:09 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.RepositoryModule;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapterDescriptor <em>Adapter Descriptor</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getModuleDescriptor <em>Module Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RepositoryModuleImpl extends PopElementImpl implements RepositoryModule
{
  /**
   * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapter()
   * @generated
   * @ordered
   */
  protected static final IRepositoryAdapter ADAPTER_EDEFAULT = null;

  /**
   * The default value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterType()
   * @generated
   * @ordered
   */
  protected String adapterType = ADAPTER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAdapterDescriptor() <em>Adapter Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterDescriptor()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_DESCRIPTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterDescriptor() <em>Adapter Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterDescriptor()
   * @generated
   * @ordered
   */
  protected String adapterDescriptor = ADAPTER_DESCRIPTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getModuleDescriptor() <em>Module Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleDescriptor()
   * @generated
   * @ordered
   */
  protected static final String MODULE_DESCRIPTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModuleDescriptor() <em>Module Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleDescriptor()
   * @generated
   * @ordered
   */
  protected String moduleDescriptor = MODULE_DESCRIPTOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryModuleImpl()
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
    return ProjectPackage.Literals.REPOSITORY_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopProject getPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.REPOSITORY_MODULE__POP_PROJECT)
      return null;
    return (PopProject)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.REPOSITORY_MODULE__POP_PROJECT)
      return null;
    return (PopProject)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPopProject, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopProject(PopProject newPopProject)
  {
    if (newPopProject != eInternalContainer()
        || (eContainerFeatureID != ProjectPackage.REPOSITORY_MODULE__POP_PROJECT && newPopProject != null))
    {
      if (EcoreUtil.isAncestor(this, newPopProject))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPopProject != null)
        msgs = ((InternalEObject)newPopProject).eInverseAdd(this, ProjectPackage.POP_PROJECT__PRIMARY_MODULE,
            PopProject.class, msgs);
      msgs = basicSetPopProject(newPopProject, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT,
          newPopProject, newPopProject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositoryAdapter getAdapter()
  {
    // TODO: implement this method to return the 'Adapter' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdapterType()
  {
    return adapterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapterType(String newAdapterType)
  {
    String oldAdapterType = adapterType;
    adapterType = newAdapterType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE,
          oldAdapterType, adapterType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdapterDescriptor()
  {
    return adapterDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapterDescriptor(String newAdapterDescriptor)
  {
    String oldAdapterDescriptor = adapterDescriptor;
    adapterDescriptor = newAdapterDescriptor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__ADAPTER_DESCRIPTOR,
          oldAdapterDescriptor, adapterDescriptor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModuleDescriptor()
  {
    return moduleDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModuleDescriptor(String newModuleDescriptor)
  {
    String oldModuleDescriptor = moduleDescriptor;
    moduleDescriptor = newModuleDescriptor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTOR,
          oldModuleDescriptor, moduleDescriptor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetPopProject((PopProject)otherEnd, msgs);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return basicSetPopProject(null, msgs);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return eInternalContainer().eInverseRemove(this, ProjectPackage.POP_PROJECT__PRIMARY_MODULE, PopProject.class,
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      if (resolve)
        return getPopProject();
      return basicGetPopProject();
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER:
      return getAdapter();
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      return getAdapterType();
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_DESCRIPTOR:
      return getAdapterDescriptor();
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTOR:
      return getModuleDescriptor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      setPopProject((PopProject)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      setAdapterType((String)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_DESCRIPTOR:
      setAdapterDescriptor((String)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTOR:
      setModuleDescriptor((String)newValue);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      setPopProject((PopProject)null);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      setAdapterType(ADAPTER_TYPE_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_DESCRIPTOR:
      setAdapterDescriptor(ADAPTER_DESCRIPTOR_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTOR:
      setModuleDescriptor(MODULE_DESCRIPTOR_EDEFAULT);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return basicGetPopProject() != null;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER:
      return ADAPTER_EDEFAULT == null ? getAdapter() != null : !ADAPTER_EDEFAULT.equals(getAdapter());
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      return ADAPTER_TYPE_EDEFAULT == null ? adapterType != null : !ADAPTER_TYPE_EDEFAULT.equals(adapterType);
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_DESCRIPTOR:
      return ADAPTER_DESCRIPTOR_EDEFAULT == null ? adapterDescriptor != null : !ADAPTER_DESCRIPTOR_EDEFAULT
          .equals(adapterDescriptor);
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTOR:
      return MODULE_DESCRIPTOR_EDEFAULT == null ? moduleDescriptor != null : !MODULE_DESCRIPTOR_EDEFAULT
          .equals(moduleDescriptor);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (adapterType: "); //$NON-NLS-1$
    result.append(adapterType);
    result.append(", adapterDescriptor: "); //$NON-NLS-1$
    result.append(adapterDescriptor);
    result.append(", moduleDescriptor: "); //$NON-NLS-1$
    result.append(moduleDescriptor);
    result.append(')');
    return result.toString();
  }

} //RepositoryModuleImpl
