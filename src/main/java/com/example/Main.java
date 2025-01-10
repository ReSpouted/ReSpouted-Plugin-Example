package com.example;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main INSTANCE;

    public Main() {
        INSTANCE = this;
    }

    public ExampleItem EXAMPLE_ITEM;

    @Override
    public void onEnable() {
        // The item needs to be initialised somewhere. Add as variable to this class so it can be referenced to add to inventories
        EXAMPLE_ITEM = new ExampleItem();
    }

    public static Main get() {
        return INSTANCE;
    }
}
