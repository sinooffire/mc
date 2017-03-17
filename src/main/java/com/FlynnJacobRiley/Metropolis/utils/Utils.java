package com.FlynnJacobRiley.Metropolis.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.commons.codec.language.bm.Lang;

import com.FlynnJacobRiley.Metropolis.Reference;
import com.sun.istack.internal.logging.Logger;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class Utils {
		
	private static java.util.logging.Logger logger;
		
	public static java.util.logging.Logger getLogger() {
		if(logger == null) {
			logger = (java.util.logging.Logger) LogManager.getFormatterLogger(Reference.MOD_ID);
		}
		
		return logger;
	}
}