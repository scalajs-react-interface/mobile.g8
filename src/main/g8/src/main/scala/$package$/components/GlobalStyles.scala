package $package$.components

import sri.platform.SriPlatForm
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js

object GlobalStyles extends UniversalStyleSheet {
  val navScreenContainer = style(marginTop = if (SriPlatForm.isIOS) 20 else 0)
  val sampleText =
    style(margin = 14, shadowOffset = js.Dynamic.literal(height = 10))
}
