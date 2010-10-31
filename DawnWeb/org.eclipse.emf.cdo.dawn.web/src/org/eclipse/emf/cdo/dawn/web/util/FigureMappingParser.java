/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.dawn.web.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class FigureMappingParser
{

  public HashMap<String, FigureMapping> parse(URL url)
  {

    HashMap<String, FigureMapping> ret = new HashMap<String, FigureMapping>();

    SAXReader saxReader = new SAXReader();
    try
    {
      Document document = saxReader.read(url);
      @SuppressWarnings("unchecked")
      List<Element> selectNodes = document.selectNodes("//figureMapping"); // XPATH

      for (Element figureMappingElement : selectNodes)
      {
        FigureMapping figureMapping = new FigureMapping();

        Attribute attribute = figureMappingElement.attribute("type");
        String type = attribute.getValue();
        Element javaScriptClassElement = figureMappingElement.element("javaScriptClass");
        String javaScriptClassName = javaScriptClassElement.attributeValue("name");

        figureMapping.setJavaScriptClass(javaScriptClassName);
        @SuppressWarnings("unchecked")
        List<Element> viewAttributeElements = figureMappingElement.selectNodes("viewAttribute");

        for (Element viewAttributeElement : viewAttributeElements)
        {
          ViewAttribute v = null;
          if (viewAttributeElement.getName().equals("viewAttribute"))
          {
            v = new ViewAttribute();

          }
          // else if (viewAttributeElement.getName().equals("viewLiteral"))
          // {
          // v = new ViewLiteral();
          //
          // }
          if (v != null)
          {
            v.setName(viewAttributeElement.attributeValue("name"));
            figureMapping.addAttribute(v);
          }
        }

        @SuppressWarnings("unchecked")
        List<Element> viewPatternElements = figureMappingElement.selectNodes("viewPattern");
        for (Element viewPattern : viewPatternElements)
        {
          figureMapping.setViewPattern(viewPattern.attributeValue("name"));
        }
        ret.put(type, figureMapping);
      }
    }
    catch (DocumentException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return ret;
  }
}
