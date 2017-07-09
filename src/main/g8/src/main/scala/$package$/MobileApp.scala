package $package$

import sri.universal.apis.AppRegistry

object MobileApp {

  def main(args: Array[String]) = {
    core.setReactElementType
    AppRegistry.registerComponent("$name$", () => components.root)
  }
}
