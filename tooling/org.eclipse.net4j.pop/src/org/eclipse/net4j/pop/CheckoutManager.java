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
 * $Id: CheckoutManager.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutManager#getPop <em>Pop</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutManager#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutManager#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.CheckoutManager#getActiveCheckout <em>Active Checkout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getCheckoutManager()
 * @model
 * @generated
 */
public interface CheckoutManager extends PopElement
{
  /**
   * Returns the value of the '<em><b>Pop</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Pop}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop</em>' reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutManager_Pop()
   * @model required="true"
   * @generated
   */
  EList<Pop> getPop();

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutManager_Location()
   * @model dataType="org.eclipse.net4j.pop.Path" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  IPath getLocation();

  /**
   * Returns the value of the '<em><b>Checkouts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Checkout}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Checkout#getManager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkouts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkouts</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutManager_Checkouts()
   * @see org.eclipse.net4j.pop.Checkout#getManager
   * @model opposite="manager" containment="true"
   * @generated
   */
  EList<Checkout> getCheckouts();

  /**
   * Returns the value of the '<em><b>Active Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Checkout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active Checkout</em>' reference.
   * @see #setActiveCheckout(Checkout)
   * @see org.eclipse.net4j.pop.PopPackage#getCheckoutManager_ActiveCheckout()
   * @model resolveProxies="false"
   * @generated
   */
  Checkout getActiveCheckout();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.CheckoutManager#getActiveCheckout <em>Active Checkout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active Checkout</em>' reference.
   * @see #getActiveCheckout()
   * @generated
   */
  void setActiveCheckout(Checkout value);

} // CheckoutManager
