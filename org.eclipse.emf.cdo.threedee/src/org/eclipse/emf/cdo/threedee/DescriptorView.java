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

import org.eclipse.emf.cdo.threedee.bundle.OM.Activator;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.event.Event;
import org.eclipse.net4j.util.event.INotifier;
import org.eclipse.net4j.util.event.ValueNotifier;

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
public class DescriptorView extends ViewPart
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.DescriptorView";

  public static final ValueNotifier<DescriptorView> INSTANCE = new ValueNotifier<DescriptorView>(ID);

  private static final Registry INPUT = ElementDescriptor.Registry.INSTANCE;

  private Notifier notifier = new Notifier();

  private ICheckStateListener checkStateListener = new CheckStateListener();

  private boolean subTreeChecking = true;

  private CheckboxTreeViewer viewer;

  public DescriptorView()
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

  public Set<ElementDescriptor> getAllChecked()
  {
    return getAllChecked(true);
  }

  public Set<ElementDescriptor> getAllChecked(boolean checked)
  {
    Set<ElementDescriptor> result = new HashSet<ElementDescriptor>();
    for (ElementDescriptor descriptor : INPUT.values())
    {
      if (viewer.getChecked(descriptor) == checked)
      {
        result.add(descriptor);
      }
    }

    return result;
  }

  public void setAllChecked(boolean checked)
  {
    try
    {
      viewer.removeCheckStateListener(checkStateListener);
      for (ElementDescriptor descriptor : INPUT.values())
      {
        viewer.setChecked(descriptor, checked);
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
    viewer.setInput(INPUT);
    viewer.addCheckStateListener(checkStateListener);

    setAllChecked(true);
    INSTANCE.setValue(this);

    getSite().setSelectionProvider(viewer);
    getSite().getPage().addSelectionListener(new ISelectionListener()
    {
      public void selectionChanged(IWorkbenchPart part, final ISelection selection)
      {
        final Set<ElementDescriptor> descriptors = new HashSet<ElementDescriptor>();
        if (selection instanceof IStructuredSelection)
        {
          IStructuredSelection ssel = (IStructuredSelection)selection;
          for (Iterator<?> it = ssel.iterator(); it.hasNext();)
          {
            Object object = it.next();
            if (object instanceof ElementDescriptor)
            {
              ElementDescriptor descriptor = (ElementDescriptor)object;
              descriptors.add(descriptor);
            }
            else if (object instanceof Element)
            {
              Element element = (Element)object;
              descriptors.add(element.getDescriptor());
            }
          }
        }

        if (!descriptors.isEmpty())
        {
          Display.getDefault().syncExec(new Runnable()
          {
            public void run()
            {
              @SuppressWarnings("unchecked")
              List<Object> list = ((StructuredSelection)viewer.getSelection()).toList();
              Set<Object> old = new HashSet<Object>(list);
              if (!ObjectUtil.equals(old, descriptors))
              {
                ElementDescriptor[] array = descriptors.toArray(new ElementDescriptor[descriptors.size()]);
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

    public Object[] getElements(Object parent)
    {
      return getChildren(parent);
    }

    public Object[] getChildren(Object parentElement)
    {
      if (parentElement instanceof ElementDescriptor)
      {
        ElementDescriptor descriptor = (ElementDescriptor)parentElement;
        return descriptor.getSubDescriptors().toArray();
      }

      if (parentElement == INPUT)
      {
        return INPUT.getRootDescriptors().toArray();
      }

      return new Object[0];
    }

    public Object getParent(Object element)
    {
      if (element instanceof ElementDescriptor)
      {
        ElementDescriptor descriptor = (ElementDescriptor)element;
        return descriptor.getSuperDescriptor();
      }

      return null;
    }

    public boolean hasChildren(Object element)
    {
      Object[] children = getChildren(element);
      return children != null && children.length != 0;
    }
  }

  /**
   * @author Eike Stepper
   */
  private static final class LabelProvider extends org.eclipse.jface.viewers.LabelProvider
  {
    private Image folderImage;

    public LabelProvider(Display display)
    {
      folderImage = loadImage(display, "icons/folder.gif");
    }

    @Override
    public Image getImage(Object element)
    {
      if (element instanceof ElementDescriptor)
      {
        ElementDescriptor descriptor = (ElementDescriptor)element;
        if (descriptor.isFolder())
        {
          return folderImage;
        }

        Color color = descriptor.getColor().getValue();
        return ColorIcons.get(color);
      }

      return super.getImage(element);
    }

    @Override
    public String getText(Object element)
    {
      if (element instanceof ElementDescriptor)
      {
        return ((ElementDescriptor)element).getLabel();
      }

      return super.getText(element);
    }

    @Override
    public void dispose()
    {
      folderImage.dispose();
      super.dispose();
    }

    private Image loadImage(Display display, String path)
    {
      ImageDescriptor descriptor = Activator.INSTANCE.loadImageDescriptor(path);
      if (descriptor == null)
      {
        return null;
      }

      return descriptor.createImage(display);
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

    @Override
    public int category(Object element)
    {
      if (element instanceof ElementDescriptor)
      {
        if (((ElementDescriptor)element).isFolder())
        {
          return 0;
        }

        return 1;
      }

      return 3;
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
          ElementDescriptor descriptor = (ElementDescriptor)event.getElement();
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
}
