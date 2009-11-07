/**
 * Copyright (c) 2004 - 2009 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial API and implementation
 */
package org.eclipse.emf.cdo.server.internal.file;

import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.IStoreFactory;

import org.w3c.dom.Element;

/**
 * @author Stefan Winkler
 */
public class FileStoreFactory implements IStoreFactory
{

  public FileStoreFactory()
  {
  }

  public IStore createStore(Element storeConfig)
  {
    return new FileStore();
  }

  public String getStoreType()
  {
    return FileStore.TYPE;
  }

}
