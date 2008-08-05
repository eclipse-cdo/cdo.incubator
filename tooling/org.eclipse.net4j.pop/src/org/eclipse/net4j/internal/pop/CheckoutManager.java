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
import org.eclipse.net4j.pop.project.Checkout;
import org.eclipse.net4j.pop.project.CheckoutDiscriminator;
import org.eclipse.net4j.pop.project.PopProject;
import org.eclipse.net4j.pop.project.impl.ICheckoutManager;
import org.eclipse.net4j.util.container.Container;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eike Stepper
 */
public class CheckoutManager extends Container<Checkout> implements ICheckoutManager
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, CheckoutManager.class);

  private PopProject popProject;

  private Map<CheckoutDiscriminator, Checkout> checkouts = new HashMap<CheckoutDiscriminator, Checkout>();

  public CheckoutManager(PopProject popProject)
  {
    this.popProject = popProject;
  }

  public PopProject getPopProject()
  {
    return popProject;
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

  public Checkout[] getElements()
  {
    return getCheckouts();
  }
}
