/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.ui.shapes;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.EPackageRegistryShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.RepositoryShapeFactory;
import org.eclipse.emf.cdo.threedee.ui.shapes.factories.impl.TCPConnectorShapeFactory;

import javax.media.j3d.Node;

import java.util.HashMap;

/**
 * @author Martin Fluegge
 */
public interface IShapeFactory
{
  public Node createShape(Element element);

  /**
   * @author Eike Stepper
   */
  public static class Registry extends HashMap<String, IShapeFactory>
  {
    public static final Registry INSTANCE = new Registry();

    private static final long serialVersionUID = 1L;

    static
    {
      INSTANCE.put("Repository", new RepositoryShapeFactory());
      INSTANCE.put("TCPConnector", new TCPConnectorShapeFactory());
      INSTANCE.put("EPackageRegistry", new EPackageRegistryShapeFactory());
    }
  }
}
