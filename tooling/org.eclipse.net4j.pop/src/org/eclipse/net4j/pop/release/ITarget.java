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
package org.eclipse.net4j.pop.release;

import org.eclipse.net4j.pop.IBaseline;
import org.eclipse.net4j.pop.IStream;
import org.eclipse.net4j.pop.code.ITag;

/**
 * @author Eike Stepper
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITarget extends IBaseline
{
  public IStream getStream();

  public ITag getTag();
}
