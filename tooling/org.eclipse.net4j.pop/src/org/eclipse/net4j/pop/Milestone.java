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
 * $Id: Milestone.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Milestone#getRelease <em>Release</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Milestone#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends Target
{
  /**
   * Returns the value of the '<em><b>Release</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Release#getMilestones <em>Milestones</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Release</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release</em>' container reference.
   * @see #setRelease(Release)
   * @see org.eclipse.net4j.pop.PopPackage#getMilestone_Release()
   * @see org.eclipse.net4j.pop.Release#getMilestones
   * @model opposite="milestones" required="true" transient="false"
   * @generated
   */
  Release getRelease();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Milestone#getRelease <em>Release</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Release</em>' container reference.
   * @see #getRelease()
   * @generated
   */
  void setRelease(Release value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.PopPackage#getMilestone_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Milestone#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Milestone