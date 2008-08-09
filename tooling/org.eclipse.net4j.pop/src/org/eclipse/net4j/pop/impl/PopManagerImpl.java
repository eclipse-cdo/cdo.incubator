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
 * $Id: PopManagerImpl.java,v 1.1 2008-08-09 09:26:22 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.natures.NatureManager;
import org.eclipse.net4j.internal.pop.natures.PopProjectNature;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.model.IModelRegistration;
import org.eclipse.net4j.pop.model.ModelManager;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleException;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.net4j.pop.impl.PopManagerImpl#getPops <em>Pops</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PopManagerImpl extends PopElementImpl implements PopManager, ILifecycle
{
  /**
   * @ADDED
   */
  public static final PopManagerImpl INSTANCE = new PopManagerImpl(true);

  /**
   * @ADDED
   */
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, PopManagerImpl.class);

  /**
   * The cached value of the '{@link #getPops() <em>Pops</em>}' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getPops()
   * @generated
   * @ordered
   */
  protected EList<Pop> pops;

  /**
   * @ADDED
   */
  private Map<IProject, Pop> _pops = new HashMap<IProject, Pop>();

  /**
   * @ADDED
   */
  private ModelManager modelManager = new ModelManager();

  /**
   * @ADDED
   */
  private NatureManager projectNatures = new ProjectNatures();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PopManagerImpl()
  {
    super();
  }

  /**
   * @ADDED
   */
  private PopManagerImpl(boolean dummy)
  {
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PopPackage.Literals.POP_MANAGER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Pop> getPops()
  {
    if (pops == null)
    {
      pops = new EObjectContainmentWithInverseEList.Resolving<Pop>(Pop.class, this, PopPackage.POP_MANAGER__POPS,
          PopPackage.POP__POP_MANAGER);
    }
    return pops;
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
    case PopPackage.POP_MANAGER__POPS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getPops()).basicAdd(otherEnd, msgs);
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
    case PopPackage.POP_MANAGER__POPS:
      return ((InternalEList<?>)getPops()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  public void addPop(IProject project)
  {
    PopImpl pop = new PopImpl();
    synchronized (pops)
    {
      if (pops.containsKey(project))
      {
        throw new IllegalStateException("Duplicate  ID: " + project);
      }

      pops.put(project, project2);
    }

    if (TRACER.isEnabled())
    {
      TRACER.trace("Added POP: " + project2);
    }

    if (isActive())
    {
      fireElementAddedEvent(project2);
    }
  }

  public Pop removePop(IProject project)
  {
    Pop pop = null;
    synchronized (pops)
    {
      pop = pops.remove(project);
    }

    if (pop != null)
    {
      pop.dispose();
      if (TRACER.isEnabled())
      {
        TRACER.trace("Removed POP: " + pop);
      }

      if (isActive())
      {
        fireElementRemovedEvent(pop);
      }

      return pop;
    }

    return null;
  }

  public Pop getPop(String name)
  {
    checkActive();
    synchronized (pops)
    {
      return pops.get(name);
    }
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
    case PopPackage.POP_MANAGER__POPS:
      return getPops();
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
    case PopPackage.POP_MANAGER__POPS:
      getPops().clear();
      getPops().addAll((Collection<? extends Pop>)newValue);
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
    case PopPackage.POP_MANAGER__POPS:
      getPops().clear();
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
    case PopPackage.POP_MANAGER__POPS:
      return pops != null && !pops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  public void activate() throws LifecycleException
  {
    modelManager.activate();
    projectNatures.activate();
  }

  public Exception deactivate()
  {
    projectNatures.deactivate();
    modelManager.deactivate();
    return null;
  }

  private final class ProjectNatures extends NatureManager
  {
    private Map<URI, IModelRegistration<Pop>> registrations = new HashMap<URI, IModelRegistration<Pop>>();

    public ProjectNatures()
    {
      super(PopProjectNature.NATURE_ID);
    }

    @Override
    protected void projectAdded(IProject project)
    {
      try
      {
        super.projectAdded(project);
        URI uri = getModelURI(project);
        addPop(project);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }

    protected URI getModelURI(IProject project)
    {
      return URI.createPlatformResourceURI(getModelPath(project).toString(), false);
    }

    protected IPath getModelPath(IProject project)
    {
      return null;
    }

    @Override
    protected void projectRemoved(IProject project)
    {
      try
      {
        super.projectRemoved(project);
        removePop(project);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }
  }

} // PopManagerImpl
