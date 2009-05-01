package org.eclipse.net4j.provisioner;

import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.container.IManagedContainer;

public interface IEnvelopeManager extends IContainer<IEnvelope>
{
  public static final IEnvelopeManager INSTANCE = org.eclipse.net4j.internal.provisioner.EnvelopeManager.INSTANCE;

  public IManagedContainer getContainer();

  public void setContainer(IManagedContainer container);

  public String getDownloadsCache();
}
