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
package org.eclipse.emf.cdo.threedee.ui.views;

import org.eclipse.emf.cdo.threedee.Frontend;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.viewers.ThreeDeeWorldViewer;

import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.views.ThreeDeeWorldView";

  private ThreeDeeWorldViewer viewer;

  public ThreeDeeWorldView()
  {
  }

  @Override
  public void createPartControl(Composite parent)
  {
    viewer = new ThreeDeeWorldViewer(parent);

    addFrontendListener();
  }

  private void addFrontendListener()
  {
    final IListener listener = new ContainerEventAdapter<Container<?>>()
    {
      @Override
      protected void onAdded(IContainer<Container<?>> container, Container<?> element)
      {
        super.onAdded(container, element);
        element.addListener(this);
        System.out.println("Regsiter: " + element);
        if (element instanceof Element)
        {
          viewer.addElement((Element)element);
        }
      }

      @Override
      protected void onRemoved(IContainer<Container<?>> container, Container<?> element)
      {
        super.onRemoved(container, element);
        element.removeListener(this);

        if (element instanceof Element)
        {
          super.onRemoved(container, element);
          viewer.removeElement((Element)element);
        }
      }

      @Override
      protected void notifyOtherEvent(IEvent event)
      {

      }
    };
    Frontend.INSTANCE.addListener(listener);
  }

  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }
}
