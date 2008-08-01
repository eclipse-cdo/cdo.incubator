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
 * $Id: WorkspaceConfigurator.java,v 1.3 2008-08-01 08:14:44 estepper Exp $
 */
package org.eclipse.net4j.pop.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workspace Configurator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceConfigurator#getWorkspaceSpec <em>Workspace Spec</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceConfigurator()
 * @model abstract="true"
 * @generated
 */
public interface WorkspaceConfigurator extends EObject
{
  /**
   * Returns the value of the '<em><b>Workspace Spec</b></em>' container reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.product.PopProduct#getConfigurators <em>Configurators</em>}'. <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Workspace Spec</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Workspace Spec</em>' container reference.
   * @see #setWorkspaceSpec(PopProduct)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceConfigurator_WorkspaceSpec()
   * @see org.eclipse.net4j.pop.product.PopProduct#getConfigurators
   * @model opposite="configurators" required="true" transient="false"
   * @generated
   */
  PopProduct getWorkspaceSpec();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkspaceConfigurator#getWorkspaceSpec
   * <em>Workspace Spec</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Workspace Spec</em>' container reference.
   * @see #getWorkspaceSpec()
   * @generated
   */
  void setWorkspaceSpec(PopProduct value);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @model
   * @generated
   */
  void configureWorkspace();

} // WorkspaceConfigurator
