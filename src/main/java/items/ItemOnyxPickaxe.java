package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemOnyxPickaxe extends ItemPickaxe {

	public ItemOnyxPickaxe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.ONYXPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXPICKAXE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
