package $package$

import sri.universal.apis.AppRegistry

object MobileApp extends JSApp {

  def main(args:Array[String]) = {
    AppRegistry.registerComponent("$name$", () => components.root)
  }
}
