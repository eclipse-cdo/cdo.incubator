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
import org.eclipse.ecf.provider.generic.SOContainerConfig;
import org.eclipse.ecf.provider.generic.ServerSOContainer;

import java.util.Map;

/**
 * @author Eike Stepper
 */
public class Net4jServerSOContainer extends ServerSOContainer
{
  private IManagedContainer net4jContainer;

  @Deprecated
  public Net4jServerSOContainer(ID id, Map<?, ?> properties)
  {
    super(new Config(id, properties));
  }

  @Override
  public Config getConfig()
  {
    return (Config)super.getConfig();
  }

  public IManagedContainer getNet4jContainer()
  {
    return net4jContainer;
  }

  public void setNet4jContainer(IManagedContainer net4jContainer)
  {
    this.net4jContainer = net4jContainer;
  }

  /**
   * @author Eike Stepper
   */
  public static class Config extends SOContainerConfig
  {
    public Config(ID id, Map<?, ?> properties)
    {
      super(id, properties);
    }
  }
}
