package com.wolfproductions.wolftweaks.ItemGroups;

import com.wolfproductions.wolftweaks.init.ItemInitUpdated;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WolfsToolsItemGroup extends ItemGroup {
	public static final WolfsToolsItemGroup instance = new WolfsToolsItemGroup(ItemGroup.GROUPS.length, "wolfstoolsitemgroup");
	public WolfsToolsItemGroup(int index, java.lang.String label) {
		super(index, label);

	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemInitUpdated.OBSIDIAN_PICKAXE.get());
	}
}