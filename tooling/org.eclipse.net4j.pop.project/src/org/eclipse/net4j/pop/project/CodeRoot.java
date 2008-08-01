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
 * $Id: CodeRoot.java,v 1.7 2008-08-01 11:01:45 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Code Root</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.CodeRoot#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.CodeRoot#getRootPath <em>Root Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRoot()
 * @model
 * @generated
 */
public interface CodeRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Pop Project</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.PopProject#getCodeRoots <em>Code Roots</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Project</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop Project</em>' container reference.
   * @see #setPopProject(PopProject)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRoot_PopProject()
   * @see org.eclipse.net4j.pop.project.PopProject#getCodeRoots
   * @model opposite="codeRoots" required="true" transient="false"
   * @generated
   */
  PopProject getPopProject();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRoot#getPopProject <em>Pop Project</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop Project</em>' container reference.
   * @see #getPopProject()
   * @generated
   */
  void setPopProject(PopProject value);

  /**
   * Returns the value of the '<em><b>Root Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Path</em>' attribute.
   * @see #setRootPath(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRoot_RootPath()
   * @model required="true"
   * @generated
   */
  String getRootPath();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRoot#getRootPath <em>Root Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Path</em>' attribute.
   * @see #getRootPath()
   * @generated
   */
  void setRootPath(String value);

} // CodeRoot
