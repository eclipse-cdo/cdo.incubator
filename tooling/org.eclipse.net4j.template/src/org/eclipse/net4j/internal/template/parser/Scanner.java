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

/**
 * @author Eike Stepper
 */
public class Scanner
{
  public static final Integer DELIMITER_TOKEN = 1;

  public static final Integer END_OF_INPUT_TOKEN = 2;

  private Input input;

  private Object lookAheadToken;

  public Scanner(Input input)
  {
    this.input = input;
  }

  public Object scan(boolean considerWhitespace)
  {
    if (lookAheadToken != null)
    {
      Object token = lookAheadToken;
      lookAheadToken = null;
      return token;
    }

    if (considerWhitespace)
    {
      consumeWhiteSpace();
    }

    StringBuilder builder = new StringBuilder();
    for (;;)
    {
      char c = input.nextChar();
      switch (c)
      {
      case Input.ESCAPE_CHAR:
        char lookAhead = input.nextChar();
        switch (lookAhead)
        {
        case Input.ESCAPE_CHAR:
        case Input.DELIM_CHAR:
          builder.append(lookAhead);
          break;

        default:
          builder.append(c);
          input.pushBack(lookAhead);
        }
        break;

      case Input.DELIM_CHAR:
        if (builder.length() == 0)
        {
          return DELIMITER_TOKEN;
        }

        lookAheadToken = DELIMITER_TOKEN;
        return builder.toString();

      case Input.END_CHAR:
        if (builder.length() == 0)
        {
          return END_OF_INPUT_TOKEN;
        }

        lookAheadToken = END_OF_INPUT_TOKEN;
        return builder.toString();

      default:
        if (considerWhitespace && isWhiteSpace(c))
        {
          return builder.toString();
        }

        builder.append(c);
      }
    }
  }

  private boolean isWhiteSpace(char c)
  {
    return Character.isWhitespace(c);
  }

  private void consumeWhiteSpace()
  {
    char c = input.nextChar();
    while (isWhiteSpace(c))
    {
      c = input.nextChar();
    }

    input.pushBack(c);
  }
}
