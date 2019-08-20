package com.suzhiheng.mineplus.lists;

import com.suzhiheng.mineplus.items.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum ToolMaterialList implements IItemTier {
    TIN(1.5f,5.0f,20,0,8,() -> { return Ingredient.fromItems(ModItems.TIN_INGOT);}),
    COPPER(2.5f,6.0f,250,2,5,() -> { return Ingredient.fromItems(ModItems.COPPER_INGOT);}),
    BRONZE(3.0f,7.0f,300,2,5,() -> { return Ingredient.fromItems(ModItems.BRONZE_INGOT);}),
    PLATINUM(4.5f,7.5f,400,3,18, () -> { return Ingredient.fromItems(ModItems.PLATINUM_INGOT);}),
    TITANIUM(10.0f,8.0f,800,3,10,() -> { return Ingredient.fromItems(ModItems.TITANIUM_INGOT);}),
    AMETHYST(5.0f,7.0f,400,2,30,() -> { return Ingredient.fromItems(ModItems.AMETHSYT);});


    private float attackDamage, efficiency;
    private int durability, harvestLevel, enchantability;
    private LazyLoadBase<Ingredient> repairMaterial;

    ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadBase<>(repairMaterial);
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
        return this.repairMaterial.getValue();
    }
}
