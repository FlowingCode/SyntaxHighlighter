package com.flowingcode.vaadin.addons.syntaxhighlighter;

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.react.ReactAdapterComponent;

/**
 * Base class for SyntaxHighlighters
 */
@SuppressWarnings("serial")
public class BaseSyntaxHighlighter extends ReactAdapterComponent implements HasSize {
  
  /**
   * Returns true if the wrapLines feature is enabled
   * More info: https://github.com/react-syntax-highlighter/react-syntax-highlighter?tab=readme-ov-file#props
   * @return true if the wrapLines feature is enabled
   */
  public boolean isWrapLines() {
    return getState("wrapLongLines", Boolean.class);
  }

  /**
   * Enable or disable the wrapLines feature
   * @param wrapLines boolean to enable or disable the wrapLines feature
   */
  public void setWrapLines(boolean wrapLines) {
    setState("wrapLongLines", wrapLines);
  }

  /**
   * Returns true if the showLineNumbers feature is enabled
   * More info: https://github.com/react-syntax-highlighter/react-syntax-highlighter?tab=readme-ov-file#props
   * @return true if the showLineNumbers feature is enabled
   */
  public boolean isShowLineNumbers() {
    return getState("showLineNumbers", Boolean.class);
  }

  /**
   * Enable or disable the showLineNumbers feature
   * @param showLineNumbers boolean to enable or disable the showLineNumbers feature
   */
  public void setShowLineNumbers(boolean showLineNumbers) {
    setState("showLineNumbers", showLineNumbers);
  }

  /**
   * Returns the content of the Syntax Highlighter 
   * @return string with the contents
   */
  public String getContent() {
    return getState("content", String.class);
  }

  /**
   * Sets the content of the Syntax Highlighter
   * @param content
   */
  public void setContent(String content) {
    setState("content", content);
  }

  /**
   * Sets the width of the Syntax Highlighter
   */
  @Override
  public void setWidth(String width) {
    getElement().executeJs("this.style.width = $0;", width);
  }

  /**
   * Obtains the width of the Syntax Highlighter
   */
  public void setHeight(String height) {
    getElement().executeJs("this.style.height = $0;", height);
  }

}
