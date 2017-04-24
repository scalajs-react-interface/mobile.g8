package $package$.components

import sri.navigation._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class SettingsScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Settings Tab")
}

