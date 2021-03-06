# Scala Project Template

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![GitHub version](https://badge.fury.io/gh/mslinn%2Fhas-value.svg)](https://badge.fury.io/gh/mslinn%2Fhas-value)

This project merely defines the `com.micronautics.HasValue` trait.
The trait is used in implementations of `model.persistence.Id`, required by
[html-form-scala](https://github.com/mslinn/html-form-scala).

## Installation
Add this to your project's `build.sbt`:

    resolvers += "micronautics/scala on bintray" at "https://dl.bintray.com/micronautics/scala"

    libraryDependencies += "com.micronautics" %% "has-value" % "1.1.0" withSources()

## Scaladoc
[Here](http://mslinn.github.io/has-value/latest/api/)
