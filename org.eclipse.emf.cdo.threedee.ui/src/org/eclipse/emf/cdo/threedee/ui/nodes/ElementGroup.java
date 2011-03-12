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

import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

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

  private BranchGroup selection;

  public ElementGroup(Element element, Canvas3D canvas)
  {
    super(element, createAppearance(element, canvas));
  }

  @Override
  public ElementSphere getShape()
  {
    return (ElementSphere)super.getShape();
  }

  public void select(boolean selected)
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

      selection = new BranchGroup();
      selection.setCapability(ALLOW_DETACH);
      selection.addChild(selectionShape);

      addChild(selection);
      getSelectionThread().add(selection, transparencyAttributes);
    }
    else
    {
      if (selection != null)
      {
        getSelectionThread().remove(selection);
        selection.detach();
        selection = null;
      }
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

    // ThreeDeeUtil.setTexture(appearance, "moon.jpg", canvas);

    return appearance;
  }

  /**
   * @author Eike Stepper
   */
  private static final class SelectionThread extends Thread
  {
    private Map<BranchGroup, TransparencyAttributes> selections = new HashMap<BranchGroup, TransparencyAttributes>();

    private double theta;

    public SelectionThread()
    {
      setDaemon(true);
    }

    public synchronized TransparencyAttributes[] getSelections()
    {
      return selections.values().toArray(new TransparencyAttributes[selections.size()]);
    }

    public synchronized void add(BranchGroup selection, TransparencyAttributes transparencyAttributes)
    {
      selections.put(selection, transparencyAttributes);
    }

    public synchronized void remove(BranchGroup selection)
    {
      selections.remove(selection);
    }

    @Override
    public void run()
    {
      while (!interrupted())
      {
        float alpha = (float)Math.abs(Math.cos(theta));
        for (TransparencyAttributes transparencyAttributes : getSelections())
        {
          transparencyAttributes.setTransparency(alpha);
        }

        theta += 0.02f;
        if (theta > TWO_PI)
        {
          theta -= TWO_PI;
        }

        ConcurrencyUtil.sleep(5);
      }
    }
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
}
