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

import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public abstract class ObserverEvent
{
  public abstract int getType();

  public abstract void write(ExtendedDataOutputStream out) throws IOException;

  public static ObserverEvent read(ExtendedDataInputStream in, byte type) throws IOException
  {
    switch (type)
    {
    case Creation.TYPE:
      return new Creation(in);

    case Call.TYPE:
      return new Call(in);

    default:
      throw new RuntimeException();
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Creation extends ObserverEvent
  {
    public static final byte TYPE = 1;

    private Observer observer;

    public Creation(Observer observer)
    {
      this.observer = observer;
    }

    public Creation(ExtendedDataInputStream in) throws IOException
    {
      int id = in.readInt();
      new Observer(id);
    }

    public Observer getObserver()
    {
      return observer;
    }

    @Override
    public int getType()
    {
      return TYPE;
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      out.writeInt(observer.getID());
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Call extends ObserverEvent
  {
    public static final byte TYPE = 2;

    private Observer source;

    private Observer target;

    private When when;

    public Call(Observer source, Observer target, When when)
    {
      this.source = source;
      this.target = target;
      this.when = when;
    }

    public Call(ExtendedDataInputStream in) throws IOException
    {
      int sourceID = in.readInt();
      int targetID = in.readInt();
      when = in.readBoolean() ? When.BEFORE : When.AFTER;
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

    @Override
    public int getType()
    {
      return TYPE;
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      out.writeInt(source.getID());
      out.writeInt(target.getID());
      out.writeBoolean(when == When.BEFORE);
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
