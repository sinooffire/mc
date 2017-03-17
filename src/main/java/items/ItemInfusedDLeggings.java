package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemInfusedDLeggings extends ItemArmor {

	public ItemInfusedDLeggings(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.LEGS);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDLEGGINGS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}