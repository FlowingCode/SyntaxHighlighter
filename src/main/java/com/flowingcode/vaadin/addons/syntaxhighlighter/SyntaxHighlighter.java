/*-
 * #%L
 * Syntax Highlighter Add-on
 * %%
 * Copyright (C) 2024 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.vaadin.addons.syntaxhighlighter;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * A Vaadin component that wraps the react-syntax-highlighter library to provide syntax highlighting for code snippets.
 *
 * @author mlopezFC
 * @since 1.0.0
 */
@SuppressWarnings("serial")
@NpmPackage(value = "react-syntax-highlighter", version = "npm:@fengkx/react-syntax-highlighter@15.6.1")
@JsModule("./react-syntax-highlighter.tsx")
@Tag("syntax-highlighter")
public class SyntaxHighlighter extends BaseSyntaxHighlighter {

  /**
   * Constructs a new SyntaxHighlighter for Java language with empty content
   */
  public SyntaxHighlighter() {
    this(ShLanguage.JAVA, "");
  }

  /**
   * Constructs a new SyntaxHighlighter with the specified language and content using a11yDark theme.
   *
   * @param language The programming language to highlight.
   * @param content The code content to highlight.
   */
  public SyntaxHighlighter(ShLanguage language, String content) {
    setShStyle(ShStyle.A11YDARK);
    setShLanguage(language);
    setContent(content);
    setShowLineNumbers(false);
    setWrapLongLines(false);
  }
  
  /**
   * Obtains the current SyntaxHighlighter Language
   * @return current language
   */
  public ShLanguage getShLanguage() {
    return ShLanguage.valueOf(getState("language", String.class).toUpperCase());
  }

  /**
   * Sets the SyntaxHighlighter Language
   * @param language
   */
  public void setShLanguage(ShLanguage language) {
    setState("language", language.getName());
  }

  /**
   * Obtains the current SyntaxHighlighter Style
   * @return style
   */
  public ShStyle getShStyle() {
    return ShStyle.valueOf(getState("stylename", String.class).toUpperCase());
  }

  /**
   * Sets the SyntaxHighlighter Style
   * @param style
   */
  public void setShStyle(ShStyle style) {
    setState("stylename", style.getName());
  }

}
