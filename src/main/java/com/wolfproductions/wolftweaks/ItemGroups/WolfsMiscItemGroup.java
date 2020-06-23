package com.wolfproductions.wolftweaks.ItemGroups;

import com.wolfproductions.wolftweaks.init.ItemInitUpdated;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WolfsMiscItemGroup extends ItemGroup {
	public static final WolfsMiscItemGroup instance = new WolfsMiscItemGroup(ItemGroup.GROUPS.length, "wolfsmiscitemgroup");
	public WolfsMiscItemGroup(int index, java.lang.String label) {
		super(index, label);

	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemInitUpdated.OBSIDIAN_INGOT.get());
	}
}