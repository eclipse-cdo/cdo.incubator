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
import org.eclipse.emf.cdo.threedee.ui.nodes.IColors;
import org.eclipse.emf.cdo.threedee.ui.nodes.IntroPlanet;
import org.eclipse.emf.cdo.threedee.ui.nodes.ReferenceShape;
import org.eclipse.emf.cdo.threedee.ui.nodes.RootElementGroup;
import org.eclipse.emf.cdo.threedee.ui.nodes.ThreeDeeNode;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.collection.Pair;
import org.eclipse.net4j.util.concurrent.ConcurrencyUtil;
import org.eclipse.net4j.util.om.trace.ContextTracer;

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

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;
import com.sun.j3d.utils.picking.PickTool;
import com.sun.j3d.utils.universe.PlatformGeometry;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewingPlatform;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Font3D;
import javax.media.j3d.FontExtrusion;
import javax.media.j3d.Geometry;
import javax.media.j3d.Group;
import javax.media.j3d.LineArray;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Text3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.media.j3d.View;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorld implements ISelectionProvider, IColors
{
  @SuppressWarnings("unused")
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorld.class);

  private static boolean PRODUCTION = false;

  private Set<ElementDescriptor> disabledDescriptors = Collections.emptySet();

  private Map<Element, ElementGroup> elementGroups = new HashMap<Element, ElementGroup>();

  private Map<Element, Map<Element, ReferenceShape>> referenceShapes = new HashMap<Element, Map<Element, ReferenceShape>>();

  private List<ISelectionChangedListener> selectionChangeListeners = new ArrayList<ISelectionChangedListener>();

  private CallThread callThread;

  private Composite composite;

  private SimpleUniverse universe;

  private BranchGroup scene;

  private Canvas3D canvas;

  private RootElementGroup root;

  private StructuredSelection selection;

  private boolean showCrossReferences;

  private InfoPanel infoPanel;

  public ThreeDeeWorld(Composite parent)
  {
    composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
    composite.setLayout(new FillLayout());

    initUniverse();

    for (Session session : Frontend.INSTANCE.getElements())
    {
      Element rootElement = session.getRootElement();
      if (rootElement != null && !elementGroups.containsKey(rootElement))
      {
        addElement(rootElement);
      }
    }
  }

  private void initUniverse()
  {
    Frame frame = SWT_AWT.new_Frame(composite);

    canvas = ThreeDeeUtil.createCanvas(frame);
    universe = new SimpleUniverse(canvas);

    addScene();
    universe.addBranchGraph(scene);

    if (!PRODUCTION)
    {
      addCoordinateSystem();
    }

    setNominalViewingTransform();
    frame.add(canvas);
    addPicking();
    addInfoPanel();

    if (PRODUCTION)
    {
      new Thread()
      {
        @Override
        public void run()
        {
          IntroPlanet planet = new IntroPlanet(ThreeDeeWorld.this);
          universe.addBranchGraph(planet);

          try
          {
            System.in.read();
            // ConcurrencyUtil.sleep(5000);
          }
          catch (Exception ex)
          {
            ex.printStackTrace();
          }

          planet.start();
        }
      }.start();
    }
  }

  private void addScene()
  {
    scene = new BranchGroup();
    scene.setCapability(Group.ALLOW_CHILDREN_EXTEND);
    scene.setCapability(Group.ALLOW_CHILDREN_WRITE);

    addLights();
    addNavigation();

    TransformGroup transformGroup = new TransformGroup();
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    transformGroup.setCapability(Node.ENABLE_PICK_REPORTING);
    transformGroup.setPickable(true);
    scene.addChild(transformGroup);

    root = new RootElementGroup(this);
    scene.addChild(root);
  }

  private void addLights()
  {
    DirectionalLight directionalLight = new DirectionalLight();
    directionalLight.setColor(new Color3f(0.7f, 0.8f, 0.8f));
    directionalLight.setDirection(new Vector3f(15.0f, -20.0f, -6.0f));
    directionalLight.setInfluencingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
    scene.addChild(directionalLight);

    AmbientLight ambientLight = new AmbientLight();
    ambientLight.setColor(new Color3f(0.4f, 0.4f, 0.4f));
    ambientLight.setInfluencingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
    scene.addChild(ambientLight);
  }

  private void addNavigation()
  {
    TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
    KeyNavigatorBehavior keyInteractor = new KeyNavigatorBehavior(viewTransformGroup);
    BoundingSphere movingBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    keyInteractor.setSchedulingBounds(movingBounds);
    scene.addChild(keyInteractor);

    BoundingSphere mouseZone = new BoundingSphere(new Point3d(), Double.MAX_VALUE);
    OrbitBehavior ob = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_TRANSLATE | OrbitBehavior.REVERSE_ROTATE);
    ob.setSchedulingBounds(mouseZone);
    universe.getViewingPlatform().setViewPlatformBehavior(ob);
  }

  private void addPicking()
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
            int modifiers = e.getModifiers();
            boolean alt = (modifiers & MouseEvent.ALT_MASK) != 0;
            boolean ctl = (modifiers & MouseEvent.CTRL_MASK) != 0;
            picked(node, alt, ctl);
            return;
          }
        }

        setSelection(StructuredSelection.EMPTY);
      }

      private void picked(Node node, boolean alt, boolean ctl)
      {
        @SuppressWarnings("unchecked")
        ThreeDeeNode<Element> threeDeeNode = ThreeDeeUtil.getThreeDeeNode(node);
        Element element = threeDeeNode.getModel();

        List<Element> elements = new ArrayList<Element>();
        elements.add(element);
        if (alt)
        {
          addChildren(element, elements);
        }

        setSelection(new StructuredSelection(elements));
      }

      private void addChildren(Element element, List<Element> elements)
      {
        for (Element child : element.getElements())
        {
          elements.add(child);
          addChildren(child, elements);
        }
      }
    });
  }

  private void addInfoPanel()
  {
    infoPanel = new InfoPanel();
    universe.getViewingPlatform().setPlatformGeometry(infoPanel);
  }

  private void addCoordinateSystem()
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

  public void setNominalViewingTransform()
  {
    ViewingPlatform viewingPlatform = universe.getViewingPlatform();

    View view = viewingPlatform.getViewers()[0].getView();
    view.setBackClipDistance(100.0d);

    double fieldOfView = view.getFieldOfView();
    double viewDistance = 12.0d / Math.tan(fieldOfView / 2.0d);

    Transform3D viewingTransform = new Transform3D();
    viewingTransform.set(new Vector3d(0.0, 0.0, viewDistance));
    viewingPlatform.getViewPlatformTransform().setTransform(viewingTransform);
  }

  public SimpleUniverse getUniverse()
  {
    return universe;
  }

  public Canvas3D getCanvas()
  {
    return canvas;
  }

  public Composite getComposite()
  {
    return composite;
  }

  public InfoPanel getInfoPanel()
  {
    return infoPanel;
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

  private void addNode(ElementGroup node, ElementGroup parent)
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

  private void removeNode(ElementGroup containmentGroup, ElementGroup containerContainmentGroup)
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
    ElementGroup group = new ElementGroup(this, element);
    ElementDescriptor descriptor = element.getDescriptor();
    if (disabledDescriptors.contains(descriptor))
    {
      group.setVisible(false);
    }

    elementGroups.put(element, group);
    return group;
  }

  public void setDisabledDescriptors(Set<ElementDescriptor> disabledDescriptors)
  {
    this.disabledDescriptors = disabledDescriptors;
    for (ElementGroup elementGroup : elementGroups.values())
    {
      Element element = elementGroup.getModel();
      ElementDescriptor descriptor = element.getDescriptor();
      elementGroup.setVisible(!disabledDescriptors.contains(descriptor));
    }

    updateReferences();
  }

  public void dispose()
  {
    composite.dispose();
  }

  public void layout()
  {
    root.layout();
  }

  private void updateReferences()
  {
    for (Session session : Frontend.INSTANCE.getElements())
    {
      Element[] elements = session.getElements();
      updateReferences(elements);
    }
  }

  private void updateReferences(Element source)
  {
    updateReferences(source, new HashSet<Element>());
  }

  private void updateReferences(Element[] sources)
  {
    Set<Element> visited = new HashSet<Element>();
    for (Element element : sources)
    {
      updateReferences(element, visited);
    }
  }

  private void updateReferences(Element source, Set<Element> visited)
  {
    if (visited.add(source))
    {
      ElementProvider provider = source.getProvider();
      Map<Integer, Boolean> references = source.getReferences();

      @SuppressWarnings("unchecked")
      Entry<Integer, Boolean>[] array = references.entrySet().toArray(new Entry[references.size()]);
      for (Entry<Integer, Boolean> entry : array)
      {
        int targetID = entry.getKey();
        Element target = provider.getElement(targetID);
        boolean containment = entry.getValue();

        updateReference(source, target, containment);
        updateReferences(target, visited);
      }
    }
  }

  private void updateReference(Element source, Element target, boolean containment)
  {
    if (containment || showCrossReferences)
    {
      Map<Element, ReferenceShape> map = referenceShapes.get(source);

      ElementGroup targetGroup = elementGroups.get(target);
      if (targetGroup != null && targetGroup.isVisible())
      {
        if (map == null)
        {
          map = new HashMap<Element, ReferenceShape>();
          referenceShapes.put(source, map);
        }

        ReferenceShape referenceShape = map.get(target);
        if (referenceShape == null)
        {
          referenceShape = new ReferenceShape(this, source, target, containment);
          map.put(target, referenceShape);

          TransformGroup transformGroup = new TransformGroup();
          transformGroup.addChild(referenceShape);

          BranchGroup branchGroup = new BranchGroup();
          branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
          branchGroup.addChild(transformGroup);

          universe.addBranchGraph(branchGroup);
        }

        referenceShape.setGeometry(getLineGeometry(source, target));
      }
      else
      {
        if (map != null)
        {
          ReferenceShape referenceShape = map.remove(target);
          if (referenceShape != null)
          {
            BranchGroup branchGroup = (BranchGroup)referenceShape.getParent().getParent();
            branchGroup.detach();
          }
        }
      }
    }
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

  public void showCall(Element source, Element target, boolean transmission)
  {
    if (source == null)
    {
      // Can happen for call events
      return;
    }

    if (disabledDescriptors.contains(source.getDescriptor()))
    {
      return;
    }

    if (disabledDescriptors.contains(target.getDescriptor()))
    {
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

        infoPanel.updateInfo(ssel.toArray());

        SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
        for (ISelectionChangedListener listener : selectionChangeListeners)
        {
          listener.selectionChanged(event);
        }
      }
    }
  }

  private void updateSelection(boolean selected)
  {
    for (Iterator<?> it = getSelection().iterator(); it.hasNext();)
    {
      Object object = it.next();
      ElementGroup elementGroup = elementGroups.get(object);
      if (elementGroup != null)
      {
        elementGroup.setSelected(selected);
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
        call = new CallShape(ThreeDeeWorld.this, source, target, transmission);
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

  /**
   * @author Eike Stepper
   */
  public final class InfoPanel extends PlatformGeometry implements Runnable
  {
    private FontExtrusion EXTRUSION = new FontExtrusion();

    private Font3D plainFont = new Font3D(new Font("Arial", Font.PLAIN, 1), EXTRUSION);

    private Font3D boldFont = new Font3D(new Font("Arial", Font.BOLD, 1), EXTRUSION);

    private TransformGroup translationGroup;

    private TransformGroup scaleGroup;

    private Thread animator = new Thread(this);

    private List<Info> infos = new ArrayList<Info>();

    public InfoPanel()
    {
      Transform3D translation = new Transform3D();
      translation.setTranslation(new Vector3f(-0.4f, 0.24f, -1f));

      translationGroup = new TransformGroup(translation);
      translationGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      translationGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      addChild(translationGroup);

      // DirectionalLight light = new DirectionalLight();
      // light.setColor(white);
      // light.setDirection(0f, 0f, -1f);
      // translationGroup.addChild(light);

      Transform3D scale = new Transform3D();
      scale.setScale(0.015d);

      scaleGroup = new TransformGroup(scale);
      scaleGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      scaleGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      scaleGroup.setCapability(ALLOW_CHILDREN_WRITE);
      scaleGroup.setCapability(ALLOW_CHILDREN_EXTEND);
      translationGroup.addChild(scaleGroup);

      // animator.setDaemon(true);
      // animator.start();
    }

    public TransformGroup getTranslationGroup()
    {
      return translationGroup;
    }

    public TransformGroup getScaleGroup()
    {
      return scaleGroup;
    }

    public synchronized void updateInfo(Object[] objects)
    {
      for (Info info : infos)
      {
        info.detach();
      }

      infos = createInfos(objects);
      for (Info info : infos)
      {
        scaleGroup.addChild(info);
      }
    }

    public void run()
    {
      while (!animator.isInterrupted())
      {
        ConcurrencyUtil.sleep(100);
      }
    }

    private List<Info> createInfos(Object[] objects)
    {
      List<Info> infos = new ArrayList<Info>();
      int row = 0;

      if (objects.length == 1)
      {
        if (objects[0] instanceof Element)
        {
          Element element = (Element)objects[0];
          ElementDescriptor descriptor = element.getDescriptor();

          Info info = new Info(row++, descriptor.getLabel() + ":", true);
          infos.add(info);

          for (Entry<String, String> entry : element.getAttributes().entrySet())
          {
            String label = entry.getKey() + " = " + entry.getValue();

            info = new Info(row++, label, false);
            infos.add(info);
          }
        }
      }
      else
      {
        Map<ElementDescriptor, Integer> counts = new HashMap<ElementDescriptor, Integer>();
        for (Object object : objects)
        {
          if (object instanceof Element)
          {
            Element element = (Element)object;
            ElementDescriptor descriptor = element.getDescriptor();

            Integer count = counts.get(descriptor);
            if (count == null)
            {
              count = 0;
            }

            counts.put(descriptor, ++count);
          }
        }

        if (!counts.isEmpty())
        {
          for (Entry<ElementDescriptor, Integer> entry : counts.entrySet())
          {
            ElementDescriptor descriptor = entry.getKey();
            String label = descriptor.getLabel();
            if (label.endsWith("y"))
            {
              label = label.substring(0, label.length() - 1) + "ies";
            }
            else
            {
              label += "s";
            }

            label += ": " + entry.getValue();

            Info info = new Info(row++, label, true);
            infos.add(info);
          }
        }
      }

      return infos;
    }

    /**
     * @author Eike Stepper
     */
    private final class Info extends BranchGroup
    {
      public Info(int row, String label, boolean bold)
      {
        setCapability(ALLOW_DETACH);

        Transform3D translation = new Transform3D();
        translation.set(new Vector3f(0f, -1.2f * row, 0f));

        TransformGroup transformGroup = new TransformGroup(translation);
        addChild(transformGroup);

        Appearance appearance = new Appearance();
        // appearance.setTransparencyAttributes(transparencyAttributes);

        Material material = new Material(darkGray, gray, white, yellow, 16.0f);
        material.setLightingEnable(true);
        appearance.setMaterial(material);

        // Text2D text2D = new Text2D(label, white, "Arial", 1, bold ? Font.BOLD : Font.PLAIN);

        Text3D geometry = new Text3D(bold ? boldFont : plainFont, label);
        geometry.setCapability(Geometry.ALLOW_INTERSECT);
        Shape3D text3D = new Shape3D(geometry, appearance);

        transformGroup.addChild(text3D);
      }
    }
  }
}
