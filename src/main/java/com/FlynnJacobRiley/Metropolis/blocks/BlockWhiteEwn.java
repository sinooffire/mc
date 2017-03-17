//Block is being tested for direction interface.

package com.FlynnJacobRiley.Metropolis.blocks;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWhiteEwn extends Block {
	
	public BlockWhiteEwn() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.MetropolisBlocks.WHITEEWNBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MetropolisBlocks.WHITEEWNBLOCK.getRegistryName());
		setHardness(0.8F);
		setResistance(4.0F);
		setLightLevel(0.1F);
		setCreativeTab(Metropolis.tabMBlocks);
	}
}

