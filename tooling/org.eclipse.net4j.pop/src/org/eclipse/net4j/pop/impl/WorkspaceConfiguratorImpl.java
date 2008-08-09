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
 * $Id: WorkspaceConfiguratorImpl.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.WorkspaceConfigurator;
import org.eclipse.net4j.pop.WorkspaceSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workspace Configurator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.WorkspaceConfiguratorImpl#getWorkspaceSpecification <em>Workspace Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkspaceConfiguratorImpl extends PopElementImpl implements WorkspaceConfigurator
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceConfiguratorImpl()
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
    return PopPackage.Literals.WORKSPACE_CONFIGURATOR;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceSpecification getWorkspaceSpecification()
  {
    if (eContainerFeatureID != PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION)
      return null;
    return (WorkspaceSpecification)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceSpecification basicGetWorkspaceSpecification()
  {
    if (eContainerFeatureID != PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION)
      return null;
    return (WorkspaceSpecification)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkspaceSpecification(WorkspaceSpecification newWorkspaceSpecification,
      NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newWorkspaceSpecification,
        PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWorkspaceSpecification(WorkspaceSpecification newWorkspaceSpecification)
  {
    if (newWorkspaceSpecification != eInternalContainer()
        || (eContainerFeatureID != PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION && newWorkspaceSpecification != null))
    {
      if (EcoreUtil.isAncestor(this, newWorkspaceSpecification))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newWorkspaceSpecification != null)
        msgs = ((InternalEObject)newWorkspaceSpecification).eInverseAdd(this,
            PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS, WorkspaceSpecification.class, msgs);
      msgs = basicSetWorkspaceSpecification(newWorkspaceSpecification, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION,
          newWorkspaceSpecification, newWorkspaceSpecification));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void validate()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void execute()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetWorkspaceSpecification((WorkspaceSpecification)otherEnd, msgs);
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      return basicSetWorkspaceSpecification(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      return eInternalContainer().eInverseRemove(this, PopPackage.WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS,
          WorkspaceSpecification.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      if (resolve)
        return getWorkspaceSpecification();
      return basicGetWorkspaceSpecification();
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      setWorkspaceSpecification((WorkspaceSpecification)newValue);
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      setWorkspaceSpecification((WorkspaceSpecification)null);
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
    case PopPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION:
      return basicGetWorkspaceSpecification() != null;
    }
    return super.eIsSet(featureID);
  }

} // WorkspaceConfiguratorImpl
