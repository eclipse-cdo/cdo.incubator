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
 * $Id: SubBranch.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.SubBranch#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.SubBranch#getRootTagName <em>Root Tag Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.SubBranch#getRootTag <em>Root Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getSubBranch()
 * @model
 * @generated
 */
public interface SubBranch extends Branch
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Branch#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
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
   * Sets the value of the '{@link org.eclipse.net4j.pop.SubBranch#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Branch value);

  /**
   * Returns the value of the '<em><b>Root Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Tag Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Tag Name</em>' attribute.
   * @see #setRootTagName(String)
   * @see org.eclipse.net4j.pop.PopPackage#getSubBranch_RootTagName()
   * @model required="true"
   * @generated
   */
  String getRootTagName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.SubBranch#getRootTagName <em>Root Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Tag Name</em>' attribute.
   * @see #getRootTagName()
   * @generated
   */
  void setRootTagName(String value);

  /**
   * Returns the value of the '<em><b>Root Tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Tag</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Tag</em>' reference.
   * @see org.eclipse.net4j.pop.PopPackage#getSubBranch_RootTag()
   * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  Tag getRootTag();

} // SubBranch
