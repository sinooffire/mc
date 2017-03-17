package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemOnyxBoots extends ItemArmor {

	public ItemOnyxBoots(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.FEET);
		setUnlocalizedName(Reference.MetropolisItems.ONYXBOOTS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.ONYXBOOTS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}