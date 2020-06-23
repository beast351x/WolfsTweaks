package com.wolfproductions.wolftweaks.init;

import com.wolfproductions.wolftweaks.WolfsTweaks;
import com.wolfproductions.wolftweaks.objects.blocks.CustomObsidianBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInitUpdated {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>
	(ForgeRegistries.BLOCKS, WolfsTweaks.MOD_ID);
	
	public static final RegistryObject<Block> SMOOTH_OBSIDIAN = BLOCKS.register("smooth_obsidian", () -> new CustomObsidianBlock());
	public static final RegistryObject<Block> OBSIDIAN_BRICK = BLOCKS.register("obsidian_brick", () -> new CustomObsidianBlock());
	public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICK = BLOCKS.register("cracked_obsidian_brick", () -> new CustomObsidianBlock());
	public static final RegistryObject<Block> CHISELED_OBSIDIAN_BRICK = BLOCKS.register("chiseled_obsidian_brick", () -> new CustomObsidianBlock());
	
	
}
