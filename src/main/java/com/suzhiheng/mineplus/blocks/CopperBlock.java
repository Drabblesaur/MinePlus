package com.suzhiheng.mineplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block {
    public CopperBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(3.0f)
                .harvestLevel(2)
        );
        setRegistryName("copper_block");
    }
}
