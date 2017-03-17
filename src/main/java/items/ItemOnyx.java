package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;

public class ItemOnyx extends Item {
	
	public ItemOnyx() {
	setUnlocalizedName(Reference.MetropolisItems.ONYX.getUnlocalizedName());
	setRegistryName(Reference.MetropolisItems.ONYX.getRegistryName());
	setCreativeTab(Metropolis.tabMMisc);
	this.setFull3D();
	}
	
}
