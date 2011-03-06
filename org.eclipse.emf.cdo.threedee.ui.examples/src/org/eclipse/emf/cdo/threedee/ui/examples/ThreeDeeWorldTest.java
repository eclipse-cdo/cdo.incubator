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
import org.eclipse.emf.cdo.threedee.common.ElementProvider;
import org.eclipse.emf.cdo.threedee.common.descriptors.ManagedContainerDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EAttributeDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EClassifierDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EPackageRegistryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.AcceptorDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPAcceptorDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldViewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    final ThreeDeeWorldViewer viewer = new ThreeDeeWorldViewer(shell);
    // ThreeDeeWorldComposite composite = new ThreeDeeWorldComposite(shell, SWT.EMBEDDED | SWT.NO_BACKGROUND);

    final DummyElementProvider dummyElementProvider = new DummyElementProvider();

    final Element element = dummyElementProvider.createElement(new ManagedContainerDescriptor());

    List<ElementDescriptor> descriptors = new ArrayList<ElementDescriptor>();
    descriptors.add(new EPackageRegistryDescriptor());
    descriptors.add(new TCPConnectorDescriptor());
    descriptors.add(new TCPAcceptorDescriptor());
    descriptors.add(new EClassifierDescriptor());
    descriptors.add(new EAttributeDescriptor());

    for (int i = 0; i < 5; i++)
    {
      Element child = dummyElementProvider.createElement();
      // element.getReferences().put(child.getID(), true);
      element.addReference(true, child.getID());
      for (int a = 0; a < 10; a++)
      {
        Element level2Child = dummyElementProvider.createElement(descriptors.get(i));
        // child.getReferences().put(level2Child.getID(), true);
        child.addReference(true, level2Child.getID());
      }
    }

    viewer.addElement(element);

    Thread t = new Thread(new Runnable()
    {
      public void run()
      {
        sleep(3000);
        Element element2 = dummyElementProvider.createElement();
        element.addReference(true, element2.getID());
        viewer.addElement(element2);

        sleep(3000);

        // viewer.removeElement(element2);
      }

      private void sleep(int time)
      {
        try
        {
          Thread.sleep(time);
        }
        catch (InterruptedException ex)
        {
          throw new RuntimeException(ex);
        }
      }
    });

    // t.start();
    // ArrayList<String> elementsToBeHidden = new ArrayList<String>();
    // elementsToBeHidden.add("Acceptor");
    // viewer.filter(elementsToBeHidden);

    // Thread t = new Thread(new Runnable()
    // {
    // public void run()
    // {
    // for (int i = 0; i < 1000; i++)
    // {
    // viewer.addElement(new Element(i, new TCPConnectorDescriptor(), null));
    // try
    // {
    // Thread.sleep(10);
    // }
    // catch (InterruptedException ex)
    // {
    // ex.printStackTrace();
    // }
    // }
    // }
    // });
    //
    // t.start();

    // for (int i = 0; i < 14; i++)
    // {
    // viewer.addElement(new Element(i, new TCPConnectorDescriptor(), null));
    // }
    // viewer.addElement(new Element(0, new EPackageRegistryDescriptor(), null));
    // composite.pack();

    // shell.pack();
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

  private static class DummyElementProvider implements ElementProvider
  {
    private Map<Integer, Element> elements = new HashMap<Integer, Element>();

    private int id = 0;

    public int getID()
    {
      return id;
    }

    public Element createElement(ElementDescriptor descriptor)
    {
      Element element = new Element(++id, descriptor, this);
      elements.put(element.getID(), element);
      return element;
    }

    public Element getElement(Object object, boolean addOnDemand)
    {
      return elements.get(id);
    }

    public Element getElement(int id)
    {
      return elements.get(id);
    }

    public synchronized Element createElement()
    {
      return createElement(new AcceptorDescriptor());
    }
  }
}
