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

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.event.ValueNotifier;
import org.eclipse.net4j.util.ui.views.ContainerView;

/**
 * @author Eike Stepper
 */
public class ElementView extends ContainerView
{
  public static final String ID = "org.eclipse.emf.cdo.threedee.ElementView";

  public static final ValueNotifier<ElementView> INSTANCE = new ValueNotifier<ElementView>(ID);

  @Override
  protected IContainer<?> getContainer()
  {
    return Frontend.INSTANCE;
  }

  @Override
  protected void createdUI()
  {
    INSTANCE.setValue(this);
  }

  @Override
  public void dispose()
  {
    INSTANCE.setValue(null);
    super.dispose();
  }
}
