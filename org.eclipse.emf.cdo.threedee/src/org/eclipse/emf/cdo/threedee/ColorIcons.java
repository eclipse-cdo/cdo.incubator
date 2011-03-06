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
package org.eclipse.emf.cdo.threedee;

import org.eclipse.emf.cdo.threedee.bundle.OM;

import org.eclipse.net4j.util.ui.UIUtil;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public final class ColorIcons
{
  private static final ImageDescriptor DESCRIPTOR = OM.Activator.INSTANCE.loadImageDescriptor("icons/element.gif");

  private static final Display DISPLAY = UIUtil.getDisplay();

  private static ImageData imageData;

  private static RGB[] palette;

  private static int paletteIndex;

  private static Map<Color, Image> icons = new HashMap<Color, Image>();

  private ColorIcons()
  {
  }

  public static synchronized void dispose()
  {
    for (Image icon : icons.values())
    {
      icon.dispose();
    }

    icons.clear();
  }

  public static synchronized Image get(Color color)
  {
    Image icon = icons.get(color);
    if (icon == null)
    {
      icon = create(color);
      icons.put(color, icon);
    }

    return icon;
  }

  private static Image create(Color color)
  {
    if (imageData == null)
    {
      Image image = DESCRIPTOR.createImage(DISPLAY);
      imageData = image.getImageData();
      image.dispose();

      palette = imageData.palette.getRGBs();
      for (paletteIndex = 0; paletteIndex < palette.length; paletteIndex++)
      {
        RGB rgb = palette[paletteIndex];
        if (rgb.red == 255 && rgb.green == 255 && rgb.blue == 255)
        {
          break;
        }
      }
    }

    palette[paletteIndex] = new RGB(color.getRed(), color.getGreen(), color.getBlue());
    return new Image(DISPLAY, imageData);
  }
}
