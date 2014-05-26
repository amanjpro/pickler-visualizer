name := "pickler-visualizer"

organization := "org.improving"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

fork in run := true
