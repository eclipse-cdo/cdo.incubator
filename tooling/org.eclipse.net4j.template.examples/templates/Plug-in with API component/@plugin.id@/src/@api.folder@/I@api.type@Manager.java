/***************************************************************************
 * Copyright (c) 2004 - 2008 @author.name@, @author.country@.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    @author.name@ - initial API and implementation
 **************************************************************************/
package @api.package@;

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.core.runtime.IAdaptable;

/**
 * \@author @author.name@
 */
public interface I@api.type@Manager extends IContainer<I@api.type@>, IAdaptable
{
  I@api.type@Manager INSTANCE = @impl.package@.@api.type@Manager.INSTANCE;
  
  public I@api.type@ get@api.type@(String id);
  
  public I@api.type@[] get@api.type@s();
}
