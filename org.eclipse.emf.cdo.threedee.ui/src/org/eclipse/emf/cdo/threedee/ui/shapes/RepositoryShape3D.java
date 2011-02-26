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
package org.eclipse.emf.cdo.threedee.ui.shapes;

import org.eclipse.emf.cdo.threedee.ui.util.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.image.TextureLoader;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Material;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.vecmath.Color3f;
import javax.vecmath.Color4f;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author Martin Fluegge
 */
public class RepositoryShape3D extends Box
{
  private TextureLoader loader;

  private Texture texture;

  public RepositoryShape3D(float f, float g, float h, int generateTextureCoords, Appearance appearance)
  {
    super(f, g, h, generateTextureCoords, appearance);
    createDefaultAppearance();
  }

  private void createDefaultAppearance()
  {
    setCapability(Box.ENABLE_APPEARANCE_MODIFY);
    setCapability(Box.GEOMETRY_NOT_SHARED);

    getShape(Box.TOP).setAppearance(ThreeDeeWorldUtil.getDefaultAppearance(Color.magenta));
    getShape(Box.BOTTOM).setAppearance(ThreeDeeWorldUtil.getDefaultAppearance(Color.orange));
    getShape(Box.RIGHT).setAppearance(ThreeDeeWorldUtil.getDefaultAppearance(Color.red));
    getShape(Box.LEFT).setAppearance(ThreeDeeWorldUtil.getDefaultAppearance(Color.green));
    getShape(Box.BACK).setAppearance(ThreeDeeWorldUtil.getDefaultAppearance(new Color3f(Color.yellow)));

    try
    {
      createFrontImage();
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
  }

  private void createFrontImage() throws IOException
  {
    Appearance ap = ThreeDeeWorldUtil.getDefaultAppearance(new Color3f(Color.blue));
    ap.setCapability(Appearance.ALLOW_TEXTURE_WRITE);
    ap.setCapability(Appearance.ALLOW_TEXGEN_WRITE);

    Shape3D frontShape = getShape(Box.FRONT);
    frontShape.setAppearance(ap);
    // BufferedImage frontImage = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);

    // BufferedImage frontImage = ImageIO.read(new File(
    // "D:\\Development\\CDO_EclipseCon\\org.eclipse.emf.cdo.threedee.ui\\icons\\Eike2.jpg"));
    //
    // addTexture(frontImage, frontShape);
  }

  public void addTexture(BufferedImage image, Shape3D shape)
  {
    // Graphics2D g = (Graphics2D)frontImage.getGraphics();
    // g.setColor(new Color(70, 70, 140));
    // g.fillRect(0, 0, imageWidth, imageHeight);
    shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
    Appearance appearance = shape.getAppearance();
    appearance.setCapability(Appearance.ALLOW_TEXTURE_ATTRIBUTES_WRITE);
    appearance.setCapability(Appearance.ALLOW_TEXTURE_WRITE);
    appearance.setCapability(Appearance.ALLOW_MATERIAL_WRITE);
    changeTexture(texture, image, shape, appearance);
    Color3f col = new Color3f(0.0f, 0.0f, 1.0f);
    ColoringAttributes ca = new ColoringAttributes(col, ColoringAttributes.NICEST);
    appearance.setColoringAttributes(ca);
  }

  public void changeTexture(Texture texture, BufferedImage image, Shape3D shape, Appearance appearance)
  {
    loader = new TextureLoader(image, "RGB", TextureLoader.ALLOW_NON_POWER_OF_TWO);
    texture = loader.getTexture();
    texture.setBoundaryModeS(Texture.CLAMP_TO_BOUNDARY);
    texture.setBoundaryModeT(Texture.CLAMP_TO_BOUNDARY);
    texture.setBoundaryColor(new Color4f(0.0f, 1.0f, 0.5f, 0f));
    // Set up the texture attributes
    // could be REPLACE, BLEND or DECAL instead of MODULATE

    // front = getAppearance(new Color3f(Color.YELLOW));
    Color3f black = new Color3f(0.0f, 0.0f, 0.0f);
    Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
    Color3f red = new Color3f(0.7f, .15f, .15f);
    appearance.setMaterial(new Material(red, black, red, white, 1.0f));
    TextureAttributes texAttr = new TextureAttributes();
    texAttr.setTextureMode(TextureAttributes.REPLACE);
    appearance.setTextureAttributes(texAttr);
    appearance.setTexture(texture);
    shape.setAppearance(appearance);
  }
}
