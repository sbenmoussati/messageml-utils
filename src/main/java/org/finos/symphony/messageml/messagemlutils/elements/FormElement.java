package org.finos.symphony.messageml.messagemlutils.elements;

import java.util.Collections;

import org.finos.symphony.messageml.messagemlutils.exceptions.InvalidInputException;

public class FormElement extends Element {
  public static final String INPUT_TAG = "input";
  public static final String TYPE_ATTR = "type";

  protected static final String NAME_ATTR = "name";

  public FormElement(Element parent, String messageMLTag) {
    super(parent, messageMLTag);
  }

  public FormElement(Element parent, String messageMLTag, FormatEnum format) {
    super(parent, messageMLTag, format);
  }

  @Override
  public void validate() throws InvalidInputException {
    super.validate();
    assertParentAtAnyLevel(Collections.singleton(Form.class));
  }
}
