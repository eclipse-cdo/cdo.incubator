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
public abstract class ElementEvent
{
  public abstract int getType();

  public abstract void write(ExtendedDataOutputStream out) throws IOException;

  public static ElementEvent read(ExtendedDataInputStream in, ElementProvider provider, byte type) throws IOException
  {
    switch (type)
    {
    case Creation.TYPE:
      return new Creation(in, provider);

    case Call.TYPE:
      return new Call(in, provider);

    case Change.TYPE:
      return new Change(in, provider);

    case Removal.TYPE:
      return new Removal(in);

    default:
      throw new RuntimeException();
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Creation extends ElementEvent
  {
    public static final byte TYPE = 1;

    private Element element;

    public Creation(Element element)
    {
      this.element = element;
    }

    public Creation(ExtendedDataInputStream in, ElementProvider provider) throws IOException
    {
      element = new Element(in, provider);
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      element.write(out);
    }

    @Override
    public int getType()
    {
      return TYPE;
    }

    public Element getElement()
    {
      return element;
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Call extends ElementEvent
  {
    public static final byte TYPE = 2;

    private Element source;

    private Element target;

    private When when;

    public Call(Element source, Element target, When when)
    {
      this.source = source;
      this.target = target;
      this.when = when;
    }

    public Call(ExtendedDataInputStream in, ElementProvider provider) throws IOException
    {
      int sourceID = in.readInt();
      source = provider.getElement(sourceID);

      int targetID = in.readInt();
      target = provider.getElement(targetID);

      when = in.readBoolean() ? When.BEFORE : When.AFTER;
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      out.writeInt(source.getID());
      out.writeInt(target.getID());
      out.writeBoolean(when == When.BEFORE);
    }

    @Override
    public int getType()
    {
      return TYPE;
    }

    public Element getSource()
    {
      return source;
    }

    public Element getTarget()
    {
      return target;
    }

    public When getWhen()
    {
      return when;
    }

    /**
     * @author Eike Stepper
     */
    public static enum When
    {
      BEFORE, AFTER
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Change extends ElementEvent
  {
    public static final byte TYPE = 3;

    public Change()
    {
    }

    public Change(ExtendedDataInputStream in, ElementProvider provider) throws IOException
    {
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
    }

    @Override
    public int getType()
    {
      return TYPE;
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class Removal extends ElementEvent
  {
    public static final byte TYPE = 4;

    private int id;

    public Removal(int id)
    {
      this.id = id;
    }

    public Removal(ExtendedDataInputStream in) throws IOException
    {
      id = in.readInt();
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      out.writeInt(id);
    }

    @Override
    public int getType()
    {
      return TYPE;
    }

    public int getID()
    {
      return id;
    }
  }
}
