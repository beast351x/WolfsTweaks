/*
package com.wolfproductions.wolftweaks.init;

import com.wolfproductions.wolftweaks.WolfsTweaks;
import com.wolfproductions.wolftweaks.ItemGroups.WolfsMiscItemGroup;
import com.wolfproductions.wolftweaks.ItemGroups.WolfsToolsItemGroup;
import com.wolfproductions.wolftweaks.Util.ModItemTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WolfsTweaks.MOD_ID, bus = Bus.MOD)
@ObjectHolder(WolfsTweaks.MOD_ID)
public class ItemInit {

	//materials
	public static final Item obsidian_ingot = null;
	
	//blueprints
	public static final Item blueprint_obsidian_pickaxe = null;
	public static final Item blueprint_obsidian_axe = null;
	public static final Item blueprint_obsidian_shovel = null;
	public static final Item blueprint_obsidian_hoe = null;
	public static final Item blueprint_obsidian_sword = null;
	
	//food
	public static final Item orange = null;
	
	//tools
	public static final Item obsidian_sword = null;
	public static final Item obsidian_pickaxe = null;
	public static final Item obsidian_shovel = null;
	public static final Item obsidian_axe = null;
	public static final Item obsidian_hoe = null;
	
	@SubscribeEvent
	public static void RegisterItems(final RegistryEvent.Register<Item> event) {
		//materials
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("obsidian_ingot"));
		
		//blueprints
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("blueprint_obsidian_pickaxe"));
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("blueprint_obsidian_axe"));
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("blueprint_obsidian_shovel"));
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("blueprint_obsidian_hoe"));
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)).setRegistryName("blueprint_obsidian_sword"));
		
		//food
		event.getRegistry().register(new Item(new Item.Properties().group(WolfsMiscItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.0f).build())).setRegistryName("orange"));
	
		//tools
		event.getRegistry().register(new SwordItem(ModItemTier.OBSIDIANTIER, 7, 0.7f, new Item.Properties().group(WolfsToolsItemGroup.instance)).setRegistryName("obsidian_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.OBSIDIANTIER, 4, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)).setRegistryName("obsidian_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.OBSIDIANTIER, 3, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)).setRegistryName("obsidian_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.OBSIDIANTIER, 5, 0.3f, new Item.Properties().group(WolfsToolsItemGroup.instance)).setRegistryName("obsidian_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.OBSIDIANTIER, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)).setRegistryName("obsidian_hoe"));
	}
	
}

*/
