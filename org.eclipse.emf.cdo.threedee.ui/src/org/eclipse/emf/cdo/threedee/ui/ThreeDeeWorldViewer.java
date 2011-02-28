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
import org.eclipse.emf.cdo.threedee.ui.nodes.DefaultNode;
import org.eclipse.emf.cdo.threedee.ui.nodes.INodeFactory;
import org.eclipse.emf.cdo.threedee.ui.util.ThreeDeeWorldUtil;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import javax.media.j3d.LineArray;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.vecmath.Point3f;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldViewer
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldViewer.class);

  Map<Element, Node> shapes = new HashMap<Element, Node>();

  private ThreeDeeWorldComposite threeDeeWorldComposite;

  private Composite container;

  public ThreeDeeWorldViewer(Composite parent)
  {
    container = new Composite(parent, SWT.NONE);
    container.setLayout(new FillLayout(SWT.VERTICAL));

    threeDeeWorldComposite = new ThreeDeeWorldComposite(container, SWT.EMBEDDED | SWT.NO_BACKGROUND);
  }

  public Control getControl()
  {
    return container;
  }

  public void addElement(Element element)
  {
    if (shapes.get(element) != null)
    {
      return;
    }

    Node shape = createShape(element);
    threeDeeWorldComposite.addShape(shape);

    ElementProvider provider = element.getProvider();

    Map<Integer, Boolean> references = element.getReferences();
    for (int elementId : references.keySet())
    {
      Element referenceElement = provider.getElement(elementId);

      Node referenceShape = shapes.get(referenceElement);

      if (referenceShape == null)
      {
        referenceShape = createShape(referenceElement);
        threeDeeWorldComposite.addShape(referenceShape);
      }

      Node shapeLine = createReferenceShape(element, referenceElement, references.get(elementId));
      threeDeeWorldComposite.addReferenceShape(shapeLine);
    }
  }

  private Node createShape(Element element)
  {
    String name = element.getDescriptor().getName();
    INodeFactory factory = INodeFactory.Registry.INSTANCE.get(name);

    System.out.println("ret.put(\"" + name + "\", Color.orange);");

    if (factory == null)
    {
      factory = INodeFactory.Registry.INSTANCE.get(DefaultNode.Factory.ID);
    }

    Node shape = factory.createNode(element);
    shapes.put(element, shape);
    return shape;
  }

  private Node createReferenceShape(Element from, Element to, Boolean isContainment)
  {
    Node shape = shapes.get(from);
    Node referenceShape = shapes.get(to);
    Assert.isNotNull(shape);
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
    return new Shape3D(lineArray, ThreeDeeWorldUtil.getDefaultAppearance(isContainment == true ? Color.red
        : Color.green));
  }

  public void removeElement(Element element)
  {
  }
}
