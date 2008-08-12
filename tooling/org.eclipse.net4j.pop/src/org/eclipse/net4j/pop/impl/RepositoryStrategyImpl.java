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
 * $Id: RepositoryStrategyImpl.java,v 1.3 2008-08-12 07:31:40 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.pop.Branch;
import org.eclipse.net4j.pop.Delivery;
import org.eclipse.net4j.pop.DeliveryStream;
import org.eclipse.net4j.pop.DevelopmentStream;
import org.eclipse.net4j.pop.Integration;
import org.eclipse.net4j.pop.MainBranch;
import org.eclipse.net4j.pop.MaintenanceStream;
import org.eclipse.net4j.pop.Milestone;
import org.eclipse.net4j.pop.PopFactory;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.Release;
import org.eclipse.net4j.pop.Repository;
import org.eclipse.net4j.pop.RepositoryStrategy;
import org.eclipse.net4j.pop.SubBranch;
import org.eclipse.net4j.pop.Tag;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository Strategy</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.RepositoryStrategyImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryStrategyImpl extends PopElementImpl implements RepositoryStrategy
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryStrategyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PopPackage.Literals.REPOSITORY_STRATEGY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Repository getRepository()
  {
    if (eContainerFeatureID != PopPackage.REPOSITORY_STRATEGY__REPOSITORY)
      return null;
    return (Repository)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Repository basicGetRepository()
  {
    if (eContainerFeatureID != PopPackage.REPOSITORY_STRATEGY__REPOSITORY)
      return null;
    return (Repository)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newRepository, PopPackage.REPOSITORY_STRATEGY__REPOSITORY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(Repository newRepository)
  {
    if (newRepository != eInternalContainer()
        || (eContainerFeatureID != PopPackage.REPOSITORY_STRATEGY__REPOSITORY && newRepository != null))
    {
      if (EcoreUtil.isAncestor(this, newRepository))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRepository != null)
        msgs = ((InternalEObject)newRepository).eInverseAdd(this, PopPackage.REPOSITORY__STRATEGY, Repository.class,
            msgs);
      msgs = basicSetRepository(newRepository, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PopPackage.REPOSITORY_STRATEGY__REPOSITORY, newRepository,
          newRepository));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Branch createBranch(DevelopmentStream stream)
  {
    Repository repository = getRepository();
    if (repository == null || stream == null)
    {
      return null;
    }

    MainBranch mainBranch = repository.getMainBranch();
    if (mainBranch == null)
    {
      mainBranch = PopFactory.eINSTANCE.createMainBranch();
      mainBranch.setName(getMainBranchName());
    }

    stream.setBranch(mainBranch);
    return mainBranch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Branch createBranch(MaintenanceStream stream)
  {
    Repository repository = getRepository();
    if (repository == null || stream == null)
    {
      return null;
    }

    Release baseline = stream.getBaseline();
    Tag baselineTag = baseline.getTag();
    String branchName = getMaintenanceBranchName(baseline);
    return createSubBranch(baselineTag.getBranch(), branchName);
    // Tag rootTag = branch.getTag();
    // Checkout checkout = rootTag.checkout();
    //
    // IRepositoryAdapter adapter = repository.getAdapter();
    // IContainer localRoot = checkout.asProject();
    // IRepositorySession session = adapter.openSession(repository.getDescriptor(), localRoot, true,
    // new NullProgressMonitor());
    // session.branch(branch.getName(), rootTag.getName(), new NullProgressMonitor());
    // return branch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Branch createBranch(DeliveryStream stream)
  {
    Repository repository = getRepository();
    if (repository == null || stream == null)
    {
      return null;
    }

    Date baseline = stream.getBaseline();
    Tag baselineTag = baseline.getTag();
    String branchName = getMaintenanceBranchName(baseline);
    return createSubBranch(baselineTag.getBranch(), branchName);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag createRootTag(Branch branch)
  {
    Repository repository = getRepository();
    if (repository == null || branch == null)
    {
      return null;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag createTag(Delivery delivery)
  {
    Repository repository = getRepository();
    if (repository == null || delivery == null)
    {
      return null;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag createTag(Integration integration)
  {
    Repository repository = getRepository();
    if (repository == null || integration == null)
    {
      return null;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag createTag(Release release)
  {
    Repository repository = getRepository();
    if (repository == null || release == null)
    {
      return null;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Tag createTag(Milestone milestone)
  {
    Repository repository = getRepository();
    if (repository == null || milestone == null)
    {
      return null;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetRepository((Repository)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      return basicSetRepository(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      return eInternalContainer().eInverseRemove(this, PopPackage.REPOSITORY__STRATEGY, Repository.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      if (resolve)
        return getRepository();
      return basicGetRepository();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      setRepository((Repository)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      setRepository((Repository)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case PopPackage.REPOSITORY_STRATEGY__REPOSITORY:
      return basicGetRepository() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  protected SubBranch createSubBranch(Branch parent, String branchName)
  {
    SubBranch branch = PopFactory.eINSTANCE.createSubBranch();
    branch.setParent(parent);
    branch.setName(branchName);

    Tag rootTag = PopFactory.eINSTANCE.createTag();
    rootTag.setName(getRootTagName(branchName));
    rootTag.setBranch(branch);
    return branch;
  }

  /**
   * @ADDED
   */
  protected String getRootTagName(String branchName)
  {
    return "Root_" + branchName;
  }

  /**
   * @ADDED
   */
  protected String getMainBranchName()
  {
    String branchName = "HEAD";
    Repository repository = getRepository();
    if (repository != null)
    {
      IRepositoryAdapter adapter = repository.getAdapter();
      if (adapter != null)
      {
        branchName = adapter.getDefaultMainBranchName();
      }
    }

    return branchName;
  }

  /**
   * @ADDED
   */
  protected String getMaintenanceBranchName(Release baseline)
  {
    return "R_" + baseline.getVersion().asId() + "_maintenance";
  }

} // RepositoryStrategyImpl
