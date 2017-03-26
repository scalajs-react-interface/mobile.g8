package $package$

import sri.core
import sri.universal.apis.AppRegistry

import scala.scalajs.js.JSApp

object MobileApp extends JSApp {

  def main() = {
    core.setReactElementType
    AppRegistry.registerComponent("$name$", () => components.root)
  }
}
