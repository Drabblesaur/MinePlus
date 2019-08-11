package com.suzhiheng.mineplus.setup;

import com.suzhiheng.mineplus.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public  ItemGroup itemGroup = new ItemGroup("mineplus") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init(){

    }

}
