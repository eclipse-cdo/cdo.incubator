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

import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldUtil;

import javax.media.j3d.Appearance;
import javax.media.j3d.Geometry;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class ReferenceShape extends ThreeDeeNode
{
  public ReferenceShape(boolean isContainment)
  {
    super();

    Appearance appearance = ThreeDeeWorldUtil.getDefaultAppearance(isContainment == true ? Color.white : Color.gray);

    TransparencyAttributes transparencyAttributes = appearance.getTransparencyAttributes();
    if (transparencyAttributes == null)
    {
      transparencyAttributes = new TransparencyAttributes();
      appearance.setTransparencyAttributes(transparencyAttributes);
    }

    transparencyAttributes.setTransparencyMode(TransparencyAttributes.FASTEST);
    transparencyAttributes.setTransparency(0.75f);
    shape = new Shape3D();
    getShape().setAppearance(appearance);

    shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
    shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
    addChild(shape);
  }

  @Override
  public Shape3D getShape()
  {
    return (Shape3D)shape;
  }

  public void setGeometry(Geometry geometry)
  {
    getShape().setGeometry(geometry);
  }
}
