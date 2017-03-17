package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemOnyxLeggings extends ItemArmor {

	public ItemOnyxLeggings(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.LEGS);
		setUnlocalizedName(Reference.MetropolisItems.ONYXLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXLEGGINGS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}