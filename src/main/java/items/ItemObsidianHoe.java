package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemHoe;

public class ItemObsidianHoe extends ItemHoe {

	public ItemObsidianHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANHOE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANHOE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
	
}
