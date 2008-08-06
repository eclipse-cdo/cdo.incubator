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
 * $Id: RepositoryModuleImpl.java,v 1.4 2008-08-06 06:23:58 estepper Exp $
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository Module</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getPopProject <em>Pop Project</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapter <em>Adapter</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapterType <em>Adapter Type</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getAdapterDescriptor <em>Adapter Descriptor</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.impl.RepositoryModuleImpl#getModuleDescriptor <em>Module Descriptor</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class RepositoryModuleImpl extends PopElementImpl implements RepositoryModule
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
   * The default value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRepositoryDescription()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRepositoryDescription()
   * @generated
   * @ordered
   */
  protected String repositoryDescription = REPOSITORY_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getModuleDescription() <em>Module Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getModuleDescription()
   * @generated
   * @ordered
   */
  protected static final String MODULE_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModuleDescription() <em>Module Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getModuleDescription()
   * @generated
   * @ordered
   */
  protected String moduleDescription = MODULE_DESCRIPTION_EDEFAULT;

  /**
   * @ADDED
   */
  private IRepositoryAdapter adapter;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RepositoryModuleImpl()
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
    return ProjectPackage.Literals.REPOSITORY_MODULE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PopProject getPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.REPOSITORY_MODULE__POP_PROJECT)
      return null;
    return (PopProject)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PopProject basicGetPopProject()
  {
    if (eContainerFeatureID != ProjectPackage.REPOSITORY_MODULE__POP_PROJECT)
      return null;
    return (PopProject)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPopProject(PopProject newPopProject, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPopProject, ProjectPackage.REPOSITORY_MODULE__POP_PROJECT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
        throw new IllegalStateException("Unrecognized repository adapter type");
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE,
          oldAdapterType, adapterType));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getRepositoryDescription()
  {
    return repositoryDescription;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setRepositoryDescription(String newRepositoryDescription)
  {
    String oldRepositoryDescription = repositoryDescription;
    repositoryDescription = newRepositoryDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__REPOSITORY_DESCRIPTION,
          oldRepositoryDescription, repositoryDescription));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getModuleDescription()
  {
    return moduleDescription;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setModuleDescription(String newModuleDescription)
  {
    String oldModuleDescription = moduleDescription;
    moduleDescription = newModuleDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTION,
          oldModuleDescription, moduleDescription));
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetPopProject((PopProject)otherEnd, msgs);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return basicSetPopProject(null, msgs);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return eInternalContainer().eInverseRemove(this, ProjectPackage.POP_PROJECT__PRIMARY_MODULE, PopProject.class,
          msgs);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      if (resolve)
        return getPopProject();
      return basicGetPopProject();
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER:
      return getAdapter();
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      return getAdapterType();
    case ProjectPackage.REPOSITORY_MODULE__REPOSITORY_DESCRIPTION:
      return getRepositoryDescription();
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTION:
      return getModuleDescription();
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      setPopProject((PopProject)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      setAdapterType((String)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__REPOSITORY_DESCRIPTION:
      setRepositoryDescription((String)newValue);
      return;
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTION:
      setModuleDescription((String)newValue);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      setPopProject((PopProject)null);
      return;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      setAdapterType(ADAPTER_TYPE_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY_MODULE__REPOSITORY_DESCRIPTION:
      setRepositoryDescription(REPOSITORY_DESCRIPTION_EDEFAULT);
      return;
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTION:
      setModuleDescription(MODULE_DESCRIPTION_EDEFAULT);
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
    case ProjectPackage.REPOSITORY_MODULE__POP_PROJECT:
      return basicGetPopProject() != null;
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER:
      return ADAPTER_EDEFAULT == null ? getAdapter() != null : !ADAPTER_EDEFAULT.equals(getAdapter());
    case ProjectPackage.REPOSITORY_MODULE__ADAPTER_TYPE:
      return ADAPTER_TYPE_EDEFAULT == null ? adapterType != null : !ADAPTER_TYPE_EDEFAULT.equals(adapterType);
    case ProjectPackage.REPOSITORY_MODULE__REPOSITORY_DESCRIPTION:
      return REPOSITORY_DESCRIPTION_EDEFAULT == null ? repositoryDescription != null : !REPOSITORY_DESCRIPTION_EDEFAULT
          .equals(repositoryDescription);
    case ProjectPackage.REPOSITORY_MODULE__MODULE_DESCRIPTION:
      return MODULE_DESCRIPTION_EDEFAULT == null ? moduleDescription != null : !MODULE_DESCRIPTION_EDEFAULT
          .equals(moduleDescription);
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
    result.append(" (adapterType: "); //$NON-NLS-1$
    result.append(adapterType);
    result.append(", repositoryDescription: "); //$NON-NLS-1$
    result.append(repositoryDescription);
    result.append(", moduleDescription: "); //$NON-NLS-1$
    result.append(moduleDescription);
    result.append(')');
    return result.toString();
  }

} // RepositoryModuleImpl
