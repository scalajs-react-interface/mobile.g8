package $package$

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.template.router.AppRouter
import scala.scalajs.js.JSApp


object MobileApp extends JSApp {

  def main() = {

    val root = createReactNativeRoot(
      AppRouter.router
    )
    ReactNative.AppRegistry.registerComponent("$name$", () => root)
  }
}
