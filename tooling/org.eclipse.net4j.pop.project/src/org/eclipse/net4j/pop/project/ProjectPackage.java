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
 * $Id: ProjectPackage.java,v 1.13 2008-08-03 17:31:34 estepper Exp $
 */
package org.eclipse.net4j.pop.project;

import org.eclipse.net4j.pop.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.net4j.pop.project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "project"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/pop/project/1.0.0"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pop.project"; //$NON-NLS-1$

  /**
   * The package content type ID.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eCONTENT_TYPE = "pop.project"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ProjectPackage eINSTANCE = org.eclipse.net4j.pop.project.impl.ProjectPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl <em>Pop Project</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.PopProjectImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getPopProject()
   * @generated
   */
  int POP_PROJECT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__NAME = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Team Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__TEAM_PROVIDER = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repository Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__REPOSITORY_URL = BasePackage.POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Committers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__COMMITTERS = BasePackage.POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Code Roots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__CODE_ROOTS = BasePackage.POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Main Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__MAIN_BRANCH = BasePackage.POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Root Stream</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_PROJECT__ROOT_STREAM = BasePackage.POP_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Pop Project</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int POP_PROJECT_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.CodeRootImpl <em>Code Root</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.CodeRootImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getCodeRoot()
   * @generated
   */
  int CODE_ROOT = 1;

  /**
   * The feature id for the '<em><b>Pop Project</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ROOT__POP_PROJECT = 0;

  /**
   * The feature id for the '<em><b>Root Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ROOT__ROOT_PATH = 1;

  /**
   * The number of structural features of the '<em>Code Root</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ROOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.CommitterImpl <em>Committer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.CommitterImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getCommitter()
   * @generated
   */
  int COMMITTER = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Pop Project</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__POP_PROJECT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Repository Login</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__REPOSITORY_LOGIN = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__NAME = BasePackage.POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__EMAIL = BasePackage.POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__ENTRY = BasePackage.POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Exit</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__EXIT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER__ACTIVE = BasePackage.POP_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Committer</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITTER_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.TaggedElementImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTaggedElement()
   * @generated
   */
  int TAGGED_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__TAG = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tagged Element</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.TagImpl <em>Tag</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.TagImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTag()
   * @generated
   */
  int TAG = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__BRANCH = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tagged Element</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__TAGGED_ELEMENT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.BranchImpl <em>Branch</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.BranchImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__NAME = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__BRANCHES = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int BRANCH__TAGS = BasePackage.POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__STREAM = BasePackage.POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.MainBranchImpl <em>Main Branch</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.MainBranchImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMainBranch()
   * @generated
   */
  int MAIN_BRANCH = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__ID = BRANCH__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__CLASS = BRANCH__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__NAME = BRANCH__NAME;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__BRANCHES = BRANCH__BRANCHES;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__TAGS = BRANCH__TAGS;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__STREAM = BRANCH__STREAM;

  /**
   * The feature id for the '<em><b>Pop Project</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__POP_PROJECT = BRANCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Main Branch</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAIN_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.SubBranchImpl <em>Sub Branch</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.SubBranchImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getSubBranch()
   * @generated
   */
  int SUB_BRANCH = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__ID = BRANCH__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__CLASS = BRANCH__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__NAME = BRANCH__NAME;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__BRANCHES = BRANCH__BRANCHES;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int SUB_BRANCH__TAGS = BRANCH__TAGS;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__STREAM = BRANCH__STREAM;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__TAG = BRANCH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__PARENT = BRANCH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Branch</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.StreamImpl <em>Stream</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.StreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getStream()
   * @generated
   */
  int STREAM = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__ID = BasePackage.POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__CLASS = BasePackage.POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__BRANCH = BasePackage.POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__MERGES = BasePackage.POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_FEATURE_COUNT = BasePackage.POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl <em>Task Stream</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.TaskStreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTaskStream()
   * @generated
   */
  int TASK_STREAM = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__ID = STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__CLASS = STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__BRANCH = STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__MERGES = STREAM__MERGES;

  /**
   * The feature id for the '<em><b>Task Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__TASK_ID = STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__PARENT = STREAM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Baseline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__BASELINE = STREAM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Targets</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__TARGETS = STREAM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Deliveries</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STREAM__DELIVERIES = STREAM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Task Stream</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TASK_STREAM_FEATURE_COUNT = STREAM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.IntegrationStreamImpl <em>Integration Stream</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.IntegrationStreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getIntegrationStream()
   * @generated
   */
  int INTEGRATION_STREAM = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__ID = STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__CLASS = STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__BRANCH = STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__MERGES = STREAM__MERGES;

  /**
   * The feature id for the '<em><b>Task Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__TASK_STREAMS = STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__RELEASES = STREAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integration Stream</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM_FEATURE_COUNT = STREAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.DevelopmentStreamImpl <em>Development Stream</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.DevelopmentStreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getDevelopmentStream()
   * @generated
   */
  int DEVELOPMENT_STREAM = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__ID = INTEGRATION_STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__CLASS = INTEGRATION_STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__BRANCH = INTEGRATION_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__MERGES = INTEGRATION_STREAM__MERGES;

  /**
   * The feature id for the '<em><b>Task Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__TASK_STREAMS = INTEGRATION_STREAM__TASK_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__RELEASES = INTEGRATION_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Maintenance Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__MAINTENANCE_STREAMS = INTEGRATION_STREAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Development Stream</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM_FEATURE_COUNT = INTEGRATION_STREAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl <em>Maintenance Stream</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMaintenanceStream()
   * @generated
   */
  int MAINTENANCE_STREAM = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__ID = INTEGRATION_STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__CLASS = INTEGRATION_STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__BRANCH = INTEGRATION_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__MERGES = INTEGRATION_STREAM__MERGES;

  /**
   * The feature id for the '<em><b>Task Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__TASK_STREAMS = INTEGRATION_STREAM__TASK_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__RELEASES = INTEGRATION_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__PARENT = INTEGRATION_STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Baseline</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__BASELINE = INTEGRATION_STREAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Maintenance Stream</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM_FEATURE_COUNT = INTEGRATION_STREAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.RootStreamImpl <em>Root Stream</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.RootStreamImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getRootStream()
   * @generated
   */
  int ROOT_STREAM = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__ID = DEVELOPMENT_STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__CLASS = DEVELOPMENT_STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__BRANCH = DEVELOPMENT_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Merges</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__MERGES = DEVELOPMENT_STREAM__MERGES;

  /**
   * The feature id for the '<em><b>Task Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__TASK_STREAMS = DEVELOPMENT_STREAM__TASK_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__RELEASES = DEVELOPMENT_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Maintenance Streams</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__MAINTENANCE_STREAMS = DEVELOPMENT_STREAM__MAINTENANCE_STREAMS;

  /**
   * The feature id for the '<em><b>Pop Project</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__POP_PROJECT = DEVELOPMENT_STREAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Root Stream</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ROOT_STREAM_FEATURE_COUNT = DEVELOPMENT_STREAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.TargetImpl <em>Target</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.TargetImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__ID = TAGGED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__CLASS = TAGGED_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Streams</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__STREAMS = TAGGED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.ReleaseImpl <em>Release</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.ReleaseImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getRelease()
   * @generated
   */
  int RELEASE = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__ID = TARGET__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__CLASS = TARGET__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__TAG = TARGET__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__DATE = TARGET__DATE;

  /**
   * The feature id for the '<em><b>Streams</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__STREAMS = TARGET__STREAMS;

  /**
   * The feature id for the '<em><b>Maintenance</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__MAINTENANCE = TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__VERSION = TARGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__STREAM = TARGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Milestones</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__MILESTONES = TARGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Release</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE_FEATURE_COUNT = TARGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.MilestoneImpl <em>Milestone</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.project.impl.MilestoneImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMilestone()
   * @generated
   */
  int MILESTONE = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__ID = TARGET__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__CLASS = TARGET__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__TAG = TARGET__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__DATE = TARGET__DATE;

  /**
   * The feature id for the '<em><b>Streams</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__STREAMS = TARGET__STREAMS;

  /**
   * The feature id for the '<em><b>Release</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__RELEASE = TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__NAME = TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Milestone</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE_FEATURE_COUNT = TARGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.DeliveryImpl <em>Delivery</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.DeliveryImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getDelivery()
   * @generated
   */
  int DELIVERY = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__ID = TAGGED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__CLASS = TAGGED_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__STREAM = TAGGED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__NUMBER = TAGGED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Merges</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__MERGES = TAGGED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Delivery</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.project.impl.MergeImpl <em>Merge</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.net4j.pop.project.impl.MergeImpl
   * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMerge()
   * @generated
   */
  int MERGE = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__ID = TAGGED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__CLASS = TAGGED_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__STREAM = TAGGED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delivery</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__DELIVERY = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Merge</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.PopProject <em>Pop Project</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject
   * @generated
   */
  EClass getPopProject();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.PopProject#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getName()
   * @see #getPopProject()
   * @generated
   */
  EAttribute getPopProject_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.PopProject#getTeamProvider <em>Team Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Team Provider</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getTeamProvider()
   * @see #getPopProject()
   * @generated
   */
  EAttribute getPopProject_TeamProvider();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.PopProject#getRepositoryUrl <em>Repository Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository Url</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getRepositoryUrl()
   * @see #getPopProject()
   * @generated
   */
  EAttribute getPopProject_RepositoryUrl();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.PopProject#getCodeRoots <em>Code Roots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code Roots</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getCodeRoots()
   * @see #getPopProject()
   * @generated
   */
  EReference getPopProject_CodeRoots();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.PopProject#getCommitters <em>Committers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Committers</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getCommitters()
   * @see #getPopProject()
   * @generated
   */
  EReference getPopProject_Committers();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.project.PopProject#getMainBranch <em>Main Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Branch</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getMainBranch()
   * @see #getPopProject()
   * @generated
   */
  EReference getPopProject_MainBranch();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.project.PopProject#getRootStream <em>Root Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Stream</em>'.
   * @see org.eclipse.net4j.pop.project.PopProject#getRootStream()
   * @see #getPopProject()
   * @generated
   */
  EReference getPopProject_RootStream();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.CodeRoot <em>Code Root</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Code Root</em>'.
   * @see org.eclipse.net4j.pop.project.CodeRoot
   * @generated
   */
  EClass getCodeRoot();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.CodeRoot#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.project.CodeRoot#getPopProject()
   * @see #getCodeRoot()
   * @generated
   */
  EReference getCodeRoot_PopProject();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.CodeRoot#getRootPath <em>Root Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Path</em>'.
   * @see org.eclipse.net4j.pop.project.CodeRoot#getRootPath()
   * @see #getCodeRoot()
   * @generated
   */
  EAttribute getCodeRoot_RootPath();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Committer <em>Committer</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Committer</em>'.
   * @see org.eclipse.net4j.pop.project.Committer
   * @generated
   */
  EClass getCommitter();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Committer#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getPopProject()
   * @see #getCommitter()
   * @generated
   */
  EReference getCommitter_PopProject();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#getRepositoryLogin <em>Repository Login</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository Login</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getRepositoryLogin()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_RepositoryLogin();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getName()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getEmail()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_Email();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getEntry()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_Entry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#getExit()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_Exit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Committer#isActive <em>Active</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.eclipse.net4j.pop.project.Committer#isActive()
   * @see #getCommitter()
   * @generated
   */
  EAttribute getCommitter_Active();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.TaggedElement <em>Tagged Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Element</em>'.
   * @see org.eclipse.net4j.pop.project.TaggedElement
   * @generated
   */
  EClass getTaggedElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.TaggedElement#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tag</em>'.
   * @see org.eclipse.net4j.pop.project.TaggedElement#getTag()
   * @see #getTaggedElement()
   * @generated
   */
  EReference getTaggedElement_Tag();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see org.eclipse.net4j.pop.project.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Tag#getBranch <em>Branch</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.project.Tag#getBranch()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Branch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Tag#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.project.Tag#getName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.Tag#getTaggedElement <em>Tagged Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tagged Element</em>'.
   * @see org.eclipse.net4j.pop.project.Tag#getTaggedElement()
   * @see #getTag()
   * @generated
   */
  EReference getTag_TaggedElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Branch <em>Branch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.project.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Branch#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.project.Branch#getName()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.Branch#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.eclipse.net4j.pop.project.Branch#getBranches()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Branches();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.Branch#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see org.eclipse.net4j.pop.project.Branch#getTags()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Tags();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.Branch#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.project.Branch#getStream()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Stream();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.MainBranch <em>Main Branch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Main Branch</em>'.
   * @see org.eclipse.net4j.pop.project.MainBranch
   * @generated
   */
  EClass getMainBranch();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.MainBranch#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.project.MainBranch#getPopProject()
   * @see #getMainBranch()
   * @generated
   */
  EReference getMainBranch_PopProject();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.SubBranch <em>Sub Branch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Sub Branch</em>'.
   * @see org.eclipse.net4j.pop.project.SubBranch
   * @generated
   */
  EClass getSubBranch();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.SubBranch#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.project.SubBranch#getParent()
   * @see #getSubBranch()
   * @generated
   */
  EReference getSubBranch_Parent();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Stream <em>Stream</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.project.Stream
   * @generated
   */
  EClass getStream();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.Stream#getBranch <em>Branch</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.project.Stream#getBranch()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Branch();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.Stream#getMerges <em>Merges</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Merges</em>'.
   * @see org.eclipse.net4j.pop.project.Stream#getMerges()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Merges();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.TaskStream <em>Task Stream</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Task Stream</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream
   * @generated
   */
  EClass getTaskStream();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.TaskStream#getTaskId <em>Task Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Id</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream#getTaskId()
   * @see #getTaskStream()
   * @generated
   */
  EAttribute getTaskStream_TaskId();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.TaskStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream#getParent()
   * @see #getTaskStream()
   * @generated
   */
  EReference getTaskStream_Parent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.TaskStream#getBaseline <em>Baseline</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Baseline</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream#getBaseline()
   * @see #getTaskStream()
   * @generated
   */
  EAttribute getTaskStream_Baseline();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.project.TaskStream#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Targets</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream#getTargets()
   * @see #getTaskStream()
   * @generated
   */
  EReference getTaskStream_Targets();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.TaskStream#getDeliveries <em>Deliveries</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deliveries</em>'.
   * @see org.eclipse.net4j.pop.project.TaskStream#getDeliveries()
   * @see #getTaskStream()
   * @generated
   */
  EReference getTaskStream_Deliveries();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.IntegrationStream <em>Integration Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Integration Stream</em>'.
   * @see org.eclipse.net4j.pop.project.IntegrationStream
   * @generated
   */
  EClass getIntegrationStream();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.IntegrationStream#getTaskStreams <em>Task Streams</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Streams</em>'.
   * @see org.eclipse.net4j.pop.project.IntegrationStream#getTaskStreams()
   * @see #getIntegrationStream()
   * @generated
   */
  EReference getIntegrationStream_TaskStreams();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.IntegrationStream#getReleases <em>Releases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Releases</em>'.
   * @see org.eclipse.net4j.pop.project.IntegrationStream#getReleases()
   * @see #getIntegrationStream()
   * @generated
   */
  EReference getIntegrationStream_Releases();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.DevelopmentStream <em>Development Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Development Stream</em>'.
   * @see org.eclipse.net4j.pop.project.DevelopmentStream
   * @generated
   */
  EClass getDevelopmentStream();

  /**
   * Returns the meta object for the reference list '
   * {@link org.eclipse.net4j.pop.project.DevelopmentStream#getMaintenanceStreams <em>Maintenance Streams</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the reference list '<em>Maintenance Streams</em>'.
   * @see org.eclipse.net4j.pop.project.DevelopmentStream#getMaintenanceStreams()
   * @see #getDevelopmentStream()
   * @generated
   */
  EReference getDevelopmentStream_MaintenanceStreams();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.MaintenanceStream <em>Maintenance Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Maintenance Stream</em>'.
   * @see org.eclipse.net4j.pop.project.MaintenanceStream
   * @generated
   */
  EClass getMaintenanceStream();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.MaintenanceStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.project.MaintenanceStream#getParent()
   * @see #getMaintenanceStream()
   * @generated
   */
  EReference getMaintenanceStream_Parent();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.MaintenanceStream#getBaseline <em>Baseline</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Baseline</em>'.
   * @see org.eclipse.net4j.pop.project.MaintenanceStream#getBaseline()
   * @see #getMaintenanceStream()
   * @generated
   */
  EReference getMaintenanceStream_Baseline();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.RootStream <em>Root Stream</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Root Stream</em>'.
   * @see org.eclipse.net4j.pop.project.RootStream
   * @generated
   */
  EClass getRootStream();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.RootStream#getPopProject <em>Pop Project</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop Project</em>'.
   * @see org.eclipse.net4j.pop.project.RootStream#getPopProject()
   * @see #getRootStream()
   * @generated
   */
  EReference getRootStream_PopProject();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Target <em>Target</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Target</em>'.
   * @see org.eclipse.net4j.pop.project.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Target#getDate <em>Date</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.project.Target#getDate()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Date();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.project.Target#getStreams <em>Streams</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Streams</em>'.
   * @see org.eclipse.net4j.pop.project.Target#getStreams()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Streams();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Release <em>Release</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Release</em>'.
   * @see org.eclipse.net4j.pop.project.Release
   * @generated
   */
  EClass getRelease();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.Release#getMaintenance <em>Maintenance</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Maintenance</em>'.
   * @see org.eclipse.net4j.pop.project.Release#getMaintenance()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Maintenance();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Release#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.net4j.pop.project.Release#getVersion()
   * @see #getRelease()
   * @generated
   */
  EAttribute getRelease_Version();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Release#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.project.Release#getStream()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Stream();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.project.Release#getMilestones <em>Milestones</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Milestones</em>'.
   * @see org.eclipse.net4j.pop.project.Release#getMilestones()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Milestones();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Milestone <em>Milestone</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Milestone</em>'.
   * @see org.eclipse.net4j.pop.project.Milestone
   * @generated
   */
  EClass getMilestone();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Milestone#getRelease <em>Release</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Release</em>'.
   * @see org.eclipse.net4j.pop.project.Milestone#getRelease()
   * @see #getMilestone()
   * @generated
   */
  EReference getMilestone_Release();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Milestone#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.project.Milestone#getName()
   * @see #getMilestone()
   * @generated
   */
  EAttribute getMilestone_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Delivery <em>Delivery</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Delivery</em>'.
   * @see org.eclipse.net4j.pop.project.Delivery
   * @generated
   */
  EClass getDelivery();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Delivery#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.project.Delivery#getStream()
   * @see #getDelivery()
   * @generated
   */
  EReference getDelivery_Stream();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Delivery#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.eclipse.net4j.pop.project.Delivery#getNumber()
   * @see #getDelivery()
   * @generated
   */
  EAttribute getDelivery_Number();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Delivery#getDate <em>Date</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.project.Delivery#getDate()
   * @see #getDelivery()
   * @generated
   */
  EAttribute getDelivery_Date();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.project.Delivery#getMerges <em>Merges</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Merges</em>'.
   * @see org.eclipse.net4j.pop.project.Delivery#getMerges()
   * @see #getDelivery()
   * @generated
   */
  EReference getDelivery_Merges();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.project.Merge <em>Merge</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Merge</em>'.
   * @see org.eclipse.net4j.pop.project.Merge
   * @generated
   */
  EClass getMerge();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.project.Merge#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.project.Merge#getStream()
   * @see #getMerge()
   * @generated
   */
  EReference getMerge_Stream();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.project.Merge#getDate <em>Date</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.project.Merge#getDate()
   * @see #getMerge()
   * @generated
   */
  EAttribute getMerge_Date();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.project.Merge#getDelivery <em>Delivery</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Delivery</em>'.
   * @see org.eclipse.net4j.pop.project.Merge#getDelivery()
   * @see #getMerge()
   * @generated
   */
  EReference getMerge_Delivery();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProjectFactory getProjectFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.PopProjectImpl <em>Pop Project</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.PopProjectImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getPopProject()
     * @generated
     */
    EClass POP_PROJECT = eINSTANCE.getPopProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute POP_PROJECT__NAME = eINSTANCE.getPopProject_Name();

    /**
     * The meta object literal for the '<em><b>Team Provider</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POP_PROJECT__TEAM_PROVIDER = eINSTANCE.getPopProject_TeamProvider();

    /**
     * The meta object literal for the '<em><b>Repository Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POP_PROJECT__REPOSITORY_URL = eINSTANCE.getPopProject_RepositoryUrl();

    /**
     * The meta object literal for the '<em><b>Code Roots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP_PROJECT__CODE_ROOTS = eINSTANCE.getPopProject_CodeRoots();

    /**
     * The meta object literal for the '<em><b>Committers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP_PROJECT__COMMITTERS = eINSTANCE.getPopProject_Committers();

    /**
     * The meta object literal for the '<em><b>Main Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP_PROJECT__MAIN_BRANCH = eINSTANCE.getPopProject_MainBranch();

    /**
     * The meta object literal for the '<em><b>Root Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference POP_PROJECT__ROOT_STREAM = eINSTANCE.getPopProject_RootStream();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.CodeRootImpl <em>Code Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.CodeRootImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getCodeRoot()
     * @generated
     */
    EClass CODE_ROOT = eINSTANCE.getCodeRoot();

    /**
     * The meta object literal for the '<em><b>Pop Project</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_ROOT__POP_PROJECT = eINSTANCE.getCodeRoot_PopProject();

    /**
     * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_ROOT__ROOT_PATH = eINSTANCE.getCodeRoot_RootPath();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.CommitterImpl <em>Committer</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.CommitterImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getCommitter()
     * @generated
     */
    EClass COMMITTER = eINSTANCE.getCommitter();

    /**
     * The meta object literal for the '<em><b>Pop Project</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITTER__POP_PROJECT = eINSTANCE.getCommitter_PopProject();

    /**
     * The meta object literal for the '<em><b>Repository Login</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__REPOSITORY_LOGIN = eINSTANCE.getCommitter_RepositoryLogin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__NAME = eINSTANCE.getCommitter_Name();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__EMAIL = eINSTANCE.getCommitter_Email();

    /**
     * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__ENTRY = eINSTANCE.getCommitter_Entry();

    /**
     * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__EXIT = eINSTANCE.getCommitter_Exit();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMITTER__ACTIVE = eINSTANCE.getCommitter_Active();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.TaggedElementImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTaggedElement()
     * @generated
     */
    EClass TAGGED_ELEMENT = eINSTANCE.getTaggedElement();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TAGGED_ELEMENT__TAG = eINSTANCE.getTaggedElement_Tag();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.TagImpl <em>Tag</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.project.impl.TagImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Branch</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__BRANCH = eINSTANCE.getTag_Branch();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TAG__NAME = eINSTANCE.getTag_Name();

    /**
     * The meta object literal for the '<em><b>Tagged Element</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TAG__TAGGED_ELEMENT = eINSTANCE.getTag_TaggedElement();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.BranchImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference BRANCH__BRANCHES = eINSTANCE.getBranch_Branches();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__TAGS = eINSTANCE.getBranch_Tags();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference BRANCH__STREAM = eINSTANCE.getBranch_Stream();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.MainBranchImpl <em>Main Branch</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.MainBranchImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMainBranch()
     * @generated
     */
    EClass MAIN_BRANCH = eINSTANCE.getMainBranch();

    /**
     * The meta object literal for the '<em><b>Pop Project</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_BRANCH__POP_PROJECT = eINSTANCE.getMainBranch_PopProject();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.SubBranchImpl <em>Sub Branch</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.SubBranchImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getSubBranch()
     * @generated
     */
    EClass SUB_BRANCH = eINSTANCE.getSubBranch();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_BRANCH__PARENT = eINSTANCE.getSubBranch_Parent();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.StreamImpl <em>Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.StreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getStream()
     * @generated
     */
    EClass STREAM = eINSTANCE.getStream();

    /**
     * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference STREAM__BRANCH = eINSTANCE.getStream_Branch();

    /**
     * The meta object literal for the '<em><b>Merges</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__MERGES = eINSTANCE.getStream_Merges();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.TaskStreamImpl <em>Task Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.TaskStreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTaskStream()
     * @generated
     */
    EClass TASK_STREAM = eINSTANCE.getTaskStream();

    /**
     * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_STREAM__TASK_ID = eINSTANCE.getTaskStream_TaskId();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TASK_STREAM__PARENT = eINSTANCE.getTaskStream_Parent();

    /**
     * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TASK_STREAM__BASELINE = eINSTANCE.getTaskStream_Baseline();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TASK_STREAM__TARGETS = eINSTANCE.getTaskStream_Targets();

    /**
     * The meta object literal for the '<em><b>Deliveries</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TASK_STREAM__DELIVERIES = eINSTANCE.getTaskStream_Deliveries();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.IntegrationStreamImpl <em>Integration Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.IntegrationStreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getIntegrationStream()
     * @generated
     */
    EClass INTEGRATION_STREAM = eINSTANCE.getIntegrationStream();

    /**
     * The meta object literal for the '<em><b>Task Streams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION_STREAM__TASK_STREAMS = eINSTANCE.getIntegrationStream_TaskStreams();

    /**
     * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference INTEGRATION_STREAM__RELEASES = eINSTANCE.getIntegrationStream_Releases();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.DevelopmentStreamImpl <em>Development Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.DevelopmentStreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getDevelopmentStream()
     * @generated
     */
    EClass DEVELOPMENT_STREAM = eINSTANCE.getDevelopmentStream();

    /**
     * The meta object literal for the '<em><b>Maintenance Streams</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPMENT_STREAM__MAINTENANCE_STREAMS = eINSTANCE.getDevelopmentStream_MaintenanceStreams();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl <em>Maintenance Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.MaintenanceStreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMaintenanceStream()
     * @generated
     */
    EClass MAINTENANCE_STREAM = eINSTANCE.getMaintenanceStream();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference MAINTENANCE_STREAM__PARENT = eINSTANCE.getMaintenanceStream_Parent();

    /**
     * The meta object literal for the '<em><b>Baseline</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference MAINTENANCE_STREAM__BASELINE = eINSTANCE.getMaintenanceStream_Baseline();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.RootStreamImpl <em>Root Stream</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.RootStreamImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getRootStream()
     * @generated
     */
    EClass ROOT_STREAM = eINSTANCE.getRootStream();

    /**
     * The meta object literal for the '<em><b>Pop Project</b></em>' container reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ROOT_STREAM__POP_PROJECT = eINSTANCE.getRootStream_PopProject();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.TargetImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TARGET__DATE = eINSTANCE.getTarget_Date();

    /**
     * The meta object literal for the '<em><b>Streams</b></em>' reference list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TARGET__STREAMS = eINSTANCE.getTarget_Streams();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.ReleaseImpl <em>Release</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.ReleaseImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getRelease()
     * @generated
     */
    EClass RELEASE = eINSTANCE.getRelease();

    /**
     * The meta object literal for the '<em><b>Maintenance</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference RELEASE__MAINTENANCE = eINSTANCE.getRelease_Maintenance();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RELEASE__VERSION = eINSTANCE.getRelease_Version();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__STREAM = eINSTANCE.getRelease_Stream();

    /**
     * The meta object literal for the '<em><b>Milestones</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RELEASE__MILESTONES = eINSTANCE.getRelease_Milestones();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.MilestoneImpl <em>Milestone</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.MilestoneImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMilestone()
     * @generated
     */
    EClass MILESTONE = eINSTANCE.getMilestone();

    /**
     * The meta object literal for the '<em><b>Release</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MILESTONE__RELEASE = eINSTANCE.getMilestone_Release();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MILESTONE__NAME = eINSTANCE.getMilestone_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.DeliveryImpl <em>Delivery</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.project.impl.DeliveryImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getDelivery()
     * @generated
     */
    EClass DELIVERY = eINSTANCE.getDelivery();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELIVERY__STREAM = eINSTANCE.getDelivery_Stream();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELIVERY__NUMBER = eINSTANCE.getDelivery_Number();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DELIVERY__DATE = eINSTANCE.getDelivery_Date();

    /**
     * The meta object literal for the '<em><b>Merges</b></em>' reference list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DELIVERY__MERGES = eINSTANCE.getDelivery_Merges();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.project.impl.MergeImpl <em>Merge</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.net4j.pop.project.impl.MergeImpl
     * @see org.eclipse.net4j.pop.project.impl.ProjectPackageImpl#getMerge()
     * @generated
     */
    EClass MERGE = eINSTANCE.getMerge();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERGE__STREAM = eINSTANCE.getMerge_Stream();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MERGE__DATE = eINSTANCE.getMerge_Date();

    /**
     * The meta object literal for the '<em><b>Delivery</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference MERGE__DELIVERY = eINSTANCE.getMerge_Delivery();

  }

} // ProjectPackage
