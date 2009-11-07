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

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;

import org.eclipse.net4j.util.collection.CloseableIterator;

/**
 * @author Stefan Winkler
 */
public class FileStoreObjectIdIterator implements CloseableIterator<CDOID>
{
  private String[] revisions;

  private int position = 0;

  public FileStoreObjectIdIterator(String[] revisionList)
  {
    revisions = revisionList;
  }

  public void remove()
  {
    throw new UnsupportedOperationException("No remove of CDOIDS!");
  }

  public boolean hasNext()
  {
    return position < revisions.length;
  }

  public CDOID next()
  {
    String revStr = revisions[position++];
    return CDOIDUtil.createLong(Long.parseLong(revStr));
  }

  public void close()
  {
    revisions = null;
  }

  public boolean isClosed()
  {
    return revisions != null;
  }

}
