package com.suzhiheng.mineplus.items;

import com.suzhiheng.mineplus.MinePlus;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item {
    public TitaniumIngot() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(MinePlus.setup.itemGroup));
        setRegistryName("titanium_ingot");
    }
}
