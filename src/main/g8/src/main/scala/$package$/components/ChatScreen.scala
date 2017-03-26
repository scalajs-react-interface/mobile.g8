package $package$.components

import sri.navigation._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class ChatScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Chat Tab")
}

object ChatScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[ChatScreen](
    tabBar = TabBarConfig(
      icon = (iconOptions: IconOptions) => {
        Ionicons(
          name =
            if (iconOptions.focused) IoniconsList.IOS_CHATBOXES
            else IoniconsList.IOS_CHATBOXES_OUTLINE,
          size = 26,
          style = UniversalStyleSheet.style(registerStyle = false,
                                            color = iconOptions.tintColor)
        )
      },
      label = "Chat"
    )
  )
}
