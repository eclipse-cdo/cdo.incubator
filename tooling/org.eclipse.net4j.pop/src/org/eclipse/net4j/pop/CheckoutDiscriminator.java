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
 * $Id: CheckoutDiscriminator.java,v 1.4 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.net4j.pop.repository.IRepositoryTag;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Checkout Discriminator</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutDiscriminator#getRepositoryTag <em>Repository Tag</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutDiscriminator#getCheckout <em>Checkout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getCheckoutDiscriminator()
 * @model abstract="true"
 * @generated
 */
public interface CheckoutDiscriminator extends PopElement
{
  /**
   * Returns the value of the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Tag</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository Tag</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutDiscriminator_RepositoryTag()
   * @model dataType="org.eclipse.net4j.pop.RepositoryTag" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  IRepositoryTag getRepositoryTag();

  /**
   * Returns the value of the '<em><b>Checkout</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Checkout#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkout</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkout</em>' reference.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutDiscriminator_Checkout()
   * @see org.eclipse.net4j.pop.Checkout#getDiscriminator
   * @model opposite="discriminator" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  Checkout getCheckout();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  Repository getRepository();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true"
   * @generated
   */
  boolean hasCheckout();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true"
   * @generated
   */
  Checkout checkout();

} // CheckoutDiscriminator
