package org.eclipse.net4j.provisioner;

import org.osgi.framework.BundleContext;

public interface IProvisioner
{
  public static final String PRODUCT_GROUP = "org.eclipse.net4j.provisioners";

  public String getType();

  public String getDescription();

  public void provision(IEnvelope envelope, BundleContext bundleContext) throws ProvisionerException;
}
