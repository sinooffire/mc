package com.FlynnJacobRiley.Metropolis;

//Mod Imports
import com.FlynnJacobRiley.Metropolis.proxy.CommonProxy;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;

//Minecraft Imports
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

//Forge Imports
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Metropolis {

	@Instance
	public static Metropolis instance;
	
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide= Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	//Tool Handler
	
	//Initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		proxy.registerRenders();
		//proxy.registerTileEntities();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		//proxy.registerModelBakeryVariants();
		ModCrafting.register();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabMBlocks = new CreativeTabs("tab_mblocks")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.refinedObsidianBlock);
		}
	};
	
	public static CreativeTabs tabMCombat = new CreativeTabs("tab_mcombat")
	{	
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.infusedDSword);
		}
	};
	
	public static CreativeTabs tabMTools = new CreativeTabs("tab_mtools")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.obsidianPickaxe);
		}
	};
	
	public static CreativeTabs tabMFood = new CreativeTabs("tab_mfood")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.bacon);
		}
	};
	
	public static CreativeTabs tabMMisc = new CreativeTabs("tab_mmisc")
	{
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.ruby);
		}
	};
}

