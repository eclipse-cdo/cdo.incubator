/**
 * Copyright (c) 2004 - 2009 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stefan Winkler - initial API and implementation
 */
package org.eclipse.emf.cdo.server.internal.file;

import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.server.ISession;
import org.eclipse.emf.cdo.server.IStoreAccessor;
import org.eclipse.emf.cdo.server.ITransaction;
import org.eclipse.emf.cdo.server.IView;
import org.eclipse.emf.cdo.server.file.IFileStore;
import org.eclipse.emf.cdo.spi.server.LongIDStore;
import org.eclipse.emf.cdo.spi.server.StoreAccessorPool;

import org.eclipse.net4j.util.ReflectUtil.ExcludeFromDump;

import java.io.File;

/**
 * @author Stefan Winkler
 */
public class FileStore extends LongIDStore implements IFileStore
{
  public static final String TYPE = "file";

  public static final String METADATA_DIR = "metadata";

  public static final String PACKAGE_DIR = "packages";

  public static final String REVISION_DIR = "revisions";

  private static final String CREATION_FILE_NAME = "cdo$repository$created";

  private String repositoryBasePath = "c:/temp/repository";

  private File repositoryBaseDir;

  private File repositoryDir;

  @ExcludeFromDump
  private transient final StoreAccessorPool readerPool = new StoreAccessorPool(this, null);

  @ExcludeFromDump
  private transient final StoreAccessorPool writerPool = new StoreAccessorPool(this, null);

  private File metadataDir;

  private File packageDir;

  private File revisionDir;

  private long creationTime;

  public FileStore()
  {
    super(TYPE, set(ChangeFormat.DELTA), set(RevisionTemporality.NONE), set(RevisionParallelism.NONE));
  }

  @Override
  protected IStoreAccessor createReader(ISession session)
  {
    return new FileStoreAccessor(this, session);
  }

  @Override
  protected IStoreAccessor createWriter(ITransaction transaction)
  {
    return new FileStoreAccessor(this, transaction);
  }

  @Override
  protected StoreAccessorPool getReaderPool(ISession session, boolean forReleasing)
  {
    return readerPool;
  }

  @Override
  protected StoreAccessorPool getWriterPool(IView view, boolean forReleasing)
  {
    return writerPool;
  }

  public long getCreationTime()
  {
    return creationTime;
  }

  public void repairAfterCrash()
  {
  }

  @Override
  protected void doActivate() throws Exception
  {
    super.doActivate();

    checkNull(getRepository(), "Repository is not set");

    repositoryBaseDir = new File(repositoryBasePath);
    if (!repositoryBaseDir.exists())
    {
      checkState(repositoryBaseDir.mkdirs(), "Could not create repository directory: " + repositoryBasePath);
    }

    repositoryDir = new File(repositoryBaseDir, FileStoreHelper.demangleName(getRepository().getUUID()));
    metadataDir = new File(repositoryDir, METADATA_DIR);
    packageDir = new File(metadataDir, PACKAGE_DIR);
    revisionDir = new File(repositoryDir, REVISION_DIR);
    File creationTimeFile = new File(metadataDir, CREATION_FILE_NAME);

    if (!repositoryDir.exists())
    {
      checkState(repositoryDir.mkdir(), "Could not create repository directory: " + repositoryDir.getAbsolutePath());
      checkState(metadataDir.mkdir(), "Could not create metadata directory: " + metadataDir.getAbsolutePath());
      checkState(packageDir.mkdir(), "Could not create package directory: " + metadataDir.getAbsolutePath());
      checkState(revisionDir.mkdir(), "Could not create revision directory: " + metadataDir.getAbsolutePath());
      FileStoreHelper.writeValue(creationTimeFile, System.currentTimeMillis(), CDOType.LONG);

      FileStorePackageSerializer.prepareResourcePackage(packageDir, getRepository().getPackageRegistry()
          .getCDOResourcePackage());
    }

    checkState(metadataDir.exists(), "Metadata directory does not exist! " + metadataDir.getAbsolutePath());
    checkState(packageDir.exists(), "Package directory does not exist! " + metadataDir.getAbsolutePath());
    checkState(revisionDir.exists(), "Revision directory does not exist! " + metadataDir.getAbsolutePath());

    creationTime = (Long)FileStoreHelper.readValue(creationTimeFile, CDOType.LONG);
  }

  public File getMetadataDir()
  {
    return metadataDir;
  }

  public File getPackageDir()
  {
    return packageDir;
  }

  public File getRevisionDir()
  {
    return revisionDir;
  }

  public void setRepositoryPath(String repositoryBasePath)
  {
    this.repositoryBasePath = repositoryBasePath;
  }
}
