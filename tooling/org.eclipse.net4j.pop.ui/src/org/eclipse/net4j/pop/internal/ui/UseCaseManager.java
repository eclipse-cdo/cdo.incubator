/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.pop.internal.ui;

import org.eclipse.net4j.pop.ui.IUseCaseManager;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class UseCaseManager extends Lifecycle implements IUseCaseManager
{
  public static final UseCaseManager INSTANCE = new UseCaseManager();

  private List<UseCase> elements = new ArrayList<UseCase>();

  private UseCaseManager()
  {
  }

  public UseCase[] getUseCases()
  {
    synchronized (elements)
    {
      return elements.toArray(new UseCase[elements.size()]);
    }
  }
}
