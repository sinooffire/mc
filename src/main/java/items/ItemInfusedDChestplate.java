package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemInfusedDChestplate extends ItemArmor {

	public ItemInfusedDChestplate(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDCHESTPLATE.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}