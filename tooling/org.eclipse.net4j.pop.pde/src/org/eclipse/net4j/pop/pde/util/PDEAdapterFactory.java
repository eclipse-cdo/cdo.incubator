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
 * $Id: PDEAdapterFactory.java,v 1.3 2008-08-05 14:47:45 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.util;

import org.eclipse.net4j.pop.jdt.JREChecker;
import org.eclipse.net4j.pop.pde.ApiBaseline;
import org.eclipse.net4j.pop.pde.Feature;
import org.eclipse.net4j.pop.pde.Fragment;
import org.eclipse.net4j.pop.pde.PDEConfigurator;
import org.eclipse.net4j.pop.pde.PDEDistribution;
import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.PDEProject;
import org.eclipse.net4j.pop.pde.Plugin;
import org.eclipse.net4j.pop.pde.PluginEntity;
import org.eclipse.net4j.pop.pde.PopDistribution;
import org.eclipse.net4j.pop.pde.TargetPlatform;
import org.eclipse.net4j.pop.pde.TargetPlatformChecker;
import org.eclipse.net4j.pop.pde.ZipDistribution;
import org.eclipse.net4j.pop.product.WorkspaceConfigurator;
import org.eclipse.net4j.pop.product.WorkspaceProject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.pde.PDEPackage
 * @generated
 */
public class PDEAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static PDEPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PDEAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PDEPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PDESwitch<Adapter> modelSwitch = new PDESwitch<Adapter>()
  {
    @Override
    public Adapter caseTargetPlatformChecker(TargetPlatformChecker object)
    {
      return createTargetPlatformCheckerAdapter();
    }

    @Override
    public Adapter casePDEConfigurator(PDEConfigurator object)
    {
      return createPDEConfiguratorAdapter();
    }

    @Override
    public Adapter caseApiBaseline(ApiBaseline object)
    {
      return createApiBaselineAdapter();
    }

    @Override
    public Adapter caseTargetPlatform(TargetPlatform object)
    {
      return createTargetPlatformAdapter();
    }

    @Override
    public Adapter casePDEProject(PDEProject object)
    {
      return createPDEProjectAdapter();
    }

    @Override
    public Adapter casePDEDistribution(PDEDistribution object)
    {
      return createPDEDistributionAdapter();
    }

    @Override
    public Adapter casePDEEntity(PDEEntity object)
    {
      return createPDEEntityAdapter();
    }

    @Override
    public Adapter caseFeature(Feature object)
    {
      return createFeatureAdapter();
    }

    @Override
    public Adapter casePluginEntity(PluginEntity object)
    {
      return createPluginEntityAdapter();
    }

    @Override
    public Adapter casePlugin(Plugin object)
    {
      return createPluginAdapter();
    }

    @Override
    public Adapter caseFragment(Fragment object)
    {
      return createFragmentAdapter();
    }

    @Override
    public Adapter caseZipDistribution(ZipDistribution object)
    {
      return createZipDistributionAdapter();
    }

    @Override
    public Adapter casePopDistribution(PopDistribution object)
    {
      return createPopDistributionAdapter();
    }

    @Override
    public Adapter caseWorkspaceConfigurator(WorkspaceConfigurator object)
    {
      return createWorkspaceConfiguratorAdapter();
    }

    @Override
    public Adapter caseJREChecker(JREChecker object)
    {
      return createJRECheckerAdapter();
    }

    @Override
    public Adapter caseWorkspaceProject(WorkspaceProject object)
    {
      return createWorkspaceProjectAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.TargetPlatformChecker <em>Target Platform Checker</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.TargetPlatformChecker
   * @generated
   */
  public Adapter createTargetPlatformCheckerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PDEConfigurator <em>Configurator</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PDEConfigurator
   * @generated
   */
  public Adapter createPDEConfiguratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.ApiBaseline <em>Api Baseline</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.ApiBaseline
   * @generated
   */
  public Adapter createApiBaselineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.TargetPlatform <em>Target Platform</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.TargetPlatform
   * @generated
   */
  public Adapter createTargetPlatformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PDEProject <em>Project</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PDEProject
   * @generated
   */
  public Adapter createPDEProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PDEDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PDEDistribution
   * @generated
   */
  public Adapter createPDEDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PDEEntity <em>Entity</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PDEEntity
   * @generated
   */
  public Adapter createPDEEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.Feature <em>Feature</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PluginEntity <em>Plugin Entity</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PluginEntity
   * @generated
   */
  public Adapter createPluginEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.Plugin <em>Plugin</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.Plugin
   * @generated
   */
  public Adapter createPluginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.Fragment <em>Fragment</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.Fragment
   * @generated
   */
  public Adapter createFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.ZipDistribution <em>Zip Distribution</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.ZipDistribution
   * @generated
   */
  public Adapter createZipDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.pde.PopDistribution <em>Pop Distribution</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.pde.PopDistribution
   * @generated
   */
  public Adapter createPopDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.product.WorkspaceConfigurator <em>Workspace Configurator</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.product.WorkspaceConfigurator
   * @generated
   */
  public Adapter createWorkspaceConfiguratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.jdt.JREChecker <em>JRE Checker</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.jdt.JREChecker
   * @generated
   */
  public Adapter createJRECheckerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.product.WorkspaceProject <em>Workspace Project</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.product.WorkspaceProject
   * @generated
   */
  public Adapter createWorkspaceProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // PDEAdapterFactory
