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

import org.eclipse.emf.cdo.spi.server.IAppExtension;
import org.eclipse.emf.cdo.threedee.agent.Agent;

import java.io.File;

/**
 * @author Eike Stepper
 */
public class ThreeDeeAppExtension implements IAppExtension
{
  public ThreeDeeAppExtension()
  {
  }

  public void start(File configFile) throws Exception
  {
    Agent.start("Server");
    OM.LOG.info("ThreeDee extension started"); //$NON-NLS-1$
  }

  public void stop() throws Exception
  {
    OM.LOG.info("ThreeDee extension stopped"); //$NON-NLS-1$
  }
}
