package $package$.components

import sri.navigation.NavigationScreenOptions
import sri.navigation.NavigationScreenOptionsImplicits._
import sri.navigation._
import sri.universal._
import sri.universal.components._
import scala.scalajs.js
import scala.scalajs.js.Object
import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class ScreenWithParams
    extends NavigationScreenComponentP[ScreenWithParams.Params] {
  import ScreenWithParams._
  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      Button(title = "Set New Params",
             onPress = () =>
               setParams(new Params {
                 override val tile: String = "New Title"
               }))
    )
  }
}

object ScreenWithParams {

  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[ScreenWithParams](
    title =
      (nav: Navigation[Params]) => nav.state.params.map(_.tile).getOrElse("")
  )
  @ScalaJSDefined
  trait Params extends Object {
    val tile: String
  }
}
