package com.suzhiheng.mineplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AmethystOre extends Block {
    public AmethystOre() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(4.5f)
        );
        setRegistryName("amethyst_ore");
    }
}
