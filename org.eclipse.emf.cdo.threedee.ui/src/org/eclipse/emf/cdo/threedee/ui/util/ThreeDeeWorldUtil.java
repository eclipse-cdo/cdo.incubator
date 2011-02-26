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
package org.eclipse.emf.cdo.threedee.ui.util;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Material;
import javax.media.j3d.Texture;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.vecmath.Color3f;
import javax.vecmath.Color4f;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldUtil
{
  public static Appearance getDefaultAppearance(Color3f color)
  {
    Color3f black = new Color3f(0.0f, 0.0f, 0.0f);
    Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
    Appearance ap = new Appearance();
    Texture texture = new Texture2D();
    TextureAttributes texAttr = new TextureAttributes();
    texAttr.setTextureMode(TextureAttributes.MODULATE);
    texture.setBoundaryModeS(Texture.WRAP);
    texture.setBoundaryModeT(Texture.WRAP);
    texture.setBoundaryColor(new Color4f(0.0f, 1.0f, 0.0f, 0.0f));
    Material mat = new Material(color, black, color, white, 70f);
    ap.setTextureAttributes(texAttr);
    ap.setMaterial(mat);
    ap.setTexture(texture);
    ColoringAttributes ca = new ColoringAttributes(color, ColoringAttributes.NICEST);
    ap.setColoringAttributes(ca);
    return ap;
  }

  public static Appearance getDefaultAppearance(Color color)
  {
    return ThreeDeeWorldUtil.getDefaultAppearance(new Color3f(color));
  }

}
