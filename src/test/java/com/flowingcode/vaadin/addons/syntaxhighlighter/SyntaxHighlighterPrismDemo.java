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

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Syntax Highlighter Add-on Demo (Prism)")
@SuppressWarnings("serial")
@Route(value = "syntax-highlighter/prism", layout = SyntaxHighlighterDemoView.class)
public class SyntaxHighlighterPrismDemo extends VerticalLayout {

  public SyntaxHighlighterPrismDemo() {
    String defaultValue = """
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { dark } from 'react-syntax-highlighter/dist/esm/styles/prism';
const Component = () => {
  const codeString = '(num) => num + 1';
  return (
    <SyntaxHighlighter language=\"javascript\" style={dark}>
      {codeString}
    </SyntaxHighlighter>
  );
};
    """;
    SyntaxHighlighterPrism sh = new SyntaxHighlighterPrism(ShLanguagePrism.JAVASCRIPT, defaultValue);
    sh.setSizeFull();
    ComboBox<ShStylePrism> style = new ComboBox<>();
    style.setItems(ShStylePrism.values());
    style.addValueChangeListener(ev->{
      sh.setShStyle(style.getValue());
    });
    style.setValue(ShStylePrism.A11YDARK);
    ComboBox<ShLanguagePrism> languages = new ComboBox<>();
    languages.setItems(ShLanguagePrism.values());
    languages.setItemLabelGenerator(language->language.getName());
    languages.setValue(ShLanguagePrism.TYPESCRIPT);
    languages.addValueChangeListener(ev->{
      sh.setShLanguage(ev.getValue());
    });
    Checkbox showLineNumbers = new Checkbox("Show Line Numbers");
    showLineNumbers.addValueChangeListener(ev->{
      sh.setShowLineNumbers(ev.getValue());
    });
    Checkbox wrapLongLines = new Checkbox("Wrap long lines");
    wrapLongLines.addValueChangeListener(ev->{
      sh.setWrapLongLines(ev.getValue());
    });
    TextArea ta = new TextArea();
    ta.setValue(defaultValue);
    ta.setWidthFull();
    Button button = new Button("Update code");
    button.addClickListener(ev->{
      sh.setContent(ta.getValue());
    });
    add(new HorizontalLayout(style,languages), showLineNumbers, wrapLongLines, sh, ta, button);
  }
}
