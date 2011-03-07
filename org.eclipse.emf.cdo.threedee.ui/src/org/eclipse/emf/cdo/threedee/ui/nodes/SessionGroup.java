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

import org.eclipse.emf.cdo.threedee.Session;

import javax.media.j3d.Appearance;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

/**
 * @author Martin Fluegge
 */
public class SessionGroup extends ThreeDeeNode<Session>
{
  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  private static final double HALF_PI = 0.5d * PI;

  private static final double THREE_HALF_PI = PI + HALF_PI;

  public SessionGroup(Session element)
  {
    super(element, null);
  }

  @Override
  protected void layout(ThreeDeeNode<Session>[] children, int n)
  {
    double circumference = n;
    double radius = circumference / TWO_PI;
    double distanceAngle = TWO_PI / n;
    double phi = 0.0d;

    for (int i = 0; i < n; i++)
    {
      SessionGroup child = (SessionGroup)children[i];

      double x = radius * Math.cos(phi);
      double y = radius * Math.sin(phi);

      Transform3D transform = new Transform3D();
      Vector3d translation = new Vector3d(x, y, 1.0d + radius);
      transform.setTranslation(translation);

      double scalarProductX = -y / x;
      double scalarProductY = 1.0d;
      double rotationAngle = 0.75d;
      if (HALF_PI < phi && phi < THREE_HALF_PI)
      {
        rotationAngle = -rotationAngle;
      }

      AxisAngle4d rotation = new AxisAngle4d(scalarProductX, scalarProductY, 0.0d, rotationAngle);
      transform.setRotation(rotation);

      child.setTransform(transform);
      child.layout();

      phi += distanceAngle;
    }
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    return null;
  }
}
