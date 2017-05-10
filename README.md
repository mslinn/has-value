# Scala Project Template

[![Build Status](https://travis-ci.org/mslinn/has-value.svg?branch=master)](https://travis-ci.org/mslinn/has-value)
[![GitHub version](https://badge.fury.io/gh/mslinn%2Fhas-value.svg)](https://badge.fury.io/gh/mslinn%2Fhas-value)

This project merely defines the `com.micronautics.HasValue` trait.
The trait is used in implementations of `model.persistence.Id`, required by
[html-form-scala](https://github.com/mslinn/html-form-scala).

## Installation
Add this to your project's `build.sbt`:

    resolvers += "micronautics/scala on bintray" at "http://dl.bintray.com/micronautics/scala"

    libraryDependencies += "com.micronautics" %% "has-value" % "1.0.0" withSources()

## Scaladoc
[Here](http://mslinn.github.io/has-value/latest/api/)
