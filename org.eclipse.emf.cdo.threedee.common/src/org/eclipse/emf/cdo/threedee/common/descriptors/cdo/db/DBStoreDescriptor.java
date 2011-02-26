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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdo.db;

import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementEvent.Change;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo.StoreDescriptor;

import org.eclipse.net4j.util.collection.Pair;

/**
 * @author Eike Stepper
 */
public class DBStoreDescriptor extends StoreDescriptor
{
  @Override
  public Class<?> getType()
  {
    return IDBStore.class;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    super.initElement(object, element);

    IDBStore store = (IDBStore)object;
    element.addReference(true, store.getDBAdapter());
    element.addReference(true, store.getDBSchema());
    element.addReference(true, store.getIDHandler());
    element.addReference(true, store.getMappingStrategy());
    element.addReference(true, store.getMetaDataManager());
  }

  @Override
  public Pair<Change, Element> createChangeEvent(Element oldElement, Object newObject)
  {
    return null;
  }
}
