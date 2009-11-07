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

import org.eclipse.emf.cdo.common.CDOQueryInfo;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.model.CDOModelUtil;
import org.eclipse.emf.cdo.common.model.CDOPackageInfo;
import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.common.revision.CDOList;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.common.revision.delta.CDOAddFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOClearFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOContainerFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOFeatureDeltaVisitor;
import org.eclipse.emf.cdo.common.revision.delta.CDOListFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOMoveFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDORemoveFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDORevisionDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOSetFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOUnsetFeatureDelta;
import org.eclipse.emf.cdo.server.IQueryContext;
import org.eclipse.emf.cdo.server.ISession;
import org.eclipse.emf.cdo.server.IStoreChunkReader;
import org.eclipse.emf.cdo.server.ITransaction;
import org.eclipse.emf.cdo.server.IStoreAccessor.CommitContext;
import org.eclipse.emf.cdo.server.IStoreAccessor.QueryResourcesContext;
import org.eclipse.emf.cdo.server.internal.file.bundle.OM;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;
import org.eclipse.emf.cdo.spi.server.StoreAccessor;

import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.collection.CloseableIterator;
import org.eclipse.net4j.util.om.monitor.OMMonitor;
import org.eclipse.net4j.util.om.monitor.OMMonitor.Async;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * @author Stefan Winkler
 */
public class FileStoreAccessor extends StoreAccessor
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, FileStoreAccessor.class);

  private static final String CLASS_FILE_NAME = "cdo$Class";

  private static final String VERSION_FILE_NAME = "cdo$Version";

  private static final String CREATED_FILE_NAME = "cdo$Created";

  private static final String CONTAINING_FEATURE_FILE_NAME = "cdo$containingFeatureId";

  private static final String CONTAINER_FILE_NAME = "cdo$containerId";

  private static final String RESOURCE_FILE_NAME = "cdo$resourceId";

  private static final String TEMP_FILE_NAME = "cdo$temp";

  private class FileRevisionDeltaWriter implements CDOFeatureDeltaVisitor
  {
    private File revisionDir;

    public FileRevisionDeltaWriter()
    {
    }

    public void write(CDORevisionDelta delta)
    {
      delta.accept(this);
    }

    public void setRevisionDir(File revisionDir)
    {
      this.revisionDir = revisionDir;
    }

    public void visit(CDOMoveFeatureDelta delta)
    {
      int newPosition = delta.getNewPosition();
      int oldPosition = delta.getOldPosition();
      if (oldPosition == newPosition)
      {
        return;
      }

      File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, delta.getFeature());
      File valueFile = FileStoreHelper.getMultiValueFileChecked(featureDir, oldPosition);
      File tempFile = new File(featureDir, TEMP_FILE_NAME);

      FileStoreHelper.rename(valueFile, tempFile);

      valueFile = oldPosition > newPosition ? moveUp(featureDir, oldPosition, newPosition) : moveDown(featureDir,
          oldPosition, newPosition);

      FileStoreHelper.rename(tempFile, valueFile);
    }

    private File moveDown(File featureDir, int targetPosition, int lastIndex)
    {
      File targetFile = FileStoreHelper.getMultiValueFileChecked(featureDir, targetPosition);

      for (int index = targetPosition + 1; index <= lastIndex; index++)
      {
        File sourceFile = FileStoreHelper.getMultiValueFileChecked(featureDir, index);
        FileStoreHelper.rename(sourceFile, targetFile);
        targetFile = sourceFile;
      }

      return targetFile;
    }

    private File moveUp(File featureDir, int targetPosition, int lastIndex)
    {
      File targetFile = FileStoreHelper.getMultiValueFileChecked(featureDir, targetPosition);

      for (int index = targetPosition - 1; index >= lastIndex; index--)
      {
        File sourceFile = FileStoreHelper.getMultiValueFileChecked(featureDir, index);
        FileStoreHelper.rename(sourceFile, targetFile);
        targetFile = sourceFile;
      }

      return targetFile;
    }

    public void visit(CDOAddFeatureDelta delta)
    {
      File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, delta.getFeature());

      int size = featureDir.list().length;
      int index = delta.getIndex();

      if (index < size)
      {
        moveUp(featureDir, size + 1, index);
      }

      writeOneMultiValue(featureDir, index, delta.getValue(), delta.getFeature().getType());
    }

    public void visit(CDORemoveFeatureDelta delta)
    {
      File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, delta.getFeature());
      int size = featureDir.list().length;
      int index = delta.getIndex();

      File valueFile = FileStoreHelper.getMultiValueFileChecked(featureDir, index);
      FileStoreHelper.recursiveDelete(valueFile);

      moveDown(featureDir, index, size);
    }

    public void visit(CDOSetFeatureDelta delta)
    {
      if (delta.getFeature().isMany())
      {
        File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, delta.getFeature());
        writeOneMultiValue(featureDir, delta.getIndex(), delta.getValue(), delta.getFeature().getType());
      }
      else
      {
        writeSingleValue(revisionDir, delta.getFeature(), delta.getValue());
      }
    }

    public void visit(CDOUnsetFeatureDelta delta)
    {
      writeSingleValue(revisionDir, delta.getFeature(), null);
    }

    public void visit(CDOListFeatureDelta delta)
    {
      for (CDOFeatureDelta listFeatureDelta : delta.getListChanges())
      {
        listFeatureDelta.accept(this);
      }
    }

    public void visit(CDOClearFeatureDelta delta)
    {
      File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, delta.getFeature());
      checkState(featureDir.delete(), "Could not delete feature directory: " + featureDir.getAbsolutePath());
    }

    public void visit(CDOContainerFeatureDelta delta)
    {
      writeMetadataContainer(revisionDir, (CDOID)delta.getContainerID());
      writeMetadataContainingFeature(revisionDir, delta.getContainerFeatureID());
      writeMetadataResource(revisionDir, delta.getResourceID());
    }
  }

  public FileStoreAccessor(FileStore store, ISession session)
  {
    super(store, session);
  }

  public FileStoreAccessor(FileStore store, ITransaction transaction)
  {
    super(store, transaction);
  }

  @Override
  protected void doActivate() throws Exception
  {
  }

  @Override
  protected void doDeactivate() throws Exception
  {
  }

  @Override
  protected void doPassivate() throws Exception
  {
  }

  @Override
  protected void doUnpassivate() throws Exception
  {
  }

  public void commit(OMMonitor monitor)
  {
  }

  @Override
  protected void rollback(CommitContext commitContext)
  {
  }

  public IStoreChunkReader createChunkReader(CDORevision revision, CDOFeature feature)
  {
    return null;
  }

  @Override
  protected void writePackages(CDOPackage[] cdoPackages, OMMonitor monitor)
  {
    monitor.begin(cdoPackages.length);

    try
    {
      File metadataDir = getStore().getPackageDir();

      for (CDOPackage pkg : cdoPackages)
      {
        FileStorePackageSerializer.writePackage(metadataDir, (InternalCDOPackage)pkg);
        monitor.worked();
      }
    }
    finally
    {
      monitor.done();
    }
  }

  public void readPackage(CDOPackage pkg)
  {
    File packageDir = getStore().getPackageDir();
    FileStorePackageSerializer.readPackage(packageDir, (InternalCDOPackage)pkg);
  }

  public void readPackageEcore(CDOPackage pkg)
  {
    File packageDir = getStore().getPackageDir();
    FileStorePackageSerializer.readPackageEcore(packageDir, (InternalCDOPackage)pkg);
  }

  public Collection<CDOPackageInfo> readPackageInfos()
  {
    File packageDir = getStore().getPackageDir();
    return FileStorePackageSerializer.readPackageInfos(packageDir);
  }

  public CloseableIterator<CDOID> readObjectIDs()
  {
    File revisionBaseDir = getStore().getRevisionDir();
    String[] revisionList = revisionBaseDir.list();
    return new FileStoreObjectIdIterator(revisionList);
  }

  public CDOClassRef readObjectType(CDOID id)
  {
    File revisionBaseDir = getStore().getRevisionDir();
    File revisionDir = FileStoreHelper.getRevisionDirChecked(revisionBaseDir, id);
    if (!revisionDir.exists())
    {
      // revision does not exist - return null
      return null;
    }

    return readClassRef(revisionDir);
  }

  @Override
  protected void writeRevisionDeltas(CDORevisionDelta[] revisionDeltas, long created, OMMonitor monitor)
  {
    File revisionBaseDir = getStore().getRevisionDir();

    FileRevisionDeltaWriter deltaWriter = new FileRevisionDeltaWriter();
    monitor.begin(revisionDeltas.length);

    try
    {
      for (CDORevisionDelta delta : revisionDeltas)
      {
        Async async = monitor.forkAsync();
        try
        {
          File revisionDir = FileStoreHelper.getRevisionDirChecked(revisionBaseDir, delta.getID());

          deltaWriter.setRevisionDir(revisionDir);
          deltaWriter.write(delta);

          writeMetadataVersion(revisionDir, delta.getDirtyVersion());
          writeMetadataCreated(revisionDir, created);
        }
        finally
        {
          async.stop();
        }
      }
    }
    finally
    {
      monitor.done();
    }

  }

  @Override
  protected void writeRevisions(CDORevision[] revisions, OMMonitor monitor)
  {
    monitor.begin(revisions.length);
    try
    {
      for (CDORevision revision : revisions)
      {
        writeRevision(revision, monitor.fork());
      }
    }
    finally
    {
      monitor.done();
    }
  }

  private void writeRevision(CDORevision cdoRevision, OMMonitor fork)
  {
    InternalCDORevision revision = (InternalCDORevision)cdoRevision;

    File revisionBaseDir = getStore().getRevisionDir();
    File revisionDir = FileStoreHelper.getRevisionDir(revisionBaseDir, revision.getID());
    checkState(!revisionDir.exists(), "Revision to write already exists: " + revisionDir.getAbsolutePath());
    checkState(revisionDir.mkdir(), "Revision dir could not be created: " + revisionDir.getAbsolutePath());

    CDOClass cdoClass = revision.getCDOClass();
    writeClassRef(revisionDir, cdoClass);
    writeMetadata(revisionDir, revision);

    for (CDOFeature feature : cdoClass.getAllFeatures())
    {
      if (feature.isMany())
      {
        writeMultiValue(revisionDir, feature, revision.getList(feature));
      }
      else
      {
        writeSingleValue(revisionDir, feature, revision.getValue(feature));
      }
    }

    FileStorePackageSerializer.registerInstance(getStore().getPackageDir(), cdoRevision);
  }

  @Override
  protected void detachObjects(CDOID[] detachedObjects, long revised, OMMonitor monitor)
  {
    monitor.begin(detachedObjects.length);
    try
    {
      for (CDOID id : detachedObjects)
      {
        File revisionBaseDir = getStore().getRevisionDir();
        File revisionDir = FileStoreHelper.getRevisionDirChecked(revisionBaseDir, id);

        CDOClassRef classRef = readClassRef(revisionDir);

        FileStoreHelper.recursiveDelete(revisionDir);

        FileStorePackageSerializer.deregisterInstance(getStore().getPackageDir(), classRef, id);
        monitor.worked();
      }
    }
    finally
    {
      monitor.done();
    }
  }

  public CDORevision readRevision(CDOID id, int referenceChunk)
  {
    File revisionBaseDir = getStore().getRevisionDir();
    File revisionDir = FileStoreHelper.getRevisionDir(revisionBaseDir, id);
    if (!revisionDir.exists())
    {
      // revision does not exist - return null
      return null;
    }

    CDOClassRef cdoClassRef = readClassRef(revisionDir);
    CDOClass cdoClass = cdoClassRef.resolve(getStore().getRepository().getPackageManager());
    checkArg(cdoClass, "Read CDOClass but could not resolve " + cdoClassRef.toString());

    InternalCDORevision revision = (InternalCDORevision)CDORevisionUtil.create(cdoClass, id);
    readMetadata(revisionDir, revision);

    for (CDOFeature feature : cdoClass.getAllFeatures())
    {
      if (feature.isMany())
      {
        readMultiValue(revisionDir, feature, revision.getList(feature));
      }
      else
      {
        revision.setValue(feature, readSingleValue(revisionDir, feature));
      }
    }

    return revision;
  }

  private void writeClassRef(File revisionDir, CDOClass cdoClass)
  {
    File classFile = new File(revisionDir, CLASS_FILE_NAME);

    String packageId = cdoClass.getContainingPackage().getPackageURI();
    int classId = cdoClass.getClassifierID();

    PrintWriter pw = null;
    try
    {
      pw = new PrintWriter(classFile);
      pw.println(packageId);
      pw.println(classId);
    }
    catch (IOException e)
    {
      throw new RuntimeException("Could not write to cdo class file: " + classFile.getAbsolutePath());
    }
    finally
    {
      FileStoreHelper.close(pw);
    }
  }

  private CDOClassRef readClassRef(File revisionDir)
  {
    File classFile = new File(revisionDir, CLASS_FILE_NAME);

    FileReader fr = null;
    BufferedReader br = null;
    try
    {
      fr = new FileReader(classFile);
      br = new BufferedReader(fr);
      String packageId = br.readLine();
      String classIdStr = br.readLine();
      int classId = Integer.parseInt(classIdStr);

      return CDOModelUtil.createClassRef(packageId, classId);
    }
    catch (IOException e)
    {
      throw new RuntimeException("Could not write to cdo class file: " + classFile.getAbsolutePath());
    }
    finally
    {
      FileStoreHelper.close(br);
      FileStoreHelper.close(fr);
    }
  }

  private void writeMetadataVersion(File revisionDir, int version)
  {
    FileStoreHelper.writeMetadataValue(revisionDir, VERSION_FILE_NAME, version, CDOType.INT);
  }

  private void writeMetadataCreated(File revisionDir, long created)
  {
    FileStoreHelper.writeMetadataValue(revisionDir, CREATED_FILE_NAME, created, CDOType.LONG);
  }

  private void writeMetadataContainingFeature(File revisionDir, int contId)
  {
    FileStoreHelper.writeMetadataValue(revisionDir, CONTAINING_FEATURE_FILE_NAME, contId, CDOType.INT);
  }

  private void writeMetadataContainer(File revisionDir, CDOID container)
  {
    FileStoreHelper.writeMetadataValue(revisionDir, CONTAINER_FILE_NAME, container, CDOType.OBJECT);
  }

  private void writeMetadataResource(File revisionDir, CDOID resource)
  {
    FileStoreHelper.writeMetadataValue(revisionDir, RESOURCE_FILE_NAME, resource, CDOType.OBJECT);
  }

  private void writeMetadata(File revisionDir, InternalCDORevision revision)
  {
    writeMetadataVersion(revisionDir, revision.getVersion());
    writeMetadataCreated(revisionDir, revision.getCreated());
    writeMetadataContainingFeature(revisionDir, revision.getContainingFeatureID());
    writeMetadataContainer(revisionDir, (CDOID)revision.getContainerID());
    writeMetadataResource(revisionDir, revision.getResourceID());
  }

  private void readMetadata(File revisionDir, InternalCDORevision revision)
  {
    revision.setVersion((Integer)FileStoreHelper.readMetadataValue(revisionDir, VERSION_FILE_NAME, CDOType.INT));
    revision.setCreated((Long)FileStoreHelper.readMetadataValue(revisionDir, CREATED_FILE_NAME, CDOType.LONG));
    revision.setContainingFeatureID((Integer)FileStoreHelper.readMetadataValue(revisionDir,
        CONTAINING_FEATURE_FILE_NAME, CDOType.INT));
    revision.setContainerID(FileStoreHelper.readMetadataValue(revisionDir, CONTAINER_FILE_NAME, CDOType.OBJECT));
    revision.setResourceID((CDOID)FileStoreHelper.readMetadataValue(revisionDir, RESOURCE_FILE_NAME, CDOType.OBJECT));
  }

  public void writeSingleValue(File revisionDir, CDOFeature feature, Object value)
  {
    File featureFile = FileStoreHelper.getFeatureFile(revisionDir, feature);

    if (featureFile.exists() && value == null)
    {
      checkState(featureFile.delete(), "Feature file could not be deleted: " + featureFile.getAbsolutePath());
    }
    else
    {
      FileStoreHelper.writeValue(featureFile, value, feature.getType());
    }
  }

  private Object readSingleValue(File revisionDir, CDOFeature feature)
  {
    File featureFile = FileStoreHelper.getFeatureFile(revisionDir, feature);
    if (!featureFile.exists())
    {
      return null;
    }

    return FileStoreHelper.readValue(featureFile, feature.getType());
  }

  private void writeMultiValue(File revisionDir, CDOFeature feature, CDOList cdoList)
  {
    File featureDir = FileStoreHelper.getFeatureFile(revisionDir, feature);
    if (!featureDir.exists())
    {
      checkArg(featureDir.mkdir(), "Multi-Feature directory could not be created: " + featureDir.getAbsolutePath());
    }

    for (int i = 0; i < cdoList.size(); i++)
    {
      writeOneMultiValue(featureDir, i, cdoList.get(i), feature.getType());
    }
  }

  private void writeOneMultiValue(File featureDir, int index, Object value, CDOType type)
  {
    File valueFile = FileStoreHelper.getMultiValueFile(featureDir, index);
    FileStoreHelper.writeValue(valueFile, value, type);
  }

  private Object readOneMultiValue(File featureDir, int index, CDOType type)
  {
    File valueFile = FileStoreHelper.getMultiValueFileChecked(featureDir, index);
    return FileStoreHelper.readValue(valueFile, type);
  }

  private void readMultiValue(File revisionDir, CDOFeature feature, CDOList cdoList)
  {
    File featureDir = FileStoreHelper.getFeatureFileChecked(revisionDir, feature);
    int size = featureDir.list().length;

    // insert values into list in correct order
    for (int i = 0; i < size; i++)
    {
      Object value = readOneMultiValue(featureDir, i, feature.getType());
      cdoList.add(value);
    }
  }

  public CDORevision readRevisionByTime(CDOID id, int referenceChunk, long timeStamp)
  {
    throw new UnsupportedOperationException("Non-audit only. Sorry :-(");
  }

  public CDORevision readRevisionByVersion(CDOID id, int referenceChunk, int version)
  {
    throw new UnsupportedOperationException("Non-audit only. Sorry :-(");
  }

  public void refreshRevisions()
  {
  }

  public void queryResources(QueryResourcesContext context)
  {
    File packageDir = getStore().getPackageDir();
    String name = context.getName();
    boolean exact = context.exactMatch();
    CDOID folder = context.getFolderID();

    CDOResourcePackage resPkg = getStore().getRepository().getPackageManager().getCDOResourcePackage();
    CDOFeature nameFeature = resPkg.getCDOResourceNodeClass().getCDONameFeature();

    for (CDOClass resourceCls : resPkg.getClasses())
    {
      for (CDOID instanceId : FileStorePackageSerializer.allInstances(packageDir, resourceCls.createClassRef()))
      {
        CDORevision instance = getStore().getRepository().getRevisionManager().getRevision(instanceId,
            CDORevision.UNCHUNKED, true);

        CDOID instanceFolder = (CDOID)instance.data().getContainerID();
        if (CDOIDUtil.equals(instanceFolder, folder))
        {
          String instanceName = (String)instance.data().get(nameFeature, 0);
          boolean match = exact || instanceName == null || name == null ? ObjectUtil.equals(instanceName, name)
              : instanceName.startsWith(name);

          if (match)
          {
            if (!context.addResource(instanceId))
            {
              // No more results allowed
              return;
            }
          }
        }
      }
    }
  }

  public void executeQuery(CDOQueryInfo info, IQueryContext context)
  {
  }

  @Override
  public FileStore getStore()
  {
    return (FileStore)super.getStore();
  }
}
