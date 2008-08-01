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
 * $Id: PopProject.java,v 1.5 2008-08-01 08:41:19 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.PopElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pop Project</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.PopProject#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.PopProject#getCodeRepository <em>Code Repository</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.PopProject#getRootStream <em>Root Stream</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject()
 * @model
 * @generated
 */
public interface PopProject extends PopElement
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
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Code Repository</b></em>' reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.CodeRepository#getPopProject <em>Pop Project</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Repository</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Code Repository</em>' reference.
   * @see #setCodeRepository(CodeRepository)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_CodeRepository()
   * @see org.eclipse.net4j.pop.project.CodeRepository#getPopProject
   * @model opposite="popProject" required="true"
   * @generated
   */
  CodeRepository getCodeRepository();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getCodeRepository <em>Code Repository</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Code Repository</em>' reference.
   * @see #getCodeRepository()
   * @generated
   */
  void setCodeRepository(CodeRepository value);

  /**
   * Returns the value of the '<em><b>Root Stream</b></em>' reference. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.RootStream#getPopProject <em>Pop Project</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Stream</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Root Stream</em>' reference.
   * @see #setRootStream(RootStream)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getPopProject_RootStream()
   * @see org.eclipse.net4j.pop.project.RootStream#getPopProject
   * @model opposite="popProject" required="true"
   * @generated
   */
  RootStream getRootStream();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.PopProject#getRootStream <em>Root Stream</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Root Stream</em>' reference.
   * @see #getRootStream()
   * @generated
   */
  void setRootStream(RootStream value);

} // PopProject
