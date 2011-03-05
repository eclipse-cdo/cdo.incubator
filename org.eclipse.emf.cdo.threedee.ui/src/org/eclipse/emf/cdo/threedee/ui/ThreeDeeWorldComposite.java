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
import org.eclipse.emf.cdo.threedee.ui.nodes.ContainmentGroup;

import org.eclipse.net4j.util.concurrent.QueueRunner;
import org.eclipse.net4j.util.om.trace.ContextTracer;
import org.eclipse.net4j.util.ui.UIQueueRunner;

import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
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
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldComposite extends Composite
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldComposite.class);

  private QueueRunner runner;

  private SimpleUniverse universe;

  private BranchGroup scene;

  private TransformGroup sphereTransformGroup;

  private ILayout layouter = new CuboidStarLayouter();// new SimpleLayouter();

  private Canvas3D canvas;

  public ThreeDeeWorldComposite(Composite parent, int style)
  {
    super(parent, style);

    runner = new UIQueueRunner(parent.getDisplay());
    runner.activate();
    runner.addWork(new Runnable()
    {
      public void run()
      {
        init();
      }
    });
  }

  private void init()
  {
    Frame frame = SWT_AWT.new_Frame(this);
    canvas = createCanvas(frame);

    universe = new SimpleUniverse(canvas);
    positionViewer(universe.getViewingPlatform());

    scene = createScene();
    addNavigation(scene);

    universe.addBranchGraph(scene);
    universe.addBranchGraph(createCoordinateSystem());

    frame.add(canvas);
  }

  private Canvas3D createCanvas(Frame frame)
  {
    GraphicsConfiguration config = frame.getGraphicsConfiguration();
    GraphicsDevice device = config.getDevice();

    GraphicsConfigTemplate3D template = new GraphicsConfigTemplate3D();
    config = device.getBestConfiguration(template);

    return new Canvas3D(config);
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

  private BranchGroup createScene()
  {
    BranchGroup scene = new BranchGroup();
    addLights(scene);
    sphereTransformGroup = createTransformGroup();

    scene.addChild(sphereTransformGroup);
    return scene;
  }

  @Override
  public void dispose()
  {
    runner.deactivate();
    super.dispose();
  }

  public void addNode(final Node node, final ContainmentGroup containerContainmentGroup)
  {
    runner.addWork(new Runnable()
    {
      public void run()
      {
        if (containerContainmentGroup == null)
        {
          BranchGroup branchGroup = new BranchGroup();
          TransformGroup transformGroup = createTransformGroup();

          positionNewObject(transformGroup, node);

          addChild(transformGroup, node);
          branchGroup.addChild(transformGroup);
          branchGroup.compile();
          universe.addBranchGraph(branchGroup);
        }
        else
        {
          BranchGroup group = new BranchGroup();
          group.addChild(node);
          group.compile();
          containerContainmentGroup.addChild(group);
        }
      }
    });
  }

  public void addReferenceShape(final Node shapeLine)
  {
    runner.addWork(new Runnable()
    {
      public void run()
      {
        TransformGroup transformGroupLine = new TransformGroup();
        addChild(transformGroupLine, shapeLine);
        BranchGroup branchGroup = new BranchGroup();
        branchGroup.addChild(transformGroupLine);
        universe.addBranchGraph(branchGroup);
      }
    });
  }

  private void addNavigation(BranchGroup branchGroup)
  {
    TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
    addKeyNavigation(branchGroup, viewTransformGroup);
    addMouseNavigation(branchGroup, viewTransformGroup);
  }

  private void addMouseNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Double.MAX_VALUE);

    OrbitBehavior ob = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_TRANSLATE | OrbitBehavior.REVERSE_ROTATE);
    ob.setSchedulingBounds(mouseZone);
    universe.getViewingPlatform().setViewPlatformBehavior(ob);
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

  private void positionViewer(ViewingPlatform vp)
  {
    TransformGroup tg1 = vp.getViewPlatformTransform();
    Transform3D t3d = new Transform3D();
    tg1.getTransform(t3d);
    vp.setNominalViewingTransform();
  }

  private TransformGroup createTransformGroup()
  {
    TransformGroup sphereTransformGroup = new TransformGroup();
    sphereTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    sphereTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

    return sphereTransformGroup;
  }

  private void addChild(javax.media.j3d.Group parent, javax.media.j3d.Node child)
  {
    parent.addChild(child);
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
}
