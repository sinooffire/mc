package init;

import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

//Forge Imports
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//Infused Block Series
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.refinedObsidianBlock), "OOO", "OLO", "OOO", 'O', Blocks.OBSIDIAN, 'L', Items.LAVA_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.infusedDiamondBlock), "DDD", "DLD", "DDD", 'D', Blocks.DIAMOND_BLOCK, 'L', Items.LAVA_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock), "RRR", "RLR", "RRR", 'R', ModItems.ruby, 'L', Items.LAVA_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.onyxBlock), "OOO", "OLO", "OOO", 'O', ModItems.onyx, 'L', Items.LAVA_BUCKET);
		
		//Refined Obsidian Series
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe), "OOO", " S ", " S ", 'O', ModBlocks.refinedObsidianBlock, 'S', Items.STICK);
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe), "OO ", "OS ", " S ", 'O', ModBlocks.refinedObsidianBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHoe), "OO ", " S ", " S ", 'O', ModBlocks.refinedObsidianBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianShovel), " O ", " S ", " S ", 'O', ModBlocks.refinedObsidianBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), " O ", " O ", " S ", 'O', ModBlocks.refinedObsidianBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), "   ", "OOO", "O O", 'O', ModBlocks.refinedObsidianBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), "OOO", "O O", "   ", 'O', ModBlocks.refinedObsidianBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChestplate), "O O", "OOO", "OOO", 'O', ModBlocks.refinedObsidianBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianLeggings), "OOO", "O O", "O O", 'O', ModBlocks.refinedObsidianBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianBoots), "   ", "O O", "O O", 'O', ModBlocks.refinedObsidianBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianBoots), "O O", "O O", "   ", 'O', ModBlocks.refinedObsidianBlock);
		
		//Infused Diamond Series
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDPickaxe), "III", " S ", " S ", 'I', ModBlocks.infusedDiamondBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDHoe), "II ", " S ", " S ", 'I', ModBlocks.infusedDiamondBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDShovel), " I ", " S ", " S ", 'I', ModBlocks.infusedDiamondBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDSword), " I ", " I ", " S ", 'I', ModBlocks.infusedDiamondBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDHelmet), "   ", "III", "I I", 'I', ModBlocks.infusedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDHelmet), "III", "I I", "   ", 'I', ModBlocks.infusedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDChestplate), "I I", "III", "III", 'I', ModBlocks.infusedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDLeggings), "III", "I I", "I I", 'I', ModBlocks.infusedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDBoots), "   ", "I I", "I I", 'I', ModBlocks.infusedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.infusedDBoots), "I I", "I I", "   ", 'I', ModBlocks.infusedDiamondBlock);
		
		//Ruby Series
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPickaxe), "RRR", " S ", " S ", 'R', ModItems.ruby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyShovel), " R ", " S ", " S ", 'R', ModItems.ruby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHoe), "RR ", " S ", " S ", 'R', ModItems.ruby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySword), " R ", " S ", " S ", 'R', ModItems.ruby, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHelmet), "   ", "RRR", "R R", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHelmet), "RRR", "R R", "   ", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyChestplate), "R R", "RRR", "RRR", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyLeggings), "RRR", "R R", "R R", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyBoots), "   ", "R R", "R R", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyBoots), "R R", "R R", "   ", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyHelmet), "   ", "RRR", "R R", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyHelmet), "RRR", "R R", "   ", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyChestplate), "R R", "RRR", "RRR", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyLeggings), "RRR", "R R", "R R", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyBoots), "   ", "R R", "R R", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyBoots), "R R", "R R", "   ", 'R', ModBlocks.rubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyPickaxe), "RRR", " S ", " S ", 'R', ModBlocks.rubyBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyShovel), " R ", " S ", " S ", 'R', ModBlocks.rubyBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubyHoe), "RR ", " S ", " S ", 'R', ModBlocks.rubyBlock, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.refinedRubySword), " R ", " R ", " S ", 'R', ModBlocks.rubyBlock, 'S', Items.STICK);
		
		//Onyx Series
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxPickaxe), "OOO", " S ", " S ", 'O', ModItems.onyx, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxShovel), " O ", " S ", " S ", 'O', ModItems.onyx, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxHoe), "OO ", " S ", " S ", 'O', ModItems.onyx, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxSword), " O ", " O ", " S ", 'O', ModItems.onyx, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxHelmet), "   ", "OOO", "O O", 'O', ModItems.onyx);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxHelmet), "OOO", "O O", "   ", 'O', ModItems.onyx);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxChestplate), "O O", "OOO", "OOO", 'O', ModItems.onyx);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxLeggings), "OOO", "O O", "O O", 'O', ModItems.onyx);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxBoots), "   ", "O O", "O O", 'O', ModItems.onyx);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.onyxBoots), "O O", "O O", "   ", 'O', ModItems.onyx);
		
		//Food Series
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bacon, 16), Items.COOKED_PORKCHOP, Items.COOKED_PORKCHOP);
		
		//Road Series
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.yellowEwsBlock, 6), "BBB", "BBB", "YYY", 'B', new ItemStack(Blocks.WOOL, 1, 15), 'Y', new ItemStack(Blocks.WOOL, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.whiteEwsBlock, 6), "BBB", "BBB", "WWW", 'B', new ItemStack(Blocks.WOOL, 1, 15), 'W', new ItemStack(Blocks.WOOL, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.whiteEwnBlock, 6), "WWW", "BBB", "BBB", 'B', new ItemStack(Blocks.WOOL, 1, 15), 'W', new ItemStack(Blocks.WOOL, 1,0));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.yellowEwnBlock, 6), "YYY", "BBB", "BBB", 'B', new ItemStack(Blocks.WOOL, 1, 15), 'Y', new ItemStack(Blocks.WOOL, 1,4));
		
	}
}
