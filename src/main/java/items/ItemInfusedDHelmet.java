package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemInfusedDHelmet extends ItemArmor {

	public ItemInfusedDHelmet(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.HEAD);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDHELMET.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDHELMET.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}