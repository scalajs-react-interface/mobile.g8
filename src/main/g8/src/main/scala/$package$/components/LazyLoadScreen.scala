package $package$.components

import sri.navigation.{NavigationScreenOptions, _}
import sri.universal.apis.InteractionManager
import sri.universal.components._

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class LazyLoadScreen extends NavigationScreenComponentS[LazyLoadScreen.State] {
  import LazyLoadScreen._
  initialState(State(loading = true))

  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      if (state.loading)
        ActivityIndicator(size = ActivityIndicatorSize.LARGE, color = "red")
      else Text("Secreen loaded")
    )
  }

  override def componentDidMount(): Unit = {
    InteractionManager.runAfterInteractions(
      () => { // run after all interactions done(animation,..)
        setState((state: State) => state.copy(loading = false))
      })
  }
}

object LazyLoadScreen {

  case class State(loading: Boolean)

}
