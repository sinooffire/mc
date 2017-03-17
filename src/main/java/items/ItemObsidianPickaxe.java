package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemObsidianPickaxe extends ItemPickaxe {

	public ItemObsidianPickaxe(ToolMaterial material) {
		super (material);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANPICKAXE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
}
