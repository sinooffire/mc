package com.FlynnJacobRiley.Metropolis.blocks;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWhiteNswRoad extends Block {

	public BlockWhiteNswRoad() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.MetropolisBlocks.WHITENSWBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.WHITENSWBLOCK.getRegistryName());
		setHardness(0.8F);
		setResistance(4.0F);
		setLightLevel(0.1F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}