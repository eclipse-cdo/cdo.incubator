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
 * $Id: PopPackageImpl.java,v 1.10 2008-08-11 07:21:04 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.Branch;
import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutDiscriminator;
import org.eclipse.net4j.pop.CheckoutManager;
import org.eclipse.net4j.pop.CheckoutState;
import org.eclipse.net4j.pop.Delivery;
import org.eclipse.net4j.pop.DeliveryStream;
import org.eclipse.net4j.pop.Developer;
import org.eclipse.net4j.pop.DevelopmentStream;
import org.eclipse.net4j.pop.Displayable;
import org.eclipse.net4j.pop.Identifiable;
import org.eclipse.net4j.pop.Integration;
import org.eclipse.net4j.pop.IntegrationStream;
import org.eclipse.net4j.pop.MainBranch;
import org.eclipse.net4j.pop.MaintenanceStream;
import org.eclipse.net4j.pop.Milestone;
import org.eclipse.net4j.pop.Module;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopElement;
import org.eclipse.net4j.pop.PopFactory;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.PrimaryModule;
import org.eclipse.net4j.pop.Release;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.SecondaryModule;
import org.eclipse.net4j.pop.Stream;
import org.eclipse.net4j.pop.SubBranch;
import org.eclipse.net4j.pop.Tag;
import org.eclipse.net4j.pop.TaggedElement;
import org.eclipse.net4j.pop.Target;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;
import org.eclipse.net4j.pop.Version;
import org.eclipse.net4j.pop.WorkspaceConfigurator;
import org.eclipse.net4j.pop.WorkspaceSpecification;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;
import org.eclipse.net4j.pop.repository.IRepositoryFolder;
import org.eclipse.net4j.pop.repository.IRepositorySession;
import org.eclipse.net4j.pop.repository.IRepositoryTag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class PopPackageImpl extends EPackageImpl implements PopPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass identifiableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass displayableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass popElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass popManagerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass popEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryModuleEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass developerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass taskGroupEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass checkoutDiscriminatorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass taggedElementEClass = null;

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
  private EClass deliveryStreamEClass = null;

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
  private EClass integrationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass checkoutManagerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass checkoutEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass workspaceSpecificationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass secondaryModuleEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass workspaceConfiguratorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass assigneeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum checkoutStateEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType versionEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType pathEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType repositoryAdapterEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType repositorySessionEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType repositoryFolderEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType repositoryTagEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.net4j.pop.PopPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PopPackageImpl()
  {
    super(eNS_URI, PopFactory.eINSTANCE);
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
  public static PopPackage init()
  {
    if (isInited)
      return (PopPackage)EPackage.Registry.INSTANCE.getEPackage(PopPackage.eNS_URI);

    // Obtain or create and register package
    PopPackageImpl thePopPackage = (PopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PopPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(eNS_URI)
        : new PopPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePopPackage.createPackageContents();

    // Initialize created meta-data
    thePopPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePopPackage.freeze();

    return thePopPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifiable()
  {
    return identifiableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifiable_Id()
  {
    return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisplayable()
  {
    return displayableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisplayable_DisplayString()
  {
    return (EAttribute)displayableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPopElement()
  {
    return popElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopElement_Class()
  {
    return (EAttribute)popElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPopManager()
  {
    return popManagerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPopManager_Pops()
  {
    return (EReference)popManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPop()
  {
    return popEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_PopManager()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPop_Name()
  {
    return (EAttribute)popEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPop_Active()
  {
    return (EAttribute)popEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_Developers()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_Repository()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_RootStream()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_PrimaryModule()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPop_CheckoutManager()
  {
    return (EReference)popEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Descriptor()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryModule()
  {
    return primaryModuleEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryModule_Pop()
  {
    return (EReference)primaryModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryModule_SpecificationPath()
  {
    return (EAttribute)primaryModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Pop()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Adapter()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_AdapterType()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Descriptor()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_MainBranch()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeveloper()
  {
    return developerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeveloper_Pop()
  {
    return (EReference)developerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_RepositoryUser()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_Name()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_Email()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_Entry()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_Exit()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeveloper_Active()
  {
    return (EAttribute)developerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskGroup()
  {
    return taskGroupEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskGroup_Name()
  {
    return (EAttribute)taskGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskGroup_Assignee()
  {
    return (EReference)taskGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_MylynId()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Assignee()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Targets()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckoutDiscriminator()
  {
    return checkoutDiscriminatorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckoutDiscriminator_RepositoryTag()
  {
    return (EAttribute)checkoutDiscriminatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckoutDiscriminator_Checkout()
  {
    return (EReference)checkoutDiscriminatorEClass.getEStructuralFeatures().get(1);
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
  public EReference getStream_Branch()
  {
    return (EReference)streamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getStream_Integrations()
  {
    return (EReference)streamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeliveryStream()
  {
    return deliveryStreamEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeliveryStream_Parent()
  {
    return (EReference)deliveryStreamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeliveryStream_Baseline()
  {
    return (EAttribute)deliveryStreamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeliveryStream_Task()
  {
    return (EReference)deliveryStreamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeliveryStream_Deliveries()
  {
    return (EReference)deliveryStreamEClass.getEStructuralFeatures().get(3);
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
  public EReference getIntegrationStream_DeliveryStreams()
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
  public EReference getDevelopmentStream_Pop()
  {
    return (EReference)developmentStreamEClass.getEStructuralFeatures().get(1);
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
  public EClass getTarget()
  {
    return targetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTarget_Date()
  {
    return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget_Tasks()
  {
    return (EReference)targetEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDelivery_Number()
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
  public EClass getIntegration()
  {
    return integrationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegration_Stream()
  {
    return (EReference)integrationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegration_Date()
  {
    return (EAttribute)integrationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegration_Delivery()
  {
    return (EReference)integrationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckoutManager()
  {
    return checkoutManagerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckoutManager_Pop()
  {
    return (EReference)checkoutManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckoutManager_Location()
  {
    return (EAttribute)checkoutManagerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckoutManager_Checkouts()
  {
    return (EReference)checkoutManagerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckoutManager_ActiveCheckout()
  {
    return (EReference)checkoutManagerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckout()
  {
    return checkoutEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckout_Manager()
  {
    return (EReference)checkoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckout_Discriminator()
  {
    return (EReference)checkoutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckout_Location()
  {
    return (EAttribute)checkoutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckout_Transitioning()
  {
    return (EAttribute)checkoutEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckout_State()
  {
    return (EAttribute)checkoutEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckout_Active()
  {
    return (EAttribute)checkoutEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckout_WorkspaceSpecification()
  {
    return (EReference)checkoutEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkspaceSpecification()
  {
    return workspaceSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceSpecification_Checkout()
  {
    return (EReference)workspaceSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceSpecification_SecondaryModules()
  {
    return (EReference)workspaceSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceSpecification_WorkspaceConfigurators()
  {
    return (EReference)workspaceSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecondaryModule()
  {
    return secondaryModuleEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecondaryModule_WorkspaceSpecification()
  {
    return (EReference)secondaryModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkspaceConfigurator()
  {
    return workspaceConfiguratorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceConfigurator_WorkspaceSpecification()
  {
    return (EReference)workspaceConfiguratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignee()
  {
    return assigneeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignee_Tasks()
  {
    return (EReference)assigneeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignee_TaskGroups()
  {
    return (EReference)assigneeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCheckoutState()
  {
    return checkoutStateEEnum;
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
  public EDataType getPath()
  {
    return pathEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRepositoryAdapter()
  {
    return repositoryAdapterEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRepositorySession()
  {
    return repositorySessionEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRepositoryFolder()
  {
    return repositoryFolderEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRepositoryTag()
  {
    return repositoryTagEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopFactory getPopFactory()
  {
    return (PopFactory)getEFactoryInstance();
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
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    identifiableEClass = createEClass(IDENTIFIABLE);
    createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

    displayableEClass = createEClass(DISPLAYABLE);
    createEAttribute(displayableEClass, DISPLAYABLE__DISPLAY_STRING);

    popElementEClass = createEClass(POP_ELEMENT);
    createEAttribute(popElementEClass, POP_ELEMENT__CLASS);

    popManagerEClass = createEClass(POP_MANAGER);
    createEReference(popManagerEClass, POP_MANAGER__POPS);

    popEClass = createEClass(POP);
    createEReference(popEClass, POP__POP_MANAGER);
    createEAttribute(popEClass, POP__NAME);
    createEAttribute(popEClass, POP__ACTIVE);
    createEReference(popEClass, POP__DEVELOPERS);
    createEReference(popEClass, POP__REPOSITORY);
    createEReference(popEClass, POP__ROOT_STREAM);
    createEReference(popEClass, POP__PRIMARY_MODULE);
    createEReference(popEClass, POP__CHECKOUT_MANAGER);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEAttribute(moduleEClass, MODULE__DESCRIPTOR);

    primaryModuleEClass = createEClass(PRIMARY_MODULE);
    createEReference(primaryModuleEClass, PRIMARY_MODULE__POP);
    createEAttribute(primaryModuleEClass, PRIMARY_MODULE__SPECIFICATION_PATH);

    repositoryEClass = createEClass(REPOSITORY);
    createEReference(repositoryEClass, REPOSITORY__POP);
    createEAttribute(repositoryEClass, REPOSITORY__ADAPTER);
    createEAttribute(repositoryEClass, REPOSITORY__ADAPTER_TYPE);
    createEAttribute(repositoryEClass, REPOSITORY__DESCRIPTOR);
    createEReference(repositoryEClass, REPOSITORY__MAIN_BRANCH);

    developerEClass = createEClass(DEVELOPER);
    createEReference(developerEClass, DEVELOPER__POP);
    createEAttribute(developerEClass, DEVELOPER__REPOSITORY_USER);
    createEAttribute(developerEClass, DEVELOPER__NAME);
    createEAttribute(developerEClass, DEVELOPER__EMAIL);
    createEAttribute(developerEClass, DEVELOPER__ENTRY);
    createEAttribute(developerEClass, DEVELOPER__EXIT);
    createEAttribute(developerEClass, DEVELOPER__ACTIVE);

    taskGroupEClass = createEClass(TASK_GROUP);
    createEAttribute(taskGroupEClass, TASK_GROUP__NAME);
    createEReference(taskGroupEClass, TASK_GROUP__ASSIGNEE);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__MYLYN_ID);
    createEReference(taskEClass, TASK__ASSIGNEE);
    createEReference(taskEClass, TASK__TARGETS);

    checkoutDiscriminatorEClass = createEClass(CHECKOUT_DISCRIMINATOR);
    createEAttribute(checkoutDiscriminatorEClass, CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG);
    createEReference(checkoutDiscriminatorEClass, CHECKOUT_DISCRIMINATOR__CHECKOUT);

    tagEClass = createEClass(TAG);
    createEReference(tagEClass, TAG__BRANCH);
    createEAttribute(tagEClass, TAG__NAME);
    createEReference(tagEClass, TAG__TAGGED_ELEMENT);

    taggedElementEClass = createEClass(TAGGED_ELEMENT);
    createEReference(taggedElementEClass, TAGGED_ELEMENT__TAG);

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
    createEReference(streamEClass, STREAM__BRANCH);
    createEReference(streamEClass, STREAM__INTEGRATIONS);

    deliveryStreamEClass = createEClass(DELIVERY_STREAM);
    createEReference(deliveryStreamEClass, DELIVERY_STREAM__PARENT);
    createEAttribute(deliveryStreamEClass, DELIVERY_STREAM__BASELINE);
    createEReference(deliveryStreamEClass, DELIVERY_STREAM__TASK);
    createEReference(deliveryStreamEClass, DELIVERY_STREAM__DELIVERIES);

    integrationStreamEClass = createEClass(INTEGRATION_STREAM);
    createEReference(integrationStreamEClass, INTEGRATION_STREAM__DELIVERY_STREAMS);
    createEReference(integrationStreamEClass, INTEGRATION_STREAM__RELEASES);

    developmentStreamEClass = createEClass(DEVELOPMENT_STREAM);
    createEReference(developmentStreamEClass, DEVELOPMENT_STREAM__MAINTENANCE_STREAMS);
    createEReference(developmentStreamEClass, DEVELOPMENT_STREAM__POP);

    maintenanceStreamEClass = createEClass(MAINTENANCE_STREAM);
    createEReference(maintenanceStreamEClass, MAINTENANCE_STREAM__PARENT);
    createEReference(maintenanceStreamEClass, MAINTENANCE_STREAM__BASELINE);

    targetEClass = createEClass(TARGET);
    createEAttribute(targetEClass, TARGET__DATE);
    createEReference(targetEClass, TARGET__TASKS);

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
    createEAttribute(deliveryEClass, DELIVERY__NUMBER);
    createEAttribute(deliveryEClass, DELIVERY__DATE);
    createEReference(deliveryEClass, DELIVERY__MERGES);

    integrationEClass = createEClass(INTEGRATION);
    createEReference(integrationEClass, INTEGRATION__STREAM);
    createEAttribute(integrationEClass, INTEGRATION__DATE);
    createEReference(integrationEClass, INTEGRATION__DELIVERY);

    checkoutManagerEClass = createEClass(CHECKOUT_MANAGER);
    createEReference(checkoutManagerEClass, CHECKOUT_MANAGER__POP);
    createEAttribute(checkoutManagerEClass, CHECKOUT_MANAGER__LOCATION);
    createEReference(checkoutManagerEClass, CHECKOUT_MANAGER__CHECKOUTS);
    createEReference(checkoutManagerEClass, CHECKOUT_MANAGER__ACTIVE_CHECKOUT);

    checkoutEClass = createEClass(CHECKOUT);
    createEReference(checkoutEClass, CHECKOUT__MANAGER);
    createEReference(checkoutEClass, CHECKOUT__DISCRIMINATOR);
    createEAttribute(checkoutEClass, CHECKOUT__LOCATION);
    createEAttribute(checkoutEClass, CHECKOUT__TRANSITIONING);
    createEAttribute(checkoutEClass, CHECKOUT__STATE);
    createEAttribute(checkoutEClass, CHECKOUT__ACTIVE);
    createEReference(checkoutEClass, CHECKOUT__WORKSPACE_SPECIFICATION);

    workspaceSpecificationEClass = createEClass(WORKSPACE_SPECIFICATION);
    createEReference(workspaceSpecificationEClass, WORKSPACE_SPECIFICATION__CHECKOUT);
    createEReference(workspaceSpecificationEClass, WORKSPACE_SPECIFICATION__SECONDARY_MODULES);
    createEReference(workspaceSpecificationEClass, WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS);

    secondaryModuleEClass = createEClass(SECONDARY_MODULE);
    createEReference(secondaryModuleEClass, SECONDARY_MODULE__WORKSPACE_SPECIFICATION);

    workspaceConfiguratorEClass = createEClass(WORKSPACE_CONFIGURATOR);
    createEReference(workspaceConfiguratorEClass, WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION);

    assigneeEClass = createEClass(ASSIGNEE);
    createEReference(assigneeEClass, ASSIGNEE__TASKS);
    createEReference(assigneeEClass, ASSIGNEE__TASK_GROUPS);

    // Create enums
    checkoutStateEEnum = createEEnum(CHECKOUT_STATE);

    // Create data types
    versionEDataType = createEDataType(VERSION);
    pathEDataType = createEDataType(PATH);
    repositoryAdapterEDataType = createEDataType(REPOSITORY_ADAPTER);
    repositorySessionEDataType = createEDataType(REPOSITORY_SESSION);
    repositoryFolderEDataType = createEDataType(REPOSITORY_FOLDER);
    repositoryTagEDataType = createEDataType(REPOSITORY_TAG);
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
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    popElementEClass.getESuperTypes().add(this.getIdentifiable());
    popElementEClass.getESuperTypes().add(this.getDisplayable());
    popManagerEClass.getESuperTypes().add(this.getPopElement());
    popEClass.getESuperTypes().add(this.getPopElement());
    popEClass.getESuperTypes().add(this.getAssignee());
    moduleEClass.getESuperTypes().add(this.getPopElement());
    primaryModuleEClass.getESuperTypes().add(this.getModule());
    repositoryEClass.getESuperTypes().add(this.getPopElement());
    developerEClass.getESuperTypes().add(this.getPopElement());
    developerEClass.getESuperTypes().add(this.getAssignee());
    taskGroupEClass.getESuperTypes().add(this.getPopElement());
    taskGroupEClass.getESuperTypes().add(this.getAssignee());
    taskEClass.getESuperTypes().add(this.getPopElement());
    checkoutDiscriminatorEClass.getESuperTypes().add(this.getPopElement());
    tagEClass.getESuperTypes().add(this.getCheckoutDiscriminator());
    taggedElementEClass.getESuperTypes().add(this.getPopElement());
    branchEClass.getESuperTypes().add(this.getCheckoutDiscriminator());
    mainBranchEClass.getESuperTypes().add(this.getBranch());
    subBranchEClass.getESuperTypes().add(this.getBranch());
    subBranchEClass.getESuperTypes().add(this.getTaggedElement());
    streamEClass.getESuperTypes().add(this.getPopElement());
    deliveryStreamEClass.getESuperTypes().add(this.getStream());
    integrationStreamEClass.getESuperTypes().add(this.getStream());
    developmentStreamEClass.getESuperTypes().add(this.getIntegrationStream());
    maintenanceStreamEClass.getESuperTypes().add(this.getIntegrationStream());
    targetEClass.getESuperTypes().add(this.getTaggedElement());
    releaseEClass.getESuperTypes().add(this.getTarget());
    milestoneEClass.getESuperTypes().add(this.getTarget());
    deliveryEClass.getESuperTypes().add(this.getTaggedElement());
    integrationEClass.getESuperTypes().add(this.getTaggedElement());
    checkoutManagerEClass.getESuperTypes().add(this.getPopElement());
    checkoutEClass.getESuperTypes().add(this.getPopElement());
    workspaceSpecificationEClass.getESuperTypes().add(this.getPopElement());
    secondaryModuleEClass.getESuperTypes().add(this.getModule());
    workspaceConfiguratorEClass.getESuperTypes().add(this.getPopElement());

    // Initialize classes and features; add operations and parameters
    initEClass(identifiableEClass, Identifiable.class,
        "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getIdentifiable_Id(),
        ecorePackage.getEString(),
        "id", null, 1, 1, Identifiable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(displayableEClass, Displayable.class,
        "Displayable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getDisplayable_DisplayString(),
        ecorePackage.getEString(),
        "displayString", null, 1, 1, Displayable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(popElementEClass, PopElement.class,
        "PopElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getPopElement_Class(),
        ecorePackage.getEString(),
        "class", null, 1, 1, PopElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(popManagerEClass, PopManager.class,
        "PopManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPopManager_Pops(),
        this.getPop(),
        this.getPop_PopManager(),
        "pops", null, 0, -1, PopManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(popEClass, Pop.class, "Pop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPop_PopManager(),
        this.getPopManager(),
        this.getPopManager_Pops(),
        "popManager", null, 1, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getPop_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getPop_Active(),
        ecorePackage.getEBoolean(),
        "active", null, 1, 1, Pop.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPop_Developers(),
        this.getDeveloper(),
        this.getDeveloper_Pop(),
        "developers", null, 1, -1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPop_Repository(),
        this.getRepository(),
        this.getRepository_Pop(),
        "repository", null, 1, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPop_RootStream(),
        this.getDevelopmentStream(),
        this.getDevelopmentStream_Pop(),
        "rootStream", null, 1, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPop_PrimaryModule(),
        this.getPrimaryModule(),
        this.getPrimaryModule_Pop(),
        "primaryModule", null, 1, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getPop_CheckoutManager(),
        this.getCheckoutManager(),
        this.getCheckoutManager_Pop(),
        "checkoutManager", null, 0, 1, Pop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getModule_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getModule_Descriptor(),
        ecorePackage.getEString(),
        "descriptor", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(primaryModuleEClass, PrimaryModule.class,
        "PrimaryModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getPrimaryModule_Pop(),
        this.getPop(),
        this.getPop_PrimaryModule(),
        "pop", null, 1, 1, PrimaryModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getPrimaryModule_SpecificationPath(),
        ecorePackage.getEString(),
        "specificationPath", "product.xml", 1, 1, PrimaryModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

    initEClass(repositoryEClass, Repository.class,
        "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getRepository_Pop(),
        this.getPop(),
        this.getPop_Repository(),
        "pop", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getRepository_Adapter(),
        this.getRepositoryAdapter(),
        "adapter", null, 1, 1, Repository.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getRepository_AdapterType(),
        ecorePackage.getEString(),
        "adapterType", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getRepository_Descriptor(),
        ecorePackage.getEString(),
        "descriptor", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getRepository_MainBranch(),
        this.getMainBranch(),
        this.getMainBranch_Repository(),
        "mainBranch", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDeveloper_Pop(),
        this.getPop(),
        this.getPop_Developers(),
        "pop", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_RepositoryUser(),
        ecorePackage.getEString(),
        "repositoryUser", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_Email(),
        ecorePackage.getEString(),
        "email", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_Entry(),
        ecorePackage.getEDate(),
        "entry", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_Exit(),
        ecorePackage.getEDate(),
        "exit", null, 0, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeveloper_Active(),
        ecorePackage.getEBoolean(),
        "active", null, 1, 1, Developer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getTaskGroup_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTaskGroup_Assignee(),
        this.getAssignee(),
        this.getAssignee_TaskGroups(),
        "assignee", null, 1, 1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getTask_MylynId(),
        ecorePackage.getEString(),
        "mylynId", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTask_Assignee(),
        this.getAssignee(),
        this.getAssignee_Tasks(),
        "assignee", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTask_Targets(),
        this.getTarget(),
        this.getTarget_Tasks(),
        "targets", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(checkoutDiscriminatorEClass, CheckoutDiscriminator.class,
        "CheckoutDiscriminator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getCheckoutDiscriminator_RepositoryTag(),
        this.getRepositoryTag(),
        "repositoryTag", null, 1, 1, CheckoutDiscriminator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCheckoutDiscriminator_Checkout(),
        this.getCheckout(),
        this.getCheckout_Discriminator(),
        "checkout", null, 0, 1, CheckoutDiscriminator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(checkoutDiscriminatorEClass, this.getRepository(), "getRepository", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(checkoutDiscriminatorEClass, ecorePackage.getEBoolean(), "hasCheckout", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(checkoutDiscriminatorEClass, this.getCheckout(), "checkout", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTag_Branch(),
        this.getBranch(),
        this.getBranch_Tags(),
        "branch", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getTag_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTag_TaggedElement(),
        this.getTaggedElement(),
        this.getTaggedElement_Tag(),
        "taggedElement", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(taggedElementEClass, TaggedElement.class,
        "TaggedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getTaggedElement_Tag(),
        this.getTag(),
        this.getTag_TaggedElement(),
        "tag", null, 1, 1, TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(branchEClass, Branch.class, "Branch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getBranch_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Branches(),
        this.getSubBranch(),
        this.getSubBranch_Parent(),
        "branches", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Tags(),
        this.getTag(),
        this.getTag_Branch(),
        "tags", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getBranch_Stream(),
        this.getStream(),
        this.getStream_Branch(),
        "stream", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(branchEClass, this.getMainBranch(), "getMainBranch", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(branchEClass, this.getBranch(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(mainBranchEClass, MainBranch.class,
        "MainBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMainBranch_Repository(),
        this.getRepository(),
        this.getRepository_MainBranch(),
        "repository", null, 1, 1, MainBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(subBranchEClass, SubBranch.class, "SubBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getSubBranch_Parent(),
        this.getBranch(),
        this.getBranch_Branches(),
        "parent", null, 1, 1, SubBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(streamEClass, Stream.class, "Stream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getStream_Branch(),
        this.getBranch(),
        this.getBranch_Stream(),
        "branch", null, 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getStream_Integrations(),
        this.getIntegration(),
        this.getIntegration_Stream(),
        "integrations", null, 0, -1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getPop(), "getPop", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getStream(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(streamEClass, this.getStream(), "getStreams", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(deliveryStreamEClass, DeliveryStream.class,
        "DeliveryStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDeliveryStream_Parent(),
        this.getIntegrationStream(),
        this.getIntegrationStream_DeliveryStreams(),
        "parent", null, 1, 1, DeliveryStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDeliveryStream_Baseline(),
        ecorePackage.getEDate(),
        "baseline", null, 1, 1, DeliveryStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getDeliveryStream_Task(),
        this.getTask(),
        null,
        "task", null, 1, 1, DeliveryStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getDeliveryStream_Deliveries(),
        this.getDelivery(),
        this.getDelivery_Stream(),
        "deliveries", null, 0, -1, DeliveryStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(integrationStreamEClass, IntegrationStream.class,
        "IntegrationStream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getIntegrationStream_DeliveryStreams(),
        this.getDeliveryStream(),
        this.getDeliveryStream_Parent(),
        "deliveryStreams", null, 0, -1, IntegrationStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getIntegrationStream_Releases(),
        this.getRelease(),
        this.getRelease_Stream(),
        "releases", null, 0, -1, IntegrationStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(developmentStreamEClass, DevelopmentStream.class,
        "DevelopmentStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDevelopmentStream_MaintenanceStreams(),
        this.getMaintenanceStream(),
        this.getMaintenanceStream_Parent(),
        "maintenanceStreams", null, 0, -1, DevelopmentStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getDevelopmentStream_Pop(),
        this.getPop(),
        this.getPop_RootStream(),
        "pop", null, 1, 1, DevelopmentStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

    initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(
        getTarget_Date(),
        ecorePackage.getEDate(),
        "date", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getTarget_Tasks(),
        this.getTask(),
        this.getTask_Targets(),
        "tasks", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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
        "stream", null, 1, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getRelease_Milestones(),
        this.getMilestone(),
        this.getMilestone_Release(),
        "milestones", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getMilestone_Release(),
        this.getRelease(),
        this.getRelease_Milestones(),
        "release", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getMilestone_Name(),
        ecorePackage.getEString(),
        "name", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getDelivery_Stream(),
        this.getDeliveryStream(),
        this.getDeliveryStream_Deliveries(),
        "stream", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDelivery_Number(),
        ecorePackage.getEInt(),
        "number", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getDelivery_Date(),
        ecorePackage.getEDate(),
        "date", null, 1, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getDelivery_Merges(),
        this.getIntegration(),
        this.getIntegration_Delivery(),
        "merges", null, 0, -1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(integrationEClass, Integration.class,
        "Integration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getIntegration_Stream(),
        this.getStream(),
        this.getStream_Integrations(),
        "stream", null, 1, 1, Integration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getIntegration_Date(),
        ecorePackage.getEDate(),
        "date", null, 1, 1, Integration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getIntegration_Delivery(),
        this.getDelivery(),
        this.getDelivery_Merges(),
        "delivery", null, 1, 1, Integration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(checkoutManagerEClass, CheckoutManager.class,
        "CheckoutManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getCheckoutManager_Pop(),
        this.getPop(),
        this.getPop_CheckoutManager(),
        "pop", null, 1, 1, CheckoutManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCheckoutManager_Location(),
        this.getPath(),
        "location", null, 1, 1, CheckoutManager.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCheckoutManager_Checkouts(),
        this.getCheckout(),
        this.getCheckout_Manager(),
        "checkouts", null, 0, -1, CheckoutManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCheckoutManager_ActiveCheckout(),
        this.getCheckout(),
        null,
        "activeCheckout", null, 0, 1, CheckoutManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    EOperation op = addEOperation(checkoutManagerEClass, ecorePackage.getEBoolean(),
        "hasCheckout", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, this.getCheckoutDiscriminator(), "discriminator", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(checkoutManagerEClass, this.getCheckout(), "getCheckout", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, this.getCheckoutDiscriminator(), "discriminator", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    op = addEOperation(checkoutManagerEClass, this.getCheckout(), "checkout", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    addEParameter(op, this.getCheckoutDiscriminator(), "discriminator", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(checkoutEClass, Checkout.class, "Checkout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getCheckout_Manager(),
        this.getCheckoutManager(),
        this.getCheckoutManager_Checkouts(),
        "manager", null, 1, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCheckout_Discriminator(),
        this.getCheckoutDiscriminator(),
        this.getCheckoutDiscriminator_Checkout(),
        "discriminator", null, 1, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCheckout_Location(),
        this.getPath(),
        "location", null, 1, 1, Checkout.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCheckout_Transitioning(),
        ecorePackage.getEBoolean(),
        "transitioning", null, 1, 1, Checkout.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCheckout_State(),
        this.getCheckoutState(),
        "state", null, 1, 1, Checkout.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEAttribute(
        getCheckout_Active(),
        ecorePackage.getEBoolean(),
        "active", null, 1, 1, Checkout.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getCheckout_WorkspaceSpecification(),
        this.getWorkspaceSpecification(),
        this.getWorkspaceSpecification_Checkout(),
        "workspaceSpecification", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(workspaceSpecificationEClass, WorkspaceSpecification.class,
        "WorkspaceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getWorkspaceSpecification_Checkout(),
        this.getCheckout(),
        this.getCheckout_WorkspaceSpecification(),
        "checkout", null, 1, 1, WorkspaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getWorkspaceSpecification_SecondaryModules(),
        this.getSecondaryModule(),
        this.getSecondaryModule_WorkspaceSpecification(),
        "secondaryModules", null, 0, -1, WorkspaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getWorkspaceSpecification_WorkspaceConfigurators(),
        this.getWorkspaceConfigurator(),
        this.getWorkspaceConfigurator_WorkspaceSpecification(),
        "workspaceConfigurators", null, 0, -1, WorkspaceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(secondaryModuleEClass, SecondaryModule.class,
        "SecondaryModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getSecondaryModule_WorkspaceSpecification(),
        this.getWorkspaceSpecification(),
        this.getWorkspaceSpecification_SecondaryModules(),
        "workspaceSpecification", null, 1, 1, SecondaryModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    initEClass(workspaceConfiguratorEClass, WorkspaceConfigurator.class,
        "WorkspaceConfigurator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getWorkspaceConfigurator_WorkspaceSpecification(),
        this.getWorkspaceSpecification(),
        this.getWorkspaceSpecification_WorkspaceConfigurators(),
        "workspaceSpecification", null, 1, 1, WorkspaceConfigurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    addEOperation(workspaceConfiguratorEClass, null, "validate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(workspaceConfiguratorEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(assigneeEClass, Assignee.class, "Assignee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(
        getAssignee_Tasks(),
        this.getTask(),
        this.getTask_Assignee(),
        "tasks", null, 0, -1, Assignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
    initEReference(
        getAssignee_TaskGroups(),
        this.getTaskGroup(),
        this.getTaskGroup_Assignee(),
        "taskGroups", null, 0, -1, Assignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

    // Initialize enums and add enum literals
    initEEnum(checkoutStateEEnum, CheckoutState.class, "CheckoutState"); //$NON-NLS-1$
    addEEnumLiteral(checkoutStateEEnum, CheckoutState.INITIAL);
    addEEnumLiteral(checkoutStateEEnum, CheckoutState.SPECIFIED);
    addEEnumLiteral(checkoutStateEEnum, CheckoutState.AVAILABLE);

    // Initialize data types
    initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(pathEDataType, IPath.class, "Path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(repositoryAdapterEDataType, IRepositoryAdapter.class,
        "RepositoryAdapter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(repositorySessionEDataType, IRepositorySession.class,
        "RepositorySession", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(repositoryFolderEDataType, IRepositoryFolder.class,
        "RepositoryFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(repositoryTagEDataType, IRepositoryTag.class,
        "RepositoryTag", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    // Create resource
    createResource(eNS_URI);
  }

} // PopPackageImpl
