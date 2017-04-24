package $package$.components

import sri.navigation._
import sri.platform.SriPlatform
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class HomeScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Home Tab")
}


