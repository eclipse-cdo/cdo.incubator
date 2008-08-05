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
 * $Id: PDEFactory.java,v 1.4 2008-08-05 18:38:57 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage
 * @generated
 */
public interface PDEFactory extends EFactory
{
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PDEFactory eINSTANCE = org.eclipse.net4j.pop.pde.impl.PDEFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Target Platform Checker</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Target Platform Checker</em>'.
   * @generated
   */
  TargetPlatformChecker createTargetPlatformChecker();

  /**
   * Returns a new object of class '<em>Api Baseline</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Api Baseline</em>'.
   * @generated
   */
  ApiBaseline createApiBaseline();

  /**
   * Returns a new object of class '<em>Target Platform</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Target Platform</em>'.
   * @generated
   */
  TargetPlatform createTargetPlatform();

  /**
   * Returns a new object of class '<em>Project</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  PDEProject createPDEProject();

  /**
   * Returns a new object of class '<em>Feature</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Plugin</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Plugin</em>'.
   * @generated
   */
  Plugin createPlugin();

  /**
   * Returns a new object of class '<em>Fragment</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Fragment</em>'.
   * @generated
   */
  Fragment createFragment();

  /**
   * Returns a new object of class '<em>Zip Distribution</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Zip Distribution</em>'.
   * @generated
   */
  ZipDistribution createZipDistribution();

  /**
   * Returns a new object of class '<em>Pop Distribution</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Pop Distribution</em>'.
   * @generated
   */
  PopDistribution createPopDistribution();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the package supported by this factory.
   * @generated
   */
  PDEPackage getPDEPackage();

} // PDEFactory
