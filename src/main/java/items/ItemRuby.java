package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;

public class ItemRuby extends Item {

	public ItemRuby() {
		setUnlocalizedName(Reference.MetropolisItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBY.getRegistryName());
		setCreativeTab(Metropolis.tabMMisc);
		this.setFull3D();
	}
}
