package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyLeggings extends ItemArmor {

	public ItemRubyLeggings(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.LEGS);
		setUnlocalizedName(Reference.MetropolisItems.RUBYLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYLEGGINGS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}