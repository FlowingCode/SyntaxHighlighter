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
 *
 * @author mlopezFC
 * @since 1.0.0
 */
public enum ShStyle {
  
  A11YDARK("a11yDark"),
  A11YLIGHT("a11yLight"),
  AGATE("agate"),
  ANOLDHOPE("anOldHope"),
  ANDROIDSTUDIO("androidstudio"),
  ARDUINOLIGHT("arduinoLight"),
  ARTA("arta"),
  ASCETIC("ascetic"),
  ATELIERCAVEDARK("atelierCaveDark"),
  ATELIERCAVELIGHT("atelierCaveLight"),
  ATELIERDUNEDARK("atelierDuneDark"),
  ATELIERDUNELIGHT("atelierDuneLight"),
  ATELIERESTUARYDARK("atelierEstuaryDark"),
  ATELIERESTUARYLIGHT("atelierEstuaryLight"),
  ATELIERFORESTDARK("atelierForestDark"),
  ATELIERFORESTLIGHT("atelierForestLight"),
  ATELIERHEATHDARK("atelierHeathDark"),
  ATELIERHEATHLIGHT("atelierHeathLight"),
  ATELIERLAKESIDEDARK("atelierLakesideDark"),
  ATELIERLAKESIDELIGHT("atelierLakesideLight"),
  ATELIERPLATEAUDARK("atelierPlateauDark"),
  ATELIERPLATEAULIGHT("atelierPlateauLight"),
  ATELIERSAVANNADARK("atelierSavannaDark"),
  ATELIERSAVANNALIGHT("atelierSavannaLight"),
  ATELIERSEASIDEDARK("atelierSeasideDark"),
  ATELIERSEASIDELIGHT("atelierSeasideLight"),
  ATELIERSULPHURPOOLDARK("atelierSulphurpoolDark"),
  ATELIERSULPHURPOOLLIGHT("atelierSulphurpoolLight"),
  ATOMONEDARKREASONABLE("atomOneDarkReasonable"),
  ATOMONEDARK("atomOneDark"),
  ATOMONELIGHT("atomOneLight"),
  BROWNPAPER("brownPaper"),
  CODEPENEMBED("codepenEmbed"),
  COLORBREWER("colorBrewer"),
  DARCULA("darcula"),
  DARK("dark"),
  DEFAULTSTYLE("defaultStyle"),
  DOCCO("docco"),
  DRACULA("dracula"),
  FAR("far"),
  FOUNDATION("foundation"),
  GITHUBGIST("githubGist"),
  GITHUB("github"),
  GML("gml"),
  GOOGLECODE("googlecode"),
  GRADIENTDARK("gradientDark"),
  GRADIENTLIGHT("gradientLight"),
  GRAYSCALE("grayscale"),
  GRUVBOXDARK("gruvboxDark"),
  GRUVBOXLIGHT("gruvboxLight"),
  HOPSCOTCH("hopscotch"),
  HYBRID("hybrid"),
  IDEA("idea"),
  IRBLACK("irBlack"),
  ISBLEDITORDARK("isblEditorDark"),
  ISBLEDITORLIGHT("isblEditorLight"),
  KIMBIEDARK("kimbieDark"),
  KIMBIELIGHT("kimbieLight"),
  LIGHTFAIR("lightfair"),
  LIOSHI("lioshi"),
  MAGULA("magula"),
  MONOBLUE("monoBlue"),
  MONOKAISUBLIME("monokaiSublime"),
  MONOKAI("monokai"),
  NIGHTOWL("nightOwl"),
  NNFXDARK("nnfxDark"),
  NNFX("nnfx"),
  NORD("nord"),
  OBSIDIAN("obsidian"),
  OCEAN("ocean"),
  PARAISODARK("paraisoDark"),
  PARAISOLIGHT("paraisoLight"),
  POJOAQUE("pojoaque"),
  PUREBASIC("purebasic"),
  QTCREATORDARK("qtcreatorDark"),
  QTCREATORLIGHT("qtcreatorLight"),
  RAILSCASTS("railscasts"),
  RAINBOW("rainbow"),
  ROUTEROS("routeros"),
  SCHOOLBOOK("schoolBook"),
  SHADESOFPURPLE("shadesOfPurple"),
  SOLARIZEDDARK("solarizedDark"),
  SOLARIZEDLIGHT("solarizedLight"),
  SRCERY("srcery"),
  STACKOVERFLOWDARK("stackoverflowDark"),
  STACKOVERFLOWLIGHT("stackoverflowLight"),
  SUNBURST("sunburst"),
  TOMORROWNIGHTBLUE("tomorrowNightBlue"),
  TOMORROWNIGHTBRIGHT("tomorrowNightBright"),
  TOMORROWNIGHTEIGHTIES("tomorrowNightEighties"),
  TOMORROWNIGHT("tomorrowNight"),
  TOMORROW("tomorrow"),
  VS("vs"),
  VS2015("vs2015"),
  XCODE("xcode"),
  XT256("xt256"),
  ZENBURN("zenburn");
  
  private final String name;
  
  private ShStyle(String style) {
    name = style;
  }

  public String getName() {
    return name;
  }
  
}
