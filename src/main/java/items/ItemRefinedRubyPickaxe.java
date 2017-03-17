package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRefinedRubyPickaxe extends ItemPickaxe {

	public ItemRefinedRubyPickaxe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYPICKAXE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
