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

import org.eclipse.net4j.util.event.ValueNotifier;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import java.awt.Color;
import java.util.Collection;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class DescriptorView extends AbstractView<ElementDescriptor>
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.DescriptorView";

  public static final ValueNotifier<DescriptorView> INSTANCE = new ValueNotifier<DescriptorView>(ID);

  private static final Registry INPUT = ElementDescriptor.Registry.INSTANCE;

  public DescriptorView()
  {
  }

  @Override
  public Collection<ElementDescriptor> getContents()
  {
    return INPUT.values();
  }

  @Override
  public Object[] getChildren(Object object)
  {
    if (object instanceof ElementDescriptor)
    {
      ElementDescriptor descriptor = (ElementDescriptor)object;
      return descriptor.getSubDescriptors().toArray();
    }

    if (object == INPUT)
    {
      return INPUT.getRootDescriptors().toArray();
    }

    return new Object[0];
  }

  @Override
  public Object getParent(Object object)
  {
    if (object instanceof ElementDescriptor)
    {
      ElementDescriptor descriptor = (ElementDescriptor)object;
      return descriptor.getSuperDescriptor();
    }

    return null;
  }

  @Override
  public Object getInput()
  {
    return INPUT;
  }

  @Override
  protected IBaseLabelProvider createLabelProvider(Display display)
  {
    return new LabelProvider(display);
  }

  @Override
  protected ViewerSorter createSorter()
  {
    return new NameSorter();
  }

  @Override
  protected void handlePageSelectionObject(Object pageSelectionObject, Collection<ElementDescriptor> contents,
      Set<Object> result)
  {
    if (pageSelectionObject instanceof ElementDescriptor)
    {
      ElementDescriptor descriptor = (ElementDescriptor)pageSelectionObject;
      result.add(descriptor);
    }
    else if (pageSelectionObject instanceof Element)
    {
      Element element = (Element)pageSelectionObject;
      result.add(element.getDescriptor());
    }
  }

  @Override
  protected void setInstance(AbstractView<ElementDescriptor> view)
  {
    INSTANCE.setValue((DescriptorView)view);
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
    public Image getImage(Object object)
    {
      if (object instanceof ElementDescriptor)
      {
        ElementDescriptor descriptor = (ElementDescriptor)object;
        // if (descriptor.isFolder())
        // {
        // return folderImage;
        // }

        Color color = descriptor.getColor().getValue();
        return ColorIcons.get(color);
      }

      return super.getImage(object);
    }

    @Override
    public String getText(Object object)
    {
      if (object instanceof ElementDescriptor)
      {
        int count = 0;
        for (Session session : Frontend.INSTANCE.getElements())
        {
          for (Element element : session.getAllElements())
          {
            if (element.getDescriptor() == object)
            {
              ++count;
            }
          }
        }

        String label = ((ElementDescriptor)object).getLabel();
        if (count != 0)
        {
          label += " (" + count + ")";
        }

        return label;
      }

      return super.getText(object);
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
}
