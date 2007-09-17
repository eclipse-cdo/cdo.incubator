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
package org.eclipse.ecf.provider.net4j.identity;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.identity.IDCreateException;
import org.eclipse.ecf.core.identity.Namespace;

import java.net.URI;

/**
 * @author Eike Stepper
 */
public class Net4jNamespace extends Namespace
{
  private static final long serialVersionUID = 1L;

  private static final String SCHEME = "net4j"; //$NON-NLS-1$

  public static final String NAME = "ecf.net4j"; //$NON-NLS-1$

  public Net4jNamespace()
  {
    super(NAME, null);
  }

  @Override
  public ID createInstance(Object[] args) throws IDCreateException
  {
    try
    {
      if (args.length == 1)
      {
        if (args[0] instanceof String)
        {
          return new Net4jID(this, (String)args[0]);
        }
        else if (args[0] instanceof URI)
        {
          return new Net4jID(this, ((URI)args[0]).toString());
        }
      }
    }
    catch (Exception e)
    {
      throw new IDCreateException(e);
    }

    throw new IDCreateException("Net4j ID constructor arguments invalid");
  }

  @Override
  public String getScheme()
  {
    return SCHEME;
  }

  @Override
  public Class<?>[][] getSupportedParameterTypes()
  {
    return new Class[][] { { String.class }, { URI.class } };
  }
}
