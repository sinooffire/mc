package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemRubyHoe extends ItemHoe {

	public ItemRubyHoe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.RUBYHOE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYHOE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
