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
 * Enum representing different programming languages supported by Syntax Highlighter.
 *
 * @author mlopezFC
 * @since 1.0.0
 */
public enum ShLanguage {
  
  ONEC("oneC"),
  ABNF("abnf"),
  ACCESSLOG("accesslog"),
  ACTIONSCRIPT("actionscript"),
  ADA("ada"),
  ANGELSCRIPT("angelscript"),
  APACHE("apache"),
  APPLESCRIPT("applescript"),
  ARCADE("arcade"),
  ARDUINO("arduino"),
  ARMASM("armasm"),
  ASCIIDOC("asciidoc"),
  ASPECTJ("aspectj"),
  AUTOHOTKEY("autohotkey"),
  AUTOIT("autoit"),
  AVRASM("avrasm"),
  AWK("awk"),
  AXAPTA("axapta"),
  BASH("bash"),
  BASIC("basic"),
  BNF("bnf"),
  BRAINFUCK("brainfuck"),
  CLIKE("cLike"),
  C("c"),
  CAL("cal"),
  CAPNPROTO("capnproto"),
  CEYLON("ceylon"),
  CLEAN("clean"),
  CLOJUREREPL("clojureRepl"),
  CLOJURE("clojure"),
  CMAKE("cmake"),
  COFFEESCRIPT("coffeescript"),
  COQ("coq"),
  COS("cos"),
  CPP("cpp"),
  CRMSH("crmsh"),
  CRYSTAL("crystal"),
  CSHARP("csharp"),
  CSP("csp"),
  CSS("css"),
  D("d"),
  DART("dart"),
  DELPHI("delphi"),
  DIFF("diff"),
  DJANGO("django"),
  DNS("dns"),
  DOCKERFILE("dockerfile"),
  DOS("dos"),
  DSCONFIG("dsconfig"),
  DTS("dts"),
  DUST("dust"),
  EBNF("ebnf"),
  ELIXIR("elixir"),
  ELM("elm"),
  ERB("erb"),
  ERLANGREPL("erlangRepl"),
  ERLANG("erlang"),
  EXCEL("excel"),
  FIX("fix"),
  FLIX("flix"),
  FORTRAN("fortran"),
  FSHARP("fsharp"),
  GAMS("gams"),
  GAUSS("gauss"),
  GCODE("gcode"),
  GHERKIN("gherkin"),
  GLSL("glsl"),
  GML("gml"),
  GO("go"),
  GOLO("golo"),
  GRADLE("gradle"),
  GROOVY("groovy"),
  HAML("haml"),
  HANDLEBARS("handlebars"),
  HASKELL("haskell"),
  HAXE("haxe"),
  HSP("hsp"),
  HTMLBARS("htmlbars"),
  HTTP("http"),
  HY("hy"),
  INFORM7("inform7"),
  INI("ini"),
  IRPF90("irpf90"),
  ISBL("isbl"),
  JAVA("java"),
  JAVASCRIPT("javascript"),
  JBOSSCLI("jbossCli"),
  JSON("json"),
  JULIAREPL("juliaRepl"),
  JULIA("julia"),
  KOTLIN("kotlin"),
  LASSO("lasso"),
  LATEX("latex"),
  LDIF("ldif"),
  LEAF("leaf"),
  LESS("less"),
  LISP("lisp"),
  LIVECODESERVER("livecodeserver"),
  LIVESCRIPT("livescript"),
  LLVM("llvm"),
  LSL("lsl"),
  LUA("lua"),
  MAKEFILE("makefile"),
  MARKDOWN("markdown"),
  MATHEMATICA("mathematica"),
  MATLAB("matlab"),
  MAXIMA("maxima"),
  MEL("mel"),
  MERCURY("mercury"),
  MIPSASM("mipsasm"),
  MIZAR("mizar"),
  MOJOLICIOUS("mojolicious"),
  MONKEY("monkey"),
  MOONSCRIPT("moonscript"),
  N1QL("n1ql"),
  NGINX("nginx"),
  NIM("nim"),
  NIX("nix"),
  NODEREPL("nodeRepl"),
  NSIS("nsis"),
  OBJECTIVEC("objectivec"),
  OCAML("ocaml"),
  OPENSCAD("openscad"),
  OXYGENE("oxygene"),
  PARSER3("parser3"),
  PERL("perl"),
  PF("pf"),
  PGSQL("pgsql"),
  PHPTEMPLATE("phpTemplate"),
  PHP("php"),
  PLAINTEXT("plaintext"),
  PONY("pony"),
  POWERSHELL("powershell"),
  PROCESSING("processing"),
  PROFILE("profile"),
  PROLOG("prolog"),
  PROPERTIES("properties"),
  PROTOBUF("protobuf"),
  PUPPET("puppet"),
  PUREBASIC("purebasic"),
  PYTHONREPL("pythonRepl"),
  PYTHON("python"),
  Q("q"),
  QML("qml"),
  R("r"),
  REASONML("reasonml"),
  RIB("rib"),
  ROBOCONF("roboconf"),
  ROUTEROS("routeros"),
  RSL("rsl"),
  RUBY("ruby"),
  RULESLANGUAGE("ruleslanguage"),
  RUST("rust"),
  SAS("sas"),
  SCALA("scala"),
  SCHEME("scheme"),
  SCILAB("scilab"),
  SCSS("scss"),
  SHELL("shell"),
  SMALI("smali"),
  SMALLTALK("smalltalk"),
  SML("sml"),
  SQF("sqf"),
  SQL("sql"),
  SQLMORE("sqlMore"),
  STAN("stan"),
  STATA("stata"),
  STEP21("step21"),
  STYLUS("stylus"),
  SUBUNIT("subunit"),
  SWIFT("swift"),
  TAGGERSCRIPT("taggerscript"),
  TAP("tap"),
  TCL("tcl"),
  THRIFT("thrift"),
  TP("tp"),
  TWIG("twig"),
  TYPESCRIPT("typescript"),
  VALA("vala"),
  VBNET("vbnet"),
  VBSCRIPTHTML("vbscriptHtml"),
  VBSCRIPT("vbscript"),
  VERILOG("verilog"),
  VHDL("vhdl"),
  VIM("vim"),
  X86ASM("x86asm"),
  XL("xl"),
  XML("xml"),
  XQUERY("xquery"),
  YAML("yaml"),
  ZEPHIR("zephir");
  
  private final String name;
  
  private ShLanguage(String language) {
    name = language;
  }

  public String getName() {
    return name;
  }
  
}
