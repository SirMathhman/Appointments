name := "Appointments"
organization := "com.meti"

version := "ALPHA"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
