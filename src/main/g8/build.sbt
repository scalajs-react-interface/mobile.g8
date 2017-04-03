enablePlugins(SriPlatFormPlugin)

name := "$name$"

scalaVersion := "2.11.8"
//scalaVersion := "2.12.1"

resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core" % "2017.3.26-beta",
  "scalajs-react-interface" %%% "mobile" % "2017.3.26-beta",
  "scalajs-react-interface" %%% "vector-icons" % "2017.3.25-beta",
  "scalajs-react-interface" %%% "universal" % "2017.4.4-beta",
  "scalajs-react-interface" %%% "platform-config-ios" % "2017.3.26-beta" % ios,
  "scalajs-react-interface" %%% "platform-config-android" % "2017.3.26-beta" % android,
  "scalajs-react-interface" %%% "navigation" % "2017.3.26-beta"
)


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
