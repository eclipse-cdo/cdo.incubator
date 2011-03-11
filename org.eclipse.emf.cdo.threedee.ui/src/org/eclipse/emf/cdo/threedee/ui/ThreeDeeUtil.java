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
package org.eclipse.emf.cdo.threedee.ui;

import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.WrappedException;

import com.sun.j3d.utils.image.TextureLoader;

import javax.media.j3d.Appearance;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Group;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.Texture;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.vecmath.Color3f;
import javax.vecmath.Color4f;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeUtil
{
  /**
   * See http://stackoverflow.com/questions/507987/how-can-i-make-java3d-start-faster !!!
   */
  public static Canvas3D createCanvas(Frame frame)
  {
    GraphicsConfiguration config = frame.getGraphicsConfiguration();
    GraphicsDevice device = config.getDevice();
  
    GraphicsConfigTemplate3D template = new GraphicsConfigTemplate3D();
    config = device.getBestConfiguration(template);
  
    return new Canvas3D(config);
  }

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
    Material mat = new Material(color, black, color, white, 70.0f);
    ap.setTextureAttributes(texAttr);
    ap.setMaterial(mat);
    ap.setTexture(texture);
    ColoringAttributes ca = new ColoringAttributes(color, ColoringAttributes.NICEST);
    ap.setColoringAttributes(ca);
    return ap;
  }

  public static Appearance getDefaultAppearance(Color color)
  {
    return ThreeDeeUtil.getDefaultAppearance(new Color3f(color));
  }

  public static Vector3f getPosition(Node shape)
  {
    Transform3D positionTrans = new Transform3D();
    shape.getLocalToVworld(positionTrans);

    Vector3f locationVec = new Vector3f();
    positionTrans.get(locationVec);

    float[] flo = new float[3];
    locationVec.get(flo);
    return locationVec;
  }

  public static Point3f getPositionAsPoint3f(Node shape)
  {
    Transform3D positionTrans = new Transform3D();
    shape.getLocalToVworld(positionTrans);

    Vector3f locationVec = new Vector3f();
    positionTrans.get(locationVec);

    return new Point3f(locationVec);
  }

  public static void enablePicking(Node node)
  {
    node.setCapability(Node.ENABLE_PICK_REPORTING);
    node.setPickable(true);

    if (node instanceof Group)
    {
      Group group = (Group)node;
      for (Enumeration<?> e = group.getAllChildren(); e.hasMoreElements();)
      {
        enablePicking((Node)e.nextElement());
      }
    }

    // try
    // {
    // Shape3D shape = (Shape3D)node;
    // PickTool.setCapabilities(node, PickTool.INTERSECT_FULL);
    // for (Enumeration<?> e = shape.getAllGeometries(); e.hasMoreElements();)
    // {
    // Geometry g = (Geometry)e.nextElement();
    // g.setCapability(Geometry.ALLOW_INTERSECT);
    // }
    // }
    // catch (ClassCastException e)
    // {
    // // Not a Shape3D node ignore exception
    // }
  }

  public static Texture loadTexture(String image, Component observer)
  {
    URL url;

    try
    {
      url = new URL(OM.BUNDLE.getBaseURL().toString() + "images/" + image);
    }
    catch (MalformedURLException ex)
    {
      throw WrappedException.wrap(ex);
    }

    TextureLoader loader = new TextureLoader(url, observer);
    return loader.getTexture();
  }
}
