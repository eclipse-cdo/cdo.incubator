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
 * $Id: ApiBaseline.java,v 1.4 2008-08-05 18:38:57 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.net4j.pop.project.Release;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Api Baseline</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.pde.ApiBaseline#getTargetPlatform <em>Target Platform</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.pde.ApiBaseline#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage#getApiBaseline()
 * @model
 * @generated
 */
public interface ApiBaseline extends PDEConfigurator
{
  /**
   * Returns the value of the '<em><b>Target Platform</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Platform</em>' reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Target Platform</em>' reference.
   * @see #setTargetPlatform(TargetPlatform)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getApiBaseline_TargetPlatform()
   * @model
   * @generated
   */
  TargetPlatform getTargetPlatform();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.ApiBaseline#getTargetPlatform <em>Target Platform</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Target Platform</em>' reference.
   * @see #getTargetPlatform()
   * @generated
   */
  void setTargetPlatform(TargetPlatform value);

  /**
   * Returns the value of the '<em><b>Release</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Release</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Release</em>' reference.
   * @see #setRelease(Release)
   * @see org.eclipse.net4j.pop.pde.PDEPackage#getApiBaseline_Release()
   * @model required="true"
   * @generated
   */
  Release getRelease();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.pde.ApiBaseline#getRelease <em>Release</em>}' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Release</em>' reference.
   * @see #getRelease()
   * @generated
   */
  void setRelease(Release value);

} // ApiBaseline
