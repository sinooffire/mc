package init;

//Infused Blocks Imports
import com.FlynnJacobRiley.Metropolis.blocks.BlockRefinedObsidian;
import com.FlynnJacobRiley.Metropolis.blocks.BlockRuby;
import com.FlynnJacobRiley.Metropolis.Reference;
import com.FlynnJacobRiley.Metropolis.blocks.BlockInfusedDiamond;
import com.FlynnJacobRiley.Metropolis.blocks.BlockOnyx;
//Road Series Imports
import com.FlynnJacobRiley.Metropolis.blocks.BlockYellowEwsRoad;
import com.FlynnJacobRiley.Metropolis.blocks.BlockWhiteEwn;
import com.FlynnJacobRiley.Metropolis.blocks.BlockWhiteEwsRoad;
import com.FlynnJacobRiley.Metropolis.blocks.BlockYellowEwnRoad;
import com.FlynnJacobRiley.Metropolis.blocks.BlockYellowNswRoad;
//import com.FlynnJacobRiley.Metropolis.tileentity.TileEntityYellowEdge;
import com.FlynnJacobRiley.Metropolis.blocks.BlockWhiteNswRoad;
import com.FlynnJacobRiley.Metropolis.blocks.BlockWhiteNseRoad;
import com.FlynnJacobRiley.Metropolis.blocks.BlockYellowNseRoad;

//Minecraft Imports
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	//Infused Block Series
	public static Block refinedObsidianBlock;
	public static Block infusedDiamondBlock;
	public static Block rubyBlock;
	public static Block onyxBlock;
	
	//Road Series
	public static Block whiteEwsBlock;
	public static Block yellowEwsBlock;
	public static Block whiteEwnBlock;
	public static Block yellowEwnBlock;
	public static Block whiteNswBlock;
	public static Block yellowNswBlock;
	public static Block whiteNseBlock;
	public static Block yellowNseBlock;
	public static Block yellowEdgeBlock;
	
	public static void init() {
		//Infused Block Series
		refinedObsidianBlock = new BlockRefinedObsidian();
		infusedDiamondBlock = new BlockInfusedDiamond();
		rubyBlock = new BlockRuby();
		onyxBlock = new BlockOnyx();
		
		//Road Series
		whiteEwsBlock = new BlockWhiteEwsRoad();
		yellowEwsBlock = new BlockYellowEwsRoad();
		whiteEwnBlock = new BlockWhiteEwn();
		yellowEwnBlock = new BlockYellowEwnRoad();
		whiteNswBlock = new BlockWhiteNswRoad();
		yellowNswBlock = new BlockYellowNswRoad();
		whiteNseBlock = new BlockWhiteNseRoad();
		yellowNseBlock = new BlockYellowNseRoad();

	}
	
	public static void register() {
		//Infused Block Series
		registerBlock(refinedObsidianBlock);
		registerBlock(infusedDiamondBlock);
		registerBlock(rubyBlock);
		registerBlock(onyxBlock);
		
		//Road Series
		registerBlock(whiteEwsBlock);
		registerBlock(yellowEwsBlock);
		registerBlock(whiteEwnBlock);
		registerBlock(yellowEwnBlock);
		registerBlock(whiteNswBlock);
		registerBlock(yellowNswBlock);
		registerBlock(whiteNseBlock);
		registerBlock(yellowNseBlock);
	}

	private static void registerBlock(Block block) {
		//Infused Block Series
		GameRegistry.register(refinedObsidianBlock);
		GameRegistry.register(infusedDiamondBlock);
		GameRegistry.register(rubyBlock);
		GameRegistry.register(onyxBlock);
		
		//Road Series
		GameRegistry.register(whiteEwsBlock);
		GameRegistry.register(yellowEwsBlock);
		GameRegistry.register(whiteEwnBlock);
		GameRegistry.register(yellowEwnBlock);
		GameRegistry.register(whiteNswBlock);
		GameRegistry.register(yellowNswBlock);
		GameRegistry.register(whiteNseBlock);
		GameRegistry.register(yellowNseBlock);
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);	
	}
	
	/*
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityYellowEdge.class, Reference.MOD_ID + ":yellow_edge");;
	}
	*/
	
	public static void registerRenders() {
		//Obsidian Series
		registerRender(refinedObsidianBlock);
		registerRender(infusedDiamondBlock);
		registerRender(rubyBlock);
		registerRender(onyxBlock);
		
		//Road Series
		registerRender(whiteEwsBlock);
		registerRender(yellowEwsBlock);
		registerRender(whiteEwnBlock);
		registerRender(yellowEwnBlock);
		registerRender(whiteNswBlock);
		registerRender(yellowNswBlock);
		registerRender(whiteNseBlock);
		registerRender(yellowNseBlock);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
