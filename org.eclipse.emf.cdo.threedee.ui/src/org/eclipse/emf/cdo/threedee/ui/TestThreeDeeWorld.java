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
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.RepositoryDescriptor;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j.TCPConnectorDescriptor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Martin Fluegge
 */
public class TestThreeDeeWorld
{

  public static void main(String[] args)
  {
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setSize(800, 600);
    shell.setLayout(new FillLayout(SWT.VERTICAL));

    final ThreeDeeWorldViewer viewer = new ThreeDeeWorldViewer(shell);
    // ThreeDeeWorldComposite composite = new ThreeDeeWorldComposite(shell, SWT.EMBEDDED | SWT.NO_BACKGROUND);

    viewer.addElement(new Element(0, new RepositoryDescriptor(), null));

    Thread t = new Thread(new Runnable()
    {

      public void run()
      {
        for (int i = 0; i < 1000; i++)
        {
          viewer.addElement(new Element(i, new TCPConnectorDescriptor(), null));
          try
          {
            Thread.sleep(10);
          }
          catch (InterruptedException ex)
          {
            ex.printStackTrace();
          }
        }
      }
    });

    t.start();

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

  }
}
