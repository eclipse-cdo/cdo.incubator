package org.eclipse.net4j.internal.template.expressions;

import org.eclipse.net4j.internal.template.Template;
import org.eclipse.net4j.internal.template.TemplateProperty;

import java.util.Stack;

/**
 * @author Eike Stepper
 */
public class EvaluationContext
{
  private Template template;

  private Stack<String> stack = new Stack<String>();

  public EvaluationContext(Template template)
  {
    this.template = template;
  }

  public Template getTemplate()
  {
    return template;
  }

  public TemplateProperty resolve(String name)
  {
    checkCycle(name);
    TemplateProperty templateProperty = template.getTemplateProperty(name);
    if (templateProperty == null)
    {
      throw new IllegalStateException("Template property not found: " + name);
    }

    return templateProperty;
  }

  public void push(String name)
  {
    stack.push(name);
  }

  public void pop(String name)
  {
    String popped = stack.pop();
    if (!name.equals(popped))
    {
      throw new IllegalStateException("Evaluation stack is corrupt");
    }
  }

  private void checkCycle(String name)
  {
    if (stack.contains(name))
    {
      throw new IllegalStateException("Evaluation cycle detected: " + name);
    }
  }
}
