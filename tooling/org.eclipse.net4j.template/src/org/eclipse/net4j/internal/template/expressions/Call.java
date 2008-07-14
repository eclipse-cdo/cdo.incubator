package org.eclipse.net4j.internal.template.expressions;

import org.eclipse.net4j.template.ITemplateFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class Call extends Reference
{
  private ITemplateFunction function;

  private List<String> arguments = new ArrayList<String>();

  public Call(String reference, ITemplateFunction function)
  {
    super(reference);
    this.function = function;
  }

  public void addArgument(String argument)
  {
    arguments.add(argument);
  }

  @Override
  public String evaluate(EvaluationContext context)
  {
    String value = super.evaluate(context);
    return function.evaluate(value, Collections.unmodifiableList(arguments));
  }
}
