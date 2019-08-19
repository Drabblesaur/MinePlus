package com.suzhiheng.mineplus.lists;

import com.suzhiheng.mineplus.items.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
    TIN(1.5f,5.0f,20,0,8, ModItems.TIN_INGOT),
    COPPER(2.5f,6.0f,250,2,5, ModItems.COPPER_INGOT),
    BRONZE(3.0f,7.0f,300,2,5, ModItems.BRONZE_INGOT),
    PLATINUM(4.5f,7.5f,400,3,18, ModItems.PLATINUM_INGOT),
    TITANIUM(10.0f,8.0f,800,3,10, ModItems.TITANIUM_INGOT),
    AMETHYST(5.0f,7.0f,400,2,30, ModItems.AMETHSYT);


    private float attackDamage, efficiency;
    private int durability, harvestLevel, enchantability;
    private Item repairMaterial;

    ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return durability;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }
}
