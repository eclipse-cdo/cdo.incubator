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
 * $Id: Checkout.java,v 1.3 2008-08-09 09:58:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Checkout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.Checkout#getManager <em>Manager</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#getDiscriminator <em>Discriminator</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#isTransitioning <em>Transitioning</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#getState <em>State</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#isActive <em>Active</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification <em>Workspace Specification</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.PopPackage#getCheckout()
 * @model
 * @generated
 */
public interface Checkout extends PopElement
{
  /**
   * Returns the value of the '<em><b>Manager</b></em>' container reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.CheckoutManager#getCheckouts <em>Checkouts</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manager</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Manager</em>' container reference.
   * @see #setManager(CheckoutManager)
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_Manager()
   * @see org.eclipse.net4j.pop.CheckoutManager#getCheckouts
   * @model opposite="checkouts" resolveProxies="false" required="true" transient="false"
   * @generated
   */
  CheckoutManager getManager();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Checkout#getManager <em>Manager</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Manager</em>' container reference.
   * @see #getManager()
   * @generated
   */
  void setManager(CheckoutManager value);

  /**
   * Returns the value of the '<em><b>Discriminator</b></em>' reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.CheckoutDiscriminator#getCheckout <em>Checkout</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Discriminator</em>' reference.
   * @see #setDiscriminator(CheckoutDiscriminator)
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_Discriminator()
   * @see org.eclipse.net4j.pop.CheckoutDiscriminator#getCheckout
   * @model opposite="checkout" resolveProxies="false" required="true"
   * @generated
   */
  CheckoutDiscriminator getDiscriminator();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Checkout#getDiscriminator <em>Discriminator</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Discriminator</em>' reference.
   * @see #getDiscriminator()
   * @generated
   */
  void setDiscriminator(CheckoutDiscriminator value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Location</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_Location()
   * @model dataType="org.eclipse.net4j.pop.Path" required="true" transient="true" changeable="false" volatile="true"
   *        derived="true"
   * @generated
   */
  IPath getLocation();

  /**
   * Returns the value of the '<em><b>Transitioning</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitioning</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Transitioning</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_Transitioning()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  boolean isTransitioning();

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.net4j.pop.CheckoutState}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>State</em>' attribute.
   * @see org.eclipse.net4j.pop.CheckoutState
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_State()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  CheckoutState getState();

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Active</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_Active()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  boolean isActive();

  /**
   * Returns the value of the '<em><b>Workspace Specification</b></em>' reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout <em>Checkout</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Specification</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Workspace Specification</em>' reference.
   * @see #setWorkspaceSpecification(WorkspaceSpecification)
   * @see org.eclipse.net4j.pop.PopPackage#getCheckout_WorkspaceSpecification()
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout
   * @model opposite="checkout"
   * @generated
   */
  WorkspaceSpecification getWorkspaceSpecification();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification
   * <em>Workspace Specification</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Workspace Specification</em>' reference.
   * @see #getWorkspaceSpecification()
   * @generated
   */
  void setWorkspaceSpecification(WorkspaceSpecification value);

} // Checkout
