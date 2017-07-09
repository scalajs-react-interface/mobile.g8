enablePlugins(SriPlatformPlugin)

name := "stacktest"

scalaVersion := "2.11.11"
//scalaVersion := "2.12.2"

resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core" % "2017.7.9-RC",
  "scalajs-react-interface" %%% "mobile" % "2017.7.9-RC",
  "scalajs-react-interface" %%% "universal" % "2017.7.9-RC",
  "scalajs-react-interface" %%% "platform-config-ios" % "2017.7.9-RC" % ios,
  "scalajs-react-interface" %%% "platform-config-android" % "2017.7.9-RC" % android,
  "scalajs-react-interface" %%% "navigation" % "2017.7.9-RC"
)


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
