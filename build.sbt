name := "exampleApi"

version := "1.0"

lazy val `exampleapi` = (project in file(".")).enablePlugins(PlayScala,DockerPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"



//  Docker.io setup : https://groups.google.com/forum/#!topic/play-framework/Aq-ySsKQzXg
//  sbt compile
//  sbt docker:publishLocal
// setting a maintainer which is used for all packaging types
maintainer := "kopi"
// exposing the play ports (Change these to whatever you are using)
//dockerExposedPorts in Docker := Seq(9000, 9443)

dockerBaseImage := "java:latest"



