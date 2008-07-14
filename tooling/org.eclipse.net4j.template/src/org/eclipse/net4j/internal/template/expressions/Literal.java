package org.eclipse.net4j.internal.template.expressions;

import java.util.List;

/**
 * @author Eike Stepper
 */
public class Literal extends Expression
{
  private String value;

  public Literal(String value)
  {
    this.value = value;
  }

  @Override
  public boolean isLiteral()
  {
    return true;
  }

  @Override
  public String evaluate(EvaluationContext context)
  {
    return value;
  }

  @Override
  public void collectReferenceNames(List<String> referenceNames)
  {
    // Do nothing
  }
}
