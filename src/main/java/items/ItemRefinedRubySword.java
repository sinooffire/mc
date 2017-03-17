package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemRefinedRubySword extends ItemSword {

	public ItemRefinedRubySword(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYSWORD.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYSWORD.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
