package org.eclipse.net4j.internal.provisioner;

import org.eclipse.net4j.internal.provisioner.bundle.OM;
import org.eclipse.net4j.provisioner.IEnvelope;
import org.eclipse.net4j.provisioner.IEnvelopeManager;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnvelopeManager extends Container<IEnvelope> implements IEnvelopeManager, BundleListener
{
  public static final EnvelopeManager INSTANCE = new EnvelopeManager();

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, EnvelopeManager.class);

  private IManagedContainer container;

  private BundleContext bundleContext;

  private Map<Long, IEnvelope> envelopes = new HashMap<Long, IEnvelope>();

  private Set<Long> checked = new HashSet<Long>();

  private IEnvelope[] elements;

  private EnvelopeManager()
  {
  }

  public synchronized IManagedContainer getContainer()
  {
    if (container == null)
    {
      container = IPluginContainer.INSTANCE;
    }

    return container;
  }

  public void setContainer(IManagedContainer container)
  {
    this.container = container;
  }

  public String getDownloadsCache()
  {
    return OM.PREF_DOWNLOADS_CACHE.getValue();
  }

  public BundleContext getBundleContext()
  {
    return bundleContext;
  }

  public void setBundleContext(BundleContext bundleContext)
  {
    this.bundleContext = bundleContext;
  }

  public IEnvelope[] getElements()
  {
    synchronized (envelopes)
    {
      if (elements == null)
      {
        elements = envelopes.values().toArray(new IEnvelope[envelopes.size()]);
      }

      return elements;
    }
  }

  public void bundleChanged(BundleEvent event)
  {
    Bundle bundle = event.getBundle();
    switch (event.getType())
    {
    case BundleEvent.INSTALLED:
    case BundleEvent.RESOLVED:
    case BundleEvent.STARTING:
      checkEnvelope(bundle);
      break;

    case BundleEvent.UPDATED:
      removeEnvelope(bundle);
      checkEnvelope(bundle);
      break;

    case BundleEvent.UNINSTALLED:
      removeEnvelope(bundle);
      break;
    }
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    bundleContext.addBundleListener(this);

    Thread thread = new Thread("InitProvisioner")
    {
      @Override
      public void run()
      {
        for (Bundle bundle : bundleContext.getBundles())
        {
          switch (bundle.getState())
          {
          case Bundle.INSTALLED:
          case Bundle.RESOLVED:
          case Bundle.STARTING:
            checkEnvelope(bundle);
            break;

          case Bundle.UNINSTALLED:
            removeEnvelope(bundle);
            break;
          }
        }
      }
    };

    thread.setDaemon(true);
    thread.start();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    bundleContext.removeBundleListener(this);
    super.doDeactivate();
  }

  private void checkEnvelope(Bundle bundle)
  {
    try
    {
      long bundleId = bundle.getBundleId();
      IEnvelope envelope = null;
      synchronized (envelopes)
      {
        if (checked.add(bundleId))
        {
          if (!envelopes.containsKey(bundleId))
          {
            envelope = createEnvelope(bundle);
            if (envelope != null)
            {
              envelopes.put(envelope.getBundleId(), envelope);
              elements = null;
            }
          }
        }
        else
        {
          if (TRACER.isEnabled())
          {
            TRACER.format("Ignored {0}", envelopes.get(bundleId));
          }
        }
      }

      if (envelope != null)
      {
        OM.LOG.info("Found envelope bundle: " + envelope.getBundle().getSymbolicName());
        fireElementAddedEvent(envelope);
      }
    }
    catch (RuntimeException ex)
    {
      OM.LOG.error(ex);
      throw ex;
    }
  }

  private IEnvelope createEnvelope(Bundle bundle)
  {
    try
    {
      return new Envelope(bundle);
    }
    catch (NoEnvelopeException ex)
    {
      return null;
    }
  }

  private void removeEnvelope(Bundle bundle)
  {
    long bundleId = bundle.getBundleId();
    IEnvelope envelope = null;
    synchronized (envelopes)
    {
      envelope = envelopes.remove(bundleId);
      if (envelope != null)
      {
        checked.remove(bundleId);
        elements = null;
      }
    }

    if (envelope != null)
    {
      fireElementRemovedEvent(envelope);
    }
  }
}
