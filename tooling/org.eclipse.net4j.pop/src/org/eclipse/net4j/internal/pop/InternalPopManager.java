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
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IPopManager;
import org.eclipse.net4j.pop.IStream;

/**
 * @author Eike Stepper
 */
public interface InternalPopManager extends IPopManager, IElementResolver
{
  public void putStream(IStream stream);
}
