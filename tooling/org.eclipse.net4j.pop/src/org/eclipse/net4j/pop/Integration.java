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
 * $Id: Integration.java,v 1.3 2008-08-09 18:31:08 estepper Exp $
 */
package org.eclipse.net4j.pop;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Integration</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Integration#getStream <em>Stream</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Integration#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Integration#getDelivery <em>Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getIntegration()
 * @model
 * @generated
 */
public interface Integration extends TaggedElement
{
  /**
   * Returns the value of the '<em><b>Stream</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Stream#getIntegrations <em>Integrations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' container reference.
   * @see #setStream(Stream)
   * @see org.eclipse.net4j.pop.PopPackage#getIntegration_Stream()
   * @see org.eclipse.net4j.pop.Stream#getIntegrations
   * @model opposite="integrations" required="true" transient="false"
   * @generated
   */
  Stream getStream();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Integration#getStream <em>Stream</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' container reference.
   * @see #getStream()
   * @generated
   */
  void setStream(Stream value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(Date)
   * @see org.eclipse.net4j.pop.PopPackage#getIntegration_Date()
   * @model required="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Integration#getDate <em>Date</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Delivery</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Delivery#getMerges <em>Merges</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delivery</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delivery</em>' reference.
   * @see #setDelivery(Delivery)
   * @see org.eclipse.net4j.pop.PopPackage#getIntegration_Delivery()
   * @see org.eclipse.net4j.pop.Delivery#getMerges
   * @model opposite="merges" required="true"
   * @generated
   */
  Delivery getDelivery();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Integration#getDelivery <em>Delivery</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Delivery</em>' reference.
   * @see #getDelivery()
   * @generated
   */
  void setDelivery(Delivery value);

} // Integration
