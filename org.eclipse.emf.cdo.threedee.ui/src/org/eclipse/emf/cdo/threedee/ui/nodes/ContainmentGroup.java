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

import org.eclipse.emf.cdo.threedee.ui.layouts.CuboidStarLayouter;

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

  CuboidStarLayouter layout = new CuboidStarLayouter();

  public void layoutChildren()
  {
    // Vector3f pos = layout.getAvailablePosition(this);
    // Transform3D transform = new Transform3D();
    // transform.setTranslation(pos);
    // setTransform(transform);

    List<ContainmentGroup> elements = getChildren();
    // allChildren = getAllChildren();

    placeChildren(elements);

  }

  public List<ContainmentGroup> getChildren()
  {
    @SuppressWarnings("rawtypes")
    Enumeration allChildren = getAllChildren();
    List<ContainmentGroup> elements = new ArrayList<ContainmentGroup>();
    while (allChildren.hasMoreElements())
    {
      Node nextElement = (Node)allChildren.nextElement();
      if (nextElement != shape)
      {
        elements.add((ContainmentGroup)nextElement);
      }
    }
    return elements;
  }

  private void placeChildren(List<ContainmentGroup> elements)
  {
    float radius = 0.4f;
    float angle = 0f;
    float distanceAngle = 360f / elements.size();
    for (ContainmentGroup group : elements)
    {
      float x = (float)(0 + radius * Math.cos(Math.toRadians(angle)));
      float y = (float)(0 + radius * Math.sin(Math.toRadians(angle)));

      Vector3f availablePosition = new Vector3f(x, y, 1f);
      Transform3D t1 = new Transform3D();
      t1.setTranslation(availablePosition);
      group.setTransform(t1);
      angle += distanceAngle;

      placeChildren(group.getChildren());
    }
  }
}
