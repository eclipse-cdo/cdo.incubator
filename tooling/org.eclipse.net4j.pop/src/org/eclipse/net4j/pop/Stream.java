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
 * $Id: Stream.java,v 1.3 2008-08-09 18:31:08 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stream</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Stream#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Stream#getIntegrations <em>Integrations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getStream()
 * @model abstract="true"
 * @generated
 */
public interface Stream extends PopElement
{
  /**
   * Returns the value of the '<em><b>Branch</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Branch#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branch</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branch</em>' reference.
   * @see #setBranch(Branch)
   * @see org.eclipse.net4j.pop.PopPackage#getStream_Branch()
   * @see org.eclipse.net4j.pop.Branch#getStream
   * @model opposite="stream" required="true"
   * @generated
   */
  Branch getBranch();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Stream#getBranch <em>Branch</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Branch</em>' reference.
   * @see #getBranch()
   * @generated
   */
  void setBranch(Branch value);

  /**
   * Returns the value of the '<em><b>Integrations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Integration}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Integration#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integrations</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integrations</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getStream_Integrations()
   * @see org.eclipse.net4j.pop.Integration#getStream
   * @model opposite="stream" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Integration> getIntegrations();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  Pop getPop();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  Stream getParent();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<Stream> getStreams();

} // Stream
