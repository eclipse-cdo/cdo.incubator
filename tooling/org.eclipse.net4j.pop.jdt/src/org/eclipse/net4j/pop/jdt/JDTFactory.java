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
 * $Id: JDTFactory.java,v 1.2 2008-08-01 08:14:55 estepper Exp $
 */
package org.eclipse.net4j.pop.jdt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.jdt.JDTPackage
 * @generated
 */
public interface JDTFactory extends EFactory
{
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  JDTFactory eINSTANCE = org.eclipse.net4j.pop.jdt.impl.JDTFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JRE Checker</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>JRE Checker</em>'.
   * @generated
   */
  JREChecker createJREChecker();

  /**
   * Returns a new object of class '<em>Formatter Profile Configurator</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>Formatter Profile Configurator</em>'.
   * @generated
   */
  FormatterProfileConfigurator createFormatterProfileConfigurator();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the package supported by this factory.
   * @generated
   */
  JDTPackage getJDTPackage();

} // JDTFactory
