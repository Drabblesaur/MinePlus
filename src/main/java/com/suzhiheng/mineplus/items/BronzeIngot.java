package com.suzhiheng.mineplus.items;

import com.suzhiheng.mineplus.MinePlus;
import net.minecraft.item.Item;

public class BronzeIngot extends Item {
    public BronzeIngot() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(MinePlus.setup.itemGroup));
        setRegistryName("bronze_ingot");
    }
}
