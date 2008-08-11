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
 * $Id: RepositoryStrategy.java,v 1.1 2008-08-11 09:36:04 estepper Exp $
 */
package org.eclipse.net4j.pop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.RepositoryStrategy#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.pop.PopPackage#getRepositoryStrategy()
 * @model
 * @generated
 */
public interface RepositoryStrategy extends PopElement
{
  /**
   * Returns the value of the '<em><b>Repository</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.net4j.pop.Repository#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' container reference.
   * @see #setRepository(Repository)
   * @see org.eclipse.net4j.pop.PopPackage#getRepositoryStrategy_Repository()
   * @see org.eclipse.net4j.pop.Repository#getStrategy
   * @model opposite="strategy" required="true" transient="false"
   * @generated
   */
  Repository getRepository();

  /**
   * Sets the value of the '{@link org.eclipse.net4j.pop.RepositoryStrategy#getRepository <em>Repository</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' container reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(Repository value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" streamRequired="true"
   * @generated
   */
  Branch createBranch(DevelopmentStream stream);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" streamRequired="true"
   * @generated
   */
  Branch createBranch(MaintenanceStream stream);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" streamRequired="true"
   * @generated
   */
  Branch createBranch(DeliveryStream stream);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" branchRequired="true"
   * @generated
   */
  Tag createRootTag(Branch branch);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" deliveryRequired="true"
   * @generated
   */
  Tag createTag(Delivery delivery);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" integrationRequired="true"
   * @generated
   */
  Tag createTag(Integration integration);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" releaseRequired="true"
   * @generated
   */
  Tag createTag(Release release);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" milestoneRequired="true"
   * @generated
   */
  Tag createTag(Milestone milestone);

} // RepositoryStrategy
