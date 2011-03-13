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
import org.eclipse.emf.cdo.threedee.ui.nodes.CallShape;
import org.eclipse.emf.cdo.threedee.ui.nodes.ElementGroup;
import org.eclipse.emf.cdo.threedee.ui.nodes.IntroPlanet;
import org.eclipse.emf.cdo.threedee.ui.nodes.ReferenceShape;
import org.eclipse.emf.cdo.threedee.ui.nodes.RootElement;
import org.eclipse.emf.cdo.threedee.ui.nodes.ThreeDeeNode;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;
import org.eclipse.net4j.util.concurrent.QueueRunner;
import org.eclipse.net4j.util.om.trace.ContextTracer;
import org.eclipse.net4j.util.ui.UIQueueRunner;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

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
import javax.media.j3d.Geometry;
import javax.media.j3d.Group;
import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.media.j3d.View;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorld implements ISelectionProvider
{
  @SuppressWarnings("unused")
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorld.class);

  private static boolean PRODUCTION = false;

  private Map<Element, ElementGroup> elementGroups = new HashMap<Element, ElementGroup>();

  private Map<Element, Map<Element, ReferenceShape>> referenceShapes = new HashMap<Element, Map<Element, ReferenceShape>>();

  private Composite composite;

  private QueueRunner runner;

  private SimpleUniverse universe;

  private BranchGroup scene;

  private TransformGroup sphereTransformGroup;

  private Canvas3D canvas;

  private boolean showCrossReferences;

  private Transform3D viewingTransform;

  private RootElement root;

  private StructuredSelection selection;

  private List<ISelectionChangedListener> selectionChangeListeners = new ArrayList<ISelectionChangedListener>();

  private CallThread callThread;

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

    canvas = ThreeDeeUtil.createCanvas(frame);
    universe = new SimpleUniverse(canvas);
    scene = createScene(canvas);

    universe.addBranchGraph(scene);

    if (!PRODUCTION)
    {
      universe.addBranchGraph(createCoordinateSystem());
    }

    setNominalViewingTransform();
    frame.add(canvas);
    createPicking(canvas, scene);

    if (PRODUCTION)
    {
      IntroPlanet planet = new IntroPlanet(this);
      universe.addBranchGraph(planet);
      planet.start();
    }
  }

  @SuppressWarnings("unused")
  private void mouseTest()
  {
    Thread t = new Thread(new Runnable()
    {
      public void run()
      {
        ConcurrencyUtil.sleep(10000);

        final Display display = composite.getDisplay();
        Display.getDefault().asyncExec(new Runnable()
        {
          public void run()
          {
            Event event = new Event();
            event.type = SWT.MouseDown;
            event.button = 1;
            display.post(event);
          }
        });

        for (int i = 0; i < 100; i += 10)
        {
          final int a = i;
          Display.getDefault().asyncExec(new Runnable()
          {
            public void run()
            {
              Event event = new Event();
              event.type = SWT.MouseMove;
              event.x = composite.toDisplay(a, a).x;
              event.y = composite.toDisplay(a + 10, a + 10).y;

              display.post(event);

              try
              {
                Thread.sleep(500);
              }
              catch (InterruptedException ex)
              {
                ex.printStackTrace();
              }
            }
          });
        }

        Display.getDefault().asyncExec(new Runnable()
        {
          public void run()
          {
            Event event = new Event();
            event.type = SWT.MouseUp;
            event.button = 1;
            display.post(event);
          }
        });
      }
    });

    t.start();
  }

  private BranchGroup createScene(Canvas3D canvas)
  {
    BranchGroup scene = new BranchGroup();
    scene.setCapability(Group.ALLOW_CHILDREN_EXTEND);
    scene.setCapability(Group.ALLOW_CHILDREN_WRITE);

    createLights(scene);
    createNavigation(scene);

    sphereTransformGroup = createTransformGroup();
    scene.addChild(sphereTransformGroup);

    root = new RootElement(canvas);
    scene.addChild(root);

    return scene;
  }

  private void createLights(BranchGroup group)
  {
    DirectionalLight directionalLight = new DirectionalLight();
    directionalLight.setColor(new Color3f(0.7f, 0.8f, 0.8f));
    directionalLight.setDirection(new Vector3f(15.0f, -20.0f, -6.0f));
    directionalLight.setInfluencingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
    group.addChild(directionalLight);

    AmbientLight ambientLight = new AmbientLight();
    ambientLight.setColor(new Color3f(0.4f, 0.4f, 0.4f));
    ambientLight.setInfluencingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
    group.addChild(ambientLight);
  }

  private void createNavigation(BranchGroup branchGroup)
  {
    TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
    KeyNavigatorBehavior keyInteractor = new KeyNavigatorBehavior(viewTransformGroup);
    BoundingSphere movingBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    keyInteractor.setSchedulingBounds(movingBounds);
    branchGroup.addChild(keyInteractor);

    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Double.MAX_VALUE);
    OrbitBehavior ob = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_TRANSLATE | OrbitBehavior.REVERSE_ROTATE);
    ob.setSchedulingBounds(mouseZone);
    universe.getViewingPlatform().setViewPlatformBehavior(ob);
  }

  private void createPicking(final Canvas3D canvas, final BranchGroup scene)
  {
    final PickCanvas pickCanvas = new PickCanvas(canvas, scene);
    pickCanvas.setMode(PickTool.BOUNDS);
    canvas.addMouseListener(new MouseAdapter()
    {
      @SuppressWarnings("unchecked")
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
            ThreeDeeNode<Element> threeDeeNode = ThreeDeeUtil.getThreeDeeNode(node);
            Element element = threeDeeNode.getModel();
            setSelection(new StructuredSelection(element));
            return;
          }
        }

        setSelection(StructuredSelection.EMPTY);
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

  public void setNominalViewingTransform()
  {
    ViewingPlatform viewingPlatform = universe.getViewingPlatform();

    View view = viewingPlatform.getViewers()[0].getView();
    view.setBackClipDistance(100.0d);

    double fieldOfView = view.getFieldOfView();
    double viewDistance = 12.0d / Math.tan(fieldOfView / 2.0d);

    viewingTransform = new Transform3D();
    viewingTransform.set(new Vector3d(0.0, 0.0, viewDistance));
    viewingPlatform.getViewPlatformTransform().setTransform(viewingTransform);
  }

  public SimpleUniverse getUniverse()
  {
    return universe;
  }

  public BranchGroup getScene()
  {
    return scene;
  }

  public TransformGroup getSphereTransformGroup()
  {
    return sphereTransformGroup;
  }

  public Canvas3D getCanvas()
  {
    return canvas;
  }

  public Transform3D getViewingTransform()
  {
    return viewingTransform;
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

  private void addNode(final ElementGroup node, final ElementGroup parent)
  {
    schedule(new Runnable()
    {
      public void run()
      {
        if (parent == null)
        {
          root.addChild(node);
        }
        else
        {
          ThreeDeeUtil.enablePicking(node);
          parent.addChild(node);
        }

        layout();

        Element element = node.getModel();
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
      }
    }

    layout();
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
        }
        else
        {
          universe.getLocale().removeBranchGraph(containmentGroup);
        }
        root.layout();
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
    ElementGroup group = new ElementGroup(element, canvas);
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

  public void layout()
  {
    root.layout();
  }

  private void updateReferences(Element element)
  {
    ElementProvider provider = element.getProvider();
    Map<Integer, Boolean> references = element.getReferences();

    Integer[] elementIDs = references.keySet().toArray(new Integer[references.size()]);
    for (int elementID : elementIDs)
    {
      Element referenceElement = provider.getElement(elementID);
      if (references.get(elementID) || isShowCrossReferences())
      {
        Map<Element, ReferenceShape> map = referenceShapes.get(element);
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

        referenceShape.setGeometry(getLineGeometry(element, referenceElement));
      }

      updateReferences(referenceElement);
    }
  }

  private ReferenceShape createAndSetReferenceShape(Element element, Map<Integer, Boolean> references, int elementID,
      Map<Element, ReferenceShape> map, Element referenceElement)
  {
    boolean containment = references.get(elementID);
    ReferenceShape referenceShape = new ReferenceShape(element, referenceElement, containment);
    addReferenceShape(referenceShape);
    map.put(referenceElement, referenceShape);
    return referenceShape;
  }

  private Geometry getLineGeometry(Element from, Element to)
  {
    ElementGroup fromGroup = elementGroups.get(from);
    if (fromGroup == null)
    {
      return null;
    }

    ElementGroup toGroup = elementGroups.get(to);
    if (toGroup == null)
    {
      return null;
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
    return lineArray;
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

  public void showCall(Element source, Element target, boolean transmission)
  {
    if (source == null)
    {
      // Can happen for call events
      return;
    }

    getCallThread().add(source, target, transmission);
  }

  public void setShowCrossReferences(boolean showCrossReferences)
  {
    this.showCrossReferences = showCrossReferences;
  }

  public boolean isShowCrossReferences()
  {
    return showCrossReferences;
  }

  public void addSelectionChangedListener(ISelectionChangedListener listener)
  {
    selectionChangeListeners.add(listener);
  }

  public void removeSelectionChangedListener(ISelectionChangedListener listener)
  {
    selectionChangeListeners.remove(listener);
  }

  public StructuredSelection getSelection()
  {
    if (selection == null)
    {
      return StructuredSelection.EMPTY;
    }

    return selection;
  }

  public void setSelection(ISelection selection)
  {
    if (selection instanceof StructuredSelection)
    {
      StructuredSelection ssel = (StructuredSelection)selection;
      if (!ObjectUtil.equals(this.selection, ssel))
      {
        updateSelection(false);
        this.selection = ssel;
        updateSelection(true);

        SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
        for (ISelectionChangedListener listener : selectionChangeListeners)
        {
          listener.selectionChanged(event);
        }
      }
    }
  }

  private void updateSelection(boolean select)
  {
    for (Iterator<?> it = getSelection().iterator(); it.hasNext();)
    {
      Object object = it.next();
      ElementGroup elementGroup = elementGroups.get(object);
      if (elementGroup != null)
      {
        elementGroup.select(select);
      }
    }
  }

  private synchronized CallThread getCallThread()
  {
    if (callThread == null)
    {
      callThread = new CallThread();
      callThread.start();
    }

    return callThread;
  }

  /**
   * @author Eike Stepper
   */
  private final class CallThread extends Thread
  {
    private Map<Pair<Element, Element>, CallShape> calls = new HashMap<Pair<Element, Element>, CallShape>();

    public CallThread()
    {
      setDaemon(true);
    }

    public synchronized void add(Element source, Element target, boolean transmission)
    {
      Pair<Element, Element> key = new Pair<Element, Element>(source, target);
      CallShape call = calls.get(key);
      if (call == null)
      {
        call = new CallShape(source, target, transmission);
        call.setGeometry(getLineGeometry(source, target));
        universe.addBranchGraph(call);
        calls.put(key, call);
      }
      else
      {
        call.getAppearance().getTransparencyAttributes().setTransparency(0f);
      }
    }

    @Override
    public void run()
    {
      while (!interrupted())
      {
        for (Entry<Pair<Element, Element>, CallShape> entry : getEntries())
        {
          CallShape call = entry.getValue();
          TransparencyAttributes transparencyAttributes = call.getAppearance().getTransparencyAttributes();
          float transparency = transparencyAttributes.getTransparency();
          if (transparency >= 1.0f)
          {
            remove(entry.getKey());
            call.detach();
          }
          else
          {
            transparencyAttributes.setTransparency(transparency + 0.01f);
          }
        }

        ConcurrencyUtil.sleep(15);
      }
    }

    private synchronized Entry<Pair<Element, Element>, CallShape>[] getEntries()
    {
      @SuppressWarnings("unchecked")
      Entry<Pair<Element, Element>, CallShape>[] array = calls.entrySet().toArray(new Entry[calls.size()]);
      return array;
    }

    private synchronized void remove(Pair<Element, Element> key)
    {
      calls.remove(key);
    }
  }
}
