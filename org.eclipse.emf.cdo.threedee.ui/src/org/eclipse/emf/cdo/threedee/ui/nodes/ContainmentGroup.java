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

import javax.media.j3d.BoundingSphere;
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
    if (elements.size() == 0)
    {
      return;
    }

    float phi = 0f;
    float theta = 90f;
    float distanceAngle = 360f / elements.size();
    float z = 0.7f;

    for (int i = 0; i < elements.size(); i++)
    {
      ContainmentGroup currentChild = elements.get(i);

      // my children first
      placeChildren(currentChild.getChildren());

      // currently we assume that all children have the same diameter
      double childRadius = ((BoundingSphere)elements.get(0).getBounds()).getRadius();
      double minimalCircumference = childRadius * 2 * elements.size();

      float radius = (float)(minimalCircumference / (2 * Math.PI));

      placeChild(phi, theta, distanceAngle, currentChild, radius, z);

      phi += distanceAngle;
    }
  }

  private void placeChild(float phi, float theta, float distanceAngle, ContainmentGroup child, float radius, float z)
  {
    // float x = (float)(0 + childDistance * Math.cos(Math.toRadians(phi)));
    // float y = (float)(0 + childDistance * Math.sin(Math.toRadians(phi)));
    // float z = 1f;

    double sinTheta = Math.sin(Math.toRadians(theta));
    float x = (float)(0 + radius * sinTheta * Math.cos(Math.toRadians(phi)));
    float y = (float)(0 + radius * sinTheta * Math.sin(Math.toRadians(phi)));
    // float z = 1f;// (float)(0 + childDistance * Math.cos(Math.toRadians(theta)));

    Vector3f availablePosition = new Vector3f(x, y, z);
    Transform3D t1 = new Transform3D();
    t1.setTranslation(availablePosition);
    child.setTransform(t1);

    // theta = phi;
  }
}
