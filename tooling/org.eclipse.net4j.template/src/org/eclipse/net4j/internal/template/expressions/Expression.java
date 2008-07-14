package org.eclipse.net4j.internal.template.expressions;

import java.util.List;

/**
 * @author Eike Stepper
 */
public abstract class Expression
{
  public boolean isLiteral()
  {
    return false;
  }

  public abstract String evaluate(EvaluationContext context);

  public abstract void collectReferenceNames(List<String> referenceNames);
}
