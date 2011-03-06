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
package org.eclipse.emf.cdo.threedee.shell;

import org.eclipse.emf.cdo.net4j.CDONet4jUtil;

import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;

import bsh.Interpreter;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Eike Stepper
 */
public class Shell
{
  public static void main(String[] args) throws Exception
  {
    init();

    Reader in = new CommandLineReader(new InputStreamReader(System.in));
    Interpreter interpreter = new Interpreter(in, System.out, System.err, true);
    interpreter.eval("import *;");
    interpreter.run();
  }

  private static void init()
  {
    IPluginContainer container = IPluginContainer.INSTANCE;
    Net4jUtil.prepareContainer(container);
    TCPUtil.prepareContainer(container);
    CDONet4jUtil.prepareContainer(container);
  }
}
