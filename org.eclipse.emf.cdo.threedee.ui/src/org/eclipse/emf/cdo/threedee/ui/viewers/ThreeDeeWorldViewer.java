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
package org.eclipse.emf.cdo.threedee.ui.viewers;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.RepositoryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EPackageRegistryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;
import org.eclipse.emf.cdo.threedee.ui.composites.ThreeDeeWorldComposite;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.IShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.EPackageRegistryShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.RepositoryShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.TCPConnectorShapeFactory;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldViewer
{
  Map<Element, Shape3D> elementsToShapes = new HashMap<Element, Shape3D>();

  Map<String, IShapeFactory> shapeFactories = new HashMap<String, IShapeFactory>();

  private ThreeDeeWorldComposite threeDeeWorldComposite;

  private Composite container;

  public ThreeDeeWorldViewer(Composite parent)
  {
    createControl(parent);
  }

  private void createControl(Composite parent)
  {
    container = new Composite(parent, SWT.NONE);
    container.setLayout(new FillLayout(SWT.VERTICAL));

    threeDeeWorldComposite = createThreeDeeWorldComposite(container);

    // TODO move this out of this class. Maybe to some extension points or something similar
    initShapeFactories();
  }

  private void initShapeFactories()
  {
    shapeFactories.put(RepositoryDescriptor.class.getCanonicalName(), new RepositoryShapeFactory());
    shapeFactories.put(TCPConnectorDescriptor.class.getCanonicalName(), new TCPConnectorShapeFactory());
    shapeFactories.put(EPackageRegistryDescriptor.class.getCanonicalName(), new EPackageRegistryShapeFactory());
  }

  private ThreeDeeWorldComposite createThreeDeeWorldComposite(Composite container)
  {
    return new ThreeDeeWorldComposite(container, SWT.EMBEDDED | SWT.NO_BACKGROUND);
  }

  public Composite getControl()
  {
    return container;
  }

  public void addElement(Element element)
  {
    IShapeFactory factory = shapeFactories.get(element.getDescriptor().getClass().getCanonicalName());

    if (factory != null)
    {
      Node newShape = factory.create(element);
      threeDeeWorldComposite.addShape(newShape);
    }
  }

  public void removeElement(Element element)
  {
  }
}
