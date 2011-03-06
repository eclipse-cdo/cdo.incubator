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

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class ContainmentGroup extends ThreeDeeNode
{
  private static final double SPHERE_DISTANCE = 2.0d * ElementSphere.RADIUS + 0.08d;

  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  private static final double HALF_PI = 0.5d * PI;

  private static final double THREE_HALF_PI = PI + HALF_PI;

  private Element element;

  public ContainmentGroup(Element element)
  {
    this.element = element;
    setCapability(BranchGroup.ALLOW_DETACH);
  }

  public Element getElement()
  {
    return element;
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

  public void layout()
  {
    List<ContainmentGroup> elements = getChildren();
    int n = elements.size();
    if (n == 0)
    {
      return;
    }

    final double circumference = SPHERE_DISTANCE * n;
    final double radius = circumference / TWO_PI;
    final double distanceAngle = TWO_PI / n;

    double phi = 0.0d;

    for (int i = 0; i < n; i++)
    {
      final ContainmentGroup child = elements.get(i);

      final double x = radius * Math.cos(phi);
      final double y = radius * Math.sin(phi);

      final Transform3D transform = new Transform3D();

      final Vector3d translation = new Vector3d(x, y, 1.0d);
      transform.setTranslation(translation);

      final double scalarProductX = -y / x;
      final double scalarProductY = 1.0d;
      double rotationAngle = 0.75d;
      if (HALF_PI < phi && phi < THREE_HALF_PI)
      {
        rotationAngle = -rotationAngle;
      }

      final AxisAngle4d rotation = new AxisAngle4d(scalarProductX, scalarProductY, 0.0d, rotationAngle);
      transform.setRotation(rotation);

      child.setTransform(transform);
      child.layout();

      phi += distanceAngle;
    }
  }
}
