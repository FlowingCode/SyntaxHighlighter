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
 * Enum representing different programming languages supported by the Syntax Highlighter.
 * Used only with Prism implementation
 *
 * @author mlopezFC
 * @since 1.0.0
 */
public enum SHLanguagePrism {
  
  ACTIONSCRIPT("actionscript"),
  ADA("ada"),
  AGDA("agda"),
  AL("al"),
  ANTLR4("antlr4"),
  APACHECONF("apacheconf"),
  APEX("apex"),
  APL("apl"),
  APPLESCRIPT("applescript"),
  AQL("aql"),
  ARDUINO("arduino"),
  ARFF("arff"),
  ASCIIDOC("asciidoc"),
  ASM6502("asm6502"),
  ASMATMEL("asmatmel"),
  ASPNET("aspnet"),
  AUTOHOTKEY("autohotkey"),
  AUTOIT("autoit"),
  AVISYNTH("avisynth"),
  AVROIDL("avroIdl"),
  BASH("bash"),
  BASIC("basic"),
  BATCH("batch"),
  BBCODE("bbcode"),
  BICEP("bicep"),
  BIRB("birb"),
  BISON("bison"),
  BNF("bnf"),
  BRAINFUCK("brainfuck"),
  BRIGHTSCRIPT("brightscript"),
  BRO("bro"),
  BSL("bsl"),
  C("c"),
  CFSCRIPT("cfscript"),
  CHAISCRIPT("chaiscript"),
  CIL("cil"),
  CLIKE("clike"),
  CLOJURE("clojure"),
  CMAKE("cmake"),
  COBOL("cobol"),
  COFFEESCRIPT("coffeescript"),
  CONCURNAS("concurnas"),
  COQ("coq"),
  CPP("cpp"),
  CRYSTAL("crystal"),
  CSHARP("csharp"),
  CSHTML("cshtml"),
  CSP("csp"),
  CSSEXTRAS("cssExtras"),
  CSS("css"),
  CSV("csv"),
  CYPHER("cypher"),
  D("d"),
  DART("dart"),
  DATAWEAVE("dataweave"),
  DAX("dax"),
  DHALL("dhall"),
  DIFF("diff"),
  DJANGO("django"),
  DNSZONEFILE("dnsZoneFile"),
  DOCKER("docker"),
  DOT("dot"),
  EBNF("ebnf"),
  EDITORCONFIG("editorconfig"),
  EIFFEL("eiffel"),
  EJS("ejs"),
  ELIXIR("elixir"),
  ELM("elm"),
  ERB("erb"),
  ERLANG("erlang"),
  ETLUA("etlua"),
  EXCELFORMULA("excelFormula"),
  FACTOR("factor"),
  FALSELANG("falselang"),
  FIRESTORESECURITYRULES("firestoreSecurityRules"),
  FLOW("flow"),
  FORTRAN("fortran"),
  FSHARP("fsharp"),
  FTL("ftl"),
  GAP("gap"),
  GCODE("gcode"),
  GDSCRIPT("gdscript"),
  GEDCOM("gedcom"),
  GHERKIN("gherkin"),
  GIT("git"),
  GLSL("glsl"),
  GML("gml"),
  GN("gn"),
  GOMODULE("goModule"),
  GO("go"),
  GRAPHQL("graphql"),
  GROOVY("groovy"),
  HAML("haml"),
  HANDLEBARS("handlebars"),
  HASKELL("haskell"),
  HAXE("haxe"),
  HCL("hcl"),
  HLSL("hlsl"),
  HOON("hoon"),
  HPKP("hpkp"),
  HSTS("hsts"),
  HTTP("http"),
  ICHIGOJAM("ichigojam"),
  ICON("icon"),
  ICUMESSAGEFORMAT("icuMessageFormat"),
  IDRIS("idris"),
  IECST("iecst"),
  IGNORE("ignore"),
  INFORM7("inform7"),
  INI("ini"),
  IO("io"),
  J("j"),
  JAVA("java"),
  JAVADOC("javadoc"),
  JAVADOCLIKE("javadoclike"),
  JAVASCRIPT("javascript"),
  JAVASTACKTRACE("javastacktrace"),
  JEXL("jexl"),
  JOLIE("jolie"),
  JQ("jq"),
  JSEXTRAS("jsExtras"),
  JSTEMPLATES("jsTemplates"),
  JSDOC("jsdoc"),
  JSON("json"),
  JSON5("json5"),
  JSONP("jsonp"),
  JSSTACKTRACE("jsstacktrace"),
  JSX("jsx"),
  JULIA("julia"),
  KEEPALIVED("keepalived"),
  KEYMAN("keyman"),
  KOTLIN("kotlin"),
  KUMIR("kumir"),
  KUSTO("kusto"),
  LATEX("latex"),
  LATTE("latte"),
  LESS("less"),
  LILYPOND("lilypond"),
  LIQUID("liquid"),
  LISP("lisp"),
  LIVESCRIPT("livescript"),
  LLVM("llvm"),
  LOG("log"),
  LOLCODE("lolcode"),
  LUA("lua"),
  MAGMA("magma"),
  MAKEFILE("makefile"),
  MARKDOWN("markdown"),
  MARKUPTEMPLATING("markupTemplating"),
  MARKUP("markup"),
  MATLAB("matlab"),
  MAXSCRIPT("maxscript"),
  MEL("mel"),
  MERMAID("mermaid"),
  MIZAR("mizar"),
  MONGODB("mongodb"),
  MONKEY("monkey"),
  MOONSCRIPT("moonscript"),
  N1QL("n1ql"),
  N4JS("n4js"),
  NAND2TETRISHDL("nand2tetrisHdl"),
  NANISCRIPT("naniscript"),
  NASM("nasm"),
  NEON("neon"),
  NEVOD("nevod"),
  NGINX("nginx"),
  NIM("nim"),
  NIX("nix"),
  NSIS("nsis"),
  OBJECTIVEC("objectivec"),
  OCAML("ocaml"),
  OPENCL("opencl"),
  OPENQASM("openqasm"),
  OZ("oz"),
  PARIGP("parigp"),
  PARSER("parser"),
  PASCAL("pascal"),
  PASCALIGO("pascaligo"),
  PCAXIS("pcaxis"),
  PEOPLECODE("peoplecode"),
  PERL("perl"),
  PHPEXTRAS("phpExtras"),
  PHP("php"),
  PHPDOC("phpdoc"),
  PLSQL("plsql"),
  POWERQUERY("powerquery"),
  POWERSHELL("powershell"),
  PROCESSING("processing"),
  PROLOG("prolog"),
  PROMQL("promql"),
  PROPERTIES("properties"),
  PROTOBUF("protobuf"),
  PSL("psl"),
  PUG("pug"),
  PUPPET("puppet"),
  PURE("pure"),
  PUREBASIC("purebasic"),
  PURESCRIPT("purescript"),
  PYTHON("python"),
  Q("q"),
  QML("qml"),
  QORE("qore"),
  QSHARP("qsharp"),
  R("r"),
  RACKET("racket"),
  REASON("reason"),
  REGEX("regex"),
  REGO("rego"),
  RENPY("renpy"),
  REST("rest"),
  RIP("rip"),
  ROBOCONF("roboconf"),
  ROBOTFRAMEWORK("robotframework"),
  RUBY("ruby"),
  RUST("rust"),
  SAS("sas"),
  SASS("sass"),
  SCALA("scala"),
  SCHEME("scheme"),
  SCSS("scss"),
  SHELLSESSION("shellSession"),
  SMALI("smali"),
  SMALLTALK("smalltalk"),
  SMARTY("smarty"),
  SML("sml"),
  SOLIDITY("solidity"),
  SOLUTIONFILE("solutionFile"),
  SOY("soy"),
  SPARQL("sparql"),
  SPLUNKSPL("splunkSpl"),
  SQF("sqf"),
  SQL("sql"),
  SQUIRREL("squirrel"),
  STAN("stan"),
  STYLUS("stylus"),
  SWIFT("swift"),
  SYSTEMD("systemd"),
  T4CS("t4Cs"),
  T4TEMPLATING("t4Templating"),
  T4VB("t4Vb"),
  TAP("tap"),
  TCL("tcl"),
  TEXTILE("textile"),
  TOML("toml"),
  TREMOR("tremor"),
  TSX("tsx"),
  TT2("tt2"),
  TURTLE("turtle"),
  TWIG("twig"),
  TYPESCRIPT("typescript"),
  TYPOSCRIPT("typoscript"),
  UNREALSCRIPT("unrealscript"),
  UORAZOR("uorazor"),
  URI("uri"),
  V("v"),
  VALA("vala"),
  VBNET("vbnet"),
  VELOCITY("velocity"),
  VERILOG("verilog"),
  VHDL("vhdl"),
  VIM("vim"),
  VISUALBASIC("visualBasic"),
  WARPSCRIPT("warpscript"),
  WASM("wasm"),
  WEBIDL("webIdl"),
  WIKI("wiki"),
  WOLFRAM("wolfram"),
  WREN("wren"),
  XEORA("xeora"),
  XMLDOC("xmlDoc"),
  XOJO("xojo"),
  XQUERY("xquery"),
  YAML("yaml"),
  YANG("yang"),
  ZIG("zig");
  
  private final String name;
  
  private SHLanguagePrism(String language) {
    name = language;
  }

  public String getName() {
    return name;
  }
  
}
