package com.wolfproductions.wolftweaks.Util;

import java.util.function.Supplier;

import com.wolfproductions.wolftweaks.init.ItemInitUpdated;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier	
{
	//int harvestLevel, int maxUses, float attackDamage, int enchantability, Supplier<ingredient> repairMaterial
	OBSIDIANTIER(4, 2000, 15.0f, 5.0f, 150, () -> {
		return Ingredient.fromItems(ItemInitUpdated.OBSIDIAN_INGOT.get());
	});
	
	public final int harvestLevel;
	public final int maxUses;
	public final float efficiency;
	public final float attackDamage;
	public final int enchantability;
	public final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) 
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.getValue();
	}
}