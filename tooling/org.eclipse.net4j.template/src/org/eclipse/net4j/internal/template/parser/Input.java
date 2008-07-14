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

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Eike Stepper
 */
public abstract class Input
{
  public static final char DELIM_CHAR = '@';

  public static final char ESCAPE_CHAR = '\\';

  public static final char END_CHAR = '\uFEFF'; // http://en.wikipedia.org/wiki/Byte_Order_Mark

  private Queue<Character> buffer = new LinkedList<Character>();

  public Input()
  {
  }

  public final void pushBack(char c)
  {
    buffer.offer(c);
  }

  public final char nextChar()
  {
    if (buffer.isEmpty())
    {
      return readChar();
    }

    return buffer.poll();
  }

  /**
   * Must return {@link #END_CHAR} on end of input.
   */
  protected abstract char readChar();
}
