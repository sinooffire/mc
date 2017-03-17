package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRubyPickaxe extends ItemPickaxe {

	public ItemRubyPickaxe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.RUBYPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYPICKAXE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
