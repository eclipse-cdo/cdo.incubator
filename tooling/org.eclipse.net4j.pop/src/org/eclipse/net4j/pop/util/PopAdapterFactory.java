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
 * $Id: PopAdapterFactory.java,v 1.8 2008-08-12 07:31:40 estepper Exp $
 */
package org.eclipse.net4j.pop.util;

import org.eclipse.net4j.pop.Assignee;
import org.eclipse.net4j.pop.Branch;
import org.eclipse.net4j.pop.Checkout;
import org.eclipse.net4j.pop.CheckoutDiscriminator;
import org.eclipse.net4j.pop.CheckoutManager;
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
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.PrimaryModule;
import org.eclipse.net4j.pop.Release;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.RepositoryStrategy;
import org.eclipse.net4j.pop.SecondaryModule;
import org.eclipse.net4j.pop.Stream;
import org.eclipse.net4j.pop.SubBranch;
import org.eclipse.net4j.pop.Tag;
import org.eclipse.net4j.pop.TaggedElement;
import org.eclipse.net4j.pop.Target;
import org.eclipse.net4j.pop.Task;
import org.eclipse.net4j.pop.TaskGroup;
import org.eclipse.net4j.pop.WorkspaceConfigurator;
import org.eclipse.net4j.pop.WorkspaceSpecification;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.PopPackage
 * @generated
 */
public class PopAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static PopPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PopAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PopPackage.eINSTANCE;
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
  protected PopSwitch<Adapter> modelSwitch = new PopSwitch<Adapter>()
  {
    @Override
    public Adapter caseIdentifiable(Identifiable object)
    {
      return createIdentifiableAdapter();
    }

    @Override
    public Adapter caseDisplayable(Displayable object)
    {
      return createDisplayableAdapter();
    }

    @Override
    public Adapter casePopElement(PopElement object)
    {
      return createPopElementAdapter();
    }

    @Override
    public Adapter casePopManager(PopManager object)
    {
      return createPopManagerAdapter();
    }

    @Override
    public Adapter casePop(Pop object)
    {
      return createPopAdapter();
    }

    @Override
    public Adapter caseModule(Module object)
    {
      return createModuleAdapter();
    }

    @Override
    public Adapter casePrimaryModule(PrimaryModule object)
    {
      return createPrimaryModuleAdapter();
    }

    @Override
    public Adapter caseRepository(Repository object)
    {
      return createRepositoryAdapter();
    }

    @Override
    public Adapter caseRepositoryStrategy(RepositoryStrategy object)
    {
      return createRepositoryStrategyAdapter();
    }

    @Override
    public Adapter caseDeveloper(Developer object)
    {
      return createDeveloperAdapter();
    }

    @Override
    public Adapter caseTaskGroup(TaskGroup object)
    {
      return createTaskGroupAdapter();
    }

    @Override
    public Adapter caseTask(Task object)
    {
      return createTaskAdapter();
    }

    @Override
    public Adapter caseCheckoutDiscriminator(CheckoutDiscriminator object)
    {
      return createCheckoutDiscriminatorAdapter();
    }

    @Override
    public Adapter caseTag(Tag object)
    {
      return createTagAdapter();
    }

    @Override
    public Adapter caseTaggedElement(TaggedElement object)
    {
      return createTaggedElementAdapter();
    }

    @Override
    public Adapter caseBranch(Branch object)
    {
      return createBranchAdapter();
    }

    @Override
    public Adapter caseMainBranch(MainBranch object)
    {
      return createMainBranchAdapter();
    }

    @Override
    public Adapter caseSubBranch(SubBranch object)
    {
      return createSubBranchAdapter();
    }

    @Override
    public Adapter caseStream(Stream object)
    {
      return createStreamAdapter();
    }

    @Override
    public Adapter caseDeliveryStream(DeliveryStream object)
    {
      return createDeliveryStreamAdapter();
    }

    @Override
    public Adapter caseIntegrationStream(IntegrationStream object)
    {
      return createIntegrationStreamAdapter();
    }

    @Override
    public Adapter caseDevelopmentStream(DevelopmentStream object)
    {
      return createDevelopmentStreamAdapter();
    }

    @Override
    public Adapter caseMaintenanceStream(MaintenanceStream object)
    {
      return createMaintenanceStreamAdapter();
    }

    @Override
    public Adapter caseTarget(Target object)
    {
      return createTargetAdapter();
    }

    @Override
    public Adapter caseRelease(Release object)
    {
      return createReleaseAdapter();
    }

    @Override
    public Adapter caseMilestone(Milestone object)
    {
      return createMilestoneAdapter();
    }

    @Override
    public Adapter caseDelivery(Delivery object)
    {
      return createDeliveryAdapter();
    }

    @Override
    public Adapter caseIntegration(Integration object)
    {
      return createIntegrationAdapter();
    }

    @Override
    public Adapter caseCheckoutManager(CheckoutManager object)
    {
      return createCheckoutManagerAdapter();
    }

    @Override
    public Adapter caseCheckout(Checkout object)
    {
      return createCheckoutAdapter();
    }

    @Override
    public Adapter caseWorkspaceSpecification(WorkspaceSpecification object)
    {
      return createWorkspaceSpecificationAdapter();
    }

    @Override
    public Adapter caseSecondaryModule(SecondaryModule object)
    {
      return createSecondaryModuleAdapter();
    }

    @Override
    public Adapter caseWorkspaceConfigurator(WorkspaceConfigurator object)
    {
      return createWorkspaceConfiguratorAdapter();
    }

    @Override
    public Adapter caseAssignee(Assignee object)
    {
      return createAssigneeAdapter();
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
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Identifiable <em>Identifiable</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Identifiable
   * @generated
   */
  public Adapter createIdentifiableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Displayable <em>Displayable</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Displayable
   * @generated
   */
  public Adapter createDisplayableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.PopElement <em>Element</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.PopElement
   * @generated
   */
  public Adapter createPopElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.PopManager <em>Manager</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.PopManager
   * @generated
   */
  public Adapter createPopManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Pop <em>Pop</em>}'.
   * <!-- begin-user-doc
   * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Pop
   * @generated
   */
  public Adapter createPopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Module <em>Module</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.PrimaryModule <em>Primary Module</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.PrimaryModule
   * @generated
   */
  public Adapter createPrimaryModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Repository <em>Repository</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Repository
   * @generated
   */
  public Adapter createRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.RepositoryStrategy <em>Repository Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.RepositoryStrategy
   * @generated
   */
  public Adapter createRepositoryStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Developer <em>Developer</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Developer
   * @generated
   */
  public Adapter createDeveloperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.TaskGroup <em>Task Group</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.TaskGroup
   * @generated
   */
  public Adapter createTaskGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Task <em>Task</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.CheckoutDiscriminator <em>Checkout Discriminator</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.CheckoutDiscriminator
   * @generated
   */
  public Adapter createCheckoutDiscriminatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc
   * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Tag
   * @generated
   */
  public Adapter createTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.TaggedElement <em>Tagged Element</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.TaggedElement
   * @generated
   */
  public Adapter createTaggedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Branch <em>Branch</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Branch
   * @generated
   */
  public Adapter createBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.MainBranch <em>Main Branch</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.MainBranch
   * @generated
   */
  public Adapter createMainBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.SubBranch <em>Sub Branch</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.SubBranch
   * @generated
   */
  public Adapter createSubBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Stream <em>Stream</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Stream
   * @generated
   */
  public Adapter createStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.DeliveryStream <em>Delivery Stream</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.DeliveryStream
   * @generated
   */
  public Adapter createDeliveryStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.IntegrationStream <em>Integration Stream</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.IntegrationStream
   * @generated
   */
  public Adapter createIntegrationStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.DevelopmentStream <em>Development Stream</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.DevelopmentStream
   * @generated
   */
  public Adapter createDevelopmentStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.MaintenanceStream <em>Maintenance Stream</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.MaintenanceStream
   * @generated
   */
  public Adapter createMaintenanceStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Target <em>Target</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Release <em>Release</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Release
   * @generated
   */
  public Adapter createReleaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Milestone <em>Milestone</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Milestone
   * @generated
   */
  public Adapter createMilestoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Delivery <em>Delivery</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Delivery
   * @generated
   */
  public Adapter createDeliveryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Integration <em>Integration</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Integration
   * @generated
   */
  public Adapter createIntegrationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.CheckoutManager <em>Checkout Manager</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.CheckoutManager
   * @generated
   */
  public Adapter createCheckoutManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Checkout <em>Checkout</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Checkout
   * @generated
   */
  public Adapter createCheckoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.WorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.WorkspaceSpecification
   * @generated
   */
  public Adapter createWorkspaceSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.SecondaryModule <em>Secondary Module</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.SecondaryModule
   * @generated
   */
  public Adapter createSecondaryModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.WorkspaceConfigurator <em>Workspace Configurator</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.WorkspaceConfigurator
   * @generated
   */
  public Adapter createWorkspaceConfiguratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.net4j.pop.Assignee <em>Assignee</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.net4j.pop.Assignee
   * @generated
   */
  public Adapter createAssigneeAdapter()
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

} // PopAdapterFactory
