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
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.TransformGroup;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class ElementSphere extends Sphere
{
  public static final float RADIUS = .1f;

  public ElementSphere(Element element)
  {
    super(RADIUS, defaultAppearance(element));
    setDefaultCapabilities();
  }

  public ElementSphere(Appearance appearance)
  {
    super(.1f, appearance);
    setDefaultCapabilities();
  }

  private void setDefaultCapabilities()
  {
    setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
    setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);

    Appearance appearance = getAppearance();
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
    RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
    if (renderingAttributes == null)
    {
      renderingAttributes = new RenderingAttributes();
      renderingAttributes.setCapability(RenderingAttributes.ALLOW_VISIBLE_WRITE);
      appearance.setRenderingAttributes(renderingAttributes);
    }
  }

  private static Appearance defaultAppearance(Element element)
  {
    Color color = element.getDescriptor().getColor().getValue();
    return ThreeDeeWorldUtil.getDefaultAppearance(color);
  }
}
