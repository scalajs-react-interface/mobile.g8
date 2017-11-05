package $package$.stackNavigation

import sri.navigation._
import sri.universal.components._


class AboutScreen extends NavigationScreenComponentNoPS {
  def render() = {
    View(style = GlobalStyles.wholeContainer)(
      TextC("This app is built using scala.js and react-native")
    )
  }
}
