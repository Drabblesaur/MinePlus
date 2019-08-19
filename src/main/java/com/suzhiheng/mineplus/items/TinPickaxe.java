package com.suzhiheng.mineplus.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class TinPickaxe extends PickaxeItem {
    public TinPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        setRegistryName("tin_pickaxe");
    }
}
