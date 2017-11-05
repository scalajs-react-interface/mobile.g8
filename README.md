A [Giter8][g8] template for [Sri][sri] (scalajs-react-interface).

## Requirements

* ``g8``: [install-giter8.sh][install-giter8.sh]

* ``npm``: [install-node.sh][install-node.sh]

## For the impatient

First define some useful variables, just to make life easier:
    
    $ template=http://github.com/frgomes/mobile.g8
    $ project=myproject
    $ package=com.mycompany
    
#### Building the project

Create a project:

    $ mkdir -p $HOME/workspace
    $ cd $HOME/workspace
    $ g8 $template --name=$project --package=$package

We need to create the boostrap code and copy its folders ``android`` and ``ios`` into our newly created project. 
    
    $ cd $HOME/workspace/$project
    $ react-native init $project
    $ cp $HOME/workspace/$project/$project/android .
    $ cp $HOME/workspace/$project/$project/ios .
    
We can get rid of the remaining files we don't need:

    $ rm -r -f $HOME/workspace/$project/$project
    
Now install dependencies:

    $ npm install

You can now build from from sources:

    $ sbt android:dev

#### Open the emulator

Open a separate terminal window and run the emulator in it.

#### Start development

Open a separate terminal window and run NPM:

    $ npm start

#### Run the application

Open a separate terminal window and deploy the application into the emulator:

    $ react-native run-android

## Scaffolding

The generated project has a single and very simple presentation page. However, you can request the generation of additional code which hopefuly may be useful for your application.

In the example below we show how SBT can help us generate additional code:

    $ cd $HOME/workspace/$project
    $ sbt
    sbt> b8Scaffold stackNavigation com.mycompany
    sbt> b8Scaffold tabNavigation com.mycompany
    sbt> b8Scaffold drawerNavigation com.mycompany
    sbt> ~android:dev

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
