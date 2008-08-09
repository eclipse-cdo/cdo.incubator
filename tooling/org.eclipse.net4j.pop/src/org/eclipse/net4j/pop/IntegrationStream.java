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
 * $Id: IntegrationStream.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Integration Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.IntegrationStream#getDeliveryStreams <em>Delivery Streams</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.IntegrationStream#getReleases <em>Releases</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.PopPackage#getIntegrationStream()
 * @model abstract="true"
 * @generated
 */
public interface IntegrationStream extends Stream
{
  /**
   * Returns the value of the '<em><b>Delivery Streams</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.DeliveryStream}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.DeliveryStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delivery Streams</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delivery Streams</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getIntegrationStream_DeliveryStreams()
   * @see org.eclipse.net4j.pop.DeliveryStream#getParent
   * @model opposite="parent" containment="true" resolveProxies="true"
   * @generated
   */
  EList<DeliveryStream> getDeliveryStreams();

  /**
   * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Release}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Release#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Releases</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Releases</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getIntegrationStream_Releases()
   * @see org.eclipse.net4j.pop.Release#getStream
   * @model opposite="stream" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Release> getReleases();

} // IntegrationStream
