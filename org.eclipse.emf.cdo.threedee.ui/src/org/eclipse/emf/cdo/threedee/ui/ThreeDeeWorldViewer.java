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

import org.eclipse.emf.cdo.threedee.Frontend;
import org.eclipse.emf.cdo.threedee.Session;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;
import org.eclipse.emf.cdo.threedee.ui.layouts.CuboidStarLayouter;
import org.eclipse.emf.cdo.threedee.ui.layouts.ILayout;
import org.eclipse.emf.cdo.threedee.ui.nodes.ContainmentGroup;
import org.eclipse.emf.cdo.threedee.ui.nodes.DefaultShape;
import org.eclipse.emf.cdo.threedee.ui.nodes.INodeFactory;
import org.eclipse.emf.cdo.threedee.ui.nodes.ReferenceShape;

import org.eclipse.net4j.util.concurrent.QueueRunner;
import org.eclipse.net4j.util.om.trace.ContextTracer;
import org.eclipse.net4j.util.ui.UIQueueRunner;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

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
import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldViewer
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldViewer.class);

  private Map<Element, ContainmentGroup> containmentGroups = new HashMap<Element, ContainmentGroup>();

  private Map<Element, Map<Element, ReferenceShape>> elementReferenceMapping = new HashMap<Element, Map<Element, ReferenceShape>>();

  private Composite container;

  private QueueRunner runner;

  private SimpleUniverse universe;

  private BranchGroup scene;

  private TransformGroup sphereTransformGroup;

  private ILayout layouter = new CuboidStarLayouter();// new SimpleLayouter();

  private Canvas3D canvas;

  public ThreeDeeWorldViewer(Composite parent)
  {
    container = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
    container.setLayout(new FillLayout());

    runner = new UIQueueRunner(parent.getDisplay());
    runner.activate();
    runner.addWork(new Runnable()
    {
      public void run()
      {
        init();
      }
    });

    for (Session session : Frontend.INSTANCE.getElements())
    {
      Element rootElement = session.getRootElement();
      if (rootElement != null && !containmentGroups.containsKey(rootElement))
      {
        addElement(rootElement);
      }
    }
  }

  private void init()
  {
    Frame frame = SWT_AWT.new_Frame(container);
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

  private BranchGroup createScene()
  {
    BranchGroup scene = new BranchGroup();
    addLights(scene);
    sphereTransformGroup = createTransformGroup();

    scene.addChild(sphereTransformGroup);
    return scene;
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

  public Control getControl()
  {
    return container;
  }

  public void addElement(Element element)
  {
    if (containmentGroups.containsKey(element))
    {
      return;
    }

    ContainmentGroup containerContainmentGroup = getContainerContainmentGroup(element);
    ContainmentGroup containmentGroup = (ContainmentGroup)createNode(element);

    ElementProvider provider = element.getProvider();

    Map<Integer, Boolean> references = element.getReferences();
    createChildren(containmentGroup, provider, references);

    // it is important to add the parent at last, otherwise it would become alive and nodes cannot be added anymore
    addNode(containmentGroup, containerContainmentGroup);
  }

  public void removeElement(Element element)
  {
    ContainmentGroup containmentGroup = containmentGroups.remove(element);

    Element containerElement = getContainerElement(element);

    if (containerElement != null)
    {
      containerElement.getReferences().remove(element.getID());
    }

    if (containmentGroup == null)
    {
      return;
    }

    ContainmentGroup containerContainmentGroup = getContainerContainmentGroup(element);
    removeNode(containmentGroup, containerContainmentGroup);
    clearReferenceNodes(element);

    if (containerContainmentGroup != null)
    {
      clearReferenceNodes(element.getProvider().getElement(element.getContainerID()));

      updateReferences(containerElement);
      layout(null, containerContainmentGroup);
    }
  }

  private Element getContainerElement(Element element)
  {
    return element.getProvider().getElement(element.getContainerID());
  }

  private void clearReferenceNodes(Element element)
  {
    Map<Element, ReferenceShape> map = elementReferenceMapping.get(element);
    if (map != null)
    {
      for (ReferenceShape shape : map.values())
      {

        universe.getLocale().removeBranchGraph((BranchGroup)shape.getParent().getParent());
      }

      elementReferenceMapping.remove(element);
    }
  }

  protected ContainmentGroup getContainerContainmentGroup(Element element)
  {
    Element containerElement = getContainerElement(element);
    ContainmentGroup containerContainmentGroup = containmentGroups.get(containerElement);
    return containerContainmentGroup;
  }

  private void createChildren(ContainmentGroup shape, ElementProvider provider, Map<Integer, Boolean> references)
  {
    for (int elementId : references.keySet())
    {
      Element referenceElement = provider.getElement(elementId);

      Node referenceNode = containmentGroups.get(referenceElement);

      if (referenceNode == null)
      {
        referenceNode = createNode(referenceElement);
        shape.addChild(referenceNode);
        createChildren((ContainmentGroup)referenceNode, provider, referenceElement.getReferences());
      }
    }
  }

  private Node createNode(Element element)
  {
    String name = element.getDescriptor().getName();
    INodeFactory factory = INodeFactory.Registry.INSTANCE.get(name);
    Node shape = factory != null ? factory.createNode(element) : new DefaultShape(element);

    ContainmentGroup group = new ContainmentGroup(element);
    group.setShape(shape);

    containmentGroups.put(element, group);
    return group;
  }

  public void filter(Set<ElementDescriptor> toBeHidden)
  {
    for (ContainmentGroup node : containmentGroups.values())
    {
      ElementDescriptor descriptor = node.getElement().getDescriptor();
      node.setVisible(!toBeHidden.contains(descriptor));
    }
  }

  public void dispose()
  {
    runner.deactivate();
    container.dispose();
  }

  public boolean schedule(Runnable runnable)
  {
    return runner.addWork(runnable);
  }

  public void addNode(final Node node, final ContainmentGroup containerContainmentGroup)
  {
    schedule(new Runnable()
    {
      public void run()
      {
        if (containerContainmentGroup == null)
        {
          TransformGroup transformGroup = createTransformGroup();
          positionNewObject(transformGroup, node);

          addChild(transformGroup, node);

          BranchGroup branchGroup = new BranchGroup();
          branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
          branchGroup.addChild(transformGroup);

          universe.addBranchGraph(branchGroup);
        }
        else
        {
          containerContainmentGroup.addChild(node);
        }
        layout((ContainmentGroup)node, containerContainmentGroup);
        Element element = ((ContainmentGroup)node).getElement();
        Element containerElement = getContainerElement(element);
        if (containerElement != null)
        {
          updateReferences(containerElement);
        }
        else
        {
          updateReferences(element);
        }
      }
    });
  }

  public void addReferenceShape(final Node shapeLine)
  {
    schedule(new Runnable()
    {
      public void run()
      {
        TransformGroup transformGroupLine = new TransformGroup();
        addChild(transformGroupLine, shapeLine);

        BranchGroup branchGroup = new BranchGroup();
        branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
        branchGroup.addChild(transformGroupLine);

        universe.addBranchGraph(branchGroup);
      }
    });
  }

  public void removeNode(final ContainmentGroup containmentGroup, final ContainmentGroup containerContainmentGroup)
  {
    schedule(new Runnable()
    {
      public void run()
      {
        if (containerContainmentGroup != null)
        {
          containerContainmentGroup.removeChild(containmentGroup);
          layout(null, containerContainmentGroup);
        }
        else
        {
          universe.getLocale().removeBranchGraph(containmentGroup);
        }
      }
    });
  }

  public void layout(final ContainmentGroup containmentGroup, final ContainmentGroup containerContainmentGroup)
  {
    if (containerContainmentGroup != null)
    {
      containerContainmentGroup.layoutChildren();
    }
    else
    {
      containmentGroup.layoutChildren();
    }
  }

  private void updateReferences(Element element)
  {
    ElementProvider provider = element.getProvider();
    Map<Integer, Boolean> references = element.getReferences();

    for (int elementId : references.keySet())
    {
      Map<Element, ReferenceShape> map = elementReferenceMapping.get(element);
      Element referenceElement = provider.getElement(elementId);
      ReferenceShape referenceShape;
      if (map == null)
      {
        map = new HashMap<Element, ReferenceShape>();
        elementReferenceMapping.put(element, map);
        referenceShape = createAndSetReferenceShape(element, references, elementId, map, referenceElement);
      }
      else
      {
        referenceShape = map.get(referenceElement);
        if (referenceShape == null)
        {
          referenceShape = createAndSetReferenceShape(element, references, elementId, map, referenceElement);
        }
      }
      updateReference(element, referenceElement, referenceShape);
      updateReferences(referenceElement);
    }
  }

  private ReferenceShape createAndSetReferenceShape(Element element, Map<Integer, Boolean> references, int elementId,
      Map<Element, ReferenceShape> map, Element referenceElement)
  {
    ReferenceShape referenceShape;
    referenceShape = createReferenceShape(element, referenceElement, references.get(elementId));
    addReferenceShape(referenceShape);
    map.put(referenceElement, referenceShape);
    return referenceShape;
  }

  private ReferenceShape createReferenceShape(Element from, Element to, boolean isContainment)
  {
    return new ReferenceShape(isContainment);
  }

  private void updateReference(Element from, Element to, ReferenceShape referenceNode)
  {
    Node shape = containmentGroups.get(from).getShape();
    Assert.isNotNull(shape);

    Node referenceShape = containmentGroups.get(to).getShape();
    Assert.isNotNull(referenceShape);

    Point3f elementPosition = ThreeDeeWorldUtil.getPositionAsPoint3f(shape);
    Point3f referencePosition = ThreeDeeWorldUtil.getPositionAsPoint3f(referenceShape);

    if (TRACER.isEnabled())
    {
      TRACER.format("Drawing connection from {0} to {1}", elementPosition, referencePosition); //$NON-NLS-1$
    }

    Point3f[] points = new Point3f[2];
    points[0] = elementPosition;
    points[1] = referencePosition;
    LineArray lineArray = new LineArray(2, LineArray.COORDINATES);
    lineArray.setCoordinates(0, points);
    referenceNode.setGeometry(lineArray);
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
