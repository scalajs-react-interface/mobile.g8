package $package$
import sri.navigation._
import sri.navigation.navigators._
import sri.platform.SriPlatform
import sri.universal.apis.Alert
import sri.universal.components.Button

package object stackNavigation {

  val root = StackNavigator(
    StackNavigatorConfig(
      cardStyle = GlobalStyles.defaultCardStyle,
      navigationOptions = NavigationStackScreenOptions(
        headerTintColor = "white",
        headerBackTitle = "Back",
        headerStyle = GlobalStyles.defaultHeader
      )
    ),
    registerStackScreen[HomeScreen](navigationOptions = NavigationStackScreenOptions(title = "Scala.js Home")),
    registerStackScreen[ScreenWithParams](navigationOptionsDynamic = (props:NavigationScreenConfigProps[ScreenWithParams]) => NavigationStackScreenOptions(title = props.navigation.state.params.map(_.title).getOrElse("").toString)),
    registerStackScreen[ScreenWithCustomRightButton](navigationOptions = NavigationStackScreenOptions(
      title = "Custom Right",
      headerRight = Button(title = "Right",
        color = if (SriPlatform.isIOS) "white" else "#546E7A",
        onPress = () =>
          Alert.alert(title = "Alert",
            message = "You just pressed right button!"))
    )
    ),
    registerStackScreen[LazyLoadScreen](navigationOptions = NavigationStackScreenOptions(
      title = "Lazy Load"
    )),
    registerStackScreen[AboutScreen](navigationOptions = NavigationStackScreenOptions(
      title = "About"
    ))
  )

}
