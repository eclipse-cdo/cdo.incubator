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
package org.eclipse.net4j.pop.model;

import org.eclipse.net4j.pop.Pop;

import org.eclipse.emf.common.util.URI;

/**
 * @author Eike Stepper
 */
public class Client
{
  public static void main(String[] args) throws Exception
  {
    URI uri = URI.createPlatformResourceURI("/cdo.pop/project.xml", false);
    DefaultModelHandler<Pop> handler = new DefaultModelHandler<Pop>()
    {
      public void modelChanged(Pop model, Kind kind)
      {
        System.out.println(kind.toString() + ": " + model);
      }
    };

    IModelManager modelManager = new ModelManager();
    IModelRegistration<Pop> registration = modelManager.register(uri, handler);

    Thread.sleep(10000L);
    registration.cancel();
  }
}
