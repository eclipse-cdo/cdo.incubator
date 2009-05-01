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
package org.eclipse.net4j.provisioner;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import org.osgi.framework.Bundle;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Eike Stepper
 */
public interface IEnvelope
{
  public static final IPath PROVISIONER_PROPERTIES_PATH = new Path("META-INF/org.eclipse.net4j.provisioner.properties");

  public static final String PROVISIONER_TYPE_PROPERTY = "provisionerType";

  public static final String PROVISIONER_DESCRIPTION_PROPERTY = "provisionerDescription";

  public Bundle getBundle();

  public long getBundleId();

  public int getBundleState();

  public String getBundleLocation();

  public File getBundleFile() throws IOException;

  public Properties getProvisionerProperties();

  public String getProvisionerType();

  public String getProvisionerDescription();

  public IProvisioner getProvisioner();

  public void provision() throws ProvisionerException;
}
