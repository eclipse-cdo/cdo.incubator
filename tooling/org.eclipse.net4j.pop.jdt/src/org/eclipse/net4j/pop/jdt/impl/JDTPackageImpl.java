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
 * $Id: JDTPackageImpl.java,v 1.1 2008-08-01 07:53:47 estepper Exp $
 */
package org.eclipse.net4j.pop.jdt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.net4j.pop.jdt.FormatterProfileConfigurator;
import org.eclipse.net4j.pop.jdt.JDTFactory;
import org.eclipse.net4j.pop.jdt.JDTPackage;
import org.eclipse.net4j.pop.jdt.JREChecker;

import org.eclipse.net4j.pop.product.ProductPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JDTPackageImpl extends EPackageImpl implements JDTPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jreCheckerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatterProfileConfiguratorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.net4j.pop.jdt.JDTPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JDTPackageImpl()
  {
    super(eNS_URI, JDTFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JDTPackage init()
  {
    if (isInited) return (JDTPackage)EPackage.Registry.INSTANCE.getEPackage(JDTPackage.eNS_URI);

    // Obtain or create and register package
    JDTPackageImpl theJDTPackage = (JDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JDTPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(eNS_URI)
        : new JDTPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ProductPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJDTPackage.createPackageContents();

    // Initialize created meta-data
    theJDTPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJDTPackage.freeze();

    return theJDTPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJREChecker()
  {
    return jreCheckerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormatterProfileConfigurator()
  {
    return formatterProfileConfiguratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDTFactory getJDTFactory()
  {
    return (JDTFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jreCheckerEClass = createEClass(JRE_CHECKER);

    formatterProfileConfiguratorEClass = createEClass(FORMATTER_PROFILE_CONFIGURATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    jreCheckerEClass.getESuperTypes().add(theProductPackage.getWorkspaceConfigurator());
    formatterProfileConfiguratorEClass.getESuperTypes().add(theProductPackage.getWorkspaceConfigurator());

    // Initialize classes and features; add operations and parameters
    initEClass(jreCheckerEClass, JREChecker.class,
        "JREChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(formatterProfileConfiguratorEClass, FormatterProfileConfigurator.class,
        "FormatterProfileConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    // Create resource
    createResource(eNS_URI);
  }

} //JDTPackageImpl
