package com.FlynnJacobRiley.Metropolis;

public class Reference {

	//ModId
	public static final String MOD_ID = "fjrmm";
	public static final String NAME = "Metropolis Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	//Proxies
	public static final String CLIENT_PROXY_CLASS = "com.FlynnJacobRiley.Metropolis.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.FlynnJacobRiley.Metropolis.proxy.ServerProxy";
	
	//Items
	public static enum MetropolisItems {
		//Obsidian Series
		OBSIDIANPICKAXE("obsidianPickaxe", "ItemObsidianPickaxe"),
		//OBSIDIANAXE("obsidianAxe", "ItemObsidianAxe"),
		OBSIDIANSHOVEL("obsidianShovel", "ItemObsidianShovel"),
		OBSIDIANHOE("obsidianHoe", "ItemObsidianHoe"),
		OBSIDIANSWORD("obsidianSword", "ItemObsidianSword"),
		OBSIDIANHELMET("obsidianHelmet", "ItemObsidianHelmet"),
		OBSIDIANCHESTPLATE("obsidianChestplate", "ItemObsidianChestplate"),
		OBSIDIANLEGGINGS("obsidianLeggings", "ItemObsidianLeggings"),
		OBSIDIANBOOTS("obsidianBoots", "ItemObsidianBoots"),
		
		//Infused Diamond Series
		INFUSEDDPICKAXE("infusedDPickaxe", "ItemInfusedDPickaxe"),
		INFUSEDDHOE("infusedDHoe", "ItemInfusedDHoe"),
		INFUSEDDSHOVEL("infusedDShovel", "ItemInfusedDShovel"),
		INFUSEDDSWORD("infusedDSword", "ItemInfusedDSword"),
		INFUSEDDHELMET("infusedDHelmet", "ItemInfusedDHelmet"),
		INFUSEDDCHESTPLATE("infusedDChestplate", "ItemInfusedDChestplate"),
		INFUSEDDLEGGINGS("infusedDLeggings", "ItemInfusedDLeggings"),
		INFUSEDDBOOTS("infusedDBoots", "ItemInfusedDBoots"),
		
		//Ruby Series
		RUBY("ruby", "ItemRuby"),
		RUBYPICKAXE("rubyPickaxe", "ItemRubyPickaxe"),
		RUBYSHOVEL("rubyShovel", "ItemRubyShovel"),
		RUBYHOE("rubyHoe", "ItemRubyHoe"),
		RUBYSWORD("rubySword", "ItemRubySword"),
		RUBYHELMET("rubyHelmet", "ItemRubyHelmet"),
		RUBYCHESTPLATE("rubyChestplate", "ItemRubyChestplate"),
		RUBYLEGGINGS("rubyLeggings", "ItemRubyLeggings"),
		RUBYBOOTS("rubyBoots", "ItemRubyBoots"),
		REFINEDRUBYHELMET("refinedRubyHelmet", "ItemRefinedRubyHelmet"),
		REFINEDRUBYCHESTPLATE("refinedRubyChestplate", "ItemRefinedRubyChestplate"),
		REFINEDRUBYLEGGINGS("refinedRubyLeggings", "ItemRefinedRubyLeggings"),
		REFINEDRUBYBOOTS("refinedRubyBoots", "ItemRefinedRubyBoots"),
		REFINEDRUBYPICKAXE("refinedRubyPickaxe", "ItemRefinedRubyPickaxe"),
		REFINEDRUBYSHOVEL("refinedRubyShovel", "ItemRefinedRubyShovel"),
		REFINEDRUBYHOE("refinedRubyHoe", "ItemRefinedRubyHoe"),
		REFINEDRUBYSWORD("refinedRubySword", "ItemRefinedRubySword"),
		
		//Onyx Series
		ONYX("onyx", "ItemOnyx"),
		ONYXPICKAXE("onyxPickaxe", "ItemOnyxPickaxe"),
		ONYXSHOVEL("onyxShovel", "ItemOnyxShovel"),
		ONYXHOE("onyxHoe", "ItemOnyxHoe"),
		ONYXSWORD("onyxSword", "ItemOnyxSword"),
		ONYXHELMET("onyxHelmet", "ItemOnyxHelmet"),
		ONYXCHESTPLATE("onyxChestplate", "ItemOnyxChestplate"),
		ONYXLEGGINGS("onyxLeggings", "ItemOnyxLeggings"),
		ONYXBOOTS("onyxBoots", "ItemOnyxBoots"),
		
		//Food Series
		BACON("bacon", "ItemBacon");
		
		private String unlocalizedName;
		private String registryName;
		
		MetropolisItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum MetropolisBlocks {
		//Infused Block Series
		REFINEDOBSIDIANBLOCK("refinedobsidianblock", "BlockRefinedObsidian"),
		INFUSEDDIAMONDBLOCK("infuseddiamondblock", "BlockInfusedDiamond"),
		RUBYBLOCK("rubyblock", "BlockRuby"),
		ONYXBLOCK("onyxblock", "BlockOnyx"),

		//Road Series
		WHITEEWNBLOCK("whiteewnblock", "BlockWhiteEwn"),
		YELLOWEWNBLOCK("yellowewnblock", "BlockYellowEwnRoad"),
		WHITEEWSBLOCK("whiteewsblock", "BlockWhiteEwsRoad"),
		YELLOWEWSBLOCK("yellowewsblock", "BlockYellowEwsRoad"),
		WHITENSWBLOCK("whitenswblock", "BlockWhiteNswRoad"),
		YELLOWNSWBLOCK("yellownswblock", "BLockYellowNswRoad"),
		WHITENSEBLOCK("whitenseblock", "BlockWhiteNseRoad"),
		YELLOWNSEBLOCK("yellownseblock", "BlockYellowNseRoad"),
		YELLOWEDGEBLOCK("yellowedgeblock", "BlockYellowEdge");
		
		private String unlocalizedName;
		private String registryName;
		
		MetropolisBlocks(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
