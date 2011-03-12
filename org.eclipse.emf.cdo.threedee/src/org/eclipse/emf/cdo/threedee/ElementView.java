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
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.Event;
import org.eclipse.net4j.util.event.EventUtil;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.event.INotifier;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.ui.UIUtil;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class ElementView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ElementView";

  public static final ValueNotifier<ElementView> INSTANCE = new ValueNotifier<ElementView>(ID);

  private Notifier notifier = new Notifier();

  private ICheckStateListener checkStateListener = new CheckStateListener();

  private IListener frontendListener = new FrontendListener();

  private boolean subTreeChecking = true;

  private CheckboxTreeViewer viewer;

  public ElementView()
  {
  }

  public INotifier getNotifier()
  {
    return notifier;
  }

  public boolean isSubTreeChecking()
  {
    return subTreeChecking;
  }

  public void setSubTreeChecking(boolean subTreeChecking)
  {
    this.subTreeChecking = subTreeChecking;
  }

  public Set<Element> getAllChecked()
  {
    return getAllChecked(true);
  }

  public Set<Element> getAllChecked(boolean checked)
  {
    Set<Element> result = new HashSet<Element>();
    for (Session session : Frontend.INSTANCE.getElements())
    {
      for (Element element : session.getAllElements())
      {
        if (viewer.getChecked(element) == checked)
        {
          result.add(element);
        }
      }
    }

    return result;
  }

  public void setAllChecked(boolean checked)
  {
    try
    {
      viewer.removeCheckStateListener(checkStateListener);
      for (Session session : Frontend.INSTANCE.getElements())
      {
        for (Element element : session.getAllElements())
        {
          viewer.setChecked(element, checked);
        }
      }
    }
    finally
    {
      viewer.addCheckStateListener(checkStateListener);
    }

    notifier.fireCheckStateChangedEvent();
  }

  @Override
  public void createPartControl(Composite parent)
  {
    viewer = new CheckboxTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new LabelProvider(viewer.getControl().getDisplay()));
    viewer.setSorter(new NameSorter());
    viewer.setInput(Frontend.INSTANCE);
    viewer.addCheckStateListener(checkStateListener);

    setAllChecked(true);
    INSTANCE.setValue(this);

    Frontend.INSTANCE.addListener(frontendListener);

    getSite().setSelectionProvider(viewer);
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
          Display.getDefault().asyncExec(new Runnable()
          {
            public void run()
            {
              @SuppressWarnings("unchecked")
              List<Object> list = ((StructuredSelection)viewer.getSelection()).toList();
              Set<Object> old = new HashSet<Object>(list);
              if (!ObjectUtil.equals(old, elements))
              {
                Element[] array = elements.toArray(new Element[elements.size()]);
                viewer.setSelection(new StructuredSelection(array), true);
              }
            }
          });
        }
      }
    });
  }

  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  @Override
  public void dispose()
  {
    Frontend.INSTANCE.removeListener(new FrontendListener());
    INSTANCE.setValue(null);
    super.dispose();
  }

  /**
   * @author Eike Stepper
   */
  public static final class CheckStateEvent extends Event
  {
    private static final long serialVersionUID = 1L;

    public CheckStateEvent(INotifier notifier)
    {
      super(notifier);
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class ViewContentProvider implements ITreeContentProvider
  {
    public ViewContentProvider()
    {
    }

    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object object)
    {
      return getChildren(object);
    }

    public Object[] getChildren(Object object)
    {
      if (object instanceof IContainer<?>)
      {
        IContainer<?> container = (IContainer<?>)object;
        return container.getElements();
      }

      return new Object[0];
    }

    public Object getParent(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
        Element container = element.getContainer();
        if (container == null)
        {
          return element.getProvider();
        }

        return container;
      }

      if (object instanceof Session)
      {
        return Frontend.INSTANCE;
      }

      return null;
    }

    public boolean hasChildren(Object object)
    {
      Object[] children = getChildren(object);
      return children != null && children.length != 0;
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class LabelProvider extends org.eclipse.jface.viewers.LabelProvider
  {
    private Image agentIcon;

    public LabelProvider(Display display)
    {
      ImageDescriptor descriptor = OM.Activator.INSTANCE.loadImageDescriptor("icons/agent.gif");
      agentIcon = descriptor.createImage(UIUtil.getDisplay());
    }

    @Override
    public Image getImage(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
        Color color = element.getDescriptor().getColor().getValue();
        return ColorIcons.get(color);
      }

      if (object instanceof Session)
      {
        return agentIcon;
      }

      return super.getImage(object);
    }

    @Override
    public void dispose()
    {
      agentIcon.dispose();
      super.dispose();
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class NameSorter extends ViewerSorter
  {
    public NameSorter()
    {
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class CheckStateListener implements ICheckStateListener
  {
    public void checkStateChanged(CheckStateChangedEvent event)
    {
      if (subTreeChecking)
      {
        try
        {
          viewer.removeCheckStateListener(checkStateListener);
          Element descriptor = (Element)event.getElement();
          viewer.setSubtreeChecked(descriptor, event.getChecked());
        }
        finally
        {
          viewer.addCheckStateListener(checkStateListener);
        }
      }

      notifier.fireCheckStateChangedEvent();
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class Notifier extends org.eclipse.net4j.util.event.Notifier
  {
    public void fireCheckStateChangedEvent()
    {
      fireEvent(new CheckStateEvent(this));
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class FrontendListener extends ContainerEventAdapter<Object>
  {
    @Override
    protected void onAdded(IContainer<Object> container, Object object)
    {
      addElement(object);
      refreshViewer();
    }

    @Override
    protected void onRemoved(IContainer<Object> container, Object object)
    {
      removeElement(object);
      refreshViewer();
    }

    private void refreshViewer()
    {
      try
      {
        viewer.getControl().getDisplay().asyncExec(new Runnable()
        {
          public void run()
          {
            try
            {
              viewer.refresh();
            }
            catch (Exception ignore)
            {
            }
          }
        });
      }
      catch (Exception ignore)
      {
      }
    }

    private void addElement(Object object)
    {
      if (object instanceof Element)
      {
        Element element = (Element)object;
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
      }
    }
  }
}
