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
package org.eclipse.net4j.internal.template;

import org.eclipse.net4j.template.ITemplateProject;
import org.eclipse.net4j.util.WrappedException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class TemplateProject implements ITemplateProject
{
  private IProject project;

  private Map<String, Template> templates;

  public TemplateProject(IProject project)
  {
    this.project = project;
  }

  public String getName()
  {
    checkActive();
    return project.getName();
  }

  public IProject getProject()
  {
    checkActive();
    return project;
  }

  public Template[] getTemplates()
  {
    checkActive();
    initTemplates();
    List<Template> values = new ArrayList<Template>(templates.values());
    Collections.sort(values);
    return values.toArray(new Template[values.size()]);
  }

  public Template getTemplate(String name)
  {
    checkActive();
    initTemplates();
    return templates.get(name);
  }

  public void checkActive()
  {
    if (!TemplateManager.INSTANCE.isActive())
    {
      throw new IllegalStateException("Template manager is not active");
    }
  }

  private void initTemplates()
  {
    if (templates == null)
    {
      try
      {
        templates = new HashMap<String, Template>();
        IFolder templatesFolder = project.getFolder("templates");
        for (IResource member : templatesFolder.members())
        {
          if (member instanceof IFolder)
          {
            IFolder templateFolder = (IFolder)member;
            Template template = new Template(this, templateFolder);
            templates.put(template.getName(), template);
          }
        }
      }
      catch (CoreException ex)
      {
        throw WrappedException.wrap(ex);
      }
    }
  }
}
