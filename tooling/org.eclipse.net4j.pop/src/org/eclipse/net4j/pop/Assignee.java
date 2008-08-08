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
 * $Id: Assignee.java,v 1.1 2008-08-08 09:24:32 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.Assignee#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.net4j.pop.Assignee#getTaskGroups <em>Task Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getAssignee()
 * @model
 * @generated
 */
public interface Assignee extends EObject
{
  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.Task}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Task#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getAssignee_Tasks()
   * @see org.eclipse.net4j.pop.Task#getAssignee
   * @model opposite="assignee" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Task> getTasks();

  /**
   * Returns the value of the '<em><b>Task Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.TaskGroup}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.TaskGroup#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Groups</em>' containment reference list.
   * @see org.eclipse.net4j.pop.PopPackage#getAssignee_TaskGroups()
   * @see org.eclipse.net4j.pop.TaskGroup#getAssignee
   * @model opposite="assignee" containment="true" resolveProxies="true"
   * @generated
   */
  EList<TaskGroup> getTaskGroups();

} // Assignee
