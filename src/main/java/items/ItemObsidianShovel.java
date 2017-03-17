package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;
import net.minecraft.item.ItemSpade;

public class ItemObsidianShovel extends ItemSpade {

	public ItemObsidianShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANSHOVEL.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
	
}
