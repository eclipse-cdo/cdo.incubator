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
package org.eclipse.emf.cdo.threedee.agent.bundle;

import org.eclipse.emf.cdo.threedee.agent.Agent;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.OSGiActivator;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.trace.OMTracer;

/**
 * The <em>Operations & Maintenance</em> class of this bundle.
 * 
 * @author Eike Stepper
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "org.eclipse.emf.cdo.threedee.agent"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMTracer DEBUG_EVENT = DEBUG.tracer("event"); //$NON-NLS-1$

  public static final OMTracer DEBUG_EVENT_SEND = DEBUG_EVENT.tracer("send"); //$NON-NLS-1$

  public static final OMTracer DEBUG_HOOK = DEBUG.tracer("hook"); //$NON-NLS-1$

  public static final OMTracer DEBUG_HOOK_STACK = DEBUG_HOOK.tracer("stack"); //$NON-NLS-1$

  public static final OMTracer DEBUG_HOOK_CALL = DEBUG_HOOK.tracer("call"); //$NON-NLS-1$

  public static final OMTracer DEBUG_HOOK_CALL_BEFORE = DEBUG_HOOK_CALL.tracer("before"); //$NON-NLS-1$

  public static final OMTracer DEBUG_HOOK_CALL_AFTER = DEBUG_HOOK_CALL.tracer("after"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

  /**
   * @author Eike Stepper
   */
  public static final class Activator extends OSGiActivator
  {
    public Activator()
    {
      super(BUNDLE);
    }

    // @Override
    // protected void doStart() throws Exception
    // {
    // Agent.INSTANCE.setServer("localhost:" + ThreeDeeProtocol.PROTOCOL_PORT);
    // Agent.INSTANCE.activate();
    // }

    @Override
    protected void doStop() throws Exception
    {
      Agent.INSTANCE.deactivate();
    }
  }
}
