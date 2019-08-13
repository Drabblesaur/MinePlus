package com.suzhiheng.mineplus.items;

import com.suzhiheng.mineplus.MinePlus;
import net.minecraft.item.Item;

public class Amethyst extends Item {
    public Amethyst() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(MinePlus.setup.itemGroup));
        setRegistryName("amethyst");
    }
}
