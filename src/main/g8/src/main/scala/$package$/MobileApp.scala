package $package$

import sri.universal.apis.AppRegistry

object MobileApp {

  def main(args: Array[String]) = {
    // Choose one of: "default.root", "stackNavigation", "tabNavigation", "drawerNavigation", ...
    val component = default.root
    AppRegistry.registerComponent("main", () => component)
  }
}
