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
 * $Id: ProjectPackageImpl.java,v 1.6 2008-08-01 09:36:25 estepper Exp $
 */
package org.eclipse.net4j.pop.project.impl;

import org.eclipse.net4j.pop.base.BasePackage;
import org.eclipse.net4j.pop.project.Branch;
import org.eclipse.net4j.pop.project.CodeRepository;
import org.eclipse.net4j.pop.project.CodeRoot;
import org.eclipse.net4j.pop.project.Committer;
import org.eclipse.net4j.pop.project.Delivery;
import org.eclipse.net4j.pop.project.DevelopmentStream;
import org.eclipse.net4j.pop.project.IntegrationStream;
import org.eclipse.net4j.pop.project.MainBranch;
import org.eclipse.net4j.pop.project.MaintenanceStream;
import org.eclipse.net4j.pop.project.Merge;
import org.eclipse.net4j.pop.project.Milestone;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectFactory;
import org.eclipse.net4j.pop.project.ProjectPackage;
import org.eclipse.net4j.pop.project.Release;
import org.eclipse.net4j.pop.project.RootStream;
import org.eclipse.net4j.pop.project.Stream;
import org.eclipse.net4j.pop.project.SubBranch;
import org.eclipse.net4j.pop.project.Tag;
import org.eclipse.net4j.pop.project.TaggedElement;
import org.eclipse.net4j.pop.project.Target;
import org.eclipse.net4j.pop.project.TaskStream;
import org.eclipse.net4j.pop.project.Version;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ProjectPackageImpl extends EPackageImpl implements ProjectPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass popProjectEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass codeRepositoryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass codeRootEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass committerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass taggedElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass branchEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass mainBranchEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass subBranchEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass streamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass taskStreamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass integrationStreamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass developmentStreamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass maintenanceStreamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass rootStreamEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass targetEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass releaseEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass milestoneEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass deliveryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass mergeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType versionEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.net4j.pop.project.ProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProjectPackageImpl()
  {
    super(eNS_URI, ProjectFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
  public static ProjectPackage init()
  {
    if (isInited) return (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);

    // Obtain or create and register package
    ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(eNS_URI)
        : new ProjectPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    BasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProjectPackage.createPackageContents();

    // Initialize created meta-data
    theProjectPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProjectPackage.freeze();

    return theProjectPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPopProject()
  {
    return popProjectEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopProject_Name()
  {
    return (EAttribute)popProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPopProject_CodeRepository()
  {
    return (EReference)popProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPopProject_RootStream()
  {
    return (EReference)popProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeRepository()
  {
    return codeRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeRepository_TeamProvider()
  {
    return (EAttribute)codeRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeRepository_RepositoryUrl()
  {
    return (EAttribute)codeRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeRepository_CodeRoots()
  {
    return (EReference)codeRepositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeRepository_Committers()
  {
    return (EReference)codeRepositoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeRepository_MainBranch()
  {
    return (EReference)codeRepositoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeRepository_PopProject()
  {
    return (EReference)codeRepositoryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeRoot()
  {
    return codeRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeRoot_Path()
  {
    return (EAttribute)codeRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeRoot_Repository()
  {
    return (EReference)codeRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommitter()
  {
    return committerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommitter_Repository()
  {
    return (EReference)committerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Id()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Name()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Email()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Entry()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Exit()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommitter_Active()
  {
    return (EAttribute)committerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaggedElement()
  {
    return taggedElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaggedElement_Tag()
  {
    return (EReference)taggedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Branch()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Name()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_TaggedElement()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranch()
  {
    return branchEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBranch_Name()
  {
    return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Branches()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Tags()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Stream()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainBranch()
  {
    return mainBranchEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainBranch_Repository()
  {
    return (EReference)mainBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubBranch()
  {
    return subBranchEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubBranch_Parent()
  {
    return (EReference)subBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getStream()
  {
    return streamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStream_TaskId()
  {
    return (EAttribute)streamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStream_Name()
  {
    return (EAttribute)streamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getStream_Branch()
  {
    return (EReference)streamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getStream_Merges()
  {
    return (EReference)streamEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskStream()
  {
    return taskStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskStream_Parent()
  {
    return (EReference)taskStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskStream_Baseline()
  {
    return (EAttribute)taskStreamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskStream_Targets()
  {
    return (EReference)taskStreamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskStream_Deliveries()
  {
    return (EReference)taskStreamEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegrationStream()
  {
    return integrationStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegrationStream_TaskStreams()
  {
    return (EReference)integrationStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegrationStream_Releases()
  {
    return (EReference)integrationStreamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevelopmentStream()
  {
    return developmentStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevelopmentStream_MaintenanceStreams()
  {
    return (EReference)developmentStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaintenanceStream()
  {
    return maintenanceStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaintenanceStream_Parent()
  {
    return (EReference)maintenanceStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaintenanceStream_Baseline()
  {
    return (EReference)maintenanceStreamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRootStream()
  {
    return rootStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRootStream_PopProject()
  {
    return (EReference)rootStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTarget()
  {
    return targetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTarget_Id()
  {
    return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTarget_Date()
  {
    return (EAttribute)targetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_Streams()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelease()
  {
    return releaseEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Maintenance()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelease_Version()
  {
    return (EAttribute)releaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Stream()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelease_Milestones()
  {
    return (EReference)releaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMilestone()
  {
    return milestoneEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMilestone_Release()
  {
    return (EReference)milestoneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMilestone_Name()
  {
    return (EAttribute)milestoneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelivery()
  {
    return deliveryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelivery_Stream()
  {
    return (EReference)deliveryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelivery_Id()
  {
    return (EAttribute)deliveryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelivery_Date()
  {
    return (EAttribute)deliveryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelivery_Merges()
  {
    return (EReference)deliveryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMerge()
  {
    return mergeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMerge_Stream()
  {
    return (EReference)mergeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMerge_Id()
  {
    return (EAttribute)mergeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMerge_Date()
  {
    return (EAttribute)mergeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMerge_Delivery()
  {
    return (EReference)mergeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVersion()
  {
    return versionEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ProjectFactory getProjectFactory()
  {
    return (ProjectFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    popProjectEClass = createEClass(POP_PROJECT);
    createEAttribute(popProjectEClass, POP_PROJECT__NAME);
    createEReference(popProjectEClass, POP_PROJECT__CODE_REPOSITORY);
    createEReference(popProjectEClass, POP_PROJECT__ROOT_STREAM);

    codeRepositoryEClass = createEClass(CODE_REPOSITORY);
    createEAttribute(codeRepositoryEClass, CODE_REPOSITORY__TEAM_PROVIDER);
    createEAttribute(codeRepositoryEClass, CODE_REPOSITORY__REPOSITORY_URL);
    createEReference(codeRepositoryEClass, CODE_REPOSITORY__CODE_ROOTS);
    createEReference(codeRepositoryEClass, CODE_REPOSITORY__COMMITTERS);
    createEReference(codeRepositoryEClass, CODE_REPOSITORY__MAIN_BRANCH);
    createEReference(codeRepositoryEClass, CODE_REPOSITORY__POP_PROJECT);

    codeRootEClass = createEClass(CODE_ROOT);
    createEAttribute(codeRootEClass, CODE_ROOT__PATH);
    createEReference(codeRootEClass, CODE_ROOT__REPOSITORY);

    committerEClass = createEClass(COMMITTER);
    createEReference(committerEClass, COMMITTER__REPOSITORY);
    createEAttribute(committerEClass, COMMITTER__ID);
    createEAttribute(committerEClass, COMMITTER__NAME);
    createEAttribute(committerEClass, COMMITTER__EMAIL);
    createEAttribute(committerEClass, COMMITTER__ENTRY);
    createEAttribute(committerEClass, COMMITTER__EXIT);
    createEAttribute(committerEClass, COMMITTER__ACTIVE);

    taggedElementEClass = createEClass(TAGGED_ELEMENT);
    createEReference(taggedElementEClass, TAGGED_ELEMENT__TAG);

    tagEClass = createEClass(TAG);
    createEReference(tagEClass, TAG__BRANCH);
    createEAttribute(tagEClass, TAG__NAME);
    createEReference(tagEClass, TAG__TAGGED_ELEMENT);

    branchEClass = createEClass(BRANCH);
    createEAttribute(branchEClass, BRANCH__NAME);
    createEReference(branchEClass, BRANCH__BRANCHES);
    createEReference(branchEClass, BRANCH__TAGS);
    createEReference(branchEClass, BRANCH__STREAM);

    mainBranchEClass = createEClass(MAIN_BRANCH);
    createEReference(mainBranchEClass, MAIN_BRANCH__REPOSITORY);

    subBranchEClass = createEClass(SUB_BRANCH);
    createEReference(subBranchEClass, SUB_BRANCH__PARENT);

    streamEClass = createEClass(STREAM);
    createEAttribute(streamEClass, STREAM__TASK_ID);
    createEAttribute(streamEClass, STREAM__NAME);
    createEReference(streamEClass, STREAM__BRANCH);
    createEReference(streamEClass, STREAM__MERGES);

    taskStreamEClass = createEClass(TASK_STREAM);
    createEReference(taskStreamEClass, TASK_STREAM__PARENT);
    createEAttribute(taskStreamEClass, TASK_STREAM__BASELINE);
    createEReference(taskStreamEClass, TASK_STREAM__TARGETS);
    createEReference(taskStreamEClass, TASK_STREAM__DELIVERIES);

    integrationStreamEClass = createEClass(INTEGRATION_STREAM);
    createEReference(integrationStreamEClass, INTEGRATION_STREAM__TASK_STREAMS);
    createEReference(integrationStreamEClass, INTEGRATION_STREAM__RELEASES);

    developmentStreamEClass = createEClass(DEVELOPMENT_STREAM);
    createEReference(developmentStreamEClass, DEVELOPMENT_STREAM__MAINTENANCE_STREAMS);

    maintenanceStreamEClass = createEClass(MAINTENANCE_STREAM);
    createEReference(maintenanceStreamEClass, MAINTENANCE_STREAM__PARENT);
    createEReference(maintenanceStreamEClass, MAINTENANCE_STREAM__BASELINE);

    rootStreamEClass = createEClass(ROOT_STREAM);
    createEReference(rootStreamEClass, ROOT_STREAM__POP_PROJECT);

    targetEClass = createEClass(TARGET);
    createEAttribute(targetEClass, TARGET__ID);
    createEAttribute(targetEClass, TARGET__DATE);
    createEReference(targetEClass, TARGET__STREAMS);

    releaseEClass = createEClass(RELEASE);
    createEReference(releaseEClass, RELEASE__MAINTENANCE);
    createEAttribute(releaseEClass, RELEASE__VERSION);
    createEReference(releaseEClass, RELEASE__STREAM);
    createEReference(releaseEClass, RELEASE__MILESTONES);

    milestoneEClass = createEClass(MILESTONE);
    createEReference(milestoneEClass, MILESTONE__RELEASE);
    createEAttribute(milestoneEClass, MILESTONE__NAME);

    deliveryEClass = createEClass(DELIVERY);
    createEReference(deliveryEClass, DELIVERY__STREAM);
    createEAttribute(deliveryEClass, DELIVERY__ID);
    createEAttribute(deliveryEClass, DELIVERY__DATE);
    createEReference(deliveryEClass, DELIVERY__MERGES);

    mergeEClass = createEClass(MERGE);
    createEReference(mergeEClass, MERGE__STREAM);
    createEAttribute(mergeEClass, MERGE__ID);
    createEAttribute(mergeEClass, MERGE__DATE);
    createEReference(mergeEClass, MERGE__DELIVERY);

    // Create data types
    versionEDataType = createEDataType(VERSION);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    popProjectEClass.getESuperTypes().add(theBasePackage.getPopElement());
    mainBranchEClass.getESuperTypes().add(this.getBranch());
    subBranchEClass.getESuperTypes().add(this.getBranch());
    subBranchEClass.getESuperTypes().add(this.getTaggedElement());
    taskStreamEClass.getESuperTypes().add(this.getStream());
    integrationStreamEClass.getESuperTypes().add(this.getStream());
    developmentStreamEClass.getESuperTypes().add(this.getIntegrationStream());
    maintenanceStreamEClass.getESuperTypes().add(this.getIntegrationStream());
    rootStreamEClass.getESuperTypes().add(this.getDevelopmentStream());
    targetEClass.getESuperTypes().add(this.getTaggedElement());
    releaseEClass.getESuperTypes().add(this.getTarget());
    milestoneEClass.getESuperTypes().add(this.getTarget());
    deliveryEClass.getESuperTypes().add(this.getTaggedElement());
    mergeEClass.getESuperTypes().add(this.getTaggedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(popProjectEClass, PopProject.class,
        "PopProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getPopProject_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, PopProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPopProject_CodeRepository(),
        this.getCodeRepository(),
        this.getCodeRepository_PopProject(),
        "codeRepository", null, 1, 1, PopProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPopProject_RootStream(),
        this.getRootStream(),
        this.getRootStream_PopProject(),
        "rootStream", null, 1, 1, PopProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(codeRepositoryEClass, CodeRepository.class,
        "CodeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getCodeRepository_TeamProvider(),
        ecorePackage.getEString(),
        "teamProvider", null, 1, 1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCodeRepository_RepositoryUrl(),
        ecorePackage.getEString(),
        "repositoryUrl", null, 1, 1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCodeRepository_CodeRoots(),
        this.getCodeRoot(),
        this.getCodeRoot_Repository(),
        "codeRoots", null, 1, -1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCodeRepository_Committers(),
        this.getCommitter(),
        this.getCommitter_Repository(),
        "committers", null, 1, -1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCodeRepository_MainBranch(),
        this.getMainBranch(),
        this.getMainBranch_Repository(),
        "mainBranch", null, 1, 1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCodeRepository_PopProject(),
        this.getPopProject(),
        this.getPopProject_CodeRepository(),
        "popProject", null, 0, 1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    EOperation op = addEOperation(codeRepositoryEClass, this.getRelease(), "addCommitter", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "entry", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(codeRootEClass, CodeRoot.class, "CodeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getCodeRoot_Path(),
        ecorePackage.getEString(),
        "path", null, 1, 1, CodeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCodeRoot_Repository(),
        this.getCodeRepository(),
        this.getCodeRepository_CodeRoots(),
        "repository", null, 1, 1, CodeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(committerEClass, Committer.class, "Committer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getCommitter_Repository(),
        this.getCodeRepository(),
        this.getCodeRepository_Committers(),
        "repository", null, 1, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Id(),
        ecorePackage.getEString(),
        "id", null, 1, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Email(),
        ecorePackage.getEString(),
        "email", null, 1, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Entry(),
        ecorePackage.getEDate(),
        "entry", null, 1, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Exit(),
        ecorePackage.getEDate(),
        "exit", null, 0, 1, Committer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCommitter_Active(),
        ecorePackage.getEBoolean(),
        "active", null, 1, 1, Committer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(committerEClass, null, "deactivate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "exit", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(taggedElementEClass, TaggedElement.class,
        "TaggedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTaggedElement_Tag(),
        this.getTag(),
        this.getTag_TaggedElement(),
        "tag", null, 1, 1, TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTag_Branch(),
        this.getBranch(),
        this.getBranch_Tags(),
        "branch", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getTag_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTag_TaggedElement(),
        this.getTaggedElement(),
        this.getTaggedElement_Tag(),
        "taggedElement", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(branchEClass, Branch.class, "Branch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getBranch_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Branches(),
        this.getSubBranch(),
        this.getSubBranch_Parent(),
        "branches", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Tags(),
        this.getTag(),
        this.getTag_Branch(),
        "tags", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Stream(),
        this.getStream(),
        this.getStream_Branch(),
        "stream", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(mainBranchEClass, MainBranch.class,
        "MainBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMainBranch_Repository(),
        this.getCodeRepository(),
        this.getCodeRepository_MainBranch(),
        "repository", null, 1, 1, MainBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(subBranchEClass, SubBranch.class, "SubBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getSubBranch_Parent(),
        this.getBranch(),
        this.getBranch_Branches(),
        "parent", null, 1, 1, SubBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(streamEClass, Stream.class, "Stream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getStream_TaskId(),
        ecorePackage.getEString(),
        "taskId", null, 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getStream_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getStream_Branch(),
        this.getBranch(),
        this.getBranch_Stream(),
        "branch", null, 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getStream_Merges(),
        this.getMerge(),
        this.getMerge_Stream(),
        "merges", null, 0, -1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getPopProject(), "pop", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getStream(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getStream(), "streams", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(streamEClass, this.getMerge(), "merge", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, this.getDelivery(), "delivery", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(taskStreamEClass, TaskStream.class,
        "TaskStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTaskStream_Parent(),
        this.getIntegrationStream(),
        this.getIntegrationStream_TaskStreams(),
        "parent", null, 1, 1, TaskStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getTaskStream_Baseline(),
        ecorePackage.getEDate(),
        "baseline", null, 1, 1, TaskStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTaskStream_Targets(),
        this.getTarget(),
        this.getTarget_Streams(),
        "targets", null, 1, -1, TaskStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTaskStream_Deliveries(),
        this.getDelivery(),
        this.getDelivery_Stream(),
        "deliveries", null, 0, -1, TaskStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(taskStreamEClass, this.getDelivery(), "deliver", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(integrationStreamEClass, IntegrationStream.class,
        "IntegrationStream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getIntegrationStream_TaskStreams(),
        this.getTaskStream(),
        this.getTaskStream_Parent(),
        "taskStreams", null, 0, -1, IntegrationStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getIntegrationStream_Releases(),
        this.getRelease(),
        this.getRelease_Stream(),
        "releases", null, 0, -1, IntegrationStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(integrationStreamEClass, this.getTaskStream(), "startTask", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEString(), "taskId", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "baseline", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(integrationStreamEClass, this.getRelease(), "addRelease", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(developmentStreamEClass, DevelopmentStream.class,
        "DevelopmentStream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDevelopmentStream_MaintenanceStreams(),
        this.getMaintenanceStream(),
        this.getMaintenanceStream_Parent(),
        "maintenanceStreams", null, 0, -1, DevelopmentStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(developmentStreamEClass, this.getRelease(), "addRelease", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEBoolean(), "compatible", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, ecorePackage.getEInt(), "increment", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(maintenanceStreamEClass, MaintenanceStream.class,
        "MaintenanceStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMaintenanceStream_Parent(),
        this.getDevelopmentStream(),
        this.getDevelopmentStream_MaintenanceStreams(),
        "parent", null, 1, 1, MaintenanceStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getMaintenanceStream_Baseline(),
        this.getRelease(),
        this.getRelease_Maintenance(),
        "baseline", null, 1, 1, MaintenanceStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(rootStreamEClass, RootStream.class,
        "RootStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getRootStream_PopProject(),
        this.getPopProject(),
        this.getPopProject_RootStream(),
        "popProject", null, 1, 1, RootStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getTarget_Id(),
        ecorePackage.getEString(),
        "id", null, 1, 1, Target.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getTarget_Date(),
        ecorePackage.getEDate(),
        "date", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTarget_Streams(),
        this.getTaskStream(),
        this.getTaskStream_Targets(),
        "streams", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getRelease_Maintenance(),
        this.getMaintenanceStream(),
        this.getMaintenanceStream_Baseline(),
        "maintenance", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getRelease_Version(),
        this.getVersion(),
        "version", null, 1, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getRelease_Stream(),
        this.getIntegrationStream(),
        this.getIntegrationStream_Releases(),
        "stream", null, 1, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getRelease_Milestones(),
        this.getMilestone(),
        this.getMilestone_Release(),
        "milestones", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(releaseEClass, this.getMaintenanceStream(), "startMaintenance", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMilestone_Release(),
        this.getRelease(),
        this.getRelease_Milestones(),
        "release", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getMilestone_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDelivery_Stream(),
        this.getTaskStream(),
        this.getTaskStream_Deliveries(),
        "stream", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDelivery_Id(),
        ecorePackage.getEString(),
        "id", "1", 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
    initEAttribute(
        getDelivery_Date(),
        ecorePackage.getEDate(),
        "date", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getDelivery_Merges(),
        this.getMerge(),
        this.getMerge_Delivery(),
        "merges", null, 0, -1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(mergeEClass, Merge.class, "Merge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMerge_Stream(),
        this.getStream(),
        this.getStream_Merges(),
        "stream", null, 1, 1, Merge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getMerge_Id(),
        ecorePackage.getEString(),
        "id", null, 1, 1, Merge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getMerge_Date(),
        ecorePackage.getEDate(),
        "date", null, 1, 1, Merge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getMerge_Delivery(),
        this.getDelivery(),
        this.getDelivery_Merges(),
        "delivery", null, 1, 1, Merge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    // Initialize data types
    initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    // Create resource
    createResource(eNS_URI);
  }

} // ProjectPackageImpl
