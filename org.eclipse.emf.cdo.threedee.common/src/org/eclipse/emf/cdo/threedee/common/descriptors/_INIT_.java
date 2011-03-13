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
import org.eclipse.emf.cdo.threedee.common.descriptors.cdoclient._INIT_CDO_CLIENT_;
import org.eclipse.emf.cdo.threedee.common.descriptors.cdoserver._INIT_CDO_SERVER_;
import org.eclipse.emf.cdo.threedee.common.descriptors.emf._INIT_EMF_;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4j._INIT_NET4J_;
import org.eclipse.emf.cdo.threedee.common.descriptors.net4jdb._INIT_NET4J_DB_;

import java.awt.Color;

/**
 * @author Eike Stepper
 */
public class _INIT_
{
  public static void init(Registry registry)
  {
    _INIT_EMF_.init(registry);
    _INIT_CDO_.init(registry);
    _INIT_CDO_CLIENT_.init(registry);
    _INIT_CDO_SERVER_.init(registry);
    _INIT_NET4J_.init(registry);
    _INIT_NET4J_DB_.init(registry);

    Color color = Color.white;
    registry.register(new ManagedContainerDescriptor(), color, 0.8f);
    registry.register(new MapEntryDescriptor(), color, 0.7f);
    registry.register(new CollectionDescriptor(), color, 0.7f);
  }
}
