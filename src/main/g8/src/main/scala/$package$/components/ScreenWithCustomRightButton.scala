package $package$.components

import sri.navigation.NavigationScreenOptions
import sri.navigation._
import sri.platform.SriPlatForm
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

object ScreenWithCustomRightButton {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[ScreenWithCustomRightButton](
    title = "Custom Right",
    header = HeaderConfig(
      style = GlobalStyles.defaultHeader, // https://github.com/react-community/react-navigation/issues/170#issuecomment-277286638
      tintColor = "white",
      right = Button(title = "Right",
                     color = if (SriPlatForm.isIOS) "white" else "#546E7A",
                     onPress = () =>
                       Alert.alert(title = "Alert",
                                   message = "You just pressed right button!"))
    )
  )

}
