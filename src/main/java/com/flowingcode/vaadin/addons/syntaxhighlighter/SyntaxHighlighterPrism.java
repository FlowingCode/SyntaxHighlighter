/*-
 * #%L
 * Template Add-on
 * %%
 * Copyright (C) 2023 Flowing Code
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

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.react.ReactAdapterComponent;

@SuppressWarnings("serial")
@NpmPackage(value = "react-syntax-highlighter", version = "15.5.0")
@JsModule("./react-syntax-highlighter-prism.tsx")
@Tag("syntax-highlighter-prism")
public class SyntaxHighlighterPrism extends ReactAdapterComponent implements HasSize {

  public SyntaxHighlighterPrism() {
    this(SHLanguagePrism.JAVA, null ,"a11yDark", false, false);
  }

  public SyntaxHighlighterPrism(SHLanguagePrism language, SHStylePrism style, String content, boolean showLineNumbers, boolean wrapLines) {
    setSHStyle(style);
    setSHLanguage(language);
    setContent(content);
    setShowLineNumbers(showLineNumbers);
    setWrapLines(wrapLines);
  }
  
  public boolean isWrapLines() {
    return getState("wrapLines", Boolean.class);
  }
  public void setWrapLines(boolean wrapLines) {
    setState("wrapLines", wrapLines);
  }

  public boolean isShowLineNumbers() {
    return getState("showLineNumbers", Boolean.class);
  }
  public void setShowLineNumbers(boolean showLineNumbers) {
    setState("showLineNumbers", showLineNumbers);
  }

  public SHLanguagePrism getSHLanguage() {
    return SHLanguagePrism.valueOf(getState("language", String.class));
  }
  public void setSHLanguage(SHLanguagePrism language) {
    setState("language", language.getName());
  }

  public SHStylePrism getSHStyle() {
    return SHStylePrism.valueOf(getState("style", String.class));
  }
  public void setSHStyle(SHStylePrism style) {
    setState("style", style.getName());
  }
  
  public String getContent() {
    return getState("content", String.class);
  }
  public void setContent(String content) {
    setState("content", content);
  }

  @Override
  public void setWidth(String width) {
    getElement().executeJs("this.style.width = $0;", width);
  }
  public void setHeight(String height) {
    getElement().executeJs("this.style.height = $0;", height);
  }

}
