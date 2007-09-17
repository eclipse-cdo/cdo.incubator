/***************************************************************************
 * Copyright (c) 2004 - 2007 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.ecf.provider.net4j.container;

import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.identity.IDCreateException;
import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.core.sharedobject.ISharedObjectContainerConfig;
import org.eclipse.ecf.provider.comm.ConnectionCreateException;
import org.eclipse.ecf.provider.comm.ISynchAsynchConnection;
import org.eclipse.ecf.provider.generic.ClientSOContainer;
import org.eclipse.ecf.provider.generic.SOContainerConfig;
import org.eclipse.ecf.provider.internal.net4j.Net4jConnection;
import org.eclipse.ecf.provider.net4j.identity.Net4jID;

import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Net4jClientSOContainer extends ClientSOContainer
{
  private IManagedContainer net4jContainer;

  public Net4jClientSOContainer(ISharedObjectContainerConfig config)
  {
    super(config);
  }

  public Net4jClientSOContainer(ID id, Map<?, ?> properties) throws IDCreateException
  {
    this(new SOContainerConfig(id, properties));
  }

  public Net4jClientSOContainer(Map<?, ?> properties) throws IDCreateException
  {
    this(IDFactory.getDefault().createGUID(), properties);
  }

  public Net4jClientSOContainer(ID id) throws IDCreateException
  {
    this(id, null);
  }

  public Net4jClientSOContainer() throws IDCreateException
  {
    this(IDFactory.getDefault().createGUID(), null);
  }

  public IManagedContainer getNet4jContainer()
  {
    return net4jContainer;
  }

  public void setNet4jContainer(IManagedContainer net4jContainer)
  {
    this.net4jContainer = net4jContainer;
  }

  @Override
  protected ISynchAsynchConnection createConnection(ID targetID, Object data) throws ConnectionCreateException
  {
    return new Net4jConnection(this, (Net4jID)targetID, data);
  }
}