package $package$

import sri.navigation._
import sri.navigation.navigators._
import sri.universal.components._

package object components {

  val root = DrawerNavigator(
    DrawerNavigatorConfig(
      contentOptions = DrawerContentOptions(
        activeTintColor = "#e91e63",
        style = GlobalStyles.drawerItems
      ),
      contentComponent = (
          (props: Navigation[_]) =>
            View(style = GlobalStyles.wholeContainer)(
              View(style = GlobalStyles.drawerHeader)(
                Text(style = GlobalStyles.drawerHeaderLogo)("Scala.js")
              ),
              DrawerViewItems(props)
            )
      )
    ),
    registerScreen[InboxScreen],
    registerScreen[DraftsScreen]
  )
}
