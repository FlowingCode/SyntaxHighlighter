[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/syntax-highlighter-add-on)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/syntax-highlighter-addon.svg)](https://vaadin.com/directory/component/syntax-highlighter-add-on)
[![Build Status](https://jenkins.flowingcode.com/job/syntax-highlighter-addon/badge/icon)](https://jenkins.flowingcode.com/job/syntax-highlighter-addon)
[![Maven Central](https://img.shields.io/maven-central/v/org.vaadin.addons.flowingcode/syntax-highlighter-addon)](https://mvnrepository.com/artifact/com.flowingcode.vaadin.addons/syntax-highlighter-addon)

# SyntaxHighlighter Add-on

This is a wrapper around the [React Syntax Highlighter](https://github.com/react-syntax-highlighter/react-syntax-highlighter) component

## Features

* Supports both hljs and prism modes
* Enums with styles and languages

## Online demo

[Online demo here](http://addonsv24.flowingcode.com/syntax-highlighter)

## Download release

[Available in Vaadin Directory](https://vaadin.com/directory/component/syntax-highlighter-addon)

### Maven install

Add the following dependencies in your pom.xml file:

```xml
<dependency>
   <groupId>com.flowingcode.vaadin.addons</groupId>
   <artifactId>syntax-highlighter-addon</artifactId>
   <version>X.Y.Z</version>
</dependency>
```
<!-- the above dependency should be updated with latest released version information -->

```xml
<repository>
   <id>vaadin-addons</id>
   <url>https://maven.vaadin.com/vaadin-addons</url>
</repository>
```

For SNAPSHOT versions see [here](https://maven.flowingcode.com/snapshots/).

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes

See [here](https://github.com/FlowingCode/SyntaxHighlighter/releases)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. 

As first step, please refer to our [Development Conventions](https://github.com/FlowingCode/DevelopmentConventions) page to find information about Conventional Commits & Code Style requirements.

Then, follow these steps for creating a contribution:

- Fork this project.
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- For commit message, use [Conventional Commits](https://github.com/FlowingCode/DevelopmentConventions/blob/main/conventional-commits.md) to describe your change.
- Send a pull request for the original project.
- Comment on the original issue that you have implemented a fix for it.

## License & Author

This add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

SyntaxHighlighter Add-on is written by Flowing Code S.A.

# Developer Guide

## Getting started

You can instantiate the 	add-on by using the following syntax:

    SyntaxHighlighter sh = new SyntaxHighlighter(SHLanguage.JAVASCRIPT, SHStyle.A11YDARK, defaultValue, false, false);

You can also change the style and language by calling the appropriate getters:

    sh.setSHLanguage(SHLanguage.JAVASCRIPT);

The same with the styling:

    sh.setSHStyle(SHStyle.A11YDARK);

## Special configuration when using Spring

By default, Vaadin Flow only includes ```com/vaadin/flow/component``` to be always scanned for UI components and views. For this reason, the add-on might need to be whitelisted in order to display correctly. 

To do so, just add ```com.flowingcode``` to the ```vaadin.whitelisted-packages``` property in ```src/main/resources/application.properties```, like:

```vaadin.whitelisted-packages = com.vaadin,org.vaadin,dev.hilla,com.flowingcode```
 
More information on Spring whitelisted configuration [here](https://vaadin.com/docs/latest/integrations/spring/configuration/#configure-the-scanning-of-packages).
