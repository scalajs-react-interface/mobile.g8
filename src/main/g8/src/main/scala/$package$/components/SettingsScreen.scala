package $package$.components

import sri.navigation._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class SettingsScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Settings Tab")
}

object SettingsScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[SettingsScreen](
    tabBar = TabBarConfig(
      icon = (iconOptions: IconOptions) => {
        Ionicons(
          name =
            if (iconOptions.focused) IoniconsList.IOS_SETTINGS
            else IoniconsList.IOS_SETTINGS_OUTLINE,
          size = 26,
          style = UniversalStyleSheet.style(registerStyle = false,
                                            color = iconOptions.tintColor)
        )
      },
      label = "Settings"
    )
  )
}
