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
 * $Id: PDEPackage.java,v 1.3 2008-08-01 08:34:29 estepper Exp $
 */
package org.eclipse.net4j.pop.pde;

import org.eclipse.net4j.pop.jdt.JDTPackage;
import org.eclipse.net4j.pop.product.ProductPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.pde.PDEFactory
 * @model kind="package"
 * @generated
 */
public interface PDEPackage extends EPackage
{
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNAME = "pde"; //$NON-NLS-1$

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/pop/pde/1.0.0"; //$NON-NLS-1$

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_PREFIX = "pop.pde"; //$NON-NLS-1$

  /**
   * The package content type ID. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eCONTENT_TYPE = "pop.pde"; //$NON-NLS-1$

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PDEPackage eINSTANCE = org.eclipse.net4j.pop.pde.impl.PDEPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.TargetPlatformCheckerImpl
   * <em>Target Platform Checker</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.TargetPlatformCheckerImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getTargetPlatformChecker()
   * @generated
   */
  int TARGET_PLATFORM_CHECKER = 0;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM_CHECKER__WORKSPACE_SPEC = JDTPackage.JRE_CHECKER__WORKSPACE_SPEC;

  /**
   * The number of structural features of the '<em>Target Platform Checker</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM_CHECKER_FEATURE_COUNT = JDTPackage.JRE_CHECKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PDEConfiguratorImpl <em>Configurator</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PDEConfiguratorImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEConfigurator()
   * @generated
   */
  int PDE_CONFIGURATOR = 1;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_CONFIGURATOR__WORKSPACE_SPEC = ProductPackage.WORKSPACE_CONFIGURATOR__WORKSPACE_SPEC;

  /**
   * The feature id for the '<em><b>All Entities</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_CONFIGURATOR__ALL_ENTITIES = ProductPackage.WORKSPACE_CONFIGURATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Configurator</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PDE_CONFIGURATOR_FEATURE_COUNT = ProductPackage.WORKSPACE_CONFIGURATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl <em>Api Baseline</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getApiBaseline()
   * @generated
   */
  int API_BASELINE = 2;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int API_BASELINE__WORKSPACE_SPEC = PDE_CONFIGURATOR__WORKSPACE_SPEC;

  /**
   * The feature id for the '<em><b>All Entities</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int API_BASELINE__ALL_ENTITIES = PDE_CONFIGURATOR__ALL_ENTITIES;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int API_BASELINE__TARGET_PLATFORM = PDE_CONFIGURATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Release</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int API_BASELINE__RELEASE = PDE_CONFIGURATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Api Baseline</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int API_BASELINE_FEATURE_COUNT = PDE_CONFIGURATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.TargetPlatformImpl <em>Target Platform</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.TargetPlatformImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getTargetPlatform()
   * @generated
   */
  int TARGET_PLATFORM = 3;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM__WORKSPACE_SPEC = PDE_CONFIGURATOR__WORKSPACE_SPEC;

  /**
   * The feature id for the '<em><b>All Entities</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM__ALL_ENTITIES = PDE_CONFIGURATOR__ALL_ENTITIES;

  /**
   * The feature id for the '<em><b>Distributions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM__DISTRIBUTIONS = PDE_CONFIGURATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Target Platform</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM_FEATURE_COUNT = PDE_CONFIGURATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PDEProjectImpl <em>Project</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PDEProjectImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEProject()
   * @generated
   */
  int PDE_PROJECT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__NAME = ProductPackage.WORKSPACE_PROJECT__NAME;

  /**
   * The feature id for the '<em><b>Working Sets</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__WORKING_SETS = ProductPackage.WORKSPACE_PROJECT__WORKING_SETS;

  /**
   * The feature id for the '<em><b>Workspace Spec</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__WORKSPACE_SPEC = ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC;

  /**
   * The feature id for the '<em><b>Code Root</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__CODE_ROOT = ProductPackage.WORKSPACE_PROJECT__CODE_ROOT;

  /**
   * The feature id for the '<em><b>Code Path</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__CODE_PATH = ProductPackage.WORKSPACE_PROJECT__CODE_PATH;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT__ENTITY = ProductPackage.WORKSPACE_PROJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Project</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_PROJECT_FEATURE_COUNT = ProductPackage.WORKSPACE_PROJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl <em>Distribution</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEDistribution()
   * @generated
   */
  int PDE_DISTRIBUTION = 5;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_DISTRIBUTION__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_DISTRIBUTION__TARGET_PLATFORM = 1;

  /**
   * The number of structural features of the '<em>Distribution</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PDE_DISTRIBUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl <em>Entity</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PDEEntityImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEEntity()
   * @generated
   */
  int PDE_ENTITY = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY__ID = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY__VERSION = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY__LOCATION = 2;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY__PROJECT = 3;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY__DISTRIBUTION = 4;

  /**
   * The number of structural features of the '<em>Entity</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PDE_ENTITY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.FeatureImpl <em>Feature</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.FeatureImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE__ID = PDE_ENTITY__ID;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE__VERSION = PDE_ENTITY__VERSION;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE__LOCATION = PDE_ENTITY__LOCATION;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE__PROJECT = PDE_ENTITY__PROJECT;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE__DISTRIBUTION = PDE_ENTITY__DISTRIBUTION;

  /**
   * The number of structural features of the '<em>Feature</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = PDE_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PluginEntityImpl <em>Plugin Entity</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PluginEntityImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPluginEntity()
   * @generated
   */
  int PLUGIN_ENTITY = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY__ID = PDE_ENTITY__ID;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY__VERSION = PDE_ENTITY__VERSION;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY__LOCATION = PDE_ENTITY__LOCATION;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY__PROJECT = PDE_ENTITY__PROJECT;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY__DISTRIBUTION = PDE_ENTITY__DISTRIBUTION;

  /**
   * The number of structural features of the '<em>Plugin Entity</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_ENTITY_FEATURE_COUNT = PDE_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PluginImpl <em>Plugin</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PluginImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPlugin()
   * @generated
   */
  int PLUGIN = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN__ID = PLUGIN_ENTITY__ID;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN__VERSION = PLUGIN_ENTITY__VERSION;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN__LOCATION = PLUGIN_ENTITY__LOCATION;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN__PROJECT = PLUGIN_ENTITY__PROJECT;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN__DISTRIBUTION = PLUGIN_ENTITY__DISTRIBUTION;

  /**
   * The number of structural features of the '<em>Plugin</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int PLUGIN_FEATURE_COUNT = PLUGIN_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.FragmentImpl <em>Fragment</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.FragmentImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT__ID = PLUGIN_ENTITY__ID;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT__VERSION = PLUGIN_ENTITY__VERSION;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT__LOCATION = PLUGIN_ENTITY__LOCATION;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT__PROJECT = PLUGIN_ENTITY__PROJECT;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT__DISTRIBUTION = PLUGIN_ENTITY__DISTRIBUTION;

  /**
   * The number of structural features of the '<em>Fragment</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = PLUGIN_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.ZipDistributionImpl <em>Zip Distribution</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.ZipDistributionImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getZipDistribution()
   * @generated
   */
  int ZIP_DISTRIBUTION = 11;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ZIP_DISTRIBUTION__ENTITIES = PDE_DISTRIBUTION__ENTITIES;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ZIP_DISTRIBUTION__TARGET_PLATFORM = PDE_DISTRIBUTION__TARGET_PLATFORM;

  /**
   * The number of structural features of the '<em>Zip Distribution</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ZIP_DISTRIBUTION_FEATURE_COUNT = PDE_DISTRIBUTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.impl.PopDistributionImpl <em>Pop Distribution</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.impl.PopDistributionImpl
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPopDistribution()
   * @generated
   */
  int POP_DISTRIBUTION = 12;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_DISTRIBUTION__ENTITIES = PDE_DISTRIBUTION__ENTITIES;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' container reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_DISTRIBUTION__TARGET_PLATFORM = PDE_DISTRIBUTION__TARGET_PLATFORM;

  /**
   * The number of structural features of the '<em>Pop Distribution</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int POP_DISTRIBUTION_FEATURE_COUNT = PDE_DISTRIBUTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.pde.Location <em>Location</em>}' enum. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.pde.Location
   * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 13;

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.TargetPlatformChecker
   * <em>Target Platform Checker</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Target Platform Checker</em>'.
   * @see org.eclipse.net4j.pop.pde.TargetPlatformChecker
   * @generated
   */
  EClass getTargetPlatformChecker();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PDEConfigurator <em>Configurator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Configurator</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEConfigurator
   * @generated
   */
  EClass getPDEConfigurator();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.pde.PDEConfigurator#getAllEntities
   * <em>All Entities</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference list '<em>All Entities</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEConfigurator#getAllEntities()
   * @see #getPDEConfigurator()
   * @generated
   */
  EReference getPDEConfigurator_AllEntities();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.ApiBaseline <em>Api Baseline</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Api Baseline</em>'.
   * @see org.eclipse.net4j.pop.pde.ApiBaseline
   * @generated
   */
  EClass getApiBaseline();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.pde.ApiBaseline#getTargetPlatform
   * <em>Target Platform</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Target Platform</em>'.
   * @see org.eclipse.net4j.pop.pde.ApiBaseline#getTargetPlatform()
   * @see #getApiBaseline()
   * @generated
   */
  EReference getApiBaseline_TargetPlatform();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.pde.ApiBaseline#getRelease
   * <em>Release</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference '<em>Release</em>'.
   * @see org.eclipse.net4j.pop.pde.ApiBaseline#getRelease()
   * @see #getApiBaseline()
   * @generated
   */
  EReference getApiBaseline_Release();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.TargetPlatform <em>Target Platform</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Target Platform</em>'.
   * @see org.eclipse.net4j.pop.pde.TargetPlatform
   * @generated
   */
  EClass getTargetPlatform();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.net4j.pop.pde.TargetPlatform#getDistributions <em>Distributions</em>}'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Distributions</em>'.
   * @see org.eclipse.net4j.pop.pde.TargetPlatform#getDistributions()
   * @see #getTargetPlatform()
   * @generated
   */
  EReference getTargetPlatform_Distributions();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PDEProject <em>Project</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Project</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEProject
   * @generated
   */
  EClass getPDEProject();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.pde.PDEProject#getEntity
   * <em>Entity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEProject#getEntity()
   * @see #getPDEProject()
   * @generated
   */
  EReference getPDEProject_Entity();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PDEDistribution <em>Distribution</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Distribution</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEDistribution
   * @generated
   */
  EClass getPDEDistribution();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.net4j.pop.pde.PDEDistribution#getEntities <em>Entities</em>}'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEDistribution#getEntities()
   * @see #getPDEDistribution()
   * @generated
   */
  EReference getPDEDistribution_Entities();

  /**
   * Returns the meta object for the container reference '
   * {@link org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform <em>Target Platform</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Target Platform</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEDistribution#getTargetPlatform()
   * @see #getPDEDistribution()
   * @generated
   */
  EReference getPDEDistribution_TargetPlatform();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PDEEntity <em>Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity
   * @generated
   */
  EClass getPDEEntity();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.pde.PDEEntity#getId <em>Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getId()
   * @see #getPDEEntity()
   * @generated
   */
  EAttribute getPDEEntity_Id();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.pde.PDEEntity#getVersion <em>Version</em>}
   * '. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getVersion()
   * @see #getPDEEntity()
   * @generated
   */
  EAttribute getPDEEntity_Version();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.pde.PDEEntity#getLocation
   * <em>Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getLocation()
   * @see #getPDEEntity()
   * @generated
   */
  EAttribute getPDEEntity_Location();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.pde.PDEEntity#getProject
   * <em>Project</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Project</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getProject()
   * @see #getPDEEntity()
   * @generated
   */
  EReference getPDEEntity_Project();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.pde.PDEEntity#getDistribution
   * <em>Distribution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the container reference '<em>Distribution</em>'.
   * @see org.eclipse.net4j.pop.pde.PDEEntity#getDistribution()
   * @see #getPDEEntity()
   * @generated
   */
  EReference getPDEEntity_Distribution();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.Feature <em>Feature</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.eclipse.net4j.pop.pde.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PluginEntity <em>Plugin Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Plugin Entity</em>'.
   * @see org.eclipse.net4j.pop.pde.PluginEntity
   * @generated
   */
  EClass getPluginEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.Plugin <em>Plugin</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Plugin</em>'.
   * @see org.eclipse.net4j.pop.pde.Plugin
   * @generated
   */
  EClass getPlugin();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.Fragment <em>Fragment</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Fragment</em>'.
   * @see org.eclipse.net4j.pop.pde.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.ZipDistribution <em>Zip Distribution</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Zip Distribution</em>'.
   * @see org.eclipse.net4j.pop.pde.ZipDistribution
   * @generated
   */
  EClass getZipDistribution();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.pde.PopDistribution <em>Pop Distribution</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Pop Distribution</em>'.
   * @see org.eclipse.net4j.pop.pde.PopDistribution
   * @generated
   */
  EClass getPopDistribution();

  /**
   * Returns the meta object for enum '{@link org.eclipse.net4j.pop.pde.Location <em>Location</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for enum '<em>Location</em>'.
   * @see org.eclipse.net4j.pop.pde.Location
   * @generated
   */
  EEnum getLocation();

  /**
   * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDEFactory getPDEFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.TargetPlatformCheckerImpl
     * <em>Target Platform Checker</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.TargetPlatformCheckerImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getTargetPlatformChecker()
     * @generated
     */
    EClass TARGET_PLATFORM_CHECKER = eINSTANCE.getTargetPlatformChecker();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PDEConfiguratorImpl <em>Configurator</em>}
     * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PDEConfiguratorImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEConfigurator()
     * @generated
     */
    EClass PDE_CONFIGURATOR = eINSTANCE.getPDEConfigurator();

    /**
     * The meta object literal for the '<em><b>All Entities</b></em>' reference list feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_CONFIGURATOR__ALL_ENTITIES = eINSTANCE.getPDEConfigurator_AllEntities();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl <em>Api Baseline</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.ApiBaselineImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getApiBaseline()
     * @generated
     */
    EClass API_BASELINE = eINSTANCE.getApiBaseline();

    /**
     * The meta object literal for the '<em><b>Target Platform</b></em>' reference feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference API_BASELINE__TARGET_PLATFORM = eINSTANCE.getApiBaseline_TargetPlatform();

    /**
     * The meta object literal for the '<em><b>Release</b></em>' reference feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference API_BASELINE__RELEASE = eINSTANCE.getApiBaseline_Release();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.TargetPlatformImpl
     * <em>Target Platform</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.TargetPlatformImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getTargetPlatform()
     * @generated
     */
    EClass TARGET_PLATFORM = eINSTANCE.getTargetPlatform();

    /**
     * The meta object literal for the '<em><b>Distributions</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TARGET_PLATFORM__DISTRIBUTIONS = eINSTANCE.getTargetPlatform_Distributions();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PDEProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PDEProjectImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEProject()
     * @generated
     */
    EClass PDE_PROJECT = eINSTANCE.getPDEProject();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_PROJECT__ENTITY = eINSTANCE.getPDEProject_Entity();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl <em>Distribution</em>}
     * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PDEDistributionImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEDistribution()
     * @generated
     */
    EClass PDE_DISTRIBUTION = eINSTANCE.getPDEDistribution();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_DISTRIBUTION__ENTITIES = eINSTANCE.getPDEDistribution_Entities();

    /**
     * The meta object literal for the '<em><b>Target Platform</b></em>' container reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_DISTRIBUTION__TARGET_PLATFORM = eINSTANCE.getPDEDistribution_TargetPlatform();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PDEEntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PDEEntityImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPDEEntity()
     * @generated
     */
    EClass PDE_ENTITY = eINSTANCE.getPDEEntity();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    EAttribute PDE_ENTITY__ID = eINSTANCE.getPDEEntity_Id();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute PDE_ENTITY__VERSION = eINSTANCE.getPDEEntity_Version();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute PDE_ENTITY__LOCATION = eINSTANCE.getPDEEntity_Location();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' container reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_ENTITY__PROJECT = eINSTANCE.getPDEEntity_Project();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' container reference feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PDE_ENTITY__DISTRIBUTION = eINSTANCE.getPDEEntity_Distribution();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.FeatureImpl <em>Feature</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.FeatureImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PluginEntityImpl <em>Plugin Entity</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PluginEntityImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPluginEntity()
     * @generated
     */
    EClass PLUGIN_ENTITY = eINSTANCE.getPluginEntity();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PluginImpl <em>Plugin</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PluginImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPlugin()
     * @generated
     */
    EClass PLUGIN = eINSTANCE.getPlugin();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.FragmentImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.ZipDistributionImpl
     * <em>Zip Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.ZipDistributionImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getZipDistribution()
     * @generated
     */
    EClass ZIP_DISTRIBUTION = eINSTANCE.getZipDistribution();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.impl.PopDistributionImpl
     * <em>Pop Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.impl.PopDistributionImpl
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getPopDistribution()
     * @generated
     */
    EClass POP_DISTRIBUTION = eINSTANCE.getPopDistribution();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.pde.Location <em>Location</em>}' enum. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.pde.Location
     * @see org.eclipse.net4j.pop.pde.impl.PDEPackageImpl#getLocation()
     * @generated
     */
    EEnum LOCATION = eINSTANCE.getLocation();

  }

} // PDEPackage
