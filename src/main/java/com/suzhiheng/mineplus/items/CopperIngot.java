package com.suzhiheng.mineplus.items;

import com.suzhiheng.mineplus.MinePlus;
import net.minecraft.item.Item;

public class CopperIngot extends Item {
    public CopperIngot() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(MinePlus.setup.itemGroup));
        setRegistryName("copper_ingot");
    }
}
