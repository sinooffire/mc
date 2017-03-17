package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemRubyShovel extends ItemSpade {

	public ItemRubyShovel(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.RUBYSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYSHOVEL.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
