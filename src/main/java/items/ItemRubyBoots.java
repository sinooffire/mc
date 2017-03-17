package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyBoots extends ItemArmor {

	public ItemRubyBoots(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.FEET);
		setUnlocalizedName(Reference.MetropolisItems.RUBYBOOTS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYBOOTS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}