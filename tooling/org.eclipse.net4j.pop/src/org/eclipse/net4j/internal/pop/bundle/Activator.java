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
package org.eclipse.net4j.internal.pop.bundle;

import org.eclipse.net4j.pop.impl.PopManagerImpl;
import org.eclipse.net4j.util.om.OSGiActivator;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import org.osgi.framework.BundleContext;

/**
 * @author Eike Stepper
 */
public final class Activator extends EMFPlugin
{
  // @Singleton
  public static final Activator INSTANCE = new Activator();

  private static Implementation plugin;

  public Activator()
  {
    super(new ResourceLocator[] {});
  }

  @Override
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * @author Eike Stepper
   */
  public static class Implementation extends EclipsePlugin
  {
    public Implementation()
    {
      plugin = this;
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
      OSGiActivator.traceStart(context);
      if (OM.BUNDLE == null)
      {
        throw new IllegalStateException("bundle == null");
      }

      try
      {
        super.start(context);
        OM.BUNDLE.setBundleContext(context);
        doStart();
      }
      catch (Error error)
      {
        OM.BUNDLE.logger().error(error);
        throw error;
      }
      catch (Exception ex)
      {
        OM.BUNDLE.logger().error(ex);
        throw ex;
      }
    }

    @Override
    public void stop(BundleContext context) throws Exception
    {
      plugin = null;
      OSGiActivator.traceStop(context);
      if (OM.BUNDLE == null)
      {
        throw new IllegalStateException("bundle == null");
      }

      try
      {
        doStop();
        OM.BUNDLE.setBundleContext(null);
        super.stop(context);
      }
      catch (Error error)
      {
        OM.BUNDLE.logger().error(error);
        throw error;
      }
      catch (Exception ex)
      {
        OM.BUNDLE.logger().error(ex);
        throw ex;
      }
    }

    protected void doStart() throws Exception
    {
      PopManagerImpl.INSTANCE.activate();
    }

    protected void doStop() throws Exception
    {
      PopManagerImpl.INSTANCE.deactivate();
    }
  }
}
