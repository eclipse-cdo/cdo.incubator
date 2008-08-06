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

import org.eclipse.net4j.pop.internal.repository.bundle.OM;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter.Registry;
import org.eclipse.net4j.util.registry.HashMapRegistry;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * @author Eike Stepper
 */
public class RepositoryAdapterRegistry extends HashMapRegistry<String, IRepositoryAdapter> implements Registry
{
  public static final RepositoryAdapterRegistry INSTANCE = new RepositoryAdapterRegistry();

  private RepositoryAdapterRegistry()
  {
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    initAdapters();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    clear();
    super.doDeactivate();
  }

  private void initAdapters()
  {
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    if (registry == null)
    {
      OM.LOG.info("No extension registry available");
      return;
    }

    IConfigurationElement[] elements = registry.getConfigurationElementsFor(OM.BUNDLE_ID, "adapters");
    for (IConfigurationElement element : elements)
    {
      try
      {
        IRepositoryAdapter adapter = (IRepositoryAdapter)element.createExecutableExtension("class");
        put(adapter.getType(), adapter);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }
  }
}
