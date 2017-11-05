package $package$.tabNavigation

import sri.navigation.{NavigationAwareComponentP, _}
import sri.universal.components._

class MyNavScreen extends NavigationAwareComponentP[String] {

  def render() = {
    ScrollView(style = GlobalStyles.navScreenContainer)(
      Text(style = GlobalStyles.sampleText)(props),
      Button(onPress = () => navigation.navigate[HomeScreen],
             title = "Go to home tab"),
      Button(onPress = () => navigation.navigate[SettingsScreen],
             title = "Go to settings tab"),
      Button(onPress = () => navigation.goBack(null), title = "Go Back")
    )
  }

}

object MyNavScreen {

  def apply(banner: String) = WithNavigation[MyNavScreen](banner)
}
