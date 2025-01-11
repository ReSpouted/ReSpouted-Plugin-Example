package com.example;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class ExampleBlock extends GenericCustomBlock {
    public ExampleBlock(Main plugin) {
        super(plugin, "exampleblock", true, new GenericCubeBlockDesign(plugin, "https://i.ibb.co/sCFvQBD/q6wBozz.png", 16));
        setName("Example Block");
    }
}
