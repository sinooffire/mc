package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemOnyxShovel extends ItemSpade {

	public ItemOnyxShovel(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.ONYXSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXSHOVEL.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
