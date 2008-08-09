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
 * $Id: TaskGroup.java,v 1.5 2008-08-09 18:31:09 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Task Group</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getAssignee <em>Assignee</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends PopElement, Assignee
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
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.TaskGroup#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assignee</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Assignee#getTaskGroups <em>Task Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignee</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignee</em>' container reference.
   * @see #setAssignee(Assignee)
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Assignee()
   * @see org.eclipse.net4j.pop.Assignee#getTaskGroups
   * @model opposite="taskGroups" required="true" transient="false"
   * @generated
   */
  Assignee getAssignee();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.TaskGroup#getAssignee <em>Assignee</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignee</em>' container reference.
   * @see #getAssignee()
   * @generated
   */
  void setAssignee(Assignee value);

} // TaskGroup
