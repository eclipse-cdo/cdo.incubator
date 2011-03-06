package org.eclipse.emf.cdo.threedee.shell;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 * This is a quick hack to turn empty lines entered interactively on the command line into ';\n' empty lines for the
 * interpreter. It's just more pleasant to be able to hit return on an empty line and see the prompt reappear. This is
 * *not* used when text is sourced from a file non-interactively.
 */
public final class CommandLineReader extends FilterReader
{
  public CommandLineReader(Reader in)
  {
    super(in);
  }

  static final int normal = 0, lastCharNL = 1, sentSemi = 2;

  int state = lastCharNL;

  @Override
  public int read() throws IOException
  {
    int b;

    if (state == sentSemi)
    {
      state = lastCharNL;
      return '\n';
    }

    // skip CR
    while ((b = in.read()) == '\r')
    {
    }

    if (b == '\n')
    {
      if (state == lastCharNL)
      {
        b = ';';
        state = sentSemi;
      }
      else
      {
        state = lastCharNL;
      }
    }
    else
    {
      state = normal;
    }

    return b;
  }

  /**
   * This is a degenerate implementation. I don't know how to keep this from blocking if we try to read more than one
   * char... There is no available() for Readers ??
   */
  @Override
  public int read(char buff[], int off, int len) throws IOException
  {
    int b = read();
    if (b == -1)
    {
      return -1; // EOF, not zero read apparently
    }

    buff[off] = (char)b;
    return 1;
  }
}