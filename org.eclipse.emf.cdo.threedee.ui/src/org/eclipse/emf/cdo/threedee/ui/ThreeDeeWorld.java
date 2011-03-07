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
import org.eclipse.emf.cdo.threedee.ui.layouts.CuboidStarLayout;
import org.eclipse.emf.cdo.threedee.ui.layouts.ILayout;
import org.eclipse.emf.cdo.threedee.ui.nodes.ElementGroup;
import org.eclipse.emf.cdo.threedee.ui.nodes.ReferenceShape;

import org.eclipse.net4j.util.concurrent.QueueRunner;
import org.eclipse.net4j.util.om.trace.ContextTracer;
import org.eclipse.net4j.util.ui.UIQueueRunner;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;
import com.sun.j3d.utils.picking.PickTool;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewingPlatform;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Group;
import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.View;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorld
{
  @SuppressWarnings("unused")
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorld.class);

  private Map<Element, ElementGroup> elementGroups = new HashMap<Element, ElementGroup>();

  private Map<Element, Map<Element, ReferenceShape>> referenceShapes = new HashMap<Element, Map<Element, ReferenceShape>>();

  private Composite composite;

  private QueueRunner runner;

  private SimpleUniverse universe;

  private BranchGroup scene;

  private TransformGroup sphereTransformGroup;

  private ILayout layout = new CuboidStarLayout();// new SimpleLayouter();

  private Canvas3D canvas;

  public ThreeDeeWorld(Composite parent)
  {
    composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
    composite.setLayout(new FillLayout());

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
      if (rootElement != null && !elementGroups.containsKey(rootElement))
      {
        addElement(rootElement);
      }
    }
  }

  private void init()
  {
    Frame frame = SWT_AWT.new_Frame(composite);

    canvas = createCanvas(frame);
    universe = new SimpleUniverse(canvas);
    scene = createScene(canvas);

    universe.addBranchGraph(scene);
    universe.addBranchGraph(createCoordinateSystem());

    setNominalTransform();
    frame.add(canvas);
    createPicking(canvas, scene);
  }

  private Canvas3D createCanvas(Frame frame)
  {
    GraphicsConfiguration config = frame.getGraphicsConfiguration();
    GraphicsDevice device = config.getDevice();

    GraphicsConfigTemplate3D template = new GraphicsConfigTemplate3D();
    config = device.getBestConfiguration(template);

    return new Canvas3D(config);
  }

  private BranchGroup createScene(Canvas3D canvas)
  {
    BranchGroup scene = new BranchGroup();
    createLights(scene);
    createNavigation(scene);

    sphereTransformGroup = createTransformGroup();
    scene.addChild(sphereTransformGroup);
    return scene;
  }

  private void createLights(BranchGroup group)
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

  private void createNavigation(BranchGroup branchGroup)
  {
    TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
    createKeyNavigation(branchGroup, viewTransformGroup);
    createMouseNavigation(branchGroup, viewTransformGroup);
  }

  private void createMouseNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Double.MAX_VALUE);

    OrbitBehavior ob = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_TRANSLATE | OrbitBehavior.REVERSE_ROTATE);
    ob.setSchedulingBounds(mouseZone);
    universe.getViewingPlatform().setViewPlatformBehavior(ob);
  }

  private void createKeyNavigation(BranchGroup branchGroup, TransformGroup viewTransformGroup)
  {
    KeyNavigatorBehavior keyInteractor = new KeyNavigatorBehavior(viewTransformGroup);
    BoundingSphere movingBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    keyInteractor.setSchedulingBounds(movingBounds);
    branchGroup.addChild(keyInteractor);
  }

  private void createPicking(final Canvas3D canvas, final BranchGroup scene)
  {
    final PickCanvas pickCanvas = new PickCanvas(canvas, scene);
    pickCanvas.setMode(PickTool.BOUNDS);
    canvas.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent e)
      {
        pickCanvas.setShapeLocation(e);
        PickResult result = pickCanvas.pickClosest();
        if (result != null)
        {
          Node node = result.getNode(PickResult.PRIMITIVE | PickResult.SHAPE3D);
          if (node != null)
          {
            System.err.println("Picked " + node.getClass().getName());
            return;
          }
        }

        System.err.println("Nothing picked");
      }
    });
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

  private void setNominalTransform()
  {
    ViewingPlatform viewingPlatform = universe.getViewingPlatform();

    View view = viewingPlatform.getViewers()[0].getView();
    view.setBackClipDistance(100.0d);

    double fieldOfView = view.getFieldOfView();
    double viewDistance = 12.0d / Math.tan(fieldOfView / 2.0d);

    Transform3D transform = new Transform3D();
    transform.set(new Vector3d(0.0, 0.0, viewDistance));
    viewingPlatform.getViewPlatformTransform().setTransform(transform);
  }

  public Composite getComposite()
  {
    return composite;
  }

  public void addElement(Element element)
  {
    if (!elementGroups.containsKey(element))
    {
      ElementGroup group = createElementGroup(element);
      ElementProvider provider = element.getProvider();

      Map<Integer, Boolean> references = element.getReferences();
      createChildren(group, provider, references);

      ElementGroup containerGroup = getContainerElementGroup(element);
      addNode(group, containerGroup);
    }
  }

  private void addNode(final Node node, final ElementGroup containerContainmentGroup)
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
          branchGroup.setCapability(Node.ENABLE_PICK_REPORTING);
          branchGroup.setPickable(true);
          branchGroup.addChild(transformGroup);

          universe.addBranchGraph(branchGroup);
        }
        else
        {
          ThreeDeeUtil.enablePicking(node);
          containerContainmentGroup.addChild(node);
        }

        layout((ElementGroup)node, containerContainmentGroup);

        Element element = ((ElementGroup)node).getModel();
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

  public void removeElement(Element element)
  {
    Element containerElement = getContainerElement(element);
    if (containerElement != null)
    {
      containerElement.getReferences().remove(element.getID());
    }

    ElementGroup containmentGroup = elementGroups.remove(element);
    if (containmentGroup != null)
    {
      ElementGroup containerContainmentGroup = getContainerElementGroup(element);
      removeNode(containmentGroup, containerContainmentGroup);
      clearReferenceNodes(element);

      if (containerContainmentGroup != null)
      {
        clearReferenceNodes(element.getProvider().getElement(element.getContainerID()));

        updateReferences(containerElement);
        layout(null, containerContainmentGroup);
      }
    }
  }

  private void removeNode(final ElementGroup containmentGroup, final ElementGroup containerContainmentGroup)
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

  private Element getContainerElement(Element element)
  {
    return element.getProvider().getElement(element.getContainerID());
  }

  private void clearReferenceNodes(Element element)
  {
    Map<Element, ReferenceShape> map = referenceShapes.get(element);
    if (map != null)
    {
      for (ReferenceShape shape : map.values())
      {
        universe.getLocale().removeBranchGraph((BranchGroup)shape.getParent().getParent());
      }

      referenceShapes.remove(element);
    }
  }

  private ElementGroup getContainerElementGroup(Element element)
  {
    Element containerElement = getContainerElement(element);
    return elementGroups.get(containerElement);
  }

  private void createChildren(ElementGroup containerGroup, ElementProvider provider, Map<Integer, Boolean> references)
  {
    for (int targetID : references.keySet())
    {
      Element target = provider.getElement(targetID);
      ElementGroup targetGroup = elementGroups.get(target);
      if (targetGroup == null)
      {
        targetGroup = createElementGroup(target);
        containerGroup.addChild(targetGroup);
        createChildren(targetGroup, provider, target.getReferences());
      }
    }
  }

  private ElementGroup createElementGroup(Element element)
  {
    ElementGroup group = new ElementGroup(element);
    elementGroups.put(element, group);
    return group;
  }

  public void filter(Set<ElementDescriptor> toBeHidden)
  {
    for (ElementGroup elementGroup : elementGroups.values())
    {
      ElementDescriptor descriptor = elementGroup.getModel().getDescriptor();
      elementGroup.setVisible(!toBeHidden.contains(descriptor));
    }
  }

  public void dispose()
  {
    runner.deactivate();
    composite.dispose();
  }

  public boolean schedule(Runnable runnable)
  {
    return runner.addWork(runnable);
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
        branchGroup.setCapability(Node.ALLOW_PICKABLE_WRITE);
        branchGroup.addChild(transformGroupLine);

        universe.addBranchGraph(branchGroup);
      }
    });
  }

  private void layout(final ElementGroup containmentGroup, final ElementGroup containerContainmentGroup)
  {
    if (containerContainmentGroup != null)
    {
      containerContainmentGroup.layout();
    }
    else
    {
      containmentGroup.layout();
    }
  }

  private void updateReferences(Element element)
  {
    ElementProvider provider = element.getProvider();
    Map<Integer, Boolean> references = element.getReferences();

    for (int elementID : references.keySet())
    {
      Map<Element, ReferenceShape> map = referenceShapes.get(element);
      Element referenceElement = provider.getElement(elementID);
      ReferenceShape referenceShape;
      if (map == null)
      {
        map = new HashMap<Element, ReferenceShape>();
        referenceShapes.put(element, map);
        referenceShape = createAndSetReferenceShape(element, references, elementID, map, referenceElement);
      }
      else
      {
        referenceShape = map.get(referenceElement);
        if (referenceShape == null)
        {
          referenceShape = createAndSetReferenceShape(element, references, elementID, map, referenceElement);
        }
      }

      updateReference(element, referenceElement, referenceShape);
      updateReferences(referenceElement);
    }
  }

  private ReferenceShape createAndSetReferenceShape(Element element, Map<Integer, Boolean> references, int elementID,
      Map<Element, ReferenceShape> map, Element referenceElement)
  {
    ReferenceShape referenceShape = createReferenceShape(element, referenceElement, references.get(elementID));
    addReferenceShape(referenceShape);
    map.put(referenceElement, referenceShape);
    return referenceShape;
  }

  private ReferenceShape createReferenceShape(Element from, Element to, boolean containment)
  {
    return new ReferenceShape(from, to, containment);
  }

  private void updateReference(Element from, Element to, ReferenceShape referenceShape)
  {
    ElementGroup fromGroup = elementGroups.get(from);
    if (fromGroup == null)
    {
      return;
    }

    ElementGroup toGroup = elementGroups.get(to);
    if (toGroup == null)
    {
      return;
    }

    Node fromShape = fromGroup.getShape();
    Assert.isNotNull(fromShape);

    Node toShape = toGroup.getShape();
    Assert.isNotNull(toShape);

    Point3f fromPosition = ThreeDeeUtil.getPositionAsPoint3f(fromShape);
    Point3f toPosition = ThreeDeeUtil.getPositionAsPoint3f(toShape);

    Point3f[] points = new Point3f[2];
    points[0] = fromPosition;
    points[1] = toPosition;
    LineArray lineArray = new LineArray(2, LineArray.COORDINATES);
    lineArray.setCoordinates(0, points);
    referenceShape.setGeometry(lineArray);
  }

  private void positionNewObject(TransformGroup transformGroup, Node node)
  {
    Vector3f vector = layout.getAvailablePosition(node);
    Transform3D t3d = new Transform3D();
    t3d.setTranslation(vector);
    transformGroup.setTransform(t3d);
  }

  private TransformGroup createTransformGroup()
  {
    TransformGroup transformGroup = new TransformGroup();
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    transformGroup.setCapability(Node.ENABLE_PICK_REPORTING);
    transformGroup.setPickable(true);
    return transformGroup;
  }

  private void addChild(Group parent, Node child)
  {
    parent.addChild(child);
  }
}
