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
package org.eclipse.net4j.internal.pop;

import org.eclipse.net4j.internal.pop.bundle.OM;
import org.eclipse.net4j.pop.base.PopElement;
import org.eclipse.net4j.pop.project.Branch;
import org.eclipse.net4j.pop.project.Checkout;
import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.ProjectFactory;
import org.eclipse.net4j.pop.project.RepositoryModule;
import org.eclipse.net4j.pop.project.Tag;
import org.eclipse.net4j.pop.project.impl.CheckoutDiscriminatorImpl;
import org.eclipse.net4j.pop.project.impl.CheckoutImpl;
import org.eclipse.net4j.pop.project.impl.ICheckoutManager;
import org.eclipse.net4j.pop.repository.IRepositoryAdapter;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class CheckoutManager extends Container<Checkout> implements ICheckoutManager
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, CheckoutManager.class);

  private Pop pop;

  private IPath location;

  private Map<CheckoutDiscriminator, Checkout> checkouts = new HashMap<CheckoutDiscriminator, Checkout>();

  public CheckoutManager(Pop pop)
  {
    this.pop = pop;
  }

  public Pop getPop()
  {
    return pop;
  }

  public PopProject getPopProject()
  {
    return pop.getPopProject();
  }

  public void addCheckout(Checkout checkout)
  {
    CheckoutDiscriminator discriminator = checkout.getDiscriminator();
    synchronized (checkouts)
    {
      if (checkouts.containsKey(discriminator))
      {
        throw new IllegalStateException("Duplicate  ID: " + discriminator);
      }

      checkouts.put(discriminator, checkout);
    }

    if (TRACER.isEnabled())
    {
      TRACER.trace("Added checkout: " + checkout);
    }

    if (isActive())
    {
      fireElementAddedEvent(checkout);
    }
  }

  public Checkout removeCheckout(CheckoutDiscriminator discriminator)
  {
    Checkout checkout = null;
    synchronized (checkouts)
    {
      checkout = checkouts.remove(discriminator);
    }

    if (checkout != null)
    {
      if (TRACER.isEnabled())
      {
        TRACER.trace("Removed checkout: " + checkout);
      }

      if (isActive())
      {
        fireElementRemovedEvent(checkout);
      }

      return checkout;
    }

    return null;
  }

  public Checkout getCheckout(CheckoutDiscriminator discriminator)
  {
    synchronized (checkouts)
    {
      return checkouts.get(discriminator);
    }
  }

  public Checkout[] getCheckouts()
  {
    synchronized (checkouts)
    {
      return checkouts.values().toArray(new Checkout[checkouts.size()]);
    }
  }

  public Checkout checkout(CheckoutDiscriminator discriminator)
  {
    IPath location = checkoutPrimaryModule(discriminator);
    return createCheckout(discriminator, location);
  }

  public Checkout[] getElements()
  {
    return getCheckouts();
  }

  @SuppressWarnings("unchecked")
  public Object getAdapter(Class adapter)
  {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("CheckoutManager[{0}]", pop.getProject().getName());
  }

  public void checkoutLocationChanged()
  {
    // TODO fire clear event
    checkouts.clear();
    init();
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();
    init();
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    checkouts.clear();
    super.doDeactivate();
  }

  private void init()
  {
    PopProject popProject = pop.getPopProject();
    location = PopManager.INSTANCE.getCheckoutLocation().append(popProject.getName());
    File locationFolder = location.toFile();
    if (locationFolder.exists() && locationFolder.isDirectory())
    {
      for (File folder : locationFolder.listFiles())
      {
        String checkoutName = folder.getName();
        PopElement popElement = pop.getPopElement(checkoutName);
        if (popElement instanceof CheckoutDiscriminator)
        {
          CheckoutDiscriminator discriminator = (CheckoutDiscriminator)popElement;
          createCheckout(discriminator, getCheckoutLocation(discriminator));
        }
      }
    }
  }

  private IPath getCheckoutLocation(CheckoutDiscriminator discriminator)
  {
    String checkoutName = ((CheckoutDiscriminatorImpl)discriminator).getIdValue();
    return location.append(checkoutName);
  }

  private Checkout createCheckout(CheckoutDiscriminator discriminator, IPath checkoutLocation)
  {
    CheckoutImpl checkout = (CheckoutImpl)ProjectFactory.eINSTANCE.createCheckout();
    checkout.setDiscriminator(discriminator);
    checkout.setLocation(checkoutLocation);

    addCheckout(checkout);
    return checkout;
  }

  private IPath checkoutPrimaryModule(CheckoutDiscriminator discriminator)
  {
    IPath target = getCheckoutLocation(discriminator);
    RepositoryModule module = discriminator.getPopProject().getPrimaryModule();
    IRepositoryAdapter adapter = module.getAdapter();
    if (discriminator instanceof Branch)
    {
      String branch = ((Branch)discriminator).getName();
      adapter.checkoutBranch(target, module.getRepositoryDescriptor(), module.getModuleDescriptor(), branch);
    }
    else if (discriminator instanceof Tag)
    {
      String tag = ((Tag)discriminator).getName();
      adapter.checkoutTag(target, module.getRepositoryDescriptor(), module.getModuleDescriptor(), tag);
    }
    else
    {
      throw new IllegalArgumentException("Unrecognized checkout discriminator: " + discriminator);
    }

    return target;
  }
}
