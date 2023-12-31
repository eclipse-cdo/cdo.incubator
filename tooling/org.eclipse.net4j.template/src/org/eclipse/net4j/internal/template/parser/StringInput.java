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
public class StringInput extends Input
{
  private String source;

  private int size;

  private int index;

  public StringInput(String source)
  {
    this.source = source;
    size = source.length();
  }

  @Override
  protected char readChar()
  {
    if (index < size)
    {
      return source.charAt(index++);
    }

    return END_CHAR;
  }

  @Override
  public String toString()
  {
    return source;
  }
}
