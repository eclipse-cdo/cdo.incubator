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
 * $Id: PopManagerImpl.java,v 1.14 2008-08-11 09:36:04 estepper Exp $
 */
package org.eclipse.net4j.pop.impl;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.model.ModelManager;
import org.eclipse.net4j.internal.pop.model.ModelRegistrar;
import org.eclipse.net4j.internal.pop.natures.PopProjectNature;
import org.eclipse.net4j.internal.pop.util.EMFUtil;
import org.eclipse.net4j.pop.Pop;
import org.eclipse.net4j.pop.PopManager;
import org.eclipse.net4j.pop.PopPackage;
import org.eclipse.net4j.pop.model.IModelHandler;
import org.eclipse.net4j.pop.model.IModelManager;
import org.eclipse.net4j.pop.model.IModelRegistration;
import org.eclipse.net4j.pop.model.ModelHandler;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.lifecycle.LifecycleException;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.pop.impl.PopManagerImpl#getPops <em>Pops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopManagerImpl extends PopElementImpl implements PopManager
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
   * The cached value of the '{@link #getPops() <em>Pops</em>}' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPops()
   * @generated
   * @ordered
   */
  protected EList<Pop> pops;

  /**
   * @ADDED
   */
  private ModelManager modelManager = new ModelManager();

  /**
   * @ADDED
   */
  private IModelHandler<Pop> popHandler = new PopHandler();

  /**
   * @ADDED
   */
  private ModelRegistrar.NatureBased<Pop> popRegistrar = new ModelRegistrar.NatureBased<Pop>(modelManager, popHandler,
      PopProjectNature.NATURE_ID, "project.xml");

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PopPackage.Literals.POP_MANAGER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pop createPop(String name, String repositoryStrategyType, String repositoryAdapterType,
      String repositoryDescriptor)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * @ADDED
   */
  public IModelManager getModelManager()
  {
    return modelManager;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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

  /**
   * @ADDED
   */
  public void activate() throws LifecycleException
  {
    modelManager.activate();
    popRegistrar.activate();
  }

  /**
   * @ADDED
   */
  public Exception deactivate()
  {
    popRegistrar.deactivate();
    modelManager.deactivate();
    return null;
  }

  /**
   * @author Eike Stepper
   * @ADDED
   */
  private final class PopHandler extends ModelHandler<Pop>
  {
    public PopHandler()
    {
    }

    @Override
    public String toString()
    {
      return "PopHandler";
    }

    @Override
    protected void modelAvailable(IModelRegistration<Pop> registration)
    {
      if (TRACER.isEnabled())
      {
        TRACER.format("Adding pop: {0}", registration.getModelResource());
      }

      Pop pop = registration.getModel();
      getPops().add(pop);
    }

    @Override
    protected void modelRefreshed(IModelRegistration<Pop> registration)
    {
      URI uri = registration.getModelResource().getURI();
      int index = indexOf(uri);
      if (index != -1)
      {
        if (TRACER.isEnabled())
        {
          TRACER.format("Replacing pop: {0}", registration.getModelResource());
        }

        Pop pop = registration.getModel();
        getPops().set(index, pop);
      }
    }

    @Override
    protected void modelUnavailable(IModelRegistration<Pop> registration)
    {
      URI uri = registration.getModelResource().getURI();
      int index = indexOf(uri);
      if (index != -1)
      {
        if (TRACER.isEnabled())
        {
          TRACER.format("Removing pop: {0}", registration.getModelResource());
        }

        getPops().remove(index);
      }
    }

    private int indexOf(URI uri)
    {
      int index = 0;
      for (Pop pop : getPops())
      {
        URI resourceURI = EMFUtil.getResourceURI(pop);
        if (ObjectUtil.equals(resourceURI, uri))
        {
          return index;
        }

        ++index;
      }

      return -1;
    }
  }

} // PopManagerImpl
