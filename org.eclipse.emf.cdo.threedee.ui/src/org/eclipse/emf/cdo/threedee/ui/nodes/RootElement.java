/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.nodes;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeUtil;

import javax.media.j3d.Appearance;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3d;

/**
 * @author Martin Fluegge
 */
public class RootElement extends ThreeDeeNode<Element>
{

  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  public RootElement(Canvas3D canvas)
  {
    super(null, createAppearance());
  }

  @Override
  protected void layout(ThreeDeeNode<Element>[] children, int n)
  {
    double distanceAngle = TWO_PI / n;

    double radius = 3f;

    double phi = 0.0d;

    double theta = 0.0d;

    for (int i = 0; i < n; i++)
    {
      ThreeDeeNode<Element> child = children[i];

      float x = (float)(0 + radius * Math.sin(theta) * Math.cos(phi));
      float y = (float)(0 + radius * Math.sin(theta) * Math.sin(phi));
      float z = (float)(0 + radius * Math.cos(theta));

      Transform3D transform = new Transform3D();
      Vector3d translation = new Vector3d(x, y, z);
      transform.setTranslation(translation);

      // double scalarProductX = -y / x;
      // double scalarProductY = 1.0d;
      // double scalarProductZ = z;
      // double rotationAngle = 0.75d;
      //
      // AxisAngle4d rotation = new AxisAngle4d(scalarProductX, scalarProductY, scalarProductZ, rotationAngle);
      // transform.setRotation(rotation);

      child.setTransform(transform);

      phi += distanceAngle;
      theta -= distanceAngle;
      child.layout();
    }
  }

  private static Appearance createAppearance()
  {
    return ThreeDeeUtil.getDefaultAppearance(IColors.white);
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    return null;
  }
}
