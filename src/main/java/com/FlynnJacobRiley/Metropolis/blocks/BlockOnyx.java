package com.FlynnJacobRiley.Metropolis.blocks;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOnyx extends Block {

	public BlockOnyx() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MetropolisBlocks.ONYXBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.ONYXBLOCK.getRegistryName());
		setHardness(70.0F);
		setResistance(8000.0F);
		setLightLevel(0.75F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}