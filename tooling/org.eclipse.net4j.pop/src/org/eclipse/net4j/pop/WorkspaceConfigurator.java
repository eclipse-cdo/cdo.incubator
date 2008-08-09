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
 * $Id: WorkspaceConfigurator.java,v 1.1 2008-08-07 17:42:11 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification <em>Workspace Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceConfigurator()
 * @model abstract="true"
 * @generated
 */
public interface WorkspaceConfigurator extends PopElement
{
  /**
   * Returns the value of the '<em><b>Workspace Specification</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getWorkspaceConfigurators <em>Workspace Configurators</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Specification</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Specification</em>' container reference.
   * @see #setWorkspaceSpecification(WorkspaceSpecification)
   * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceConfigurator_WorkspaceSpecification()
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getWorkspaceConfigurators
   * @model opposite="workspaceConfigurators" required="true" transient="false"
   * @generated
   */
  WorkspaceSpecification getWorkspaceSpecification();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification <em>Workspace Specification</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace Specification</em>' container reference.
   * @see #getWorkspaceSpecification()
   * @generated
   */
  void setWorkspaceSpecification(WorkspaceSpecification value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void validate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void execute();

} // WorkspaceConfigurator