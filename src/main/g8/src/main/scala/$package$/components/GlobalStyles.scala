package $package$.components

import sri.universal.styles.{UniversalStyleConstants, UniversalStyleSheet}
import scala.scalajs.js

object GlobalStyles extends UniversalStyleSheet {

  val defaultHeader = style(backgroundColor = "#E91E63")

  val defaultCardStyle = style(backgroundColor = "rgb(243, 241, 241)")

  val navScreenContainer = style(flex = 1)

  val wholeContainer = style(flex = 1)

  val drawerHeader = style(height = 200,
                           justifyContent = center,
                           alignItems = center,
                           backgroundColor = Colors.red500)

  val drawerHeaderLogo =
    style(fontWeight = bold, fontSize = 20, color = "white")

  val drawerItems = style(marginTop = 0)

  val sampleText =
    style(margin = 14, shadowOffset = js.Dynamic.literal(height = 10))
}
