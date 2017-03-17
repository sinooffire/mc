package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemInfusedDBoots extends ItemArmor {

	public ItemInfusedDBoots(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.FEET);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDBOOTS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDBOOTS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}