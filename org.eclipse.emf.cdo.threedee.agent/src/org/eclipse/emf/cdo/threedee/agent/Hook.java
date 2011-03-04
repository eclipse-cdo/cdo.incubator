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

import org.eclipse.emf.cdo.threedee.agent.bundle.OM;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;

/**
 * @author Eike Stepper
 */
public class Hook
{
  private static final ContextTracer TRACER_BEFORE = new ContextTracer(OM.DEBUG_HOOK_CALL_BEFORE, Agent.class);

  private static final ContextTracer TRACER_AFTER = new ContextTracer(OM.DEBUG_HOOK_CALL_AFTER, Agent.class);

  private static Map<Thread, Stack> stacks = new WeakHashMap<Thread, Stack>();

  public static void before(Object target, String what)
  {
    Stack stack = getStack();
    Object last = stack.peek();
    stack.push(target);

    if (TRACER_BEFORE.isEnabled())
    {
      TRACER_AFTER.trace(format(last, target, what));
    }

    Agent.INSTANCE.beforeCall(last, target, what);
  }

  public static void after(Object target, String what)
  {
    Stack stack = getStack();
    stack.pop();
    Object last = stack.peek();

    if (TRACER_AFTER.isEnabled())
    {
      TRACER_BEFORE.trace(format(last, target, what));
    }

    Agent.INSTANCE.afterCall(last, target, what);
  }

  private static String format(Object source, Object target, String what)
  {
    String string = " --> " + target.getClass().getName() + "." + what + "()";
    if (source == null)
    {
      return string;
    }

    return source.getClass().getName() + string;
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
    private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG_HOOK_STACK, Agent.class);

    private static final long serialVersionUID = 1L;

    public void push(Object object)
    {
      if (TRACER.isEnabled())
      {
        TRACER.trace("PUSH " + object.getClass().getName()); //$NON-NLS-1$
      }

      addFirst(object);
    }

    public Object pop()
    {
      try
      {
        Object object = removeFirst();
        if (TRACER.isEnabled())
        {
          TRACER.trace("POP " + object.getClass().getName()); //$NON-NLS-1$
        }

        return object;
      }
      catch (NoSuchElementException ex)
      {
        return null;
      }
    }
  }
}
