package com.FlynnJacobRiley.Metropolis.blocks;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInfusedDiamond extends Block {

	public BlockInfusedDiamond() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MetropolisBlocks.INFUSEDDIAMONDBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.INFUSEDDIAMONDBLOCK.getRegistryName());
		setHardness(80.0F);
		setResistance(7000.0F);
		setLightLevel(0.75F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}