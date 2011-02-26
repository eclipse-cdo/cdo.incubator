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
import org.eclipse.emf.cdo.threedee.common.descriptors.emf.EPackageRegistryDescriptor;
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

    ThreeDeeWorldViewer viewer = new ThreeDeeWorldViewer(shell);
    // ThreeDeeWorldComposite composite = new ThreeDeeWorldComposite(shell, SWT.EMBEDDED | SWT.NO_BACKGROUND);

    viewer.addElement(new Element(0, new RepositoryDescriptor(), null));
    viewer.addElement(new Element(0, new TCPConnectorDescriptor(), null));
    viewer.addElement(new Element(0, new TCPConnectorDescriptor(), null));
    viewer.addElement(new Element(0, new TCPConnectorDescriptor(), null));
    viewer.addElement(new Element(0, new TCPConnectorDescriptor(), null));
    viewer.addElement(new Element(0, new EPackageRegistryDescriptor(), null));
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
