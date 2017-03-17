package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.ItemFood;

public class ItemBacon extends ItemFood {

	public ItemBacon() {
		super(2, 0.5F, false);
		setUnlocalizedName(Reference.MetropolisItems.BACON.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.BACON.getRegistryName());
		setCreativeTab(Metropolis.tabMFood);
		this.setFull3D();
	}

}
