package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyHelmet extends ItemArmor {

	public ItemRubyHelmet(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.HEAD);
		setUnlocalizedName(Reference.MetropolisItems.RUBYHELMET.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYHELMET.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}