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
 * $Id: Developer.java,v 1.2 2008-08-08 09:24:32 estepper Exp $
 */
package org.eclipse.net4j.pop;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getPop <em>Pop</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getRepositoryUser <em>Repository User</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Developer#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getDeveloper()
 * @model
 * @generated
 */
public interface Developer extends PopElement, Assignee
{
  /**
   * Returns the value of the '<em><b>Pop</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Pop#getDevelopers <em>Developers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop</em>' container reference.
   * @see #setPop(Pop)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Pop()
   * @see org.eclipse.net4j.pop.Pop#getDevelopers
   * @model opposite="developers" required="true" transient="false"
   * @generated
   */
  Pop getPop();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getPop <em>Pop</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop</em>' container reference.
   * @see #getPop()
   * @generated
   */
  void setPop(Pop value);

  /**
   * Returns the value of the '<em><b>Repository User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository User</em>' attribute.
   * @see #setRepositoryUser(String)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_RepositoryUser()
   * @model required="true"
   * @generated
   */
  String getRepositoryUser();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getRepositoryUser <em>Repository User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository User</em>' attribute.
   * @see #getRepositoryUser()
   * @generated
   */
  void setRepositoryUser(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute.
   * @see #setEmail(String)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Email()
   * @model required="true"
   * @generated
   */
  String getEmail();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getEmail <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email</em>' attribute.
   * @see #getEmail()
   * @generated
   */
  void setEmail(String value);

  /**
   * Returns the value of the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' attribute.
   * @see #setEntry(Date)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Entry()
   * @model required="true"
   * @generated
   */
  Date getEntry();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getEntry <em>Entry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry</em>' attribute.
   * @see #getEntry()
   * @generated
   */
  void setEntry(Date value);

  /**
   * Returns the value of the '<em><b>Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit</em>' attribute.
   * @see #setExit(Date)
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Exit()
   * @model
   * @generated
   */
  Date getExit();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Developer#getExit <em>Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit</em>' attribute.
   * @see #getExit()
   * @generated
   */
  void setExit(Date value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see org.eclipse.net4j.pop.PopPackage#getDeveloper_Active()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  boolean isActive();

} // Developer
