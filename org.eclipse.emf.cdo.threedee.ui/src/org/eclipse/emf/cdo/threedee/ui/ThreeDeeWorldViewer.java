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

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;
import org.eclipse.emf.cdo.threedee.ui.nodes.ContainmentGroup;
import org.eclipse.emf.cdo.threedee.ui.nodes.DefaultNode;
import org.eclipse.emf.cdo.threedee.ui.nodes.INodeFactory;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Point3f;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldViewer
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldViewer.class);

  private Map<Element, Node> containmentGroups = new HashMap<Element, Node>();

  private ThreeDeeWorldComposite threeDeeWorldComposite;

  private Composite container;

  public ThreeDeeWorldViewer(Composite parent)
  {
    container = new Composite(parent, SWT.NONE);
    container.setLayout(new FillLayout());

    threeDeeWorldComposite = new ThreeDeeWorldComposite(container, SWT.EMBEDDED | SWT.NO_BACKGROUND);
  }

  public Control getControl()
  {
    return container;
  }

  public void addElement(Element element)
  {
    if (containmentGroups.get(element) != null)
    {
      return;
    }

    ContainmentGroup containerContainmentGroup = getContainerContainmentGroup(element);
    ContainmentGroup containmentGroup = (ContainmentGroup)createNode(element);

    ElementProvider provider = element.getProvider();

    Map<Integer, Boolean> references = element.getReferences();
    createChildren(containmentGroup, provider, references);

    // it is important to add the parent at last, otherwise it would become alive and nodes cannot be added anymore
    threeDeeWorldComposite.addNode(containmentGroup, containerContainmentGroup);
    layout(containmentGroup, containerContainmentGroup);

    createReferences(element, provider, references);
  }

  public void removeElement(Element element)
  {
    ContainmentGroup containmentGroup = (ContainmentGroup)containmentGroups.remove(element);
    if (containmentGroup == null)
    {
      return;
    }

    ContainmentGroup containerContainmentGroup = getContainerContainmentGroup(element);
    if (containerContainmentGroup != null)
    {
      threeDeeWorldComposite.removeNode(containmentGroup, containerContainmentGroup);
      layout(null, containerContainmentGroup);
    }
  }

  public void layout(final ContainmentGroup containmentGroup, final ContainmentGroup containerContainmentGroup)
  {
    threeDeeWorldComposite.schedule(new Runnable()
    {
      public void run()
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
    });
  }

  protected ContainmentGroup getContainerContainmentGroup(Element element)
  {
    Element containerElement = element.getProvider().getElement(element.getContainerID());
    ContainmentGroup containerContainmentGroup = (ContainmentGroup)containmentGroups.get(containerElement);
    return containerContainmentGroup;
  }

  private void createReferences(Element element, ElementProvider provider, Map<Integer, Boolean> references)
  {
    for (int elementId : references.keySet())
    {
      Element referenceElement = provider.getElement(elementId);

      Node shapeLine = createReferenceShape(element, referenceElement, references.get(elementId));
      threeDeeWorldComposite.addReferenceShape(shapeLine);

      createReferences(referenceElement, provider, referenceElement.getReferences());
    }
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
    Node shape = factory != null ? factory.createNode(element) : new DefaultNode(element);

    ContainmentGroup group = new ContainmentGroup(element);
    group.setShape(shape);

    containmentGroups.put(element, group);
    return group;
  }

  private Node createReferenceShape(Element from, Element to, boolean isContainment)
  {
    Node shape = ((ContainmentGroup)containmentGroups.get(from)).getShape();
    Assert.isNotNull(shape);

    Node referenceShape = ((ContainmentGroup)containmentGroups.get(to)).getShape();
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

    Appearance appearance = ThreeDeeWorldUtil.getDefaultAppearance(isContainment == true ? Color.white : Color.gray);

    TransparencyAttributes transparencyAttributes = appearance.getTransparencyAttributes();
    if (transparencyAttributes == null)
    {
      transparencyAttributes = new TransparencyAttributes();
      appearance.setTransparencyAttributes(transparencyAttributes);
    }

    transparencyAttributes.setTransparencyMode(TransparencyAttributes.FASTEST);
    transparencyAttributes.setTransparency(0.9f);
    return new Shape3D(lineArray, appearance);
  }

  public void filter(List<String> elementsToBeHidden)
  {
    for (Element element : containmentGroups.keySet())
    {
      Node node = containmentGroups.get(element);
      if (node instanceof ContainmentGroup)
      {
        node = ((ContainmentGroup)node).getShape();
      }

      if (elementsToBeHidden.contains(element.getDescriptor().getName()))
      {
        setVisible(node, false);
      }
      else
      {
        setVisible(node, true);
      }
    }
  }

  private void setVisible(Node node, boolean visible)
  {
    if (node instanceof Sphere)
    {
      Appearance appearance = ((Sphere)node).getAppearance();
      RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
      if (renderingAttributes != null)
      {
        renderingAttributes.setVisible(visible);
      }
    }
  }
}
