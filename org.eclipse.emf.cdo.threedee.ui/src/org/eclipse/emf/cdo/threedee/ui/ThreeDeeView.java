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

import org.eclipse.emf.cdo.threedee.AbstractView.CheckStateEvent;
import org.eclipse.emf.cdo.threedee.DescriptorView;
import org.eclipse.emf.cdo.threedee.Frontend;
import org.eclipse.emf.cdo.threedee.Session;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.Element.CallEvent;
import org.eclipse.emf.cdo.threedee.common.Element.TransmissionEvent;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.ui.bundle.OM;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.EventUtil;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.event.ValueEvent;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

  @SuppressWarnings("unused")
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, ThreeDeeView.class);

  private IListener frontendListener = new FrontendListener();

  private DescriptorViewListener descriptorViewListener = new DescriptorViewListener();

  private ThreeDeeWorld world;

  private SmartphoneNavigator smartphoneNavigator;

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

    contributeToActionBars();

    getSite().setSelectionProvider(world);
    getSite().getPage().addSelectionListener(new ISelectionListener()
    {
      public void selectionChanged(IWorkbenchPart part, final ISelection selection)
      {
        final Set<Element> elements = new HashSet<Element>();
        if (selection instanceof IStructuredSelection)
        {
          IStructuredSelection ssel = (IStructuredSelection)selection;
          for (Iterator<?> it = ssel.iterator(); it.hasNext();)
          {
            Object object = it.next();
            if (object instanceof ElementDescriptor)
            {
              ElementDescriptor descriptor = (ElementDescriptor)object;
              for (Session session : Frontend.INSTANCE.getElements())
              {
                for (Element element : session.getAllElements())
                {
                  if (element.getDescriptor() == descriptor)
                  {
                    elements.add(element);
                  }
                }
              }
            }
            else if (object instanceof Element)
            {
              Element element = (Element)object;
              elements.add(element);
            }
          }
        }

        if (!elements.isEmpty())
        {
          @SuppressWarnings("unchecked")
          List<Object> list = world.getSelection().toList();
          Set<Object> old = new HashSet<Object>(list);
          if (!ObjectUtil.equals(old, elements))
          {
            Element[] array = elements.toArray(new Element[elements.size()]);
            world.setSelection(new StructuredSelection(array));
          }
        }
      }
    });

    startSmartphoneNavigation(parent);
  }

  private void startSmartphoneNavigation(Composite composite)
  {
    try
    {
      smartphoneNavigator = new SmartphoneNavigator(composite);
      smartphoneNavigator.start();
    }
    catch (Exception ex)
    {
      System.err.println(ex.getMessage());
    }
  }

  @Override
  public void dispose()
  {
    if (smartphoneNavigator != null)
    {
      smartphoneNavigator.interrupt();
    }

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

  protected void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  protected void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  protected void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  /**
   * @author Martin Fluegge
   */
  private final class FrontendListener extends ContainerEventAdapter<Object>
  {
    @Override
    protected void onAdded(IContainer<Object> container, Object object)
    {
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
        world.showCall((Element)event.getSource(), ((TransmissionEvent)event).getReceiver(), true);
      }
      else if (event instanceof CallEvent)
      {
        world.showCall((Element)event.getSource(), ((CallEvent)event).getTarget(), false);
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
        world.setDisabledDescriptors(toBeHidden);
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
