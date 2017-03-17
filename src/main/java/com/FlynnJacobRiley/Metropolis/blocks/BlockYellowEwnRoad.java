package com.FlynnJacobRiley.Metropolis.blocks;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockYellowEwnRoad extends Block {

	public BlockYellowEwnRoad() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.MetropolisBlocks.YELLOWEWNBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.YELLOWEWNBLOCK.getRegistryName());
		setHardness(0.8F);
		setResistance(4.0F);
		setLightLevel(0.1F);
		setCreativeTab(Metropolis.tabMBlocks);
	}

}
