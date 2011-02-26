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
package org.eclipse.emf.cdo.threedee.ui.layouts;

import org.eclipse.emf.cdo.threedee.ui.ILayouter;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import javax.media.j3d.Bounds;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class SimpleLayouter implements ILayouter
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, SimpleLayouter.class);

  private List<Node> nodes = new ArrayList<Node>();

  private static final float moveDistance = .3f;

  public Vector3f getAvailablePosition(Node node)
  {
    Point3d newCenter = new Point3d(0, 0, 0);
    byte modified = 0;

    while (collidesWithOtherNodes(newCenter, nodes))
    {
      switch (modified)
      {
      case 0:
        newCenter.x = newCenter.x + moveDistance;
        break;

      case 1:
        newCenter.x = newCenter.x - 2 * moveDistance;
        break;

      case 2:
        newCenter.y = newCenter.y + moveDistance;
        break;

      case 3:
        newCenter.y = newCenter.y - 2 * moveDistance;
        break;

      case 4:
        newCenter.z = newCenter.z + moveDistance;
        break;

      case 5:
        newCenter.z = newCenter.z - 2 * moveDistance;
        break;

      default:
        modified = 0;
        break;
      }

      modified++;
    }

    Vector3f translationVector = new Vector3f(newCenter);
    nodes.add(node);

    return translationVector;
  }

  public Vector3f getPosition(Node shape)
  {
    Transform3D positionTrans = new Transform3D();
    shape.getLocalToVworld(positionTrans);

    Vector3f locationVec = new Vector3f();
    positionTrans.get(locationVec);

    float[] flo = new float[3];
    locationVec.get(flo);
    if (TRACER.isEnabled())
    {
      //      TRACER.format("Register: {0}", object); //$NON-NLS-1$
      // System.out.print(flo[0] + " ");
      // System.out.print(flo[1] + " ");
      // System.out.println(flo[2]);
    }

    return locationVec;
  }

  private boolean collidesWithOtherNodes(Point3d newCenter, List<Node> nodes)
  {
    for (Node existingNode : nodes)
    {
      Bounds bounds = existingNode.getBounds();
      Transform3D positionTrans = new Transform3D();
      existingNode.getLocalToVworld(positionTrans);
      bounds.transform(positionTrans);

      if (bounds.intersect(newCenter))
      {
        return true;
      }
    }

    return false;
  }
}
