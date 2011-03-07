/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui;

import org.eclipse.emf.cdo.threedee.DescriptorView;
import org.eclipse.emf.cdo.threedee.DescriptorView.CheckStateEvent;
import org.eclipse.emf.cdo.threedee.Frontend;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.Element.TransmissionEvent;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.EventUtil;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.event.ValueEvent;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import java.util.Set;

/**
 * TODO
 * <ul>
 * <li>Filter check profiles
 * <li>Colored element icons
 * <li>Implement object picker and camera navigation to the selected element
 * <li>Visualization of references if something is called
 * </ul>
 * 
 * @author Martin Fluegge
 */
public class ThreeDeeView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorld";

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeView.class);

  private IListener frontendListener = new FrontendListener();

  private DescriptorViewListener descriptorViewListener = new DescriptorViewListener();

  private ThreeDeeWorld world;

  public ThreeDeeView()
  {
  }

  public ThreeDeeWorld getWorld()
  {
    return world;
  }

  @Override
  public void createPartControl(Composite parent)
  {
    world = new ThreeDeeWorld(parent);
    Frontend.INSTANCE.addListener(frontendListener);

    DescriptorView.INSTANCE.addListener(descriptorViewListener);
    descriptorViewListener.connect(DescriptorView.INSTANCE.getValue());
  }

  @Override
  public void dispose()
  {
    DescriptorView.INSTANCE.removeListener(descriptorViewListener);
    Frontend.INSTANCE.removeListener(new FrontendListener());
    world.dispose();
    super.dispose();
  }

  @Override
  public void setFocus()
  {
    world.getComposite().setFocus();
  }

  /**
   * @author Martin Fluegge
   */
  private final class FrontendListener extends ContainerEventAdapter<Object>
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
      if (event instanceof TransmissionEvent)
      {
        world.showCall((Element)event.getSource(), ((TransmissionEvent)event).getReceiver());
      }
    }

    private void addElement(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
        world.addElement(element);
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

        world.removeElement(element);
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class DescriptorViewListener implements IListener
  {
    public void notifyEvent(IEvent event)
    {
      if (event instanceof ValueEvent)
      {
        ValueEvent<?> e = (ValueEvent<?>)event;
        if (e.getSource() == DescriptorView.INSTANCE)
        {
          DescriptorView oldView = (DescriptorView)e.getOldValue();
          if (oldView != null)
          {
            oldView.getNotifier().removeListener(this);
          }

          DescriptorView newView = (DescriptorView)e.getNewValue();
          connect(newView);
        }
      }
      else if (event instanceof CheckStateEvent)
      {
        DescriptorView view = DescriptorView.INSTANCE.getValue();
        Set<ElementDescriptor> toBeHidden = view.getAllChecked(false);
        world.filter(toBeHidden);
      }
    }

    public void connect(DescriptorView view)
    {
      if (view != null)
      {
        view.getNotifier().addListener(this);
      }
    }
  }
}
