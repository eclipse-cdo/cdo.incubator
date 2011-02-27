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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldViewer
{
  Map<Element, Shape3D> shapes = new HashMap<Element, Shape3D>();

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
    String name = element.getDescriptor().getName();
    IShapeFactory factory = IShapeFactory.Registry.INSTANCE.get(name);
    if (factory != null)
    {
      Node shape = factory.createShape(element);
      threeDeeWorldComposite.addShape(shape);
    }
  }

  public void removeElement(Element element)
  {
  }
}
