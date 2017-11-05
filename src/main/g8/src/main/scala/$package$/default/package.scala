package $package$
import sri.navigation._
import sri.navigation.navigators._
import sri.platform.SriPlatform
import sri.universal.apis.Alert
import sri.universal.components.Button

package object default {

  val root = StackNavigator(
    StackNavigatorConfig(
      cardStyle = GlobalStyles.defaultCardStyle,
      navigationOptions = NavigationStackScreenOptions(
        headerTintColor = "white",
        headerBackTitle = "Back",
        headerStyle = GlobalStyles.defaultHeader
      )
    ),
    registerStackScreen[AboutScreen](navigationOptions = NavigationStackScreenOptions(title = "About"))
  )

}
