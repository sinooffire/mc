package com.FlynnJacobRiley.Metropolis.blocks;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MetropolisBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.RUBYBLOCK.getRegistryName());
		setHardness(60.0F);
		setResistance(6000.0F);
		setLightLevel(0.75F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}