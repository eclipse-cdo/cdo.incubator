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

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.internal.pop.natures.Nature;
import org.eclipse.net4j.internal.pop.natures.NatureManager;
import org.eclipse.net4j.internal.pop.natures.PopProductNature;
import org.eclipse.net4j.internal.pop.natures.PopProjectNature;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.IPopManager;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class PopManager extends Container<IPop> implements IPopManager
{
  public static final PopManager INSTANCE = new PopManager();

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, Nature.class);

  private NatureManager projectNatures = new ProjectNatures();

  private NatureManager productNatures = new NatureManager(PopProductNature.NATURE_ID);

  private Map<IProject, Pop> pops = new HashMap<IProject, Pop>();

  private IPath checkoutLocation;

  private PopManager()
  {
    IPath root = ResourcesPlugin.getWorkspace().getRoot().getLocation();
    checkoutLocation = root.removeLastSegments(1).append("checkouts");
  }

  public void addPop(IPop pop)
  {
    IProject project = pop.getProject();
    synchronized (pops)
    {
      if (pops.containsKey(project))
      {
        throw new IllegalStateException("Duplicate  ID: " + project);
      }

      pops.put(project, (Pop)pop);
    }

    if (TRACER.isEnabled())
    {
      TRACER.trace("Added POP: " + pop);
    }

    if (isActive())
    {
      fireElementAddedEvent(pop);
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

  public Pop[] getPops()
  {
    checkActive();
    synchronized (pops)
    {
      List<Pop> list = new ArrayList<Pop>(pops.values());
      Collections.sort(list);
      return list.toArray(new Pop[list.size()]);
    }
  }

  public Pop[] getElements()
  {
    return getPops();
  }

  public IPath getCheckoutLocation()
  {
    return checkoutLocation;
  }

  public void setCheckoutLocation(IPath checkoutLocation)
  {
    this.checkoutLocation = checkoutLocation;
    for (Pop pop : getPops())
    {
      pop.getCheckoutManager().checkoutLocationChanged();
    }
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    projectNatures.activate();
    productNatures.activate();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    productNatures.deactivate();
    projectNatures.deactivate();
    pops.clear();
    super.doDeactivate();
  }

  protected void projectNatureAdded(IProject project)
  {
    addPop(new Pop(project));
  }

  protected void projectNatureRemoved(IProject project)
  {
    removePop(project);
  }

  /**
   * @author Eike Stepper
   */
  private final class ProjectNatures extends NatureManager
  {
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
        projectNatureAdded(project);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }

    @Override
    protected void projectRemoved(IProject project)
    {
      try
      {
        super.projectRemoved(project);
        projectNatureRemoved(project);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }
  }
}
