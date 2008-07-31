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
 * $Id: DevelopmentStream.java,v 1.2 2008-07-31 13:35:41 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Development Stream</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.project.DevelopmentStream#getMaintenanceStreams <em>Maintenance Streams</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.project.ProjectPackage#getDevelopmentStream()
 * @model abstract="true"
 * @generated
 */
public interface DevelopmentStream extends IntegrationStream
{
  /**
   * Returns the value of the '<em><b>Maintenance Streams</b></em>' reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.project.MaintenanceStream}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.project.MaintenanceStream#getParent <em>Parent</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maintenance Streams</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Maintenance Streams</em>' reference list.
   * @see org.eclipse.net4j.pop.project.ProjectPackage#getDevelopmentStream_MaintenanceStreams()
   * @see org.eclipse.net4j.pop.project.MaintenanceStream#getParent
   * @model opposite="parent"
   * @generated
   */
  EList<MaintenanceStream> getMaintenanceStreams();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @model required="true" dateRequired="true" compatibleRequired="true" incrementRequired="true"
   * @generated
   */
  Release addRelease(Date date, boolean compatible, int increment);

} // DevelopmentStream
