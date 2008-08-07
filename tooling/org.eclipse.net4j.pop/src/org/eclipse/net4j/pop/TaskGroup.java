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
 * $Id: TaskGroup.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.TaskGroup#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends PopElement
{
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
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.TaskGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Developer</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Developer#getTaskGroups <em>Task Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Developer</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Developer</em>' container reference.
   * @see #setDeveloper(Developer)
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Developer()
   * @see org.eclipse.net4j.pop.Developer#getTaskGroups
   * @model opposite="taskGroups" transient="false"
   * @generated
   */
  Developer getDeveloper();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.TaskGroup#getDeveloper <em>Developer</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Developer</em>' container reference.
   * @see #getDeveloper()
   * @generated
   */
  void setDeveloper(Developer value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.TaskGroup#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(TaskGroup)
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Parent()
   * @see org.eclipse.net4j.pop.TaskGroup#getChildren
   * @model opposite="children" transient="false"
   * @generated
   */
  TaskGroup getParent();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.TaskGroup#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(TaskGroup value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.TaskGroup}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.TaskGroup#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Children()
   * @see org.eclipse.net4j.pop.TaskGroup#getParent
   * @model opposite="parent" containment="true" resolveProxies="true"
   * @generated
   */
  EList<TaskGroup> getChildren();

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Task}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Task#getTaskGroup <em>Task Group</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getTaskGroup_Tasks()
   * @see org.eclipse.net4j.pop.Task#getTaskGroup
   * @model opposite="taskGroup" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Task> getTasks();

} // TaskGroup
