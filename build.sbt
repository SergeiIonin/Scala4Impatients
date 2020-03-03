lazy val akkaHttpVersion = "10.1.11"
lazy val akkaVersion    = "2.6.3"

name := "Scala4Impatients"

version := "0.1"

scalaVersion := "2.13.0"

// https://mvnrepository.com/artifact/org.mockito/mockito-all



libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json"     % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
  "com.typesafe.akka" %% "akka-stream"              % akkaVersion,
  "ch.qos.logback"    % "logback-classic"           % "1.2.3",
  "org.typelevel"     %% "cats-core"                % "2.0.0",

  "com.typesafe.akka" %% "akka-http-testkit"        % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"                % "3.0.8"         % Test,
  "org.mockito" % "mockito-all" % "1.9.5" % Test
)

