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
 * $Id: PrimaryModule.java,v 1.1 2008-08-07 17:42:11 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.PrimaryModule#getPop <em>Pop</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.PrimaryModule#getWorkspaceSpecificationPath <em>Workspace Specification Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getPrimaryModule()
 * @model
 * @generated
 */
public interface PrimaryModule extends Module
{
  /**
   * Returns the value of the '<em><b>Pop</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Pop#getPrimaryModule <em>Primary Module</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop</em>' container reference.
   * @see #setPop(Pop)
   * @see org.eclipse.net4j.pop.PopPackage#getPrimaryModule_Pop()
   * @see org.eclipse.net4j.pop.Pop#getPrimaryModule
   * @model opposite="primaryModule" required="true" transient="false"
   * @generated
   */
  Pop getPop();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.PrimaryModule#getPop <em>Pop</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop</em>' container reference.
   * @see #getPop()
   * @generated
   */
  void setPop(Pop value);

  /**
   * Returns the value of the '<em><b>Workspace Specification Path</b></em>' attribute.
   * The default value is <code>"product.xml"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Specification Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Specification Path</em>' attribute.
   * @see #setWorkspaceSpecificationPath(String)
   * @see org.eclipse.net4j.pop.PopPackage#getPrimaryModule_WorkspaceSpecificationPath()
   * @model default="product.xml" required="true"
   * @generated
   */
  String getWorkspaceSpecificationPath();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.PrimaryModule#getWorkspaceSpecificationPath <em>Workspace Specification Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace Specification Path</em>' attribute.
   * @see #getWorkspaceSpecificationPath()
   * @generated
   */
  void setWorkspaceSpecificationPath(String value);

} // PrimaryModule
