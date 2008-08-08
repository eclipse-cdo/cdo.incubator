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
 * $Id: Task.java,v 1.2 2008-08-08 09:24:32 estepper Exp $
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
 *   <li>{@link org.eclipse.net4j.pop.Task#getAssignee <em>Assignee</em>}</li>
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
   * Returns the value of the '<em><b>Assignee</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Assignee#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignee</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignee</em>' container reference.
   * @see #setAssignee(Assignee)
   * @see org.eclipse.net4j.pop.PopPackage#getTask_Assignee()
   * @see org.eclipse.net4j.pop.Assignee#getTasks
   * @model opposite="tasks" required="true" transient="false"
   * @generated
   */
  Assignee getAssignee();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.Task#getAssignee <em>Assignee</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignee</em>' container reference.
   * @see #getAssignee()
   * @generated
   */
  void setAssignee(Assignee value);

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
