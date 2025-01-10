# ReSpouted Plugin Template 1.6.4

This is the template for a ReSpouted 1.6.4 plugin!

It has some basic example code for how to use the Spout API to do custom Spout things like make a custom item

## Getting Started

To begin, fork and clone this repository to your machine.

Next create a new directory called `lib` inside the root directory of the project, next to `src`.

Download the latest version of the [ReSpouted](https://modrinth.com/plugin/respouted-plugin) plugin (The included one may be outdated), rename it to `spoutpluginapi.jar` (Make sure file extensions are enabled, if not just `spoutpluginapi`). Then move that file into the new `lib` directory.

Now you want the Bukkit api for plugin development. You can download a working version of CraftBukkit 1.6.4 [here](https://eimerarchive.org/files/server-software/CraftBukkit/2918/craftbukkit-2918.jar). While using Spout you may want to access some internal stuff as the plain API is often not enough and you need to include the final built version of the server. Just limitations of the Bukkit API at the time. If you know what you are doing you could switch it out for another fork of CraftBukkit or switch to the plain API.

Now rename that downloaded CraftBukkit file to `craftbukkit.jar` (`craftbukkit` if you do not have file extensions on) and put it in the `lib` directory.

Now you may open it in your IDE (I like to use IntelliJ) and begin developing your plugin!

To build it just run `mvn package`. The Bukkit API is very similar to what it/the Spigot API is now due to backwards compatability. Just missing the newer features.