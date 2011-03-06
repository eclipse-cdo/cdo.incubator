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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.layouts.CuboidStarLayouter;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3f;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class ContainmentGroup extends ThreeDeeNode
{
  private Element element;

  public ContainmentGroup(Element element)
  {
    super();
    this.element = element;

    setCapability(BranchGroup.ALLOW_DETACH);
  }

  public Element getElement()
  {
    return element;
  }

  CuboidStarLayouter layout = new CuboidStarLayouter();

  public void layoutChildren()
  {
    List<ContainmentGroup> elements = getChildren();
    placeChildren(elements);
  }

  public List<ContainmentGroup> getChildren()
  {
    List<ContainmentGroup> result = new ArrayList<ContainmentGroup>();

    @SuppressWarnings("rawtypes")
    Enumeration allChildren = transformGroup.getAllChildren();

    while (allChildren.hasMoreElements())
    {
      Node nextElement = (Node)allChildren.nextElement();
      if (nextElement != shape && nextElement instanceof ContainmentGroup)
      {
        result.add((ContainmentGroup)nextElement);
      }
    }

    return result;
  }

  private void placeChildren(List<ContainmentGroup> elements)
  {
    float radius = 2f;
    float phi = 0f;
    float theta = 0f;
    float distanceAngle = 360f / elements.size();
    for (ContainmentGroup group : elements)
    {
      float x = (float)(0 + radius * Math.cos(Math.toRadians(phi)));
      float y = (float)(0 + radius * Math.sin(Math.toRadians(phi)));
      float z = 1f;

      // float x = (float)(0 + radius * Math.sin(Math.toRadians(theta)) * Math.cos(Math.toRadians(phi)));
      // float y = (float)(0 + radius * Math.sin(Math.toRadians(theta)) * Math.sin(Math.toRadians(phi)));
      // float z = (float)(0 + radius * Math.cos(Math.toRadians(theta)));

      Vector3f availablePosition = new Vector3f(x, y, z);
      Transform3D t1 = new Transform3D();
      t1.setTranslation(availablePosition);
      group.setTransform(t1);
      phi += distanceAngle;
      theta = phi;

      placeChildren(group.getChildren());
    }
  }
}
