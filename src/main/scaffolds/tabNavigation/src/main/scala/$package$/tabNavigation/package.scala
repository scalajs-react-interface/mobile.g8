package $package$

import sri.navigation._
import sri.navigation.navigators._
import sri.platform.SriPlatform
import sri.vector.icons.{Ionicons, IoniconsList}

package object tabNavigation {

  val root = TabNavigator(
    TabNavigatorConfig(
      tabBarOptions = TabBarOptions(
        activeTintColor = if (SriPlatform.isIOS) "#e91e63" else "#fff")
    ),
    registerTabScreen[HomeScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (SriPlatform.isAndroid) IoniconsList.IOS_HOME
              else IoniconsList.IOS_HOME_OUTLINE,
            size = 27,
            style = GlobalStyles.dynamicColor(iconOptions.tintColor)
          )
        },
        tabBarLabel = "Home"
      )),
    registerTabScreen[SettingsScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_SETTINGS
              else IoniconsList.IOS_SETTINGS_OUTLINE,
            size = 26,
            style = GlobalStyles.dynamicColor(iconOptions.tintColor)
          )
        },
        tabBarLabel = "Settings"
      )),
    registerTabScreen[ChatScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_CHATBOXES
              else IoniconsList.IOS_CHATBOXES_OUTLINE,
            size = 26,
            style = GlobalStyles.dynamicColor(iconOptions.tintColor)
          )
        },
        tabBarLabel = "Chat"
      )),
    registerTabScreen[PeopleScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_PEOPLE
              else IoniconsList.IOS_PEOPLE_OUTLINE,
            size = 26,
            style = GlobalStyles.dynamicColor(iconOptions.tintColor)
          )
        },
        tabBarLabel = "People"
      ))
  )
}
