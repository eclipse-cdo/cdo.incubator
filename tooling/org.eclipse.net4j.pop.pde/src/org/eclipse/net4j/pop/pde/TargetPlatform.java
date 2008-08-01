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
 * $Id: TargetPlatform.java,v 1.1 2008-08-01 07:53:28 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.pde.TargetPlatform#getDistributions <em>Distributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getTargetPlatform()
 * @model
 * @generated
 */
public interface TargetPlatform extends PDEConfigurator
{
  /**
   * Returns the value of the '<em><b>Distributions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.net4j.pop.pde.PDEDistribution}.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform <em>Target Platform</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distributions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distributions</em>' containment reference list.
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getTargetPlatform_Distributions()
   * @see org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform
   * @model opposite="targetPlatform" containment="true"
   * @generated
   */
  EList<PDEDistribution> getDistributions();

} // TargetPlatform
