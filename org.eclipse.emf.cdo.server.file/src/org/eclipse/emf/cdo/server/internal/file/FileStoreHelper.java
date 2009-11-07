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
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.server.internal.file.bundle.OM;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;

import org.eclipse.net4j.util.ImplementationError;
import org.eclipse.net4j.util.io.DataInputExtender;
import org.eclipse.net4j.util.io.DataOutputExtender;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;

/**
 * @author Stefan Winkler
 */
public class FileStoreHelper
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, FileStoreHelper.class);

  private static final String NEWLINE = System.getProperty("line.separator");

  private FileStoreHelper()
  {
  }

  private static final String INVALID_CHARS = "[/\\\"':;*?.<>|]+";

  public static String demangleName(String s)
  {
    return s.replaceAll(INVALID_CHARS, "_");
  }

  public static void close(InputStream s)
  {
    if (s == null)
    {
      return;
    }

    try
    {
      s.close();
    }
    catch (IOException e)
    {
      //
    }
  }

  public static void close(OutputStream s)
  {
    if (s == null)
    {
      return;
    }

    try
    {
      s.close();
    }
    catch (IOException e)
    {
      //
    }
  }

  public static void close(Writer s)
  {
    if (s == null)
    {
      return;
    }

    try
    {
      s.close();
    }
    catch (IOException e)
    {
      //
    }
  }

  public static void close(Reader s)
  {
    if (s == null)
    {
      return;
    }

    try
    {
      s.close();
    }
    catch (IOException e)
    {
      //
    }
  }

  private static String getDirnameFor(CDOID id)
  {
    return Long.toString(CDOIDUtil.getLong(id));
  }

  public static void recursiveDelete(File fileToDelete)
  {
    if (fileToDelete.isDirectory())
    {
      for (File file : fileToDelete.listFiles())
      {
        recursiveDelete(file);
      }
    }
    if (TRACER.isEnabled())
    {
      TRACER.format("Deleting {0} ...", fileToDelete.getAbsolutePath());
    }
    if (!fileToDelete.delete())
    {
      throw new RuntimeException("Could not delete file or directory: " + fileToDelete.getAbsolutePath());
    }
  }

  public static File getFeatureFileChecked(File revisionDir, CDOFeature feature)
  {
    File result = getFeatureFile(revisionDir, feature);
    if (!result.exists())
    {
      throw new RuntimeException("Feature file or directory does not exist: " + result.getAbsolutePath());
    }
    if (feature.isMany() && !result.isDirectory())
    {
      throw new RuntimeException("Feature file should be directory: " + result.getAbsolutePath());
    }
    if (!feature.isMany() && result.isDirectory())
    {
      throw new RuntimeException("Feature directory should be file: " + result.getAbsolutePath());
    }
    return result;
  }

  public static File getFeatureFile(File revisionDir, CDOFeature feature)
  {
    return new File(revisionDir, feature.getName());
  }

  public static File getRevisionDirChecked(File revisionBaseDir, CDOID id)
  {
    File result = getRevisionDir(revisionBaseDir, id);
    if (!result.exists() && !result.isDirectory())
    {
      throw new RuntimeException("Revision directory does not exist: " + result.getAbsolutePath());
    }

    return result;
  }

  public static File getRevisionDir(File revisionBaseDir, CDOID id)
  {
    return new File(revisionBaseDir, getDirnameFor(id));
  }

  public static File getMetadataFile(File baseDir, String name)
  {
    return new File(baseDir, name);
  }

  public static File getMetadataFileChecked(File revisionDir, String name)
  {
    File result = getMetadataFile(revisionDir, name);
    if (!result.exists())
    {
      throw new RuntimeException("Metadata file does not exist: " + result.getAbsolutePath());
    }

    return result;
  }

  public static File getMultiValueFileChecked(File featureDir, int index)
  {
    File result = getMultiValueFile(featureDir, index);

    if (!result.exists())
    {
      throw new RuntimeException("Value file in collection does not exist: " + result.getAbsolutePath());
    }

    return result;
  }

  public static File getMultiValueFile(File featureDir, int index)
  {
    return new File(featureDir, Integer.toString(index));
  }

  public static void rename(File from, File to)
  {
    if (!from.renameTo(to))
    {
      throw new IllegalStateException("could not rename " + from.getAbsolutePath() + " to " + to.getAbsolutePath());
    }
  }

  public static Object readValue(File featureFile, CDOType type)
  {
    if (type == CDOType.BYTE_ARRAY)
    {
      FileInputStream fis = null;
      DataInputStream dis = null;
      try
      {
        fis = new FileInputStream(featureFile);
        dis = new DataInputStream(fis);
        DataInputExtender die = new DataInputExtender(dis);

        boolean isNull = die.readBoolean();
        if (isNull)
        {
          if (TRACER.isEnabled())
          {
            TRACER.format("Read {0}: value NIL ...", featureFile.getAbsolutePath());
          }

          return InternalCDORevision.NIL;
        }
        else
        {
          byte[] result = die.readByteArray();
          if (TRACER.isEnabled())
          {
            TRACER.format("Read {0}: array of {1} bytes ...", featureFile.getAbsolutePath(), result.length);
          }
          return result;
        }
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not read: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(dis);
        close(fis);
      }
    }
    else if (type == CDOType.FEATURE_MAP_ENTRY)
    {
      FileReader fr = null;
      BufferedReader bir = null;
      try
      {
        fr = new FileReader(featureFile);
        bir = new BufferedReader(fr);
        if (!bir.ready())
        {
          if (TRACER.isEnabled())
          {
            TRACER.format("Read {0}: value NIL ...", featureFile.getAbsolutePath());
          }
          return InternalCDORevision.NIL;
        }
        String uri = bir.readLine();
        String val = bir.readLine();

        if (TRACER.isEnabled())
        {
          TRACER.format("Read {0}: featureMap entry <{1},{2}> ...", featureFile.getAbsolutePath(), uri, val);
        }
        return new CDOFeatureMapEntryDataTypeImpl(uri, val);
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not read: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(bir);
        close(fr);
      }
    }
    else
    {
      FileReader fr = null;
      BufferedReader bir = null;
      String val = null;
      try
      {
        fr = new FileReader(featureFile);
        bir = new BufferedReader(fr);
        if (!bir.ready())
        {
          if (TRACER.isEnabled())
          {
            TRACER.format("Read {0}: value NIL ...", featureFile.getAbsolutePath());
          }
          return InternalCDORevision.NIL;
        }

        StringBuilder value = new StringBuilder();
        value.append(bir.readLine());

        while (bir.ready())
        {
          value.append(NEWLINE);
          value.append(bir.readLine());
        }
        val = value.toString();
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not read: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(bir);
        close(fr);
      }
      if (TRACER.isEnabled())
      {
        TRACER.format("Read {0}: value {1} ...", featureFile.getAbsolutePath(), val);
      }

      if (type == CDOType.DATE)
      {
        return new Date(Long.parseLong(val));
      }
      else if (type == CDOType.BOOLEAN || type == CDOType.BOOLEAN_OBJECT)
      {
        return Boolean.valueOf(val);
      }
      else if (type == CDOType.BYTE || type == CDOType.BYTE_OBJECT)
      {
        return Byte.valueOf(val);
      }
      else if (type == CDOType.CHAR || type == CDOType.CHARACTER_OBJECT)
      {
        return val.charAt(0);
      }
      else if (type == CDOType.DOUBLE || type == CDOType.DOUBLE_OBJECT)
      {
        return Double.valueOf(val);
      }
      else if (type == CDOType.FLOAT || type == CDOType.FLOAT_OBJECT)
      {
        return Float.valueOf(val);
      }
      else if (type == CDOType.INT || type == CDOType.INTEGER_OBJECT)
      {
        return Integer.valueOf(val);
      }
      else if (type == CDOType.LONG || type == CDOType.LONG_OBJECT)
      {
        return Long.valueOf(val);
      }
      else if (type == CDOType.SHORT || type == CDOType.SHORT_OBJECT)
      {
        return Long.valueOf(val);
      }
      else if (type == CDOType.STRING || type == CDOType.CUSTOM)
      {
        return val;
      }
      else if (type == CDOType.OBJECT)
      {
        return CDOIDUtil.createLong(Long.valueOf(val));
      }
      else
      {
        throw new ImplementationError("Unimplemented type: " + type);
      }
    }
  }

  public static void writeValue(File featureFile, Object value, CDOType type)
  {
    if (TRACER.isEnabled())
    {
      TRACER.format("Writing {0}: value {1} ...", featureFile.getAbsolutePath(), value);
    }

    if (type == CDOType.OBJECT)
    {
      writeValue(featureFile, CDOIDUtil.getLong((CDOID)value), CDOType.LONG);
    }
    else if (type == CDOType.DATE)
    {
      writeValue(featureFile, ((Date)value).getTime(), CDOType.LONG);
    }
    else if (type == CDOType.BYTE_ARRAY)
    {
      FileOutputStream fos = null;
      DataOutputStream dos = null;
      try
      {
        fos = new FileOutputStream(featureFile);
        dos = new DataOutputStream(fos);
        DataOutputExtender doe = new DataOutputExtender(dos);

        if (value == null)
        {
          doe.writeBoolean(false);
        }
        else
        {
          doe.writeBoolean(true);
          doe.writeByteArray((byte[])value);
        }
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not write: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(dos);
        close(fos);
      }
    }
    else if (type == CDOType.BOOLEAN || type == CDOType.BOOLEAN_OBJECT || type == CDOType.BYTE
        || type == CDOType.BYTE_OBJECT || type == CDOType.CHAR || type == CDOType.CHARACTER_OBJECT
        || type == CDOType.DOUBLE || type == CDOType.DOUBLE_OBJECT || type == CDOType.FLOAT
        || type == CDOType.FLOAT_OBJECT || type == CDOType.INT || type == CDOType.INTEGER_OBJECT
        || type == CDOType.LONG || type == CDOType.LONG_OBJECT || type == CDOType.SHORT || type == CDOType.SHORT_OBJECT
        || type == CDOType.STRING || type == CDOType.CUSTOM)
    {
      PrintWriter pw = null;
      try
      {
        pw = new PrintWriter(featureFile);
        if (value != null)
        {
          pw.println(value.toString());
        }
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not write: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(pw);
      }
    }
    else if (type == CDOType.FEATURE_MAP_ENTRY)
    {
      CDOFeatureMapEntryDataType fme = (CDOFeatureMapEntryDataType)value;
      PrintWriter pw = null;
      try
      {
        pw = new PrintWriter(featureFile);
        if (value != null)
        {
          pw.println(fme.getURI());
          pw.println(fme.getObject());
        }
      }
      catch (IOException e)
      {
        throw new RuntimeException("Could not write: " + featureFile.getAbsolutePath(), e);
      }
      finally
      {
        close(pw);
      }
    }
    else
    {
      throw new UnsupportedOperationException("unknown type: " + type);
    }
  }

  public static void writeMetadataValue(File baseDir, String name, Object value, CDOType type)
  {
    File dataFile = FileStoreHelper.getMetadataFile(baseDir, name);
    FileStoreHelper.writeValue(dataFile, value, type);
  }

  public static Object readMetadataValue(File baseDir, String name, CDOType type)
  {
    File dataFile = FileStoreHelper.getMetadataFileChecked(baseDir, name);

    Object result = FileStoreHelper.readValue(dataFile, type);
    if (result == InternalCDORevision.NIL)
    {
      return null;
    }
    else
    {
      return result;
    }
  }

  public static void mkdir(File dir)
  {
    if (!dir.mkdir())
    {
      throw new RuntimeException("Could not create directory: " + dir.getAbsolutePath());
    }
  }

  public static void checkExists(File dir)
  {
    if (!dir.exists() || !dir.isDirectory())
    {
      throw new RuntimeException("Directory does not exist: " + dir.getAbsolutePath());
    }
  }

  public static void createFile(File file)
  {
    try
    {
      if (!file.createNewFile())
      {
        throw new RuntimeException("Could not create file: " + file.getAbsolutePath());
      }
    }
    catch (IOException e)
    {
      throw new RuntimeException("Could not create file: " + file.getAbsolutePath(), e);
    }
  }

  public static void deleteFile(File file)
  {
    if (!file.delete())
    {
      throw new RuntimeException("Could not delete file: " + file.getAbsolutePath());
    }
  }

}
