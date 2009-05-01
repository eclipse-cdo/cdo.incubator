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
package org.eclipse.net4j.internal.provisioner;

import org.eclipse.net4j.provisioner.IEnvelope;
import org.eclipse.net4j.provisioner.IProvisioner;
import org.eclipse.net4j.provisioner.ProvisionerException;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.io.IOUtil;

import org.eclipse.core.runtime.FileLocator;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.text.MessageFormat;
import java.util.Properties;

public class Envelope implements IEnvelope
{
  private Bundle bundle;

  private SoftReference<Properties> properties;

  private IProvisioner provisioner;

  public Envelope(Bundle bundle) throws NoEnvelopeException
  {
    this.bundle = bundle;
    Properties props = loadProvisionerProperties();
    if (props == null)
    {
      throw new NoEnvelopeException();
    }
  }

  public Bundle getBundle()
  {
    return bundle;
  }

  public long getBundleId()
  {
    return bundle.getBundleId();
  }

  public int getBundleState()
  {
    return bundle.getState();
  }

  public String getBundleLocation()
  {
    return bundle.getLocation();
  }

  public File getBundleFile() throws IOException
  {
    return FileLocator.getBundleFile(bundle);
  }

  public synchronized Properties getProvisionerProperties()
  {
    Properties props = null;
    if (properties != null)
    {
      props = properties.get();
    }

    if (props != null)
    {
      props = loadProvisionerProperties();
    }

    return props;
  }

  public String getProvisionerType()
  {
    Properties properties = getProvisionerProperties();
    if (properties == null)
    {
      return null;
    }

    return properties.getProperty(PROVISIONER_TYPE_PROPERTY);
  }

  public String getProvisionerDescription()
  {
    Properties properties = getProvisionerProperties();
    if (properties == null)
    {
      return null;
    }

    return properties.getProperty(PROVISIONER_DESCRIPTION_PROPERTY);
  }

  public synchronized IProvisioner getProvisioner()
  {
    if (provisioner == null)
    {
      String productGroup = IProvisioner.PRODUCT_GROUP;
      String type = getProvisionerType();
      if (type == null)
      {
        return null;
      }

      String description = getProvisionerDescription();
      provisioner = (IProvisioner)getContainer().getElement(productGroup, type, description);
    }

    return provisioner;
  }

  public void provision() throws ProvisionerException
  {
    IProvisioner provisioner = getProvisioner();
    if (provisioner == null)
    {
      throw new IllegalStateException("No provisioner available for " + this);
    }

    BundleContext bundleContext = getBundleContext();
    provisioner.provision(this, bundleContext);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Envelope[{0}, {1}, {2}]", getBundleId(), formatBundleState(getBundleState()),
        getBundleLocation());
  }

  protected IManagedContainer getContainer()
  {
    return EnvelopeManager.INSTANCE.getContainer();
  }

  protected BundleContext getBundleContext()
  {
    return EnvelopeManager.INSTANCE.getBundleContext();
  }

  protected Properties loadProvisionerProperties()
  {
    // System.out.println("Checking " + this);
    InputStream stream = null;

    try
    {
      stream = FileLocator.openStream(bundle, PROVISIONER_PROPERTIES_PATH, false);
      Properties props = new Properties();
      props.load(stream);

      properties = new SoftReference<Properties>(props);
      return props;
    }
    catch (IOException ex)
    {
      return null;
    }
    finally
    {
      IOUtil.close(stream);
    }
  }

  public static String formatBundleState(int state)
  {
    switch (state)
    {
    case Bundle.INSTALLED:
      return "INSTALLED";

    case Bundle.RESOLVED:
      return "RESOLVED";

    case Bundle.STARTING:
      return "STARTING";

    case Bundle.ACTIVE:
      return "ACTIVE";

    case Bundle.STOPPING:
      return "STOPPING";

    case Bundle.UNINSTALLED:
      return "UNINSTALLED";

    default:
      return null;
    }
  }
}
