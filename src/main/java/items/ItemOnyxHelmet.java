package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemOnyxHelmet extends ItemArmor {

	public ItemOnyxHelmet(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.HEAD);
		setUnlocalizedName(Reference.MetropolisItems.ONYXHELMET.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXHELMET.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}