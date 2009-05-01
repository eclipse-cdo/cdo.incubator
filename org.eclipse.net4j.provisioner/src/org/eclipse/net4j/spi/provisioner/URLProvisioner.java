package org.eclipse.net4j.spi.provisioner;

import org.eclipse.net4j.provisioner.IEnvelope;
import org.eclipse.net4j.provisioner.IProvisioner;
import org.eclipse.net4j.provisioner.ProvisionerException;
import org.eclipse.net4j.util.factory.ProductCreationException;
import org.eclipse.net4j.util.io.IOUtil;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLProvisioner implements IProvisioner
{
  public static final String TYPE = "url";

  private static final String SOURCE_URL_PROPERTY = "sourceURL";

  private String description;

  public URLProvisioner(String description)
  {
    this.description = description;
  }

  public URLProvisioner()
  {
    this(null);
  }

  public String getType()
  {
    return TYPE;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void provision(IEnvelope envelope, BundleContext bundleContext) throws ProvisionerException
  {
    InputStream inputStream = null;
    OutputStream outputStream = null;

    try
    {
      URL sourceURL = getSourceURL(envelope);
      if (sourceURL == null)
      {
        throw new ProvisionerException("No value for property " + SOURCE_URL_PROPERTY);
      }

      File bundleFile = envelope.getBundleFile();
      if (bundleFile.isDirectory())
      {
        throw new ProvisionerException("Bundle is a folder: " + bundleFile.getAbsolutePath());
      }

      Bundle bundle = envelope.getBundle();
      String location = bundle.getLocation();
      bundle.uninstall();

      inputStream = sourceURL.openStream();
      outputStream = IOUtil.openOutputStream(bundleFile);

      IOUtil.copy(inputStream, outputStream);
      IOUtil.close(outputStream);
      bundleContext.installBundle(location);
    }
    catch (ProvisionerException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      throw new ProvisionerException(ex);
    }
    finally
    {
      IOUtil.close(outputStream);
      IOUtil.close(inputStream);
    }
  }

  protected URL getSourceURL(IEnvelope envelope) throws MalformedURLException
  {
    String property = envelope.getProvisionerProperties().getProperty(SOURCE_URL_PROPERTY);
    if (property == null)
    {
      return null;
    }

    return new URL(property);
  }

  /**
   * @author Eike Stepper
   */
  public static class Factory extends org.eclipse.net4j.util.factory.Factory
  {
    public Factory()
    {
      super(PRODUCT_GROUP, TYPE);
    }

    public URLProvisioner create(String description) throws ProductCreationException
    {
      return new URLProvisioner(description);
    }
  }
}
