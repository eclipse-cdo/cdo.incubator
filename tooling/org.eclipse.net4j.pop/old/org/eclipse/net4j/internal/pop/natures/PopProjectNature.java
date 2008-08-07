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
package org.eclipse.net4j.internal.pop.natures;

import org.eclipse.core.resources.IProject;

/**
 * @author Eike Stepper
 */
public class PopProjectNature extends Nature
{
  public static final String NATURE_ID = "org.eclipse.net4j.pop.PopProjectNature";

  public PopProjectNature()
  {
    super(NATURE_ID);
  }

  public static IProject[] getProjects()
  {
    return getProjects(NATURE_ID);
  }
}
