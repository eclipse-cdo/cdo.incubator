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

import org.eclipse.net4j.pop.IModuleManager;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class ModuleManager extends Lifecycle implements IModuleManager
{
  public static final ModuleManager INSTANCE = new ModuleManager();

  private List<Module> elements = new ArrayList<Module>();

  private ModuleManager()
  {
  }

  public Module[] getModules()
  {
    synchronized (elements)
    {
      return elements.toArray(new Module[elements.size()]);
    }
  }
}
