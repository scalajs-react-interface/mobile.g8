package $package$.components

import sri.core.{CreateElement, ReactClass}
import sri.mobile.components.StatusBarComponent
import sri.navigation.{NavigationAwareComponentP, _}
import sri.platform.SriPlatForm
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{MaterialIcons, MaterialIconsList}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportStatic, JSImport, ScalaJSDefined}

@js.native
@JSImport("react-navigation", "CardStack.Header")
object Header extends ReactClass

@ScalaJSDefined
class MyNavScreen extends NavigationAwareComponentP[String] {
  import MyNavScreen._
  def render() = {
    if (SriPlatForm.isAndroid) StatusBarComponent.setBackgroundColor("#c62828")
    ScrollView(style = GlobalStyles.navScreenContainer)(
      View(style = styles.header)(
        TouchableOpacity(onPress = () => navigation.openDrawer(),
                         style = styles.menuIcon)(
          MaterialIcons(name = MaterialIconsList.MENU,
                        color = "white",
                        size = 30)
        )
      ),
      Text(style = GlobalStyles.sampleText)(props),
      Button(onPress = () => navigation.goBack(null), title = "Go Back")
    )
  }

}

object MyNavScreen {

  @JSExportStatic
  val contextTypes =
    navigationContextType

  object styles extends UniversalStyleSheet {
    val header =
      style(height = if (SriPlatForm.isIOS) 64 else 44,
            paddingTop = if (SriPlatForm.isIOS) 20 else 0,
            backgroundColor = Colors.red500)

    val menuIcon =
      style(marginLeft = 20, marginTop = 5)
  }

  def apply(banner: String) = CreateElement[MyNavScreen](banner)
}
