name := "$name;format="norm"$"

organization := "$project_group_id$"

version := "0.1.0-SNAPSHOT"

homepage := Some(url("https://github.com/$github_username$/$name;format="norm"$"))

startYear := Some(2014)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/$github_username$/$name;format="norm"$"),
    "scm:git:https://github.com/$github_username$/$name;format="norm"$.git",
    Some("scm:git:git@github.com:$github_username$/$name;format="norm"$.git")
  )
)

/* scala versions and options */
scalaVersion := "2.11.5"

// These options will be used for *all* versions.
scalacOptions ++= Seq(
  "-deprecation"
  ,"-unchecked"
  ,"-encoding", "UTF-8"
  ,"-Xlint"
  ,"-Yclosure-elim"
  ,"-Yinline"
  ,"-Xverify"
  ,"-feature"
  ,"-language:postfixOps"
  //,"-optimise"
)

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

val akka = "2.3.9"
val spray = "1.3.2"

/* dependencies */
libraryDependencies ++= Seq (
  "com.github.nscala-time" %% "nscala-time" % "1.6.0"
  // -- testing --
  , "org.scalatest" %% "scalatest" % "2.2.3" % "test"
  // -- Logging --
  ,"ch.qos.logback" % "logback-classic" % "1.1.2"
  ,"com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
  // -- Akka --
  ,"com.typesafe.akka" %% "akka-testkit" % akka % "test"
  ,"com.typesafe.akka" %% "akka-actor" % akka
  ,"com.typesafe.akka" %% "akka-slf4j" % akka
  // -- Sql --
  //,"com.typesafe.slick" %% "slick" % "2.1.0"
  // -- Spray --
  ,"io.spray" %% "spray-routing" % spray
  ,"io.spray" %% "spray-client" % spray
  ,"io.spray" %% "spray-testkit" % spray % "test"
  // -- json --
  //,"org.json4s" %% "json4s-jackson" % "3.2.10"
  ,"com.typesafe.play" %% "play-json" % "2.4.0-M2"
  // -- config --
  ,"com.typesafe" % "config" % "1.2.1"
)

/* you may need these repos */
resolvers ++= Seq(
  // Resolver.sonatypeRepo("snapshots")
  // Resolver.typesafeRepo("releases")
  "spray repo" at "http://repo.spray.io"
)

fork := true

testOptions in Test += Tests.Argument("-oDS")

packageArchetype.java_server

scalaSource in Compile := baseDirectory.value / "src"

scalaSource in Test := baseDirectory.value / "src"

excludeFilter in (Compile, unmanagedSources) := HiddenFileFilter || "*_test.scala"

excludeFilter in (Test, unmanagedSources) := HiddenFileFilter

resourceDirectory in Compile := baseDirectory.value / "resources"

resourceDirectory in Test := baseDirectory.value / "resources_test"
