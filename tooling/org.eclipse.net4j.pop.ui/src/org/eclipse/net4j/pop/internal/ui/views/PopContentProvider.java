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
package org.eclipse.net4j.pop.internal.ui.views;

import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IPopManager;
import org.eclipse.net4j.pop.internal.ui.bundle.OM;
import org.eclipse.net4j.pop.project.IntegrationStream;
import org.eclipse.net4j.pop.project.Milestone;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.Release;
import org.eclipse.net4j.pop.project.RootStream;
import org.eclipse.net4j.pop.project.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import org.eclipse.jface.viewers.Viewer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class PopContentProvider extends AdapterFactoryContentProvider
{
  protected Object input;

  public PopContentProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  @Override
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
  {
    if (!checkInput(newInput))
    {
      RuntimeException ex = new IllegalArgumentException("input: " + newInput);
      OM.LOG.error(ex);
      throw ex;
    }

    super.inputChanged(viewer, oldInput, newInput);
    input = newInput;
  }

  @Override
  public Object[] getElements(Object object)
  {
    return getChildren(object);
  }

  @Override
  public boolean hasChildren(Object object)
  {
    return getChildren(object).length != 0;
  }

  @Override
  public Object[] getChildren(Object object)
  {
    if (object instanceof IPopManager)
    {
      IPopManager manager = (IPopManager)object;
      List<Object> result = new ArrayList<Object>();
      for (IPop pop : manager.getPops())
      {
        PopProject popProject = pop.getPopProject();
        if (popProject != null)
        {
          result.add(popProject);
        }
      }

      return result.toArray(new Object[result.size()]);
    }

    return super.getChildren(object);
  }

  @Override
  public final Object getParent(Object object)
  {
    if (object == input)
    {
      return null;
    }

    return doGetParent(object);
  }

  protected Object doGetParent(Object object)
  {
    if (object instanceof PopProject)
    {
      return input;
    }

    return super.getParent(object);
  }

  protected boolean checkInput(Object input)
  {
    return true;
  }

  /**
   * @author Eike Stepper
   */
  public static class Streams extends PopContentProvider
  {
    public Streams(AdapterFactory adapterFactory)
    {
      super(adapterFactory);
    }

    @Override
    protected boolean checkInput(Object input)
    {
      return input instanceof IPopManager;
    }

    @Override
    public Object[] getChildren(Object object)
    {
      if (object instanceof IPopManager)
      {
        IPopManager manager = (IPopManager)object;
        List<Object> result = new ArrayList<Object>();
        for (IPop pop : manager.getPops())
        {
          PopProject popProject = pop.getPopProject();
          if (popProject != null)
          {
            RootStream rootStream = popProject.getRootStream();
            if (rootStream != null)
            {
              result.add(rootStream);
            }
          }
        }

        return result.toArray(new Object[result.size()]);
      }

      if (object instanceof Stream)
      {
        Stream stream = (Stream)object;
        EList<Stream> streams = stream.getStreams();
        return streams.toArray(new Object[streams.size()]);
      }

      return new Object[0];
    }

    @Override
    protected Object doGetParent(Object object)
    {
      if (object instanceof RootStream)
      {
        return input;
      }

      if (object instanceof Stream)
      {
        Stream stream = (Stream)object;
        return stream.getParent();
      }

      return super.doGetParent(object);
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Targets extends PopContentProvider
  {
    public Targets(AdapterFactory adapterFactory)
    {
      super(adapterFactory);
    }

    @Override
    protected boolean checkInput(Object input)
    {
      return input instanceof Stream;
    }

    @Override
    public Object[] getChildren(Object object)
    {
      if (object instanceof IntegrationStream)
      {
        IntegrationStream stream = (IntegrationStream)object;
        EList<Release> releases = stream.getReleases();
        return releases.toArray(new Object[releases.size()]);
      }

      if (object instanceof Release)
      {
        Release release = (Release)object;
        EList<Milestone> milestones = release.getMilestones();
        return milestones.toArray(new Object[milestones.size()]);
      }

      return new Object[0];
    }

    @Override
    protected Object doGetParent(Object object)
    {
      if (object instanceof Milestone)
      {
        Milestone milestone = (Milestone)object;
        return milestone.getRelease();
      }

      if (object instanceof Release)
      {
        Release release = (Release)object;
        return release.getStream();
      }

      return null;
    }
  }
}
