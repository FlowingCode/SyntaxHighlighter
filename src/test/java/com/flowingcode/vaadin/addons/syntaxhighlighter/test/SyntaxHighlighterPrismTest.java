package com.flowingcode.vaadin.addons.syntaxhighlighter.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.flowingcode.vaadin.addons.syntaxhighlighter.ShLanguagePrism;
import com.flowingcode.vaadin.addons.syntaxhighlighter.SHStylePrism;
import com.flowingcode.vaadin.addons.syntaxhighlighter.SyntaxHighlighterPrism;
import org.junit.Before;
import org.junit.Test;

public class SyntaxHighlighterPrismTest {

  private SyntaxHighlighterPrism syntaxHighlighter;

  @Before
  public void setUp() {
    syntaxHighlighter = new SyntaxHighlighterPrism();
  }

  @Test
  public void testDefaultConstructor() {
    assertEquals(ShLanguagePrism.JAVA, syntaxHighlighter.getShLanguage());
    assertEquals(SHStylePrism.A11YDARK, syntaxHighlighter.getSHStyle());
    assertEquals("", syntaxHighlighter.getContent());
    assertFalse(syntaxHighlighter.isShowLineNumbers());
    assertFalse(syntaxHighlighter.isWrapLongLines());
  }

  @Test
  public void testParameterizedConstructor() {
    SyntaxHighlighterPrism sh = new SyntaxHighlighterPrism(ShLanguagePrism.JAVASCRIPT,
        "test");
    assertEquals(ShLanguagePrism.JAVASCRIPT, sh.getShLanguage());
    assertEquals(SHStylePrism.A11YDARK, sh.getSHStyle());
    assertEquals("test", sh.getContent());
    assertFalse(sh.isShowLineNumbers());
    assertFalse(sh.isWrapLongLines());
  }

  @Test
  public void testSettersAndGetters() {
    syntaxHighlighter.setShLanguage(ShLanguagePrism.PYTHON);
    syntaxHighlighter.setSHStyle(SHStylePrism.A11YDARK);
    syntaxHighlighter.setContent("test content");
    syntaxHighlighter.setShowLineNumbers(true);
    syntaxHighlighter.setWrapLongLines(true);

    assertEquals(ShLanguagePrism.PYTHON, syntaxHighlighter.getShLanguage());
    assertEquals(SHStylePrism.A11YDARK, syntaxHighlighter.getSHStyle());
    assertEquals("test content", syntaxHighlighter.getContent());
    assertTrue(syntaxHighlighter.isShowLineNumbers());
    assertTrue(syntaxHighlighter.isWrapLongLines());
  }
}
