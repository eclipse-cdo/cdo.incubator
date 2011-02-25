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
package org.eclipse.emf.cdo.threedee.common.descriptors;

import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevisionCache;
import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.common.ElementDescriptor;

import java.util.List;

/**
 * @author Eike Stepper
 */
public class RevisionCacheDescriptor extends ElementDescriptor
{
  @Override
  public boolean matches(Object object)
  {
    return object instanceof InternalCDORevisionCache;
  }

  @Override
  public void initElement(Object object, Element element)
  {
    InternalCDORevisionCache revisionCache = (InternalCDORevisionCache)object;
    for (List<CDORevision> list : revisionCache.getAllRevisions().values())
    {
      element.addReferences(true, list);
    }
  }
}
