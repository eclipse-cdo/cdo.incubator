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
 * $Id: JDTPackage.java,v 1.1 2008-08-01 07:53:22 estepper Exp $
 */
package org.eclipse.net4j.pop.jdt;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.net4j.pop.product.ProductPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.jdt.JDTFactory
 * @model kind="package"
 * @generated
 */
public interface JDTPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jdt"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/net4j/pop/product/jdt/1.0.0"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "net4j.pop.product.jdt"; //$NON-NLS-1$

  /**
   * The package content type ID.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eCONTENT_TYPE = "net4j.pop.product.jdt"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JDTPackage eINSTANCE = org.eclipse.net4j.pop.jdt.impl.JDTPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.jdt.impl.JRECheckerImpl <em>JRE Checker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.jdt.impl.JRECheckerImpl
   * @see org.eclipse.net4j.pop.jdt.impl.JDTPackageImpl#getJREChecker()
   * @generated
   */
  int JRE_CHECKER = 0;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JRE_CHECKER__WORKSPACE_SPEC = ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC;

  /**
   * The number of structural features of the '<em>JRE Checker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JRE_CHECKER_FEATURE_COUNT = ProductPackage.WORKSPACE_CONFIGURATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.jdt.impl.FormatterProfileConfiguratorImpl <em>Formatter Profile Configurator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.jdt.impl.FormatterProfileConfiguratorImpl
   * @see org.eclipse.net4j.pop.jdt.impl.JDTPackageImpl#getFormatterProfileConfigurator()
   * @generated
   */
  int FORMATTER_PROFILE_CONFIGURATOR = 1;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTER_PROFILE_CONFIGURATOR__WORKSPACE_SPEC = ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC;

  /**
   * The number of structural features of the '<em>Formatter Profile Configurator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTER_PROFILE_CONFIGURATOR_FEATURE_COUNT = ProductPackage.WORKSPACE_CONFIGURATOR_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.jdt.JREChecker <em>JRE Checker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JRE Checker</em>'.
   * @see org.eclipse.net4j.pop.jdt.JREChecker
   * @generated
   */
  EClass getJREChecker();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.jdt.FormatterProfileConfigurator <em>Formatter Profile Configurator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formatter Profile Configurator</em>'.
   * @see org.eclipse.net4j.pop.jdt.FormatterProfileConfigurator
   * @generated
   */
  EClass getFormatterProfileConfigurator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JDTFactory getJDTFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.jdt.impl.JRECheckerImpl <em>JRE Checker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.jdt.impl.JRECheckerImpl
     * @see org.eclipse.net4j.pop.jdt.impl.JDTPackageImpl#getJREChecker()
     * @generated
     */
    EClass JRE_CHECKER = eINSTANCE.getJREChecker();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.jdt.impl.FormatterProfileConfiguratorImpl <em>Formatter Profile Configurator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.jdt.impl.FormatterProfileConfiguratorImpl
     * @see org.eclipse.net4j.pop.jdt.impl.JDTPackageImpl#getFormatterProfileConfigurator()
     * @generated
     */
    EClass FORMATTER_PROFILE_CONFIGURATOR = eINSTANCE.getFormatterProfileConfigurator();

  }

} //JDTPackage
