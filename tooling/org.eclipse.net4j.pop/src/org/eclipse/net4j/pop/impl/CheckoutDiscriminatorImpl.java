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
 * $Id: CheckoutDiscriminatorImpl.java,v 1.1 2008-08-07 17:42:13 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutDiscriminator;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.repository.IRepositoryTag;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkout Discriminator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl#getRepositoryTag <em>Repository Tag</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl#getCheckout <em>Checkout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CheckoutDiscriminatorImpl extends PopElementImpl implements CheckoutDiscriminator
{
  /**
   * The default value of the '{@link #getRepositoryTag() <em>Repository Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryTag()
   * @generated
   * @ordered
   */
  protected static final IRepositoryTag REPOSITORY_TAG_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckoutDiscriminatorImpl()
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
    return PopPackage.Literals.CHECKOUT_DISCRIMINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositoryTag getRepositoryTag()
  {
    // TODO: implement this method to return the 'Repository Tag' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkout getCheckout()
  {
    // TODO: implement this method to return the 'Checkout' reference
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository getRepository()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean hasCheckout()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkout checkout()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
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
    case PopPackage.CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG:
      return getRepositoryTag();
    case PopPackage.CHECKOUT_DISCRIMINATOR__CHECKOUT:
      return getCheckout();
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
    case PopPackage.CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG:
      return REPOSITORY_TAG_EDEFAULT == null ? getRepositoryTag() != null : !REPOSITORY_TAG_EDEFAULT
          .equals(getRepositoryTag());
    case PopPackage.CHECKOUT_DISCRIMINATOR__CHECKOUT:
      return getCheckout() != null;
    }
    return super.eIsSet(featureID);
  }

} //CheckoutDiscriminatorImpl