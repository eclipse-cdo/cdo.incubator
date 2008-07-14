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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Eike Stepper
 */
public interface ITemplate extends Comparable<ITemplate>
{
  public ITemplateProject getTemplateProject();

  public IFolder getFolder();

  public String getName();

  public String getDescription();

  public ITemplateProperty getTemplateProperty(String name);

  public ITemplateProperty[] getTemplateProperties();

  public void generate(IProgressMonitor monitor) throws CoreException;
}
