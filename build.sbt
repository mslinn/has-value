organization := "com.micronautics"

name := "has-value"
version := "1.1.0"
licenses +=  ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
scalaVersion := "2.13.0"
crossScalaVersions := Seq("2.11.12", "2.12.9", "2.13.0")

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-target:jvm-1.8",
  "-unchecked",
  "-Xlint"
)

scalacOptions in (Compile, doc) ++= baseDirectory.map {
  bd: File => Seq[String](
     "-sourcepath", bd.getAbsolutePath,
     "-doc-source-url", "https://github.com/mslinn/has-value/tree/master€{FILE_PATH}.scala"
  )
}.value

javacOptions ++= Seq(
  "-Xlint:deprecation",
  "-Xlint:unchecked",
  "-source", "1.8",
  "-target", "1.8",
  "-g:vars"
)

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"   % "3.0.8" % Test withSources(),
  "junit"             %  "junit"       % "4.12"  % Test
)

logLevel := Level.Warn

ThisBuild / turbo := true

// Only show warnings and errors on the screen for compilations.
// This applies to both test:compile and compile and is Info by default
logLevel in compile := Level.Warn

sublimeTransitive := true
