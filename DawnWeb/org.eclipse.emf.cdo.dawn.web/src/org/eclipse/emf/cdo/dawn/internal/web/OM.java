/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.dawn.internal.web;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.OSGiActivator;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.pref.OMPreferences;
import org.eclipse.net4j.util.om.trace.OMTracer;

import org.osgi.framework.BundleContext;

/**
 * @author Martin Fluegge
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "org.eclipse.emf.cdo.dawn.web"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMTracer DEBUG_OBJECT = DEBUG.tracer("object"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

  public static final OMPreferences PREFS = BUNDLE.preferences();

  /**
   * @author Martin Fluegge
   * @since 1.0
   */
  public static final class Activator extends OSGiActivator
  {
    public Activator()
    {
      super(BUNDLE);
    }

    public BundleContext getBundleContext()
    {
      return bundleContext;
    }
  }

}
