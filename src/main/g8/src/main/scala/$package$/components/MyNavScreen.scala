package $package$.components

import sri.core.CreateElement
import sri.navigation.{NavigationAwareComponentP, _}
import sri.universal.components._

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}
@ScalaJSDefined
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

  @JSExportStatic
  val contextTypes =
    navigationContextType

  def apply(banner: String) = CreateElement[MyNavScreen](banner)
}
