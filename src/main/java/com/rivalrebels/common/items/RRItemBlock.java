package com.rivalrebels.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.ArrayList;
import java.util.List;

public class RRItemBlock extends ItemBlock {
    public String name;
    public static List<Item> items = new ArrayList<>();
    public RRItemBlock(Block block, String name) {
        super(block);
        setUnlocalizedName(name);
        setRegistryName(name);
        items.add(this);
    }
    /**Basically the successor of setTextureName from 1.7.10, except it takes json models instead of pngs
     * @param modelName the name of the model file, it already points to the models/item directory, it just needs the modid and the name of the file*/
    public RRItemBlock setModelName(String modelName){
        name = modelName;
        return this;
    }
    public String getModelName() {
        if(name == null){
            throw new NullPointerException("Tell that dummy developer known as a weeb programmer to set the model name for " + getRegistryName() + "! And if you are a weeb programmer, SET THE MODEL NAME, DUMMY!!");
        }
        return name;
    }
}
