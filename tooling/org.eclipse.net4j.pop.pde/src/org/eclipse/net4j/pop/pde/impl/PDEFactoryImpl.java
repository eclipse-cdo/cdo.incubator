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
 * $Id: PDEFactoryImpl.java,v 1.4 2008-08-05 14:47:44 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.net4j.pop.pde.ApiBaseline;
import org.eclipse.net4j.pop.pde.Feature;
import org.eclipse.net4j.pop.pde.Fragment;
import org.eclipse.net4j.pop.pde.Location;
import org.eclipse.net4j.pop.pde.PDEFactory;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.PDEProject;
import org.eclipse.net4j.pop.pde.Plugin;
import org.eclipse.net4j.pop.pde.PopDistribution;
import org.eclipse.net4j.pop.pde.TargetPlatform;
import org.eclipse.net4j.pop.pde.TargetPlatformChecker;
import org.eclipse.net4j.pop.pde.ZipDistribution;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class PDEFactoryImpl extends EFactoryImpl implements PDEFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static PDEFactory init()
  {
    try
    {
      PDEFactory thePDEFactory = (PDEFactory)EPackage.Registry.INSTANCE
          .getEFactory("http://www.eclipse.org/pop/pde/1.0.0"); //$NON-NLS-1$ 
      if (thePDEFactory != null)
      {
        return thePDEFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDEFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEFactoryImpl()
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
    case PDEPackage.TARGET_PLATFORM_CHECKER:
      return createTargetPlatformChecker();
    case PDEPackage.API_BASELINE:
      return createApiBaseline();
    case PDEPackage.TARGET_PLATFORM:
      return createTargetPlatform();
    case PDEPackage.PDE_PROJECT:
      return createPDEProject();
    case PDEPackage.FEATURE:
      return createFeature();
    case PDEPackage.PLUGIN:
      return createPlugin();
    case PDEPackage.FRAGMENT:
      return createFragment();
    case PDEPackage.ZIP_DISTRIBUTION:
      return createZipDistribution();
    case PDEPackage.POP_DISTRIBUTION:
      return createPopDistribution();
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
    case PDEPackage.LOCATION:
      return createLocationFromString(eDataType, initialValue);
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
    case PDEPackage.LOCATION:
      return convertLocationToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TargetPlatformChecker createTargetPlatformChecker()
  {
    TargetPlatformCheckerImpl targetPlatformChecker = new TargetPlatformCheckerImpl();
    return targetPlatformChecker;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ApiBaseline createApiBaseline()
  {
    ApiBaselineImpl apiBaseline = new ApiBaselineImpl();
    return apiBaseline;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TargetPlatform createTargetPlatform()
  {
    TargetPlatformImpl targetPlatform = new TargetPlatformImpl();
    return targetPlatform;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEProject createPDEProject()
  {
    PDEProjectImpl pdeProject = new PDEProjectImpl();
    return pdeProject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Plugin createPlugin()
  {
    PluginImpl plugin = new PluginImpl();
    return plugin;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ZipDistribution createZipDistribution()
  {
    ZipDistributionImpl zipDistribution = new ZipDistributionImpl();
    return zipDistribution;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopDistribution createPopDistribution()
  {
    PopDistributionImpl popDistribution = new PopDistributionImpl();
    return popDistribution;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Location createLocationFromString(EDataType eDataType, String initialValue)
  {
    Location result = Location.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertLocationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEPackage getPDEPackage()
  {
    return (PDEPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDEPackage getPackage()
  {
    return PDEPackage.eINSTANCE;
  }

} // PDEFactoryImpl
