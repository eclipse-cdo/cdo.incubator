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

import org.eclipse.ecf.core.identity.Namespace;
import org.eclipse.ecf.core.identity.StringID;

/**
 * @author Eike Stepper
 */
public class Net4jID extends StringID
{
  private static final long serialVersionUID = 1L;

  private String connectorType;

  private String connectorDescription;

  private String groupName;

  protected Net4jID(Namespace n, String s)
  {
    super(n, s);
    init();
  }

  @Override
  public String toString()
  {
    StringBuffer sb = new StringBuffer("NET4JID["); //$NON-NLS-1$
    sb.append(getName()).append("]"); //$NON-NLS-1$
    return sb.toString();
  }

  public String getConnectorType()
  {
    return connectorType;
  }

  public String getConnectorDescription()
  {
    return connectorDescription;
  }

  public String getGroupName()
  {
    return groupName;
  }

  private void init()
  {
    String name = getName();
  }
}
