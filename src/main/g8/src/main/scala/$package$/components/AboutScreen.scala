package $package$.components

import sri.navigation.NavigationScreenOptions
import sri.navigation._
import sri.universal._
import sri.universal.components._
import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class AboutScreen extends NavigationScreenComponentNoPS {
  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      Text("This app is built using scala.js and react-native")
    )
  }
}

object AboutScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[AboutScreen](
    title = "About"
  )
}
