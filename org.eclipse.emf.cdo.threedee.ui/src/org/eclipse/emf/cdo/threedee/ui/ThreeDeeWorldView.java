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
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.EventUtil;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author Martin Fluegge
 */
public class ThreeDeeWorldView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.views.ThreeDeeWorldView";

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeWorldView.class);

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
    final IListener listener = new ContainerEventAdapter<Object>()
    {
      @Override
      protected void onAdded(IContainer<Object> container, Object object)
      {
        if (TRACER.isEnabled())
        {
          TRACER.format("onAdded: {0}", object); //$NON-NLS-1$
        }

        addElement(object);
      }

      @Override
      protected void onRemoved(IContainer<Object> container, Object object)
      {
        removeElement(object);
      }

      @Override
      protected void notifyOtherEvent(IEvent event)
      {
      }

      private void addElement(Object object)
      {
        if (object instanceof Element)
        {
          Element element = (Element)object;
          viewer.addElement(element);
          for (Element child : element.getElements())
          {
            addElement(child);
          }
        }

        EventUtil.addListener(object, this);
      }

      private void removeElement(Object object)
      {
        EventUtil.removeListener(object, this);
        if (object instanceof Element)
        {
          Element element = (Element)object;
          for (Element child : element.getElements())
          {
            removeElement(child);
          }

          viewer.removeElement(element);
        }
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
