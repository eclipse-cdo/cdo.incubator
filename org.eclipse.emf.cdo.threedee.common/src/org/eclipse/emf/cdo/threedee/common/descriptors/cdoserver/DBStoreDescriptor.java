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
package org.eclipse.emf.cdo.threedee.common.descriptors.cdoserver;

import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.threedee.common.Element;

/**
 * @author Eike Stepper
 */
public class DBStoreDescriptor extends StoreDescriptor
{
  @Override
  public Class<?> getElementType()
  {
    return IDBStore.class;
  }

  @Override
  @SuppressWarnings("restriction")
  protected void doInitElement(Object object, Element element)
  {
    super.doInitElement(object, element);

    IDBStore store = (IDBStore)object;
    IMappingStrategy mappingStrategy = store.getMappingStrategy();
    if (mappingStrategy instanceof org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalMappingStrategy)
    {
      mappingStrategy = ((org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalMappingStrategy)mappingStrategy)
          .getDelegate();
    }

    element.addReference(true, store.getDBAdapter());
    element.addReference(true, store.getDBSchema());
    element.addReference(true, store.getIDHandler());
    element.addReference(true, mappingStrategy);
    element.addReference(true, store.getMetaDataManager());
  }

  @Override
  public boolean isHomogenous()
  {
    return false;
  }
}
