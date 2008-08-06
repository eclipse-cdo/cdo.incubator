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

import org.eclipse.net4j.internal.pop.util.ModelEvent;
import org.eclipse.net4j.internal.pop.util.ModelManager;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.base.PopElement;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.impl.PopProjectImpl;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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

  private ModelManager modelManager;

  private PopCheckouts checkoutManager = new PopCheckouts(this);

  public Pop(IProject project)
  {
    this.project = project;
    IPath modelPath = project.getFullPath().append("project.xml");
    modelManager = new ModelManager(modelPath)
    {
      @Override
      protected void fireModelEvent(ModelEvent.Kind kind)
      {
        super.fireModelEvent(kind);
        if (kind == ModelEvent.Kind.MODEL_UNAVAILABLE)
        {
          Pop.this.deactivate();
        }
        else
        {
          PopProject popProject = getPopProject();
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
    };

    modelManager.activate();
  }

  public void dispose()
  {
    modelManager.deactivate();
  }

  public IProject getProject()
  {
    return project;
  }

  public PopProject getPopProject()
  {
    Resource resource = getPopResource();
    if (resource == null)
    {
      return null;
    }

    EList<EObject> contents = resource.getContents();
    if (contents.isEmpty())
    {
      return null;
    }

    return (PopProject)contents.get(0);
  }

  public PopElement getPopElement(String id)
  {
    Resource resource = getPopResource();
    if (resource == null)
    {
      return null;
    }

    return (PopElement)resource.getEObject(id);
  }

  public Resource getPopResource()
  {
    ResourceSet resourceSet = modelManager.getResourceSet();
    if (resourceSet == null)
    {
      return null;
    }

    EList<Resource> resources = resourceSet.getResources();
    if (resources.isEmpty())
    {
      return null;
    }

    return resources.get(0);
  }

  public ModelManager getModelManager()
  {
    return modelManager;
  }

  public PopCheckouts getCheckoutManager()
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

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    PopProjectImpl popProject = (PopProjectImpl)getPopProject();
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
    PopProjectImpl popProject = (PopProjectImpl)getPopProject();
    if (popProject != null)
    {
      popProject.setCheckoutManager(null);
    }

    checkoutManager.deactivate();
    super.doDeactivate();
  }
}
