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
 * $Id: PDEPackageImpl.java,v 1.1 2008-08-01 07:53:34 estepper Exp $
 */
package org.eclipse.net4j.pop.pde.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.net4j.pop.jdt.JDTPackage;

import org.eclipse.net4j.pop.pde.ApiBaseline;
import org.eclipse.net4j.pop.pde.Feature;
import org.eclipse.net4j.pop.pde.Fragment;
import org.eclipse.net4j.pop.pde.Location;
import org.eclipse.net4j.pop.pde.PDEConfigurator;
import org.eclipse.net4j.pop.pde.PDEDistribution;
import org.eclipse.net4j.pop.pde.PDEEntity;
import org.eclipse.net4j.pop.pde.PDEFactory;
import org.eclipse.net4j.pop.pde.PDEPackage;
import org.eclipse.net4j.pop.pde.PDEProject;
import org.eclipse.net4j.pop.pde.Plugin;
import org.eclipse.net4j.pop.pde.PluginEntity;
import org.eclipse.net4j.pop.pde.PopDistribution;
import org.eclipse.net4j.pop.pde.TargetPlatform;
import org.eclipse.net4j.pop.pde.TargetPlatformChecker;
import org.eclipse.net4j.pop.pde.ZipDistribution;

import org.eclipse.net4j.pop.product.ProductPackage;

import org.eclipse.net4j.pop.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDEPackageImpl extends EPackageImpl implements PDEPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetPlatformCheckerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdeConfiguratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apiBaselineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetPlatformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdeProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdeDistributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdeEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zipDistributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass popDistributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum locationEEnum = null;

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
   * @see org.eclipse.net4j.pop.pde.PDEPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PDEPackageImpl()
  {
    super(eNS_URI, PDEFactory.eINSTANCE);
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
  public static PDEPackage init()
  {
    if (isInited) return (PDEPackage)EPackage.Registry.INSTANCE.getEPackage(PDEPackage.eNS_URI);

    // Obtain or create and register package
    PDEPackageImpl thePDEPackage = (PDEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PDEPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(eNS_URI)
        : new PDEPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    JDTPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thePDEPackage.createPackageContents();

    // Initialize created meta-data
    thePDEPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePDEPackage.freeze();

    return thePDEPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetPlatformChecker()
  {
    return targetPlatformCheckerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDEConfigurator()
  {
    return pdeConfiguratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEConfigurator_AllEntities()
  {
    return (EReference)pdeConfiguratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApiBaseline()
  {
    return apiBaselineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApiBaseline_TargetPlatform()
  {
    return (EReference)apiBaselineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApiBaseline_Release()
  {
    return (EReference)apiBaselineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetPlatform()
  {
    return targetPlatformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetPlatform_Distributions()
  {
    return (EReference)targetPlatformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDEProject()
  {
    return pdeProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEProject_Entity()
  {
    return (EReference)pdeProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDEDistribution()
  {
    return pdeDistributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEDistribution_Entities()
  {
    return (EReference)pdeDistributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEDistribution_TargetPlatform()
  {
    return (EReference)pdeDistributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDEEntity()
  {
    return pdeEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPDEEntity_Id()
  {
    return (EAttribute)pdeEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPDEEntity_Version()
  {
    return (EAttribute)pdeEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPDEEntity_Location()
  {
    return (EAttribute)pdeEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEEntity_Project()
  {
    return (EReference)pdeEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDEEntity_Distribution()
  {
    return (EReference)pdeEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginEntity()
  {
    return pluginEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlugin()
  {
    return pluginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFragment()
  {
    return fragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZipDistribution()
  {
    return zipDistributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPopDistribution()
  {
    return popDistributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLocation()
  {
    return locationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDEFactory getPDEFactory()
  {
    return (PDEFactory)getEFactoryInstance();
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
    targetPlatformCheckerEClass = createEClass(TARGET_PLATFORM_CHECKER);

    pdeConfiguratorEClass = createEClass(PDE_CONFIGURATOR);
    createEReference(pdeConfiguratorEClass, PDE_CONFIGURATOR__ALL_ENTITIES);

    apiBaselineEClass = createEClass(API_BASELINE);
    createEReference(apiBaselineEClass, API_BASELINE__TARGET_PLATFORM);
    createEReference(apiBaselineEClass, API_BASELINE__RELEASE);

    targetPlatformEClass = createEClass(TARGET_PLATFORM);
    createEReference(targetPlatformEClass, TARGET_PLATFORM__DISTRIBUTIONS);

    pdeProjectEClass = createEClass(PDE_PROJECT);
    createEReference(pdeProjectEClass, PDE_PROJECT__ENTITY);

    pdeDistributionEClass = createEClass(PDE_DISTRIBUTION);
    createEReference(pdeDistributionEClass, PDE_DISTRIBUTION__ENTITIES);
    createEReference(pdeDistributionEClass, PDE_DISTRIBUTION__TARGET_PLATFORM);

    pdeEntityEClass = createEClass(PDE_ENTITY);
    createEAttribute(pdeEntityEClass, PDE_ENTITY__ID);
    createEAttribute(pdeEntityEClass, PDE_ENTITY__VERSION);
    createEAttribute(pdeEntityEClass, PDE_ENTITY__LOCATION);
    createEReference(pdeEntityEClass, PDE_ENTITY__PROJECT);
    createEReference(pdeEntityEClass, PDE_ENTITY__DISTRIBUTION);

    featureEClass = createEClass(FEATURE);

    pluginEntityEClass = createEClass(PLUGIN_ENTITY);

    pluginEClass = createEClass(PLUGIN);

    fragmentEClass = createEClass(FRAGMENT);

    zipDistributionEClass = createEClass(ZIP_DISTRIBUTION);

    popDistributionEClass = createEClass(POP_DISTRIBUTION);

    // Create enums
    locationEEnum = createEEnum(LOCATION);
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
    JDTPackage theJDTPackage = (JDTPackage)EPackage.Registry.INSTANCE.getEPackage(JDTPackage.eNS_URI);
    ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
    ProjectPackage theProjectPackage = (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    targetPlatformCheckerEClass.getESuperTypes().add(theJDTPackage.getJREChecker());
    pdeConfiguratorEClass.getESuperTypes().add(theProductPackage.getWorkspaceConfigurator());
    apiBaselineEClass.getESuperTypes().add(this.getPDEConfigurator());
    targetPlatformEClass.getESuperTypes().add(this.getPDEConfigurator());
    pdeProjectEClass.getESuperTypes().add(theProductPackage.getWorkspaceProject());
    featureEClass.getESuperTypes().add(this.getPDEEntity());
    pluginEntityEClass.getESuperTypes().add(this.getPDEEntity());
    pluginEClass.getESuperTypes().add(this.getPluginEntity());
    fragmentEClass.getESuperTypes().add(this.getPluginEntity());
    zipDistributionEClass.getESuperTypes().add(this.getPDEDistribution());
    popDistributionEClass.getESuperTypes().add(this.getPDEDistribution());

    // Initialize classes and features; add operations and parameters
    initEClass(targetPlatformCheckerEClass, TargetPlatformChecker.class,
        "TargetPlatformChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(pdeConfiguratorEClass, PDEConfigurator.class,
        "PDEConfigurator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPDEConfigurator_AllEntities(),
        this.getPDEEntity(),
        null,
        "allEntities", null, 0, -1, PDEConfigurator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(apiBaselineEClass, ApiBaseline.class,
        "ApiBaseline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getApiBaseline_TargetPlatform(),
        this.getTargetPlatform(),
        null,
        "targetPlatform", null, 0, 1, ApiBaseline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getApiBaseline_Release(),
        theProjectPackage.getRelease(),
        null,
        "release", null, 1, 1, ApiBaseline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(targetPlatformEClass, TargetPlatform.class,
        "TargetPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTargetPlatform_Distributions(),
        this.getPDEDistribution(),
        this.getPDEDistribution_TargetPlatform(),
        "distributions", null, 0, -1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(pdeProjectEClass, PDEProject.class,
        "PDEProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPDEProject_Entity(),
        this.getPDEEntity(),
        this.getPDEEntity_Project(),
        "entity", null, 1, 1, PDEProject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(pdeDistributionEClass, PDEDistribution.class,
        "PDEDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPDEDistribution_Entities(),
        this.getPDEEntity(),
        this.getPDEEntity_Distribution(),
        "entities", null, 1, -1, PDEDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPDEDistribution_TargetPlatform(),
        this.getTargetPlatform(),
        this.getTargetPlatform_Distributions(),
        "targetPlatform", null, 1, 1, PDEDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(pdeEntityEClass, PDEEntity.class, "PDEEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getPDEEntity_Id(),
        ecorePackage.getEString(),
        "id", null, 0, 1, PDEEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getPDEEntity_Version(),
        theProjectPackage.getVersion(),
        "version", null, 0, 1, PDEEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getPDEEntity_Location(),
        this.getLocation(),
        "location", null, 1, 1, PDEEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPDEEntity_Project(),
        this.getPDEProject(),
        this.getPDEProject_Entity(),
        "project", null, 0, 1, PDEEntity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPDEEntity_Distribution(),
        this.getPDEDistribution(),
        this.getPDEDistribution_Entities(),
        "distribution", null, 0, 1, PDEEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(pluginEntityEClass, PluginEntity.class,
        "PluginEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(zipDistributionEClass, ZipDistribution.class,
        "ZipDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    initEClass(popDistributionEClass, PopDistribution.class,
        "PopDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    // Initialize enums and add enum literals
    initEEnum(locationEEnum, Location.class, "Location"); //$NON-NLS-1$
    addEEnumLiteral(locationEEnum, Location.WORKSPACE);
    addEEnumLiteral(locationEEnum, Location.EXTERNAL);

    // Create resource
    createResource(eNS_URI);
  }

} //PDEPackageImpl
