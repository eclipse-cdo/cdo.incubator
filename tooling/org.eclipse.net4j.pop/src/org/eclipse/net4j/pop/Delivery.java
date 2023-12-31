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
 * $Id: Delivery.java,v 1.3 2008-08-09 18:31:08 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Delivery</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Delivery#getStream <em>Stream</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Delivery#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Delivery#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Delivery#getMerges <em>Merges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getDelivery()
 * @model
 * @generated
 */
public interface Delivery extends TaggedElement
{
  /**
   * Returns the value of the '<em><b>Stream</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.DeliveryStream#getDeliveries <em>Deliveries</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' container reference.
   * @see #setStream(DeliveryStream)
   * @see org.eclipse.net4j.pop.PopPackage#getDelivery_Stream()
   * @see org.eclipse.net4j.pop.DeliveryStream#getDeliveries
   * @model opposite="deliveries" required="true" transient="false"
   * @generated
   */
  DeliveryStream getStream();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Delivery#getStream <em>Stream</em>}' container reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Stream</em>' container reference.
   * @see #getStream()
   * @generated
   */
  void setStream(DeliveryStream value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.eclipse.net4j.pop.PopPackage#getDelivery_Number()
   * @model required="true"
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Delivery#getNumber <em>Number</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(Date)
   * @see org.eclipse.net4j.pop.PopPackage#getDelivery_Date()
   * @model required="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Delivery#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Merges</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Integration}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Integration#getDelivery <em>Delivery</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Merges</em>' reference list isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Merges</em>' reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getDelivery_Merges()
   * @see org.eclipse.net4j.pop.Integration#getDelivery
   * @model opposite="delivery"
   * @generated
   */
  EList<Integration> getMerges();

} // Delivery
