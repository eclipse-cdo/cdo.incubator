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
import java.util.ArrayList;
import java.util.List;

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
      return new Change(in);

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

    private List<ChangeInfo> changeInfos;

    public Change()
    {
    }

    public Change(ExtendedDataInputStream in) throws IOException
    {
      int size = in.readInt();
      changeInfos = new ArrayList<ChangeInfo>(size);
      for (int i = 0; i < size; i++)
      {
        if (in.readBoolean())
        {
          changeInfos.add(new ChangeInfo.Attribute(in));
        }
        else
        {
          changeInfos.add(new ChangeInfo.Reference(in));
        }
      }
    }

    @Override
    public void write(ExtendedDataOutputStream out) throws IOException
    {
      out.writeInt(changeInfos.size());
      for (ChangeInfo changeInfo : changeInfos)
      {
        out.writeBoolean(changeInfo instanceof ChangeInfo.Attribute);
        changeInfo.write(out);
      }
    }

    @Override
    public int getType()
    {
      return TYPE;
    }

    public List<ChangeInfo> getChangeInfos()
    {
      return changeInfos;
    }

    public boolean isEmpty()
    {
      return changeInfos == null;
    }

    public void attributeChanged(String key, String newValue)
    {
      List<ChangeInfo> changeInfo = ensureChangeInfos();
      changeInfo.add(new ChangeInfo.Attribute(key, newValue));
    }

    public void attributeRemoved(String key)
    {
      attributeChanged(key, null);
    }

    public void referenceAdded(int id, boolean containment)
    {
      List<ChangeInfo> changeInfo = ensureChangeInfos();
      changeInfo.add(new ChangeInfo.Reference(ChangeInfo.Reference.Kind.ADDED, id, containment));
    }

    public void referenceRemoved(int id)
    {
      List<ChangeInfo> changeInfo = ensureChangeInfos();
      changeInfo.add(new ChangeInfo.Reference(ChangeInfo.Reference.Kind.REMOVED, id, false));
    }

    public void referenceType(int id, boolean containment)
    {
      List<ChangeInfo> changeInfo = ensureChangeInfos();
      changeInfo.add(new ChangeInfo.Reference(ChangeInfo.Reference.Kind.TYPE, id, containment));
    }

    private List<ChangeInfo> ensureChangeInfos()
    {
      if (changeInfos == null)
      {
        changeInfos = new ArrayList<ChangeInfo>();
      }

      return changeInfos;
    }

    /**
     * @author Eike Stepper
     */
    public static abstract class ChangeInfo
    {
      public abstract void write(ExtendedDataOutputStream out) throws IOException;

      /**
       * @author Eike Stepper
       */
      public static class Attribute extends ChangeInfo
      {
        private String key;

        private String value;

        public Attribute(String key, String value)
        {
          this.key = key;
          this.value = value;
        }

        public Attribute(ExtendedDataInputStream in) throws IOException
        {
          key = in.readString();
          value = in.readString();
        }

        @Override
        public void write(ExtendedDataOutputStream out) throws IOException
        {
          out.writeString(key);
          out.writeString(value);
        }

        public String getKey()
        {
          return key;
        }

        public String getValue()
        {
          return value;
        }
      }

      /**
       * @author Eike Stepper
       */
      public static class Reference extends ChangeInfo
      {
        private Kind kind;

        private int id;

        public Reference(Kind kind, int id, boolean containment)
        {
          this.kind = kind;
          this.id = containment ? -id : id;
        }

        public Reference(ExtendedDataInputStream in) throws IOException
        {
          kind = Kind.values()[in.readByte()];
          id = in.readInt();
        }

        @Override
        public void write(ExtendedDataOutputStream out) throws IOException
        {
          out.writeByte(kind.ordinal());
          out.writeInt(id);
        }

        public Kind getKind()
        {
          return kind;
        }

        public int getID()
        {
          return Math.abs(id);
        }

        public boolean isContainment()
        {
          return id < 0;
        }

        /**
         * @author Eike Stepper
         */
        public static enum Kind
        {
          ADDED, REMOVED, TYPE
        }
      }
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
