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

import org.eclipse.net4j.internal.pop.code.Committer;
import org.eclipse.net4j.internal.pop.delivery.DeliveryProxy;
import org.eclipse.net4j.internal.pop.release.ReleaseProxy;
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.internal.pop.util.IElementResolver;
import org.eclipse.net4j.pop.IDateBaseline;
import org.eclipse.net4j.pop.IMaintenanceStream;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.ITaskStream;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICodeStrategy;
import org.eclipse.net4j.pop.code.ICommitter;
import org.eclipse.net4j.pop.delivery.IDelivery;
import org.eclipse.net4j.pop.release.IRelease;
import org.eclipse.net4j.pop.ticket.ITicket;
import org.eclipse.net4j.pop.ticket.ITicketUser;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Pop extends DevelopmentStream implements IPop, IElementResolver
{
  protected ElementContainer<ICommitter> committerContainer = new ElementContainer<ICommitter>(this);

  private String name;

  private ICodeStrategy strategy;

  public Pop(String name, ICodeStrategy strategy, IBranch branch, ITicket ticket)
  {
    super(null, branch, ticket);
    checkArgument(name, "name");
    checkArgument(strategy, "strategy");
    this.name = name;
    this.strategy = strategy;
  }

  @Override
  public IPop getParent()
  {
    return null;
  }

  @Override
  public IPop getPop()
  {
    return this;
  }

  public String getName()
  {
    return name;
  }

  public ICodeStrategy getCodeStrategy()
  {
    return strategy;
  }

  public ICommitter addCommitter(ITicketUser ticketUser, String codeAccount, Date entryDate, Date exitDate)
  {
    ICommitter committer = new Committer(this, ticketUser, codeAccount, entryDate, exitDate);
    committerContainer.addElement(committer);
    return committer;
  }

  public ICommitter getCommitter(int index)
  {
    return committerContainer.getElement(index);
  }

  public int getCommitterCount()
  {
    return committerContainer.getElementCount();
  }

  public ICommitter[] getCommitters()
  {
    return committerContainer.getElements(ICommitter.class);
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("Pop[name={0}, branch={1}, ticket={2}]", name, getBranch().getName(), getTicket()
        .getID());
  }

  public IMaintenanceStream resolve(MaintenanceStreamProxy proxy)
  {
    // TODO Implement Pop.resolve(proxy)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public ITaskStream resolve(TaskStreamProxy proxy)
  {
    // TODO Implement Pop.resolve(taskStreamProxy)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public IDelivery resolve(DeliveryProxy proxy)
  {
    // TODO Implement Pop.resolve(proxy)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public IRelease resolve(ReleaseProxy proxy)
  {
    // TODO Implement Pop.resolve(proxy)
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public IDateBaseline resolve(DateBaselineProxy proxy)
  {
    // TODO Implement Pop.resolve(proxy)
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
