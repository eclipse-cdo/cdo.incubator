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
 * $Id: Task.java,v 1.1 2008-08-07 17:42:11 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Task#getMylynId <em>Mylyn Id</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Task#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Task#getTaskGroup <em>Task Group</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Task#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends PopElement
{
  /**
   * Returns the value of the '<em><b>Mylyn Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mylyn Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mylyn Id</em>' attribute.
   * @see #setMylynId(String)
   * @see org.eclipse.net4j.pop.PopPackage#getTask_MylynId()
   * @model required="true"
   * @generated
   */
  String getMylynId();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Task#getMylynId <em>Mylyn Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mylyn Id</em>' attribute.
   * @see #getMylynId()
   * @generated
   */
  void setMylynId(String value);

  /**
   * Returns the value of the '<em><b>Developer</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Developer#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Developer</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Developer</em>' container reference.
   * @see #setDeveloper(Developer)
   * @see org.eclipse.net4j.pop.PopPackage#getTask_Developer()
   * @see org.eclipse.net4j.pop.Developer#getTasks
   * @model opposite="tasks" transient="false"
   * @generated
   */
  Developer getDeveloper();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Task#getDeveloper <em>Developer</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Developer</em>' container reference.
   * @see #getDeveloper()
   * @generated
   */
  void setDeveloper(Developer value);

  /**
   * Returns the value of the '<em><b>Task Group</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.TaskGroup#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Group</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Group</em>' container reference.
   * @see #setTaskGroup(TaskGroup)
   * @see org.eclipse.net4j.pop.PopPackage#getTask_TaskGroup()
   * @see org.eclipse.net4j.pop.TaskGroup#getTasks
   * @model opposite="tasks" transient="false"
   * @generated
   */
  TaskGroup getTaskGroup();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Task#getTaskGroup <em>Task Group</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Group</em>' container reference.
   * @see #getTaskGroup()
   * @generated
   */
  void setTaskGroup(TaskGroup value);

  /**
   * Returns the value of the '<em><b>Targets</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Target}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Target#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getTask_Targets()
   * @see org.eclipse.net4j.pop.Target#getTasks
   * @model opposite="tasks" required="true"
   * @generated
   */
  EList<Target> getTargets();

} // Task
