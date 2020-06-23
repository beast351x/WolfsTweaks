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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitUpdated {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WolfsTweaks.MOD_ID);
	
	//material
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", () -> new Item(new Item.Properties().group(WolfsMiscItemGroup.instance)));
	
	//food
	public static final RegistryObject<Item> ORGANGE = ITEMS.register("orange", () -> new Item(new Item.Properties().group(WolfsMiscItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.0f).build())));

	//tools
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModItemTier.OBSIDIANTIER, 4, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)));
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModItemTier.OBSIDIANTIER, 5, 0.3f, new Item.Properties().group(WolfsToolsItemGroup.instance)));
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModItemTier.OBSIDIANTIER, 7, 0.7f, new Item.Properties().group(WolfsToolsItemGroup.instance)));
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModItemTier.OBSIDIANTIER, 3, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)));
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModItemTier.OBSIDIANTIER, 3.0f, new Item.Properties().group(WolfsToolsItemGroup.instance)));
}
