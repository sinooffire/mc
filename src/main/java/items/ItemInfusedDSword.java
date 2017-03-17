package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemSword;

public class ItemInfusedDSword extends ItemSword {

	public ItemInfusedDSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDSWORD.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDSWORD.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMCombat);
	}
	
}
