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
package org.eclipse.net4j.pop.repository;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Eike Stepper
 */
public interface IRepositoryFolder
{
  public IRepositorySession getSession();

  public IRepositoryTag getTag();

  public String getPath();

  public void checkoutAs(IContainer parent, String localName, boolean recursive, IProgressMonitor monitor);
}
