package org.eclipse.net4j.provisioner;

public class ProvisionerException extends Exception
{
  private static final long serialVersionUID = 1L;

  public ProvisionerException()
  {
  }

  public ProvisionerException(String message)
  {
    super(message);
  }

  public ProvisionerException(Throwable cause)
  {
    super(cause);
  }

  public ProvisionerException(String message, Throwable cause)
  {
    super(message, cause);
  }
}
