/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.nodes.old;

import org.eclipse.emf.cdo.threedee.common.Element;

import javax.media.j3d.Node;

import java.util.HashMap;

/**
 * @author Martin Fluegge
 */
public interface INodeFactory
{
  public Node createNode(Element element);

  /**
   * @author Eike Stepper
   */
  public static class Registry extends HashMap<String, INodeFactory>
  {
    public static final INodeFactory.Registry INSTANCE = new Registry();

    private static final long serialVersionUID = 1L;

    static
    {
      // INSTANCE.put("Repository", new RepositoryNode.Factory());
      // INSTANCE.put("TCPConnector", new TCPConnectorNode.Factory());
      // INSTANCE.put("EPackageRegistry", new EPackageRegistryNode.Factory());
    }
  }
}
