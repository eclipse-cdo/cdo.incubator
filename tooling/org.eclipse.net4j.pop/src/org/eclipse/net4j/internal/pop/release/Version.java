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
package org.eclipse.net4j.internal.pop.release;

import org.eclipse.net4j.pop.release.IVersion;

import org.eclipse.core.runtime.PlatformObject;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public class Version extends PlatformObject implements IVersion
{
  private int major;

  private int minor;

  private int micro;

  public Version(int major, int minor, int micro)
  {
    this.major = major;
    this.minor = minor;
    this.micro = micro;
  }

  public Version(int major, int minor)
  {
    this(major, minor, 0);
  }

  public Version(int major)
  {
    this(major, 0);
  }

  public Version()
  {
    this(0);
  }

  public int getMajor()
  {
    return major;
  }

  public int getMinor()
  {
    return minor;
  }

  public int getMicro()
  {
    return micro;
  }

  public IVersion nextMajor(int increment)
  {
    return new Version(major + increment, 0, 0);
  }

  public IVersion nextMinor(int increment)
  {
    return new Version(major, minor + increment, 0);
  }

  public IVersion nextMicro()
  {
    return new Version(major, minor, micro + 1);
  }

  public int compareTo(IVersion o)
  {
    // TODO Implement Version.compareTo(o)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("{0}.{1}.{2}", major, minor, micro);
  }
}
