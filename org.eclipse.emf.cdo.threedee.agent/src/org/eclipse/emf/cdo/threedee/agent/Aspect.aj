/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.threedee.agent;

/**
 * @author Eike Stepper
 */
public aspect Aspect
{
  pointcut publicMethods() :
    !execution(* org.eclipse.net4j.buffer.IBufferProvider.*(..)) &&
    !execution(public String *.toString()) &&
    !execution(public boolean *.equals(Object)) &&
    !execution(public int *.hashCode()) &&
    (
      execution(public * org.eclipse.emf.ecore.impl.EPackageRegistryImpl.*(..)) ||
      execution(public * org.eclipse.net4j.util.container.ManagedContainer.*(..)) ||

      execution(public * org.eclipse.emf.internal.cdo.session.CDOSessionImpl.*(..)) ||
      execution(public * org.eclipse.emf.internal.cdo.view.AbstractCDOView.*(..)) ||
      execution(public * org.eclipse.emf.internal.cdo.view.CDOViewImpl.*(..)) ||
      execution(public * org.eclipse.emf.internal.cdo.transaction.CDOTransactionImpl.*(..)) ||
      execution(public * org.eclipse.emf.internal.cdo.transaction.CDOSavepointImpl.*(..)) ||
      execution(public * org.eclipse.emf.internal.cdo.CDOObjectImpl.*(..)) ||

      execution(public * org.eclipse.emf.cdo.internal.server.Repository.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.CommitManager.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.LockManager.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.QueryManager.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.SessionManager.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.Session.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.View.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.Transaction.*(..)) ||

      execution(public * org.eclipse.emf.cdo.internal.server.mem.MEMStore.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.mem.MEMStoreAccessor.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.server.mem.MEMStoreChunkReader.*(..)) ||

      execution(public * org.eclipse.emf.cdo.internal.common.branch.CDOBranchManagerImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.branch.CDOBranchImpl.*(..)) ||

      execution(public * org.eclipse.emf.cdo.internal.common.revision.CDORevisionManagerImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.revision.CDORevisionCacheImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.spi.common.revision.AbstractCDORevision.*(..)) ||
      execution(public * org.eclipse.emf.cdo.spi.common.revision.BaseCDORevision.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.revision.CDORevisionImpl.*(..)) ||

      execution(public * org.eclipse.emf.cdo.internal.common.model.CDOPackageRegistryImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.model.CDOPackageUnitImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.model.CDOPackageInfoImpl.*(..)) ||
      execution(public * org.eclipse.emf.cdo.internal.common.model.CDOClassInfoImpl.*(..)) ||

      execution(public * org.eclipse.emf.cdo.spi.server.Store.*(..)) ||
      execution(public * org.eclipse.emf.cdo.server.internal.db.DBStore.*(..)) ||
      execution(public * org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.AbstractHorizontalClassMapping.*(..)) ||
      execution(public * org.eclipse.emf.cdo.server.internal.db.mapping.AbstractMappingStrategy.*(..)) ||
      execution(public * org.eclipse.emf.cdo.server.internal.db.MetaDataManager.*(..)) ||
      execution(public * org.eclipse.emf.cdo.server.db.mapping.AbstractTypeMapping.*(..)) ||

      execution(public * org.eclipse.net4j.spi.db.DBAdapter.*(..)) ||
      execution(public * org.eclipse.net4j.spi.db.DBSchema.*(..)) ||
      execution(public * org.eclipse.net4j.internal.db.ddl.DBField.*(..)) ||
      execution(public * org.eclipse.net4j.internal.db.ddl.DBIndex.*(..)) ||
      execution(public * org.eclipse.net4j.internal.db.ddl.DBTable.*(..)) ||

      execution(public * org.eclipse.spi.net4j.Acceptor.*(..)) ||
      execution(public * org.eclipse.spi.net4j.Channel.*(..)) ||
      execution(public * org.eclipse.spi.net4j.ChannelMultiplexer.*(..)) ||
      execution(public * org.eclipse.spi.net4j.Connector.*(..)) ||
      execution(public * org.eclipse.spi.net4j.Protocol.*(..)) ||
      execution(public * org.eclipse.net4j.internal.tcp.TCPAcceptor.*(..)) ||
      execution(public * org.eclipse.net4j.internal.tcp.TCPConnector.*(..)) ||
      execution(public * org.eclipse.net4j.internal.tcp.TCPClientConnector.*(..)) ||
      execution(public * org.eclipse.net4j.internal.tcp.TCPServerConnector.*(..)) ||
      execution(public * org.eclipse.net4j.internal.tcp.TCPSelector.*(..)) ||
      execution(public * java.nio.channels.SocketChannel.*(..))
    );

  before(Object target) : publicMethods() && target(target)
  {
    String what = thisJoinPointStaticPart.getSignature().getName();
    Hook.before(target, what);
  }

  after(Object target) : publicMethods() && target(target)
  {
    String what = thisJoinPointStaticPart.getSignature().getName();
    Hook.after(target, what);
  }
}
