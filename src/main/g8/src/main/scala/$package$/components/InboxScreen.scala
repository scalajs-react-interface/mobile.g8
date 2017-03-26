package $package$.components

import sri.navigation._
import sri.vector.icons.{MaterialIcons, MaterialIconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class InboxScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Inbox Screen")
}

object InboxScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[InboxScreen](
    drawer = DrawerConfig(label = "Inbox", icon = (options: IconOptions) => {
      MaterialIcons(name = MaterialIconsList.INBOX,
                    size = 24,
                    color = options.tintColor)
    })
  )
}
