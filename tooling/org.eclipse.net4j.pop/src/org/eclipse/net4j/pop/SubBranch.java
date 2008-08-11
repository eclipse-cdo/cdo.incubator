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
 * $Id: SubBranch.java,v 1.4 2008-08-11 07:21:03 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sub Branch</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.SubBranch#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getSubBranch()
 * @model
 * @generated
 */
public interface SubBranch extends Branch, TaggedElement
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Branch#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Branch)
   * @see org.eclipse.net4j.pop.PopPackage#getSubBranch_Parent()
   * @see org.eclipse.net4j.pop.Branch#getBranches
   * @model opposite="branches" required="true" transient="false"
   * @generated
   */
  Branch getParent();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.SubBranch#getParent <em>Parent</em>}' container reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Branch value);

} // SubBranch
