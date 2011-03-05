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
import org.eclipse.emf.cdo.threedee.ui.ThreeDeeWorldUtil;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.TransformGroup;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class DefaultShape extends Sphere
{
  private static Map<String, Color> COLORS = new HashMap<String, Color>();

  public DefaultShape(Element element)
  {
    super(.1f, defaultAppearance(element));
    setDefaultCapabilities();
  }

  public DefaultShape(Appearance appearance)
  {
    super(.1f, appearance);

    setDefaultCapabilities();
  }

  private void setDefaultCapabilities()
  {
    setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);
    // setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);

    Appearance appearance = getAppearance();
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_WRITE);
    appearance.setCapability(Appearance.ALLOW_RENDERING_ATTRIBUTES_READ);
    RenderingAttributes renderingAttributes = appearance.getRenderingAttributes();
    if (renderingAttributes == null)
    {
      renderingAttributes = new RenderingAttributes();
      renderingAttributes.setCapability(RenderingAttributes.ALLOW_VISIBLE_WRITE);
      appearance.setRenderingAttributes(renderingAttributes);
    }
  }

  private static Appearance defaultAppearance(Element element)
  {
    String name = element.getDescriptor().getName();
    int rgb = name.hashCode() & 0xffffff;

    Color color = new Color(rgb);// COLORS.get(name);
    // if (color == null)
    // {
    // color = Color.orange;
    // }

    return ThreeDeeWorldUtil.getDefaultAppearance(color);
  }

  static
  {
    COLORS.put("Branch", Color.pink);
    COLORS.put("BranchManager", Color.blue);
    COLORS.put("ClassMapping", Color.cyan);
    COLORS.put("Collection", Color.darkGray);
    COLORS.put("DBAdapter", Color.gray);
    COLORS.put("DBField", Color.green);
    COLORS.put("DBIndex", Color.lightGray);
    COLORS.put("DBSchema", Color.magenta);
    COLORS.put("DBStore", Color.red);
    COLORS.put("DBTable", Color.white);
    COLORS.put("EAnnotation", Color.yellow);
    COLORS.put("EAttribute", new Color(20, 93, 20));
    COLORS.put("EClass", new Color(200, 50, 50));
    COLORS.put("EDataType", new Color(100, 98, 77));
    COLORS.put("EOperation", new Color(200, 20, 200));
    COLORS.put("EPackage", new Color(0, 100, 100));
    COLORS.put("EPackageRegistry", new Color(0, 200, 200));
    COLORS.put("EParameter", new Color(100, 0, 100));
    COLORS.put("EReference", new Color(200, 0, 200));
    COLORS.put("IDHandler", new Color(100, 100, 0));
    COLORS.put("ManagedContainer", new Color(200, 200, 0));
    COLORS.put("MapEntry", new Color(255, 100, 100));
    COLORS.put("MappingStrategy", new Color(255, 200, 200));
    COLORS.put("MetaDataManager", new Color(100, 255, 100));
    COLORS.put("PackageInfo", new Color(200, 255, 200));
    COLORS.put("PackageRegistry", new Color(100, 100, 225));
    COLORS.put("PackageUnit", new Color(200, 200, 255));
    COLORS.put("Repository", new Color(100, 255, 255));
    COLORS.put("RevisionCache", new Color(200, 255, 255));
    COLORS.put("RevisionManager", new Color(255, 255, 100));
    COLORS.put("SessionManager", new Color(255, 255, 200));
    COLORS.put("TCPSelector", new Color(255, 100, 255));
    COLORS.put("TypeMapping", new Color(255, 200, 255));
  }
}
