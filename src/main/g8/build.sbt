enablePlugins(SriPlatformPlugin)

name := "$name$"

scalaVersion := "2.11.11"
//scalaVersion := "2.12.4"

lazy val versions = new {
  val sri = "2017.7.9-RC"
}


resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core"                    % versions.sri,
  "scalajs-react-interface" %%% "mobile"                  % versions.sri,
  "scalajs-react-interface" %%% "universal"               % versions.sri,
  "scalajs-react-interface" %%% "vector-icons"            % versions.sri,
  "scalajs-react-interface" %%% "platform-config-ios"     % versions.sri % ios,
  "scalajs-react-interface" %%% "platform-config-android" % versions.sri % android,
  "scalajs-react-interface" %%% "navigation"              % versions.sri
)


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
