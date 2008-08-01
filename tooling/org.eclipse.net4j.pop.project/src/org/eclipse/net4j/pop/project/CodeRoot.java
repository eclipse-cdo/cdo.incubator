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
 * $Id: CodeRoot.java,v 1.5 2008-08-01 09:36:24 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Code Root</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.CodeRoot#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.CodeRoot#getRepository <em>Repository</em>}</li>
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
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRoot_Path()
   * @model required="true"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRoot#getPath <em>Path</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Repository</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.CodeRepository#getCodeRoots <em>Code Roots</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' container reference.
   * @see #setRepository(CodeRepository)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCodeRoot_Repository()
   * @see org.eclipse.net4j.pop.project.CodeRepository#getCodeRoots
   * @model opposite="codeRoots" required="true" transient="false"
   * @generated
   */
  CodeRepository getRepository();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.CodeRoot#getRepository <em>Repository</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' container reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(CodeRepository value);

} // CodeRoot
