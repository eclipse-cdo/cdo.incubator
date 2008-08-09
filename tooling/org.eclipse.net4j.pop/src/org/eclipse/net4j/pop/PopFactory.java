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
 * $Id: PopFactory.java,v 1.5 2008-08-09 09:58:10 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.net4j.pop.PopPackage
 * @generated
 */
public interface PopFactory extends EFactory
{
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PopFactory eINSTANCE = org.eclipse.net4j.pop.impl.PopFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Manager</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Manager</em>'.
   * @generated
   */
  PopManager createPopManager();

  /**
   * Returns a new object of class '<em>Pop</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Pop</em>'.
   * @generated
   */
  Pop createPop();

  /**
   * Returns a new object of class '<em>Primary Module</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Primary Module</em>'.
   * @generated
   */
  PrimaryModule createPrimaryModule();

  /**
   * Returns a new object of class '<em>Repository</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Developer</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Developer</em>'.
   * @generated
   */
  Developer createDeveloper();

  /**
   * Returns a new object of class '<em>Task Group</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Task Group</em>'.
   * @generated
   */
  TaskGroup createTaskGroup();

  /**
   * Returns a new object of class '<em>Task</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Tag</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Tag</em>'.
   * @generated
   */
  Tag createTag();

  /**
   * Returns a new object of class '<em>Main Branch</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Main Branch</em>'.
   * @generated
   */
  MainBranch createMainBranch();

  /**
   * Returns a new object of class '<em>Sub Branch</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Sub Branch</em>'.
   * @generated
   */
  SubBranch createSubBranch();

  /**
   * Returns a new object of class '<em>Delivery Stream</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Delivery Stream</em>'.
   * @generated
   */
  DeliveryStream createDeliveryStream();

  /**
   * Returns a new object of class '<em>Development Stream</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Development Stream</em>'.
   * @generated
   */
  DevelopmentStream createDevelopmentStream();

  /**
   * Returns a new object of class '<em>Maintenance Stream</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Maintenance Stream</em>'.
   * @generated
   */
  MaintenanceStream createMaintenanceStream();

  /**
   * Returns a new object of class '<em>Release</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Release</em>'.
   * @generated
   */
  Release createRelease();

  /**
   * Returns a new object of class '<em>Milestone</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Milestone</em>'.
   * @generated
   */
  Milestone createMilestone();

  /**
   * Returns a new object of class '<em>Delivery</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Delivery</em>'.
   * @generated
   */
  Delivery createDelivery();

  /**
   * Returns a new object of class '<em>Integration</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Integration</em>'.
   * @generated
   */
  Integration createIntegration();

  /**
   * Returns a new object of class '<em>Checkout Manager</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Checkout Manager</em>'.
   * @generated
   */
  CheckoutManager createCheckoutManager();

  /**
   * Returns a new object of class '<em>Checkout</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Checkout</em>'.
   * @generated
   */
  Checkout createCheckout();

  /**
   * Returns a new object of class '<em>Workspace Specification</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Workspace Specification</em>'.
   * @generated
   */
  WorkspaceSpecification createWorkspaceSpecification();

  /**
   * Returns a new object of class '<em>Secondary Module</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Secondary Module</em>'.
   * @generated
   */
  SecondaryModule createSecondaryModule();

  /**
   * Returns a new object of class '<em>Assignee</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Assignee</em>'.
   * @generated
   */
  Assignee createAssignee();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the package supported by this factory.
   * @generated
   */
  PopPackage getPopPackage();

} // PopFactory
