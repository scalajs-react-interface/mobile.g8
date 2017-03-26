package $package$.components

import sri.navigation._
import sri.platform.SriPlatForm
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class HomeScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Home Tab")
}

object HomeScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[HomeScreen](
    tabBar = TabBarConfig(
      icon = (iconOptions: IconOptions) => {
        Ionicons(
          name =
            if (SriPlatForm.isAndroid) IoniconsList.IOS_HOME
            else IoniconsList.IOS_HOME_OUTLINE,
          size = 27,
          style = UniversalStyleSheet.style(registerStyle = false,
                                            color = iconOptions.tintColor)
        )
      },
      label = "Home"
    )
  )
}
