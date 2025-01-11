package com.example;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class ExampleFood extends GenericCustomFood {
    public ExampleFood(Main plugin) {
        // Plugin instance, Item ID, url to PNG texture
        super(plugin, "exampleitem", "https://i.ibb.co/sCFvQBD/q6wBozz.png", 5);
        setName("Example Food"); // Set item name
    }
}
