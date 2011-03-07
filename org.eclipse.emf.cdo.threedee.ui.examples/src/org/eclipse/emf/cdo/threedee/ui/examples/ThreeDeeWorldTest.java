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
package org.eclipse.emf.cdo.threedee.ui.examples;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.ManagedContainerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EAttributeDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EClassifierDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EPackageRegistryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EReferenceDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EStructuralFeatureDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPAcceptorDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldTest
{
  public static void main(String[] args)
  {
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setSize(800, 600);
    shell.setLayout(new FillLayout(SWT.VERTICAL));

    final ThreeDeeWorld viewer = new ThreeDeeWorld(shell);

    final TestingElementProvider dummyElementProvider = new TestingElementProvider();

    final Element element = dummyElementProvider.createElement(new ManagedContainerDescriptor());

    List<ElementDescriptor> descriptors = new ArrayList<ElementDescriptor>();
    descriptors.add(new EPackageRegistryDescriptor());
    descriptors.add(new TCPConnectorDescriptor());
    descriptors.add(new TCPAcceptorDescriptor());
    descriptors.add(new EClassifierDescriptor());
    descriptors.add(new EAttributeDescriptor());
    descriptors.add(new EStructuralFeatureDescriptor());
    descriptors.add(new EReferenceDescriptor());
    descriptors.add(new EPackageRegistryDescriptor());
    descriptors.add(new EReferenceDescriptor());
    descriptors.add(new EPackageRegistryDescriptor());

    for (int i = 0; i < 5; i++)
    {
      Element child = dummyElementProvider.createElement();
      element.addReference(true, child.getID());
      for (int a = 0; a < 10; a++)
      {
        Element level2Child = dummyElementProvider.createElement(descriptors.get(i));
        child.addReference(false, level2Child.getID());
      }
    }

    viewer.addElement(element);

    // Thread t = new Thread(new Runnable()
    // {
    // public void run()
    // {
    // sleep(3000);
    // // Element element2 = dummyElementProvider.createElement();
    // // element.addReference(true, element2.getID());
    // // viewer.addElement(element2);
    //
    // sleep(3000);
    //
    // // viewer.removeElement(element2);
    // }
    //
    // private void sleep(int time)
    // {
    // try
    // {
    // Thread.sleep(time);
    // }
    // catch (InterruptedException ex)
    // {
    // throw new RuntimeException(ex);
    // }
    // }
    // });
    //
    // t.start();

    // ArrayList<String> elementsToBeHidden = new ArrayList<String>();
    // elementsToBeHidden.add("Acceptor");
    // viewer.filter(elementsToBeHidden);

    shell.open();
    while (!shell.isDisposed())
    {
      if (!display.readAndDispatch())
      {
        display.sleep();
      }
    }
    display.dispose();
    System.exit(0);
  }
}
