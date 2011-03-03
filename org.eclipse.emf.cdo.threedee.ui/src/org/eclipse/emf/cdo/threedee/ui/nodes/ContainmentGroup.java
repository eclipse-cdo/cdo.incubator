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
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class ContainmentGroup extends TransformGroup
{
  private Node shape;

  List<ContainmentGroup> cildren = new ArrayList<ContainmentGroup>();

  public ContainmentGroup()
  {
    setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
  }

  public void setShape(Node shape)
  {
    this.shape = shape;
    addChild(shape);
  }

  public Node getShape()
  {
    return shape;
  }

  public void layoutChildren()
  {
    @SuppressWarnings("rawtypes")
    Enumeration allChildren = getAllChildren();

    List<Node> elements = new ArrayList<Node>();
    while (allChildren.hasMoreElements())
    {
      elements.add((Node)allChildren.nextElement());
    }
    allChildren = getAllChildren();

    float radius = 0.7f;
    float angle = 0f;
    float distanceAngle = 360f / (elements.size() - 1);
    for (Node node : elements)
    {
      if (node != shape)
      {
        ContainmentGroup group = (ContainmentGroup)node;

        float x = (float)(0 + radius * Math.cos(Math.toRadians(angle)));
        float y = (float)(0 + radius * Math.sin(Math.toRadians(angle)));

        Vector3f availablePosition = new Vector3f(x, y, 0f);
        Transform3D t1 = new Transform3D();
        t1.setTranslation(availablePosition);
        group.setTransform(t1);
        angle += distanceAngle;
      }
    }
  }
}
