/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.ui.UIUtil;
import org.eclipse.net4j.util.ui.views.ContainerView;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public class ElementViewOld extends ContainerView
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ElementView";

  public static final ValueNotifier<ElementViewOld> INSTANCE = new ValueNotifier<ElementViewOld>(ID);

  private Image agentIcon;

  public ElementViewOld()
  {
    ImageDescriptor descriptor = OM.Activator.INSTANCE.loadImageDescriptor("icons/agent.gif");
    agentIcon = descriptor.createImage(UIUtil.getDisplay());
  }

  @Override
  protected IContainer<?> getContainer()
  {
    return Frontend.INSTANCE;
  }

  @Override
  protected Image getElementImage(Object object)
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

    return super.getElementImage(object);
  }

  @Override
  protected void createdUI()
  {
    INSTANCE.setValue(this);

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
              Element[] array = elements.toArray(new Element[elements.size()]);
              getViewer().setSelection(new StructuredSelection(array), true);
            }
          });
        }
      }
    });
  }

  @Override
  public void dispose()
  {
    INSTANCE.setValue(null);
    agentIcon.dispose();
    super.dispose();
  }
}
