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
 * $Id: PDEConfiguratorImpl.java,v 1.1 2008-08-01 07:53:34 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.net4j.pop.pde.PDEConfigurator;
import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;

import org.eclipse.net4j.pop.product.impl.WorkspaceConfiguratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.pde.impl.PDEConfiguratorImpl#getAllEntities <em>All Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PDEConfiguratorImpl extends WorkspaceConfiguratorImpl implements PDEConfigurator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDEConfiguratorImpl()
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
    return PDEPackage.Literals.PDE_CONFIGURATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PDEEntity> getAllEntities()
  {
    // TODO: implement this method to return the 'All Entities' reference list
    // Ensure that you remove @generated or mark it @generated NOT
    // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
    // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
    throw new UnsupportedOperationException();
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
    case PDEPackage.PDE_CONFIGURATOR__ALL_ENTITIES:
      return getAllEntities();
    }
    return super.eGet(featureID, resolve, coreType);
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
    case PDEPackage.PDE_CONFIGURATOR__ALL_ENTITIES:
      return !getAllEntities().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PDEConfiguratorImpl
