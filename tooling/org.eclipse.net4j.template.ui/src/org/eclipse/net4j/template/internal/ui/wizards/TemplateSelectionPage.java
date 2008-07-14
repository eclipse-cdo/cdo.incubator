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
package org.eclipse.net4j.template.internal.ui.wizards;

import org.eclipse.net4j.template.ITemplate;
import org.eclipse.net4j.template.ITemplateManager;
import org.eclipse.net4j.template.ITemplateProject;
import org.eclipse.net4j.template.internal.ui.bundle.OM;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author Eike Stepper
 */
public class TemplateSelectionPage extends WizardPage
{
  private TreeViewer selectionViewer;

  private Label descriptionLabel;

  public TemplateSelectionPage()
  {
    super("TemplateSelectionPage");
    setTitle("Template Selection");
    setDescription("This wizard creates a new file with *.mpe extension that can be opened by a multi-page editor.");
  }

  @Override
  public void setVisible(boolean visible)
  {
    if (visible)
    {
      ((NewProjectFromTemplateWizard)getWizard()).setLastPage(false);
    }

    super.setVisible(visible);
  }

  public void createControl(Composite parent)
  {
    Composite container = new Composite(parent, SWT.NONE);
    container.setLayout(new GridLayout(1, false));

    selectionViewer = new TreeViewer(container, SWT.BORDER);
    selectionViewer.setContentProvider(new TemplateContentProvider());
    selectionViewer.setInput(ITemplateManager.INSTANCE);
    selectionViewer.setLabelProvider(new TemplateLabelProvider());
    selectionViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
    selectionViewer.addSelectionChangedListener(new ISelectionChangedListener()
    {
      public void selectionChanged(SelectionChangedEvent event)
      {
        dialogChanged();
      }
    });

    descriptionLabel = new Label(container, SWT.BORDER | SWT.SINGLE);
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    gd.heightHint = 64;
    descriptionLabel.setLayoutData(gd);

    dialogChanged();
    setControl(container);
    selectionViewer.getControl().setFocus();
  }

  private void dialogChanged()
  {
    ITemplate template = getTemplate();
    if (template != null)
    {
      descriptionLabel.setText(template.getDescription());
      updateStatus(null);
    }
    else
    {
      descriptionLabel.setText("");
      updateStatus("A template must be selected");
    }

    ((NewProjectFromTemplateWizard)getWizard()).setTemplate(template);
  }

  private void updateStatus(String message)
  {
    setErrorMessage(message);
    setPageComplete(message == null);
  }

  private ITemplate getTemplate()
  {
    IStructuredSelection selection = (IStructuredSelection)selectionViewer.getSelection();
    Object element = selection.getFirstElement();
    if (element instanceof ITemplate)
    {
      return (ITemplate)element;
    }

    return null;
  }

  /**
   * @author Eike Stepper
   */
  public class TemplateContentProvider implements ITreeContentProvider
  {
    public TemplateContentProvider()
    {
    }

    public void dispose()
    {
    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    {
    }

    public Object[] getChildren(Object parentElement)
    {
      try
      {
        if (parentElement == ITemplateManager.INSTANCE)
        {
          return ITemplateManager.INSTANCE.getTemplateProjects();
        }
        else if (parentElement instanceof ITemplateProject)
        {
          ITemplateProject templateProject = (ITemplateProject)parentElement;
          return templateProject.getTemplates();
        }
      }
      catch (CoreException ex)
      {
        OM.LOG.error(ex);
      }

      return new Object[0];
    }

    public Object getParent(Object element)
    {
      if (element instanceof ITemplateProject)
      {
        return ITemplateManager.INSTANCE;
      }

      if (element instanceof ITemplate)
      {
        ITemplate template = (ITemplate)element;
        return template.getTemplateProject();
      }

      return null;
    }

    public boolean hasChildren(Object element)
    {
      return getChildren(element).length != 0;
    }

    public Object[] getElements(Object inputElement)
    {
      return getChildren(inputElement);
    }
  }

  /**
   * @author Eike Stepper
   */
  public class TemplateLabelProvider extends LabelProvider
  {
    private Image templateProjectImage = OM.getImageDescriptor("icons/template_project.gif").createImage();

    private Image templateImage = OM.getImageDescriptor("icons/template.gif").createImage();

    public TemplateLabelProvider()
    {
    }

    @Override
    public void dispose()
    {
      templateProjectImage.dispose();
      templateImage.dispose();
      super.dispose();
    }

    @Override
    public String getText(Object element)
    {
      if (element instanceof ITemplateProject)
      {
        ITemplateProject templateProject = (ITemplateProject)element;
        return templateProject.getName();
      }

      if (element instanceof ITemplate)
      {
        ITemplate template = (ITemplate)element;
        return template.getName();
      }

      return super.getText(element);
    }

    @Override
    public Image getImage(Object element)
    {
      if (element instanceof ITemplateProject)
      {
        return templateProjectImage;
      }

      if (element instanceof ITemplate)
      {
        return templateImage;
      }

      return super.getImage(element);
    }
  }
}
