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
@Route(value = "demo-prism", layout = SyntaxHighlighterDemoView.class)
public class SyntaxHighlighterPrismDemo extends VerticalLayout {

  public SyntaxHighlighterPrismDemo() {
    String defaultValue = "import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';\n" + //
        "import { dark } from 'react-syntax-highlighter/dist/esm/styles/prism';\n" + //
        "const Component = () => {\n" + //
        "  const codeString = '(num) => num + 1';\n" + //
        "  return (\n" + //
        "    <SyntaxHighlighter language=\"javascript\" style={dark}>\n" + //
        "      {codeString}\n" + //
        "    </SyntaxHighlighter>\n" + //
        "  );\n" + //
        "};";
    SyntaxHighlighterPrism sh = new SyntaxHighlighterPrism(SHLanguagePrism.JAVASCRIPT, SHStylePrism.A11YDARK, defaultValue, false, false);
    sh.setSizeFull();
    ComboBox<SHStylePrism> style = new ComboBox<>();
    style.setItems(SHStylePrism.values());
    style.addValueChangeListener(ev->{
      sh.setSHStyle(style.getValue());
    });
    style.setValue(SHStylePrism.A11YDARK);
    ComboBox<SHLanguagePrism> languages = new ComboBox<>();
    languages.setItems(SHLanguagePrism.values());
    languages.setItemLabelGenerator(language->language.getName());
    languages.setValue(SHLanguagePrism.TYPESCRIPT);
    languages.addValueChangeListener(ev->{
      sh.setSHLanguage(ev.getValue());
    });
    Checkbox showLineNumbers = new Checkbox("Show Line Numbers");
    showLineNumbers.addValueChangeListener(ev->{
      sh.setShowLineNumbers(ev.getValue());
    });
    Checkbox wrapLines = new Checkbox("Wrap lines");
    wrapLines.addValueChangeListener(ev->{
      sh.setWrapLines(ev.getValue());
    });
    TextArea ta = new TextArea();
    ta.setValue(defaultValue);
    ta.setWidthFull();
    Button button = new Button("Update code");
    button.addClickListener(ev->{
      sh.setContent(ta.getValue());
    });
    add(new HorizontalLayout(style,languages), showLineNumbers, wrapLines, sh, ta, button);
  }
}
