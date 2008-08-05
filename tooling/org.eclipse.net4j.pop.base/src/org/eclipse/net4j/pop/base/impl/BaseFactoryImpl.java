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
 * $Id: BaseFactoryImpl.java,v 1.7 2008-08-05 07:50:12 estepper Exp $
 */
package org.eclipse.net4j.pop.base.impl;

import org.eclipse.net4j.pop.base.BaseFactory;
import org.eclipse.net4j.pop.base.BasePackage;
import org.eclipse.net4j.pop.base.Version;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static BaseFactory init()
  {
    try
    {
      BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE
          .getEFactory("http://www.eclipse.org/pop/base/1.0.0"); //$NON-NLS-1$ 
      if (theBaseFactory != null)
      {
        return theBaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BaseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BaseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case BasePackage.VERSION:
      return createVersionFromString(eDataType, initialValue);
    case BasePackage.PATH:
      return createPathFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case BasePackage.VERSION:
      return convertVersionToString(eDataType, instanceValue);
    case BasePackage.PATH:
      return convertPathToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Version createVersionFromString(EDataType eDataType, String initialValue)
  {
    return new Version(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String convertVersionToString(EDataType eDataType, Object instanceValue)
  {
    return ((Version)instanceValue).toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPath createPathFromString(EDataType eDataType, String initialValue)
  {
    return (IPath)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPathToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BasePackage getBasePackage()
  {
    return (BasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BasePackage getPackage()
  {
    return BasePackage.eINSTANCE;
  }

} // BaseFactoryImpl
