package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemOnyxChestplate extends ItemArmor {

	public ItemOnyxChestplate(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.MetropolisItems.ONYXCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXCHESTPLATE.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}