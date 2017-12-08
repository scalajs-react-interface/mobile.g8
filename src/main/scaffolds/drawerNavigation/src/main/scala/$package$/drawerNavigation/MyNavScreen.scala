package $package$.drawerNavigation

import sri.core.ReactClass
import sri.mobile.components.StatusBarComponent
import sri.navigation.{NavigationAwareComponentP, _}
import sri.platform.SriPlatform
import sri.universal.components._
import sri.universal.styles.InlineStyleSheetUniversal
import sri.vector.icons.{MaterialIcons, MaterialIconsList}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("react-navigation", "CardStack.Header")
object Header extends ReactClass


class MyNavScreen extends NavigationAwareComponentP[String] {
  import MyNavScreen._
  def render() = {
    if (SriPlatform.isAndroid) StatusBarComponent.setBackgroundColor("#c62828")
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


  object styles extends InlineStyleSheetUniversal {

    import dsl._

    val header =
      style(height := (if (SriPlatform.isIOS) 64 else 44),
            paddingTop := (if (SriPlatform.isIOS) 20 else 0),
            backgroundColor := Colors.red500)

    val menuIcon =
      style(marginLeft := 20, marginTop := 5)
  }

  def apply(banner: String) = WithNavigation[MyNavScreen](banner)
}
