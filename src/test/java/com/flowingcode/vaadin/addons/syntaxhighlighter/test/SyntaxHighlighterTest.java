package com.flowingcode.vaadin.addons.syntaxhighlighter.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.flowingcode.vaadin.addons.syntaxhighlighter.ShLanguage;
import com.flowingcode.vaadin.addons.syntaxhighlighter.SHStyle;
import com.flowingcode.vaadin.addons.syntaxhighlighter.SyntaxHighlighter;
import org.junit.Before;
import org.junit.Test;

public class SyntaxHighlighterTest {

  private SyntaxHighlighter syntaxHighlighter;

  @Before
  public void setUp() {
    syntaxHighlighter = new SyntaxHighlighter();
  }

  @Test
  public void testDefaultConstructor() {
    assertEquals(ShLanguage.JAVA, syntaxHighlighter.getSHLanguage());
    assertEquals(SHStyle.A11YDARK, syntaxHighlighter.getSHStyle());
    assertEquals("", syntaxHighlighter.getContent());
    assertFalse(syntaxHighlighter.isShowLineNumbers());
    assertFalse(syntaxHighlighter.isWrapLongLines());
  }

  @Test
  public void testParameterizedConstructor() {
    SyntaxHighlighter sh =
        new SyntaxHighlighter(ShLanguage.JAVASCRIPT, "test");
    assertEquals(ShLanguage.JAVASCRIPT, sh.getSHLanguage());
    assertEquals(SHStyle.A11YDARK, sh.getSHStyle());
    assertEquals("test", sh.getContent());
    assertFalse(sh.isShowLineNumbers());
    assertFalse(sh.isWrapLongLines());
  }

  @Test
  public void testSettersAndGetters() {
    syntaxHighlighter.setSHLanguage(ShLanguage.PYTHON);
    syntaxHighlighter.setSHStyle(SHStyle.A11YDARK);
    syntaxHighlighter.setContent("test content");
    syntaxHighlighter.setShowLineNumbers(true);
    syntaxHighlighter.setWrapLongLines(true);

    assertEquals(ShLanguage.PYTHON, syntaxHighlighter.getSHLanguage());
    assertEquals(SHStyle.A11YDARK, syntaxHighlighter.getSHStyle());
    assertEquals("test content", syntaxHighlighter.getContent());
    assertTrue(syntaxHighlighter.isShowLineNumbers());
    assertTrue(syntaxHighlighter.isWrapLongLines());
  }
}
