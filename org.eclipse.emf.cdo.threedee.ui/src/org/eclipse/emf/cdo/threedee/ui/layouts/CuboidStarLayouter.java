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
public class CuboidStarLayouter implements ILayout
{
  private List<Node> nodes = new ArrayList<Node>();

  private static final float moveDistance = .3f;

  private static float currentmoveDistance = moveDistance;

  public Vector3f getAvailablePosition(Node node)
  {
    Point3d newCenter = new Point3d(0, 0, 0);
    byte modified = 0;

    while (collidesWithOtherNodes(newCenter, nodes))
    {
      switch (modified)
      {
      case 0:
        newCenter.x = newCenter.x + currentmoveDistance;
        break;

      case 1:
        newCenter.x = newCenter.x - 2 * currentmoveDistance;
        break;

      case 2:
        newCenter.x = newCenter.x + currentmoveDistance;
        newCenter.y = newCenter.y + currentmoveDistance;
        break;

      case 3:
        newCenter.y = newCenter.y - 2 * currentmoveDistance;
        break;

      case 4:
        newCenter.y = newCenter.y + currentmoveDistance;
        newCenter.z = newCenter.z + currentmoveDistance;
        break;

      case 5:
        newCenter.z = newCenter.z - 2 * currentmoveDistance;
        break;

      case 6:
        newCenter.x = newCenter.x + currentmoveDistance;
        break;

      case 7:
        newCenter.x = newCenter.x - 2 * currentmoveDistance;
        break;

      case 8:
        newCenter.x = newCenter.x + currentmoveDistance;
        newCenter.y = newCenter.y + currentmoveDistance;
        break;

      case 9:
        newCenter.y = newCenter.y - 2 * currentmoveDistance;
        break;

      case 10:
        newCenter.z = newCenter.z + currentmoveDistance;
        break;

      case 11:
        newCenter.z = newCenter.z + currentmoveDistance;
        break;

      case 12:
        newCenter.x = newCenter.x + currentmoveDistance;
        break;

      case 13:
        newCenter.x = newCenter.x - 2 * currentmoveDistance;
        break;

      case 14:
        newCenter.y = newCenter.y + currentmoveDistance;
        break;

      case 15:
        newCenter.y = newCenter.y + currentmoveDistance;
        break;

      case 16:
        newCenter.x = newCenter.x + currentmoveDistance;
        break;

      case 17:
        newCenter.x = newCenter.x + currentmoveDistance;
        break;

      case 18:
        newCenter.y = newCenter.y - currentmoveDistance;
        break;
      //
      case 19:
        newCenter.y = newCenter.y - currentmoveDistance;
        newCenter.z = newCenter.z - currentmoveDistance;
        break;

      case 20:
        newCenter.z = newCenter.z - currentmoveDistance;
        break;

      case 21:
        newCenter.x = newCenter.x - 2 * currentmoveDistance;
        break;
      case 22:
        newCenter.y = newCenter.y + 2 * currentmoveDistance;
        break;
      case 23:
        newCenter.x = newCenter.x + 2 * currentmoveDistance;
        break;

      case 24:
        newCenter.z = newCenter.z + currentmoveDistance;
        break;

      case 25:
        newCenter.y = newCenter.y - 2 * currentmoveDistance;
        newCenter.x = newCenter.x - 2 * currentmoveDistance;
        break;

      case 26:
        newCenter.y = newCenter.y + 2 * currentmoveDistance;
        break;
      default:
        modified = 0;
        currentmoveDistance = currentmoveDistance + moveDistance;
        break;
      }

      modified++;
    }

    Vector3f translationVector = new Vector3f(newCenter);
    nodes.add(node);

    return translationVector;
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
