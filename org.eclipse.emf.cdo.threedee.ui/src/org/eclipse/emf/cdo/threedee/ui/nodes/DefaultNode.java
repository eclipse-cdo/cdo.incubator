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
package org.eclipse.emf.cdo.threedee.ui.nodes;

import org.eclipse.emf.cdo.threedee.common.Element;
import org.eclipse.emf.cdo.threedee.ui.util.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.Node;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class DefaultNode extends Sphere
{
  public DefaultNode()
  {
    super(.1f, ThreeDeeWorldUtil.getDefaultAppearance(Color.orange));
  }

  public DefaultNode(Appearance appearance)
  {
    super(.1f, appearance);
  }

  /**
   * @author Martin Fluegge
   */
  public static class Factory implements INodeFactory
  {
    public static final String ID = "DEFAULT";

    private Map<String, Color> colors = init();

    public Node createNode(Element element)
    {
      Color color = colors.get(element.getDescriptor().getName());

      if (color == null)
      {
        color = Color.orange;
      }

      return new DefaultNode(ThreeDeeWorldUtil.getDefaultAppearance(color));
    }

    private Map<String, Color> init()
    {
      Map<String, Color> ret = new HashMap<String, Color>();

      ret.put("Branch", Color.pink);
      ret.put("BranchManager", Color.blue);
      ret.put("ClassMapping", Color.cyan);
      ret.put("Collection", Color.darkGray);
      ret.put("DBAdapter", Color.gray);
      ret.put("DBField", Color.green);
      ret.put("DBIndex", Color.lightGray);
      ret.put("DBSchema", Color.magenta);
      ret.put("DBStore", Color.red);
      ret.put("DBTable", Color.white);
      ret.put("EAnnotation", Color.yellow);
      ret.put("EAttribute", new Color(20, 93, 20));
      ret.put("EClass", new Color(200, 50, 50));
      ret.put("EDataType", new Color(100, 98, 77));
      ret.put("EOperation", new Color(200, 20, 200));
      ret.put("EPackage", new Color(0, 100, 100));
      ret.put("EPackageRegistry", new Color(0, 200, 200));
      ret.put("EParameter", new Color(100, 0, 100));
      ret.put("EReference", new Color(200, 0, 200));
      ret.put("IDHandler", new Color(100, 100, 0));
      ret.put("ManagedContainer", new Color(200, 200, 0));
      ret.put("MapEntry", new Color(255, 100, 100));
      ret.put("MappingStrategy", new Color(255, 200, 200));
      ret.put("MetaDataManager", new Color(100, 255, 100));
      ret.put("PackageInfo", new Color(200, 255, 200));
      ret.put("PackageRegistry", new Color(100, 100, 225));
      ret.put("PackageUnit", new Color(200, 200, 255));
      ret.put("Repository", new Color(100, 255, 255));
      ret.put("RevisionCache", new Color(200, 255, 255));
      ret.put("RevisionManager", new Color(255, 255, 100));
      ret.put("SessionManager", new Color(255, 255, 200));
      ret.put("TCPSelector", new Color(255, 100, 255));
      ret.put("TypeMapping", new Color(255, 200, 255));

      return ret;
    }
  }
}
