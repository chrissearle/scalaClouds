// See project/build.sbt
// import com.typesafe.startscript.StartScriptPlugin

// seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "clouds"

organization := "net.chrissearle"

version := "1-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.7.1",
  "net.databinder" %% "unfiltered-jetty" % "0.7.1",
  "org.scalatest" %% "scalatest" % "2.0" % "test"
)

