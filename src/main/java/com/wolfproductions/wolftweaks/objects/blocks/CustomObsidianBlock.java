package com.wolfproductions.wolftweaks.objects.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class CustomObsidianBlock extends Block
{
	public CustomObsidianBlock() {
		super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(50f, 1500f).harvestTool(ToolType.PICKAXE).harvestLevel(3));
		
		
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state)
	{
		return ToolType.PICKAXE;
	}

	@Override
	public int getHarvestLevel(BlockState state)
	{
		return 3;
	}
	
	@Override
	public ResourceLocation getLootTable()
	{
		return super.getLootTable();
	}
	
	   public PushReaction getPushReaction(BlockState state) {
		      return PushReaction.BLOCK;
		   }
	
}
