package com.FlynnJacobRiley.Metropolis.proxy;

import com.FlynnJacobRiley.Metropolis.Reference;

import init.ModBlocks;
import init.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
	/*
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.yellowEdge, new ResourceLocation(Reference.MOD_ID, "yellowEdge_basic"), new ResourceLocation(Reference.MOD_ID, "yellowEdge_advanced"));
	}
	*/

	@Override
	public void registerRenders() {
		
	}

}
