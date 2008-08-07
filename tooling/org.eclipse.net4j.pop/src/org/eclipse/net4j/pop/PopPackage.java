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
 * $Id: PopPackage.java,v 1.1 2008-08-07 17:42:12 estepper Exp $
 */
package org.eclipse.net4j.pop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.pop.PopFactory
 * @model kind="package"
 * @generated
 */
public interface PopPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pop"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/POP/1.0.0"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pop"; //$NON-NLS-1$

  /**
   * The package content type ID.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eCONTENT_TYPE = "pop"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PopPackage eINSTANCE = org.eclipse.net4j.pop.impl.PopPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.Identifiable <em>Identifiable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.Identifiable
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIdentifiable()
   * @generated
   */
  int IDENTIFIABLE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIABLE__ID = 0;

  /**
   * The number of structural features of the '<em>Identifiable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.Displayable <em>Displayable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.Displayable
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDisplayable()
   * @generated
   */
  int DISPLAYABLE = 1;

  /**
   * The number of structural features of the '<em>Displayable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAYABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.PopElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.PopElementImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPopElement()
   * @generated
   */
  int POP_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_ELEMENT__ID = IDENTIFIABLE__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_ELEMENT__CLASS = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.PopManager <em>Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.PopManager
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPopManager()
   * @generated
   */
  int POP_MANAGER = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_MANAGER__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_MANAGER__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Pops</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_MANAGER__POPS = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_MANAGER_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.PopImpl <em>Pop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.PopImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPop()
   * @generated
   */
  int POP = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Manager</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__MANAGER = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__NAME = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__ACTIVE = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Developers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__DEVELOPERS = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__REPOSITORY = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Root Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__ROOT_STREAM = POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Primary Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__PRIMARY_MODULE = POP_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Checkout Manager</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP__CHECKOUT_MANAGER = POP_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Pop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.ModuleImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getModule()
   * @generated
   */
  int MODULE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__DESCRIPTOR = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.PrimaryModuleImpl <em>Primary Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.PrimaryModuleImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPrimaryModule()
   * @generated
   */
  int PRIMARY_MODULE = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__ID = MODULE__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__CLASS = MODULE__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__NAME = MODULE__NAME;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__DESCRIPTOR = MODULE__DESCRIPTOR;

  /**
   * The feature id for the '<em><b>Pop</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__POP = MODULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Workspace Specification Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE__WORKSPACE_SPECIFICATION_PATH = MODULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primary Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.RepositoryImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Pop</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__POP = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Adapter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__ADAPTER = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Adapter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__ADAPTER_TYPE = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__DESCRIPTOR = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Main Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__MAIN_BRANCH = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.DeveloperImpl <em>Developer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.DeveloperImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDeveloper()
   * @generated
   */
  int DEVELOPER = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Pop</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__POP = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Repository User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__REPOSITORY_USER = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__NAME = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__EMAIL = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__ENTRY = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__EXIT = POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__ACTIVE = POP_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__TASK_GROUPS = POP_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER__TASKS = POP_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Developer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPER_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.TaskGroupImpl <em>Task Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.TaskGroupImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTaskGroup()
   * @generated
   */
  int TASK_GROUP = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__NAME = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Developer</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__DEVELOPER = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__PARENT = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__CHILDREN = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP__TASKS = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Task Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_GROUP_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.TaskImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTask()
   * @generated
   */
  int TASK = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Mylyn Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__MYLYN_ID = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Developer</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DEVELOPER = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Task Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_GROUP = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Targets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TARGETS = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl <em>Checkout Discriminator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutDiscriminator()
   * @generated
   */
  int CHECKOUT_DISCRIMINATOR = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_DISCRIMINATOR__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_DISCRIMINATOR__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_DISCRIMINATOR__CHECKOUT = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Checkout Discriminator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_DISCRIMINATOR_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.TagImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTag()
   * @generated
   */
  int TAG = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ID = CHECKOUT_DISCRIMINATOR__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CLASS = CHECKOUT_DISCRIMINATOR__CLASS;

  /**
   * The feature id for the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__REPOSITORY_TAG = CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CHECKOUT = CHECKOUT_DISCRIMINATOR__CHECKOUT;

  /**
   * The feature id for the '<em><b>Branch</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__BRANCH = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tagged Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__TAGGED_ELEMENT = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.TaggedElementImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTaggedElement()
   * @generated
   */
  int TAGGED_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT__TAG = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tagged Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_ELEMENT_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.BranchImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__ID = CHECKOUT_DISCRIMINATOR__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__CLASS = CHECKOUT_DISCRIMINATOR__CLASS;

  /**
   * The feature id for the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__REPOSITORY_TAG = CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__CHECKOUT = CHECKOUT_DISCRIMINATOR__CHECKOUT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__NAME = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__BRANCHES = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__TAGS = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__STREAM = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = CHECKOUT_DISCRIMINATOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.MainBranchImpl <em>Main Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.MainBranchImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMainBranch()
   * @generated
   */
  int MAIN_BRANCH = 15;

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
   * The feature id for the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__REPOSITORY_TAG = BRANCH__REPOSITORY_TAG;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__CHECKOUT = BRANCH__CHECKOUT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__NAME = BRANCH__NAME;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__BRANCHES = BRANCH__BRANCHES;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__TAGS = BRANCH__TAGS;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__STREAM = BRANCH__STREAM;

  /**
   * The feature id for the '<em><b>Repository</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH__REPOSITORY = BRANCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Main Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.SubBranchImpl <em>Sub Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.SubBranchImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getSubBranch()
   * @generated
   */
  int SUB_BRANCH = 16;

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
   * The feature id for the '<em><b>Repository Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__REPOSITORY_TAG = BRANCH__REPOSITORY_TAG;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__CHECKOUT = BRANCH__CHECKOUT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__NAME = BRANCH__NAME;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__BRANCHES = BRANCH__BRANCHES;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__TAGS = BRANCH__TAGS;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__STREAM = BRANCH__STREAM;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__PARENT = BRANCH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__ROOT_TAG_NAME = BRANCH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Root Tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH__ROOT_TAG = BRANCH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.StreamImpl <em>Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.StreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getStream()
   * @generated
   */
  int STREAM = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__BRANCH = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__INTEGRATIONS = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl <em>Delivery Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.DeliveryStreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDeliveryStream()
   * @generated
   */
  int DELIVERY_STREAM = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__ID = STREAM__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__CLASS = STREAM__CLASS;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__BRANCH = STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__INTEGRATIONS = STREAM__INTEGRATIONS;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__PARENT = STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Baseline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__BASELINE = STREAM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__TASK = STREAM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Deliveries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM__DELIVERIES = STREAM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Delivery Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_STREAM_FEATURE_COUNT = STREAM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.IntegrationStreamImpl <em>Integration Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.IntegrationStreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIntegrationStream()
   * @generated
   */
  int INTEGRATION_STREAM = 19;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__BRANCH = STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__INTEGRATIONS = STREAM__INTEGRATIONS;

  /**
   * The feature id for the '<em><b>Delivery Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__DELIVERY_STREAMS = STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM__RELEASES = STREAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integration Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_STREAM_FEATURE_COUNT = STREAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.DevelopmentStreamImpl <em>Development Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.DevelopmentStreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDevelopmentStream()
   * @generated
   */
  int DEVELOPMENT_STREAM = 20;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__BRANCH = INTEGRATION_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__INTEGRATIONS = INTEGRATION_STREAM__INTEGRATIONS;

  /**
   * The feature id for the '<em><b>Delivery Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__DELIVERY_STREAMS = INTEGRATION_STREAM__DELIVERY_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__RELEASES = INTEGRATION_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Maintenance Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM__MAINTENANCE_STREAMS = INTEGRATION_STREAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Development Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVELOPMENT_STREAM_FEATURE_COUNT = INTEGRATION_STREAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.MaintenanceStreamImpl <em>Maintenance Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.MaintenanceStreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMaintenanceStream()
   * @generated
   */
  int MAINTENANCE_STREAM = 21;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__BRANCH = INTEGRATION_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__INTEGRATIONS = INTEGRATION_STREAM__INTEGRATIONS;

  /**
   * The feature id for the '<em><b>Delivery Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__DELIVERY_STREAMS = INTEGRATION_STREAM__DELIVERY_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__RELEASES = INTEGRATION_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__PARENT = INTEGRATION_STREAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Baseline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM__BASELINE = INTEGRATION_STREAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Maintenance Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTENANCE_STREAM_FEATURE_COUNT = INTEGRATION_STREAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.RootStreamImpl <em>Root Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.RootStreamImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRootStream()
   * @generated
   */
  int ROOT_STREAM = 22;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__BRANCH = DEVELOPMENT_STREAM__BRANCH;

  /**
   * The feature id for the '<em><b>Integrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__INTEGRATIONS = DEVELOPMENT_STREAM__INTEGRATIONS;

  /**
   * The feature id for the '<em><b>Delivery Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__DELIVERY_STREAMS = DEVELOPMENT_STREAM__DELIVERY_STREAMS;

  /**
   * The feature id for the '<em><b>Releases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__RELEASES = DEVELOPMENT_STREAM__RELEASES;

  /**
   * The feature id for the '<em><b>Maintenance Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__MAINTENANCE_STREAMS = DEVELOPMENT_STREAM__MAINTENANCE_STREAMS;

  /**
   * The feature id for the '<em><b>Pop</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM__POP = DEVELOPMENT_STREAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Root Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_STREAM_FEATURE_COUNT = DEVELOPMENT_STREAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.TargetImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__TASKS = TAGGED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.ReleaseImpl <em>Release</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.ReleaseImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRelease()
   * @generated
   */
  int RELEASE = 24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__TAG = TARGET__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__DATE = TARGET__DATE;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__TASKS = TARGET__TASKS;

  /**
   * The feature id for the '<em><b>Maintenance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__MAINTENANCE = TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__VERSION = TARGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__STREAM = TARGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Milestones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE__MILESTONES = TARGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Release</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELEASE_FEATURE_COUNT = TARGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.MilestoneImpl <em>Milestone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.MilestoneImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMilestone()
   * @generated
   */
  int MILESTONE = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__TAG = TARGET__TAG;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__DATE = TARGET__DATE;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__TASKS = TARGET__TASKS;

  /**
   * The feature id for the '<em><b>Release</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__RELEASE = TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__NAME = TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Milestone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE_FEATURE_COUNT = TARGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.DeliveryImpl <em>Delivery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.DeliveryImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDelivery()
   * @generated
   */
  int DELIVERY = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Merges</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY__MERGES = TAGGED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Delivery</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELIVERY_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.IntegrationImpl <em>Integration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.IntegrationImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIntegration()
   * @generated
   */
  int INTEGRATION = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__ID = TAGGED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__CLASS = TAGGED_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__TAG = TAGGED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Stream</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__STREAM = TAGGED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__DATE = TAGGED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delivery</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__DELIVERY = TAGGED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Integration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl <em>Checkout Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.CheckoutManagerImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutManager()
   * @generated
   */
  int CHECKOUT_MANAGER = 28;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Pop</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__POP = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__LOCATION = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Checkouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__CHECKOUTS = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Active Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER__ACTIVE_CHECKOUT = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Checkout Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_MANAGER_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.CheckoutImpl <em>Checkout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.CheckoutImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckout()
   * @generated
   */
  int CHECKOUT = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Manager</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__MANAGER = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__DISCRIMINATOR = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__LOCATION = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Transitioning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__TRANSITIONING = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__STATE = POP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__ACTIVE = POP_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Workspace Specification</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT__WORKSPACE_SPECIFICATION = POP_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Checkout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKOUT_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl <em>Workspace Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getWorkspaceSpecification()
   * @generated
   */
  int WORKSPACE_SPECIFICATION = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Checkout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION__CHECKOUT = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Secondary Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION__SECONDARY_MODULES = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Workspace Configurators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS = POP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Workspace Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_SPECIFICATION_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.SecondaryModuleImpl <em>Secondary Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.SecondaryModuleImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getSecondaryModule()
   * @generated
   */
  int SECONDARY_MODULE = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE__ID = MODULE__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE__CLASS = MODULE__CLASS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE__NAME = MODULE__NAME;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE__DESCRIPTOR = MODULE__DESCRIPTOR;

  /**
   * The feature id for the '<em><b>Workspace Specification</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE__WORKSPACE_SPECIFICATION = MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Secondary Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.impl.WorkspaceConfiguratorImpl <em>Workspace Configurator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.impl.WorkspaceConfiguratorImpl
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getWorkspaceConfigurator()
   * @generated
   */
  int WORKSPACE_CONFIGURATOR = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR__ID = POP_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR__CLASS = POP_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Workspace Specification</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION = POP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Workspace Configurator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_CONFIGURATOR_FEATURE_COUNT = POP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.net4j.pop.CheckoutState <em>Checkout State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.CheckoutState
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutState()
   * @generated
   */
  int CHECKOUT_STATE = 33;

  /**
   * The meta object id for the '<em>Version</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.Version
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 34;

  /**
   * The meta object id for the '<em>Path</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.core.runtime.IPath
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPath()
   * @generated
   */
  int PATH = 35;

  /**
   * The meta object id for the '<em>Repository Adapter</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.repository.IRepositoryAdapter
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryAdapter()
   * @generated
   */
  int REPOSITORY_ADAPTER = 36;

  /**
   * The meta object id for the '<em>Repository Session</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.repository.IRepositorySession
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositorySession()
   * @generated
   */
  int REPOSITORY_SESSION = 37;

  /**
   * The meta object id for the '<em>Repository Folder</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.repository.IRepositoryFolder
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryFolder()
   * @generated
   */
  int REPOSITORY_FOLDER = 38;

  /**
   * The meta object id for the '<em>Repository Tag</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.net4j.pop.repository.IRepositoryTag
   * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryTag()
   * @generated
   */
  int REPOSITORY_TAG = 39;

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Identifiable <em>Identifiable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifiable</em>'.
   * @see org.eclipse.net4j.pop.Identifiable
   * @generated
   */
  EClass getIdentifiable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Identifiable#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.net4j.pop.Identifiable#getId()
   * @see #getIdentifiable()
   * @generated
   */
  EAttribute getIdentifiable_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Displayable <em>Displayable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Displayable</em>'.
   * @see org.eclipse.net4j.pop.Displayable
   * @generated
   */
  EClass getDisplayable();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.PopElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.net4j.pop.PopElement
   * @generated
   */
  EClass getPopElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.PopElement#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.net4j.pop.PopElement#getClass_()
   * @see #getPopElement()
   * @generated
   */
  EAttribute getPopElement_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.PopManager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manager</em>'.
   * @see org.eclipse.net4j.pop.PopManager
   * @generated
   */
  EClass getPopManager();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.PopManager#getPops <em>Pops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pops</em>'.
   * @see org.eclipse.net4j.pop.PopManager#getPops()
   * @see #getPopManager()
   * @generated
   */
  EReference getPopManager_Pops();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Pop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.Pop
   * @generated
   */
  EClass getPop();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Pop#getManager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Manager</em>'.
   * @see org.eclipse.net4j.pop.Pop#getManager()
   * @see #getPop()
   * @generated
   */
  EReference getPop_Manager();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Pop#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Pop#getName()
   * @see #getPop()
   * @generated
   */
  EAttribute getPop_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Pop#isActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.eclipse.net4j.pop.Pop#isActive()
   * @see #getPop()
   * @generated
   */
  EAttribute getPop_Active();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Pop#getDevelopers <em>Developers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Developers</em>'.
   * @see org.eclipse.net4j.pop.Pop#getDevelopers()
   * @see #getPop()
   * @generated
   */
  EReference getPop_Developers();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.Pop#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repository</em>'.
   * @see org.eclipse.net4j.pop.Pop#getRepository()
   * @see #getPop()
   * @generated
   */
  EReference getPop_Repository();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.Pop#getRootStream <em>Root Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Stream</em>'.
   * @see org.eclipse.net4j.pop.Pop#getRootStream()
   * @see #getPop()
   * @generated
   */
  EReference getPop_RootStream();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.Pop#getPrimaryModule <em>Primary Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Module</em>'.
   * @see org.eclipse.net4j.pop.Pop#getPrimaryModule()
   * @see #getPop()
   * @generated
   */
  EReference getPop_PrimaryModule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Pop#getCheckoutManager <em>Checkout Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Checkout Manager</em>'.
   * @see org.eclipse.net4j.pop.Pop#getCheckoutManager()
   * @see #getPop()
   * @generated
   */
  EReference getPop_CheckoutManager();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.eclipse.net4j.pop.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Module#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.eclipse.net4j.pop.Module#getDescriptor()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Descriptor();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.PrimaryModule <em>Primary Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Module</em>'.
   * @see org.eclipse.net4j.pop.PrimaryModule
   * @generated
   */
  EClass getPrimaryModule();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.PrimaryModule#getPop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.PrimaryModule#getPop()
   * @see #getPrimaryModule()
   * @generated
   */
  EReference getPrimaryModule_Pop();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.PrimaryModule#getWorkspaceSpecificationPath <em>Workspace Specification Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Workspace Specification Path</em>'.
   * @see org.eclipse.net4j.pop.PrimaryModule#getWorkspaceSpecificationPath()
   * @see #getPrimaryModule()
   * @generated
   */
  EAttribute getPrimaryModule_WorkspaceSpecificationPath();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see org.eclipse.net4j.pop.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Repository#getPop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.Repository#getPop()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Pop();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Repository#getAdapter <em>Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter</em>'.
   * @see org.eclipse.net4j.pop.Repository#getAdapter()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Adapter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Repository#getAdapterType <em>Adapter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter Type</em>'.
   * @see org.eclipse.net4j.pop.Repository#getAdapterType()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_AdapterType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Repository#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.eclipse.net4j.pop.Repository#getDescriptor()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Descriptor();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.net4j.pop.Repository#getMainBranch <em>Main Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Branch</em>'.
   * @see org.eclipse.net4j.pop.Repository#getMainBranch()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_MainBranch();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Developer <em>Developer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Developer</em>'.
   * @see org.eclipse.net4j.pop.Developer
   * @generated
   */
  EClass getDeveloper();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Developer#getPop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.Developer#getPop()
   * @see #getDeveloper()
   * @generated
   */
  EReference getDeveloper_Pop();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#getRepositoryUser <em>Repository User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository User</em>'.
   * @see org.eclipse.net4j.pop.Developer#getRepositoryUser()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_RepositoryUser();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Developer#getName()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see org.eclipse.net4j.pop.Developer#getEmail()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_Email();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry</em>'.
   * @see org.eclipse.net4j.pop.Developer#getEntry()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_Entry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit</em>'.
   * @see org.eclipse.net4j.pop.Developer#getExit()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_Exit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Developer#isActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.eclipse.net4j.pop.Developer#isActive()
   * @see #getDeveloper()
   * @generated
   */
  EAttribute getDeveloper_Active();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Developer#getTaskGroups <em>Task Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Groups</em>'.
   * @see org.eclipse.net4j.pop.Developer#getTaskGroups()
   * @see #getDeveloper()
   * @generated
   */
  EReference getDeveloper_TaskGroups();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Developer#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.eclipse.net4j.pop.Developer#getTasks()
   * @see #getDeveloper()
   * @generated
   */
  EReference getDeveloper_Tasks();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.TaskGroup <em>Task Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Group</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup
   * @generated
   */
  EClass getTaskGroup();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.TaskGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup#getName()
   * @see #getTaskGroup()
   * @generated
   */
  EAttribute getTaskGroup_Name();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.TaskGroup#getDeveloper <em>Developer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Developer</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup#getDeveloper()
   * @see #getTaskGroup()
   * @generated
   */
  EReference getTaskGroup_Developer();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.TaskGroup#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup#getParent()
   * @see #getTaskGroup()
   * @generated
   */
  EReference getTaskGroup_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.TaskGroup#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup#getChildren()
   * @see #getTaskGroup()
   * @generated
   */
  EReference getTaskGroup_Children();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.TaskGroup#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.eclipse.net4j.pop.TaskGroup#getTasks()
   * @see #getTaskGroup()
   * @generated
   */
  EReference getTaskGroup_Tasks();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.eclipse.net4j.pop.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Task#getMylynId <em>Mylyn Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mylyn Id</em>'.
   * @see org.eclipse.net4j.pop.Task#getMylynId()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_MylynId();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Task#getDeveloper <em>Developer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Developer</em>'.
   * @see org.eclipse.net4j.pop.Task#getDeveloper()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Developer();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Task#getTaskGroup <em>Task Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Task Group</em>'.
   * @see org.eclipse.net4j.pop.Task#getTaskGroup()
   * @see #getTask()
   * @generated
   */
  EReference getTask_TaskGroup();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.Task#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Targets</em>'.
   * @see org.eclipse.net4j.pop.Task#getTargets()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Targets();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.CheckoutDiscriminator <em>Checkout Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkout Discriminator</em>'.
   * @see org.eclipse.net4j.pop.CheckoutDiscriminator
   * @generated
   */
  EClass getCheckoutDiscriminator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.CheckoutDiscriminator#getRepositoryTag <em>Repository Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository Tag</em>'.
   * @see org.eclipse.net4j.pop.CheckoutDiscriminator#getRepositoryTag()
   * @see #getCheckoutDiscriminator()
   * @generated
   */
  EAttribute getCheckoutDiscriminator_RepositoryTag();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.CheckoutDiscriminator#getCheckout <em>Checkout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Checkout</em>'.
   * @see org.eclipse.net4j.pop.CheckoutDiscriminator#getCheckout()
   * @see #getCheckoutDiscriminator()
   * @generated
   */
  EReference getCheckoutDiscriminator_Checkout();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see org.eclipse.net4j.pop.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Tag#getBranch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.Tag#getBranch()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Branch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Tag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Tag#getName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Tag#getTaggedElement <em>Tagged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tagged Element</em>'.
   * @see org.eclipse.net4j.pop.Tag#getTaggedElement()
   * @see #getTag()
   * @generated
   */
  EReference getTag_TaggedElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.TaggedElement <em>Tagged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Element</em>'.
   * @see org.eclipse.net4j.pop.TaggedElement
   * @generated
   */
  EClass getTaggedElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.TaggedElement#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tag</em>'.
   * @see org.eclipse.net4j.pop.TaggedElement#getTag()
   * @see #getTaggedElement()
   * @generated
   */
  EReference getTaggedElement_Tag();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Branch#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Branch#getName()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Branch#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.eclipse.net4j.pop.Branch#getBranches()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Branches();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Branch#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see org.eclipse.net4j.pop.Branch#getTags()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Tags();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Branch#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.Branch#getStream()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Stream();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.MainBranch <em>Main Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Branch</em>'.
   * @see org.eclipse.net4j.pop.MainBranch
   * @generated
   */
  EClass getMainBranch();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.MainBranch#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Repository</em>'.
   * @see org.eclipse.net4j.pop.MainBranch#getRepository()
   * @see #getMainBranch()
   * @generated
   */
  EReference getMainBranch_Repository();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.SubBranch <em>Sub Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Branch</em>'.
   * @see org.eclipse.net4j.pop.SubBranch
   * @generated
   */
  EClass getSubBranch();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.SubBranch#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.SubBranch#getParent()
   * @see #getSubBranch()
   * @generated
   */
  EReference getSubBranch_Parent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.SubBranch#getRootTagName <em>Root Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Tag Name</em>'.
   * @see org.eclipse.net4j.pop.SubBranch#getRootTagName()
   * @see #getSubBranch()
   * @generated
   */
  EAttribute getSubBranch_RootTagName();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.SubBranch#getRootTag <em>Root Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Tag</em>'.
   * @see org.eclipse.net4j.pop.SubBranch#getRootTag()
   * @see #getSubBranch()
   * @generated
   */
  EReference getSubBranch_RootTag();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.Stream
   * @generated
   */
  EClass getStream();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Stream#getBranch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Branch</em>'.
   * @see org.eclipse.net4j.pop.Stream#getBranch()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Branch();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Stream#getIntegrations <em>Integrations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integrations</em>'.
   * @see org.eclipse.net4j.pop.Stream#getIntegrations()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Integrations();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.DeliveryStream <em>Delivery Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delivery Stream</em>'.
   * @see org.eclipse.net4j.pop.DeliveryStream
   * @generated
   */
  EClass getDeliveryStream();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.DeliveryStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.DeliveryStream#getParent()
   * @see #getDeliveryStream()
   * @generated
   */
  EReference getDeliveryStream_Parent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.DeliveryStream#getBaseline <em>Baseline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Baseline</em>'.
   * @see org.eclipse.net4j.pop.DeliveryStream#getBaseline()
   * @see #getDeliveryStream()
   * @generated
   */
  EAttribute getDeliveryStream_Baseline();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.DeliveryStream#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.eclipse.net4j.pop.DeliveryStream#getTask()
   * @see #getDeliveryStream()
   * @generated
   */
  EReference getDeliveryStream_Task();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.DeliveryStream#getDeliveries <em>Deliveries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deliveries</em>'.
   * @see org.eclipse.net4j.pop.DeliveryStream#getDeliveries()
   * @see #getDeliveryStream()
   * @generated
   */
  EReference getDeliveryStream_Deliveries();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.IntegrationStream <em>Integration Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integration Stream</em>'.
   * @see org.eclipse.net4j.pop.IntegrationStream
   * @generated
   */
  EClass getIntegrationStream();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.IntegrationStream#getDeliveryStreams <em>Delivery Streams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Delivery Streams</em>'.
   * @see org.eclipse.net4j.pop.IntegrationStream#getDeliveryStreams()
   * @see #getIntegrationStream()
   * @generated
   */
  EReference getIntegrationStream_DeliveryStreams();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.IntegrationStream#getReleases <em>Releases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Releases</em>'.
   * @see org.eclipse.net4j.pop.IntegrationStream#getReleases()
   * @see #getIntegrationStream()
   * @generated
   */
  EReference getIntegrationStream_Releases();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.DevelopmentStream <em>Development Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Development Stream</em>'.
   * @see org.eclipse.net4j.pop.DevelopmentStream
   * @generated
   */
  EClass getDevelopmentStream();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.DevelopmentStream#getMaintenanceStreams <em>Maintenance Streams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maintenance Streams</em>'.
   * @see org.eclipse.net4j.pop.DevelopmentStream#getMaintenanceStreams()
   * @see #getDevelopmentStream()
   * @generated
   */
  EReference getDevelopmentStream_MaintenanceStreams();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.MaintenanceStream <em>Maintenance Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maintenance Stream</em>'.
   * @see org.eclipse.net4j.pop.MaintenanceStream
   * @generated
   */
  EClass getMaintenanceStream();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.MaintenanceStream#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.net4j.pop.MaintenanceStream#getParent()
   * @see #getMaintenanceStream()
   * @generated
   */
  EReference getMaintenanceStream_Parent();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.MaintenanceStream#getBaseline <em>Baseline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Baseline</em>'.
   * @see org.eclipse.net4j.pop.MaintenanceStream#getBaseline()
   * @see #getMaintenanceStream()
   * @generated
   */
  EReference getMaintenanceStream_Baseline();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.RootStream <em>Root Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Stream</em>'.
   * @see org.eclipse.net4j.pop.RootStream
   * @generated
   */
  EClass getRootStream();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.RootStream#getPop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.RootStream#getPop()
   * @see #getRootStream()
   * @generated
   */
  EReference getRootStream_Pop();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see org.eclipse.net4j.pop.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Target#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.Target#getDate()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Date();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.Target#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tasks</em>'.
   * @see org.eclipse.net4j.pop.Target#getTasks()
   * @see #getTarget()
   * @generated
   */
  EReference getTarget_Tasks();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Release <em>Release</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Release</em>'.
   * @see org.eclipse.net4j.pop.Release
   * @generated
   */
  EClass getRelease();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Release#getMaintenance <em>Maintenance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Maintenance</em>'.
   * @see org.eclipse.net4j.pop.Release#getMaintenance()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Maintenance();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Release#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.net4j.pop.Release#getVersion()
   * @see #getRelease()
   * @generated
   */
  EAttribute getRelease_Version();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Release#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.Release#getStream()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Stream();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.Release#getMilestones <em>Milestones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Milestones</em>'.
   * @see org.eclipse.net4j.pop.Release#getMilestones()
   * @see #getRelease()
   * @generated
   */
  EReference getRelease_Milestones();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Milestone</em>'.
   * @see org.eclipse.net4j.pop.Milestone
   * @generated
   */
  EClass getMilestone();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Milestone#getRelease <em>Release</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Release</em>'.
   * @see org.eclipse.net4j.pop.Milestone#getRelease()
   * @see #getMilestone()
   * @generated
   */
  EReference getMilestone_Release();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Milestone#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.net4j.pop.Milestone#getName()
   * @see #getMilestone()
   * @generated
   */
  EAttribute getMilestone_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Delivery <em>Delivery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delivery</em>'.
   * @see org.eclipse.net4j.pop.Delivery
   * @generated
   */
  EClass getDelivery();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Delivery#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.Delivery#getStream()
   * @see #getDelivery()
   * @generated
   */
  EReference getDelivery_Stream();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Delivery#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.eclipse.net4j.pop.Delivery#getNumber()
   * @see #getDelivery()
   * @generated
   */
  EAttribute getDelivery_Number();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Delivery#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.Delivery#getDate()
   * @see #getDelivery()
   * @generated
   */
  EAttribute getDelivery_Date();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.Delivery#getMerges <em>Merges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Merges</em>'.
   * @see org.eclipse.net4j.pop.Delivery#getMerges()
   * @see #getDelivery()
   * @generated
   */
  EReference getDelivery_Merges();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Integration <em>Integration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integration</em>'.
   * @see org.eclipse.net4j.pop.Integration
   * @generated
   */
  EClass getIntegration();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Integration#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stream</em>'.
   * @see org.eclipse.net4j.pop.Integration#getStream()
   * @see #getIntegration()
   * @generated
   */
  EReference getIntegration_Stream();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Integration#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.eclipse.net4j.pop.Integration#getDate()
   * @see #getIntegration()
   * @generated
   */
  EAttribute getIntegration_Date();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Integration#getDelivery <em>Delivery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Delivery</em>'.
   * @see org.eclipse.net4j.pop.Integration#getDelivery()
   * @see #getIntegration()
   * @generated
   */
  EReference getIntegration_Delivery();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.CheckoutManager <em>Checkout Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkout Manager</em>'.
   * @see org.eclipse.net4j.pop.CheckoutManager
   * @generated
   */
  EClass getCheckoutManager();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.net4j.pop.CheckoutManager#getPop <em>Pop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pop</em>'.
   * @see org.eclipse.net4j.pop.CheckoutManager#getPop()
   * @see #getCheckoutManager()
   * @generated
   */
  EReference getCheckoutManager_Pop();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.CheckoutManager#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.net4j.pop.CheckoutManager#getLocation()
   * @see #getCheckoutManager()
   * @generated
   */
  EAttribute getCheckoutManager_Location();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.CheckoutManager#getCheckouts <em>Checkouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Checkouts</em>'.
   * @see org.eclipse.net4j.pop.CheckoutManager#getCheckouts()
   * @see #getCheckoutManager()
   * @generated
   */
  EReference getCheckoutManager_Checkouts();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.CheckoutManager#getActiveCheckout <em>Active Checkout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Active Checkout</em>'.
   * @see org.eclipse.net4j.pop.CheckoutManager#getActiveCheckout()
   * @see #getCheckoutManager()
   * @generated
   */
  EReference getCheckoutManager_ActiveCheckout();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.Checkout <em>Checkout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkout</em>'.
   * @see org.eclipse.net4j.pop.Checkout
   * @generated
   */
  EClass getCheckout();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.Checkout#getManager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Manager</em>'.
   * @see org.eclipse.net4j.pop.Checkout#getManager()
   * @see #getCheckout()
   * @generated
   */
  EReference getCheckout_Manager();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Checkout#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Discriminator</em>'.
   * @see org.eclipse.net4j.pop.Checkout#getDiscriminator()
   * @see #getCheckout()
   * @generated
   */
  EReference getCheckout_Discriminator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Checkout#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.net4j.pop.Checkout#getLocation()
   * @see #getCheckout()
   * @generated
   */
  EAttribute getCheckout_Location();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Checkout#isTransitioning <em>Transitioning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transitioning</em>'.
   * @see org.eclipse.net4j.pop.Checkout#isTransitioning()
   * @see #getCheckout()
   * @generated
   */
  EAttribute getCheckout_Transitioning();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Checkout#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.eclipse.net4j.pop.Checkout#getState()
   * @see #getCheckout()
   * @generated
   */
  EAttribute getCheckout_State();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.net4j.pop.Checkout#isActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.eclipse.net4j.pop.Checkout#isActive()
   * @see #getCheckout()
   * @generated
   */
  EAttribute getCheckout_Active();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Workspace Specification</em>'.
   * @see org.eclipse.net4j.pop.Checkout#getWorkspaceSpecification()
   * @see #getCheckout()
   * @generated
   */
  EReference getCheckout_WorkspaceSpecification();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.WorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workspace Specification</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceSpecification
   * @generated
   */
  EClass getWorkspaceSpecification();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout <em>Checkout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Checkout</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getCheckout()
   * @see #getWorkspaceSpecification()
   * @generated
   */
  EReference getWorkspaceSpecification_Checkout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getSecondaryModules <em>Secondary Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Secondary Modules</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getSecondaryModules()
   * @see #getWorkspaceSpecification()
   * @generated
   */
  EReference getWorkspaceSpecification_SecondaryModules();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.net4j.pop.WorkspaceSpecification#getWorkspaceConfigurators <em>Workspace Configurators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Workspace Configurators</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceSpecification#getWorkspaceConfigurators()
   * @see #getWorkspaceSpecification()
   * @generated
   */
  EReference getWorkspaceSpecification_WorkspaceConfigurators();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.SecondaryModule <em>Secondary Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Secondary Module</em>'.
   * @see org.eclipse.net4j.pop.SecondaryModule
   * @generated
   */
  EClass getSecondaryModule();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Workspace Specification</em>'.
   * @see org.eclipse.net4j.pop.SecondaryModule#getWorkspaceSpecification()
   * @see #getSecondaryModule()
   * @generated
   */
  EReference getSecondaryModule_WorkspaceSpecification();

  /**
   * Returns the meta object for class '{@link org.eclipse.net4j.pop.WorkspaceConfigurator <em>Workspace Configurator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workspace Configurator</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceConfigurator
   * @generated
   */
  EClass getWorkspaceConfigurator();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification <em>Workspace Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Workspace Specification</em>'.
   * @see org.eclipse.net4j.pop.WorkspaceConfigurator#getWorkspaceSpecification()
   * @see #getWorkspaceConfigurator()
   * @generated
   */
  EReference getWorkspaceConfigurator_WorkspaceSpecification();

  /**
   * Returns the meta object for enum '{@link org.eclipse.net4j.pop.CheckoutState <em>Checkout State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Checkout State</em>'.
   * @see org.eclipse.net4j.pop.CheckoutState
   * @generated
   */
  EEnum getCheckoutState();

  /**
   * Returns the meta object for data type '{@link org.eclipse.net4j.pop.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Version</em>'.
   * @see org.eclipse.net4j.pop.Version
   * @model instanceClass="org.eclipse.net4j.pop.Version"
   * @generated
   */
  EDataType getVersion();

  /**
   * Returns the meta object for data type '{@link org.eclipse.core.runtime.IPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Path</em>'.
   * @see org.eclipse.core.runtime.IPath
   * @model instanceClass="org.eclipse.core.runtime.IPath"
   * @generated
   */
  EDataType getPath();

  /**
   * Returns the meta object for data type '{@link org.eclipse.net4j.pop.repository.IRepositoryAdapter <em>Repository Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Repository Adapter</em>'.
   * @see org.eclipse.net4j.pop.repository.IRepositoryAdapter
   * @model instanceClass="org.eclipse.net4j.pop.repository.IRepositoryAdapter"
   * @generated
   */
  EDataType getRepositoryAdapter();

  /**
   * Returns the meta object for data type '{@link org.eclipse.net4j.pop.repository.IRepositorySession <em>Repository Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Repository Session</em>'.
   * @see org.eclipse.net4j.pop.repository.IRepositorySession
   * @model instanceClass="org.eclipse.net4j.pop.repository.IRepositorySession"
   * @generated
   */
  EDataType getRepositorySession();

  /**
   * Returns the meta object for data type '{@link org.eclipse.net4j.pop.repository.IRepositoryFolder <em>Repository Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Repository Folder</em>'.
   * @see org.eclipse.net4j.pop.repository.IRepositoryFolder
   * @model instanceClass="org.eclipse.net4j.pop.repository.IRepositoryFolder"
   * @generated
   */
  EDataType getRepositoryFolder();

  /**
   * Returns the meta object for data type '{@link org.eclipse.net4j.pop.repository.IRepositoryTag <em>Repository Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Repository Tag</em>'.
   * @see org.eclipse.net4j.pop.repository.IRepositoryTag
   * @model instanceClass="org.eclipse.net4j.pop.repository.IRepositoryTag"
   * @generated
   */
  EDataType getRepositoryTag();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PopFactory getPopFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.Identifiable <em>Identifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.Identifiable
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIdentifiable()
     * @generated
     */
    EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.Displayable <em>Displayable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.Displayable
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDisplayable()
     * @generated
     */
    EClass DISPLAYABLE = eINSTANCE.getDisplayable();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.PopElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.PopElementImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPopElement()
     * @generated
     */
    EClass POP_ELEMENT = eINSTANCE.getPopElement();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POP_ELEMENT__CLASS = eINSTANCE.getPopElement_Class();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.PopManager <em>Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.PopManager
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPopManager()
     * @generated
     */
    EClass POP_MANAGER = eINSTANCE.getPopManager();

    /**
     * The meta object literal for the '<em><b>Pops</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP_MANAGER__POPS = eINSTANCE.getPopManager_Pops();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.PopImpl <em>Pop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.PopImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPop()
     * @generated
     */
    EClass POP = eINSTANCE.getPop();

    /**
     * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__MANAGER = eINSTANCE.getPop_Manager();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POP__NAME = eINSTANCE.getPop_Name();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POP__ACTIVE = eINSTANCE.getPop_Active();

    /**
     * The meta object literal for the '<em><b>Developers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__DEVELOPERS = eINSTANCE.getPop_Developers();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__REPOSITORY = eINSTANCE.getPop_Repository();

    /**
     * The meta object literal for the '<em><b>Root Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__ROOT_STREAM = eINSTANCE.getPop_RootStream();

    /**
     * The meta object literal for the '<em><b>Primary Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__PRIMARY_MODULE = eINSTANCE.getPop_PrimaryModule();

    /**
     * The meta object literal for the '<em><b>Checkout Manager</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POP__CHECKOUT_MANAGER = eINSTANCE.getPop_CheckoutManager();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.ModuleImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__DESCRIPTOR = eINSTANCE.getModule_Descriptor();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.PrimaryModuleImpl <em>Primary Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.PrimaryModuleImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPrimaryModule()
     * @generated
     */
    EClass PRIMARY_MODULE = eINSTANCE.getPrimaryModule();

    /**
     * The meta object literal for the '<em><b>Pop</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_MODULE__POP = eINSTANCE.getPrimaryModule_Pop();

    /**
     * The meta object literal for the '<em><b>Workspace Specification Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_MODULE__WORKSPACE_SPECIFICATION_PATH = eINSTANCE.getPrimaryModule_WorkspaceSpecificationPath();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.RepositoryImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Pop</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__POP = eINSTANCE.getRepository_Pop();

    /**
     * The meta object literal for the '<em><b>Adapter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__ADAPTER = eINSTANCE.getRepository_Adapter();

    /**
     * The meta object literal for the '<em><b>Adapter Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__ADAPTER_TYPE = eINSTANCE.getRepository_AdapterType();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__DESCRIPTOR = eINSTANCE.getRepository_Descriptor();

    /**
     * The meta object literal for the '<em><b>Main Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__MAIN_BRANCH = eINSTANCE.getRepository_MainBranch();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.DeveloperImpl <em>Developer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.DeveloperImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDeveloper()
     * @generated
     */
    EClass DEVELOPER = eINSTANCE.getDeveloper();

    /**
     * The meta object literal for the '<em><b>Pop</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPER__POP = eINSTANCE.getDeveloper_Pop();

    /**
     * The meta object literal for the '<em><b>Repository User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__REPOSITORY_USER = eINSTANCE.getDeveloper_RepositoryUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__NAME = eINSTANCE.getDeveloper_Name();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__EMAIL = eINSTANCE.getDeveloper_Email();

    /**
     * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__ENTRY = eINSTANCE.getDeveloper_Entry();

    /**
     * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__EXIT = eINSTANCE.getDeveloper_Exit();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVELOPER__ACTIVE = eINSTANCE.getDeveloper_Active();

    /**
     * The meta object literal for the '<em><b>Task Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPER__TASK_GROUPS = eINSTANCE.getDeveloper_TaskGroups();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPER__TASKS = eINSTANCE.getDeveloper_Tasks();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.TaskGroupImpl <em>Task Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.TaskGroupImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTaskGroup()
     * @generated
     */
    EClass TASK_GROUP = eINSTANCE.getTaskGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_GROUP__NAME = eINSTANCE.getTaskGroup_Name();

    /**
     * The meta object literal for the '<em><b>Developer</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_GROUP__DEVELOPER = eINSTANCE.getTaskGroup_Developer();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_GROUP__PARENT = eINSTANCE.getTaskGroup_Parent();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_GROUP__CHILDREN = eINSTANCE.getTaskGroup_Children();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_GROUP__TASKS = eINSTANCE.getTaskGroup_Tasks();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.TaskImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Mylyn Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__MYLYN_ID = eINSTANCE.getTask_MylynId();

    /**
     * The meta object literal for the '<em><b>Developer</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__DEVELOPER = eINSTANCE.getTask_Developer();

    /**
     * The meta object literal for the '<em><b>Task Group</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__TASK_GROUP = eINSTANCE.getTask_TaskGroup();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__TARGETS = eINSTANCE.getTask_Targets();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl <em>Checkout Discriminator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.CheckoutDiscriminatorImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutDiscriminator()
     * @generated
     */
    EClass CHECKOUT_DISCRIMINATOR = eINSTANCE.getCheckoutDiscriminator();

    /**
     * The meta object literal for the '<em><b>Repository Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT_DISCRIMINATOR__REPOSITORY_TAG = eINSTANCE.getCheckoutDiscriminator_RepositoryTag();

    /**
     * The meta object literal for the '<em><b>Checkout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT_DISCRIMINATOR__CHECKOUT = eINSTANCE.getCheckoutDiscriminator_Checkout();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.TagImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTag()
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__NAME = eINSTANCE.getTag_Name();

    /**
     * The meta object literal for the '<em><b>Tagged Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__TAGGED_ELEMENT = eINSTANCE.getTag_TaggedElement();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.TaggedElementImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTaggedElement()
     * @generated
     */
    EClass TAGGED_ELEMENT = eINSTANCE.getTaggedElement();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAGGED_ELEMENT__TAG = eINSTANCE.getTaggedElement_Tag();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.BranchImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__BRANCHES = eINSTANCE.getBranch_Branches();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__TAGS = eINSTANCE.getBranch_Tags();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__STREAM = eINSTANCE.getBranch_Stream();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.MainBranchImpl <em>Main Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.MainBranchImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMainBranch()
     * @generated
     */
    EClass MAIN_BRANCH = eINSTANCE.getMainBranch();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_BRANCH__REPOSITORY = eINSTANCE.getMainBranch_Repository();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.SubBranchImpl <em>Sub Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.SubBranchImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getSubBranch()
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
     * The meta object literal for the '<em><b>Root Tag Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_BRANCH__ROOT_TAG_NAME = eINSTANCE.getSubBranch_RootTagName();

    /**
     * The meta object literal for the '<em><b>Root Tag</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_BRANCH__ROOT_TAG = eINSTANCE.getSubBranch_RootTag();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.StreamImpl <em>Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.StreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getStream()
     * @generated
     */
    EClass STREAM = eINSTANCE.getStream();

    /**
     * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__BRANCH = eINSTANCE.getStream_Branch();

    /**
     * The meta object literal for the '<em><b>Integrations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__INTEGRATIONS = eINSTANCE.getStream_Integrations();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.DeliveryStreamImpl <em>Delivery Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.DeliveryStreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDeliveryStream()
     * @generated
     */
    EClass DELIVERY_STREAM = eINSTANCE.getDeliveryStream();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELIVERY_STREAM__PARENT = eINSTANCE.getDeliveryStream_Parent();

    /**
     * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELIVERY_STREAM__BASELINE = eINSTANCE.getDeliveryStream_Baseline();

    /**
     * The meta object literal for the '<em><b>Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELIVERY_STREAM__TASK = eINSTANCE.getDeliveryStream_Task();

    /**
     * The meta object literal for the '<em><b>Deliveries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELIVERY_STREAM__DELIVERIES = eINSTANCE.getDeliveryStream_Deliveries();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.IntegrationStreamImpl <em>Integration Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.IntegrationStreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIntegrationStream()
     * @generated
     */
    EClass INTEGRATION_STREAM = eINSTANCE.getIntegrationStream();

    /**
     * The meta object literal for the '<em><b>Delivery Streams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION_STREAM__DELIVERY_STREAMS = eINSTANCE.getIntegrationStream_DeliveryStreams();

    /**
     * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION_STREAM__RELEASES = eINSTANCE.getIntegrationStream_Releases();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.DevelopmentStreamImpl <em>Development Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.DevelopmentStreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDevelopmentStream()
     * @generated
     */
    EClass DEVELOPMENT_STREAM = eINSTANCE.getDevelopmentStream();

    /**
     * The meta object literal for the '<em><b>Maintenance Streams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVELOPMENT_STREAM__MAINTENANCE_STREAMS = eINSTANCE.getDevelopmentStream_MaintenanceStreams();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.MaintenanceStreamImpl <em>Maintenance Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.MaintenanceStreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMaintenanceStream()
     * @generated
     */
    EClass MAINTENANCE_STREAM = eINSTANCE.getMaintenanceStream();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAINTENANCE_STREAM__PARENT = eINSTANCE.getMaintenanceStream_Parent();

    /**
     * The meta object literal for the '<em><b>Baseline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAINTENANCE_STREAM__BASELINE = eINSTANCE.getMaintenanceStream_Baseline();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.RootStreamImpl <em>Root Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.RootStreamImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRootStream()
     * @generated
     */
    EClass ROOT_STREAM = eINSTANCE.getRootStream();

    /**
     * The meta object literal for the '<em><b>Pop</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_STREAM__POP = eINSTANCE.getRootStream_Pop();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.TargetImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__DATE = eINSTANCE.getTarget_Date();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET__TASKS = eINSTANCE.getTarget_Tasks();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.ReleaseImpl <em>Release</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.ReleaseImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRelease()
     * @generated
     */
    EClass RELEASE = eINSTANCE.getRelease();

    /**
     * The meta object literal for the '<em><b>Maintenance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__MAINTENANCE = eINSTANCE.getRelease_Maintenance();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * The meta object literal for the '<em><b>Milestones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELEASE__MILESTONES = eINSTANCE.getRelease_Milestones();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.MilestoneImpl <em>Milestone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.MilestoneImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getMilestone()
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MILESTONE__NAME = eINSTANCE.getMilestone_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.DeliveryImpl <em>Delivery</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.DeliveryImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getDelivery()
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELIVERY__DATE = eINSTANCE.getDelivery_Date();

    /**
     * The meta object literal for the '<em><b>Merges</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELIVERY__MERGES = eINSTANCE.getDelivery_Merges();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.IntegrationImpl <em>Integration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.IntegrationImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getIntegration()
     * @generated
     */
    EClass INTEGRATION = eINSTANCE.getIntegration();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION__STREAM = eINSTANCE.getIntegration_Stream();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGRATION__DATE = eINSTANCE.getIntegration_Date();

    /**
     * The meta object literal for the '<em><b>Delivery</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION__DELIVERY = eINSTANCE.getIntegration_Delivery();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.CheckoutManagerImpl <em>Checkout Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.CheckoutManagerImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutManager()
     * @generated
     */
    EClass CHECKOUT_MANAGER = eINSTANCE.getCheckoutManager();

    /**
     * The meta object literal for the '<em><b>Pop</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT_MANAGER__POP = eINSTANCE.getCheckoutManager_Pop();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT_MANAGER__LOCATION = eINSTANCE.getCheckoutManager_Location();

    /**
     * The meta object literal for the '<em><b>Checkouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT_MANAGER__CHECKOUTS = eINSTANCE.getCheckoutManager_Checkouts();

    /**
     * The meta object literal for the '<em><b>Active Checkout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT_MANAGER__ACTIVE_CHECKOUT = eINSTANCE.getCheckoutManager_ActiveCheckout();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.CheckoutImpl <em>Checkout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.CheckoutImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckout()
     * @generated
     */
    EClass CHECKOUT = eINSTANCE.getCheckout();

    /**
     * The meta object literal for the '<em><b>Manager</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT__MANAGER = eINSTANCE.getCheckout_Manager();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT__DISCRIMINATOR = eINSTANCE.getCheckout_Discriminator();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT__LOCATION = eINSTANCE.getCheckout_Location();

    /**
     * The meta object literal for the '<em><b>Transitioning</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT__TRANSITIONING = eINSTANCE.getCheckout_Transitioning();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT__STATE = eINSTANCE.getCheckout_State();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKOUT__ACTIVE = eINSTANCE.getCheckout_Active();

    /**
     * The meta object literal for the '<em><b>Workspace Specification</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKOUT__WORKSPACE_SPECIFICATION = eINSTANCE.getCheckout_WorkspaceSpecification();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl <em>Workspace Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.WorkspaceSpecificationImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getWorkspaceSpecification()
     * @generated
     */
    EClass WORKSPACE_SPECIFICATION = eINSTANCE.getWorkspaceSpecification();

    /**
     * The meta object literal for the '<em><b>Checkout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_SPECIFICATION__CHECKOUT = eINSTANCE.getWorkspaceSpecification_Checkout();

    /**
     * The meta object literal for the '<em><b>Secondary Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_SPECIFICATION__SECONDARY_MODULES = eINSTANCE.getWorkspaceSpecification_SecondaryModules();

    /**
     * The meta object literal for the '<em><b>Workspace Configurators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_SPECIFICATION__WORKSPACE_CONFIGURATORS = eINSTANCE
        .getWorkspaceSpecification_WorkspaceConfigurators();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.SecondaryModuleImpl <em>Secondary Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.SecondaryModuleImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getSecondaryModule()
     * @generated
     */
    EClass SECONDARY_MODULE = eINSTANCE.getSecondaryModule();

    /**
     * The meta object literal for the '<em><b>Workspace Specification</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECONDARY_MODULE__WORKSPACE_SPECIFICATION = eINSTANCE.getSecondaryModule_WorkspaceSpecification();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.impl.WorkspaceConfiguratorImpl <em>Workspace Configurator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.impl.WorkspaceConfiguratorImpl
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getWorkspaceConfigurator()
     * @generated
     */
    EClass WORKSPACE_CONFIGURATOR = eINSTANCE.getWorkspaceConfigurator();

    /**
     * The meta object literal for the '<em><b>Workspace Specification</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_CONFIGURATOR__WORKSPACE_SPECIFICATION = eINSTANCE
        .getWorkspaceConfigurator_WorkspaceSpecification();

    /**
     * The meta object literal for the '{@link org.eclipse.net4j.pop.CheckoutState <em>Checkout State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.CheckoutState
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getCheckoutState()
     * @generated
     */
    EEnum CHECKOUT_STATE = eINSTANCE.getCheckoutState();

    /**
     * The meta object literal for the '<em>Version</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.Version
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getVersion()
     * @generated
     */
    EDataType VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em>Path</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.runtime.IPath
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getPath()
     * @generated
     */
    EDataType PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em>Repository Adapter</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.repository.IRepositoryAdapter
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryAdapter()
     * @generated
     */
    EDataType REPOSITORY_ADAPTER = eINSTANCE.getRepositoryAdapter();

    /**
     * The meta object literal for the '<em>Repository Session</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.repository.IRepositorySession
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositorySession()
     * @generated
     */
    EDataType REPOSITORY_SESSION = eINSTANCE.getRepositorySession();

    /**
     * The meta object literal for the '<em>Repository Folder</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.repository.IRepositoryFolder
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryFolder()
     * @generated
     */
    EDataType REPOSITORY_FOLDER = eINSTANCE.getRepositoryFolder();

    /**
     * The meta object literal for the '<em>Repository Tag</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.net4j.pop.repository.IRepositoryTag
     * @see org.eclipse.net4j.pop.impl.PopPackageImpl#getRepositoryTag()
     * @generated
     */
    EDataType REPOSITORY_TAG = eINSTANCE.getRepositoryTag();

  }

} //PopPackage
