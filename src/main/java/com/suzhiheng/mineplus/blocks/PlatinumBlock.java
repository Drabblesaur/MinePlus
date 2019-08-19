package com.suzhiheng.mineplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumBlock extends Block {
    public PlatinumBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(4.5f)
                .harvestLevel(2)
        );
        setRegistryName("platinum_block");
    }
}
