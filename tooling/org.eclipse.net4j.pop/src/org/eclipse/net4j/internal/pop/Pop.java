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

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class Pop extends Lifecycle implements IPop
{
  private IProject project;

  private String name;

  private PopProject popProject;

  private Set<IPath> projectFiles = new HashSet<IPath>();

  public Pop(IProject project)
  {
    this.project = project;
  }

  public IProject getProject()
  {
    return project;
  }

  public String getName()
  {
    if (name == null)
    {
      refresh();
    }

    return name;
  }

  public PopProject getPopProject()
  {
    if (popProject == null)
    {
      refresh();
    }

    return popProject;
  }

  public int compareTo(IPop o)
  {
    return StringUtil.compare(name, o.getName());
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
      return ObjectUtil.equals(name, that.name);
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    return ObjectUtil.hashCode(name);
  }

  @Override
  public String toString()
  {
    return getName();
  }

  private void refresh()
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    Map<String, Object> map = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    map.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

    IFile file = project.getFile("project.xml");
    if (file.exists())
    {
      URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
      Resource resource = resourceSet.getResource(uri, true);
    }
  }
}
