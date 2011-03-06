/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.shell;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsole;

/**
 * @author Eike Stepper
 */
public class CDOConsoleFactory implements IConsoleFactory
{
  private final IConsoleManager consoleManager;

  private IOConsole console;

  public CDOConsoleFactory()
  {
    consoleManager = ConsolePlugin.getDefault().getConsoleManager();
  }

  public void openConsole()
  {
    IOConsole console = getConsole();

    IConsole[] existing = consoleManager.getConsoles();
    boolean exists = false;
    for (int i = 0; i < existing.length; i++)
    {
      if (console == existing[i])
      {
        exists = true;
      }
    }

    if (!exists)
    {
      consoleManager.addConsoles(new IConsole[] { console });
    }

    consoleManager.showConsoleView(console);
  }

  private synchronized IOConsole getConsole()
  {
    if (console != null)
    {
      return console;
    }

    console = new CDOConsole(this);
    return console;
  }

  void closeConsole(CDOConsole console)
  {
    synchronized (this)
    {
      if (console != this.console)
      {
        throw new IllegalArgumentException("Wrong console instance!"); //$NON-NLS-1$
      }

      console = null;
    }

    consoleManager.removeConsoles(new IConsole[] { console });
  }
}
