package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemSword;

public class ItemObsidianSword extends ItemSword {

	public ItemObsidianSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANSWORD.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANSWORD.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMCombat);
	}
	
}
