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
 * $Id: PopFactoryImpl.java,v 1.4 2008-08-09 09:26:22 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutManager;
import org.eclipse.net4j.pop.CheckoutState;
import org.eclipse.net4j.pop.Delivery;
import org.eclipse.net4j.pop.DeliveryStream;
import org.eclipse.net4j.pop.Developer;
import org.eclipse.net4j.pop.DevelopmentStream;
import org.eclipse.net4j.pop.Integration;
import org.eclipse.net4j.pop.MainBranch;
import org.eclipse.net4j.pop.MaintenanceStream;
import org.eclipse.net4j.pop.Milestone;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopFactory;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.PrimaryModule;
import org.eclipse.net4j.pop.Release;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.SecondaryModule;
import org.eclipse.net4j.pop.SubBranch;
import org.eclipse.net4j.pop.Tag;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;
import org.eclipse.net4j.pop.Version;
import org.eclipse.net4j.pop.WorkspaceSpecification;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;
import org.eclipse.net4j.pop.repository.IRepositoryFolder;
import org.eclipse.net4j.pop.repository.IRepositorySession;
import org.eclipse.net4j.pop.repository.IRepositoryTag;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.net4j.pop.*;
import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopFactoryImpl extends EFactoryImpl implements PopFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PopFactory init()
  {
    try
    {
      PopFactory thePopFactory = (PopFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/POP/1.0.0"); //$NON-NLS-1$ 
      if (thePopFactory != null)
      {
        return thePopFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PopFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case PopPackage.POP_MANAGER:
      return createPopManager();
    case PopPackage.POP:
      return createPop();
    case PopPackage.PRIMARY_MODULE:
      return createPrimaryModule();
    case PopPackage.REPOSITORY:
      return createRepository();
    case PopPackage.DEVELOPER:
      return createDeveloper();
    case PopPackage.TASK_GROUP:
      return createTaskGroup();
    case PopPackage.TASK:
      return createTask();
    case PopPackage.TAG:
      return createTag();
    case PopPackage.MAIN_BRANCH:
      return createMainBranch();
    case PopPackage.SUB_BRANCH:
      return createSubBranch();
    case PopPackage.DELIVERY_STREAM:
      return createDeliveryStream();
    case PopPackage.DEVELOPMENT_STREAM:
      return createDevelopmentStream();
    case PopPackage.MAINTENANCE_STREAM:
      return createMaintenanceStream();
    case PopPackage.RELEASE:
      return createRelease();
    case PopPackage.MILESTONE:
      return createMilestone();
    case PopPackage.DELIVERY:
      return createDelivery();
    case PopPackage.INTEGRATION:
      return createIntegration();
    case PopPackage.CHECKOUT_MANAGER:
      return createCheckoutManager();
    case PopPackage.CHECKOUT:
      return createCheckout();
    case PopPackage.WORKSPACE_SPECIFICATION:
      return createWorkspaceSpecification();
    case PopPackage.SECONDARY_MODULE:
      return createSecondaryModule();
    case PopPackage.ASSIGNEE:
      return createAssignee();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case PopPackage.CHECKOUT_STATE:
      return createCheckoutStateFromString(eDataType, initialValue);
    case PopPackage.VERSION:
      return createVersionFromString(eDataType, initialValue);
    case PopPackage.PATH:
      return createPathFromString(eDataType, initialValue);
    case PopPackage.REPOSITORY_ADAPTER:
      return createRepositoryAdapterFromString(eDataType, initialValue);
    case PopPackage.REPOSITORY_SESSION:
      return createRepositorySessionFromString(eDataType, initialValue);
    case PopPackage.REPOSITORY_FOLDER:
      return createRepositoryFolderFromString(eDataType, initialValue);
    case PopPackage.REPOSITORY_TAG:
      return createRepositoryTagFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case PopPackage.CHECKOUT_STATE:
      return convertCheckoutStateToString(eDataType, instanceValue);
    case PopPackage.VERSION:
      return convertVersionToString(eDataType, instanceValue);
    case PopPackage.PATH:
      return convertPathToString(eDataType, instanceValue);
    case PopPackage.REPOSITORY_ADAPTER:
      return convertRepositoryAdapterToString(eDataType, instanceValue);
    case PopPackage.REPOSITORY_SESSION:
      return convertRepositorySessionToString(eDataType, instanceValue);
    case PopPackage.REPOSITORY_FOLDER:
      return convertRepositoryFolderToString(eDataType, instanceValue);
    case PopPackage.REPOSITORY_TAG:
      return convertRepositoryTagToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopManager createPopManager()
  {
    PopManagerImpl popManager = new PopManagerImpl();
    return popManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pop createPop()
  {
    PopImpl pop = new PopImpl();
    return pop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryModule createPrimaryModule()
  {
    PrimaryModuleImpl primaryModule = new PrimaryModuleImpl();
    return primaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Developer createDeveloper()
  {
    DeveloperImpl developer = new DeveloperImpl();
    return developer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskGroup createTaskGroup()
  {
    TaskGroupImpl taskGroup = new TaskGroupImpl();
    return taskGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainBranch createMainBranch()
  {
    MainBranchImpl mainBranch = new MainBranchImpl();
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubBranch createSubBranch()
  {
    SubBranchImpl subBranch = new SubBranchImpl();
    return subBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeliveryStream createDeliveryStream()
  {
    DeliveryStreamImpl deliveryStream = new DeliveryStreamImpl();
    return deliveryStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevelopmentStream createDevelopmentStream()
  {
    DevelopmentStreamImpl developmentStream = new DevelopmentStreamImpl();
    return developmentStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaintenanceStream createMaintenanceStream()
  {
    MaintenanceStreamImpl maintenanceStream = new MaintenanceStreamImpl();
    return maintenanceStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Release createRelease()
  {
    ReleaseImpl release = new ReleaseImpl();
    return release;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Milestone createMilestone()
  {
    MilestoneImpl milestone = new MilestoneImpl();
    return milestone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delivery createDelivery()
  {
    DeliveryImpl delivery = new DeliveryImpl();
    return delivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integration createIntegration()
  {
    IntegrationImpl integration = new IntegrationImpl();
    return integration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutManager createCheckoutManager()
  {
    CheckoutManagerImpl checkoutManager = new CheckoutManagerImpl();
    return checkoutManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkout createCheckout()
  {
    CheckoutImpl checkout = new CheckoutImpl();
    return checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceSpecification createWorkspaceSpecification()
  {
    WorkspaceSpecificationImpl workspaceSpecification = new WorkspaceSpecificationImpl();
    return workspaceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondaryModule createSecondaryModule()
  {
    SecondaryModuleImpl secondaryModule = new SecondaryModuleImpl();
    return secondaryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignee createAssignee()
  {
    AssigneeImpl assignee = new AssigneeImpl();
    return assignee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckoutState createCheckoutStateFromString(EDataType eDataType, String initialValue)
  {
    CheckoutState result = CheckoutState.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCheckoutStateToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersionFromString(EDataType eDataType, String initialValue)
  {
    return (Version)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositoryAdapter createRepositoryAdapterFromString(EDataType eDataType, String initialValue)
  {
    return (IRepositoryAdapter)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepositoryAdapterToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositorySession createRepositorySessionFromString(EDataType eDataType, String initialValue)
  {
    return (IRepositorySession)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepositorySessionToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositoryFolder createRepositoryFolderFromString(EDataType eDataType, String initialValue)
  {
    return (IRepositoryFolder)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepositoryFolderToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRepositoryTag createRepositoryTagFromString(EDataType eDataType, String initialValue)
  {
    return (IRepositoryTag)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepositoryTagToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopPackage getPopPackage()
  {
    return (PopPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PopPackage getPackage()
  {
    return PopPackage.eINSTANCE;
  }

} //PopFactoryImpl
