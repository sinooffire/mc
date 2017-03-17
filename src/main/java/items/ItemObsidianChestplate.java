package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianChestplate extends ItemArmor {

	public ItemObsidianChestplate(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANCHESTPLATE.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}