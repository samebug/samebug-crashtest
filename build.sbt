name := "samebug-crashtest"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "net.codingwell" %% "scala-guice" % "4.1.0",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.7.5",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.5",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.7",
  "org.mongodb" %% "casbah" % "3.1.1",
  "org.mongodb" % "bson" % "3.1.1",
  "org.mongojack" % "mongojack" % "2.6.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.rollbar" % "rollbar-java" % "1.0.0"
)
