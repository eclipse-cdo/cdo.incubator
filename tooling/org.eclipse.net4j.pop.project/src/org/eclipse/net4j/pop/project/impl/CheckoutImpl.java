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
 * $Id: CheckoutImpl.java,v 1.1 2008-08-05 05:54:20 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.Checkout;
import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.pop.project.ProjectPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Checkout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.impl.CheckoutImpl#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CheckoutImpl extends PopElementImpl implements Checkout
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected CheckoutImpl()
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
    return ProjectPackage.Literals.CHECKOUT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CheckoutDiscriminator getDiscriminator()
  {
    CheckoutDiscriminator discriminator = basicGetDiscriminator();
    return discriminator != null && discriminator.eIsProxy() ? (CheckoutDiscriminator)eResolveProxy((InternalEObject)discriminator)
        : discriminator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CheckoutDiscriminator basicGetDiscriminator()
  {
    // TODO: implement this method to return the 'Discriminator' reference
    // -> do not perform proxy resolution
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
    case ProjectPackage.CHECKOUT__DISCRIMINATOR:
      if (resolve)
      {
        return getDiscriminator();
      }
      return basicGetDiscriminator();
    }
    return super.eGet(featureID, resolve, coreType);
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
    case ProjectPackage.CHECKOUT__DISCRIMINATOR:
      return basicGetDiscriminator() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public String getIdType()
  {
    return "checkout";
  }

  /**
   * @ADDED
   */
  @Override
  public String getIdValue()
  {
    return ((CheckoutDiscriminatorImpl)getDiscriminator()).getIdValue();
  }

} // CheckoutImpl
