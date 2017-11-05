package $package$.stackNavigation


import sri.universal.styles.InlineStyleSheetUniversal

object GlobalStyles extends InlineStyleSheetUniversal {

  import dsl._

  val wholeContainer = style(flex := 1, padding := 20)

  val defaultHeader = style(backgroundColor := "#E91E63")

  val defaultCardStyle = style(backgroundColor := "rgb(243, 241, 241)")

}
