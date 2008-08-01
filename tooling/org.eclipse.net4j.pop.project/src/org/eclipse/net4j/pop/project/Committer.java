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
 * $Id: Committer.java,v 1.7 2008-08-01 11:01:45 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.ecore.EObject;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Committer</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getPopProject <em>Pop Project</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.project.Committer#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter()
 * @model
 * @generated
 */
public interface Committer extends EObject
{
  /**
   * Returns the value of the '<em><b>Pop Project</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.PopProject#getCommitters <em>Committers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Project</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop Project</em>' container reference.
   * @see #setPopProject(PopProject)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_PopProject()
   * @see org.eclipse.net4j.pop.project.PopProject#getCommitters
   * @model opposite="committers" required="true" transient="false"
   * @generated
   */
  PopProject getPopProject();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getPopProject <em>Pop Project</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop Project</em>' container reference.
   * @see #getPopProject()
   * @generated
   */
  void setPopProject(PopProject value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Id()
   * @model id="true" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getId <em>Id</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute.
   * @see #setEmail(String)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Email()
   * @model required="true"
   * @generated
   */
  String getEmail();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getEmail <em>Email</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Email</em>' attribute.
   * @see #getEmail()
   * @generated
   */
  void setEmail(String value);

  /**
   * Returns the value of the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' attribute.
   * @see #setEntry(Date)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Entry()
   * @model required="true"
   * @generated
   */
  Date getEntry();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getEntry <em>Entry</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Entry</em>' attribute.
   * @see #getEntry()
   * @generated
   */
  void setEntry(Date value);

  /**
   * Returns the value of the '<em><b>Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit</em>' attribute.
   * @see #setExit(Date)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Exit()
   * @model
   * @generated
   */
  Date getExit();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#getExit <em>Exit</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Exit</em>' attribute.
   * @see #getExit()
   * @generated
   */
  void setExit(Date value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see #setActive(boolean)
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getCommitter_Active()
   * @model required="true" transient="true" volatile="true" derived="true"
   * @generated
   */
  boolean isActive();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.project.Committer#isActive <em>Active</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Active</em>' attribute.
   * @see #isActive()
   * @generated
   */
  void setActive(boolean value);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model exitRequired="true"
   * @generated
   */
  void deactivate(Date exit);

} // Committer
