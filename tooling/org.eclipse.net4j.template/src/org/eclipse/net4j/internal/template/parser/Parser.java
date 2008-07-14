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
package org.eclipse.net4j.internal.template.parser;

import org.eclipse.net4j.internal.template.TemplateManager;
import org.eclipse.net4j.internal.template.expressions.Call;
import org.eclipse.net4j.internal.template.expressions.Concatenation;
import org.eclipse.net4j.internal.template.expressions.Expression;
import org.eclipse.net4j.internal.template.expressions.Literal;
import org.eclipse.net4j.internal.template.expressions.Reference;
import org.eclipse.net4j.template.ITemplateFunction;
import org.eclipse.net4j.util.ImplementationError;

import java.util.Map;

/**
 * @author Eike Stepper
 */
public final class Parser
{
  private Parser()
  {
  }

  public static Expression parse(String source)
  {
    try
    {
      return parse(new StringInput(source));
    }
    catch (ParseException ex)
    {
      throw new ParseException(source, ex);
    }
  }

  public static Expression parse(Input input)
  {
    Scanner scanner = new Scanner(input);
    Expression result = null;

    for (;;)
    {
      Object token = scanner.scan(false);
      if (token == Scanner.END_OF_INPUT_TOKEN)
      {
        return result;
      }

      if (token == Scanner.DELIMITER_TOKEN)
      {
        result = concatenate(result, parseExpression(scanner));
      }
      else if (token instanceof String)
      {
        result = concatenate(result, new Literal((String)token));
      }
      else
      {
        throw new ImplementationError();
      }
    }
  }

  private static Expression parseExpression(Scanner scanner)
  {
    String reference = scanExpressionLiteral(scanner);
    Object token = scanner.scan(true);
    if (token == Scanner.DELIMITER_TOKEN)
    {
      return new Reference(reference);
    }

    excludeEndOfInput(token);
    ITemplateFunction function = getTemplateFunction((String)token);
    Call call = new Call(reference, function);

    for (;;)
    {
      token = scanner.scan(true);
      excludeEndOfInput(token);
      if (token == Scanner.DELIMITER_TOKEN)
      {
        break;
      }

      call.addArgument((String)token);
    }

    return call;
  }

  private static String scanExpressionLiteral(Scanner scanner)
  {
    Object token = scanner.scan(true);
    if (token instanceof String)
    {
      return (String)token;
    }

    throw new ParseException("Literal expected: " + token);
  }

  private static Expression concatenate(Expression left, Expression right)
  {
    if (left == null)
    {
      return right;
    }

    if (right == null)
    {
      return left;
    }

    if (left instanceof Concatenation)
    {
      ((Concatenation)left).addExpression(right);
      return left;
    }

    Concatenation concatenation = new Concatenation();
    concatenation.addExpression(left);
    concatenation.addExpression(right);
    return concatenation;
  }

  private static void excludeEndOfInput(Object token)
  {
    if (token == Scanner.END_OF_INPUT_TOKEN)
    {
      throw new ParseException("Unexpected end of input");
    }
  }

  private static ITemplateFunction getTemplateFunction(String functionName)
  {
    Map<String, ITemplateFunction> functions = TemplateManager.INSTANCE.getTemplateFunctions();
    ITemplateFunction templateFunction = functions.get(functionName);
    if (templateFunction == null)
    {
      throw new IllegalStateException("Invalid template function: " + functionName);
    }

    return templateFunction;
  }
}
