package items;

import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyChestplate extends ItemArmor {

	public ItemRubyChestplate(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.MetropolisItems.RUBYCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.RUBYCHESTPLATE.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}