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
 * $Id: PDEProjectImpl.java,v 1.3 2008-08-05 14:47:44 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.PDEProject;
import org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Project</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.pde.impl.PDEProjectImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PDEProjectImpl extends WorkspaceProjectImpl implements PDEProject
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PDEProjectImpl()
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
    return PDEPackage.Literals.PDE_PROJECT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEEntity getEntity()
  {
    // TODO: implement this method to return the 'Entity' containment reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(PDEEntity newEntity, NotificationChain msgs)
  {
    // TODO: implement this method to set the contained 'Entity' containment reference
    // -> this method is automatically invoked to keep the containment relationship in synch
    // -> do not modify other features
    // -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
    case PDEPackage.PDE_PROJECT__ENTITY:
      return basicSetEntity(null, msgs);
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
    case PDEPackage.PDE_PROJECT__ENTITY:
      return getEntity();
    }
    return super.eGet(featureID, resolve, coreType);
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
    case PDEPackage.PDE_PROJECT__ENTITY:
      return getEntity() != null;
    }
    return super.eIsSet(featureID);
  }

} // PDEProjectImpl
