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
 * This implementation is based on Prism.js (more information here: https://github.com/react-syntax-highlighter/react-syntax-highlighter?tab=readme-ov-file#prism)
 *
 * @author mlopezFC
 * @since 1.0.0
 */
@SuppressWarnings("serial")
@NpmPackage(value = "react-syntax-highlighter", version = "15.5.0")
@JsModule("./react-syntax-highlighter-prism.tsx")
@Tag("syntax-highlighter-prism")
public class SyntaxHighlighterPrism extends BaseSyntaxHighlighter {

  /**
   * Constructs a new SyntaxHighlighter for Java language with empty content
   */
  public SyntaxHighlighterPrism() {
    this(SHLanguagePrism.JAVA, "");
  }

  /**
   * Constructs a new SyntaxHighlighter with the specified language and content using a11yDark theme.
   *
   * @param language The programming language to highlight.
   * @param content The code content to highlight.
   */
  public SyntaxHighlighterPrism(SHLanguagePrism language, String content) {
    setSHStyle(SHStylePrism.A11YDARK);
    setSHLanguage(language);
    setContent(content);
    setShowLineNumbers(false);
    setWrapLines(false);
  }
  
  /**
   * Obtains the current SyntaxHighlighterPrism Language
   * @return
   */
  public SHLanguagePrism getSHLanguage() {
    return SHLanguagePrism.valueOf(getState("language", String.class).toUpperCase());
  }

  /**
   * Sets the SyntaxHighlighterPrism Language
   * @param language
   */
  public void setSHLanguage(SHLanguagePrism language) {
    setState("language", language.getName());
  }

  /**
   * Obtains the current SyntaxHighlighterPrism Style
   * @return
   */
  public SHStylePrism getSHStyle() {
    return SHStylePrism.valueOf(getState("stylename", String.class).toUpperCase());
  }

  /**
   * Sets the SyntaxHighlighter Style
   * @param style
   */
  public void setSHStyle(SHStylePrism style) {
    setState("stylename", style.getName());
  }
  
}
