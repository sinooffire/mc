package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemRubySword extends ItemSword {

	public ItemRubySword(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.RUBYSWORD.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYSWORD.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMCombat);
	}
}
