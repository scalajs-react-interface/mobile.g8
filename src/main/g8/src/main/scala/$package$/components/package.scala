package $package$

import sri.navigation._
import sri.navigation.navigators._
import sri.platform.SriPlatForm
package object components {

  val root = TabNavigator(
    TabNavigatorConfig(
      tabBarOptions = TabBarOptions(
        activeTintColor = if (SriPlatForm.isIOS) "#e91e63" else "#fff")
    ),
    registerScreen[HomeScreen],
    registerScreen[SettingsScreen],
    registerScreen[ChatScreen],
    registerScreen[PeopleScreen]
  )
}
