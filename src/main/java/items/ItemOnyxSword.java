package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemOnyxSword extends ItemSword {

	public ItemOnyxSword(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.ONYXSWORD.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXSWORD.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMCombat);
	}
}
