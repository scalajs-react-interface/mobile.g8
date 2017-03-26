package $package$
import sri.navigation._
import sri.navigation.navigators._
package object components {

  val root = StackNavigator(
    StackNavigatorConfig(
      cardStyle = GlobalStyles.defaultCardStyle,
      navigationOptions = NavigationScreenOptions[GenericScreen](
        header = HeaderConfig(style = GlobalStyles.defaultHeader,
                              tintColor = "white",
                              backTitle = "Back")
      )
    ),
    registerScreen[HomeScreen],
    registerScreen[ScreenWithParams],
    registerScreen[ScreenWithCustomRightButton],
    registerScreen[LazyLoadScreen],
    registerScreen[AboutScreen]
  )

}
