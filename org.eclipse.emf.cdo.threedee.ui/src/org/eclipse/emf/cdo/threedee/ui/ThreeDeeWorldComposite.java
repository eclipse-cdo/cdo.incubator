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
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewingPlatform;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

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

        Canvas3D canvas = new Canvas3D(config);
        universe = new SimpleUniverse(canvas);

        positionViewer(universe.getViewingPlatform());
        scene = createScene();
        addNavigation(scene);

        // compile objects should be better ???
        // contentBranchGroup.compile();

        // add the branch group to the locale (which is the root)
        universe.addBranchGraph(scene);
        universe.addBranchGraph(createCoordinateSystem());

        Frame frame = SWT_AWT.new_Frame(this);

        // addMouseListeners(canvas, frame);
        frame.add(canvas); // Can fail on multi display systems
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
    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Float.MAX_VALUE);

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
}
