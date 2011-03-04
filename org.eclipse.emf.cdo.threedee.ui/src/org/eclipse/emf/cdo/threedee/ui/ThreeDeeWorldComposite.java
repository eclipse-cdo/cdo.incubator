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
import org.eclipse.emf.cdo.threedee.ui.layouts.CuboidStarLayouter;
import org.eclipse.emf.cdo.threedee.ui.layouts.ILayout;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseWheelZoom;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewingPlatform;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldComposite extends Composite
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldComposite.class);

  private SimpleUniverse universe;

  private BranchGroup scene;

  private TransformGroup sphereTransformGroup;

  private ILayout layouter = new CuboidStarLayouter();// new SimpleLayouter();

  private PickCanvas pickCanvas;

  private Canvas3D canvas;

  public ThreeDeeWorldComposite(Composite parent, int style)
  {
    super(parent, style);
    init();
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private void init()
  {
    GraphicsConfigTemplate3D template = new GraphicsConfigTemplate3D();
    String stereo;

    // Check if the user has set the Java 3D stereo option.
    // Getting the system properties causes appletviewer to fail with a
    // security exception without a try/catch.

    stereo = (String)java.security.AccessController.doPrivileged(new java.security.PrivilegedAction()
    {
      public Object run()
      {
        return System.getProperty("j3d.stereo");
      }
    });

    // update template based on properties.
    if (stereo != null)
    {
      if (stereo.equals("REQUIRED"))
      {
        template.setStereo(GraphicsConfigTemplate.REQUIRED);
      }
      else if (stereo.equals("PREFERRED"))
      {
        template.setStereo(GraphicsConfigTemplate.PREFERRED);
      }
    }

    for (GraphicsDevice graphicsDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices())
    {
      try
      {
        GraphicsConfiguration config = graphicsDevice.getBestConfiguration(template);

        canvas = new Canvas3D(config);

        universe = new SimpleUniverse(canvas);

        positionViewer(universe.getViewingPlatform());
        scene = createScene();
        addNavigation(scene);

        // add the branch group to the locale (which is the root)
        universe.addBranchGraph(scene);

        universe.addBranchGraph(createCoordinateSystem());

        Frame frame = SWT_AWT.new_Frame(this);

        frame.add(canvas); // Can fail on multi display systems

        pickCanvas = new PickCanvas(canvas, scene);
        pickCanvas.setMode(PickCanvas.BOUNDS);
        canvas.addMouseListener(new PickingMouseListener());
        return;
      }
      catch (Exception ex)
      {
        // Try next display
      }
    }

    throw new IllegalStateException("Could not initialize");
  }

  public void addNode(Node node)
  {
    BranchGroup branchGroup = new BranchGroup();
    TransformGroup transformGroup = createTransformGroup();

    positionNewObject(transformGroup, node);

    addChild(transformGroup, node);
    branchGroup.addChild(transformGroup);
    universe.addBranchGraph(branchGroup);
  }

  private void addNavigation(BranchGroup branchGroup)
  {
    TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
    addKeyNavigation(branchGroup, viewTransformGroup);
    addMouseNavigation(branchGroup, viewTransformGroup);
  }

  private void addMouseNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), 100f);

    MouseTranslate mouseTranslate = new MouseTranslate();
    mouseTranslate.setTransformGroup(viewTransformGroup);
    mouseTranslate.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseTranslate);

    MouseWheelZoom mouseZoom = new MouseWheelZoom();
    mouseZoom.setTransformGroup(viewTransformGroup);
    mouseZoom.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseZoom);

    MouseRotate mouseRotate = new MouseRotate();
    mouseRotate.setTransformGroup(viewTransformGroup);
    mouseRotate.setSchedulingBounds(mouseZone);
    branchGroup.addChild(mouseRotate);
  }

  private void addKeyNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    KeyNavigatorBehavior keyInteractor = new KeyNavigatorBehavior(viewTransformGroup);
    BoundingSphere movingBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    keyInteractor.setSchedulingBounds(movingBounds);
    branchGroup.addChild(keyInteractor);
  }

  private void positionNewObject(TransformGroup transformGroup, Node node)
  {
    Vector3f vector = layouter.getAvailablePosition(node);
    Transform3D t3d = new Transform3D();
    t3d.setTranslation(vector);
    transformGroup.setTransform(t3d);

    if (TRACER.isEnabled())
    {
      TRACER.format("Bounds: {0}", node.getBounds()); //$NON-NLS-1$
    }
  }

  // private void addMouseListeners(Canvas3D canvas, Frame frame)
  // {
  // MouseListener listener = new MouseListener();
  // canvas.addMouseMotionListener(listener);
  // frame.addMouseMotionListener(listener);
  // canvas.addMouseListener(listener);
  //
  // frame.addMouseListener(listener);
  // }

  public void positionViewer(ViewingPlatform vp)
  {
    TransformGroup tg1 = vp.getViewPlatformTransform();
    Transform3D t3d = new Transform3D();
    tg1.getTransform(t3d);
    vp.setNominalViewingTransform();
  }

  public BranchGroup createScene()
  {
    BranchGroup scene = new BranchGroup();
    addLights(scene);
    sphereTransformGroup = createTransformGroup();

    scene.addChild(sphereTransformGroup);
    return scene;
  }

  private TransformGroup createTransformGroup()
  {
    TransformGroup sphereTransformGroup = new TransformGroup();
    sphereTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    sphereTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

    return sphereTransformGroup;
  }

  public void addChild(javax.media.j3d.Group parent, javax.media.j3d.Node child)
  {
    parent.addChild(child);
  }

  private BranchGroup createCoordinateSystem()
  {
    BranchGroup group = new BranchGroup();

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
      group.addChild(tg);
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
      group.addChild(tg);
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
      group.addChild(tg);
    }

    return group;
  }

  public static void addLights(BranchGroup group)
  {
    Color3f light1Color = new Color3f(0.7f, 0.8f, 0.8f);
    BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
    DirectionalLight light1 = new DirectionalLight(light1Color, light1Direction);
    light1.setInfluencingBounds(bounds);
    group.addChild(light1);
    AmbientLight light2 = new AmbientLight(new Color3f(0.3f, 0.3f, 0.3f));
    light2.setInfluencingBounds(bounds);
    group.addChild(light2);
  }

  public void addReferenceShape(Node shapeLine)
  {
    TransformGroup transformGroupLine = new TransformGroup();
    addChild(transformGroupLine, shapeLine);

    BranchGroup branchGroup = new BranchGroup();

    branchGroup.addChild(transformGroupLine);
    universe.addBranchGraph(branchGroup);
  }

  /*
 * 
 */
  private class PickingMouseListener implements MouseListener
  {
    public void mouseClicked(MouseEvent e)
    {
      pickCanvas.setShapeLocation(e);
      System.out.println(getPosition(e));
      PickResult result = pickCanvas.pickClosest();

      if (result == null)
      {

        System.out.println("Nothing picked");

      }
      else
      {
        Primitive p = (Primitive)result.getNode(PickResult.PRIMITIVE);
        Shape3D s = (Shape3D)result.getNode(PickResult.SHAPE3D);

        if (p != null)
        {
          System.out.println(p.getClass().getName());
        }
        else if (s != null)
        {
          System.out.println(s.getClass().getName());
        }
        else
        {
          System.out.println("null");
        }
      }
    }

    public void mouseEntered(MouseEvent arg0)
    {
    }

    public void mouseExited(MouseEvent arg0)
    {
    }

    public void mousePressed(MouseEvent arg0)
    {
    }

    public void mouseReleased(MouseEvent arg0)
    {
    }

    public Point3d getPosition(MouseEvent event)
    {
      Point3d eyePos = new Point3d();
      Point3d mousePos = new Point3d();
      canvas.getCenterEyeInImagePlate(eyePos);
      canvas.getPixelLocationInImagePlate(event.getX(), event.getY(), mousePos);
      Transform3D transform = new Transform3D();
      canvas.getImagePlateToVworld(transform);
      transform.transform(eyePos);
      transform.transform(mousePos);
      Vector3d direction = new Vector3d(eyePos);
      direction.sub(mousePos);
      // three points on the plane
      Point3d p1 = new Point3d(.5, -.5, .5);
      Point3d p2 = new Point3d(.5, .5, .5);
      Point3d p3 = new Point3d(-.5, .5, .5);
      Transform3D currentTransform = new Transform3D();
      scene.getLocalToVworld(currentTransform);
      currentTransform.transform(p1);
      currentTransform.transform(p2);
      currentTransform.transform(p3);
      Point3d intersection = getIntersection(eyePos, mousePos, p1, p2, p3);
      currentTransform.invert();
      currentTransform.transform(intersection);
      return intersection;
    }

    /**
     * Returns the point where a line crosses a plane
     */
    Point3d getIntersection(Point3d line1, Point3d line2, Point3d plane1, Point3d plane2, Point3d plane3)
    {
      Vector3d p1 = new Vector3d(plane1);
      Vector3d p2 = new Vector3d(plane2);
      Vector3d p3 = new Vector3d(plane3);
      Vector3d p2minusp1 = new Vector3d(p2);
      p2minusp1.sub(p1);
      Vector3d p3minusp1 = new Vector3d(p3);
      p3minusp1.sub(p1);
      Vector3d normal = new Vector3d();
      normal.cross(p2minusp1, p3minusp1);
      // The plane can be defined by p1, n + d = 0
      double d = -p1.dot(normal);
      Vector3d i1 = new Vector3d(line1);
      Vector3d direction = new Vector3d(line1);
      direction.sub(line2);
      double dot = direction.dot(normal);
      if (dot == 0)
      {
        return null;
      }
      double t = (-d - i1.dot(normal)) / dot;
      Vector3d intersection = new Vector3d(line1);
      Vector3d scaledDirection = new Vector3d(direction);
      scaledDirection.scale(t);
      intersection.add(scaledDirection);
      Point3d intersectionPoint = new Point3d(intersection);
      return intersectionPoint;
    }
  }

}
