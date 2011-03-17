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
package org.eclipse.emf.cdo.threedee.bundle;

import org.eclipse.emf.cdo.threedee.ColorIcons;
import org.eclipse.emf.cdo.threedee.Frontend;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.trace.OMTracer;
import org.eclipse.net4j.util.ui.UIActivator;

/**
 * The <em>Operations & Maintenance</em> class of this bundle.
 * 
 * @author Eike Stepper
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "org.eclipse.emf.cdo.threedee"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMTracer DEBUG_EVENT = DEBUG.tracer("event"); //$NON-NLS-1$

  public static final OMTracer DEBUG_EVENT_RECEIVE = DEBUG_EVENT.tracer("receive"); //$NON-NLS-1$

  public static final OMTracer DEBUG_EVENT_HANDLE = DEBUG_EVENT.tracer("handle"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

  /**
   * @author Eike Stepper
   */
  public static final class Activator extends UIActivator
  {
    public static Activator INSTANCE;

    public Activator()
    {
      super(BUNDLE);
      INSTANCE = this;
    }

    @Override
    protected void doStart() throws Exception
    {
      synchronized (Frontend.INSTANCE)
      {
        Frontend.INSTANCE.activate();
      }
    }

    @Override
    protected void doStop() throws Exception
    {
      synchronized (Frontend.INSTANCE)
      {
        Frontend.INSTANCE.deactivate();
      }

      ColorIcons.dispose();
    }
  }
}
