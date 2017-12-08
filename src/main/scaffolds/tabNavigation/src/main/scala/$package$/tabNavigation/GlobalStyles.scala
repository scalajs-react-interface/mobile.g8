package $package$.tabNavigation

import sri.platform.SriPlatform
import sri.universal.styles.InlineStyleSheetUniversal

import scala.scalajs.js

object GlobalStyles extends InlineStyleSheetUniversal {
  import dsl._
  val navScreenContainer = style(
    marginTop := (if (SriPlatform.isIOS) 20 else 0))
  val sampleText =
    style(margin := 14, shadowOffset := js.Dynamic.literal(height = 10))

  def dynamicColor(c: String) = styleUR(color := c)
}
