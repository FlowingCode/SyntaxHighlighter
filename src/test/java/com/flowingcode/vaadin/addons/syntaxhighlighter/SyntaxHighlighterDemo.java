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
@PageTitle("Syntax Highlighter Add-on Demo")
@SuppressWarnings("serial")
@Route(value = "demo", layout = SyntaxHighlighterDemoView.class)
public class SyntaxHighlighterDemo extends VerticalLayout {

  public SyntaxHighlighterDemo() {
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
    SyntaxHighlighter sh = new SyntaxHighlighter(SHLanguage.JAVASCRIPT, SHStyle.A11YDARK, defaultValue, false, false);
    sh.setSizeFull();
    ComboBox<SHStyle> style = new ComboBox<>();
    style.setItems(SHStyle.values());
    style.addValueChangeListener(ev->{
      sh.setSHStyle(style.getValue());
    });
    style.setValue(SHStyle.IDEA);
    ComboBox<SHLanguage> languages = new ComboBox<>();
    languages.setItems(SHLanguage.values());
    languages.setItemLabelGenerator(language->language.getName());
    languages.setValue(SHLanguage.TYPESCRIPT);
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
