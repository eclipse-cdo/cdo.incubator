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
 * $Id: PDEProject.java,v 1.1 2008-08-01 07:53:28 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.net4j.pop.product.WorkspaceProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.pde.PDEProject#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEProject()
 * @model
 * @generated
 */
public interface PDEProject extends WorkspaceProject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.pde.PDEEntity#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEProject_Entity()
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getProject
   * @model opposite="project" containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  PDEEntity getEntity();

} // PDEProject
