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
 * $Id: WorkspaceProject.java,v 1.5 2008-08-05 18:39:11 estepper Exp $
 */
package org.eclipse.net4j.pop.product;

import org.eclipse.net4j.pop.project.RepositoryModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workspace Project</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceProject#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkingSets <em>Working Sets</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkspaceSpec <em>Workspace Spec</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceProject#getCodeRoot <em>Code Root</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.WorkspaceProject#getCodePath <em>Code Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject()
 * @model
 * @generated
 */
public interface WorkspaceProject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Working Sets</b></em>' reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.product.WorkingSet}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.product.WorkingSet#getProjects <em>Projects</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Working Sets</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Working Sets</em>' reference list.
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject_WorkingSets()
   * @see org.eclipse.net4j.pop.product.WorkingSet#getProjects
   * @model opposite="projects"
   * @generated
   */
  EList<WorkingSet> getWorkingSets();

  /**
   * Returns the value of the '<em><b>Workspace Spec</b></em>' container reference. It is bidirectional and its opposite
   * is '{@link org.eclipse.net4j.pop.product.PopProduct#getProjects <em>Projects</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Spec</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Workspace Spec</em>' container reference.
   * @see #setWorkspaceSpec(PopProduct)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject_WorkspaceSpec()
   * @see org.eclipse.net4j.pop.product.PopProduct#getProjects
   * @model opposite="projects" required="true" transient="false"
   * @generated
   */
  PopProduct getWorkspaceSpec();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getWorkspaceSpec
   * <em>Workspace Spec</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Workspace Spec</em>' container reference.
   * @see #getWorkspaceSpec()
   * @generated
   */
  void setWorkspaceSpec(PopProduct value);

  /**
   * Returns the value of the '<em><b>Repository Module</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Module</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repository Module</em>' reference.
   * @see #setRepositoryModule(RepositoryModule)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject_RepositoryModule()
   * @model required="true"
   * @generated
   */
  RepositoryModule getRepositoryModule();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getRepositoryModule
   * <em>Repository Module</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Repository Module</em>' reference.
   * @see #getRepositoryModule()
   * @generated
   */
  void setRepositoryModule(RepositoryModule value);

  /**
   * Returns the value of the '<em><b>Repository Path</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository Path</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repository Path</em>' attribute.
   * @see #setRepositoryPath(String)
   * @see org.eclipse.net4j.pop.product.ProductPackage#getWorkspaceProject_RepositoryPath()
   * @model
   * @generated
   */
  String getRepositoryPath();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.product.WorkspaceProject#getRepositoryPath
   * <em>Repository Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Repository Path</em>' attribute.
   * @see #getRepositoryPath()
   * @generated
   */
  void setRepositoryPath(String value);

} // WorkspaceProject
