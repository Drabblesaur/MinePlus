package com.suzhiheng.mineplus.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class CustomPickaxe extends PickaxeItem {
    public CustomPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
