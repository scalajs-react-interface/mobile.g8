package $package$.components

import sri.navigation._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class PeopleScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("People Tab")
}

object PeopleScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[PeopleScreen](
    tabBar = TabBarConfig(
      icon = (iconOptions: IconOptions) => {
        Ionicons(
          name =
            if (iconOptions.focused) IoniconsList.IOS_PEOPLE
            else IoniconsList.IOS_PEOPLE_OUTLINE,
          size = 26,
          style = UniversalStyleSheet.style(registerStyle = false,
                                            color = iconOptions.tintColor)
        )
      },
      label = "People"
    )
  )
}
