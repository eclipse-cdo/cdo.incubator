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
package org.eclipse.net4j.template;

import org.eclipse.core.runtime.CoreException;

/**
 * @author Eike Stepper
 */
public interface ITemplateManager
{
  public static final ITemplateManager INSTANCE = org.eclipse.net4j.internal.template.TemplateManager.INSTANCE;

  public ITemplateProject[] getTemplateProjects() throws CoreException;
}
