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
package @impl.package@;

import @api.package@.I@api.type@Manager;
import org.eclipse.net4j.util.lifecycle.Lifecycle;
import java.util.List;
import java.util.ArrayList;

/**
 * \@author @author.name@
 */
public class @api.type@Manager extends Lifecycle implements I@api.type@Manager
{
  public static final @api.type@Manager INSTANCE = new @api.type@Manager();

  private List<@api.type@> elements = new ArrayList<@api.type@>();
  
  private @api.type@Manager()
  {
  }
  
  public @api.type@[] get@api.type@s()
  {
    synchronized (elements)
    {
  	  return elements.toArray(new @api.type@[elements.size()]);
    }
  }
}
