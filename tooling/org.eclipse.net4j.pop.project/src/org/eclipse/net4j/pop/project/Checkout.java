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
 * $Id: Checkout.java,v 1.1 2008-08-05 05:54:20 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.PopElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.Checkout#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getCheckout()
 * @model
 * @generated
 */
public interface Checkout extends PopElement
{
  /**
   * Returns the value of the '<em><b>Discriminator</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.CheckoutDiscriminator#getCheckouts <em>Checkouts</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator</em>' reference.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCheckout_Discriminator()
   * @see org.eclipse.net4j.pop.project.CheckoutDiscriminator#getCheckouts
   * @model opposite="checkouts" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  CheckoutDiscriminator getDiscriminator();

} // Checkout
