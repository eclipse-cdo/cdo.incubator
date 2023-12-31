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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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

  private static boolean PRODUCTION = true;

  private Set<ElementDescriptor> disabledDescriptors = Collections.emptySet();

  class ElementGroups
  {
    private Map<Pair<Element, Element>, ElementGroup> map = new HashMap<Pair<Element, Element>, ElementGroup>();

    public Collection<ElementGroup> values()
    {
      return map.values();
    }

    public boolean containsKey(Element element)
    {
      Pair<Element, Element> pair = makePair(element);
      return map.containsKey(pair);
    }

    public ElementGroup get(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
        Pair<Element, Element> pair = makePair(element);
        return map.get(pair);
      }

      return null;
    }

    public ElementGroup put(Element element, ElementGroup elementGroup)
    {
      Pair<Element, Element> pair = makePair(element);
      return map.put(pair, elementGroup);
    }

    public ElementGroup remove(Element element)
    {
      Pair<Element, Element> pair = makePair(element);
      return map.remove(pair);
    }

    private Pair<Element, Element> makePair(Element element)
    {
      Element container = element.getContainer();
      Pair<Element, Element> pair = new Pair<Element, Element>(element, container);
      return pair;
    }
  }

  // private ElementGroups elementGroups = new ElementGroups();

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

  private DirectionalLight directionalLight;

  public ThreeDeeWorld(Composite parent)
  {
    composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
    composite.setLayout(new FillLayout());

    initUniverse();
  }

  private void initUniverse()
  {
    Frame frame = SWT_AWT.new_Frame(composite);

    canvas = ThreeDeeUtil.createCanvas(frame);
    universe = new SimpleUniverse(canvas);

    addScene();

    addPicking();
    configureViewingPlatform();

    frame.add(canvas);

    if (PRODUCTION)
    {
      IntroPlanet.start(ThreeDeeWorld.this);
    }
    else
    {
      // ThreeDeeUtil.addCoordinateSystem(universe);
    }
  }

  private void addScene()
  {
    scene = new BranchGroup();
    scene.setCapability(Group.ALLOW_CHILDREN_EXTEND);
    scene.setCapability(Group.ALLOW_CHILDREN_WRITE);

    addNavigation();

    TransformGroup transformGroup = new TransformGroup();
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    transformGroup.setCapability(Node.ENABLE_PICK_REPORTING);
    transformGroup.setPickable(true);
    scene.addChild(transformGroup);

    root = new RootElementGroup(this);
    scene.addChild(root);

    universe.addBranchGraph(scene);
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

  private void configureViewingPlatform()
  {
    BoundingSphere boundingSphere = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 200.0);

    PlatformGeometry platformGeometry = new PlatformGeometry();
    platformGeometry.setCapability(Group.ALLOW_CHILDREN_READ);
    platformGeometry.setCapability(Group.ALLOW_CHILDREN_WRITE);
    platformGeometry.setCapability(Group.ALLOW_CHILDREN_EXTEND);

    directionalLight = new DirectionalLight();
    directionalLight.setCapability(DirectionalLight.ALLOW_DIRECTION_READ);
    directionalLight.setCapability(DirectionalLight.ALLOW_DIRECTION_WRITE);
    directionalLight.setColor(new Color3f(0.7f, 0.8f, 0.8f));
    // directionalLight.setDirection(new Vector3f(1f, -1f, -6f));
    directionalLight.setDirection(new Vector3f(1.5f, -2.24f, 0.36f));
    directionalLight.setInfluencingBounds(boundingSphere);
    platformGeometry.addChild(directionalLight);

    AmbientLight ambientLight = new AmbientLight();
    ambientLight.setColor(new Color3f(0.4f, 0.4f, 0.4f));
    ambientLight.setInfluencingBounds(boundingSphere);
    platformGeometry.addChild(ambientLight);

    infoPanel = new InfoPanel();
    platformGeometry.addChild(infoPanel);

    universe.getViewingPlatform().setPlatformGeometry(platformGeometry);
    setNominalViewingTransform();
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

  public DirectionalLight getDirectionalLight()
  {
    return directionalLight;
  }

  public InfoPanel getInfoPanel()
  {
    return infoPanel;
  }

  public RootElementGroup getRoot()
  {
    return root;
  }

  public void addElement(Object container, Element element)
  {
    if (elementGroups.containsKey(element))
    {
      removeElement(element.getContainer(), element);
    }
    {
      ElementGroup group = createElementGroup(element);

      // TODO check if the createChildren call is still needed
      // ElementProvider provider = element.getProvider();
      // Map<Integer, Boolean> references = element.getReferences();
      // createChildren(group, provider, references);

      ElementGroup containerGroup = getContainerElementGroup(element);
      addNode(group, containerGroup);
    }
  }

  public void removeElement(Object container, Element element)
  {
    if (container == element.getContainer())
    {
      ElementGroup containmentGroup = elementGroups.remove(element);
      if (containmentGroup != null)
      {
        containmentGroup.detach();
        clearReferenceNodes(element);
      }
    }
  }

  private void addNode(ElementGroup node, ElementGroup parent)
  {
    if (parent == null)
    {
      root.addChild(node);
    }
    else
    {
      ThreeDeeUtil.enablePicking(node, true);
      parent.addChild(node);
    }
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
    updateReferences();
  }

  public void updateReferences()
  {
    for (Session session : Frontend.INSTANCE.getElements())
    {
      Element[] elements = session.getElements();
      updateReferences(elements);
    }
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

      Set<Element> targets = new HashSet<Element>();

      @SuppressWarnings("unchecked")
      Entry<Integer, Boolean>[] array = references.entrySet().toArray(new Entry[references.size()]);
      for (Entry<Integer, Boolean> entry : array)
      {
        int targetID = entry.getKey();
        Element target = provider.getElement(targetID);
        if (target != null && target.getContainerID() == source.getID())
        {
          targets.add(target);
          boolean containment = entry.getValue();
          updateReference(source, target, containment);

          updateReferences(target, visited);
        }
      }

      Map<Element, ReferenceShape> map = referenceShapes.get(source);
      if (map != null)
      {
        Set<Entry<Element, ReferenceShape>> entrySet = map.entrySet();
        for (Iterator<Entry<Element, ReferenceShape>> it = entrySet.iterator(); it.hasNext();)
        {
          Entry<Element, ReferenceShape> entry = it.next();
          Element target = entry.getKey();
          if (!targets.contains(target))
          {
            ReferenceShape referenceShape = entry.getValue();
            universe.getLocale().removeBranchGraph(referenceShape);

            it.remove();
          }
        }
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
    Point3f[] points = getPositions(from, to);
    LineArray lineArray = new LineArray(2, LineArray.COORDINATES);
    lineArray.setCoordinates(0, points);
    return lineArray;
  }

  private Point3f[] getPositions(Element from, Element to)
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
    return points;
  }

  public void showCall(Element source, Element target, boolean transmission)
  {
    if (source == null)
    {
      return;
    }

    if (target == null)
    {
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
        Point3f[] positions = getPositions(source, target);
        if (positions != null)
        {
          call = new CallShape(ThreeDeeWorld.this, source, target, positions, transmission);
          universe.addBranchGraph(call);
          calls.put(key, call);
        }
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
          Pair<Element, Element> model = call.getModel();
          Element element1 = model.getElement1();
          Element element2 = model.getElement2();
          Point3f[] newPositions = getPositions(element1, element2);
          if (newPositions == null)
          {
            removeCall(entry, call);
            continue;
          }

          if (call.hasMoved(newPositions))
          {
            call = new CallShape(ThreeDeeWorld.this, element1, element2, newPositions, call.isTransmission());
            call.getAppearance().setTransparencyAttributes(transparencyAttributes);
          }

          float transparency = transparencyAttributes.getTransparency();
          if (transparency >= 1.0f)
          {
            removeCall(entry, call);
          }
          else
          {
            transparencyAttributes.setTransparency(transparency + 0.01f);
          }
        }

        ConcurrencyUtil.sleep(15);
      }
    }

    private void removeCall(Entry<Pair<Element, Element>, CallShape> entry, CallShape call)
    {
      remove(entry.getKey());
      call.detach();
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

          List<Entry<String, String>> entries = new ArrayList<Entry<String, String>>(element.getAttributes().entrySet());
          Collections.sort(entries, new Comparator<Entry<String, String>>()
          {
            public int compare(Entry<String, String> o1, Entry<String, String> o2)
            {
              return o1.getKey().compareTo(o2.getKey());
            }
          });

          for (Entry<String, String> entry : entries)
          {
            String key = entry.getKey();
            if (!"_label".equals(key))
            {
              String label = key + " = " + entry.getValue();

              info = new Info(row++, label, false);
              infos.add(info);
            }
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
