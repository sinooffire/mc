package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemSpade;

public class ItemInfusedDShovel extends ItemSpade {

	public ItemInfusedDShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDSHOVEL.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
	
}