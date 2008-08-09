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
 * $Id: DeliveryStream.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Delivery Stream</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.DeliveryStream#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.DeliveryStream#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.DeliveryStream#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.DeliveryStream#getDeliveries <em>Deliveries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getDeliveryStream()
 * @model
 * @generated
 */
public interface DeliveryStream extends Stream
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.IntegrationStream#getDeliveryStreams <em>Delivery Streams</em>}'.
   * <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(IntegrationStream)
   * @see org.eclipse.net4j.pop.PopPackage#getDeliveryStream_Parent()
   * @see org.eclipse.net4j.pop.IntegrationStream#getDeliveryStreams
   * @model opposite="deliveryStreams" required="true" transient="false"
   * @generated
   */
  IntegrationStream getParent();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.DeliveryStream#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(IntegrationStream value);

  /**
   * Returns the value of the '<em><b>Baseline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Baseline</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baseline</em>' attribute.
   * @see #setBaseline(Date)
   * @see org.eclipse.net4j.pop.PopPackage#getDeliveryStream_Baseline()
   * @model required="true"
   * @generated
   */
  Date getBaseline();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.DeliveryStream#getBaseline <em>Baseline</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Baseline</em>' attribute.
   * @see #getBaseline()
   * @generated
   */
  void setBaseline(Date value);

  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see org.eclipse.net4j.pop.PopPackage#getDeliveryStream_Task()
   * @model required="true"
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.DeliveryStream#getTask <em>Task</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Deliveries</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Delivery}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Delivery#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deliveries</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deliveries</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getDeliveryStream_Deliveries()
   * @see org.eclipse.net4j.pop.Delivery#getStream
   * @model opposite="stream" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Delivery> getDeliveries();

} // DeliveryStream
