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
@JsModule("./react-syntax-highlighter.tsx")
@Tag("syntax-highlighter")
public class SyntaxHighlighter extends ReactAdapterComponent implements HasSize {

  public SyntaxHighlighter() {
    this(SHLanguage.JAVA, null ,"a11yDark", false, false);
  }

  public SyntaxHighlighter(SHLanguage language, SHStyle style, String content, boolean showLineNumbers, boolean wrapLines) {
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

  public SHLanguage getSHLanguage() {
    return SHLanguage.valueOf(getState("language", String.class));
  }
  public void setSHLanguage(SHLanguage language) {
    setState("language", language.getName());
  }

  public SHStyle getSHStyle() {
    return SHStyle.valueOf(getState("style", String.class));
  }
  public void setSHStyle(SHStyle style) {
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
