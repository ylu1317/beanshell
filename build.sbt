name := "beanshell"

version := "2.1.0-SNAPSHOT"

scalaVersion := "2.12.3"

unmanagedBase := baseDirectory.value / "lib"

mainClass in (Compile, run) := Some("edu.rice.pliny.codecomplete.main.CodeCompletionMain")

lazy val http4sVersion = "0.14.3"

parallelExecution in Test := false
fork in ThisBuild in Test:= false

showSuccess := false
logLevel in run := sbt.Level.Warn

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "bsf" % "bsf" % "2.4.0",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)
