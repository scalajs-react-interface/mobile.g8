A [Giter8][g8] template for [Sri][sri] (scalajs-react-interface).

## Requirements

Make sure to have ``giter8`` and ``npm``

* ``g8``: [install-giter8.sh][install-giter8.sh]

* ``npm``: [install-node.sh][install-node.sh]

## For the impatient

First define some useful variables, just to make life easier. Replace the ``<>`` enclosed names with yours.
    
    $ template="https://github.com/scalajs-react-interface/mobile.g8"
    $ project="<myproject>"
    $ package="<com.mycompany>"
    
#### Building the project

Let's create a project from the template. Change working directory to where you want the project to live

    $ g8 $template --name=$project --package=$package

We should now have a directory called ``$project`` that you can ``cd`` into.

    $ cd $project

Let's use ``react-native`` to create the boostrap code:
    
    $ react-native init $project

We now copy the generated folders ``android`` and ``ios`` into our newly created project. Once we copy, we can get rid of the remaining files we don't need:

    $ mv $project/android .
    $ mv $project/ios .
    $ rm -r -f $project

Now we install dependencies:

    $ npm install

We can now build from from sources. By prepending ``~``, sbt will recompile whenever source files change.

```
    $ sbt
    sbt> ~android:dev
```

or


```
    $ sbt
    sbt> ~ios:dev
```

#### Open the emulator

Open a separate terminal window and run the emulator in it.

#### Start development

Open a separate terminal window and run NPM:

    $ npm start

#### Run the application

Open a separate terminal window and deploy the application into the emulator:

    $ react-native run-android

or

    $ react-native run-ios

## Scaffolding

The generated project has a single and very simple presentation page. However, you can request the generation of additional code which hopefuly may be useful for your application.

In the example below we show how SBT can help us generate additional code:

    $ cd $HOME/workspace/$project
    $ sbt
    sbt> g8Scaffold stackNavigation
    sbt> g8Scaffold tabNavigation
    sbt> g8Scaffold drawerNavigation

Then run either `~android:dev` or `~ios:dev` in `sbt`

You need to adjust MobileApp.scala in order to call the desired implamentation:

```scala
package com.mycompany

import sri.universal.apis.AppRegistry

object MobileApp {

  def main(args: Array[String]) = {
    // Choose one of: "default.root", "stackNavigation", "tabNavigation", "drawerNavigation", ...
    val component = default.root
    AppRegistry.registerComponent("main", () => component)
  }
}
```
    
## License

Written in Sri developers
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.


[g8]: http://www.foundweekends.org/giter8/
[sri]: http://github.com/scalajs-react-interface/sri
[install-giter8.sh]: http://github.com/frgomes/debian-scripts/blob/master/install-giter8.sh
[install-node.sh]: https://github.com/frgomes/debian-scripts/blob/master/install-node.sh
