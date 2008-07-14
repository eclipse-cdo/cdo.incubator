package org.eclipse.net4j.internal.template.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class Concatenation extends Expression
{
  private List<Expression> expressions = new ArrayList<Expression>();

  public Concatenation()
  {
  }

  public void addExpression(Expression expression)
  {
    expressions.add(expression);
  }

  @Override
  public String evaluate(EvaluationContext context)
  {
    StringBuilder builder = new StringBuilder();
    for (Expression expression : expressions)
    {
      builder.append(expression.evaluate(context));
    }

    return builder.toString();
  }

  @Override
  public void collectReferenceNames(List<String> referenceNames)
  {
    for (Expression expression : expressions)
    {
      expression.collectReferenceNames(referenceNames);
    }
  }
}
