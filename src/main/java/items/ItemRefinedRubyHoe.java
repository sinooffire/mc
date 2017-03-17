package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemRefinedRubyHoe extends ItemHoe {

	public ItemRefinedRubyHoe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYHOE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYHOE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
