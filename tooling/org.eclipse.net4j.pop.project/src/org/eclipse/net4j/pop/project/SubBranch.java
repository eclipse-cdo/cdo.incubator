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
 * $Id: SubBranch.java,v 1.5 2008-08-01 09:36:24 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sub Branch</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.SubBranch#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getSubBranch()
 * @model
 * @generated
 */
public interface SubBranch extends Branch, TaggedElement
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.Branch#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Branch)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getSubBranch_Parent()
   * @see org.eclipse.net4j.pop.project.Branch#getBranches
   * @model opposite="branches" required="true"
   * @generated
   */
  Branch getParent();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.SubBranch#getParent <em>Parent</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Branch value);

} // SubBranch
