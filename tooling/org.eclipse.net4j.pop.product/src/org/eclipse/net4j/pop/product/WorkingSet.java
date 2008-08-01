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
 * $Id: WorkingSet.java,v 1.2 2008-08-01 07:30:13 estepper Exp $
 */
package org.eclipse.net4j.pop.product;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Working Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.product.WorkingSet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.product.WorkingSet#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.product.WorkingSet#getWorkspaceSpec <em>Workspace Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkingSet()
 * @model
 * @generated
 */
public interface WorkingSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkingSet_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkingSet#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Projects</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.product.WorkspaceProject}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkingSets <em>Working Sets</em>}'.
   * <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Projects</em>' reference list isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' reference list.
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkingSet_Projects()
   * @see org.eclipse.net4j.pop.product.WorkspaceProject#getWorkingSets
   * @model opposite="workingSets"
   * @generated
   */
  EList<WorkspaceProject> getProjects();

  /**
   * Returns the value of the '<em><b>Workspace Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.product.PopProduct#getWorkingSets <em>Working Sets</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Spec</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Spec</em>' container reference.
   * @see #setWorkspaceSpec(PopProduct)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkingSet_WorkspaceSpec()
   * @see org.eclipse.net4j.pop.product.PopProduct#getWorkingSets
   * @model opposite="workingSets" required="true" transient="false"
   * @generated
   */
  PopProduct getWorkspaceSpec();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkingSet#getWorkspaceSpec <em>Workspace Spec</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace Spec</em>' container reference.
   * @see #getWorkspaceSpec()
   * @generated
   */
  void setWorkspaceSpec(PopProduct value);

} // WorkingSet
