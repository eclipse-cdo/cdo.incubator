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

import org.eclipse.net4j.internal.template.expressions.EvaluationContext;
import org.eclipse.net4j.internal.template.expressions.Expression;
import org.eclipse.net4j.internal.template.expressions.Literal;
import org.eclipse.net4j.template.ITemplateProperty;

/**
 * @author Eike Stepper
 */
public class TemplateProperty implements ITemplateProperty
{
  private Template template;

  private String name;

  private String value;

  private Expression expression;

  public TemplateProperty(Template template, String name, Expression expression)
  {
    this.template = template;
    this.name = name;
    this.expression = expression;
  }

  public TemplateProperty(Template template, String name, String value)
  {
    this.template = template;
    this.name = name;
    this.value = value;
  }

  public Template getTemplate()
  {
    checkValid();
    return template;
  }

  public String getName()
  {
    checkValid();
    return name;
  }

  public String getValue()
  {
    checkValid();
    EvaluationContext context = getTemplate().createEvaluationContext();
    return evaluate(context);
  }

  public void setValue(String value)
  {
    checkValid();
    this.value = value;
  }

  public boolean isExpression()
  {
    checkValid();
    return expression != null;
  }

  public boolean isLiteral()
  {
    checkValid();
    return expression instanceof Literal;
  }

  public boolean isOverridden()
  {
    checkValid();
    return value != null;
  }

  public Expression getExpression()
  {
    checkValid();
    return expression;
  }

  public String evaluate(EvaluationContext context)
  {
    checkValid();
    if (value != null)
    {
      return value;
    }

    if (expression != null)
    {
      return expression.evaluate(context);
    }

    throw new IllegalStateException("No expression or value set");
  }

  public int compareTo(ITemplateProperty o)
  {
    checkValid();
    int result = template.compareTo(o.getTemplate());
    if (result == 0)
    {
      result = name.compareTo(o.getName());
    }

    return result;
  }

  public void checkValid()
  {
    template.checkActive();
  }
}
