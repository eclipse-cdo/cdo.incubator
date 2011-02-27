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

import org.eclipse.emf.cdo.threedee.common.ElementDescriptor.Registry;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdo._INIT_CDO_;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf._INIT_EMF_;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j._INIT_NET4J_;

/**
 * @author Eike Stepper
 */
public class _INIT_
{
  public static void init(Registry registry)
  {
    _INIT_NET4J_.init(registry);
    _INIT_EMF_.init(registry);
    _INIT_CDO_.init(registry);

    registry.register(new ManagedContainerDescriptor());
    registry.register(new MapEntryDescriptor());
    registry.register(new CollectionDescriptor());
  }
}
