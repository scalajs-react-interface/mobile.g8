package $package$.default

import sri.navigation._
import sri.universal.components._


class AboutScreen extends NavigationScreenComponentNoPS {
  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      TextC("This app is built using scala.js and react-native"),
      TextC("..."),
      TextC("You can now enter SBT and scaffold more stuff:"),
      TextC("sbt> g8Scaffold stackNavigation"),
      TextC("sbt> g8Scaffold tabNavigation"),
      TextC("sbt> g8Scaffold drawerNavigation")
    )
  }
}
