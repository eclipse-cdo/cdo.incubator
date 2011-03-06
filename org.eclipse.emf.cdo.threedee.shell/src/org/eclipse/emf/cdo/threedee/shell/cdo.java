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
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;

import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * @author Eike Stepper
 */
public class cdo
{
  public static final String HOST = "localhost";

  public static final String REPO_NAME = "repo1";

  public static CDOSession open()
  {
    return open(REPO_NAME);
  }

  public static CDOSession open(String repoName)
  {
    return open(HOST, repoName);
  }

  public static CDOSession open(String host, String repoName)
  {
    IPluginContainer container = IPluginContainer.INSTANCE;
    ITCPConnector connector = TCPUtil.getConnector(container, host);

    CDOSessionConfiguration config = CDONet4jUtil.createSessionConfiguration();
    config.setConnector(connector);
    config.setRepositoryName(repoName);

    CDOSession session = config.openSession();
    session.getPackageRegistry().putEPackage(CompanyPackage.eINSTANCE);

    container.putElement("org.eclipse.emf.cdo.sessions", "threedee", null, session);
    return session;
  }
}
