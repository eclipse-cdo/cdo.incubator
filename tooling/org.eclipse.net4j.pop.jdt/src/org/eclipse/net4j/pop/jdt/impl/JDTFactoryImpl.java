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
 * $Id: JDTFactoryImpl.java,v 1.3 2008-08-01 08:34:12 estepper Exp $
 */
package org.eclipse.net4j.pop.jdt.impl;

import org.eclipse.net4j.pop.jdt.FormatterProfileConfigurator;
import org.eclipse.net4j.pop.jdt.JDTFactory;
import org.eclipse.net4j.pop.jdt.JDTPackage;
import org.eclipse.net4j.pop.jdt.JREChecker;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class JDTFactoryImpl extends EFactoryImpl implements JDTFactory
{
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static JDTFactory init()
  {
    try
    {
      JDTFactory theJDTFactory = (JDTFactory)EPackage.Registry.INSTANCE
          .getEFactory("http://www.eclipse.org/pop/jdt/1.0.0"); //$NON-NLS-1$ 
      if (theJDTFactory != null)
      {
        return theJDTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JDTFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JDTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case JDTPackage.JRE_CHECKER:
      return createJREChecker();
    case JDTPackage.FORMATTER_PROFILE_CONFIGURATOR:
      return createFormatterProfileConfigurator();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JREChecker createJREChecker()
  {
    JRECheckerImpl jreChecker = new JRECheckerImpl();
    return jreChecker;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public FormatterProfileConfigurator createFormatterProfileConfigurator()
  {
    FormatterProfileConfiguratorImpl formatterProfileConfigurator = new FormatterProfileConfiguratorImpl();
    return formatterProfileConfigurator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JDTPackage getJDTPackage()
  {
    return (JDTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JDTPackage getPackage()
  {
    return JDTPackage.eINSTANCE;
  }

} // JDTFactoryImpl
