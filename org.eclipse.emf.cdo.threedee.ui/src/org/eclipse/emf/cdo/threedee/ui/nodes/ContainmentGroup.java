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
package org.eclipse.emf.cdo.threedee.ui.nodes;

import javax.media.j3d.Node;
import javax.media.j3d.TransformGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class ContainmentGroup extends TransformGroup
{
  private Node shape;

  List<ContainmentGroup> cildren = new ArrayList<ContainmentGroup>();

  public void setShape(Node shape)
  {
    this.shape = shape;
    addChild(shape);
  }

  public Node getShape()
  {
    return shape;
  }
}
