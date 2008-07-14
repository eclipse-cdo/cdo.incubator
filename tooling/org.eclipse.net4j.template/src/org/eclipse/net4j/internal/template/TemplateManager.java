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

import org.eclipse.net4j.internal.template.bundle.OM;
import org.eclipse.net4j.internal.template.nature.TemplateNature;
import org.eclipse.net4j.template.ITemplateFunction;
import org.eclipse.net4j.template.ITemplateManager;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class TemplateManager extends Lifecycle implements ITemplateManager
{
  public static final TemplateManager INSTANCE = new TemplateManager();

  private Map<String, ITemplateFunction> templateFunctions = new HashMap<String, ITemplateFunction>();

  private TemplateManager()
  {
  }

  public TemplateProject[] getTemplateProjects() throws CoreException
  {
    checkActive();
    List<TemplateProject> result = new ArrayList<TemplateProject>();
    for (IProject project : TemplateNature.getProjects())
    {
      if (project.exists() && project.isOpen())
      {
        TemplateProject templateProject = new TemplateProject(project);
        result.add(templateProject);
      }
    }

    return result.toArray(new TemplateProject[result.size()]);
  }

  public Map<String, ITemplateFunction> getTemplateFunctions()
  {
    checkActive();
    return templateFunctions;
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    initTemplateFunctions();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    templateFunctions.clear();
    super.doDeactivate();
  }

  private void initTemplateFunctions()
  {
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    IConfigurationElement[] elements = registry.getConfigurationElementsFor(OM.BUNDLE_ID, "functions");
    for (IConfigurationElement element : elements)
    {
      try
      {
        String name = element.getAttribute("name");
        ITemplateFunction templateFunction = (ITemplateFunction)element.createExecutableExtension("class");
        templateFunctions.put(name, templateFunction);
      }
      catch (Exception ex)
      {
        OM.LOG.error(ex);
      }
    }
  }
}
