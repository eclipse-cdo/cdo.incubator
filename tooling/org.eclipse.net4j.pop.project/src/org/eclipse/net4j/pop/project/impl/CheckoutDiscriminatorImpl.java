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
 * $Id: CheckoutDiscriminatorImpl.java,v 1.2 2008-08-05 06:45:17 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.impl.PopElementImpl;
import org.eclipse.net4j.pop.project.Checkout;
import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Checkout Discriminator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.impl.CheckoutDiscriminatorImpl#getCheckouts <em>Checkouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CheckoutDiscriminatorImpl extends PopElementImpl implements CheckoutDiscriminator
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CheckoutDiscriminatorImpl()
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
    return ProjectPackage.Literals.CHECKOUT_DISCRIMINATOR;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public EList<Checkout> getCheckouts()
  {
    PopProjectImpl popProject = (PopProjectImpl)getPopProject();
    ICheckoutManager checkoutManager = popProject.getCheckoutManager();
    return checkoutManager.getCheckouts(this);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public abstract PopProject getPopProject();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ProjectPackage.CHECKOUT_DISCRIMINATOR__CHECKOUTS:
      return getCheckouts();
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
    case ProjectPackage.CHECKOUT_DISCRIMINATOR__CHECKOUTS:
      return !getCheckouts().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // CheckoutDiscriminatorImpl
