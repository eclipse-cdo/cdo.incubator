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
import org.eclipse.emf.cdo.threedee.ui.nodes.ThreeDeeNode;

import org.eclipse.net4j.util.WrappedException;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Group;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.RestrictedAccessException;
import javax.media.j3d.Texture;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
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
  public static void addCoordinateSystem(SimpleUniverse universe)
  {
    BranchGroup coordinateSystem = new BranchGroup();

    // X axis made of spheres
    for (float x = -1.0f; x <= 1.0f; x = x + 0.1f)
    {
      Sphere sphere = new Sphere(0.02f);
      TransformGroup tg = new TransformGroup();
      Transform3D transform = new Transform3D();
      Vector3f vector = new Vector3f(x, .0f, .0f);
      transform.setTranslation(vector);
      tg.setTransform(transform);
      tg.addChild(sphere);
      coordinateSystem.addChild(tg);
    }

    // Y axis made of cones
    for (float y = -1.0f; y <= 1.0f; y = y + 0.1f)
    {
      TransformGroup tg = new TransformGroup();
      Transform3D transform = new Transform3D();
      Cone cone = new Cone(0.02f, 0.02f);
      Vector3f vector = new Vector3f(.0f, y, .0f);
      transform.setTranslation(vector);
      tg.setTransform(transform);
      tg.addChild(cone);
      coordinateSystem.addChild(tg);
    }

    // Z axis made of cylinders
    for (float z = -1.0f; z <= 1.0f; z = z + 0.1f)
    {
      TransformGroup tg = new TransformGroup();
      Transform3D transform = new Transform3D();
      Cylinder cylinder = new Cylinder(0.02f, 0.02f);
      Vector3f vector = new Vector3f(.0f, .0f, z);
      transform.setTranslation(vector);
      tg.setTransform(transform);
      tg.addChild(cylinder);
      coordinateSystem.addChild(tg);
    }

    universe.addBranchGraph(coordinateSystem);
  }

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

  public static void enablePicking(Node node, boolean pickable)
  {
    try
    {
      node.setCapability(Node.ENABLE_PICK_REPORTING);
    }
    catch (RestrictedAccessException ex)
    {
      // Ignore
    }

    try
    {
      node.setPickable(pickable);
    }
    catch (RestrictedAccessException ex)
    {
      // Ignore
    }

    if (node instanceof Group)
    {
      Group group = (Group)node;

      try
      {
        for (Enumeration<?> e = group.getAllChildren(); e.hasMoreElements();)
        {
          try
          {
            enablePicking((Node)e.nextElement(), pickable);
          }
          catch (RestrictedAccessException ex)
          {
            // Ignore
          }
        }
      }
      catch (RestrictedAccessException ex)
      {
        // Ignore
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

  @SuppressWarnings("rawtypes")
  public static ThreeDeeNode getThreeDeeNode(Node node)
  {
    if (node instanceof ThreeDeeNode)
    {
      return (ThreeDeeNode)node;
    }
    return getThreeDeeNode(node.getParent());
  }
}
