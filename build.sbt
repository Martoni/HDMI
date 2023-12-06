// See README.md for license details.


scalaVersion     := "2.13.8"
version          := "0.1.1"
organization     := "eu.fabienm"

val majorChiselVersion = "3"
val minorChiselVersion = "5.6"

val chiselVersion = majorChiselVersion + "." + minorChiselVersion

lazy val root = (project in file("."))
  .settings(
    name := "hdmicore",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % chiselVersion,
      "edu.berkeley.cs" %% "chiseltest" % ("0." + minorChiselVersion) % "test",
      "Martoni" %% "fpgamacro" % "0.2.2"
    ),
    scalacOptions ++= Seq(
      "-Xsource:2.11",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full),
  )

