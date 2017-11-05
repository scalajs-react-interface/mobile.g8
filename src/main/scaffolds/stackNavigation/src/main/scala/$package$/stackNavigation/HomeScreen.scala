package $package$.stackNavigation

import sri.macros.{OptDefault => NoValue, OptionalParam => U}
import sri.navigation._
import sri.universal.components._
import sri.universal.styles.InlineStyleSheetUniversal
import $package$.stackNavigation.ScreenWithParams.Params

import scala.scalajs.js


class HomeScreen extends NavigationScreenComponentNoPS {
  import HomeScreen._
  def render() = {
    View(style = styles.container)(
      getBlock(() =>
                 navigation.navigate[ScreenWithParams](new Params {
                   override val title: String = "Second title"
                 }),
               "Screen With Params"),
      getBlock(() => navigation.navigate[ScreenWithCustomRightButton],
               "Screen With Right Button"),
      getBlock(() => navigation.navigate[LazyLoadScreen], "LazyLoad Screen"),
      getBlock(() => navigation.navigate[AboutScreen], "About Screen")
    )
  }

  @inline
  def getBlock(onPress: () => _, title: String) =
    TouchableOpacity(
      style = styles.block,
      onPress = onPress,
      activeOpacity = 0.8
    )(
      Text(style = styles.blockText)(title)
    )
}

object HomeScreen {

  object styles extends InlineStyleSheetUniversal {

    import dsl._

    val container = style(
      flex := 1,
      padding := 20,
      flexDirection.row,
      flexWrap.wrap
    )

    val block = style(
      width := "42%",
      height := 120,
      backgroundColor := "white",
      borderColor := "#eee",
      borderRadius := 2,
      margin := 10,
      paddingHorizontal := 3,
      shadowColor := "grey",
      shadowOpacity := 0.5,
      shadowRadius := 2,
      shadowOffset := js.Dynamic.literal(height = 1, width = 0),
      elevation := 3,
      borderWidth := 1,
      justifyContent.center,
      alignItems.center
    )

    val blockText = style(fontWeight := "500", fontSize := 14)
  }
}
