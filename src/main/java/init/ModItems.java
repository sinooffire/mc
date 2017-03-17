package init;

//Local Mod Imports
import com.FlynnJacobRiley.Metropolis.Reference;
import com.FlynnJacobRiley.Metropolis.utils.Utils;

//Food Item Imports
import items.ItemBacon;

//Infused Diamond Item Imports
import items.ItemInfusedDBoots;
import items.ItemInfusedDChestplate;
import items.ItemInfusedDHelmet;
import items.ItemInfusedDHoe;
import items.ItemInfusedDLeggings;
import items.ItemInfusedDPickaxe;
import items.ItemInfusedDShovel;
import items.ItemInfusedDSword;

//Obsidian Item Imports
//import items.ItemObsidianAxe;
import items.ItemObsidianBoots;
import items.ItemObsidianChestplate;
import items.ItemObsidianHelmet;
import items.ItemObsidianHoe;
import items.ItemObsidianLeggings;
import items.ItemObsidianPickaxe;
import items.ItemObsidianShovel;
import items.ItemObsidianSword;

//Onyx Item Imports
import items.ItemOnyx;
import items.ItemOnyxBoots;
import items.ItemOnyxChestplate;
import items.ItemOnyxHelmet;
import items.ItemOnyxHoe;
import items.ItemOnyxLeggings;
import items.ItemOnyxPickaxe;
import items.ItemOnyxShovel;
import items.ItemOnyxSword;

//Ruby Item Imports
import items.ItemRuby;
import items.ItemRubyBoots;
import items.ItemRubyChestplate;
import items.ItemRubyHelmet;
import items.ItemRubyHoe;
import items.ItemRubyLeggings;
import items.ItemRubyPickaxe;
import items.ItemRubyShovel;
import items.ItemRubySword;
import items.ItemRefinedRubyBoots;
import items.ItemRefinedRubyChestplate;
import items.ItemRefinedRubyHelmet;
import items.ItemRefinedRubyHoe;
import items.ItemRefinedRubyLeggings;
import items.ItemRefinedRubyPickaxe;
import items.ItemRefinedRubyShovel;
import items.ItemRefinedRubySword;

//Minecraft Imports
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	//Tool Material Declarations
	public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 5, 1971, 10.0F, 4.5F, 15);
	public static final Item.ToolMaterial infusedDiamondTMaterial = EnumHelper.addToolMaterial("infusedDiamondTMaterial", 7, 2612, 13.0F, 6.0F, 15);
	public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 7, 2612, 13.0F, 6.0F, 15);
	public static final Item.ToolMaterial refinedRubyTMaterial = EnumHelper.addToolMaterial("refinedRubyTMaterial", 9, 3000, 15.0F, 7.0F, 18);
	public static final Item.ToolMaterial onyxToolMaterial = EnumHelper.addToolMaterial("onyxToolMaterial", 7, 2612, 13.0F, 6.0F, 15);
	
	//Armor Material Declarations
	public static final ItemArmor.ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("obsidianArmorMaterial", Reference.MOD_ID + ":obsidianarmor", 1971, new int[]{5,10,8,5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
	public static final ItemArmor.ArmorMaterial infusedDiamondMaterial = EnumHelper.addArmorMaterial("infusedDiamondMaterial", Reference.MOD_ID + ":infuseddiamond", 2500, new int[]{8, 15, 12, 8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
	public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("rubyArmorMaterial", Reference.MOD_ID + ":rubyarmor", 2500, new int[]{8, 15, 12, 8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
	public static final ItemArmor.ArmorMaterial refinedRubyMaterial = EnumHelper.addArmorMaterial("refinedRubyMaterial", Reference.MOD_ID + ":refinedruby", 3021, new int[]{10, 18, 15, 10}, 23, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7F);
	public static final ItemArmor.ArmorMaterial onyxArmorMaterial = EnumHelper.addArmorMaterial("onyxArmorMaterial", Reference.MOD_ID + ":onyxarmor", 2500, new int[]{8, 15, 12, 8}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
	
	//Obsidian Series
	public static Item obsidianPickaxe;
	//public static Item obsidianAxe;
	public static Item obsidianShovel;
	public static Item obsidianHoe;
	public static Item obsidianSword;
	public static Item obsidianHelmet;
	public static Item obsidianChestplate;
	public static Item obsidianLeggings;
	public static Item obsidianBoots;
	
	//Infused Diamond Series
	public static Item infusedDPickaxe;
	public static Item infusedDShovel;
	public static Item infusedDHoe;
	public static Item infusedDSword;
	public static Item infusedDHelmet;
	public static Item infusedDChestplate;
	public static Item infusedDLeggings;
	public static Item infusedDBoots;
	
	//Ruby Series
	public static Item ruby;
	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;
	public static Item rubySword;
	public static Item rubyPickaxe;
	public static Item rubyShovel;
	public static Item rubyHoe;
	public static Item refinedRubyHelmet;
	public static Item refinedRubyChestplate;
	public static Item refinedRubyLeggings;
	public static Item refinedRubyBoots;
	public static Item refinedRubyPickaxe;
	public static Item refinedRubyShovel;
	public static Item refinedRubyHoe;
	public static Item refinedRubySword;
	
	//Onyx Series
	public static Item onyx;
	public static Item onyxHelmet;
	public static Item onyxChestplate;
	public static Item onyxLeggings;
	public static Item onyxBoots;
	public static Item onyxPickaxe;
	public static Item onyxShovel;
	public static Item onyxHoe;
	public static Item onyxSword;
	
	//Food Series
	public static Item bacon;
	
	//Road Block Facing Items
	public static Item yellowEdge;
	
	public static void init() {
		//Obsidian Series
		obsidianPickaxe = new ItemObsidianPickaxe(obsidianToolMaterial);
		//obsidianAxe = new ItemObsidianAxe(obsidianToolMaterial);
		obsidianShovel = new ItemObsidianShovel(obsidianToolMaterial);
		obsidianHoe = new ItemObsidianHoe(obsidianToolMaterial);
		obsidianSword = new ItemObsidianSword(obsidianToolMaterial);
		obsidianHelmet = new ItemObsidianHelmet(obsidianArmorMaterial, 0);
		obsidianChestplate = new ItemObsidianChestplate(obsidianArmorMaterial, 0);
		obsidianLeggings = new ItemObsidianLeggings(obsidianArmorMaterial, 0);
		obsidianBoots = new ItemObsidianBoots(obsidianArmorMaterial, 0);
		
		//Infused Diamond Series
		infusedDPickaxe = new ItemInfusedDPickaxe(infusedDiamondTMaterial);
		infusedDShovel = new ItemInfusedDShovel(infusedDiamondTMaterial);
		infusedDHoe = new ItemInfusedDHoe(infusedDiamondTMaterial);
		infusedDSword = new ItemInfusedDSword(infusedDiamondTMaterial);
		infusedDHelmet = new ItemInfusedDHelmet(infusedDiamondMaterial, 0);
		infusedDChestplate = new ItemInfusedDChestplate(infusedDiamondMaterial, 0);
		infusedDLeggings = new ItemInfusedDLeggings(infusedDiamondMaterial, 0);
		infusedDBoots = new ItemInfusedDBoots(infusedDiamondMaterial, 0);
		
		//Ruby Series
		ruby = new ItemRuby();
		rubyPickaxe = new ItemRubyPickaxe(rubyToolMaterial);
		rubyShovel = new ItemRubyShovel(rubyToolMaterial);
		rubyHoe = new ItemRubyHoe(rubyToolMaterial);
		rubySword = new ItemRubySword(rubyToolMaterial);
		rubyHelmet = new ItemRubyHelmet(rubyArmorMaterial, 0);
		rubyChestplate = new ItemRubyChestplate(rubyArmorMaterial, 0);
		rubyLeggings = new ItemRubyLeggings(rubyArmorMaterial, 0);
		rubyBoots = new ItemRubyBoots(rubyArmorMaterial, 0);
		refinedRubyHelmet = new ItemRefinedRubyHelmet(refinedRubyMaterial, 0);
		refinedRubyChestplate = new ItemRefinedRubyChestplate(refinedRubyMaterial, 0);
		refinedRubyLeggings = new ItemRefinedRubyLeggings(refinedRubyMaterial, 0);
		refinedRubyBoots = new ItemRefinedRubyBoots(refinedRubyMaterial, 0);
		refinedRubyPickaxe = new ItemRefinedRubyPickaxe(refinedRubyTMaterial);
		refinedRubyShovel = new ItemRefinedRubyShovel(refinedRubyTMaterial);
		refinedRubyHoe = new ItemRefinedRubyHoe(refinedRubyTMaterial);
		refinedRubySword = new ItemRefinedRubySword(refinedRubyTMaterial);
		
		//Onyx Series
		onyx = new ItemOnyx();
		onyxPickaxe = new ItemOnyxPickaxe(onyxToolMaterial);
		onyxShovel = new ItemOnyxShovel(onyxToolMaterial);
		onyxHoe = new ItemOnyxHoe(onyxToolMaterial);
		onyxSword = new ItemOnyxSword(onyxToolMaterial);
		onyxHelmet = new ItemOnyxHelmet(onyxArmorMaterial, 0);
		onyxChestplate = new ItemOnyxChestplate(onyxArmorMaterial, 0);
		onyxLeggings = new ItemOnyxLeggings(onyxArmorMaterial, 0);
		onyxBoots = new ItemOnyxBoots(onyxArmorMaterial, 0);
		
		//Food Series
		bacon = new ItemBacon();
	}
	
	public static void register() {
		//Obsidian Series
		GameRegistry.register(obsidianPickaxe);
		//GameRegistry.register(obsidianAxe);
		GameRegistry.register(obsidianShovel);
		GameRegistry.register(obsidianHoe);
		GameRegistry.register(obsidianSword);
		GameRegistry.register(obsidianHelmet);
		GameRegistry.register(obsidianChestplate);
		GameRegistry.register(obsidianLeggings);
		GameRegistry.register(obsidianBoots);
		
		//Infused Diamond Series
		GameRegistry.register(infusedDPickaxe);
		GameRegistry.register(infusedDHoe);
		GameRegistry.register(infusedDShovel);
		GameRegistry.register(infusedDSword);
		GameRegistry.register(infusedDHelmet);
		GameRegistry.register(infusedDChestplate);
		GameRegistry.register(infusedDLeggings);
		GameRegistry.register(infusedDBoots);
		
		//Ruby Series
		GameRegistry.register(ruby);
		GameRegistry.register(rubyPickaxe);
		GameRegistry.register(rubyShovel);
		GameRegistry.register(rubyHoe);
		GameRegistry.register(rubySword);
		GameRegistry.register(rubyHelmet);
		GameRegistry.register(rubyChestplate);
		GameRegistry.register(rubyLeggings);
		GameRegistry.register(rubyBoots);
		GameRegistry.register(refinedRubyHelmet);
		GameRegistry.register(refinedRubyChestplate);
		GameRegistry.register(refinedRubyLeggings);
		GameRegistry.register(refinedRubyBoots);
		GameRegistry.register(refinedRubyPickaxe);
		GameRegistry.register(refinedRubyShovel);
		GameRegistry.register(refinedRubyHoe);
		GameRegistry.register(refinedRubySword);
		
		//Onyx Series
		GameRegistry.register(onyx);
		GameRegistry.register(onyxPickaxe);
		GameRegistry.register(onyxShovel);
		GameRegistry.register(onyxHoe);
		GameRegistry.register(onyxSword);
		GameRegistry.register(onyxHelmet);
		GameRegistry.register(onyxChestplate);
		GameRegistry.register(onyxLeggings);
		GameRegistry.register(onyxBoots);
		
		//Food Series
		GameRegistry.register(bacon);
	}
	
	public static void registerRenders() {
		//Obsidian Series
		registerRender(obsidianPickaxe);
		//registerRender(obsidianAxe);
		registerRender(obsidianShovel);
		registerRender(obsidianHoe);
		registerRender(obsidianSword);
		registerRender(obsidianHelmet);
		registerRender(obsidianChestplate);
		registerRender(obsidianLeggings);
		registerRender(obsidianBoots);
		
		//Infused Diamond Series
		registerRender(infusedDPickaxe);
		registerRender(infusedDHoe);
		registerRender(infusedDShovel);
		registerRender(infusedDSword);
		registerRender(infusedDHelmet);
		registerRender(infusedDChestplate);
		registerRender(infusedDLeggings);
		registerRender(infusedDBoots);
		
		//Ruby Series
		registerRender(ruby);
		registerRender(rubyPickaxe);
		registerRender(rubyShovel);
		registerRender(rubyHoe);
		registerRender(rubySword);
		registerRender(rubyHelmet);
		registerRender(rubyChestplate);
		registerRender(rubyLeggings);
		registerRender(rubyBoots);
		registerRender(refinedRubyHelmet);
		registerRender(refinedRubyChestplate);
		registerRender(refinedRubyLeggings);
		registerRender(refinedRubyBoots);
		registerRender(refinedRubyPickaxe);
		registerRender(refinedRubyShovel);
		registerRender(refinedRubyHoe);
		registerRender(refinedRubySword);
		
		//Onyx Series
		registerRender(onyx);
		registerRender(onyxPickaxe);
		registerRender(onyxShovel);
		registerRender(onyxHoe);
		registerRender(onyxSword);
		registerRender(onyxHelmet);
		registerRender(onyxChestplate);
		registerRender(onyxLeggings);
		registerRender(onyxBoots);
		
		//Food Series
		registerRender(bacon);
		
		
		/*
		*for(int i = 0; i < EnumHandler.YellowEdge.values().length; i++) {
		*	registerRender(yellowEdge, i, "yellowEdge_" + EnumHandler.YellowEdge.values()[i].getName());
		}
		*/
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}
}
