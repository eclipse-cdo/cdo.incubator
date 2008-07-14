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
import org.eclipse.net4j.internal.template.expressions.EvaluationContext;
import org.eclipse.net4j.internal.template.expressions.Expression;
import org.eclipse.net4j.internal.template.expressions.Literal;
import org.eclipse.net4j.internal.template.parser.Input;
import org.eclipse.net4j.internal.template.parser.ParseException;
import org.eclipse.net4j.internal.template.parser.Parser;
import org.eclipse.net4j.template.ITemplate;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.io.IORuntimeException;
import org.eclipse.net4j.util.io.IOUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author Eike Stepper
 */
public class Template implements ITemplate
{
  private TemplateProject templateProject;

  private IFolder folder;

  private String description;

  private Map<String, TemplateProperty> templateProperties;

  private Map<IResource, Expression> resourceExpressions;

  private Set<String> unresolvedNames;

  private Set<IPath> ignoredFiles;

  public Template(TemplateProject templateProject, IFolder templateFolder) throws CoreException
  {
    this.templateProject = templateProject;
    folder = templateFolder;
  }

  public TemplateProject getTemplateProject()
  {
    checkActive();
    return templateProject;
  }

  public IFolder getFolder()
  {
    checkActive();
    return folder;
  }

  public String getName()
  {
    checkActive();
    return folder.getName();
  }

  public String getDescription()
  {
    checkActive();
    if (description == null)
    {
      description = "";
      IFile file = folder.getFile("description.txt");
      if (file.exists())
      {
        InputStream input = null;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try
        {
          input = file.getContents();
          IOUtil.copy(input, output);
          description = output.toString();
        }
        catch (Exception ex)
        {
          OM.LOG.error(ex);
        }
        finally
        {
          IOUtil.close(input);
        }
      }
    }

    return description;
  }

  public TemplateProperty getTemplateProperty(String name)
  {
    checkActive();
    initTemplate();
    return templateProperties.get(name);
  }

  public TemplateProperty[] getTemplateProperties()
  {
    checkActive();
    initTemplate();
    List<TemplateProperty> values = new ArrayList<TemplateProperty>(templateProperties.values());
    Collections.sort(values);
    return values.toArray(new TemplateProperty[values.size()]);
  }

  public Set<String> getUnresolvedNames()
  {
    checkActive();
    return unresolvedNames;
  }

  public int compareTo(ITemplate o)
  {
    checkActive();
    return getName().compareTo(o.getName());
  }

  public EvaluationContext createEvaluationContext()
  {
    checkActive();
    return new EvaluationContext(this);
  }

  public void generate(IProgressMonitor monitor) throws CoreException
  {
    try
    {
      List<IFolder> projectFolders = getProjectFolders();
      monitor.beginTask("Creating projects", projectFolders.size());
      for (IFolder projectFolder : projectFolders)
      {
        generateProject(projectFolder, new SubProgressMonitor(monitor, 1));
      }
    }
    catch (CoreException ex)
    {
      OM.LOG.error(ex);
      throw ex;
    }
    catch (RuntimeException ex)
    {
      OM.LOG.error(ex);
      throw ex;
    }
  }

  public void checkActive()
  {
    templateProject.checkActive();
  }

  private void initTemplate()
  {
    if (templateProperties == null)
    {
      try
      {
        templateProperties = new HashMap<String, TemplateProperty>();
        resourceExpressions = new HashMap<IResource, Expression>();
        unresolvedNames = new HashSet<String>();
        ignoredFiles = readIgnoredFiles();

        initTemplateProperties();
        rememberUnresolvedNames(getTemplatePropertyExpressions());

        List<Expression> lineExpressions = new ArrayList<Expression>();
        initUndefinedProperties(lineExpressions);
        rememberUnresolvedNames(resourceExpressions.values());
        for (Expression expression : lineExpressions)
        {
          rememberUnresolvedNames(expression);
        }

        for (String name : unresolvedNames)
        {
          templateProperties.put(name, new TemplateProperty(this, name, ""));
        }
      }
      catch (CoreException ex)
      {
        throw WrappedException.wrap(ex);
      }
    }
  }

  private Set<IPath> readIgnoredFiles() throws CoreException
  {
    Set<IPath> result = new HashSet<IPath>();
    IFile ignoreFile = folder.getFile("ignored.files");
    if (ignoreFile.exists())
    {
      BufferedReader reader = null;
      String line;

      try
      {
        reader = new BufferedReader(new InputStreamReader(ignoreFile.getContents()));
        while ((line = reader.readLine()) != null)
        {
          line = line.trim();
          if (line.length() != 0)
          {
            result.add(new Path(line));
          }
        }
      }
      catch (IOException ex)
      {

        String message = "Problem while loading ignore file: " + ignoreFile.getFullPath();
        throw new CoreException(new Status(IStatus.ERROR, OM.BUNDLE_ID, message, ex));
      }
      finally
      {
        IOUtil.close(reader);
      }
    }

    return result;
  }

  private void initTemplateProperties() throws CoreException
  {
    IFile propertiesFile = folder.getFile("template.properties");
    if (propertiesFile.exists())
    {
      Properties properties = new Properties();
      InputStream stream = null;

      try
      {
        stream = propertiesFile.getContents();
        properties.load(stream);
      }
      catch (IOException ex)
      {
        String message = "Problem while loading properties: " + propertiesFile.getFullPath();
        throw new CoreException(new Status(IStatus.ERROR, OM.BUNDLE_ID, message, ex));
      }
      finally
      {
        IOUtil.close(stream);
      }

      for (Entry<Object, Object> entry : properties.entrySet())
      {
        String definition = (String)entry.getValue();
        Expression expression = Parser.parse(definition);
        TemplateProperty templateProperty = new TemplateProperty(this, (String)entry.getKey(), expression);
        templateProperties.put(templateProperty.getName(), templateProperty);
      }
    }
  }

  private void initUndefinedProperties(List<Expression> lineExpressions) throws CoreException
  {
    analyzeFolder(folder, true, lineExpressions);
  }

  private void analyzeFolder(IFolder folder, boolean ignoreFiles, List<Expression> lineExpressions)
      throws CoreException
  {
    for (IResource member : folder.members())
    {
      if (member instanceof IFolder)
      {
        IFolder memberFolder = (IFolder)member;
        analyzeResourceName(memberFolder);
        analyzeFolder(memberFolder, false, lineExpressions);
      }
      else if (!ignoreFiles)
      {
        IFile memberFile = (IFile)member;
        analyzeResourceName(memberFile);
        IPath templateRelativePath = memberFile.getFullPath().removeFirstSegments(3);
        if (!ignoredFiles.contains(templateRelativePath))
        {
          analyzeFile(memberFile, lineExpressions);
        }
      }
    }
  }

  private void analyzeFile(IFile memberFile, List<Expression> lineExpressions) throws CoreException
  {
    InputStream stream = null;
    int index = 0;
    String line;

    try
    {
      stream = memberFile.getContents();
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
      while ((line = reader.readLine()) != null)
      {
        ++index;
        String trimmed = line.trim();
        if (trimmed.length() != 0)
        {
          try
          {
            analyzeFileLine(trimmed, lineExpressions);
          }
          catch (Exception ex)
          {
            throw new ParseException(ex.getMessage() + " (" + memberFile.getFullPath() + ":" + index + ")", ex);
          }
        }
      }
    }
    catch (IOException ex)
    {
      String message = "Problem while analyzing file: " + memberFile.getFullPath();
      throw new CoreException(new Status(IStatus.ERROR, OM.BUNDLE_ID, message, ex));
    }
    finally
    {
      IOUtil.close(stream);
    }
  }

  private void analyzeFileLine(String line, List<Expression> lineExpressions)
  {
    if (line.indexOf(Input.DELIM_CHAR) == -1)
    {
      return;
    }

    Expression expression = Parser.parse(line);
    if (expression instanceof Literal)
    {
      return;
    }

    lineExpressions.add(expression);
  }

  private void analyzeResourceName(IResource resource)
  {
    Expression expression = Parser.parse(resource.getName());
    if (!expression.isLiteral())
    {
      resourceExpressions.put(resource, expression);
    }
  }

  private List<Expression> getTemplatePropertyExpressions()
  {
    List<Expression> result = new ArrayList<Expression>();
    for (TemplateProperty templateProperty : templateProperties.values())
    {
      result.add(templateProperty.getExpression());
    }

    return result;
  }

  private void rememberUnresolvedNames(Collection<Expression> expressions)
  {
    for (Expression expression : expressions)
    {
      rememberUnresolvedNames(expression);
    }
  }

  private void rememberUnresolvedNames(Expression expression)
  {
    List<String> referenceNames = new ArrayList<String>();
    expression.collectReferenceNames(referenceNames);

    for (String referenceName : referenceNames)
    {
      if (!templateProperties.containsKey(referenceName))
      {
        unresolvedNames.add(referenceName);
      }
    }
  }

  private String getTargetName(IResource resource)
  {
    Expression expression = resourceExpressions.get(resource);
    if (expression != null)
    {
      return expression.evaluate(createEvaluationContext());
    }

    return resource.getName();
  }

  private List<IFolder> getProjectFolders() throws CoreException
  {
    List<IFolder> result = new ArrayList<IFolder>();
    for (IResource member : folder.members())
    {
      if (member instanceof IFolder)
      {
        IFolder memberFolder = (IFolder)member;
        result.add(memberFolder);
      }
    }

    return result;
  }

  private void generateProject(IFolder projectFolder, IProgressMonitor monitor) throws CoreException
  {
    String name = getTargetName(projectFolder);
    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    File targetFolder = new File(root.getLocation().toString(), name);
    if (targetFolder.exists())
    {
      throw new IllegalStateException("Target folder already exists: " + targetFolder);
    }

    IProject project = root.getProject(name);
    if (project.exists())
    {
      throw new IllegalStateException("Project already exists: " + name);
    }

    generateFolder(projectFolder, targetFolder, monitor);
    project.create(monitor);
    project.open(monitor);
  }

  private void generateFolder(IFolder sourceFolder, File targetFolder, IProgressMonitor monitor) throws CoreException
  {
    IOUtil.mkdirs(targetFolder);
    for (IResource member : sourceFolder.members())
    {
      String memberName = getTargetName(member);
      File targetFile = new File(targetFolder, memberName);
      if (member instanceof IFile)
      {
        generateFile((IFile)member, targetFile, new SubProgressMonitor(monitor, 1));
      }
      else
      {
        generateFolder((IFolder)member, targetFile, new SubProgressMonitor(monitor, 1));
      }
    }
  }

  private void generateFile(IFile sourceFile, File targetFile, IProgressMonitor monitor) throws CoreException
  {
    IPath templateRelativePath = sourceFile.getFullPath().removeFirstSegments(3);
    boolean evaluate = !ignoredFiles.contains(templateRelativePath);
    BufferedReader reader = null;
    Writer writer = null;

    try
    {
      reader = new BufferedReader(new InputStreamReader(sourceFile.getContents()));
      writer = new OutputStreamWriter(IOUtil.openOutputStream(targetFile));

      String line;
      while ((line = reader.readLine()) != null)
      {
        if (evaluate && line.indexOf(Input.DELIM_CHAR) != -1)
        {
          Expression expression = Parser.parse(line);
          line = expression.evaluate(createEvaluationContext());
        }

        writer.write(line);
        writer.write("\n");
      }
    }
    catch (IOException ex)
    {
      throw new IORuntimeException(ex);
    }
    finally
    {
      IOUtil.closeSilent(reader);
      IOUtil.closeSilent(writer);
    }
  }
}
