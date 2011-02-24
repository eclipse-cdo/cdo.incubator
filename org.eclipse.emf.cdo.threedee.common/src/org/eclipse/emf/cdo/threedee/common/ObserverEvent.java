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
package org.eclipse.emf.cdo.threedee.common;

/**
 * @author Eike Stepper
 */
public abstract class ObserverEvent
{

  /**
   * @author Eike Stepper
   */
  public static class Creation extends ObserverEvent
  {
    private Observer observer;

    public Creation(Observer observer)
    {
      this.observer = observer;
    }

    public Observer getObserver()
    {
      return observer;
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Call extends ObserverEvent
  {
    private Observer source;

    private Observer target;

    private When when;

    public Call(Observer source, Observer target, When when)
    {
      this.source = source;
      this.target = target;
      this.when = when;
    }

    public When getWhen()
    {
      return when;
    }

    public Observer getSource()
    {
      return source;
    }

    public Observer getTarget()
    {
      return target;
    }

    /**
     * @author Eike Stepper
     */
    public static enum When
    {
      BEFORE, AFTER
    }
  }
}
