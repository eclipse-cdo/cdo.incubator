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
package org.eclipse.net4j.pop.repository.ccvs;

import org.eclipse.net4j.pop.repository.IRepositorySession;

import org.eclipse.team.internal.ccvs.core.ICVSFolder;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.client.Session;

/**
 * @author Eike Stepper
 */
public interface ICvsRepositorySession extends IRepositorySession
{
  public ICVSFolder getLocalRoot();

  public ICVSRepositoryLocation getRepositoryLocation();

  public Session getCvsSession();
}
