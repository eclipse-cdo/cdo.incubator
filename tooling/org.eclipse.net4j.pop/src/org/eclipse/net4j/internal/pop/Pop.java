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
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

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
          Pop.this.activate();
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
    EList<Resource> resources = modelManager.getResourceSet().getResources();
    if (resources.isEmpty())
    {
      return null;
    }

    EList<EObject> contents = resources.get(0).getContents();
    if (contents.isEmpty())
    {
      return null;
    }

    return (PopProject)contents.get(0);
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
}
