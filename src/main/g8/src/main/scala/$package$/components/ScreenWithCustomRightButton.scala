package $package$.components

import sri.navigation.NavigationScreenOptions
import sri.navigation._
import sri.platform.SriPlatform
import sri.universal._
import sri.universal.apis.Alert
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class ScreenWithCustomRightButton extends NavigationScreenComponentNoPS {
  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      Text("Header Right element example")
    )
  }
}

