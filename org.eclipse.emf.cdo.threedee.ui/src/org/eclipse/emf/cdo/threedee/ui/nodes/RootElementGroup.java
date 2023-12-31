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
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld;

import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3d;

/**
 * @author Martin Fluegge
 */
public class RootElementGroup extends ThreeDeeNode<Element>
{
  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  private double radiusFactor = 0.8d;

  public RootElementGroup(ThreeDeeWorld world)
  {
    super(world, null, createAppearance());
  }

  public double getRadiusFactor()
  {
    return radiusFactor;
  }

  public void setRadiusFactor(double radiusFactor)
  {
    this.radiusFactor = radiusFactor;
  }

  @Override
  protected void layout(ThreeDeeNode<Element>[] children, int n)
  {
    double radius = 0f;
    for (int i = 0; i < n; i++)
    {
      ThreeDeeNode<Element> child = children[i];
      child.layout();

      BoundingSphere boundingSphere = new BoundingSphere(child.getBounds());
      double r = boundingSphere.getRadius();
      if (r > radius)
      {
        radius = r;
      }
    }

    double distanceAngle = TWO_PI / n;
    double phi = 0.0d;
    radius *= radiusFactor;

    for (int i = 0; i < n; i++)
    {
      ThreeDeeNode<Element> child = children[i];

      double x = radius * Math.cos(phi);
      double y = radius * Math.sin(phi);

      Transform3D transform = new Transform3D();
      Vector3d translation = new Vector3d(x, y, radius);
      transform.setTranslation(translation);

      child.setTransform(transform);

      phi += distanceAngle;
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
