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
 * $Id: MaintenanceStream.java,v 1.1 2008-08-07 17:42:11 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.MaintenanceStream#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.MaintenanceStream#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getMaintenanceStream()
 * @model
 * @generated
 */
public interface MaintenanceStream extends IntegrationStream
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.DevelopmentStream#getMaintenanceStreams <em>Maintenance Streams</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(DevelopmentStream)
   * @see org.eclipse.net4j.pop.PopPackage#getMaintenanceStream_Parent()
   * @see org.eclipse.net4j.pop.DevelopmentStream#getMaintenanceStreams
   * @model opposite="maintenanceStreams" required="true" transient="false"
   * @generated
   */
  DevelopmentStream getParent();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.MaintenanceStream#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(DevelopmentStream value);

  /**
   * Returns the value of the '<em><b>Baseline</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Release#getMaintenance <em>Maintenance</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Baseline</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baseline</em>' reference.
   * @see #setBaseline(Release)
   * @see org.eclipse.net4j.pop.PopPackage#getMaintenanceStream_Baseline()
   * @see org.eclipse.net4j.pop.Release#getMaintenance
   * @model opposite="maintenance" required="true"
   * @generated
   */
  Release getBaseline();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.MaintenanceStream#getBaseline <em>Baseline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Baseline</em>' reference.
   * @see #getBaseline()
   * @generated
   */
  void setBaseline(Release value);

} // MaintenanceStream
