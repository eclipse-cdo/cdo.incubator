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
package org.eclipse.emf.cdo.threedee.shell.bundle;

import org.eclipse.net4j.util.om.OSGiApplication;

import bsh.Interpreter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Eike Stepper
 */
public class ShellApplication extends OSGiApplication
{
  private static final String ID = "org.eclipse.emf.cdo.threedee.shell.app";

  public ShellApplication()
  {
    super(ID);
  }

  @Override
  protected void doStart() throws Exception
  {
    Reader in = new CommandLineReader(new InputStreamReader(System.in));
    Interpreter interpreter = new Interpreter(in, System.out, System.err, true);
    interpreter.eval("import *;");
    interpreter.run();
  }

  /**
   * This is a quick hack to turn empty lines entered interactively on the command line into ';\n' empty lines for the
   * interpreter. It's just more pleasant to be able to hit return on an empty line and see the prompt reappear. This is
   * *not* used when text is sourced from a file non-interactively.
   */
  private static final class CommandLineReader extends FilterReader
  {
    public CommandLineReader(Reader in)
    {
      super(in);
    }

    static final int normal = 0, lastCharNL = 1, sentSemi = 2;

    int state = lastCharNL;

    @Override
    public int read() throws IOException
    {
      int b;

      if (state == sentSemi)
      {
        state = lastCharNL;
        return '\n';
      }

      // skip CR
      while ((b = in.read()) == '\r')
      {
      }

      if (b == '\n')
      {
        if (state == lastCharNL)
        {
          b = ';';
          state = sentSemi;
        }
        else
        {
          state = lastCharNL;
        }
      }
      else
      {
        state = normal;
      }

      return b;
    }

    /**
     * This is a degenerate implementation. I don't know how to keep this from blocking if we try to read more than one
     * char... There is no available() for Readers ??
     */
    @Override
    public int read(char buff[], int off, int len) throws IOException
    {
      int b = read();
      if (b == -1)
      {
        return -1; // EOF, not zero read apparently
      }

      buff[off] = (char)b;
      return 1;
    }
  }
}
