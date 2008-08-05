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
 * $Id: PDEConfigurator.java,v 1.4 2008-08-05 18:38:57 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.net4j.pop.product.WorkspaceConfigurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configurator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEConfigurator#getAllEntities <em>All Entities</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEConfigurator()
 * @model abstract="true"
 * @generated
 */
public interface PDEConfigurator extends WorkspaceConfigurator
{
  /**
   * Returns the value of the '<em><b>All Entities</b></em>' reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.pde.PDEEntity}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Entities</em>' reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>All Entities</em>' reference list.
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEConfigurator_AllEntities()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<PDEEntity> getAllEntities();

} // PDEConfigurator
