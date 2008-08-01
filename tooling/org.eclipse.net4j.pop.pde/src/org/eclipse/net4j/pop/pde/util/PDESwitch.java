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
 * $Id: PDESwitch.java,v 1.2 2008-08-01 08:15:04 estepper Exp $
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import java.util.List;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.pde.PDEPackage
 * @generated
 */
public class PDESwitch<T>
{
  /**
   * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected static PDEPackage modelPackage;

  /**
   * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PDESwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PDEPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case PDEPackage.TARGET_PLATFORM_CHECKER:
    {
      TargetPlatformChecker targetPlatformChecker = (TargetPlatformChecker)theEObject;
      T result = caseTargetPlatformChecker(targetPlatformChecker);
      if (result == null) result = caseJREChecker(targetPlatformChecker);
      if (result == null) result = caseWorkspaceConfigurator(targetPlatformChecker);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PDE_CONFIGURATOR:
    {
      PDEConfigurator pdeConfigurator = (PDEConfigurator)theEObject;
      T result = casePDEConfigurator(pdeConfigurator);
      if (result == null) result = caseWorkspaceConfigurator(pdeConfigurator);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.API_BASELINE:
    {
      ApiBaseline apiBaseline = (ApiBaseline)theEObject;
      T result = caseApiBaseline(apiBaseline);
      if (result == null) result = casePDEConfigurator(apiBaseline);
      if (result == null) result = caseWorkspaceConfigurator(apiBaseline);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.TARGET_PLATFORM:
    {
      TargetPlatform targetPlatform = (TargetPlatform)theEObject;
      T result = caseTargetPlatform(targetPlatform);
      if (result == null) result = casePDEConfigurator(targetPlatform);
      if (result == null) result = caseWorkspaceConfigurator(targetPlatform);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PDE_PROJECT:
    {
      PDEProject pdeProject = (PDEProject)theEObject;
      T result = casePDEProject(pdeProject);
      if (result == null) result = caseWorkspaceProject(pdeProject);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PDE_DISTRIBUTION:
    {
      PDEDistribution pdeDistribution = (PDEDistribution)theEObject;
      T result = casePDEDistribution(pdeDistribution);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PDE_ENTITY:
    {
      PDEEntity pdeEntity = (PDEEntity)theEObject;
      T result = casePDEEntity(pdeEntity);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.FEATURE:
    {
      Feature feature = (Feature)theEObject;
      T result = caseFeature(feature);
      if (result == null) result = casePDEEntity(feature);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PLUGIN_ENTITY:
    {
      PluginEntity pluginEntity = (PluginEntity)theEObject;
      T result = casePluginEntity(pluginEntity);
      if (result == null) result = casePDEEntity(pluginEntity);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.PLUGIN:
    {
      Plugin plugin = (Plugin)theEObject;
      T result = casePlugin(plugin);
      if (result == null) result = casePluginEntity(plugin);
      if (result == null) result = casePDEEntity(plugin);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.FRAGMENT:
    {
      Fragment fragment = (Fragment)theEObject;
      T result = caseFragment(fragment);
      if (result == null) result = casePluginEntity(fragment);
      if (result == null) result = casePDEEntity(fragment);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.ZIP_DISTRIBUTION:
    {
      ZipDistribution zipDistribution = (ZipDistribution)theEObject;
      T result = caseZipDistribution(zipDistribution);
      if (result == null) result = casePDEDistribution(zipDistribution);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case PDEPackage.POP_DISTRIBUTION:
    {
      PopDistribution popDistribution = (PopDistribution)theEObject;
      T result = casePopDistribution(popDistribution);
      if (result == null) result = casePDEDistribution(popDistribution);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Platform Checker</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Platform Checker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetPlatformChecker(TargetPlatformChecker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configurator</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configurator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDEConfigurator(PDEConfigurator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Api Baseline</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Api Baseline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApiBaseline(ApiBaseline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Platform</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Platform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetPlatform(TargetPlatform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDEProject(PDEProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDEDistribution(PDEDistribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDEEntity(PDEEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Entity</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginEntity(PluginEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlugin(Plugin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFragment(Fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zip Distribution</em>'. <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zip Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZipDistribution(ZipDistribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pop Distribution</em>'. <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pop Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePopDistribution(PopDistribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workspace Configurator</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workspace Configurator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkspaceConfigurator(WorkspaceConfigurator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JRE Checker</em>'. <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JRE Checker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJREChecker(JREChecker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workspace Project</em>'. <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workspace Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkspaceProject(WorkspaceProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} // PDESwitch
