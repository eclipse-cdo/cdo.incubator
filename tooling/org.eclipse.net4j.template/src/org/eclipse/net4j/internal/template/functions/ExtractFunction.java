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
package org.eclipse.net4j.internal.template.functions;

import org.eclipse.net4j.internal.template.TemplateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ExtractFunction extends TemplateFunction
{
  public ExtractFunction()
  {
    super("extract");
  }

  public String evaluate(String referenceValue, List<String> arguments)
  {
    String delim = arguments.get(0);
    List<String> segments = new ArrayList<String>();
    StringTokenizer tokenizer = new StringTokenizer(referenceValue, delim);
    while (tokenizer.hasMoreTokens())
    {
      String segment = tokenizer.nextToken();
      segments.add(segment);
    }

    int size = segments.size();
    int begin = Integer.valueOf(arguments.get(1));
    if (begin < 0)
    {
      begin = size + begin;
    }

    int end = arguments.size() > 2 ? Integer.valueOf(arguments.get(2)) : size;
    if (end < 0)
    {
      end = size + end;
    }

    StringBuilder builder = new StringBuilder();
    for (int i = begin; i < end; i++)
    {
      if (i < 0 || i >= size)
      {
        break;
      }

      builder.append(segments.get(i));
      if (i < end - 1)
      {
        builder.append(delim);
      }
    }

    return builder.toString();
  }
}
