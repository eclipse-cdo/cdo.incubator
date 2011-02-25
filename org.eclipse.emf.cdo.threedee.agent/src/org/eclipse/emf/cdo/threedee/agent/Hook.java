/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.agent;

import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;

/**
 * @author Eike Stepper
 */
public class Hook
{
  private static Map<Thread, Stack> stacks = new WeakHashMap<Thread, Stack>();

  public static void before(Object target)
  {
    Stack stack = getStack();
    Object last = stack.peek();
    stack.push(target);
    // if (target != last && last != null)
    {
      Agent.INSTANCE.beforeCall(last, target);
    }
  }

  public static void after(Object target)
  {
    Stack stack = getStack();
    stack.pop();
    Object last = stack.peek();
    // if (target != last && last != null)
    {
      Agent.INSTANCE.afterCall(last, target);
    }
  }

  private static Stack getStack()
  {
    Thread thread = Thread.currentThread();
    Stack stack = stacks.get(thread);
    if (stack == null)
    {
      stack = new Stack();
      stacks.put(thread, stack);
    }

    return stack;
  }

  /**
   * @author Eike Stepper
   */
  private static final class Stack extends LinkedList<Object>
  {
    private static final long serialVersionUID = 1L;

    @Override
    public Object pop()
    {
      try
      {
        return super.pop();
      }
      catch (NoSuchElementException ex)
      {
        return null;
      }
    }
  }
}
