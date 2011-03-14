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
package org.eclipse.emf.cdo.threedee.shell;

import org.eclipse.emf.cdo.examples.company.CompanyPackage;
import org.eclipse.emf.cdo.threedee.shell.bundle.OM;

import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.WrappedException;

import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.IOConsole;

import bsh.Interpreter;

import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

/**
 * @author Eike Stepper
 */
public class CDOConsole extends IOConsole
{
  public final static String TYPE = "cdoConsole"; //$NON-NLS-1$

  private Interpreter interpreter;

  private Thread thread;

  @SuppressWarnings("restriction")
  public CDOConsole(final CDOConsoleFactory factory)
  {
    super("CDO Console", TYPE, null, true);

    Reader in = new CommandLineReader(new InputStreamReader(getInputStream()));
    PrintStream out = new PrintStream(newOutputStream());

    interpreter = new Interpreter(in, out, out, true);
    interpreter.setClassLoader(OM.class.getClassLoader());

    registerClass("org.eclipse.emf.cdo.threedee.shell.cdo");
    registerEMFPackages();
    registerNet4jPackages();
    registerCDOPackages();

    thread = new Thread()
    {
      @Override
      public void run()
      {
        interpreter.run();
      }
    };

    thread.start();
  }

  // @Override
  // public IPageBookViewPage createPage(IConsoleView view)
  // {
  // IOConsolePage page = (IOConsolePage)super.createPage(view);
  //
  // SourceViewerConfiguration configuration = new SourceViewerConfiguration()
  // {
  // @Override
  // public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType)
  // {
  // return new CDOHover(sourceViewer);
  // }
  // };
  //
  // TextConsoleViewer viewer = page.getViewer();
  // viewer.configure(configuration);
  //
  // return page;
  // }

  private void registerEMFPackages()
  {
    registerPackage("org.eclipse.emf.ecore");
    registerPackage("org.eclipse.emf.ecore.impl");
    registerPackage("org.eclipse.emf.ecore.plugin");
    registerPackage("org.eclipse.emf.ecore.resource");
    registerPackage("org.eclipse.emf.ecore.resource.impl");
    registerPackage("org.eclipse.emf.ecore.util");
    registerPackage("org.eclipse.emf.ecore.xml.namespace");
    registerPackage("org.eclipse.emf.ecore.xml.namespace.impl");
    registerPackage("org.eclipse.emf.ecore.xml.namespace.util");
    registerPackage("org.eclipse.emf.ecore.xml.type");
    registerPackage("org.eclipse.emf.ecore.xml.type.impl");
    registerPackage("org.eclipse.emf.ecore.xml.type.internal");
    registerPackage("org.eclipse.emf.ecore.xml.type.util");
    registerPackage("org.eclipse.emf.ecore.change");
    registerPackage("org.eclipse.emf.ecore.change.impl");
    registerPackage("org.eclipse.emf.ecore.change.util");
    registerPackage("org.eclipse.emf.ecore.xmi");
    registerPackage("org.eclipse.emf.ecore.xmi.impl");
    registerPackage("org.eclipse.emf.ecore.xmi.util");
  }

  private void registerNet4jPackages()
  {
    registerPackage("org.eclipse.net4j.util");
    registerPackage("org.eclipse.net4j.util.cache");
    registerPackage("org.eclipse.net4j.util.collection");
    registerPackage("org.eclipse.net4j.util.concurrent");
    registerPackage("org.eclipse.net4j.util.container");
    registerPackage("org.eclipse.net4j.util.container.delegate");
    registerPackage("org.eclipse.net4j.util.event");
    registerPackage("org.eclipse.net4j.util.factory");
    registerPackage("org.eclipse.net4j.util.fsm");
    registerPackage("org.eclipse.net4j.util.io");
    registerPackage("org.eclipse.net4j.util.lifecycle");
    registerPackage("org.eclipse.net4j.util.om");
    registerPackage("org.eclipse.net4j.util.om.log");
    registerPackage("org.eclipse.net4j.util.om.monitor");
    registerPackage("org.eclipse.net4j.util.om.pref");
    registerPackage("org.eclipse.net4j.util.om.trace");
    registerPackage("org.eclipse.net4j.util.options");
    registerPackage("org.eclipse.net4j.util.ref");
    registerPackage("org.eclipse.net4j.util.registry");
    registerPackage("org.eclipse.net4j.util.security");
    registerPackage("org.eclipse.net4j.util.transaction");
    registerPackage("org.eclipse.net4j");
    registerPackage("org.eclipse.net4j.acceptor");
    registerPackage("org.eclipse.net4j.buffer");
    registerPackage("org.eclipse.net4j.channel");
    registerPackage("org.eclipse.net4j.connector");
    registerPackage("org.eclipse.net4j.protocol");
    registerPackage("org.eclipse.net4j.signal");
    registerPackage("org.eclipse.net4j.signal.heartbeat");
    registerPackage("org.eclipse.net4j.signal.wrapping");
    registerPackage("org.eclipse.spi.net4j");
    registerPackage("org.eclipse.net4j.tcp");
    registerPackage("org.eclipse.net4j.jvm");
  }

  private void registerCDOPackages()
  {
    registerPackage("org.eclipse.emf.cdo");
    registerPackage("org.eclipse.emf.cdo.eresource");
    registerPackage("org.eclipse.emf.cdo.eresource.impl");
    registerPackage("org.eclipse.emf.cdo.eresource.util");
    registerPackage("org.eclipse.emf.cdo.eresource.validation");
    registerPackage("org.eclipse.emf.cdo.etypes");
    registerPackage("org.eclipse.emf.cdo.etypes.impl");
    registerPackage("org.eclipse.emf.cdo.etypes.util");
    registerPackage("org.eclipse.emf.cdo.session");
    registerPackage("org.eclipse.emf.cdo.session.remote");
    registerPackage("org.eclipse.emf.cdo.transaction");
    registerPackage("org.eclipse.emf.cdo.util");
    registerPackage("org.eclipse.emf.cdo.view");
    registerPackage("org.eclipse.emf.spi.cdo");
    registerPackage("org.eclipse.emf.cdo.common");
    registerPackage("org.eclipse.emf.cdo.common.branch");
    registerPackage("org.eclipse.emf.cdo.common.commit");
    registerPackage("org.eclipse.emf.cdo.common.id");
    registerPackage("org.eclipse.emf.cdo.common.lob");
    registerPackage("org.eclipse.emf.cdo.common.model");
    registerPackage("org.eclipse.emf.cdo.common.protocol");
    registerPackage("org.eclipse.emf.cdo.common.revision");
    registerPackage("org.eclipse.emf.cdo.common.revision.delta");
    registerPackage("org.eclipse.emf.cdo.common.util");
    registerPackage("org.eclipse.emf.cdo.spi.common");
    registerPackage("org.eclipse.emf.cdo.spi.common.branch");
    registerPackage("org.eclipse.emf.cdo.spi.common.commit");
    registerPackage("org.eclipse.emf.cdo.spi.common.id");
    registerPackage("org.eclipse.emf.cdo.spi.common.model");
    registerPackage("org.eclipse.emf.cdo.spi.common.revision");
    registerPackage("org.eclipse.emf.cdo.net4j");

    CompanyPackage.eINSTANCE.getClass();
    registerPackage("org.eclipse.emf.cdo.examples.company");
    registerPackage("org.eclipse.emf.cdo.examples.company.impl");
    registerPackage("org.eclipse.emf.cdo.examples.company.util");
    registerPackage("org.eclipse.emf.cdo.examples.company.validation");
  }

  private void registerPackage(String pack)
  {
    registerClass(pack + ".*");
  }

  private void registerClass(String c)
  {
    try
    {
      interpreter.eval("import " + c + ";");
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class CDOHover extends DefaultTextHover implements ITextHoverExtension
  {
    private CDOHover(ISourceViewer sourceViewer)
    {
      super(sourceViewer);
    }

    @Override
    protected boolean isIncluded(Annotation annotation)
    {
      return false;
    }

    @Override
    public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion)
    {
      String hoverInfo = super.getHoverInfo(textViewer, hoverRegion);
      if (!StringUtil.isEmpty(hoverInfo))
      {
        return hoverInfo;
      }

      try
      {
        IDocument document = textViewer.getDocument();
        String identifier = document.get(hoverRegion.getOffset(), hoverRegion.getLength());
        if (!StringUtil.isEmpty(identifier))
        {
          Object object = interpreter.get(identifier);
          if (object != null && !object.getClass().getName().startsWith("bsh"))
          {
            return object.toString();
          }
        }
      }
      catch (Exception e)
      {
      }

      return null;
    }

    public IInformationControlCreator getHoverControlCreator()
    {
      return new IInformationControlCreator()
      {
        public IInformationControl createInformationControl(Shell parent)
        {
          return new DefaultInformationControl(parent);
        }
      };
    }
  }
}
