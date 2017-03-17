package items;


import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianBoots extends ItemArmor {

	public ItemObsidianBoots(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.FEET);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANBOOTS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANBOOTS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}