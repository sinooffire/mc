package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemRefinedRubyShovel extends ItemSpade {

	public ItemRefinedRubyShovel(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYSHOVEL.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}