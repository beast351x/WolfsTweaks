/*
package com.wolfproductions.wolftweaks.init;

import com.wolfproductions.wolftweaks.WolfsTweaks;
import com.wolfproductions.wolftweaks.ItemGroups.WolfsBlockItemGroup;
import com.wolfproductions.wolftweaks.objects.blocks.CustomObsidianBlock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WolfsTweaks.MOD_ID, bus = Bus.MOD)
@ObjectHolder(WolfsTweaks.MOD_ID)
public class BlockInit {

	//custom obsidian blocks
	public static final Block obsidian_brick = null;
	public static final Block cracked_obsidian_brick = null;
	public static final Block smooth_obsidian = null;
	public static final Block chiseled_obsidian_brick = null;
	
	//custom obsidian non-full blocks
	public static final Block obsidian_stair = null;
	
	@SubscribeEvent
	public static void RegisterBlock(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new CustomObsidianBlock().setRegistryName("obsidian_brick"));
		event.getRegistry().register(new CustomObsidianBlock().setRegistryName("cracked_obsidian_brick"));
		event.getRegistry().register(new CustomObsidianBlock().setRegistryName("smooth_obsidian"));
		event.getRegistry().register(new CustomObsidianBlock().setRegistryName("chiseled_obsidian_brick"));
		
	}
	
	@SubscribeEvent
	public static void RegisterBlockItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(obsidian_brick, new Item.Properties().group(WolfsBlockItemGroup.instance)).setRegistryName("obsidian_brick"));
		event.getRegistry().register(new BlockItem(cracked_obsidian_brick, new Item.Properties().group(WolfsBlockItemGroup.instance)).setRegistryName("cracked_obsidian_brick"));
		event.getRegistry().register(new BlockItem(smooth_obsidian, new Item.Properties().group(WolfsBlockItemGroup.instance)).setRegistryName("smooth_obsidian"));
		event.getRegistry().register(new BlockItem(chiseled_obsidian_brick, new Item.Properties().group(WolfsBlockItemGroup.instance)).setRegistryName("chiseled_obsidian_brick"));
	}
}

*/
