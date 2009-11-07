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

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDMetaRange;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.model.CDOModelUtil;
import org.eclipse.emf.cdo.common.model.CDOPackageInfo;
import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.common.revision.CDORevision;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Stefan Winkler
 */
public class FileStorePackageSerializer
{
  private static final String NAME_NAME = "name";

  private static final String URI_NAME = "uri";

  private static final String DYNAMIC_NAME = "dynamic";

  private static final String META_ID_LOWER_BOUND_NAME = "metaIdRangeLowerBound";

  private static final String META_ID_SIZE_NAME = "metaIdRangeSize";

  private static final String PARENT_URI_NAME = "parentUri";

  private static final String CLASS_COUNT_NAME = "classCount";

  private static final String CLASSIFIER_ID_NAME = "classifierId";

  private static final String ABSTRACT_NAME = "abstract";

  private static final String FEATURE_ID_NAME = "featureId";

  private static final String TYPE_ID_NAME = "typeId";

  private static final String DEFAULT_VALUE_NAME = "defaultValue";

  private static final String MANY_NAME = "many";

  private static final String CONTAINMENT_NAME = "containment";

  private static final String REFTYPE_PACKAGE_NAME = "reftype$package";

  private static final String REFTYPE_CLASSID_NAME = "reftype$classId";

  private static final String SUPERTYPE_PACKAGE_NAME = "package";

  private static final String SUPERTYPE_CLASSID_NAME = "classId";

  private static final String ECORE_FILE_NAME = "ecore";

  private static final String REFERENCE_NAME = "reference";

  private static final String CLASS_INSTANCE_DIR_NAME = "instances";

  private static final String SUPERTYPE_DIR_NAME = "superTypes";

  private static final String FEATURE_DIR_NAME = "features";

  private FileStorePackageSerializer()
  {
  }

  public static void writePackage(File baseDir, InternalCDOPackage cdoPackage)
  {
    if (cdoPackage instanceof CDOResourcePackage)
    {
      return;
    }

    if (cdoPackage instanceof CDOCorePackage)
    {
      return;
    }

    File packageDir = new File(baseDir, FileStoreHelper.demangleName(cdoPackage.getPackageURI()));
    FileStoreHelper.mkdir(packageDir);

    FileStoreHelper.writeMetadataValue(packageDir, NAME_NAME, cdoPackage.getName(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(packageDir, URI_NAME, cdoPackage.getPackageURI(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(packageDir, DYNAMIC_NAME, cdoPackage.isDynamic(), CDOType.BOOLEAN);
    CDOIDMetaRange range = cdoPackage.getMetaIDRange();
    FileStoreHelper.writeMetadataValue(packageDir, META_ID_LOWER_BOUND_NAME, CDOIDUtil.getLong(range.getLowerBound()),
        CDOType.LONG);
    FileStoreHelper.writeMetadataValue(packageDir, META_ID_SIZE_NAME, range.size(), CDOType.INT);
    FileStoreHelper.writeMetadataValue(packageDir, PARENT_URI_NAME, cdoPackage.getParentURI(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(packageDir, CLASS_COUNT_NAME, cdoPackage.getClassCount(), CDOType.INT);
    FileStoreHelper.writeMetadataValue(packageDir, ECORE_FILE_NAME, cdoPackage.getEcore(), CDOType.STRING);

    for (CDOClass clazz : cdoPackage.getClasses())
    {
      writeClass(packageDir, (InternalCDOClass)clazz);
    }
  }

  public static Collection<CDOPackageInfo> readPackageInfos(File baseDir)
  {
    ArrayList<CDOPackageInfo> result = new ArrayList<CDOPackageInfo>();

    File[] pkgDirs = baseDir.listFiles();

    for (File pkgDir : pkgDirs)
    {
      if (!pkgDir.getName().equals(FileStoreHelper.demangleName(CDOResourcePackage.PACKAGE_URI))
          && !pkgDir.getName().equals(FileStoreHelper.demangleName(CDOCorePackage.PACKAGE_URI)))
      {
        result.add(readPackageInfo(pkgDir));
      }
    }

    return result;
  }

  public static CDOPackageInfo readPackageInfo(File packageDir)
  {
    String uri = (String)FileStoreHelper.readMetadataValue(packageDir, URI_NAME, CDOType.STRING);
    boolean dynamic = (Boolean)FileStoreHelper.readMetadataValue(packageDir, DYNAMIC_NAME, CDOType.BOOLEAN);
    String parentUri = (String)FileStoreHelper.readMetadataValue(packageDir, PARENT_URI_NAME, CDOType.STRING);
    CDOID lowerBound = CDOIDUtil.createMeta((Long)FileStoreHelper.readMetadataValue(packageDir,
        META_ID_LOWER_BOUND_NAME, CDOType.LONG));
    int metaSize = (Integer)FileStoreHelper.readMetadataValue(packageDir, META_ID_SIZE_NAME, CDOType.INT);

    return new CDOPackageInfo(uri, dynamic, CDOIDUtil.createMetaRange(lowerBound, metaSize), parentUri);
  }

  public static void readPackage(File baseDir, InternalCDOPackage cdoPackage)
  {
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(cdoPackage.getPackageURI()));
    FileStoreHelper.checkExists(packageDir);

    cdoPackage.setName((String)FileStoreHelper.readMetadataValue(packageDir, NAME_NAME, CDOType.STRING));

    readClassesAndAdd(packageDir, cdoPackage);
  }

  public static void readPackageEcore(File baseDir, InternalCDOPackage cdoPackage)
  {
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(cdoPackage.getPackageURI()));
    FileStoreHelper.checkExists(packageDir);

    cdoPackage.setEcore((String)FileStoreHelper.readMetadataValue(packageDir, ECORE_FILE_NAME, CDOType.STRING));
  }

  private static void readClassesAndAdd(File baseDir, InternalCDOPackage cdoPackage)
  {
    int count = (Integer)FileStoreHelper.readMetadataValue(baseDir, CLASS_COUNT_NAME, CDOType.INT);

    for (int index = 0; index < count; index++)
    {
      File classDir = new File(baseDir, Integer.toString(index));
      FileStoreHelper.checkExists(classDir);
      cdoPackage.addClass(readClass(classDir, cdoPackage));
    }
  }

  private static CDOClass readClass(File classDir, InternalCDOPackage containingPackage)
  {
    String name = (String)FileStoreHelper.readMetadataValue(classDir, NAME_NAME, CDOType.STRING);
    int classifierID = (Integer)FileStoreHelper.readMetadataValue(classDir, CLASSIFIER_ID_NAME, CDOType.INT);
    boolean isAbstract = (Boolean)FileStoreHelper.readMetadataValue(classDir, ABSTRACT_NAME, CDOType.BOOLEAN);
    CDOClass result = CDOModelUtil.createClass(containingPackage, classifierID, name, isAbstract);

    File supertypeDir = new File(classDir, SUPERTYPE_DIR_NAME);
    File featuresDir = new File(classDir, FEATURE_DIR_NAME);

    readSupertypesAndAdd(supertypeDir, (InternalCDOClass)result);
    readFeaturesAndAdd(featuresDir, (InternalCDOClass)result);
    return result;
  }

  private static void readFeaturesAndAdd(File baseDir, InternalCDOClass cdoClass)
  {
    for (File featureDir : baseDir.listFiles())
    {
      cdoClass.addFeature(readFeature(featureDir, cdoClass));
    }
  }

  private static CDOFeature readFeature(File featureDir, CDOClass containingClass)
  {
    String name = (String)FileStoreHelper.readMetadataValue(featureDir, NAME_NAME, CDOType.STRING);
    int id = (Integer)FileStoreHelper.readMetadataValue(featureDir, FEATURE_ID_NAME, CDOType.INT);
    int typeId = (Integer)FileStoreHelper.readMetadataValue(featureDir, TYPE_ID_NAME, CDOType.INT);
    CDOType type = CDOModelUtil.getType(typeId);

    Object defaultValue = null;
    File defaultValueFile = FileStoreHelper.getMetadataFile(featureDir, DEFAULT_VALUE_NAME);
    if (defaultValueFile.exists())
    {
      defaultValue = FileStoreHelper.readValue(defaultValueFile, type);
    }

    boolean isMany = (Boolean)FileStoreHelper.readMetadataValue(featureDir, MANY_NAME, CDOType.BOOLEAN);
    boolean isContainment = (Boolean)FileStoreHelper.readMetadataValue(featureDir, CONTAINMENT_NAME, CDOType.BOOLEAN);
    boolean isReference = (Boolean)FileStoreHelper.readMetadataValue(featureDir, REFERENCE_NAME, CDOType.BOOLEAN);

    if (isReference)
    {
      String classRefUri = (String)FileStoreHelper.readMetadataValue(featureDir, REFTYPE_PACKAGE_NAME, CDOType.STRING);
      int classRefID = (Integer)FileStoreHelper.readMetadataValue(featureDir, REFTYPE_CLASSID_NAME, CDOType.INT);
      CDOClassRef cref = CDOModelUtil.createClassRef(classRefUri, classRefID);

      return CDOModelUtil.createReference(containingClass, id, name, new CDOClassProxy(cref, containingClass
          .getPackageManager()), isMany, isContainment);
    }
    else
    {
      return CDOModelUtil.createAttribute(containingClass, id, name, type, defaultValue, isMany);
    }
  }

  private static void readSupertypesAndAdd(File baseDir, InternalCDOClass cdoClass)
  {
    for (File supertypeDir : baseDir.listFiles())
    {
      cdoClass.addSuperType(readSuperType(supertypeDir));
    }
  }

  private static CDOClassRef readSuperType(File supertypeDir)
  {
    String packageUri = (String)FileStoreHelper.readMetadataValue(supertypeDir, SUPERTYPE_PACKAGE_NAME, CDOType.STRING);
    int classID = (Integer)FileStoreHelper.readMetadataValue(supertypeDir, SUPERTYPE_CLASSID_NAME, CDOType.INT);
    CDOClassRef cref = CDOModelUtil.createClassRef(packageUri, classID);
    return cref;
  }

  private static void writeClass(File baseDir, InternalCDOClass clazz)
  {
    File classDir = new File(baseDir, Integer.toString(clazz.getClassifierID()));
    FileStoreHelper.mkdir(classDir);

    FileStoreHelper.writeMetadataValue(classDir, NAME_NAME, clazz.getName(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(classDir, CLASSIFIER_ID_NAME, clazz.getClassifierID(), CDOType.INT);
    FileStoreHelper.writeMetadataValue(classDir, ABSTRACT_NAME, clazz.isAbstract(), CDOType.BOOLEAN);

    File supertypeDir = new File(classDir, SUPERTYPE_DIR_NAME);
    FileStoreHelper.mkdir(supertypeDir);

    for (int index = 0; index < clazz.getSuperTypeCount(); index++)
    {
      writeSuperType(supertypeDir, index, clazz.getSuperType(index));
    }

    File featureDir = new File(classDir, FEATURE_DIR_NAME);
    FileStoreHelper.mkdir(featureDir);

    for (CDOFeature feature : clazz.getFeatures())
    {
      writeFeature(featureDir, (InternalCDOFeature)feature);
    }

    File instanceDir = new File(classDir, CLASS_INSTANCE_DIR_NAME);
    FileStoreHelper.mkdir(instanceDir);
  }

  private static void writeFeature(File baseDir, InternalCDOFeature feature)
  {
    File featureDir = new File(baseDir, Integer.toString(feature.getFeatureID()));
    FileStoreHelper.mkdir(featureDir);

    FileStoreHelper.writeMetadataValue(featureDir, NAME_NAME, feature.getName(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(featureDir, FEATURE_ID_NAME, feature.getFeatureID(), CDOType.INT);
    FileStoreHelper.writeMetadataValue(featureDir, TYPE_ID_NAME, feature.getType().getTypeID(), CDOType.INT);

    if (feature.getDefaultValue() != null)
    {
      FileStoreHelper.writeMetadataValue(featureDir, DEFAULT_VALUE_NAME, feature.getDefaultValue(), feature.getType());
    }

    FileStoreHelper.writeMetadataValue(featureDir, MANY_NAME, feature.isMany(), CDOType.BOOLEAN);
    FileStoreHelper.writeMetadataValue(featureDir, CONTAINMENT_NAME, feature.isContainment(), CDOType.BOOLEAN);
    FileStoreHelper.writeMetadataValue(featureDir, REFERENCE_NAME, feature.isReference(), CDOType.BOOLEAN);

    if (feature.isReference())
    {
      CDOClassProxy reference = feature.getReferenceTypeProxy();
      String packageURI = reference == null ? null : reference.getPackageURI();
      int classifierID = reference == null ? 0 : reference.getClassifierID();

      FileStoreHelper.writeMetadataValue(featureDir, REFTYPE_PACKAGE_NAME, packageURI, CDOType.STRING);
      FileStoreHelper.writeMetadataValue(featureDir, REFTYPE_CLASSID_NAME, classifierID, CDOType.INT);
    }
  }

  private static void writeSuperType(File baseDir, int index, CDOClass cdoClass)
  {
    File superTypeDir = new File(baseDir, Integer.toString(index));
    FileStoreHelper.mkdir(superTypeDir);

    FileStoreHelper.writeMetadataValue(superTypeDir, SUPERTYPE_PACKAGE_NAME, cdoClass.getContainingPackage()
        .getPackageURI(), CDOType.STRING);
    FileStoreHelper.writeMetadataValue(superTypeDir, SUPERTYPE_CLASSID_NAME, cdoClass.getClassifierID(), CDOType.INT);
  }

  public static void prepareResourcePackage(File baseDir, CDOResourcePackage pkg)
  {
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(pkg.getPackageURI()));
    FileStoreHelper.mkdir(packageDir);

    for (CDOClass clazz : pkg.getClasses())
    {
      File classDir = new File(packageDir, Integer.toString(clazz.getClassifierID()));
      FileStoreHelper.mkdir(classDir);
      File instanceDir = new File(classDir, CLASS_INSTANCE_DIR_NAME);
      FileStoreHelper.mkdir(instanceDir);
    }
  }

  public static void registerInstance(File baseDir, CDORevision cdoRevision)
  {
    CDOClass cdoClass = cdoRevision.getCDOClass();
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(cdoClass.getContainingPackage().getPackageURI()));
    File classDir = new File(packageDir, Integer.toString(cdoClass.getClassifierID()));
    File instanceDir = new File(classDir, CLASS_INSTANCE_DIR_NAME);
    File instanceFile = new File(instanceDir, Long.toString(CDOIDUtil.getLong(cdoRevision.getID())));
    FileStoreHelper.createFile(instanceFile);
  }

  public static void deregisterInstance(File baseDir, CDOClassRef classRef, CDOID id)
  {
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(classRef.getPackageURI()));
    File classDir = new File(packageDir, Integer.toString(classRef.getClassifierID()));
    File instanceDir = new File(classDir, CLASS_INSTANCE_DIR_NAME);
    File instanceFile = new File(instanceDir, Long.toString(CDOIDUtil.getLong(id)));
    FileStoreHelper.deleteFile(instanceFile);
  }

  public static Collection<CDOID> allInstances(File baseDir, CDOClassRef classRef)
  {
    File packageDir = new File(baseDir, FileStoreHelper.demangleName(classRef.getPackageURI()));
    File classDir = new File(packageDir, Integer.toString(classRef.getClassifierID()));
    File instanceDir = new File(classDir, CLASS_INSTANCE_DIR_NAME);

    ArrayList<CDOID> result = new ArrayList<CDOID>();
    for (String idStr : instanceDir.list())
    {
      result.add(CDOIDUtil.createLong(Long.valueOf(idStr)));
    }
    return result;
  }
}
