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
 * $Id: IntegrationStream.java,v 1.5 2008-08-01 09:36:24 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Integration Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.IntegrationStream#getTaskStreams <em>Task Streams</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.project.IntegrationStream#getReleases <em>Releases</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getIntegrationStream()
 * @model abstract="true"
 * @generated
 */
public interface IntegrationStream extends Stream
{
  /**
   * Returns the value of the '<em><b>Task Streams</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.project.TaskStream}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.TaskStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Streams</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Streams</em>' reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getIntegrationStream_TaskStreams()
   * @see org.eclipse.net4j.pop.project.TaskStream#getParent
   * @model opposite="parent"
   * @generated
   */
  EList<TaskStream> getTaskStreams();

  /**
   * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.project.Release}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.project.Release#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Releases</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Releases</em>' containment reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getIntegrationStream_Releases()
   * @see org.eclipse.net4j.pop.project.Release#getStream
   * @model opposite="stream" containment="true"
   * @generated
   */
  EList<Release> getReleases();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" taskIdRequired="true" baselineRequired="true"
   * @generated
   */
  TaskStream startTask(String taskId, Date baseline);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" dateRequired="true"
   * @generated
   */
  Release addRelease(Date date);

} // IntegrationStream
