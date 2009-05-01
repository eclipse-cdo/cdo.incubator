

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
  private static final String MSG = "This bundle is just an empty envelope for the Net4j provisioner";

  public void start(BundleContext context) throws Exception
  {
    throw new IllegalStateException(MSG);
  }

  public void stop(BundleContext context) throws Exception
  {
    throw new IllegalStateException(MSG);
  }
}
