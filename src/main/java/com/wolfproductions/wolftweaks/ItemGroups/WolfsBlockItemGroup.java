package com.wolfproductions.wolftweaks.ItemGroups;

import com.wolfproductions.wolftweaks.init.BlockInitUpdated;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WolfsBlockItemGroup extends ItemGroup {
	public static final WolfsBlockItemGroup instance = new WolfsBlockItemGroup(ItemGroup.GROUPS.length, "wolfsblockitemgroup");
	public WolfsBlockItemGroup(int index, java.lang.String label) {
		super(index, label);

	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(BlockInitUpdated.OBSIDIAN_BRICK.get());
	}
}