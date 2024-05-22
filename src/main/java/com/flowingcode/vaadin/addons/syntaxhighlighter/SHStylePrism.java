package com.flowingcode.vaadin.addons.syntaxhighlighter;

public enum SHStylePrism {
  
  COY("coy"),
  DARK("dark"),
  FUNKY("funky"),
  OKAIDIA("okaidia"),
  SOLARIZEDLIGHT("solarizedlight"),
  TOMORROW("tomorrow"),
  TWILIGHT("twilight"),
  PRISM("prism"),
  A11YDARK("a11yDark"),
  ATOMDARK("atomDark"),
  BASE16ATELIERSULPHURPOOLLIGHT("base16AteliersulphurpoolLight"),
  CB("cb"),
  COLDARKCOLD("coldarkCold"),
  COLDARKDARK("coldarkDark"),
  COYWITHOUTSHADOWS("coyWithoutShadows"),
  DARCULA("darcula"),
  DRACULA("dracula"),
  DUOTONEDARK("duotoneDark"),
  DUOTONEEARTH("duotoneEarth"),
  DUOTONEFOREST("duotoneForest"),
  DUOTONELIGHT("duotoneLight"),
  DUOTONESEA("duotoneSea"),
  DUOTONESPACE("duotoneSpace"),
  GHCOLORS("ghcolors"),
  GRUVBOXDARK("gruvboxDark"),
  GRUVBOXLIGHT("gruvboxLight"),
  HOLITHEME("holiTheme"),
  HOPSCOTCH("hopscotch"),
  LUCARIO("lucario"),
  MATERIALDARK("materialDark"),
  MATERIALLIGHT("materialLight"),
  MATERIALOCEANIC("materialOceanic"),
  NIGHTOWL("nightOwl"),
  NORD("nord"),
  ONEDARK("oneDark"),
  ONELIGHT("oneLight"),
  POJOAQUE("pojoaque"),
  SHADESOFPURPLE("shadesOfPurple"),
  SOLARIZEDDARKATOM("solarizedDarkAtom"),
  SYNTHWAVE84("synthwave84"),
  VS("vs"),
  VSCDARKPLUS("vscDarkPlus"),
  XONOKAI("xonokai"),
  ZTOUCH("zTouch");
  
  private final String name;
  
  private SHStylePrism(String style) {
    name = style;
  }

  public String getName() {
    return name;
  }
  
}
