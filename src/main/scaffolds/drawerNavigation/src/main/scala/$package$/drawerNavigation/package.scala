package $package$

import sri.navigation._
import sri.navigation.navigators._
import sri.universal.components._
import sri.vector.icons.{MaterialIcons, MaterialIconsList}

package object drawerNavigation {

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
            DrawerItems(props)
          )
        )
    ),
    registerDrawerScreen[InboxScreen](
      navigationOptions = NavigationDrawerScreenOptions(
        drawerLabel = "Inbox",
        drawerIcon = (options: IconOptions) => {
          MaterialIcons(name = MaterialIconsList.INBOX,
            size = 24,
            color = options.tintColor)
        })),
    registerDrawerScreen[DraftsScreen](
      navigationOptions = NavigationDrawerScreenOptions(
        drawerLabel = "Drafts",
        drawerIcon = (options: IconOptions) => {
          MaterialIcons(name = MaterialIconsList.DRAFTS,
            size = 24,
            color = options.tintColor)
        }))
  )
}
