/***************************************************************************
 * Copyright (c) 2004 - 2007 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.ecf.provider.internal.net4j.container;

import org.eclipse.net4j.util.container.IElementProcessor;
import org.eclipse.net4j.util.container.IManagedContainer;

import org.eclipse.ecf.provider.net4j.container.Net4jServerSOContainer;

/**
 * @author Eike Stepper
 */
public class Net4jServerContainerInjector implements IElementProcessor
{
  public Net4jServerContainerInjector()
  {
  }

  public Object process(IManagedContainer container, String productGroup, String factoryType, String description,
      Object element)
  {
    if (element instanceof Net4jServerSOContainer)
    {
      Net4jServerSOContainer soContainer = (Net4jServerSOContainer)element;
      if (soContainer.getNet4jContainer() == null)
      {
        soContainer.setNet4jContainer(container);
      }
    }

    return element;
  }
}
