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
package org.eclipse.emf.cdo.threedee.ui.nodes.net4j;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldUtil;
import org.eclipse.emf.cdo.threedee.ui.nodes.INodeFactory;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Node;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class TCPConnectorNode extends Sphere
{
  public TCPConnectorNode()
  {
    super(.1f, ThreeDeeWorldUtil.getDefaultAppearance(Color.magenta));
  }

  /**
   * @author Martin Fluegge
   */
  public static class Factory implements INodeFactory
  {
    public Node createNode(Element element)
    {
      return new TCPConnectorNode();
    }
  }
}