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

import org.eclipse.emf.cdo.threedee.ui.ThreeDeeUtil;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Material;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Color4f;

import java.awt.Color;

/**
 * @author Martin Fluegge
 */
public class IntroPlanet extends BranchGroup
{
  private static final float TWO_PI = (float)(2.0f * Math.PI);

  public IntroPlanet(Canvas3D canvas)
  {
    TransformGroup spin = new TransformGroup();
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

    Alpha alpha = new Alpha(-1, 20000);

    Transform3D axis = new Transform3D();
    axis.rotZ(-Math.PI / 2);

    RotationInterpolator interpolator = new RotationInterpolator(alpha, spin, axis, 0.0f, TWO_PI);
    interpolator.setSchedulingBounds(new BoundingSphere());

    Sphere planet = new Sphere(5.0f, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 64,
        getDefaultAppearance(canvas));

    addChild(interpolator);
    addChild(spin);
    spin.addChild(planet);

    compile();
  }

  private static Appearance getDefaultAppearance(Canvas3D canvas)
  {
    Texture texture = ThreeDeeUtil.loadTexture("moon.jpg", canvas);
    texture.setBoundaryModeS(Texture.WRAP);
    texture.setBoundaryModeT(Texture.WRAP);
    texture.setBoundaryColor(new Color4f(0.0f, 1.0f, 0.0f, 0.0f));

    Appearance appearance = new Appearance();
    appearance.setTexture(texture);

    TextureAttributes texAttr = new TextureAttributes();
    // texAttr.setTextureMode(TextureAttributes.MODULATE);
    texAttr.setTextureMode(TextureAttributes.REPLACE);
    appearance.setTextureAttributes(texAttr);

    Color3f darkGray = new Color3f(Color.darkGray);
    Color3f black = new Color3f(0.0f, 0.0f, 0.0f);
    Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
    Material mat = new Material(darkGray, darkGray, darkGray, white, 24.0f);
    appearance.setMaterial(mat);

    ColoringAttributes ca = new ColoringAttributes(darkGray, ColoringAttributes.NICEST);
    appearance.setColoringAttributes(ca);

    return appearance;
  }
}
