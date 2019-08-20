package com.suzhiheng.mineplus.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class CopperPickaxe extends PickaxeItem {
    public CopperPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        setRegistryName("copper_pickaxe");
    }
}
