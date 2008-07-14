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

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Eike Stepper
 */
public class ScannerTest extends TestCase
{
  private static final Integer DELIM = Scanner.DELIMITER_TOKEN;

  public ScannerTest()
  {
  }

  @Override
  protected void setUp() throws Exception
  {
    System.out.println("=====================================================================");
    System.out.println(getName());
    System.out.println("=====================================================================");
    System.out.println();
  }

  public void testLiteral()
  {
    check("This is a single literal", false, "This is a single literal");
    check("This is a single literal", true, "This", "is", "a", "single", "literal");
  }

  public void testEscape()
  {
    check("An \\@ sign", false, "An @ sign");
    check("An \\@ sign", true, "An", "@", "sign");
  }

  public void testExpression()
  {
    check("A @reference.ttt@ test", false, "A ", DELIM, "reference.ttt", DELIM, " test");
    check("A @ref@ test", true, "A", DELIM, "ref", DELIM, "test");
  }

  public void testWhitespaceHead()
  {
    check("A @     \t reference.ttt@ test", false, "A ", DELIM, "     \t reference.ttt", DELIM, " test");
    check("A @     \t ref@ test", true, "A", DELIM, "ref", DELIM, "test");
  }

  public void testWhitespaceTail()
  {
    check("A @reference.ttt     \t @ test", false, "A ", DELIM, "reference.ttt     \t ", DELIM, " test");
    check("A @ref     \t @ test", true, "A", DELIM, "ref", DELIM, "test");
  }

  public void testWhitespacemiddle()
  {
    check("A @xyz     \t reference.ttt@ test", false, "A ", DELIM, "xyz     \t reference.ttt", DELIM, " test");
    check("A @xyz     \t ref@ test", true, "A", DELIM, "xyz", "ref", DELIM, "test");
  }

  private static void check(String source, boolean ignoreWhitespace, Object... tokens)
  {
    System.out.println("CHECKING" + (ignoreWhitespace ? " (consider whitespace)" : ""));

    List<Object> result = scan(source, ignoreWhitespace);
    if (tokens.length != result.size())
    {
      fail(tokens, result);
    }

    for (int i = 0; i < tokens.length; i++)
    {
      Object token = tokens[i];
      if (!token.equals(result.get(i)))
      {
        fail(tokens, result);
      }
    }

    System.out.println("PASSED");
    System.out.println();
  }

  private static List<Object> scan(String source, boolean ignoreWhitespace)
  {
    StringInput input = new StringInput(source);
    Scanner scanner = new Scanner(input);
    List<Object> tokens = new ArrayList<Object>();
    for (;;)
    {
      Object token = scanner.scan(ignoreWhitespace);
      if (token == Scanner.END_OF_INPUT_TOKEN)
      {
        return tokens;
      }

      tokens.add(token);
    }
  }

  private static void fail(Object[] tokens, List<Object> result)
  {
    System.out.println("FAILED");
    System.out.println();

    int size = Math.max(tokens.length, result.size());
    for (int i = 0; i < size; i++)
    {
      System.out.println("--> " + formatToken(i < tokens.length ? tokens[i] : ""));
      System.out.println("--> " + formatToken(i < result.size() ? result.get(i) : ""));
      System.out.println();
    }

    fail("Token mismatch");
  }

  private static String formatToken(Object token)
  {
    if (token == Scanner.DELIMITER_TOKEN)
    {
      return "DELIMITER";
    }

    if (token == Scanner.END_OF_INPUT_TOKEN)
    {
      return "END_OF_INPUT";
    }

    return "\"" + token + "\"";
  }
}
