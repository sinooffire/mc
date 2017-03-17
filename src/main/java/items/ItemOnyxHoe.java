package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemOnyxHoe extends ItemHoe {

	public ItemOnyxHoe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.ONYXHOE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXHOE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
