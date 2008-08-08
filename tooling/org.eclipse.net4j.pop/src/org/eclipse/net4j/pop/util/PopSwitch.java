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
 * $Id: PopSwitch.java,v 1.2 2008-08-08 09:24:34 estepper Exp $
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.PopPackage
 * @generated
 */
public class PopSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PopPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PopPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case PopPackage.IDENTIFIABLE:
    {
      Identifiable identifiable = (Identifiable)theEObject;
      T result = caseIdentifiable(identifiable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.DISPLAYABLE:
    {
      Displayable displayable = (Displayable)theEObject;
      T result = caseDisplayable(displayable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.POP_ELEMENT:
    {
      PopElement popElement = (PopElement)theEObject;
      T result = casePopElement(popElement);
      if (result == null)
        result = caseIdentifiable(popElement);
      if (result == null)
        result = caseDisplayable(popElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.POP_MANAGER:
    {
      PopManager popManager = (PopManager)theEObject;
      T result = casePopManager(popManager);
      if (result == null)
        result = casePopElement(popManager);
      if (result == null)
        result = caseIdentifiable(popManager);
      if (result == null)
        result = caseDisplayable(popManager);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.POP:
    {
      Pop pop = (Pop)theEObject;
      T result = casePop(pop);
      if (result == null)
        result = casePopElement(pop);
      if (result == null)
        result = caseAssignee(pop);
      if (result == null)
        result = caseIdentifiable(pop);
      if (result == null)
        result = caseDisplayable(pop);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.MODULE:
    {
      Module module = (Module)theEObject;
      T result = caseModule(module);
      if (result == null)
        result = casePopElement(module);
      if (result == null)
        result = caseIdentifiable(module);
      if (result == null)
        result = caseDisplayable(module);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.PRIMARY_MODULE:
    {
      PrimaryModule primaryModule = (PrimaryModule)theEObject;
      T result = casePrimaryModule(primaryModule);
      if (result == null)
        result = caseModule(primaryModule);
      if (result == null)
        result = casePopElement(primaryModule);
      if (result == null)
        result = caseIdentifiable(primaryModule);
      if (result == null)
        result = caseDisplayable(primaryModule);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.REPOSITORY:
    {
      Repository repository = (Repository)theEObject;
      T result = caseRepository(repository);
      if (result == null)
        result = casePopElement(repository);
      if (result == null)
        result = caseIdentifiable(repository);
      if (result == null)
        result = caseDisplayable(repository);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.DEVELOPER:
    {
      Developer developer = (Developer)theEObject;
      T result = caseDeveloper(developer);
      if (result == null)
        result = casePopElement(developer);
      if (result == null)
        result = caseAssignee(developer);
      if (result == null)
        result = caseIdentifiable(developer);
      if (result == null)
        result = caseDisplayable(developer);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.TASK_GROUP:
    {
      TaskGroup taskGroup = (TaskGroup)theEObject;
      T result = caseTaskGroup(taskGroup);
      if (result == null)
        result = casePopElement(taskGroup);
      if (result == null)
        result = caseAssignee(taskGroup);
      if (result == null)
        result = caseIdentifiable(taskGroup);
      if (result == null)
        result = caseDisplayable(taskGroup);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.TASK:
    {
      Task task = (Task)theEObject;
      T result = caseTask(task);
      if (result == null)
        result = casePopElement(task);
      if (result == null)
        result = caseIdentifiable(task);
      if (result == null)
        result = caseDisplayable(task);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.CHECKOUT_DISCRIMINATOR:
    {
      CheckoutDiscriminator checkoutDiscriminator = (CheckoutDiscriminator)theEObject;
      T result = caseCheckoutDiscriminator(checkoutDiscriminator);
      if (result == null)
        result = casePopElement(checkoutDiscriminator);
      if (result == null)
        result = caseIdentifiable(checkoutDiscriminator);
      if (result == null)
        result = caseDisplayable(checkoutDiscriminator);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.TAG:
    {
      Tag tag = (Tag)theEObject;
      T result = caseTag(tag);
      if (result == null)
        result = caseCheckoutDiscriminator(tag);
      if (result == null)
        result = casePopElement(tag);
      if (result == null)
        result = caseIdentifiable(tag);
      if (result == null)
        result = caseDisplayable(tag);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.TAGGED_ELEMENT:
    {
      TaggedElement taggedElement = (TaggedElement)theEObject;
      T result = caseTaggedElement(taggedElement);
      if (result == null)
        result = casePopElement(taggedElement);
      if (result == null)
        result = caseIdentifiable(taggedElement);
      if (result == null)
        result = caseDisplayable(taggedElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.BRANCH:
    {
      Branch branch = (Branch)theEObject;
      T result = caseBranch(branch);
      if (result == null)
        result = caseCheckoutDiscriminator(branch);
      if (result == null)
        result = casePopElement(branch);
      if (result == null)
        result = caseIdentifiable(branch);
      if (result == null)
        result = caseDisplayable(branch);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.MAIN_BRANCH:
    {
      MainBranch mainBranch = (MainBranch)theEObject;
      T result = caseMainBranch(mainBranch);
      if (result == null)
        result = caseBranch(mainBranch);
      if (result == null)
        result = caseCheckoutDiscriminator(mainBranch);
      if (result == null)
        result = casePopElement(mainBranch);
      if (result == null)
        result = caseIdentifiable(mainBranch);
      if (result == null)
        result = caseDisplayable(mainBranch);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.SUB_BRANCH:
    {
      SubBranch subBranch = (SubBranch)theEObject;
      T result = caseSubBranch(subBranch);
      if (result == null)
        result = caseBranch(subBranch);
      if (result == null)
        result = caseCheckoutDiscriminator(subBranch);
      if (result == null)
        result = casePopElement(subBranch);
      if (result == null)
        result = caseIdentifiable(subBranch);
      if (result == null)
        result = caseDisplayable(subBranch);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.STREAM:
    {
      Stream stream = (Stream)theEObject;
      T result = caseStream(stream);
      if (result == null)
        result = casePopElement(stream);
      if (result == null)
        result = caseIdentifiable(stream);
      if (result == null)
        result = caseDisplayable(stream);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.DELIVERY_STREAM:
    {
      DeliveryStream deliveryStream = (DeliveryStream)theEObject;
      T result = caseDeliveryStream(deliveryStream);
      if (result == null)
        result = caseStream(deliveryStream);
      if (result == null)
        result = casePopElement(deliveryStream);
      if (result == null)
        result = caseIdentifiable(deliveryStream);
      if (result == null)
        result = caseDisplayable(deliveryStream);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.INTEGRATION_STREAM:
    {
      IntegrationStream integrationStream = (IntegrationStream)theEObject;
      T result = caseIntegrationStream(integrationStream);
      if (result == null)
        result = caseStream(integrationStream);
      if (result == null)
        result = casePopElement(integrationStream);
      if (result == null)
        result = caseIdentifiable(integrationStream);
      if (result == null)
        result = caseDisplayable(integrationStream);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.DEVELOPMENT_STREAM:
    {
      DevelopmentStream developmentStream = (DevelopmentStream)theEObject;
      T result = caseDevelopmentStream(developmentStream);
      if (result == null)
        result = caseIntegrationStream(developmentStream);
      if (result == null)
        result = caseStream(developmentStream);
      if (result == null)
        result = casePopElement(developmentStream);
      if (result == null)
        result = caseIdentifiable(developmentStream);
      if (result == null)
        result = caseDisplayable(developmentStream);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.MAINTENANCE_STREAM:
    {
      MaintenanceStream maintenanceStream = (MaintenanceStream)theEObject;
      T result = caseMaintenanceStream(maintenanceStream);
      if (result == null)
        result = caseIntegrationStream(maintenanceStream);
      if (result == null)
        result = caseStream(maintenanceStream);
      if (result == null)
        result = casePopElement(maintenanceStream);
      if (result == null)
        result = caseIdentifiable(maintenanceStream);
      if (result == null)
        result = caseDisplayable(maintenanceStream);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.TARGET:
    {
      Target target = (Target)theEObject;
      T result = caseTarget(target);
      if (result == null)
        result = caseTaggedElement(target);
      if (result == null)
        result = casePopElement(target);
      if (result == null)
        result = caseIdentifiable(target);
      if (result == null)
        result = caseDisplayable(target);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.RELEASE:
    {
      Release release = (Release)theEObject;
      T result = caseRelease(release);
      if (result == null)
        result = caseTarget(release);
      if (result == null)
        result = caseTaggedElement(release);
      if (result == null)
        result = casePopElement(release);
      if (result == null)
        result = caseIdentifiable(release);
      if (result == null)
        result = caseDisplayable(release);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.MILESTONE:
    {
      Milestone milestone = (Milestone)theEObject;
      T result = caseMilestone(milestone);
      if (result == null)
        result = caseTarget(milestone);
      if (result == null)
        result = caseTaggedElement(milestone);
      if (result == null)
        result = casePopElement(milestone);
      if (result == null)
        result = caseIdentifiable(milestone);
      if (result == null)
        result = caseDisplayable(milestone);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.DELIVERY:
    {
      Delivery delivery = (Delivery)theEObject;
      T result = caseDelivery(delivery);
      if (result == null)
        result = caseTaggedElement(delivery);
      if (result == null)
        result = casePopElement(delivery);
      if (result == null)
        result = caseIdentifiable(delivery);
      if (result == null)
        result = caseDisplayable(delivery);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.INTEGRATION:
    {
      Integration integration = (Integration)theEObject;
      T result = caseIntegration(integration);
      if (result == null)
        result = caseTaggedElement(integration);
      if (result == null)
        result = casePopElement(integration);
      if (result == null)
        result = caseIdentifiable(integration);
      if (result == null)
        result = caseDisplayable(integration);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.CHECKOUT_MANAGER:
    {
      CheckoutManager checkoutManager = (CheckoutManager)theEObject;
      T result = caseCheckoutManager(checkoutManager);
      if (result == null)
        result = casePopElement(checkoutManager);
      if (result == null)
        result = caseIdentifiable(checkoutManager);
      if (result == null)
        result = caseDisplayable(checkoutManager);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.CHECKOUT:
    {
      Checkout checkout = (Checkout)theEObject;
      T result = caseCheckout(checkout);
      if (result == null)
        result = casePopElement(checkout);
      if (result == null)
        result = caseIdentifiable(checkout);
      if (result == null)
        result = caseDisplayable(checkout);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.WORKSPACE_SPECIFICATION:
    {
      WorkspaceSpecification workspaceSpecification = (WorkspaceSpecification)theEObject;
      T result = caseWorkspaceSpecification(workspaceSpecification);
      if (result == null)
        result = casePopElement(workspaceSpecification);
      if (result == null)
        result = caseIdentifiable(workspaceSpecification);
      if (result == null)
        result = caseDisplayable(workspaceSpecification);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.SECONDARY_MODULE:
    {
      SecondaryModule secondaryModule = (SecondaryModule)theEObject;
      T result = caseSecondaryModule(secondaryModule);
      if (result == null)
        result = caseModule(secondaryModule);
      if (result == null)
        result = casePopElement(secondaryModule);
      if (result == null)
        result = caseIdentifiable(secondaryModule);
      if (result == null)
        result = caseDisplayable(secondaryModule);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.WORKSPACE_CONFIGURATOR:
    {
      WorkspaceConfigurator workspaceConfigurator = (WorkspaceConfigurator)theEObject;
      T result = caseWorkspaceConfigurator(workspaceConfigurator);
      if (result == null)
        result = casePopElement(workspaceConfigurator);
      if (result == null)
        result = caseIdentifiable(workspaceConfigurator);
      if (result == null)
        result = caseDisplayable(workspaceConfigurator);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case PopPackage.ASSIGNEE:
    {
      Assignee assignee = (Assignee)theEObject;
      T result = caseAssignee(assignee);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifiable(Identifiable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Displayable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Displayable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisplayable(Displayable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePopElement(PopElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePopManager(PopManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePop(Pop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryModule(PrimaryModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Developer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Developer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeveloper(Developer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskGroup(TaskGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkout Discriminator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkout Discriminator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckoutDiscriminator(CheckoutDiscriminator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTag(Tag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaggedElement(TaggedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranch(Branch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainBranch(MainBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubBranch(SubBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStream(Stream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delivery Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delivery Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeliveryStream(DeliveryStream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integration Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integration Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegrationStream(IntegrationStream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Development Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Development Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevelopmentStream(DevelopmentStream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maintenance Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maintenance Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaintenanceStream(MaintenanceStream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTarget(Target object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Release</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelease(Release object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Milestone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Milestone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMilestone(Milestone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelivery(Delivery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegration(Integration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkout Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkout Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckoutManager(CheckoutManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckout(Checkout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workspace Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workspace Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkspaceSpecification(WorkspaceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Secondary Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Secondary Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondaryModule(SecondaryModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workspace Configurator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workspace Configurator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkspaceConfigurator(WorkspaceConfigurator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignee</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignee</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignee(Assignee object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PopSwitch
