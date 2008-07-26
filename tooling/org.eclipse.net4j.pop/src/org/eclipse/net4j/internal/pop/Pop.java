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
import org.eclipse.net4j.internal.pop.util.ElementContainer;
import org.eclipse.net4j.pop.IPop;
import org.eclipse.net4j.pop.code.IBranch;
import org.eclipse.net4j.pop.code.ICodeStrategy;
import org.eclipse.net4j.pop.code.ICommitter;
import org.eclipse.net4j.pop.ticket.ITicket;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class Pop extends DevelopmentStream implements IPop
{
  protected ElementContainer<ICommitter> committerContainer = new ElementContainer<ICommitter>(this);

  private String name;

  private ICodeStrategy strategy;

  public Pop(String name, ICodeStrategy strategy, IBranch branch, ITicket ticket)
  {
    super(null, branch, ticket);
    this.name = name;
    this.strategy = strategy;
  }

  @Override
  public IPop getParentStream()
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

  public ICommitter addCommitter(String name, String email, String ticketAccount, String codeAccount)
  {
    ICommitter committer = new Committer(this, name, email, ticketAccount, codeAccount, new Date(), null);
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

}
