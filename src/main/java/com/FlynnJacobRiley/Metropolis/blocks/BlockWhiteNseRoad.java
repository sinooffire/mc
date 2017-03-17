package com.FlynnJacobRiley.Metropolis.blocks;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWhiteNseRoad extends Block {

	public BlockWhiteNseRoad() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.MetropolisBlocks.WHITENSEBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.WHITENSEBLOCK.getRegistryName());
		setHardness(0.8F);
		setResistance(4.0F);
		setLightLevel(0.1F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}