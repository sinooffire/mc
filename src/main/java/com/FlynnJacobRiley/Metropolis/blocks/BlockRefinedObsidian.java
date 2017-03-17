package com.FlynnJacobRiley.Metropolis.blocks;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRefinedObsidian extends Block {

	public BlockRefinedObsidian() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MetropolisBlocks.REFINEDOBSIDIANBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.REFINEDOBSIDIANBLOCK.getRegistryName());
		setHardness(60.0F);
		setResistance(6000.0F);
		setLightLevel(0.75F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}
