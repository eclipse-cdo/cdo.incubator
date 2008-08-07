/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.internal.pop.checkout.CheckoutManager;
import org.eclipse.net4j.internal.pop.model.ModelEvent;
import org.eclipse.net4j.internal.pop.model.ModelManager;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.model.IModelManager;
import org.eclipse.net4j.pop.product.PopProduct;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.impl.PopProjectImpl;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class Pop extends Lifecycle implements IPop
{
  private IProject project;

  private ResourceSet resourceSet;

  private ProjectModelManager projectModelManager;

  private ProductModelManager productModelManager;

  private CheckoutManager checkoutManager = new CheckoutManager(this);

  public Pop(IProject project)
  {
    this.project = project;
    resourceSet = ModelManager.createResourceSet();

    IPath modelPath = project.getFullPath().append("project.xml");
    projectModelManager = new ProjectModelManager(modelPath);
    projectModelManager.activate();
  }

  public void dispose()
  {
    projectModelManager.deactivate();
  }

  public IProject getProject()
  {
    return project;
  }

  public ResourceSet getResourceSet()
  {
    return resourceSet;
  }

  public PopProject getProjectModel()
  {
    return projectModelManager.getModel();
  }

  public PopProduct getProductModel()
  {
    return productModelManager.getModel();
  }

  public IModelManager<PopProject> getProjectModelManager()
  {
    return projectModelManager;
  }

  public IModelManager<PopProduct> getProductModelManager()
  {
    return productModelManager;
  }

  public CheckoutManager getCheckoutManager()
  {
    return checkoutManager;
  }

  public int compareTo(IPop o)
  {
    return StringUtil.compare(project.getName(), o.getProject().getName());
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == this)
    {
      return true;
    }

    if (obj instanceof Pop)
    {
      Pop that = (Pop)obj;
      return ObjectUtil.equals(project, that.project);
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(project);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("POP[{0}]", project.getName());
  }

  protected void handleProjectModelEvent(ModelEvent.Kind kind)
  {
    if (kind == ModelEvent.Kind.MODEL_UNAVAILABLE)
    {
      deactivate();
    }
    else
    {
      PopProject popProject = getProjectModel();
      if (!StringUtil.isEmpty(popProject.getName()))
      {
        activate();
      }
      else
      {
        deactivate();
      }
    }
  }

  protected void handleProductModelEvent(ModelEvent.Kind kind)
  {
    if (kind == ModelEvent.Kind.MODEL_UNAVAILABLE)
    {
      Pop.this.deactivate();
    }
    else
    {
      PopProject popProject = getProjectModel();
      if (!StringUtil.isEmpty(popProject.getName()))
      {
        Pop.this.activate();
      }
      else
      {
        Pop.this.deactivate();
      }
    }
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    PopProjectImpl popProject = (PopProjectImpl)getProjectModel();
    if (popProject == null)
    {
      throw new IllegalStateException("POP project not available");
    }

    checkoutManager.activate();
    popProject.setCheckoutManager(checkoutManager);
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    PopProjectImpl popProject = (PopProjectImpl)getProjectModel();
    if (popProject != null)
    {
      popProject.setCheckoutManager(null);
    }

    checkoutManager.deactivate();
    super.doDeactivate();
  }

  /**
   * @author Eike Stepper
   */
  private final class ProjectModelManager extends ModelManager<PopProject>
  {
    public ProjectModelManager(IPath modelEntry)
    {
      super(modelEntry, resourceSet);
    }

    @Override
    protected void fireModelEvent(ModelEvent.Kind kind)
    {
      super.fireModelEvent(kind);
      handleProjectModelEvent(kind);
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class ProductModelManager extends ModelManager<PopProduct>
  {
    public ProductModelManager(IPath modelEntry)
    {
      super(modelEntry, resourceSet);
    }

    @Override
    protected void fireModelEvent(ModelEvent.Kind kind)
    {
      super.fireModelEvent(kind);
      handleProductModelEvent(kind);
    }
  }
}
