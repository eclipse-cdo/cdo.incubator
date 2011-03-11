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

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.ui.UIUtil;
import org.eclipse.net4j.util.ui.views.ContainerView;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class ElementView extends ContainerView
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ElementView";

  public static final ValueNotifier<ElementView> INSTANCE = new ValueNotifier<ElementView>(ID);

  private Image agentIcon;

  public ElementView()
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
    createThreeDeeWorldListener();
  }

  private void createThreeDeeWorldListener()
  {
    getSite().getPage().addSelectionListener(new ISelectionListener()
    {
      public void selectionChanged(IWorkbenchPart part, final ISelection sel)
      {
        Display.getDefault().asyncExec(new Runnable()
        {
          public void run()
          {
            IElementSelection selection = (IElementSelection)sel;
            Element element = selection.getElement();
            TreeViewer viewer = getViewer();

            viewer.reveal(element);
            StructuredSelection newSelection = new StructuredSelection(element);

            viewer.setSelection(newSelection);
          }
        });
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
