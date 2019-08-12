package com.suzhiheng.mineplus.items;

import com.suzhiheng.mineplus.MinePlus;
import net.minecraft.item.Item;

public class TinIngot extends Item {
    public TinIngot() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(MinePlus.setup.itemGroup));
        setRegistryName("tin_ingot");
    }
}
