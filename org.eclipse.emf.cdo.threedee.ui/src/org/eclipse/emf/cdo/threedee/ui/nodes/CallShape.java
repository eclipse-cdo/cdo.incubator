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
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeUtil;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld;

import org.eclipse.net4j.util.collection.Pair;

import javax.media.j3d.Appearance;
import javax.media.j3d.LineArray;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Point3f;

/**
 * @author Eike Stepper
 */
public class CallShape extends LineShape implements IColors
{
  private Point3f[] positions;

  private boolean transmission;

  public CallShape(ThreeDeeWorld world, Element from, Element to, Point3f[] positions, boolean transmission)
  {
    super(world, new Pair<Element, Element>(from, to), createAppearance(transmission));
    this.positions = positions;
    this.transmission = transmission;

    LineArray lineArray = new LineArray(2, LineArray.COORDINATES);
    lineArray.setCoordinates(0, positions);
    setGeometry(lineArray);
  }

  private static Appearance createAppearance(boolean transmission)
  {
    Appearance appearance = ThreeDeeUtil.getDefaultAppearance(transmission ? green : white);

    TransparencyAttributes transparencyAttributes = appearance.getTransparencyAttributes();
    if (transparencyAttributes == null)
    {
      transparencyAttributes = new TransparencyAttributes();
      appearance.setTransparencyAttributes(transparencyAttributes);
    }

    transparencyAttributes.setTransparencyMode(TransparencyAttributes.FASTEST);
    transparencyAttributes.setTransparency(0.0f);
    return appearance;
  }

  public Point3f getTargetPoint()
  {
    return positions[0];
  }

  public Point3f getSourcePoint()
  {
    return positions[1];
  }

  public boolean hasMoved(Point3f[] newPositions)
  {
    float allowedDistance = 0.05f;
    return newPositions[0].distance(positions[0]) > 0.05f | newPositions[1].distance(positions[1]) > allowedDistance;
  }

  public boolean isTransmission()
  {
    return transmission;
  }
}
