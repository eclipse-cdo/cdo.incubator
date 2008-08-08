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
 * $Id: WorkspaceSpecification.java,v 1.2 2008-08-08 09:24:32 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout <em>Checkout</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.WorkspaceSpecification#getSecondaryModules <em>Secondary Modules</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.WorkspaceSpecification#getWorkspaceConfigurators <em>Workspace Configurators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceSpecification()
 * @model
 * @generated
 */
public interface WorkspaceSpecification extends PopElement
{
  /**
   * Returns the value of the '<em><b>Checkout</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkout</em>' reference.
   * @see #setCheckout(Checkout)
   * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceSpecification_Checkout()
   * @see org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification
   * @model opposite="workspaceSpecification" required="true"
   * @generated
   */
  Checkout getCheckout();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout <em>Checkout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checkout</em>' reference.
   * @see #getCheckout()
   * @generated
   */
  void setCheckout(Checkout value);

  /**
   * Returns the value of the '<em><b>Secondary Modules</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.SecondaryModule}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondary Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondary Modules</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceSpecification_SecondaryModules()
   * @see org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification
   * @model opposite="workspaceSpecification" containment="true" resolveProxies="true"
   * @generated
   */
  EList<SecondaryModule> getSecondaryModules();

  /**
   * Returns the value of the '<em><b>Workspace Configurators</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.WorkspaceConfigurator}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Configurators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Configurators</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getWorkspaceSpecification_WorkspaceConfigurators()
   * @see org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification
   * @model opposite="workspaceSpecification" containment="true" resolveProxies="true"
   * @generated
   */
  EList<WorkspaceConfigurator> getWorkspaceConfigurators();

} // WorkspaceSpecification
