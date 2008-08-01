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
 * $Id: PDEDistribution.java,v 1.2 2008-08-01 08:15:04 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Distribution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEDistribution#getEntities <em>Entities</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform <em>Target Platform</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEDistribution()
 * @model abstract="true"
 * @generated
 */
public interface PDEDistribution extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.net4j.pop.pde.PDEEntity}. It is bidirectional and its opposite is '
   * {@link org.eclipse.net4j.pop.pde.PDEEntity#getDistribution <em>Distribution</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEDistribution_Entities()
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getDistribution
   * @model opposite="distribution" containment="true" required="true"
   * @generated
   */
  EList<PDEEntity> getEntities();

  /**
   * Returns the value of the '<em><b>Target Platform</b></em>' container reference. It is bidirectional and its
   * opposite is '{@link org.eclipse.net4j.pop.pde.TargetPlatform#getDistributions <em>Distributions</em>}'. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Platform</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Target Platform</em>' container reference.
   * @see #setTargetPlatform(TargetPlatform)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getPDEDistribution_TargetPlatform()
   * @see org.eclipse.net4j.pop.pde.TargetPlatform#getDistributions
   * @model opposite="distributions" required="true" transient="false"
   * @generated
   */
  TargetPlatform getTargetPlatform();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform <em>Target Platform</em>}
   * ' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Target Platform</em>' container reference.
   * @see #getTargetPlatform()
   * @generated
   */
  void setTargetPlatform(TargetPlatform value);

} // PDEDistribution
