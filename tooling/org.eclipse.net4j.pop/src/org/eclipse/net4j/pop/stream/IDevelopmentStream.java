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
package org.eclipse.net4j.pop.stream;

import org.eclipse.net4j.pop.release.IRelease;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public interface IDevelopmentStream extends IStream
{
  public IRelease addRelease(boolean compatible, int versionIncrement, Date date);

  public IMaintenanceStream addMaintenanceStream(String ticketID, IRelease baseline);

  public IMaintenanceStream[] getMaintenanceStreams();
}
