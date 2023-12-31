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
 * $Id: SecondaryModule.java,v 1.3 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Secondary Module</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification <em>Workspace Specification</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.PopPackage#getSecondaryModule()
 * @model
 * @generated
 */
public interface SecondaryModule extends Module
{
  /**
   * Returns the value of the '<em><b>Workspace Specification</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getSecondaryModules <em>Secondary Modules</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Specification</em>' container reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Specification</em>' container reference.
   * @see #setWorkspaceSpecification(WorkspaceSpecification)
   * @see org.eclipse.net4j.pop.PopPackage#getSecondaryModule_WorkspaceSpecification()
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getSecondaryModules
   * @model opposite="secondaryModules" required="true" transient="false"
   * @generated
   */
  WorkspaceSpecification getWorkspaceSpecification();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification <em>Workspace Specification</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace Specification</em>' container reference.
   * @see #getWorkspaceSpecification()
   * @generated
   */
  void setWorkspaceSpecification(WorkspaceSpecification value);

} // SecondaryModule
