package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemHoe;

public class ItemInfusedDHoe extends ItemHoe {

	public ItemInfusedDHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDHOE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDHOE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
	
}