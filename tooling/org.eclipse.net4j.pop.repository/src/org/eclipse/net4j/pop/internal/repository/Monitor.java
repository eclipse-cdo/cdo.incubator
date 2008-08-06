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
package org.eclipse.net4j.pop.internal.repository;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * @author Eike Stepper
 */
/**
 * @author Eike Stepper
 */
public final class Monitor
{
  private Monitor()
  {
  }

  public static void checkCanceled(IProgressMonitor monitor)
  {
    if (monitor.isCanceled())
    {
      throw new OperationCanceledException();
    }
  }

  public static IProgressMonitor monitorFor(IProgressMonitor monitor)
  {
    if (monitor == null)
    {
      return new NullProgressMonitor();
    }

    return monitor;
  }

  public static IProgressMonitor subMonitorFor(IProgressMonitor monitor, int ticks)
  {
    if (monitor == null)
    {
      return new NullProgressMonitor();
    }

    if (monitor instanceof NullProgressMonitor)
    {
      return monitor;
    }

    return new SubProgressMonitor(monitor, ticks);
  }

  public static IProgressMonitor infiniteSubMonitorFor(IProgressMonitor monitor, int ticks)
  {
    if (monitor == null)
    {
      return new NullProgressMonitor();
    }

    if (monitor instanceof NullProgressMonitor)
    {
      return monitor;
    }

    return new InfiniteSubProgressMonitor(monitor, ticks);
  }

  /**
   * @author Eike Stepper
   */
  // See org.eclipse.team.internal.core.InfiniteSubProgressMonitor
  public static class InfiniteSubProgressMonitor extends SubProgressMonitor
  {
    private int totalWork;

    private int halfWay;

    private int currentIncrement;

    private int nextProgress;

    private int worked;

    public InfiniteSubProgressMonitor(IProgressMonitor monitor, int ticks)
    {
      this(monitor, ticks, 0);
    }

    public InfiniteSubProgressMonitor(IProgressMonitor monitor, int ticks, int style)
    {
      super(monitor, ticks, style);
    }

    @Override
    public void beginTask(String name, int totalWork)
    {
      super.beginTask(name, totalWork);
      this.totalWork = totalWork;
      halfWay = totalWork / 2;
      currentIncrement = 1;
      nextProgress = currentIncrement;
      worked = 0;
    }

    @Override
    public void worked(int work)
    {
      if (worked >= totalWork)
      {
        return;
      }

      if (--nextProgress <= 0)
      {
        super.worked(1);
        worked++;
        if (worked >= halfWay)
        {
          // we have passed the current halfway point, so double the
          // increment and reset the halfway point.
          currentIncrement *= 2;
          halfWay += (totalWork - halfWay) / 2;
        }

        // reset the progress counter to another full increment
        nextProgress = currentIncrement;
      }
    }

    /**
     * Don't allow clearing of the subtask. This will stop the flickering of the subtask in the progress dialogs.
     * 
     * @see IProgressMonitor#subTask(String)
     */
    @Override
    public void subTask(String name)
    {
      if (name != null && !name.equals("")) //$NON-NLS-1$
      {
        super.subTask(name);
      }
    }
  }
}
