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
 * $Id: WorkspaceProjectImpl.java,v 1.6 2008-08-06 07:07:33 estepper Exp $
 */
package org.eclipse.net4j.pop.product.impl;

import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.product.ProductPackage;
import org.eclipse.net4j.pop.product.WorkingSet;
import org.eclipse.net4j.pop.product.WorkspaceProject;
import org.eclipse.net4j.pop.project.Module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workspace Project</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl#getWorkingSets <em>Working Sets</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl#getWorkspaceSpec <em>Workspace Spec</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl#getModule <em>Module</em>}</li>
 * <li>{@link org.eclipse.net4j.pop.product.impl.WorkspaceProjectImpl#getRepositoryPath <em>Repository Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkspaceProjectImpl extends EObjectImpl implements WorkspaceProject
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWorkingSets() <em>Working Sets</em>}' reference list. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getWorkingSets()
   * @generated
   * @ordered
   */
  protected EList<WorkingSet> workingSets;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected Module module;

  /**
   * The default value of the '{@link #getRepositoryPath() <em>Repository Path</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getRepositoryPath()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryPath() <em>Repository Path</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getRepositoryPath()
   * @generated
   * @ordered
   */
  protected String repositoryPath = REPOSITORY_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected WorkspaceProjectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProductPackage.Literals.WORKSPACE_PROJECT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WORKSPACE_PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<WorkingSet> getWorkingSets()
  {
    if (workingSets == null)
    {
      workingSets = new EObjectWithInverseResolvingEList.ManyInverse<WorkingSet>(WorkingSet.class, this,
          ProductPackage.WORKSPACE_PROJECT__WORKING_SETS, ProductPackage.WORKING_SET__PROJECTS);
    }
    return workingSets;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PopProduct getWorkspaceSpec()
  {
    if (eContainerFeatureID != ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC)
      return null;
    return (PopProduct)eContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetWorkspaceSpec(PopProduct newWorkspaceSpec, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newWorkspaceSpec, ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setWorkspaceSpec(PopProduct newWorkspaceSpec)
  {
    if (newWorkspaceSpec != eInternalContainer()
        || (eContainerFeatureID != ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC && newWorkspaceSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newWorkspaceSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newWorkspaceSpec != null)
        msgs = ((InternalEObject)newWorkspaceSpec).eInverseAdd(this, ProductPackage.POP_PRODUCT__PROJECTS,
            PopProduct.class, msgs);
      msgs = basicSetWorkspaceSpec(newWorkspaceSpec, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC,
          newWorkspaceSpec, newWorkspaceSpec));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Module getModule()
  {
    if (module != null && module.eIsProxy())
    {
      InternalEObject oldModule = (InternalEObject)module;
      module = (Module)eResolveProxy(oldModule);
      if (module != oldModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.WORKSPACE_PROJECT__MODULE,
              oldModule, module));
      }
    }
    return module;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Module basicGetModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setModule(Module newModule)
  {
    Module oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WORKSPACE_PROJECT__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getRepositoryPath()
  {
    return repositoryPath;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setRepositoryPath(String newRepositoryPath)
  {
    String oldRepositoryPath = repositoryPath;
    repositoryPath = newRepositoryPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WORKSPACE_PROJECT__REPOSITORY_PATH,
          oldRepositoryPath, repositoryPath));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkingSets()).basicAdd(otherEnd, msgs);
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetWorkspaceSpec((PopProduct)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      return ((InternalEList<?>)getWorkingSets()).basicRemove(otherEnd, msgs);
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      return basicSetWorkspaceSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      return eInternalContainer().eInverseRemove(this, ProductPackage.POP_PRODUCT__PROJECTS, PopProduct.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__NAME:
      return getName();
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      return getWorkingSets();
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      return getWorkspaceSpec();
    case ProductPackage.WORKSPACE_PROJECT__MODULE:
      if (resolve)
        return getModule();
      return basicGetModule();
    case ProductPackage.WORKSPACE_PROJECT__REPOSITORY_PATH:
      return getRepositoryPath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__NAME:
      setName((String)newValue);
      return;
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      getWorkingSets().clear();
      getWorkingSets().addAll((Collection<? extends WorkingSet>)newValue);
      return;
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      setWorkspaceSpec((PopProduct)newValue);
      return;
    case ProductPackage.WORKSPACE_PROJECT__MODULE:
      setModule((Module)newValue);
      return;
    case ProductPackage.WORKSPACE_PROJECT__REPOSITORY_PATH:
      setRepositoryPath((String)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__NAME:
      setName(NAME_EDEFAULT);
      return;
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      getWorkingSets().clear();
      return;
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      setWorkspaceSpec((PopProduct)null);
      return;
    case ProductPackage.WORKSPACE_PROJECT__MODULE:
      setModule((Module)null);
      return;
    case ProductPackage.WORKSPACE_PROJECT__REPOSITORY_PATH:
      setRepositoryPath(REPOSITORY_PATH_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ProductPackage.WORKSPACE_PROJECT__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case ProductPackage.WORKSPACE_PROJECT__WORKING_SETS:
      return workingSets != null && !workingSets.isEmpty();
    case ProductPackage.WORKSPACE_PROJECT__WORKSPACE_SPEC:
      return getWorkspaceSpec() != null;
    case ProductPackage.WORKSPACE_PROJECT__MODULE:
      return module != null;
    case ProductPackage.WORKSPACE_PROJECT__REPOSITORY_PATH:
      return REPOSITORY_PATH_EDEFAULT == null ? repositoryPath != null : !REPOSITORY_PATH_EDEFAULT
          .equals(repositoryPath);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", repositoryPath: "); //$NON-NLS-1$
    result.append(repositoryPath);
    result.append(')');
    return result.toString();
  }

} // WorkspaceProjectImpl
