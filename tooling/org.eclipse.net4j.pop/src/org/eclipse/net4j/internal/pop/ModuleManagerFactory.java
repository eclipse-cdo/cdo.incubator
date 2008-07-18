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

import org.eclipse.net4j.util.WrappedException;

/**
 * @author Eike Stepper
 */
public final class ModuleManagerFactory
{
  public static final String SYSTEM_PROPERTY = "org.eclipse.net4j.pop.IModuleManager";

  public static final String DEFAULT_CLASS = "org.eclipse.net4j.internal.pop.ModuleManager";

  private static Object moduleManager;

  private static boolean used;

  private ModuleManagerFactory()
  {
  }

  public static Object get()
  {
    checkUsage();
    if (moduleManager == null)
    {
      create();
    }

    used = true;
    return moduleManager;
  }

  public void set(Object moduleManager)
  {
    checkUsage();
    ModuleManagerFactory.moduleManager = moduleManager;
  }

  private static void create()
  {
    try
    {
      String className = System.getProperty(SYSTEM_PROPERTY, DEFAULT_CLASS);
      Class<?> c = Class.forName(className);
      moduleManager = c.newInstance();
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  private static void checkUsage()
  {
    if (used)
    {
      throw new IllegalStateException("ModuleManager already in use");
    }
  }
}
