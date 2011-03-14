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

import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Martin Fluegge
 */
public class ElementGroup extends ThreeDeeNode<Element> implements IColors
{
  private static final double SPHERE_DISTANCE = 2.0d * ElementSphere.RADIUS + 0.08d;

  private static final double PI = Math.PI;

  private static final double TWO_PI = 2.0d * PI;

  private static final double HALF_PI = 0.5d * PI;

  private static final double THREE_HALF_PI = PI + HALF_PI;

  private static SelectionThread selectionThread;

  public ElementGroup(ThreeDeeWorld world, Element element)
  {
    super(world, element, createAppearance(element, world == null ? null : world.getCanvas()));
  }

  @Override
  public ElementSphere getShape()
  {
    return (ElementSphere)super.getShape();
  }

  public boolean isSelected()
  {
    return getSelectionThread().isSelected(this);
  }

  public void setSelected(boolean selected)
  {
    if (selected)
    {
      TransparencyAttributes transparencyAttributes = new TransparencyAttributes();
      transparencyAttributes.setCapability(TransparencyAttributes.ALLOW_VALUE_WRITE);
      transparencyAttributes.setTransparencyMode(TransparencyAttributes.NICEST);
      transparencyAttributes.setTransparency(1f);

      Appearance appearance = ThreeDeeUtil.getDefaultAppearance(white);
      appearance.setTransparencyAttributes(transparencyAttributes);

      float radius = ElementSphere.RADIUS * 1.4f;
      Sphere selectionShape = new Sphere(radius, Primitive.GENERATE_NORMALS, 32, appearance);

      getSelectionThread().add(this, selectionShape);
    }
    else
    {
      getSelectionThread().remove(this);
    }
  }

  private static synchronized SelectionThread getSelectionThread()
  {
    if (selectionThread == null)
    {
      selectionThread = new SelectionThread();
      selectionThread.start();
    }

    return selectionThread;
  }

  @Override
  protected void layout(ThreeDeeNode<Element>[] children, int n)
  {
    double circumference = SPHERE_DISTANCE * n;
    double radius = circumference / TWO_PI;
    double distanceAngle = TWO_PI / n;
    double phi = 0.0d;

    for (int i = 0; i < n; i++)
    {
      ElementGroup child = (ElementGroup)children[i];

      double x = radius * Math.cos(phi);
      double y = radius * Math.sin(phi);

      Transform3D transform = new Transform3D();
      Vector3d translation = new Vector3d(x, y, 1.0d + radius);
      transform.setTranslation(translation);

      double scalarProductX = -y / x;
      double scalarProductY = 1.0d;
      double rotationAngle = 0.75d;
      if (HALF_PI < phi && phi < THREE_HALF_PI)
      {
        rotationAngle = -rotationAngle;
      }

      AxisAngle4d rotation = new AxisAngle4d(scalarProductX, scalarProductY, 0.0d, rotationAngle);
      transform.setRotation(rotation);

      child.setTransform(transform);

      Point3f point = new Point3f((float)translation.getX(), (float)translation.getY(), (float)translation.getZ());
      Point3f[] points = { new Point3f(), point };

      LineArray lineArray = new LineArray(2, LineArray.COORDINATES);
      lineArray.setCoordinates(0, points);

      child.layout();

      phi += distanceAngle;
    }
  }

  @Override
  protected Node createShape(Appearance appearance)
  {
    return new ElementSphere(appearance);
  }

  private static Appearance createAppearance(Element element, Canvas3D canvas)
  {
    Color color = element.getDescriptor().getColor().getValue();

    Appearance appearance = ThreeDeeUtil.getDefaultAppearance(color);
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);

    RenderingAttributes renderingAttributes = new RenderingAttributes();
    renderingAttributes.setCapability(RenderingAttributes.ALLOW_VISIBLE_WRITE);
    appearance.setRenderingAttributes(renderingAttributes);

    // Texture texture = ThreeDeeUtil.loadTexture("moon.jpg", canvas);
    // appearance.setTexture(texture);

    return appearance;
  }

  /**
   * @author Eike Stepper
   */
  public final class ElementSphere extends Sphere
  {
    public static final float RADIUS = .1f;

    public ElementSphere(Appearance appearance)
    {
      super(RADIUS, Primitive.GENERATE_NORMALS, 32, appearance);
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class SelectionThread extends Thread
  {
    private Map<ElementGroup, Node> selectionShapes = new HashMap<ElementGroup, Node>();

    private double theta;

    public SelectionThread()
    {
      setDaemon(true);
    }

    public synchronized boolean isSelected(ElementGroup elementGroup)
    {
      return selectionShapes.containsKey(elementGroup);
    }

    public synchronized void add(ElementGroup elementGroup, Node selectionShape)
    {
      BranchGroup branchGroup = new BranchGroup();
      branchGroup.setCapability(ALLOW_DETACH);
      branchGroup.addChild(selectionShape);

      elementGroup.addChild(branchGroup);
      selectionShapes.put(elementGroup, selectionShape);
    }

    public synchronized void remove(ElementGroup elementGroup)
    {
      Node selectionShape = selectionShapes.remove(elementGroup);
      if (selectionShape != null)
      {
        BranchGroup branchGroup = (BranchGroup)selectionShape.getParent();
        branchGroup.detach();
      }

    }

    @Override
    public void run()
    {
      while (!interrupted())
      {
        float alpha = (float)Math.abs(Math.cos(theta));

        for (Entry<ElementGroup, Node> entry : getSelections())
        {
          ElementGroup elementGroup = entry.getKey();
          Node node = entry.getValue();

          Appearance appearance;
          if (node instanceof Shape3D)
          {
            Shape3D selectionShape = (Shape3D)node;
            appearance = selectionShape.getAppearance();
          }
          else
          {
            Primitive selectionShape = (Primitive)node;
            appearance = selectionShape.getAppearance();
          }

          float transparency = elementGroup.isVisible() ? alpha : 1f;
          appearance.getTransparencyAttributes().setTransparency(transparency);
        }

        theta += 0.02f;
        if (theta > TWO_PI)
        {
          theta -= TWO_PI;
        }

        ConcurrencyUtil.sleep(5);
      }
    }

    @SuppressWarnings("unchecked")
    private synchronized Entry<ElementGroup, Node>[] getSelections()
    {
      return selectionShapes.entrySet().toArray(new Entry[selectionShapes.size()]);
    }
  }
}
