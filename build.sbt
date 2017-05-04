
organization := "com.kailuowang"

name := "spark-ranking-metrics"

scalaVersion := "2.11.11"


bintrayOrganization := Some("kailuowang")

scmInfo := Some(ScmInfo(
  url("https://github.com/kailuowang/spark-ranking-metrics"),
  "git@github.com:kailuowang/spark-ranking-metrics.git",
  Some("git@github.com:kailuowang/spark-ranking-metrics.git")))

libraryDependencies ++= Seq("provided", "test").map { config =>
  "org.apache.spark" %% "spark-mllib" % "2.0.0" % config
} ++ Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "net.recommenders.rival" % "rival-evaluate" % "0.2" % "test"
)

publishMavenStyle := false

pomIncludeRepository := { _ => false }

pomExtra in Global := {
  <url>http://github.com/jongwook/spark-ranking-metrics</url>
  <licenses>
    <license>
      <name>Unlicense</name>
      <url>http://unlicense.org/</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:jongwook/spark-ranking-metrics.git</url>
    <connection>scm:git:git@github.com:jongwook/spark-ranking-metrics.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jongwook</id>
      <name>Jong Wook Kim</name>
      <url>http://jongwook.kim</url>
    </developer>
  </developers>
}


publishArtifact in Test := false


licenses := Seq("Unlicense" -> url("http://unlicense.org/"))
homepage := Some(url("https://github.com/kailuowang/spark-ranking-metrics"))
description := "spark ranking metrics"
