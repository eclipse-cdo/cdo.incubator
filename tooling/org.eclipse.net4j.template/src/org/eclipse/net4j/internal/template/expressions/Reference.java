package org.eclipse.net4j.internal.template.expressions;

import org.eclipse.net4j.internal.template.TemplateProperty;

import java.util.List;

/**
 * @author Eike Stepper
 */
public class Reference extends Expression
{
  private String name;

  public Reference(String name)
  {
    this.name = name;
  }

  @Override
  public String evaluate(EvaluationContext context)
  {
    TemplateProperty property = context.resolve(name);
    context.push(name);

    try
    {
      return property.evaluate(context);
    }
    finally
    {
      context.pop(name);
    }
  }

  @Override
  public void collectReferenceNames(List<String> referenceNames)
  {
    referenceNames.add(name);
  }
}
