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
import org.eclipse.net4j.template.ITemplateProperty;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.StringUtil;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class PropertyEntryPage extends WizardPage
{
  private ITemplate template;

  private Composite container;

  private Map<ITemplateProperty, Text> fields;

  public PropertyEntryPage()
  {
    super("PropertyEntryPage");
    setTitle("Template Properties");
    setDescription("This wizard creates a new file with *.mpe extension that can be opened by a multi-page editor.");
  }

  public void createControl(Composite parent)
  {
    container = new Composite(parent, SWT.NONE);
    container.setLayout(new GridLayout(3, false));
    dialogChanged();
    setControl(container);
  }

  @Override
  public void setVisible(boolean visible)
  {
    if (visible)
    {
      ((NewProjectFromTemplateWizard)getWizard()).setLastPage(true);
      if (container != null)
      {
        for (Control child : container.getChildren())
        {
          child.dispose();
        }

        ITemplate template = ((NewProjectFromTemplateWizard)getWizard()).getTemplate();
        if (this.template != template)
        {
          this.template = template;
          if (template != null)
          {
            createFields();
          }

          container.layout();
          for (Control child : container.getChildren())
          {
            if (child instanceof Text)
            {
              child.setFocus();
              break;
            }
          }
        }
      }
    }

    super.setVisible(visible);
  }

  private void createFields()
  {
    fields = new HashMap<ITemplateProperty, Text>();
    for (final ITemplateProperty property : template.getTemplateProperties())
    {
      final boolean derived = property.isExpression() && !property.isLiteral();
      boolean enabled = !derived || property.isOverridden();
      final String value = StringUtil.safe(property.getValue());

      Label label = new Label(container, SWT.NONE);
      label.setText(property.getName());
      label.setEnabled(enabled);

      final Text text = new Text(container, SWT.BORDER | SWT.SINGLE);
      text.setText(value);
      text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
      text.setEnabled(enabled);
      text.addModifyListener(new ModifyListener()
      {
        public void modifyText(ModifyEvent e)
        {
          // if (!property.isExpression() || property.isLiteral())
          {
            String newValue = text.getText();
            if (!ObjectUtil.equals(newValue, property.getValue()))
            {
              property.setValue(newValue);
              recalculate();
            }
          }
        }
      });

      fields.put(property, text);
      if (derived)
      {
        final Button button = new Button(container, SWT.CHECK);
        button.setText("Override");
        button.setSelection(property.isOverridden());
        button.addSelectionListener(new SelectionAdapter()
        {
          @Override
          public void widgetSelected(SelectionEvent e)
          {
            boolean overridden = button.getSelection();
            if (overridden)
            {
              property.setValue(StringUtil.safe(property.getValue()));
            }
            else
            {
              property.setValue(null);
            }

            recalculate();
            List<Control> children = Arrays.asList(text.getParent().getChildren());
            Control label = children.get(children.indexOf(text) - 1);
            label.setEnabled(overridden);
            text.setEnabled(overridden);
          }
        });
      }
      else
      {
        new Label(container, SWT.NONE);
      }
    }
  }

  private void dialogChanged()
  {
    updateStatus(null);
  }

  private void updateStatus(String message)
  {
    setErrorMessage(message);
    setPageComplete(message == null);
  }

  private void recalculate()
  {
    for (final ITemplateProperty property : template.getTemplateProperties())
    {
      if (property.isExpression() && !property.isLiteral() && !property.isOverridden())
      {
        Text text = fields.get(property);
        String value = StringUtil.safe(property.getValue());
        if (!ObjectUtil.equals(text.getText(), value))
        {
          text.setText(value);
        }
      }
    }
  }
}
