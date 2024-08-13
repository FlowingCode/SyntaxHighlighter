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

/**
 * Enum representing different styles supported by the Syntax Highlighter.
 * Used only with Prism implementation
 *
 * @author mlopezFC
 * @since 1.0.0
 */
public enum ShStylePrism {
  
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
  
  private ShStylePrism(String style) {
    name = style;
  }

  public String getName() {
    return name;
  }
  
}
