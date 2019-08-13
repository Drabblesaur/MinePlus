package com.suzhiheng.mineplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {
    public PlatinumOre() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("platinum_ore");
    }
}