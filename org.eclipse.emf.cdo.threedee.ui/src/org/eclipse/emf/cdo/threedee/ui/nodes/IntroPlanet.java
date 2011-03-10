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
import javax.media.j3d.BoundingBox;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Font3D;
import javax.media.j3d.FontExtrusion;
import javax.media.j3d.Geometry;
import javax.media.j3d.Material;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Text3D;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;

import java.awt.Font;

/**
 * @author Martin Fluegge
 */
public class IntroPlanet extends BranchGroup implements IColors
{
  private static final float RADIUS = 6.0f;

  private static final float TWO_PI = (float)(2.0f * Math.PI);

  private Canvas3D canvas;

  public IntroPlanet(Canvas3D canvas)
  {
    this.canvas = canvas;

    TransformGroup spin = new TransformGroup();
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    addChild(spin);

    Alpha alpha = new Alpha(-1, 40000);

    Transform3D axis = new Transform3D();
    axis.rotZ(-Math.PI / 2);

    RotationInterpolator interpolator = new RotationInterpolator(alpha, spin, axis, 0.0f, TWO_PI);
    interpolator.setSchedulingBounds(new BoundingSphere());
    addChild(interpolator);

    Sphere planet = createPlanet();
    spin.addChild(planet);

    spin.addChild(createText("CDO Model Repository", -1d));
    spin.addChild(createText("EclipseCon 2011", -2d));
    spin.addChild(createText("Arts By:", -3d));
    spin.addChild(createText("Eike Stepper", -4d));
    spin.addChild(createText("Martin Flügge", -5d));

    compile();
  }

  private Sphere createPlanet()
  {
    Appearance appearance = new Appearance();
    setTexture(appearance, "moon.jpg");

    Material material = new Material(black, gray, darkGray, white, 24.0f);
    appearance.setMaterial(material);

    ColoringAttributes coloringAttributes = new ColoringAttributes(darkGray, ColoringAttributes.NICEST);
    appearance.setColoringAttributes(coloringAttributes);

    return new Sphere(RADIUS, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 64, appearance);
  }

  private TransformGroup createText(String text, double angle)
  {
    Appearance appearance = new Appearance();
    // setTexture(appearance, "comet.jpg");

    Material material = new Material(black, gray, darkGray, white, 64.0f);
    material.setLightingEnable(true);
    appearance.setMaterial(material);

    Font3D font = new Font3D(new Font("TestFont", Font.PLAIN, 1), new FontExtrusion());
    Text3D text3D = new Text3D(font, text, new Point3f(-2.0f, 0.7f, 0.0f));
    text3D.setCapability(Geometry.ALLOW_INTERSECT);

    Shape3D textShape = new Shape3D(text3D, appearance);
    Point3d upper = new Point3d();
    Point3d lower = new Point3d();
    BoundingBox bounds = (BoundingBox)textShape.getBounds();
    bounds.getUpper(upper);
    bounds.getLower(lower);
    double offset = -0.5d * (upper.getX() - lower.getX()) + 2.0d;

    Transform3D rotation = new Transform3D();
    rotation.rotX(angle);
    TransformGroup transformGroup1 = new TransformGroup(rotation);

    Transform3D translation = new Transform3D();
    translation.setTranslation(new Vector3d(offset, RADIUS + 0.2f, 0.0f));
    TransformGroup transformGroup2 = new TransformGroup(translation);

    transformGroup1.addChild(transformGroup2);
    transformGroup2.addChild(textShape);

    return transformGroup1;
  }

  private void setTexture(Appearance appearance, String image)
  {
    Texture texture = ThreeDeeUtil.loadTexture(image, canvas);
    texture.setBoundaryModeS(Texture.WRAP);
    texture.setBoundaryModeT(Texture.WRAP);
    appearance.setTexture(texture);

    TextureAttributes textureAttributes = new TextureAttributes();
    textureAttributes.setTextureMode(TextureAttributes.MODULATE);
    appearance.setTextureAttributes(textureAttributes);
  }
}
